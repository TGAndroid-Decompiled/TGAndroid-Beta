package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f18275a;
    public final wp f18276b;
    public final rf.q f18277c;

    public tl(wp wpVar, rf.q qVar, int i10) {
        this.f18275a = i10;
        this.f18276b = wpVar;
        this.f18277c = qVar;
    }

    @Override
    public final void run() {
        int i10 = this.f18275a;
        rf.q qVar = this.f18277c;
        wp wpVar = this.f18276b;
        switch (i10) {
            case 0:
                a0.h hVar = qVar.f46561c;
                int m10 = hVar.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    wpVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i11)), hVar.n(i11), Boolean.FALSE);
                }
                return;
            case 1:
                a0.h hVar2 = qVar.f46561c;
                int m11 = hVar2.m();
                for (int i12 = 0; i12 < m11; i12++) {
                    wpVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i12)), hVar2.n(i12), Boolean.FALSE);
                }
                return;
            default:
                a0.h hVar3 = qVar.f46561c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i13 = 0; i13 < m12; i13++) {
                        wpVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i13)), hVar3.n(i13), Boolean.FALSE, 0);
                    }
                    return;
                }
                return;
        }
    }
}
