package org.telegram.messenger;

import java.util.ArrayList;
public final class gd implements Runnable {
    public final int f15695a;
    public final nd f15696b;
    public final md f15697c;

    public gd(nd ndVar, md mdVar, int i10) {
        this.f15695a = i10;
        this.f15696b = ndVar;
        this.f15697c = mdVar;
    }

    @Override
    public final void run() {
        switch (this.f15695a) {
            case 0:
                nd ndVar = this.f15696b;
                ArrayList arrayList = ndVar.I;
                md mdVar = this.f15697c;
                arrayList.remove(mdVar);
                ndVar.J.l(mdVar.f16940a);
                if (arrayList.isEmpty()) {
                    nd.s();
                }
                zs.e().k(280, new Object[0]);
                return;
            case 1:
                nd ndVar2 = this.f15696b;
                ArrayList arrayList2 = ndVar2.I;
                md mdVar2 = this.f15697c;
                arrayList2.remove(mdVar2);
                ndVar2.J.l(mdVar2.f16940a);
                if (arrayList2.isEmpty()) {
                    nd.s();
                }
                zs.e().k(280, new Object[0]);
                return;
            default:
                nd ndVar3 = this.f15696b;
                ArrayList arrayList3 = ndVar3.I;
                md mdVar3 = this.f15697c;
                arrayList3.remove(mdVar3);
                ndVar3.J.l(mdVar3.f16940a);
                if (arrayList3.isEmpty()) {
                    nd.s();
                }
                zs.e().k(280, new Object[0]);
                return;
        }
    }
}
