package mh;

import org.telegram.messenger.MessagesStorage;
public final class i0 implements MessagesStorage.IntCallback {
    public final int f14198a;
    public final Object f14199b;

    public i0(Object obj, int i10) {
        this.f14198a = i10;
        this.f14199b = obj;
    }

    @Override
    public final void run(int i10) {
        mf.b bVar;
        mf.b bVar2;
        mf.b bVar3;
        switch (this.f14198a) {
            case 0:
                m0 m0Var = (m0) this.f14199b;
                m0Var.getClass();
                if (i10 == 0) {
                    bVar = mf.b.f13651a;
                } else {
                    bVar = mf.b.f13652b;
                }
                m0Var.U(mf.a.i(0L, bVar), true, false, true);
                m0Var.f14422a0.setText("");
                return;
            case 1:
                r0 r0Var = (r0) this.f14199b;
                r0Var.getClass();
                if (i10 == 0) {
                    bVar2 = mf.b.f13651a;
                } else {
                    bVar2 = mf.b.f13652b;
                }
                r0Var.q(mf.a.i(0L, bVar2), true, false, true);
                r0Var.h.setText("");
                return;
            default:
                k4 k4Var = (k4) this.f14199b;
                k4Var.getClass();
                if (i10 == 0) {
                    bVar3 = mf.b.f13651a;
                } else {
                    bVar3 = mf.b.f13652b;
                }
                k4Var.f14347q = bVar3;
                k4Var.a(true);
                return;
        }
    }
}
