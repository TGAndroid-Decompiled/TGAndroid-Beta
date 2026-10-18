package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f8504a;
    public Object f8505b;
    public final Iterator f8506c;

    public t0(m2 m2Var) {
        this.f8506c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8504a <= 0 && !this.f8506c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f8504a <= 0) {
            t1 t1Var = (t1) this.f8506c.next();
            this.f8505b = t1Var.f8507a;
            this.f8504a = t1Var.a();
        }
        this.f8504a--;
        Object obj = this.f8505b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
