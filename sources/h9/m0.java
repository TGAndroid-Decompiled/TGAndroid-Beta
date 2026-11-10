package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14349a;
    public Object f14350b;
    public h2 f14351c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14335e;
        t0 t0Var = y1Var.f14344a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14344a = t0Var;
        }
        this.f14349a = t0Var.iterator();
        this.f14350b = null;
        this.f14351c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14351c.hasNext() && !this.f14349a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14351c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14349a.next();
            this.f14350b = entry.getKey();
            this.f14351c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14350b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14351c.next());
    }
}
