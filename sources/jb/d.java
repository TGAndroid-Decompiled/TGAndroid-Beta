package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f12936b = new c();
    public final u f12937a;

    public d(u uVar) {
        this.f12937a = uVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        Date date = (Date) this.f12937a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        this.f12937a.write(bVar, (Timestamp) obj);
    }
}
