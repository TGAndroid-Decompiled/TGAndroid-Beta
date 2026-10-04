package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f10410a;
    public final Object f10411b;

    public p(Object obj, int i10) {
        this.f10410a = i10;
        this.f10411b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10410a) {
            case 0:
                if (aVar.f14747a == Number.class) {
                    return (q) this.f10411b;
                }
                return null;
            case 1:
                if (aVar.f14747a == Object.class) {
                    return new r(gVar, (db.t) this.f10411b);
                }
                return null;
            default:
                Class cls = aVar.f14747a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f10411b;
        }
    }

    public String toString() {
        switch (this.f10410a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f10411b) + "]";
            default:
                return super.toString();
        }
    }
}
