package f9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends g2 {
    public final g2 f10301a;
    public Object f10302b;
    public g2 f10303c;

    public m0(j0 j0Var) {
        x1 x1Var = j0Var.e;
        t0 t0Var = x1Var.f10297a;
        if (t0Var == null) {
            t0Var = x1Var.b();
            x1Var.f10297a = t0Var;
        }
        this.f10301a = t0Var.iterator();
        this.f10302b = null;
        this.f10303c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f10303c.hasNext() && !this.f10301a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f10303c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f10301a.next();
            this.f10302b = entry.getKey();
            this.f10303c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f10302b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f10303c.next());
    }
}
