package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f11838b = new c();
    public final u f11839a;

    public d(u uVar) {
        this.f11839a = uVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        Date date = (Date) this.f11839a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        this.f11839a.write(bVar, (Timestamp) obj);
    }
}
