package lh;

import org.telegram.messenger.MessagesStorage;
public final class j0 implements MessagesStorage.IntCallback {
    public final int f12618a;
    public final Object f12619b;

    public j0(Object obj, int i10) {
        this.f12618a = i10;
        this.f12619b = obj;
    }

    @Override
    public final void run(int i10) {
        lf.b bVar;
        lf.b bVar2;
        lf.b bVar3;
        switch (this.f12618a) {
            case 0:
                n0 n0Var = (n0) this.f12619b;
                n0Var.getClass();
                if (i10 == 0) {
                    bVar = lf.b.f12056a;
                } else {
                    bVar = lf.b.f12057b;
                }
                n0Var.U(lf.a.i(0L, bVar), true, false, true);
                n0Var.f12795a0.setText("");
                return;
            case 1:
                s0 s0Var = (s0) this.f12619b;
                s0Var.getClass();
                if (i10 == 0) {
                    bVar2 = lf.b.f12056a;
                } else {
                    bVar2 = lf.b.f12057b;
                }
                s0Var.q(lf.a.i(0L, bVar2), true, false, true);
                s0Var.h.setText("");
                return;
            default:
                k4 k4Var = (k4) this.f12619b;
                k4Var.getClass();
                if (i10 == 0) {
                    bVar3 = lf.b.f12056a;
                } else {
                    bVar3 = lf.b.f12057b;
                }
                k4Var.f12701q = bVar3;
                k4Var.a(true);
                return;
        }
    }
}
