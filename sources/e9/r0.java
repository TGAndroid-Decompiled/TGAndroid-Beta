package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f6408a;
    public Object f6409b;
    public m2 f6410c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f6402a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f6402a = y0Var;
        }
        this.f6408a = y0Var.iterator();
        this.f6409b = null;
        this.f6410c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f6410c.hasNext() && !this.f6408a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f6410c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f6408a.next();
            this.f6409b = entry.getKey();
            this.f6410c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f6409b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f6410c.next());
    }
}
