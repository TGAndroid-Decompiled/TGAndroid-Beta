package gd;

import i7.v7;
import java.util.Iterator;
import jd.q1;
public final class e implements b {
    public final int f7268a;
    public final Object f7269b;

    public e(Object obj, int i10) {
        this.f7268a = i10;
        this.f7269b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7268a) {
            case 0:
                ?? obj = new Object();
                obj.f7267c = v7.a((q1) this.f7269b, obj, obj);
                return obj;
            case 1:
                return (Iterator) this.f7269b;
            default:
                return new hd.b((String) this.f7269b);
        }
    }
}
