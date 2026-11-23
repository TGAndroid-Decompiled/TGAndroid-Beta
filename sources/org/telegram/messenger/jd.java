package org.telegram.messenger;

import java.util.ArrayList;
public final class jd implements Runnable {
    public final int f24951a;
    public final qd f24952b;
    public final pd f24953c;

    public jd(qd qdVar, pd pdVar, int i7) {
        this.f24951a = i7;
        this.f24952b = qdVar;
        this.f24953c = pdVar;
    }

    @Override
    public final void run() {
        switch (this.f24951a) {
            case 0:
                qd qdVar = this.f24952b;
                ArrayList arrayList = qdVar.J;
                pd pdVar = this.f24953c;
                arrayList.remove(pdVar);
                qdVar.K.l(pdVar.f26319a);
                if (arrayList.isEmpty()) {
                    qd.s();
                }
                ks.e().k(283, new Object[0]);
                return;
            case 1:
                qd qdVar2 = this.f24952b;
                ArrayList arrayList2 = qdVar2.J;
                pd pdVar2 = this.f24953c;
                arrayList2.remove(pdVar2);
                qdVar2.K.l(pdVar2.f26319a);
                if (arrayList2.isEmpty()) {
                    qd.s();
                }
                ks.e().k(283, new Object[0]);
                return;
            default:
                qd qdVar3 = this.f24952b;
                ArrayList arrayList3 = qdVar3.J;
                pd pdVar3 = this.f24953c;
                arrayList3.remove(pdVar3);
                qdVar3.K.l(pdVar3.f26319a);
                if (arrayList3.isEmpty()) {
                    qd.s();
                }
                ks.e().k(283, new Object[0]);
                return;
        }
    }
}
