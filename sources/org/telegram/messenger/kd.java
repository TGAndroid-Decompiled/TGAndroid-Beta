package org.telegram.messenger;

import java.util.ArrayList;
public final class kd implements Runnable {
    public final int f24681a;
    public final rd f24682b;
    public final qd f24683c;

    public kd(rd rdVar, qd qdVar, int i7) {
        this.f24681a = i7;
        this.f24682b = rdVar;
        this.f24683c = qdVar;
    }

    @Override
    public final void run() {
        switch (this.f24681a) {
            case 0:
                rd rdVar = this.f24682b;
                ArrayList arrayList = rdVar.J;
                qd qdVar = this.f24683c;
                arrayList.remove(qdVar);
                rdVar.K.l(qdVar.f26078a);
                if (arrayList.isEmpty()) {
                    rd.s();
                }
                ns.e().k(280, new Object[0]);
                return;
            case 1:
                rd rdVar2 = this.f24682b;
                ArrayList arrayList2 = rdVar2.J;
                qd qdVar2 = this.f24683c;
                arrayList2.remove(qdVar2);
                rdVar2.K.l(qdVar2.f26078a);
                if (arrayList2.isEmpty()) {
                    rd.s();
                }
                ns.e().k(280, new Object[0]);
                return;
            default:
                rd rdVar3 = this.f24682b;
                ArrayList arrayList3 = rdVar3.J;
                qd qdVar3 = this.f24683c;
                arrayList3.remove(qdVar3);
                rdVar3.K.l(qdVar3.f26078a);
                if (arrayList3.isEmpty()) {
                    rd.s();
                }
                ns.e().k(280, new Object[0]);
                return;
        }
    }
}
