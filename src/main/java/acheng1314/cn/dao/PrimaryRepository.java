package acheng1314.cn.dao;

import acheng1314.cn.domain.PrimaryMongoObject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {

}
