package org.telegram.messenger;

import java.util.ArrayList;
public final class nd implements Runnable {
    public final int f24178a;
    public final sd f24179b;
    public final ArrayList f24180c;

    public nd(sd sdVar, ArrayList arrayList, int i7) {
        this.f24178a = i7;
        this.f24179b = sdVar;
        this.f24180c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f24178a) {
            case 0:
                sd sdVar = this.f24179b;
                ArrayList arrayList = sdVar.f25450b;
                ArrayList arrayList2 = this.f24180c;
                arrayList.addAll(arrayList2);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    rd rdVar = (rd) arrayList.get(i7);
                    sdVar.f25449a.k(rdVar, rdVar.f25273a);
                }
                g0.h3(new nd(sdVar, arrayList2, 1));
                return;
            default:
                sd sdVar2 = this.f24179b;
                ArrayList arrayList3 = sdVar2.I;
                ArrayList arrayList4 = this.f24180c;
                arrayList3.addAll(arrayList4);
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    rd rdVar2 = (rd) arrayList4.get(i10);
                    sdVar2.J.k(rdVar2, rdVar2.f25273a);
                }
                sd.q();
                qs.e().k(280, new Object[0]);
                return;
        }
    }
}
