package org.telegram.messenger;

import java.util.ArrayList;
public final class jd implements Runnable {
    public final int f24869a;
    public final qd f24870b;
    public final pd f24871c;

    public jd(qd qdVar, pd pdVar, int i7) {
        this.f24869a = i7;
        this.f24870b = qdVar;
        this.f24871c = pdVar;
    }

    @Override
    public final void run() {
        switch (this.f24869a) {
            case 0:
                qd qdVar = this.f24870b;
                ArrayList arrayList = qdVar.J;
                pd pdVar = this.f24871c;
                arrayList.remove(pdVar);
                qdVar.K.l(pdVar.f26253a);
                if (arrayList.isEmpty()) {
                    qd.s();
                }
                ks.e().k(283, new Object[0]);
                return;
            case 1:
                qd qdVar2 = this.f24870b;
                ArrayList arrayList2 = qdVar2.J;
                pd pdVar2 = this.f24871c;
                arrayList2.remove(pdVar2);
                qdVar2.K.l(pdVar2.f26253a);
                if (arrayList2.isEmpty()) {
                    qd.s();
                }
                ks.e().k(283, new Object[0]);
                return;
            default:
                qd qdVar3 = this.f24870b;
                ArrayList arrayList3 = qdVar3.J;
                pd pdVar3 = this.f24871c;
                arrayList3.remove(pdVar3);
                qdVar3.K.l(pdVar3.f26253a);
                if (arrayList3.isEmpty()) {
                    qd.s();
                }
                ks.e().k(283, new Object[0]);
                return;
        }
    }
}
