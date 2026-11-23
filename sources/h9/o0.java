package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends g2 {
    public int f14023a;
    public Object f14024b;
    public final Iterator f14025c;

    public o0(g2 g2Var) {
        this.f14025c = g2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14023a <= 0 && !this.f14025c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14023a <= 0) {
            o1 o1Var = (o1) this.f14025c.next();
            this.f14024b = o1Var.f14026a;
            this.f14023a = o1Var.a();
        }
        this.f14023a--;
        Object obj = this.f14024b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
