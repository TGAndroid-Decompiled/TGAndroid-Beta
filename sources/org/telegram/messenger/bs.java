package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class bs implements Runnable {
    public final int f23155a;
    public final ls f23156b;

    public bs(ls lsVar, int i7) {
        this.f23155a = i7;
        this.f23156b = lsVar;
    }

    @Override
    public final void run() {
        switch (this.f23155a) {
            case 0:
                ls lsVar = this.f23156b;
                ArrayList arrayList = null;
                lsVar.f25438i = null;
                SparseArray sparseArray = lsVar.f25443n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((es) sparseArray.valueAt(i7)).f23761b;
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
                            lsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.h3(new bs(lsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        return;
                    }
                    return;
                }
                return;
            default:
                ls lsVar2 = this.f23156b;
                lsVar2.f25438i = new bs(lsVar2, 0);
                return;
        }
    }
}
