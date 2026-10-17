package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f8503a;
    public Object f8504b;
    public final Iterator f8505c;

    public t0(m2 m2Var) {
        this.f8505c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8503a <= 0 && !this.f8505c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f8503a <= 0) {
            t1 t1Var = (t1) this.f8505c.next();
            this.f8504b = t1Var.f8506a;
            this.f8503a = t1Var.a();
        }
        this.f8503a--;
        Object obj = this.f8504b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
