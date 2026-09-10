package hi;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.cj0;
public final class e implements Runnable {
    public final int f9531a;
    public final s f9532b;

    public e(s sVar, int i10) {
        this.f9531a = i10;
        this.f9532b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f9531a) {
            case 0:
                s sVar = this.f9532b;
                sVar.I(2147483646, true, 0, false, 0L);
                cj0 cj0Var = sVar.O;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    sVar.O = null;
                    return;
                }
                return;
            case 1:
                s sVar2 = this.f9532b;
                sVar2.I(0, false, 0, false, 0L);
                cj0 cj0Var2 = sVar2.O;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    sVar2.O = null;
                    return;
                }
                return;
            case 2:
                s sVar3 = this.f9532b;
                if (!UserConfig.getInstance(sVar3.f9834n).isPremium()) {
                    new qg.a1(sVar3.f26422b.f29366f0, sVar3.getContext(), sVar3.f9834n, 43, true).show();
                    return;
                }
                return;
            case 3:
                s sVar4 = this.f9532b;
                e4 e4Var = sVar4.f9836s;
                if (e4Var != null) {
                    e4Var.setSendEnabled(sVar4.f9835r.L3());
                    return;
                }
                return;
            default:
                this.f9532b.a0();
                return;
        }
    }
}
