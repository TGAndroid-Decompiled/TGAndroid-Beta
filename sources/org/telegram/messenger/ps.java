package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class ps implements Runnable {
    public final int f17477a;
    public final zs f17478b;

    public ps(zs zsVar, int i10) {
        this.f17477a = i10;
        this.f17478b = zsVar;
    }

    @Override
    public final void run() {
        switch (this.f17477a) {
            case 0:
                zs zsVar = this.f17478b;
                ArrayList arrayList = null;
                zsVar.f19742i = null;
                SparseArray sparseArray = zsVar.f19747n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = Long.MAX_VALUE;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        long j11 = ((ss) sparseArray.valueAt(i10)).f17953b;
                        if (elapsedRealtime - j11 > 1000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Integer.valueOf(sparseArray.keyAt(i10)));
                        } else {
                            j10 = Math.min(j11, j10);
                        }
                    }
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            zsVar.j(((Integer) arrayList.get(i11)).intValue());
                        }
                    }
                    if (j10 != Long.MAX_VALUE) {
                        i0.h3(new ps(zsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j10)));
                        return;
                    }
                    return;
                }
                return;
            default:
                zs zsVar2 = this.f17478b;
                zsVar2.f19742i = new ps(zsVar2, 0);
                return;
        }
    }
}
