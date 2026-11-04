package org.telegram.messenger;

import java.util.ArrayList;
public final class ed implements Runnable {
    public final int f22337a;
    public final ld f22338b;
    public final kd f22339c;

    public ed(ld ldVar, kd kdVar, int i3) {
        this.f22337a = i3;
        this.f22338b = ldVar;
        this.f22339c = kdVar;
    }

    @Override
    public final void run() {
        switch (this.f22337a) {
            case 0:
                ld ldVar = this.f22338b;
                ArrayList arrayList = ldVar.J;
                kd kdVar = this.f22339c;
                arrayList.remove(kdVar);
                ldVar.K.l(kdVar.f23810a);
                if (arrayList.isEmpty()) {
                    ld.s();
                }
                hs.e().k(280, new Object[0]);
                return;
            case 1:
                ld ldVar2 = this.f22338b;
                ArrayList arrayList2 = ldVar2.J;
                kd kdVar2 = this.f22339c;
                arrayList2.remove(kdVar2);
                ldVar2.K.l(kdVar2.f23810a);
                if (arrayList2.isEmpty()) {
                    ld.s();
                }
                hs.e().k(280, new Object[0]);
                return;
            default:
                ld ldVar3 = this.f22338b;
                ArrayList arrayList3 = ldVar3.J;
                kd kdVar3 = this.f22339c;
                arrayList3.remove(kdVar3);
                ldVar3.K.l(kdVar3.f23810a);
                if (arrayList3.isEmpty()) {
                    ld.s();
                }
                hs.e().k(280, new Object[0]);
                return;
        }
    }
}
