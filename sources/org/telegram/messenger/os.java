package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
public final class os implements Runnable {
    public final int f24591a;
    public final us f24592b;
    public final int f24593c;

    public os(us usVar, int i3, int i10) {
        this.f24591a = i10;
        this.f24592b = usVar;
        this.f24593c = i3;
    }

    @Override
    public final void run() {
        int i3 = this.f24591a;
        int i10 = this.f24593c;
        us usVar = this.f24592b;
        switch (i3) {
            case 0:
                hs.e().k(283, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 1:
                hs.e().k(283, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 2:
                hs.e().k(283, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 3:
                hs.e().k(283, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 4:
                if (usVar.J == 0) {
                    usVar.f25773w.clear();
                    hs.e().k(254, new Object[0]);
                }
                hs.e().k(283, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(147, Integer.valueOf(i10));
                return;
            case 5:
                a0.h hVar = usVar.f25759c;
                ArrayList arrayList = usVar.f25755a;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    zi ziVar = (zi) arrayList.get(i11);
                    if (ziVar.J && Math.abs(ziVar.f1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(zi.B0(ziVar.f26868k));
                        if (sparseArray != null) {
                            sparseArray.remove(ziVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(zi.B0(ziVar.f26868k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(ziVar.f1()));
                        usVar.getMessagesStorage().E(arrayList2, zi.B0(ziVar.f26868k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    usVar.Z(false);
                    return;
                }
                return;
            case 6:
                usVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(g9.o.r(Integer.valueOf(i10)), 0L);
                usVar.M(hVar2, false);
                return;
            case 7:
                if (r2.f25040a) {
                    a8.b("set last online from other device = " + i10);
                }
                usVar.M = i10;
                return;
            default:
                usVar.n(i10);
                return;
        }
    }
}
