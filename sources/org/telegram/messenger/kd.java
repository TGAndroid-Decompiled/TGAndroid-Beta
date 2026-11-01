package org.telegram.messenger;

import java.util.ArrayList;
public final class kd implements Runnable {
    public final int f16617a;
    public final od f16618b;
    public final ArrayList f16619c;

    public kd(od odVar, ArrayList arrayList, int i10) {
        this.f16617a = i10;
        this.f16618b = odVar;
        this.f16619c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16617a) {
            case 0:
                od odVar = this.f16618b;
                ArrayList arrayList = odVar.f17420b;
                ArrayList arrayList2 = this.f16619c;
                arrayList.addAll(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    nd ndVar = (nd) arrayList.get(i10);
                    odVar.f17419a.k(ndVar, ndVar.f17282a);
                }
                i0.g3(new kd(odVar, arrayList2, 1));
                return;
            default:
                od odVar2 = this.f16618b;
                ArrayList arrayList3 = odVar2.I;
                ArrayList arrayList4 = this.f16619c;
                arrayList3.addAll(arrayList4);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    nd ndVar2 = (nd) arrayList4.get(i11);
                    odVar2.J.k(ndVar2, ndVar2.f17282a);
                }
                od.q();
                at.e().k(280, new Object[0]);
                return;
        }
    }
}
