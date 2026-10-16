package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8613a;
    public Object f8614b;
    public m2 f8615c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8607a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8607a = y0Var;
        }
        this.f8613a = y0Var.iterator();
        this.f8614b = null;
        this.f8615c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8615c.hasNext() && !this.f8613a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8615c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8613a.next();
            this.f8614b = entry.getKey();
            this.f8615c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8614b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8615c.next());
    }
}
