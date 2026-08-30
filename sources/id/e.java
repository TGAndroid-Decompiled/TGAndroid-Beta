package id;

import java.util.Iterator;
import k7.g8;
import ld.q1;
public final class e implements b {
    public final int f7482a;
    public final Object f7483b;

    public e(Object obj, int i10) {
        this.f7482a = i10;
        this.f7483b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7482a) {
            case 0:
                ?? obj = new Object();
                obj.f7481c = g8.a((q1) this.f7483b, obj, obj);
                return obj;
            case 1:
                return (Iterator) this.f7483b;
            default:
                return new jd.b((String) this.f7483b);
        }
    }
}
