package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f14097b = new c();
    public final u f14098a;

    public d(u uVar) {
        this.f14098a = uVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        Date date = (Date) this.f14098a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        this.f14098a.write(bVar, (Timestamp) obj);
    }
}
