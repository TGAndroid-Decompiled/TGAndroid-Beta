package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14050a;
    public Object f14051b;
    public h2 f14052c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14036e;
        t0 t0Var = y1Var.f14045a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14045a = t0Var;
        }
        this.f14050a = t0Var.iterator();
        this.f14051b = null;
        this.f14052c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14052c.hasNext() && !this.f14050a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14052c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14050a.next();
            this.f14051b = entry.getKey();
            this.f14052c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14051b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14052c.next());
    }
}
