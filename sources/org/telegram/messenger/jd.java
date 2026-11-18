package org.telegram.messenger;

import java.util.ArrayList;
public final class jd implements Runnable {
    public final int f24844a;
    public final qd f24845b;
    public final pd f24846c;

    public jd(qd qdVar, pd pdVar, int i7) {
        this.f24844a = i7;
        this.f24845b = qdVar;
        this.f24846c = pdVar;
    }

    @Override
    public final void run() {
        switch (this.f24844a) {
            case 0:
                qd qdVar = this.f24845b;
                ArrayList arrayList = qdVar.J;
                pd pdVar = this.f24846c;
                arrayList.remove(pdVar);
                qdVar.K.l(pdVar.f26227a);
                if (arrayList.isEmpty()) {
                    qd.s();
                }
                ks.e().k(282, new Object[0]);
                return;
            case 1:
                qd qdVar2 = this.f24845b;
                ArrayList arrayList2 = qdVar2.J;
                pd pdVar2 = this.f24846c;
                arrayList2.remove(pdVar2);
                qdVar2.K.l(pdVar2.f26227a);
                if (arrayList2.isEmpty()) {
                    qd.s();
                }
                ks.e().k(282, new Object[0]);
                return;
            default:
                qd qdVar3 = this.f24845b;
                ArrayList arrayList3 = qdVar3.J;
                pd pdVar3 = this.f24846c;
                arrayList3.remove(pdVar3);
                qdVar3.K.l(pdVar3.f26227a);
                if (arrayList3.isEmpty()) {
                    qd.s();
                }
                ks.e().k(282, new Object[0]);
                return;
        }
    }
}
