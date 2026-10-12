package hb;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements eb.v {
    public final int f10442a;
    public final Object f10443b;

    public p(Object obj, int i10) {
        this.f10442a = i10;
        this.f10443b = obj;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        switch (this.f10442a) {
            case 0:
                if (aVar.f14653a == Number.class) {
                    return (q) this.f10443b;
                }
                return null;
            case 1:
                if (aVar.f14653a == Object.class) {
                    return new r(gVar, (eb.t) this.f10443b);
                }
                return null;
            default:
                Class cls = aVar.f14653a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f10443b;
        }
    }

    public String toString() {
        switch (this.f10442a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f10443b) + "]";
            default:
                return super.toString();
        }
    }
}
