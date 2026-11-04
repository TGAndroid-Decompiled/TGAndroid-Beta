package org.telegram.messenger;
public final class ll implements Runnable {
    public final int f24073a;
    public final hp f24074b;
    public final cg.t f24075c;

    public ll(hp hpVar, cg.t tVar, int i3) {
        this.f24073a = i3;
        this.f24074b = hpVar;
        this.f24075c = tVar;
    }

    @Override
    public final void run() {
        int i3 = this.f24073a;
        cg.t tVar = this.f24075c;
        hp hpVar = this.f24074b;
        switch (i3) {
            case 0:
                a0.h hVar = tVar.f4740c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    hpVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                return;
            case 1:
                a0.h hVar2 = tVar.f4740c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    hpVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                return;
            default:
                a0.h hVar3 = tVar.f4740c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i12 = 0; i12 < m12; i12++) {
                        hpVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i12)), hVar3.n(i12), Boolean.FALSE, 0);
                    }
                    return;
                }
                return;
        }
    }
}
