package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class us implements Runnable {
    public final int f26863a;
    public final at f26864b;
    public final int f26865c;

    public us(at atVar, int i7, int i10) {
        this.f26863a = i10;
        this.f26864b = atVar;
        this.f26865c = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26863a;
        int i10 = this.f26865c;
        at atVar = this.f26864b;
        switch (i7) {
            case 0:
                ns.e().k(283, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 1:
                ns.e().k(283, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 2:
                ns.e().k(283, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 3:
                ns.e().k(283, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 4:
                if (atVar.J == 0) {
                    atVar.f22583w.clear();
                    ns.e().k(254, new Object[0]);
                }
                ns.e().k(283, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 5:
                a0.h hVar = atVar.f22569c;
                ArrayList arrayList = atVar.f22565a;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    gj gjVar = (gj) arrayList.get(i11);
                    if (gjVar.J && Math.abs(gjVar.e1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(gj.B0(gjVar.f23819k));
                        if (sparseArray != null) {
                            sparseArray.remove(gjVar.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(gj.B0(gjVar.f23819k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(gjVar.e1()));
                        atVar.getMessagesStorage().E(arrayList2, gj.B0(gjVar.f23819k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    atVar.Z(false);
                    return;
                }
                return;
            case 6:
                atVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                atVar.M(hVar2, false);
                return;
            case 7:
                if (r2.f26206a) {
                    a8.b("set last online from other device = " + i10);
                }
                atVar.M = i10;
                return;
            default:
                atVar.n(i10);
                return;
        }
    }
}
