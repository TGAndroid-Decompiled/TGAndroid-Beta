package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class gt implements Runnable {
    public final int f15762a;
    public final ot f15763b;
    public final int f15764c;

    public gt(ot otVar, int i10, int i11) {
        this.f15762a = i11;
        this.f15763b = otVar;
        this.f15764c = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f15762a;
        int i11 = this.f15764c;
        ot otVar = this.f15763b;
        switch (i10) {
            case 0:
                zs.e().k(283, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 1:
                zs.e().k(283, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 2:
                zs.e().k(283, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 3:
                zs.e().k(283, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 4:
                if (otVar.I == 0) {
                    otVar.f17327w.clear();
                    zs.e().k(254, new Object[0]);
                }
                zs.e().k(283, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(147, Integer.valueOf(i11));
                return;
            case 5:
                a0.h hVar = otVar.f17315c;
                ArrayList arrayList = otVar.f17311a;
                int i12 = 0;
                boolean z10 = false;
                while (i12 < arrayList.size()) {
                    jj jjVar = (jj) arrayList.get(i12);
                    if (jjVar.J && Math.abs(jjVar.f1()) == i11) {
                        arrayList.remove(i12);
                        SparseArray sparseArray = (SparseArray) hVar.f(jj.B0(jjVar.f16337k));
                        if (sparseArray != null) {
                            sparseArray.remove(jjVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(jj.B0(jjVar.f16337k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(jjVar.f1()));
                        otVar.getMessagesStorage().E(arrayList2, jj.B0(jjVar.f16337k));
                        i12--;
                        z10 = true;
                    }
                    i12++;
                }
                if (z10) {
                    otVar.Z(false);
                    return;
                }
                return;
            case 6:
                otVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(e9.s.q(Integer.valueOf(i11)), 0L);
                otVar.M(hVar2, false);
                return;
            case 7:
                if (v2.f18448a) {
                    f8.b("set last online from other device = " + i11);
                }
                otVar.L = i11;
                return;
            default:
                otVar.n(i11);
                return;
        }
    }
}
