package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class as implements Runnable {
    public final int f23051a;
    public final ks f23052b;

    public as(ks ksVar, int i7) {
        this.f23051a = i7;
        this.f23052b = ksVar;
    }

    @Override
    public final void run() {
        switch (this.f23051a) {
            case 0:
                ks ksVar = this.f23052b;
                ArrayList arrayList = null;
                ksVar.f25343i = null;
                SparseArray sparseArray = ksVar.f25348n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((ds) sparseArray.valueAt(i7)).f23697b;
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
                            ksVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.h3(new as(ksVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        return;
                    }
                    return;
                }
                return;
            default:
                ks ksVar2 = this.f23052b;
                ksVar2.f25343i = new as(ksVar2, 0);
                return;
        }
    }
}
