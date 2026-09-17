package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f10573a;
    public final Object f10574b;

    public p(Object obj, int i10) {
        this.f10573a = i10;
        this.f10574b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10573a) {
            case 0:
                if (aVar.f14914a == Number.class) {
                    return (q) this.f10574b;
                }
                return null;
            case 1:
                if (aVar.f14914a == Object.class) {
                    return new r(gVar, (db.t) this.f10574b);
                }
                return null;
            default:
                Class cls = aVar.f14914a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f10574b;
        }
    }

    public String toString() {
        switch (this.f10573a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f10574b) + "]";
            default:
                return super.toString();
        }
    }
}
