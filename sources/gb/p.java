package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f8707a;
    public final Object f8708b;

    public p(Object obj, int i10) {
        this.f8707a = i10;
        this.f8708b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f8707a) {
            case 0:
                if (aVar.f12419a == Number.class) {
                    return (q) this.f8708b;
                }
                return null;
            case 1:
                if (aVar.f12419a == Object.class) {
                    return new r(gVar, (db.t) this.f8708b);
                }
                return null;
            default:
                Class cls = aVar.f12419a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f8708b;
        }
    }

    public String toString() {
        switch (this.f8707a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f8708b) + "]";
            default:
                return super.toString();
        }
    }
}
