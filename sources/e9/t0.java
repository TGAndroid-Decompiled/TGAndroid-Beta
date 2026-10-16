package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f8622a;
    public Object f8623b;
    public final Iterator f8624c;

    public t0(m2 m2Var) {
        this.f8624c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8622a <= 0 && !this.f8624c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f8622a <= 0) {
            t1 t1Var = (t1) this.f8624c.next();
            this.f8623b = t1Var.f8625a;
            this.f8622a = t1Var.a();
        }
        this.f8622a--;
        Object obj = this.f8623b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
