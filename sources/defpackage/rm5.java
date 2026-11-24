package defpackage;

import j$.util.Objects;
import java.util.Map;
public final class rm5 extends v5c {
    public final v5c b;
    public Object c;
    public v5c d;

    public rm5(nm5 nm5Var) {
        super((byte) 0);
        b69 b69Var = nm5Var.e;
        ym5 ym5Var = b69Var.a;
        if (ym5Var == null) {
            ym5Var = b69Var.c();
            b69Var.a = ym5Var;
        }
        this.b = ym5Var.n();
        this.c = null;
        this.d = ls5.e;
    }

    @Override
    public final boolean hasNext() {
        if (!this.d.hasNext() && !this.b.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            this.d = ((gm5) entry.getValue()).n();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new hm5(obj, this.d.next());
    }
}
