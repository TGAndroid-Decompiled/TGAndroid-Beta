package defpackage;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class t47 {
    public final Boolean a;
    public final byte b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final v47 k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public t47(defpackage.v47 r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t47.<init>(v47, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final t47 a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z = false;
            for (int i = 0; i < arrayList2.size(); i++) {
                r47 r47Var = (r47) arrayList2.get(i);
                if (r47Var != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        r47 r47Var2 = (r47) arrayList.get(i2);
                        if (r47Var2 != null && r47Var.e1() == r47Var2.e1() && r47.B0(r47Var.k) == r47.B0(r47Var2.k)) {
                            arrayList2.set(i, r47Var2);
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (z) {
                return new t47(this.k, this.a, this.b, arrayList2, this.c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i < arrayList2.size()) {
                r47 r47Var = (r47) arrayList2.get(i);
                if (this.g.get(r47Var.e1(), false)) {
                    arrayList.add(r47Var);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
