package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8493a;
    public Object f8494b;
    public m2 f8495c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8487a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8487a = y0Var;
        }
        this.f8493a = y0Var.iterator();
        this.f8494b = null;
        this.f8495c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8495c.hasNext() && !this.f8493a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8495c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8493a.next();
            this.f8494b = entry.getKey();
            this.f8495c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8494b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8495c.next());
    }
}
