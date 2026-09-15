package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.bj0;
public final class d implements Runnable {
    public final int f11290a;
    public final r f11291b;

    public d(r rVar, int i10) {
        this.f11290a = i10;
        this.f11291b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f11290a) {
            case 0:
                r rVar = this.f11291b;
                rVar.I(2147483646, true, 0, false, 0L);
                bj0 bj0Var = rVar.O;
                if (bj0Var != null) {
                    bj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f11291b;
                rVar2.I(0, false, 0, false, 0L);
                bj0 bj0Var2 = rVar2.O;
                if (bj0Var2 != null) {
                    bj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f11291b;
                if (!UserConfig.getInstance(rVar3.f11587n).isPremium()) {
                    new rg.x0(rVar3.f26462b.f28750f0, rVar3.getContext(), rVar3.f11587n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f11291b;
                b4 b4Var = rVar4.f11589s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(rVar4.f11588r.M3());
                    return;
                }
                return;
            default:
                this.f11291b.a0();
                return;
        }
    }
}
