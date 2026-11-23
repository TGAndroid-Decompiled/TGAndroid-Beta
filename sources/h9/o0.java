package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14025a;
    public Object f14026b;
    public final Iterator f14027c;

    public o0(h2 h2Var) {
        this.f14027c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14025a <= 0 && !this.f14027c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14025a <= 0) {
            p1 p1Var = (p1) this.f14027c.next();
            this.f14026b = p1Var.f14034a;
            this.f14025a = p1Var.a();
        }
        this.f14025a--;
        Object obj = this.f14026b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
