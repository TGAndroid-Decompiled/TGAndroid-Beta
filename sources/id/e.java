package id;

import java.util.Iterator;
import k7.g8;
import ld.q1;
public final class e implements b {
    public final int f7464a;
    public final Object f7465b;

    public e(Object obj, int i10) {
        this.f7464a = i10;
        this.f7465b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7464a) {
            case 0:
                ?? obj = new Object();
                obj.f7463c = g8.a((q1) this.f7465b, obj, obj);
                return obj;
            case 1:
                return (Iterator) this.f7465b;
            default:
                return new jd.b((String) this.f7465b);
        }
    }
}
