package g9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends g2 {
    public final g2 f12101a;
    public Object f12102b;
    public g2 f12103c;

    public m0(j0 j0Var) {
        x1 x1Var = j0Var.f12085e;
        t0 t0Var = x1Var.f12096a;
        if (t0Var == null) {
            t0Var = x1Var.c();
            x1Var.f12096a = t0Var;
        }
        this.f12101a = t0Var.iterator();
        this.f12102b = null;
        this.f12103c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f12103c.hasNext() && !this.f12101a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f12103c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12101a.next();
            this.f12102b = entry.getKey();
            this.f12103c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f12102b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f12103c.next());
    }
}
