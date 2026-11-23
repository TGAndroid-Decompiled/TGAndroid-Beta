package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f26433a;
    public final np f26434b;
    public final bg.v f26435c;

    public ql(np npVar, bg.v vVar, int i7) {
        this.f26433a = i7;
        this.f26434b = npVar;
        this.f26435c = vVar;
    }

    @Override
    public final void run() {
        int i7 = this.f26433a;
        bg.v vVar = this.f26435c;
        np npVar = this.f26434b;
        switch (i7) {
            case 0:
                a0.h hVar = vVar.f3312c;
                int m10 = hVar.m();
                for (int i10 = 0; i10 < m10; i10++) {
                    npVar.getNotificationCenter().k(49, Long.valueOf(hVar.j(i10)), hVar.n(i10), Boolean.FALSE);
                }
                return;
            case 1:
                a0.h hVar2 = vVar.f3312c;
                int m11 = hVar2.m();
                for (int i11 = 0; i11 < m11; i11++) {
                    npVar.getNotificationCenter().k(49, Long.valueOf(hVar2.j(i11)), hVar2.n(i11), Boolean.FALSE);
                }
                return;
            default:
                a0.h hVar3 = vVar.f3312c;
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
