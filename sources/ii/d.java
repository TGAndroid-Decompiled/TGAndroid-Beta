package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.yi0;
public final class d implements Runnable {
    public final int f11287a;
    public final r f11288b;

    public d(r rVar, int i10) {
        this.f11287a = i10;
        this.f11288b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f11287a) {
            case 0:
                r rVar = this.f11288b;
                rVar.I(2147483646, true, 0, false, 0L);
                yi0 yi0Var = rVar.O;
                if (yi0Var != null) {
                    yi0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f11288b;
                rVar2.I(0, false, 0, false, 0L);
                yi0 yi0Var2 = rVar2.O;
                if (yi0Var2 != null) {
                    yi0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f11288b;
                if (!UserConfig.getInstance(rVar3.f11574n).isPremium()) {
                    new rg.x0(rVar3.f27104b.f29962f0, rVar3.getContext(), rVar3.f11574n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f11288b;
                c4 c4Var = rVar4.f11576s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f11575r.N3());
                    return;
                }
                return;
            default:
                this.f11288b.a0();
                return;
        }
    }
}
