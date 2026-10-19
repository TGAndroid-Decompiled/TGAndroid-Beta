package e9;

import j$.util.Objects;
import java.util.Iterator;
public final class t0 extends m2 {
    public int f8501a;
    public Object f8502b;
    public final Iterator f8503c;

    public t0(m2 m2Var) {
        this.f8503c = m2Var;
    }

    @Override
    public final boolean hasNext() {
        if (this.f8501a <= 0 && !this.f8503c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (this.f8501a <= 0) {
            t1 t1Var = (t1) this.f8503c.next();
            this.f8502b = t1Var.f8504a;
            this.f8501a = t1Var.a();
        }
        this.f8501a--;
        Object obj = this.f8502b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
