package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class bj {
    public final Boolean f21838a;
    public final int f21839b;
    public final long f21840c;
    public final ArrayList f21841e;
    public final SparseBooleanArray f21843g;
    public final boolean f21844i;
    public final boolean f21845j;
    public final dj f21846k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f21842f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public bj(org.telegram.messenger.dj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bj.<init>(org.telegram.messenger.dj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final bj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f21841e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z10 = false;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                zi ziVar = (zi) arrayList2.get(i3);
                if (ziVar != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        zi ziVar2 = (zi) arrayList.get(i10);
                        if (ziVar2 != null && ziVar.f1() == ziVar2.f1() && zi.B0(ziVar.f26868k) == zi.B0(ziVar2.f26868k)) {
                            arrayList2.set(i3, ziVar2);
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            }
            if (z10) {
                return new bj(this.f21846k, this.f21838a, this.f21839b, this.f21841e, this.f21840c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f21841e;
            if (i3 < arrayList2.size()) {
                zi ziVar = (zi) arrayList2.get(i3);
                if (this.f21843g.get(ziVar.f1(), false)) {
                    arrayList.add(ziVar);
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
