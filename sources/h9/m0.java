package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends g2 {
    public final g2 f14013a;
    public Object f14014b;
    public g2 f14015c;

    public m0(j0 j0Var) {
        x1 x1Var = j0Var.f13997e;
        t0 t0Var = x1Var.f14008a;
        if (t0Var == null) {
            t0Var = x1Var.c();
            x1Var.f14008a = t0Var;
        }
        this.f14013a = t0Var.iterator();
        this.f14014b = null;
        this.f14015c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14015c.hasNext() && !this.f14013a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14015c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14013a.next();
            this.f14014b = entry.getKey();
            this.f14015c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14014b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14015c.next());
    }
}
