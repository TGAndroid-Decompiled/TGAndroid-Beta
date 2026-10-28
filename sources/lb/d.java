package lb;

import fb.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f16960b = new c();
    public final u f16961a;

    public d(u uVar) {
        this.f16961a = uVar;
    }

    @Override
    public final Object read(nb.a aVar) {
        Date date = (Date) this.f16961a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        this.f16961a.write(bVar, (Timestamp) obj);
    }
}
