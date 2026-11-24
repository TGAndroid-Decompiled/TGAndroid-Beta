package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class f47 {
    public long a;
    public boolean b;
    public boolean c;
    public k47 h;
    public boolean i;
    public boolean j;
    public final e47 m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final vh6 g = new vh6();
    public int k = -1;
    public int l = 800;

    public f47() {
        ?? obj = new Object();
        obj.n = 1.0f;
        this.m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f47.a():void");
    }

    public final k47 b(int i) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            k47 k47Var = (k47) arrayList.get(i2);
            c47 c47Var = (c47) hashMap.get(k47Var);
            if (c47Var != null && (c47Var.l & i) == i) {
                return k47Var;
            }
        }
        return null;
    }

    public final k47 c() {
        int i;
        if (this.n) {
            i = 10;
        } else {
            i = 5;
        }
        return b(i);
    }

    public final c47 d(k47 k47Var) {
        if (k47Var == null) {
            return null;
        }
        c47 c47Var = (c47) this.f.get(k47Var);
        if (c47Var == null) {
            return (c47) this.g.f(k47Var.e1());
        }
        return c47Var;
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
