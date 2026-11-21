package org.telegram.messenger;
public final class pl implements Runnable {
    public final int f26288a;
    public final mp f26289b;
    public final bg.v f26290c;

    public pl(mp mpVar, bg.v vVar, int i7) {
        this.f26288a = i7;
        this.f26289b = mpVar;
        this.f26290c = vVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26288a;
        bg.v vVar = this.f26290c;
        mp mpVar = this.f26289b;
        switch (i7) {
            case 0:
                a0.h hVar = vVar.f3354c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    mpVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                return;
            case 1:
                a0.h hVar2 = vVar.f3354c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    mpVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                return;
            default:
                a0.h hVar3 = vVar.f3354c;
                if (!hVar3.i()) {
                    int m12 = hVar3.m();
                    for (int i12 = 0; i12 < m12; i12++) {
                        mpVar.getNotificationCenter().k(1, Long.valueOf(hVar3.j(i12)), hVar3.n(i12), Boolean.FALSE, 0);
                    }
                    return;
                }
                return;
        }
    }
}
