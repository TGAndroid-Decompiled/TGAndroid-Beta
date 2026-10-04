package jb;

import db.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f14063b = new c();
    public final u f14064a;

    public d(u uVar) {
        this.f14064a = uVar;
    }

    @Override
    public final Object read(lb.a aVar) {
        Date date = (Date) this.f14064a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        this.f14064a.write(bVar, (Timestamp) obj);
    }
}
