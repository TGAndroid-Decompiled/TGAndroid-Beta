package org.telegram.messenger;

import java.util.ArrayList;
public final class hd implements Runnable {
    public final int f22915a;
    public final ld f22916b;
    public final ArrayList f22917c;

    public hd(ld ldVar, ArrayList arrayList, int i3) {
        this.f22915a = i3;
        this.f22916b = ldVar;
        this.f22917c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22915a) {
            case 0:
                ld ldVar = this.f22916b;
                ArrayList arrayList = ldVar.f23975b;
                ArrayList arrayList2 = this.f22917c;
                arrayList.addAll(arrayList2);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    kd kdVar = (kd) arrayList.get(i3);
                    ldVar.f23974a.k(kdVar, kdVar.f23810a);
                }
                g0.h3(new hd(ldVar, arrayList2, 1));
                return;
            default:
                ld ldVar2 = this.f22916b;
                ArrayList arrayList3 = ldVar2.J;
                ArrayList arrayList4 = this.f22917c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    kd kdVar2 = (kd) arrayList4.get(i10);
                    ldVar2.K.k(kdVar2, kdVar2.f23810a);
                }
                ld.q();
                hs.e().k(280, new Object[0]);
                return;
        }
    }
}
