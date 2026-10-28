package f9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends g2 {
    public final g2 f10300a;
    public Object f10301b;
    public g2 f10302c;

    public m0(j0 j0Var) {
        x1 x1Var = j0Var.e;
        t0 t0Var = x1Var.f10296a;
        if (t0Var == null) {
            t0Var = x1Var.b();
            x1Var.f10296a = t0Var;
        }
        this.f10300a = t0Var.iterator();
        this.f10301b = null;
        this.f10302c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f10302c.hasNext() && !this.f10300a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f10302c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f10300a.next();
            this.f10301b = entry.getKey();
            this.f10302c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f10301b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f10302c.next());
    }
}
