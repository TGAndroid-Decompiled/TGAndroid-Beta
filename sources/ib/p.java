package ib;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements fb.v {
    public final int f13951a;
    public final Object f13952b;

    public p(Object obj, int i10) {
        this.f13951a = i10;
        this.f13952b = obj;
    }

    @Override
    public final fb.u create(fb.g gVar, mb.a aVar) {
        switch (this.f13951a) {
            case 0:
                if (aVar.f18407a == Number.class) {
                    return (q) this.f13952b;
                }
                return null;
            case 1:
                if (aVar.f18407a == Object.class) {
                    return new r(gVar, (fb.t) this.f13952b);
                }
                return null;
            default:
                Class cls = aVar.f18407a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f13952b;
        }
    }

    public String toString() {
        switch (this.f13951a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f13952b) + "]";
            default:
                return super.toString();
        }
    }
}
