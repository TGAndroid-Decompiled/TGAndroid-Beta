package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class f27 {
    public long a;
    public boolean b;
    public boolean c;
    public k27 h;
    public boolean i;
    public boolean j;
    public final e27 m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final vf6 g = new vf6();
    public int k = -1;
    public int l = 800;

    public f27() {
        ?? obj = new Object();
        obj.n = 1.0f;
        this.m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f27.a():void");
    }

    public final k27 b(int i) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            k27 k27Var = (k27) arrayList.get(i2);
            c27 c27Var = (c27) hashMap.get(k27Var);
            if (c27Var != null && (c27Var.l & i) == i) {
                return k27Var;
            }
        }
        return null;
    }

    public final k27 c() {
        int i;
        if (this.n) {
            i = 10;
        } else {
            i = 5;
        }
        return b(i);
    }

    public final c27 d(k27 k27Var) {
        if (k27Var == null) {
            return null;
        }
        c27 c27Var = (c27) this.f.get(k27Var);
        if (c27Var == null) {
            return (c27) this.g.f(k27Var.e1());
        }
        return c27Var;
    }

    public final float e(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return this.l / f;
    }
}
