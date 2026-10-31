package org.telegram.messenger;

import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
public final class lj {
    public final Boolean f16746a;
    public final int f16747b;
    public final long f16748c;
    public final ArrayList e;
    public final SparseBooleanArray f16750g;
    public final boolean f16751i;
    public final boolean f16752j;
    public final nj f16753k;
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f16749f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public lj(org.telegram.messenger.nj r21, java.lang.Boolean r22, int r23, java.util.ArrayList r24, long r25, android.util.SparseBooleanArray r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lj.<init>(org.telegram.messenger.nj, java.lang.Boolean, int, java.util.ArrayList, long, android.util.SparseBooleanArray):void");
    }

    public final lj a(ArrayList arrayList) {
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && arrayList2.size() <= 1 && arrayList != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                jj jjVar = (jj) arrayList2.get(i10);
                if (jjVar != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        jj jjVar2 = (jj) arrayList.get(i11);
                        if (jjVar2 != null && jjVar.f1() == jjVar2.f1() && jj.B0(jjVar.f16337k) == jj.B0(jjVar2.f16337k)) {
                            arrayList2.set(i10, jjVar2);
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (z10) {
                return new lj(this.f16753k, this.f16746a, this.f16747b, this.e, this.f16748c, null);
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
                jj jjVar = (jj) arrayList2.get(i10);
                if (this.f16750g.get(jjVar.f1(), false)) {
                    arrayList.add(jjVar);
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
