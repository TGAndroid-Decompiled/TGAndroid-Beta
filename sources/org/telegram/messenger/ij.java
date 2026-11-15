package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class ij {
    public final Boolean f24400a;
    public final int f24401b;
    public final long f24402c;
    public final ArrayList f24403e;
    public final SparseBooleanArray f24405g;
    public final boolean f24406i;
    public final boolean f24407j;
    public final kj f24408k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f24404f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public ij(org.telegram.messenger.kj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ij.<init>(org.telegram.messenger.kj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final ij a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f24403e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                gj gjVar = (gj) arrayList2.get(i7);
                if (gjVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        gj gjVar2 = (gj) arrayList.get(i10);
                        if (gjVar2 != null && gjVar.e1() == gjVar2.e1() && gj.B0(gjVar.f23819k) == gj.B0(gjVar2.f23819k)) {
                            arrayList2.set(i7, gjVar2);
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (z10) {
                return new ij(this.f24408k, this.f24400a, this.f24401b, this.f24403e, this.f24402c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f24403e;
            if (i7 < arrayList2.size()) {
                gj gjVar = (gj) arrayList2.get(i7);
                if (this.f24405g.get(gjVar.e1(), false)) {
                    arrayList.add(gjVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
