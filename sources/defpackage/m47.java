package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class m47 {
    public long a;
    public boolean b;
    public boolean c;
    public r47 h;
    public boolean i;
    public boolean j;
    public final l47 m;
    public boolean n;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final HashMap f = new HashMap();
    public final zh6 g = new zh6();
    public int k = -1;
    public int l = 800;

    public m47() {
        ?? obj = new Object();
        obj.n = 1.0f;
        this.m = obj;
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m47.a():void");
    }

    public final r47 b(int i) {
        ArrayList arrayList = this.d;
        boolean isEmpty = arrayList.isEmpty();
        HashMap hashMap = this.f;
        if (!isEmpty && hashMap.isEmpty()) {
            a();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            r47 r47Var = (r47) arrayList.get(i2);
            j47 j47Var = (j47) hashMap.get(r47Var);
            if (j47Var != null && (j47Var.l & i) == i) {
                return r47Var;
            }
        }
        return null;
    }

    public final r47 c() {
        int i;
        if (this.n) {
            i = 10;
        } else {
            i = 5;
        }
        return b(i);
    }

    public final j47 d(r47 r47Var) {
        if (r47Var == null) {
            return null;
        }
        j47 j47Var = (j47) this.f.get(r47Var);
        if (j47Var == null) {
            return (j47) this.g.f(r47Var.e1());
        }
        return j47Var;
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
