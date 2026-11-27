package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class tia {
    public boolean g;
    public boolean h;
    public int k;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean r;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public final ArrayList a = new ArrayList();
    public final SparseArray[] b = {new SparseArray(), new SparseArray()};
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f = {0, 0};
    public final boolean[] i = {false, true};
    public final int[] j = {0, 0};
    public boolean l = true;
    public byte q = 0;
    public final ArrayList s = new ArrayList();
    public final x79 x = new x79();

    public final boolean a(r47 r47Var, int i, boolean z, boolean z2) {
        SparseArray[] sparseArrayArr = this.b;
        SparseArray sparseArray = sparseArrayArr[i];
        int e1 = r47Var.e1();
        String str = r47Var.Y;
        if (sparseArray.indexOfKey(e1) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.c;
            if (z) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.a;
        if (z) {
            arrayList.add(0, r47Var);
            arrayList3.add(0, r47Var);
        } else {
            arrayList.add(r47Var);
            arrayList3.add(r47Var);
        }
        sparseArrayArr[i].put(r47Var.e1(), r47Var);
        int[] iArr = this.j;
        if (!z2) {
            if (r47Var.e1() > 0) {
                iArr[i] = Math.min(r47Var.e1(), iArr[i]);
                this.k = Math.max(r47Var.e1(), this.k);
            }
        } else {
            iArr[i] = Math.max(r47Var.e1(), iArr[i]);
            this.k = Math.min(r47Var.e1(), this.k);
        }
        if (!this.v && r47.K4(r47Var.k)) {
            this.v = true;
        }
        if (!this.w && r47.R3(r47Var.k)) {
            this.w = true;
        }
        return true;
    }

    public final r47 b(int i, int i2) {
        SparseArray[] sparseArrayArr = this.b;
        r47 r47Var = (r47) sparseArrayArr[i2].get(i);
        if (r47Var != null) {
            String str = r47Var.Y;
            HashMap hashMap = this.d;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList == null) {
                return null;
            }
            arrayList.remove(r47Var);
            this.a.remove(r47Var);
            sparseArrayArr[i2].remove(r47Var.e1());
            if (arrayList.isEmpty()) {
                hashMap.remove(str);
                this.c.remove(str);
            }
            int[] iArr = this.f;
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            return r47Var;
        }
        return null;
    }

    public final ArrayList c() {
        if (this.r) {
            return this.s;
        }
        return this.a;
    }

    public final int d() {
        if (this.r) {
            return this.t;
        }
        return this.m;
    }

    public final int e() {
        int[] iArr = this.f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i, int i2, int i3) {
        SparseArray[] sparseArrayArr = this.b;
        r47 r47Var = (r47) sparseArrayArr[i].get(i2);
        if (r47Var != null) {
            sparseArrayArr[i].remove(i2);
            sparseArrayArr[i].put(i3, r47Var);
            r47Var.k.id = i3;
            int[] iArr = this.j;
            iArr[i] = Math.min(i3, iArr[i]);
        }
    }

    public final void g(boolean z) {
        if (this.r != z) {
            this.r = z;
            if (z) {
                this.t = this.m;
                this.u = this.n;
                ArrayList arrayList = this.s;
                arrayList.clear();
                arrayList.addAll(this.a);
            }
        }
    }
}
