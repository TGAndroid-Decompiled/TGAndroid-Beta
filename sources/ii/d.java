package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.dj0;
public final class d implements Runnable {
    public final int f11293a;
    public final r f11294b;

    public d(r rVar, int i10) {
        this.f11293a = i10;
        this.f11294b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f11293a) {
            case 0:
                r rVar = this.f11294b;
                rVar.I(2147483646, true, 0, false, 0L);
                dj0 dj0Var = rVar.O;
                if (dj0Var != null) {
                    dj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f11294b;
                rVar2.I(0, false, 0, false, 0L);
                dj0 dj0Var2 = rVar2.O;
                if (dj0Var2 != null) {
                    dj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f11294b;
                if (!UserConfig.getInstance(rVar3.f11590n).isPremium()) {
                    new rg.x0(rVar3.f26463b.f28745f0, rVar3.getContext(), rVar3.f11590n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f11294b;
                b4 b4Var = rVar4.f11592s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(rVar4.f11591r.N3());
                    return;
                }
                return;
            default:
                this.f11294b.a0();
                return;
        }
    }
}
