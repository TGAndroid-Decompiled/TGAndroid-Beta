package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f14199b = new c();
    public final u f14200a;

    public d(u uVar) {
        this.f14200a = uVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        Date date = (Date) this.f14200a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        this.f14200a.write(bVar, (Timestamp) obj);
    }
}
