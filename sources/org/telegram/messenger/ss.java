package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class ss implements Runnable {
    public final int f26906a;
    public final ys f26907b;
    public final int f26908c;

    public ss(ys ysVar, int i7, int i10) {
        this.f26906a = i10;
        this.f26907b = ysVar;
        this.f26908c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26906a;
        int i10 = this.f26908c;
        ys ysVar = this.f26907b;
        switch (i7) {
            case 0:
                ls.e().k(286, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 1:
                ls.e().k(286, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 2:
                ls.e().k(286, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 3:
                ls.e().k(286, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 4:
                if (ysVar.J == 0) {
                    ysVar.f28194w.clear();
                    ls.e().k(257, new Object[0]);
                }
                ls.e().k(286, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 5:
                a0.h hVar = ysVar.f28180c;
                ArrayList arrayList = ysVar.f28176a;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    gj gjVar = (gj) arrayList.get(i11);
                    if (gjVar.J && Math.abs(gjVar.e1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(gj.B0(gjVar.f24213k));
                        if (sparseArray != null) {
                            sparseArray.remove(gjVar.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(gj.B0(gjVar.f24213k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(gjVar.e1()));
                        ysVar.getMessagesStorage().E(arrayList2, gj.B0(gjVar.f24213k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    ysVar.Z(false);
                    return;
                }
                return;
            case 6:
                ysVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                ysVar.M(hVar2, false);
                return;
            case 7:
                if (s2.f26730a) {
                    a8.b("set last online from other device = " + i10);
                }
                ysVar.M = i10;
                return;
            default:
                ysVar.n(i10);
                return;
        }
    }
}
