package defpackage;

import j$.util.Objects;
import java.util.Map;
public final class ro5 extends v7c {
    public final v7c b;
    public Object c;
    public v7c d;

    public ro5(no5 no5Var) {
        super((byte) 0);
        d89 d89Var = no5Var.e;
        yo5 yo5Var = d89Var.a;
        if (yo5Var == null) {
            yo5Var = d89Var.c();
            d89Var.a = yo5Var;
        }
        this.b = yo5Var.n();
        this.c = null;
        this.d = ku5.e;
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
            this.d = ((go5) entry.getValue()).n();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new ho5(obj, this.d.next());
    }
}
