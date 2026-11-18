package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14030a;
    public Object f14031b;
    public final Iterator f14032c;

    public o0(h2 h2Var) {
        this.f14032c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14030a <= 0 && !this.f14032c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14030a <= 0) {
            p1 p1Var = (p1) this.f14032c.next();
            this.f14031b = p1Var.f14039a;
            this.f14030a = p1Var.a();
        }
        this.f14030a--;
        Object obj = this.f14031b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
