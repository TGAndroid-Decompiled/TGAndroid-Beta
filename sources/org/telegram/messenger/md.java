package org.telegram.messenger;

import java.util.ArrayList;
public final class md implements Runnable {
    public final int f25651a;
    public final qd f25652b;
    public final ArrayList f25653c;

    public md(qd qdVar, ArrayList arrayList, int i7) {
        this.f25651a = i7;
        this.f25652b = qdVar;
        this.f25653c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25651a) {
            case 0:
                qd qdVar = this.f25652b;
                ArrayList arrayList = qdVar.f26492b;
                ArrayList arrayList2 = this.f25653c;
                arrayList.addAll(arrayList2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    pd pdVar = (pd) arrayList.get(i7);
                    qdVar.f26491a.k(pdVar, pdVar.f26319a);
                }
                g0.g3(new md(qdVar, arrayList2, 1));
                return;
            default:
                qd qdVar2 = this.f25652b;
                ArrayList arrayList3 = qdVar2.J;
                ArrayList arrayList4 = this.f25653c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    pd pdVar2 = (pd) arrayList4.get(i10);
                    qdVar2.K.k(pdVar2, pdVar2.f26319a);
                }
                qd.q();
                ks.e().k(283, new Object[0]);
                return;
        }
    }
}
