package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14347a;
    public Object f14348b;
    public h2 f14349c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14333e;
        t0 t0Var = y1Var.f14342a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14342a = t0Var;
        }
        this.f14347a = t0Var.iterator();
        this.f14348b = null;
        this.f14349c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14349c.hasNext() && !this.f14347a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14349c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14347a.next();
            this.f14348b = entry.getKey();
            this.f14349c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14348b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14349c.next());
    }
}
