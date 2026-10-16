package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f14201b = new c();
    public final u f14202a;

    public d(u uVar) {
        this.f14202a = uVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        Date date = (Date) this.f14202a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        this.f14202a.write(bVar, (Timestamp) obj);
    }
}
