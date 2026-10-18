package kb;

import eb.g;
import eb.u;
import eb.v;
import java.sql.Timestamp;
import java.util.Date;
public class c implements v {
    @Override
    public final u create(g gVar, lb.a aVar) {
        if (aVar.f15995a == Timestamp.class) {
            gVar.getClass();
            return new d(gVar.b(new lb.a(Date.class)));
        }
        return null;
    }
}
