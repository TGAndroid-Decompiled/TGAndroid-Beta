package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14021a;
    public Object f14022b;
    public h2 f14023c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14007e;
        t0 t0Var = y1Var.f14016a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14016a = t0Var;
        }
        this.f14021a = t0Var.iterator();
        this.f14022b = null;
        this.f14023c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14023c.hasNext() && !this.f14021a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14023c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14021a.next();
            this.f14022b = entry.getKey();
            this.f14023c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14022b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14023c.next());
    }
}
