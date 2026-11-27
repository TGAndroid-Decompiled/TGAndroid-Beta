package defpackage;

import j$.util.Objects;
import java.util.Map;
public final class kp2 extends n3 {
    public final Object b;
    public int c;
    public final lp2 d;

    public kp2(lp2 lp2Var, int i) {
        super((byte) 0, false);
        this.d = lp2Var;
        Object obj = lp2.w;
        this.b = lp2Var.g(i);
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        lp2 lp2Var = this.d;
        if (i != -1 && i < lp2Var.size() && tue.a(obj, lp2Var.g(this.c))) {
            return;
        }
        Object obj2 = lp2.w;
        this.c = lp2Var.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        lp2 lp2Var = this.d;
        Map d = lp2Var.d();
        if (d != null) {
            return d.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return lp2Var.l(i);
    }

    @Override
    public final Object setValue(Object obj) {
        lp2 lp2Var = this.d;
        Map d = lp2Var.d();
        Object obj2 = this.b;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            lp2Var.put(obj2, obj);
            return null;
        }
        Object l = lp2Var.l(i);
        int i2 = this.c;
        Object[] objArr = lp2Var.e;
        Objects.requireNonNull(objArr);
        objArr[i2] = obj;
        return l;
    }
}
