package org.telegram.messenger;

import java.util.ArrayList;
public final class kd implements Runnable {
    public final int f23675a;
    public final sd f23676b;
    public final rd f23677c;

    public kd(sd sdVar, rd rdVar, int i7) {
        this.f23675a = i7;
        this.f23676b = sdVar;
        this.f23677c = rdVar;
    }

    @Override
    public final void run() {
        switch (this.f23675a) {
            case 0:
                sd sdVar = this.f23676b;
                ArrayList arrayList = sdVar.I;
                rd rdVar = this.f23677c;
                arrayList.remove(rdVar);
                sdVar.J.l(rdVar.f25273a);
                if (arrayList.isEmpty()) {
                    sd.s();
                }
                qs.e().k(280, new Object[0]);
                return;
            case 1:
                sd sdVar2 = this.f23676b;
                ArrayList arrayList2 = sdVar2.I;
                rd rdVar2 = this.f23677c;
                arrayList2.remove(rdVar2);
                sdVar2.J.l(rdVar2.f25273a);
                if (arrayList2.isEmpty()) {
                    sd.s();
                }
                qs.e().k(280, new Object[0]);
                return;
            default:
                sd sdVar3 = this.f23676b;
                ArrayList arrayList3 = sdVar3.I;
                rd rdVar3 = this.f23677c;
                arrayList3.remove(rdVar3);
                sdVar3.J.l(rdVar3.f25273a);
                if (arrayList3.isEmpty()) {
                    sd.s();
                }
                qs.e().k(280, new Object[0]);
                return;
        }
    }
}
