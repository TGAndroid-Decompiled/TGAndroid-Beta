package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8492a;
    public Object f8493b;
    public m2 f8494c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8486a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8486a = y0Var;
        }
        this.f8492a = y0Var.iterator();
        this.f8493b = null;
        this.f8494c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8494c.hasNext() && !this.f8492a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8494c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8492a.next();
            this.f8493b = entry.getKey();
            this.f8494c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8493b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8494c.next());
    }
}
