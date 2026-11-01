package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class qs implements Runnable {
    public final int f17812a;
    public final at f17813b;

    public qs(at atVar, int i10) {
        this.f17812a = i10;
        this.f17813b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f17812a) {
            case 0:
                at atVar = this.f17813b;
                ArrayList arrayList = null;
                atVar.f14838i = null;
                SparseArray sparseArray = atVar.f14843n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = Long.MAX_VALUE;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        long j11 = ((ts) sparseArray.valueAt(i10)).f18304b;
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
                            atVar.j(((Integer) arrayList.get(i11)).intValue());
                        }
                    }
                    if (j10 != Long.MAX_VALUE) {
                        i0.h3(new qs(atVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j10)));
                        return;
                    }
                    return;
                }
                return;
            default:
                at atVar2 = this.f17813b;
                atVar2.f14838i = new qs(atVar2, 0);
                return;
        }
    }
}
