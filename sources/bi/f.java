package bi;

import org.telegram.messenger.e20;
import org.telegram.ui.ih0;
public final class f implements Runnable {
    public final int f2987a;
    public final t f2988b;

    public f(t tVar, int i10) {
        this.f2987a = i10;
        this.f2988b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f2987a) {
            case 0:
                t tVar = this.f2988b;
                tVar.J(true, 2147483646, 0, 0L, false);
                ih0 ih0Var = tVar.O;
                if (ih0Var != null) {
                    ih0Var.g(false);
                    tVar.O = null;
                    return;
                }
                return;
            case 1:
                t tVar2 = this.f2988b;
                tVar2.J(false, 0, 0, 0L, false);
                ih0 ih0Var2 = tVar2.O;
                if (ih0Var2 != null) {
                    ih0Var2.g(true);
                    tVar2.O = null;
                    return;
                }
                return;
            case 2:
                t tVar3 = this.f2988b;
                if (!e20.i(tVar3.f3349n).q()) {
                    new kg.i1(tVar3.f30964b.W1, tVar3.getContext(), tVar3.f3349n, 43, true).show();
                    return;
                }
                return;
            case 3:
                t tVar4 = this.f2988b;
                i4 i4Var = tVar4.f3351s;
                if (i4Var != null) {
                    i4Var.setSendEnabled(tVar4.f3350r.P3());
                    return;
                }
                return;
            default:
                this.f2988b.d0();
                return;
        }
    }
}
