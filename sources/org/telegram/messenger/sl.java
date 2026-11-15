package org.telegram.messenger;
public final class sl implements Runnable {
    public final int f26533a;
    public final np f26534b;
    public final bg.u f26535c;

    public sl(np npVar, bg.u uVar, int i7) {
        this.f26533a = i7;
        this.f26534b = npVar;
        this.f26535c = uVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26533a;
        bg.u uVar = this.f26535c;
        np npVar = this.f26534b;
        switch (i7) {
            case 0:
                a0.h hVar = uVar.f3334c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    npVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                return;
            case 1:
                a0.h hVar2 = uVar.f3334c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    npVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                return;
            default:
                a0.h hVar3 = uVar.f3334c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i12 = 0; i12 < m12; i12++) {
                        npVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i12)), hVar3.n(i12), Boolean.FALSE, 0);
                    }
                    return;
                }
                return;
        }
    }
}
