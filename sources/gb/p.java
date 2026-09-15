package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f9575a;
    public final Object f9576b;

    public p(Object obj, int i10) {
        this.f9575a = i10;
        this.f9576b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9575a) {
            case 0:
                if (aVar.f13575a == Number.class) {
                    return (q) this.f9576b;
                }
                return null;
            case 1:
                if (aVar.f13575a == Object.class) {
                    return new r(gVar, (db.t) this.f9576b);
                }
                return null;
            default:
                Class cls = aVar.f13575a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f9576b;
        }
    }

    public String toString() {
        switch (this.f9575a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f9576b) + "]";
            default:
                return super.toString();
        }
    }
}
