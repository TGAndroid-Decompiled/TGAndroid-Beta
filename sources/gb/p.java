package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f9567a;
    public final Object f9568b;

    public p(Object obj, int i10) {
        this.f9567a = i10;
        this.f9568b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f9567a) {
            case 0:
                if (aVar.f13565a == Number.class) {
                    return (q) this.f9568b;
                }
                return null;
            case 1:
                if (aVar.f13565a == Object.class) {
                    return new r(gVar, (db.t) this.f9568b);
                }
                return null;
            default:
                Class cls = aVar.f13565a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f9568b;
        }
    }

    public String toString() {
        switch (this.f9567a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f9568b) + "]";
            default:
                return super.toString();
        }
    }
}
