package h9;

import j$.util.Objects;
import java.util.Map;
public final class m0 extends h2 {
    public final h2 f14016a;
    public Object f14017b;
    public h2 f14018c;

    public m0(j0 j0Var) {
        y1 y1Var = j0Var.f14002e;
        t0 t0Var = y1Var.f14011a;
        if (t0Var == null) {
            t0Var = y1Var.c();
            y1Var.f14011a = t0Var;
        }
        this.f14016a = t0Var.iterator();
        this.f14017b = null;
        this.f14018c = x0.d;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14018c.hasNext() && !this.f14016a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.f14018c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14016a.next();
            this.f14017b = entry.getKey();
            this.f14018c = ((d0) entry.getValue()).iterator();
        }
        Object obj = this.f14017b;
        Objects.requireNonNull(obj);
        return new e0(obj, this.f14018c.next());
    }
}
