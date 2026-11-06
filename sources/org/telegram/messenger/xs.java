package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class xs implements Runnable {
    public final int f26515a;
    public final dt f26516b;
    public final int f26517c;

    public xs(dt dtVar, int i7, int i10) {
        this.f26515a = i10;
        this.f26516b = dtVar;
        this.f26517c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26515a;
        int i10 = this.f26517c;
        dt dtVar = this.f26516b;
        switch (i7) {
            case 0:
                qs.e().k(283, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 1:
                qs.e().k(283, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 2:
                qs.e().k(283, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 3:
                qs.e().k(283, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 4:
                if (dtVar.I == 0) {
                    dtVar.f22082w.clear();
                    qs.e().k(254, new Object[0]);
                }
                qs.e().k(283, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 5:
                a0.h hVar = dtVar.f22069c;
                ArrayList arrayList = dtVar.f22065a;
                int i11 = 0;
                boolean z9 = false;
                while (i11 < arrayList.size()) {
                    ij ijVar = (ij) arrayList.get(i11);
                    if (ijVar.J && Math.abs(ijVar.f1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(ij.B0(ijVar.f23244k));
                        if (sparseArray != null) {
                            sparseArray.remove(ijVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(ij.B0(ijVar.f23244k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(ijVar.f1()));
                        dtVar.getMessagesStorage().E(arrayList2, ij.B0(ijVar.f23244k));
                        i11--;
                        z9 = true;
                    }
                    i11++;
                }
                if (z9) {
                    dtVar.Z(false);
                    return;
                }
                return;
            case 6:
                dtVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                dtVar.M(hVar2, false);
                return;
            case 7:
                if (r2.f25199a) {
                    a8.b("set last online from other device = " + i10);
                }
                dtVar.L = i10;
                return;
            default:
                dtVar.n(i10);
                return;
        }
    }
}
