package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f9561a;
    public final Object f9562b;

    public p(Object obj, int i10) {
        this.f9561a = i10;
        this.f9562b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9561a) {
            case 0:
                if (aVar.f13563a == Number.class) {
                    return (q) this.f9562b;
                }
                return null;
            case 1:
                if (aVar.f13563a == Object.class) {
                    return new r(gVar, (db.t) this.f9562b);
                }
                return null;
            default:
                Class cls = aVar.f13563a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f9562b;
        }
    }

    public String toString() {
        switch (this.f9561a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f9562b) + "]";
            default:
                return super.toString();
        }
    }
}
