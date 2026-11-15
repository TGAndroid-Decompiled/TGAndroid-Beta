package org.telegram.messenger;

import java.util.ArrayList;
public final class nd implements Runnable {
    public final int f25184a;
    public final rd f25185b;
    public final ArrayList f25186c;

    public nd(rd rdVar, ArrayList arrayList, int i7) {
        this.f25184a = i7;
        this.f25185b = rdVar;
        this.f25186c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25184a) {
            case 0:
                rd rdVar = this.f25185b;
                ArrayList arrayList = rdVar.f26270b;
                ArrayList arrayList2 = this.f25186c;
                arrayList.addAll(arrayList2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    qd qdVar = (qd) arrayList.get(i7);
                    rdVar.f26269a.k(qdVar, qdVar.f26078a);
                }
                g0.h3(new nd(rdVar, arrayList2, 1));
                return;
            default:
                rd rdVar2 = this.f25185b;
                ArrayList arrayList3 = rdVar2.J;
                ArrayList arrayList4 = this.f25186c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    qd qdVar2 = (qd) arrayList4.get(i10);
                    rdVar2.K.k(qdVar2, qdVar2.f26078a);
                }
                rd.q();
                ns.e().k(280, new Object[0]);
                return;
        }
    }
}
