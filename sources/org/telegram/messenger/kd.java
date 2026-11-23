package org.telegram.messenger;

import java.util.ArrayList;
public final class kd implements Runnable {
    public final int f25056a;
    public final rd f25057b;
    public final qd f25058c;

    public kd(rd rdVar, qd qdVar, int i7) {
        this.f25056a = i7;
        this.f25057b = rdVar;
        this.f25058c = qdVar;
    }

    @Override
    public final void run() {
        switch (this.f25056a) {
            case 0:
                rd rdVar = this.f25057b;
                ArrayList arrayList = rdVar.J;
                qd qdVar = this.f25058c;
                arrayList.remove(qdVar);
                rdVar.K.l(qdVar.f26434a);
                if (arrayList.isEmpty()) {
                    rd.s();
                }
                ls.e().k(283, new Object[0]);
                return;
            case 1:
                rd rdVar2 = this.f25057b;
                ArrayList arrayList2 = rdVar2.J;
                qd qdVar2 = this.f25058c;
                arrayList2.remove(qdVar2);
                rdVar2.K.l(qdVar2.f26434a);
                if (arrayList2.isEmpty()) {
                    rd.s();
                }
                ls.e().k(283, new Object[0]);
                return;
            default:
                rd rdVar3 = this.f25057b;
                ArrayList arrayList3 = rdVar3.J;
                qd qdVar3 = this.f25058c;
                arrayList3.remove(qdVar3);
                rdVar3.K.l(qdVar3.f26434a);
                if (arrayList3.isEmpty()) {
                    rd.s();
                }
                ls.e().k(283, new Object[0]);
                return;
        }
    }
}
