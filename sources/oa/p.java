package oa;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements la.v {
    public final int f19154a;
    public final Object f19155b;

    public p(Object obj, int i9) {
        this.f19154a = i9;
        this.f19155b = obj;
    }

    @Override
    public final la.u create(la.g gVar, sa.a aVar) {
        switch (this.f19154a) {
            case 0:
                if (aVar.f47502a == Number.class) {
                    return (q) this.f19155b;
                }
                return null;
            case 1:
                if (aVar.f47502a == Object.class) {
                    return new r(gVar, (la.t) this.f19155b);
                }
                return null;
            default:
                Class cls = aVar.f47502a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f19155b;
        }
    }

    public String toString() {
        switch (this.f19154a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f19155b) + "]";
            default:
                return super.toString();
        }
    }
}
