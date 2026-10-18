package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f8502a;
    public Object f8503b;
    public final Iterator f8504c;

    public t0(m2 m2Var) {
        this.f8504c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8502a <= 0 && !this.f8504c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f8502a <= 0) {
            t1 t1Var = (t1) this.f8504c.next();
            this.f8503b = t1Var.f8505a;
            this.f8502a = t1Var.a();
        }
        this.f8502a--;
        Object obj = this.f8503b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
