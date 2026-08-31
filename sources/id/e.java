package id;

import java.util.Iterator;
import k7.h8;
import ld.q1;
public final class e implements b {
    public final int f8054a;
    public final Object f8055b;

    public e(Object obj, int i10) {
        this.f8054a = i10;
        this.f8055b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f8054a) {
            case 0:
                ?? obj = new Object();
                obj.f8053c = h8.a((q1) this.f8055b, obj, obj);
                return obj;
            case 1:
                return (Iterator) this.f8055b;
            default:
                return new jd.b((String) this.f8055b);
        }
    }
}
