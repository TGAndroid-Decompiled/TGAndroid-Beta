package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f8619a;
    public Object f8620b;
    public final Iterator f8621c;

    public t0(m2 m2Var) {
        this.f8621c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8619a <= 0 && !this.f8621c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f8619a <= 0) {
            t1 t1Var = (t1) this.f8621c.next();
            this.f8620b = t1Var.f8622a;
            this.f8619a = t1Var.a();
        }
        this.f8619a--;
        Object obj = this.f8620b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
