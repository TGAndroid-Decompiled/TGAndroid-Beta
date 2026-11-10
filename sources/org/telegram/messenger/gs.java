package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class gs implements Runnable {
    public final int f22720a;
    public final qs f22721b;

    public gs(qs qsVar, int i7) {
        this.f22720a = i7;
        this.f22721b = qsVar;
    }

    @Override
    public final void run() {
        switch (this.f22720a) {
            case 0:
                qs qsVar = this.f22721b;
                ArrayList arrayList = null;
                qsVar.f25134i = null;
                SparseArray sparseArray = qsVar.f25139n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((js) sparseArray.valueAt(i7)).f23604b;
                        if (elapsedRealtime - j10 > 1000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Integer.valueOf(sparseArray.keyAt(i7)));
                        } else {
                            j3 = Math.min(j10, j3);
                        }
                    }
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            qsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.i3(new gs(qsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        return;
                    }
                    return;
                }
                return;
            default:
                qs qsVar2 = this.f22721b;
                qsVar2.f25134i = new gs(qsVar2, 0);
                return;
        }
    }
}
