package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class xr implements Runnable {
    public final int f26431a;
    public final hs f26432b;

    public xr(hs hsVar, int i3) {
        this.f26431a = i3;
        this.f26432b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f26431a) {
            case 0:
                hs hsVar = this.f26432b;
                ArrayList arrayList = null;
                hsVar.f23359i = null;
                SparseArray sparseArray = hsVar.f23364n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = Long.MAX_VALUE;
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        long j11 = ((as) sparseArray.valueAt(i3)).f21581b;
                        if (elapsedRealtime - j11 > 1000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Integer.valueOf(sparseArray.keyAt(i3)));
                        } else {
                            j10 = Math.min(j11, j10);
                        }
                    }
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            hsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j10 != Long.MAX_VALUE) {
                        g0.i3(new xr(hsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j10)));
                        return;
                    }
                    return;
                }
                return;
            default:
                hs hsVar2 = this.f26432b;
                hsVar2.f23359i = new xr(hsVar2, 0);
                return;
        }
    }
}
