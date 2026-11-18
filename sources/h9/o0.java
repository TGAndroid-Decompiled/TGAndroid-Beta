package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14033a;
    public Object f14034b;
    public final Iterator f14035c;

    public o0(h2 h2Var) {
        this.f14035c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14033a <= 0 && !this.f14035c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14033a <= 0) {
            p1 p1Var = (p1) this.f14035c.next();
            this.f14034b = p1Var.f14042a;
            this.f14033a = p1Var.a();
        }
        this.f14033a--;
        Object obj = this.f14034b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
