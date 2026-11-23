package org.telegram.messenger;

import java.util.ArrayList;
public final class kd implements Runnable {
    public final int f25020a;
    public final rd f25021b;
    public final qd f25022c;

    public kd(rd rdVar, qd qdVar, int i7) {
        this.f25020a = i7;
        this.f25021b = rdVar;
        this.f25022c = qdVar;
    }

    @Override
    public final void run() {
        switch (this.f25020a) {
            case 0:
                rd rdVar = this.f25021b;
                ArrayList arrayList = rdVar.J;
                qd qdVar = this.f25022c;
                arrayList.remove(qdVar);
                rdVar.K.l(qdVar.f26398a);
                if (arrayList.isEmpty()) {
                    rd.s();
                }
                ls.e().k(283, new Object[0]);
                return;
            case 1:
                rd rdVar2 = this.f25021b;
                ArrayList arrayList2 = rdVar2.J;
                qd qdVar2 = this.f25022c;
                arrayList2.remove(qdVar2);
                rdVar2.K.l(qdVar2.f26398a);
                if (arrayList2.isEmpty()) {
                    rd.s();
                }
                ls.e().k(283, new Object[0]);
                return;
            default:
                rd rdVar3 = this.f25021b;
                ArrayList arrayList3 = rdVar3.J;
                qd qdVar3 = this.f25022c;
                arrayList3.remove(qdVar3);
                rdVar3.K.l(qdVar3.f26398a);
                if (arrayList3.isEmpty()) {
                    rd.s();
                }
                ls.e().k(283, new Object[0]);
                return;
        }
    }
}
