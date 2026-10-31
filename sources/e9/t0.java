package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f6417a;
    public Object f6418b;
    public final Iterator f6419c;

    public t0(m2 m2Var) {
        this.f6419c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f6417a <= 0 && !this.f6419c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f6417a <= 0) {
            t1 t1Var = (t1) this.f6419c.next();
            this.f6418b = t1Var.f6420a;
            this.f6417a = t1Var.a();
        }
        this.f6417a--;
        Object obj = this.f6418b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
