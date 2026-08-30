package lh;

import org.telegram.messenger.MessagesStorage;
public final class j0 implements MessagesStorage.IntCallback {
    public final int f12634a;
    public final Object f12635b;

    public j0(Object obj, int i10) {
        this.f12634a = i10;
        this.f12635b = obj;
    }

    @Override
    public final void run(int i10) {
        mf.b bVar;
        mf.b bVar2;
        mf.b bVar3;
        switch (this.f12634a) {
            case 0:
                n0 n0Var = (n0) this.f12635b;
                n0Var.getClass();
                if (i10 == 0) {
                    bVar = mf.b.f13930a;
                } else {
                    bVar = mf.b.f13931b;
                }
                n0Var.U(mf.a.i(0L, bVar), true, false, true);
                n0Var.f12811a0.setText("");
                return;
            case 1:
                s0 s0Var = (s0) this.f12635b;
                s0Var.getClass();
                if (i10 == 0) {
                    bVar2 = mf.b.f13930a;
                } else {
                    bVar2 = mf.b.f13931b;
                }
                s0Var.q(mf.a.i(0L, bVar2), true, false, true);
                s0Var.h.setText("");
                return;
            default:
                k4 k4Var = (k4) this.f12635b;
                k4Var.getClass();
                if (i10 == 0) {
                    bVar3 = mf.b.f13930a;
                } else {
                    bVar3 = mf.b.f13931b;
                }
                k4Var.f12717q = bVar3;
                k4Var.a(true);
                return;
        }
    }
}
