package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8495a;
    public Object f8496b;
    public m2 f8497c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8489a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8489a = y0Var;
        }
        this.f8495a = y0Var.iterator();
        this.f8496b = null;
        this.f8497c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8497c.hasNext() && !this.f8495a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8497c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8495a.next();
            this.f8496b = entry.getKey();
            this.f8497c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8496b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8497c.next());
    }
}
