package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14053a;
    public Object f14054b;
    public h2 f14055c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14039e;
        t0 t0Var = y1Var.f14048a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14048a = t0Var;
        }
        this.f14053a = t0Var.iterator();
        this.f14054b = null;
        this.f14055c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14055c.hasNext() && !this.f14053a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14055c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14053a.next();
            this.f14054b = entry.getKey();
            this.f14055c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14054b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14055c.next());
    }
}
