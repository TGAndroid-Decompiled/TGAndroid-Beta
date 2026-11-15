package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
public final class ds implements Runnable {
    public final int f23135a;
    public final ns f23136b;

    public ds(ns nsVar, int i7) {
        this.f23135a = i7;
        this.f23136b = nsVar;
    }

    @Override
    public final void run() {
        switch (this.f23135a) {
            case 0:
                ns nsVar = this.f23136b;
                ArrayList arrayList = null;
                nsVar.f25627i = null;
                SparseArray sparseArray = nsVar.f25632n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((gs) sparseArray.valueAt(i7)).f23909b;
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
                            nsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.i3(new ds(nsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        return;
                    }
                    return;
                }
                return;
            default:
                ns nsVar2 = this.f23136b;
                nsVar2.f25627i = new ds(nsVar2, 0);
                return;
        }
    }
}
