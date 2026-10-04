package gb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements db.v {
    public final int f10409a;
    public final Object f10410b;

    public p(Object obj, int i10) {
        this.f10409a = i10;
        this.f10410b = obj;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        switch (this.f10409a) {
            case 0:
                if (aVar.f14746a == Number.class) {
                    return (q) this.f10410b;
                }
                return null;
            case 1:
                if (aVar.f14746a == Object.class) {
                    return new r(gVar, (db.t) this.f10410b);
                }
                return null;
            default:
                Class cls = aVar.f14746a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f10410b;
        }
    }

    public String toString() {
        switch (this.f10409a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f10410b) + "]";
            default:
                return super.toString();
        }
    }
}
