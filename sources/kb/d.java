package kb;

import eb.u;
import java.sql.Timestamp;
import java.util.Date;
public final class d extends u {
    public static final c f15048b = new c();
    public final u f15049a;

    public d(u uVar) {
        this.f15049a = uVar;
    }

    @Override
    public final Object read(mb.a aVar) {
        Date date = (Date) this.f15049a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        this.f15049a.write(bVar, (Timestamp) obj);
    }
}
