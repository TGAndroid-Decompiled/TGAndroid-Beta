package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8610a;
    public Object f8611b;
    public m2 f8612c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8604a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8604a = y0Var;
        }
        this.f8610a = y0Var.iterator();
        this.f8611b = null;
        this.f8612c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8612c.hasNext() && !this.f8610a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8612c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8610a.next();
            this.f8611b = entry.getKey();
            this.f8612c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8611b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8612c.next());
    }
}
