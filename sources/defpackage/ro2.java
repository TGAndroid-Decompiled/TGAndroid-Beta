package defpackage;

import j$.util.Objects;
import java.util.Map;
public final class ro2 extends m3 {
    public final Object b;
    public int c;
    public final so2 d;

    public ro2(so2 so2Var, int i) {
        super((byte) 0, false);
        this.d = so2Var;
        Object obj = so2.w;
        this.b = so2Var.g(i);
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        so2 so2Var = this.d;
        if (i != -1 && i < so2Var.size() && bqe.a(obj, so2Var.g(this.c))) {
            return;
        }
        Object obj2 = so2.w;
        this.c = so2Var.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        so2 so2Var = this.d;
        Map d = so2Var.d();
        if (d != null) {
            return d.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return so2Var.l(i);
    }

    @Override
    public final Object setValue(Object obj) {
        so2 so2Var = this.d;
        Map d = so2Var.d();
        Object obj2 = this.b;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            so2Var.put(obj2, obj);
            return null;
        }
        Object l = so2Var.l(i);
        int i2 = this.c;
        Object[] objArr = so2Var.e;
        Objects.requireNonNull(objArr);
        objArr[i2] = obj;
        return l;
    }
}
