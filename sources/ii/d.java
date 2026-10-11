package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.cj0;
public final class d implements Runnable {
    public final int f12336a;
    public final r f12337b;

    public d(r rVar, int i10) {
        this.f12336a = i10;
        this.f12337b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f12336a) {
            case 0:
                r rVar = this.f12337b;
                rVar.K(2147483646, true, 0, false, 0L);
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f12337b;
                rVar2.K(0, false, 0, false, 0L);
                cj0 cj0Var2 = rVar2.O;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f12337b;
                if (!UserConfig.getInstance(rVar3.f12648n).isPremium()) {
                    new rg.y0(rVar3.f30245b.f33289f0, rVar3.getContext(), rVar3.f12648n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f12337b;
                c4 c4Var = rVar4.f12650s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f12649r.N3());
                    return;
                }
                return;
            default:
                this.f12337b.d0();
                return;
        }
    }
}
