package h9;

import j$.util.Objects;
import java.util.Iterator;
public final class o0 extends h2 {
    public int f14062a;
    public Object f14063b;
    public final Iterator f14064c;

    public o0(h2 h2Var) {
        this.f14064c = h2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f14062a <= 0 && !this.f14064c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f14062a <= 0) {
            p1 p1Var = (p1) this.f14064c.next();
            this.f14063b = p1Var.f14071a;
            this.f14062a = p1Var.a();
        }
        this.f14062a--;
        Object obj = this.f14063b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
