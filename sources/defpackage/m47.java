package defpackage;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class m47 {
    public final Boolean a;
    public final byte b;
    public final long c;
    public final ArrayList e;
    public final SparseBooleanArray g;
    public final boolean i;
    public final boolean j;
    public final o47 k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public m47(defpackage.o47 r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m47.<init>(o47, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final m47 a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z = false;
            for (int i = 0; i < arrayList2.size(); i++) {
                k47 k47Var = (k47) arrayList2.get(i);
                if (k47Var != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        k47 k47Var2 = (k47) arrayList.get(i2);
                        if (k47Var2 != null && k47Var.e1() == k47Var2.e1() && k47.B0(k47Var.k) == k47.B0(k47Var2.k)) {
                            arrayList2.set(i, k47Var2);
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (z) {
                return new m47(this.k, this.a, this.b, arrayList2, this.c, null);
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
                k47 k47Var = (k47) arrayList2.get(i);
                if (this.g.get(k47Var.e1(), false)) {
                    arrayList.add(k47Var);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
