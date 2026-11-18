package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class rs implements Runnable {
    public final int f26692a;
    public final xs f26693b;
    public final int f26694c;

    public rs(xs xsVar, int i7, int i10) {
        this.f26692a = i10;
        this.f26693b = xsVar;
        this.f26694c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26692a;
        int i10 = this.f26694c;
        xs xsVar = this.f26693b;
        switch (i7) {
            case 0:
                ks.e().k(286, Integer.valueOf(xsVar.currentAccount));
                xsVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 1:
                ks.e().k(286, Integer.valueOf(xsVar.currentAccount));
                xsVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 2:
                ks.e().k(286, Integer.valueOf(xsVar.currentAccount));
                xsVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 3:
                ks.e().k(286, Integer.valueOf(xsVar.currentAccount));
                xsVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 4:
                if (xsVar.J == 0) {
                    xsVar.f27982w.clear();
                    ks.e().k(257, new Object[0]);
                }
                ks.e().k(286, Integer.valueOf(xsVar.currentAccount));
                xsVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 5:
                a0.h hVar = xsVar.f27968c;
                ArrayList arrayList = xsVar.f27964a;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    fj fjVar = (fj) arrayList.get(i11);
                    if (fjVar.J && Math.abs(fjVar.e1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(fj.B0(fjVar.f23965k));
                        if (sparseArray != null) {
                            sparseArray.remove(fjVar.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(fj.B0(fjVar.f23965k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(fjVar.e1()));
                        xsVar.getMessagesStorage().E(arrayList2, fj.B0(fjVar.f23965k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    xsVar.Z(false);
                    return;
                }
                return;
            case 6:
                xsVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                xsVar.M(hVar2, false);
                return;
            case 7:
                if (s2.f26721a) {
                    a8.b("set last online from other device = " + i10);
                }
                xsVar.M = i10;
                return;
            default:
                xsVar.n(i10);
                return;
        }
    }
}
