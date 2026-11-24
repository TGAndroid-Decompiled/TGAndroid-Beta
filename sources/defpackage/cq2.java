package defpackage;

import j$.util.Objects;
import java.util.Map;
public final class cq2 extends m3 {
    public final Object b;
    public int c;
    public final dq2 d;

    public cq2(dq2 dq2Var, int i) {
        super((byte) 0, false);
        this.d = dq2Var;
        Object obj = dq2.w;
        this.b = dq2Var.g(i);
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        dq2 dq2Var = this.d;
        if (i != -1 && i < dq2Var.size() && ese.a(obj, dq2Var.g(this.c))) {
            return;
        }
        Object obj2 = dq2.w;
        this.c = dq2Var.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        dq2 dq2Var = this.d;
        Map d = dq2Var.d();
        if (d != null) {
            return d.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return dq2Var.l(i);
    }

    @Override
    public final Object setValue(Object obj) {
        dq2 dq2Var = this.d;
        Map d = dq2Var.d();
        Object obj2 = this.b;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            dq2Var.put(obj2, obj);
            return null;
        }
        Object l = dq2Var.l(i);
        int i2 = this.c;
        Object[] objArr = dq2Var.e;
        Objects.requireNonNull(objArr);
        objArr[i2] = obj;
        return l;
    }
}
