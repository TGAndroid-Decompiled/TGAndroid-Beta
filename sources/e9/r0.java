package e9;

import j$.util.Objects;
import java.util.Map;
public final class r0 extends m2 {
    public final m2 f8494a;
    public Object f8495b;
    public m2 f8496c;

    public r0(o0 o0Var) {
        c2 c2Var = o0Var.e;
        y0 y0Var = c2Var.f8488a;
        if (y0Var == null) {
            y0Var = c2Var.b();
            c2Var.f8488a = y0Var;
        }
        this.f8494a = y0Var.iterator();
        this.f8495b = null;
        this.f8496c = c1.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f8496c.hasNext() && !this.f8494a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f8496c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8494a.next();
            this.f8495b = entry.getKey();
            this.f8496c = ((i0) entry.getValue()).iterator();
        }
        Object obj = this.f8495b;
        Objects.requireNonNull(obj);
        return new j0(obj, this.f8496c.next());
    }
}
