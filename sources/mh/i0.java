package mh;

import org.telegram.messenger.MessagesStorage;
public final class i0 implements MessagesStorage.IntCallback {
    public final int f14200a;
    public final Object f14201b;

    public i0(Object obj, int i10) {
        this.f14200a = i10;
        this.f14201b = obj;
    }

    @Override
    public final void run(int i10) {
        mf.b bVar;
        mf.b bVar2;
        mf.b bVar3;
        switch (this.f14200a) {
            case 0:
                m0 m0Var = (m0) this.f14201b;
                m0Var.getClass();
                if (i10 == 0) {
                    bVar = mf.b.f13653a;
                } else {
                    bVar = mf.b.f13654b;
                }
                m0Var.U(mf.a.i(0L, bVar), true, false, true);
                m0Var.f14424a0.setText("");
                return;
            case 1:
                r0 r0Var = (r0) this.f14201b;
                r0Var.getClass();
                if (i10 == 0) {
                    bVar2 = mf.b.f13653a;
                } else {
                    bVar2 = mf.b.f13654b;
                }
                r0Var.q(mf.a.i(0L, bVar2), true, false, true);
                r0Var.h.setText("");
                return;
            default:
                k4 k4Var = (k4) this.f14201b;
                k4Var.getClass();
                if (i10 == 0) {
                    bVar3 = mf.b.f13653a;
                } else {
                    bVar3 = mf.b.f13654b;
                }
                k4Var.f14349q = bVar3;
                k4Var.a(true);
                return;
        }
    }
}
