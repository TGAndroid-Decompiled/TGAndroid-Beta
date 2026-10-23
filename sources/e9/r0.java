package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8499a;
    public Object f8500b;
    public m2 f8501c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8493a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8493a = y0Var;
        }
        this.f8499a = y0Var.iterator();
        this.f8500b = null;
        this.f8501c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8501c.hasNext() && !this.f8499a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8501c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8499a.next();
            this.f8500b = entry.getKey();
            this.f8501c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8500b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8501c.next());
    }
}
