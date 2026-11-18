package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class hj {
    public final Boolean f24455a;
    public final int f24456b;
    public final long f24457c;
    public final ArrayList f24458e;
    public final SparseBooleanArray f24460g;
    public final boolean f24461i;
    public final boolean f24462j;
    public final jj f24463k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f24459f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public hj(org.telegram.messenger.jj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hj.<init>(org.telegram.messenger.jj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final hj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f24458e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                fj fjVar = (fj) arrayList2.get(i7);
                if (fjVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        fj fjVar2 = (fj) arrayList.get(i10);
                        if (fjVar2 != null && fjVar.e1() == fjVar2.e1() && fj.B0(fjVar.f23968k) == fj.B0(fjVar2.f23968k)) {
                            arrayList2.set(i7, fjVar2);
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (z10) {
                return new hj(this.f24463k, this.f24455a, this.f24456b, this.f24458e, this.f24457c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f24458e;
            if (i7 < arrayList2.size()) {
                fj fjVar = (fj) arrayList2.get(i7);
                if (this.f24460g.get(fjVar.e1(), false)) {
                    arrayList.add(fjVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
