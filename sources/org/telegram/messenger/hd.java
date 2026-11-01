package org.telegram.messenger;

import java.util.ArrayList;
public final class hd implements Runnable {
    public final int f16044a;
    public final od f16045b;
    public final nd f16046c;

    public hd(od odVar, nd ndVar, int i10) {
        this.f16044a = i10;
        this.f16045b = odVar;
        this.f16046c = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f16044a) {
            case 0:
                od odVar = this.f16045b;
                ArrayList arrayList = odVar.I;
                nd ndVar = this.f16046c;
                arrayList.remove(ndVar);
                odVar.J.l(ndVar.f17282a);
                if (arrayList.isEmpty()) {
                    od.s();
                }
                at.e().k(280, new Object[0]);
                return;
            case 1:
                od odVar2 = this.f16045b;
                ArrayList arrayList2 = odVar2.I;
                nd ndVar2 = this.f16046c;
                arrayList2.remove(ndVar2);
                odVar2.J.l(ndVar2.f17282a);
                if (arrayList2.isEmpty()) {
                    od.s();
                }
                at.e().k(280, new Object[0]);
                return;
            default:
                od odVar3 = this.f16045b;
                ArrayList arrayList3 = odVar3.I;
                nd ndVar3 = this.f16046c;
                arrayList3.remove(ndVar3);
                odVar3.J.l(ndVar3.f17282a);
                if (arrayList3.isEmpty()) {
                    od.s();
                }
                at.e().k(280, new Object[0]);
                return;
        }
    }
}
