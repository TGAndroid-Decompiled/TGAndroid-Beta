package org.telegram.messenger;

import java.util.ArrayList;
public final class jd implements Runnable {
    public final int f16264a;
    public final nd f16265b;
    public final ArrayList f16266c;

    public jd(nd ndVar, ArrayList arrayList, int i10) {
        this.f16264a = i10;
        this.f16265b = ndVar;
        this.f16266c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16264a) {
            case 0:
                nd ndVar = this.f16265b;
                ArrayList arrayList = ndVar.f17083b;
                ArrayList arrayList2 = this.f16266c;
                arrayList.addAll(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    md mdVar = (md) arrayList.get(i10);
                    ndVar.f17082a.k(mdVar, mdVar.f16940a);
                }
                i0.g3(new jd(ndVar, arrayList2, 1));
                return;
            default:
                nd ndVar2 = this.f16265b;
                ArrayList arrayList3 = ndVar2.I;
                ArrayList arrayList4 = this.f16266c;
                arrayList3.addAll(arrayList4);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    md mdVar2 = (md) arrayList4.get(i11);
                    ndVar2.J.k(mdVar2, mdVar2.f16940a);
                }
                nd.q();
                zs.e().k(280, new Object[0]);
                return;
        }
    }
}
