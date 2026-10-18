package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f15001b = new c();
    public final u f15002a;

    public d(u uVar) {
        this.f15002a = uVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        Date date = (Date) this.f15002a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        this.f15002a.write(bVar, (Timestamp) obj);
    }
}
