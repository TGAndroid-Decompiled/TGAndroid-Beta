package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class hj {
    public final Boolean f24452a;
    public final int f24453b;
    public final long f24454c;
    public final ArrayList f24455e;
    public final SparseBooleanArray f24457g;
    public final boolean f24458i;
    public final boolean f24459j;
    public final jj f24460k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f24456f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public hj(org.telegram.messenger.jj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hj.<init>(org.telegram.messenger.jj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final hj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f24455e;
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
                        if (fjVar2 != null && fjVar.e1() == fjVar2.e1() && fj.B0(fjVar.f23965k) == fj.B0(fjVar2.f23965k)) {
                            arrayList2.set(i7, fjVar2);
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (z10) {
                return new hj(this.f24460k, this.f24452a, this.f24453b, this.f24455e, this.f24454c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f24455e;
            if (i7 < arrayList2.size()) {
                fj fjVar = (fj) arrayList2.get(i7);
                if (this.f24457g.get(fjVar.e1(), false)) {
                    arrayList.add(fjVar);
                }
                i7++;
            } else {
                return;
            }
        }
    }
}
