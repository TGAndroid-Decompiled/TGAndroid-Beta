package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14059a;
    public Object f14060b;
    public final Iterator f14061c;

    public o0(h2 h2Var) {
        this.f14061c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14059a <= 0 && !this.f14061c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14059a <= 0) {
            p1 p1Var = (p1) this.f14061c.next();
            this.f14060b = p1Var.f14068a;
            this.f14059a = p1Var.a();
        }
        this.f14059a--;
        Object obj = this.f14060b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
