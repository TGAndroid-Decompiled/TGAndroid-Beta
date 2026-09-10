package jb;

import db.g;
import db.u;
import db.v;
import java.sql.Timestamp;
import java.util.Date;
public class c implements v {
    @Override
    public final u create(g gVar, kb.a aVar) {
        if (aVar.f12419a == Timestamp.class) {
            gVar.getClass();
            return new d(gVar.b(new kb.a(Date.class)));
        }
        return null;
    }
}
