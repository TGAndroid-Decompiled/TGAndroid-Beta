package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class mj {
    public final Boolean f17130a;
    public final int f17131b;
    public final long f17132c;
    public final ArrayList e;
    public final SparseBooleanArray f17134g;
    public final boolean f17135i;
    public final boolean f17136j;
    public final oj f17137k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f17133f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public mj(org.telegram.messenger.oj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mj.<init>(org.telegram.messenger.oj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final mj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                kj kjVar = (kj) arrayList2.get(i10);
                if (kjVar != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        kj kjVar2 = (kj) arrayList.get(i11);
                        if (kjVar2 != null && kjVar.f1() == kjVar2.f1() && kj.B0(kjVar.f16690k) == kj.B0(kjVar2.f16690k)) {
                            arrayList2.set(i10, kjVar2);
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (z10) {
                return new mj(this.f17137k, this.f17130a, this.f17131b, this.e, this.f17132c, null);
            }
            return null;
        }
        return null;
    }

    public final void b(ArrayList arrayList) {
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                kj kjVar = (kj) arrayList2.get(i10);
                if (this.f17134g.get(kjVar.f1(), false)) {
                    arrayList.add(kjVar);
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
