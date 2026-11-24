package defpackage;

import java.util.Map;
public final class m9d extends m3 {
    public final Object b;
    public int c;
    public final dq2 d;

    public m9d(dq2 dq2Var, int i) {
        super((byte) 2, false);
        this.d = dq2Var;
        Object[] objArr = dq2Var.d;
        objArr.getClass();
        this.b = objArr[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        dq2 dq2Var = this.d;
        if (i != -1 && i < dq2Var.size()) {
            int i2 = this.c;
            Object[] objArr = dq2Var.d;
            objArr.getClass();
            if (o3f.a(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = dq2.w;
        this.c = dq2Var.s(obj);
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        dq2 dq2Var = this.d;
        Map m = dq2Var.m();
        if (m != null) {
            return m.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        Object[] objArr = dq2Var.e;
        objArr.getClass();
        return objArr[i];
    }

    @Override
    public final Object setValue(Object obj) {
        dq2 dq2Var = this.d;
        Map m = dq2Var.m();
        Object obj2 = this.b;
        if (m != null) {
            return m.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            dq2Var.put(obj2, obj);
            return null;
        }
        Object[] objArr = dq2Var.e;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }
}
