package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ht implements Runnable {
    public final int f16111a;
    public final pt f16112b;
    public final int f16113c;

    public ht(pt ptVar, int i10, int i11) {
        this.f16111a = i11;
        this.f16112b = ptVar;
        this.f16113c = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f16111a;
        int i11 = this.f16113c;
        pt ptVar = this.f16112b;
        switch (i10) {
            case 0:
                at.e().k(283, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 1:
                at.e().k(283, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 2:
                at.e().k(283, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 3:
                at.e().k(283, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 4:
                if (ptVar.I == 0) {
                    ptVar.f17660w.clear();
                    at.e().k(254, new Object[0]);
                }
                at.e().k(283, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 5:
                a0.h hVar = ptVar.f17648c;
                ArrayList arrayList = ptVar.f17644a;
                int i12 = 0;
                boolean z10 = false;
                while (i12 < arrayList.size()) {
                    kj kjVar = (kj) arrayList.get(i12);
                    if (kjVar.J && Math.abs(kjVar.f1()) == i11) {
                        arrayList.remove(i12);
                        SparseArray sparseArray = (SparseArray) hVar.f(kj.B0(kjVar.f16690k));
                        if (sparseArray != null) {
                            sparseArray.remove(kjVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(kj.B0(kjVar.f16690k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(kjVar.f1()));
                        ptVar.getMessagesStorage().E(arrayList2, kj.B0(kjVar.f16690k));
                        i12--;
                        z10 = true;
                    }
                    i12++;
                }
                if (z10) {
                    ptVar.Z(false);
                    return;
                }
                return;
            case 6:
                ptVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(e9.s.q(Integer.valueOf(i11)), 0L);
                ptVar.M(hVar2, false);
                return;
            case 7:
                if (v2.f18578a) {
                    f8.b("set last online from other device = " + i11);
                }
                ptVar.L = i11;
                return;
            default:
                ptVar.n(i11);
                return;
        }
    }
}
