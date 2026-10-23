package hb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements eb.v {
    public final int f11777a;
    public final Object f11778b;

    public p(Object obj, int i10) {
        this.f11777a = i10;
        this.f11778b = obj;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11777a) {
            case 0:
                if (aVar.f16057a == Number.class) {
                    return (q) this.f11778b;
                }
                return null;
            case 1:
                if (aVar.f16057a == Object.class) {
                    return new r(gVar, (eb.t) this.f11778b);
                }
                return null;
            default:
                Class cls = aVar.f16057a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f11778b;
        }
    }

    public String toString() {
        switch (this.f11777a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f11778b) + "]";
            default:
                return super.toString();
        }
    }
}
