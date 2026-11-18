package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14024a;
    public Object f14025b;
    public h2 f14026c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14010e;
        t0 t0Var = y1Var.f14019a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14019a = t0Var;
        }
        this.f14024a = t0Var.iterator();
        this.f14025b = null;
        this.f14026c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14026c.hasNext() && !this.f14024a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14026c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14024a.next();
            this.f14025b = entry.getKey();
            this.f14026c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14025b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14026c.next());
    }
}
