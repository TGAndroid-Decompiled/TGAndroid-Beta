package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends g2 {
    public final g2 f13704a;
    public Object f13705b;
    public g2 f13706c;

    public m0(j0 j0Var) {
        x1 x1Var = j0Var.f13688e;
        t0 t0Var = x1Var.f13699a;
        if (t0Var == null) {
            t0Var = x1Var.c();
            x1Var.f13699a = t0Var;
        }
        this.f13704a = t0Var.iterator();
        this.f13705b = null;
        this.f13706c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f13706c.hasNext() && !this.f13704a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f13706c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f13704a.next();
            this.f13705b = entry.getKey();
            this.f13706c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f13705b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f13706c.next());
    }
}
