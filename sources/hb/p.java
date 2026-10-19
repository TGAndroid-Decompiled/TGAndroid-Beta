package hb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements eb.v {
    public final int f11750a;
    public final Object f11751b;

    public p(Object obj, int i10) {
        this.f11750a = i10;
        this.f11751b = obj;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f11750a) {
            case 0:
                if (aVar.f15994a == Number.class) {
                    return (q) this.f11751b;
                }
                return null;
            case 1:
                if (aVar.f15994a == Object.class) {
                    return new r(gVar, (eb.t) this.f11751b);
                }
                return null;
            default:
                Class cls = aVar.f15994a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f11751b;
        }
    }

    public String toString() {
        switch (this.f11750a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f11751b) + "]";
            default:
                return super.toString();
        }
    }
}
