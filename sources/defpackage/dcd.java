package defpackage;

import java.util.Map;
public final class dcd extends n3 {
    public final Object b;
    public int c;
    public final lp2 d;

    public dcd(lp2 lp2Var, int i) {
        super((byte) 2, false);
        this.d = lp2Var;
        Object[] objArr = lp2Var.d;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        lp2 lp2Var = this.d;
        if (i != -1 && i < lp2Var.size()) {
            int i2 = this.c;
            Object[] objArr = lp2Var.d;
            objArr.getClass();
            if (e6f.a(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = lp2.w;
        this.c = lp2Var.s(obj);
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        lp2 lp2Var = this.d;
        Map m = lp2Var.m();
        if (m != null) {
            return m.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = lp2Var.e;
        objArr.getClass();
        return objArr[i];
    }

    @Override
    public final Object setValue(Object obj) {
        lp2 lp2Var = this.d;
        Map m = lp2Var.m();
        Object obj2 = this.b;
        if (m != null) {
            return m.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            lp2Var.put(obj2, obj);
            return null;
        }
        Object[] objArr = lp2Var.e;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }
}
