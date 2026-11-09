package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class kj {
    public final Boolean f23697a;
    public final int f23698b;
    public final long f23699c;
    public final ArrayList f23700e;
    public final SparseBooleanArray f23702g;
    public final boolean f23703i;
    public final boolean f23704j;
    public final mj f23705k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f23701f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public kj(org.telegram.messenger.mj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kj.<init>(org.telegram.messenger.mj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final kj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f23700e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z9 = false;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                ij ijVar = (ij) arrayList2.get(i7);
                if (ijVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        ij ijVar2 = (ij) arrayList.get(i10);
                        if (ijVar2 != null && ijVar.e1() == ijVar2.e1() && ij.B0(ijVar.f23262k) == ij.B0(ijVar2.f23262k)) {
                            arrayList2.set(i7, ijVar2);
                            z9 = true;
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (z9) {
                return new kj(this.f23705k, this.f23697a, this.f23698b, this.f23700e, this.f23699c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f23700e;
            if (i7 < arrayList2.size()) {
                ij ijVar = (ij) arrayList2.get(i7);
                if (this.f23702g.get(ijVar.e1(), false)) {
                    arrayList.add(ijVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
