package jh;

import org.telegram.messenger.MessagesStorage;
public final class j0 implements MessagesStorage.IntCallback {
    public final int f12280a;
    public final Object f12281b;

    public j0(Object obj, int i10) {
        this.f12280a = i10;
        this.f12281b = obj;
    }

    @Override
    public final void run(int i10) {
        kf.b bVar;
        kf.b bVar2;
        kf.b bVar3;
        switch (this.f12280a) {
            case 0:
                n0 n0Var = (n0) this.f12281b;
                n0Var.getClass();
                if (i10 == 0) {
                    bVar = kf.b.f13635a;
                } else {
                    bVar = kf.b.f13636b;
                }
                n0Var.U(kf.a.i(0L, bVar), true, false, true);
                n0Var.Z.setText("");
                return;
            case 1:
                s0 s0Var = (s0) this.f12281b;
                s0Var.getClass();
                if (i10 == 0) {
                    bVar2 = kf.b.f13635a;
                } else {
                    bVar2 = kf.b.f13636b;
                }
                s0Var.q(kf.a.i(0L, bVar2), true, false, true);
                s0Var.h.setText("");
                return;
            default:
                l4 l4Var = (l4) this.f12281b;
                l4Var.getClass();
                if (i10 == 0) {
                    bVar3 = kf.b.f13635a;
                } else {
                    bVar3 = kf.b.f13636b;
                }
                l4Var.f12427q = bVar3;
                l4Var.a(true);
                return;
        }
    }
}
