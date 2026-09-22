package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.dj0;
public final class d implements Runnable {
    public final int f11294a;
    public final r f11295b;

    public d(r rVar, int i10) {
        this.f11294a = i10;
        this.f11295b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f11294a) {
            case 0:
                r rVar = this.f11295b;
                rVar.I(2147483646, true, 0, false, 0L);
                dj0 dj0Var = rVar.O;
                if (dj0Var != null) {
                    dj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f11295b;
                rVar2.I(0, false, 0, false, 0L);
                dj0 dj0Var2 = rVar2.O;
                if (dj0Var2 != null) {
                    dj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f11295b;
                if (!UserConfig.getInstance(rVar3.f11591n).isPremium()) {
                    new rg.x0(rVar3.f26786b.f29096f0, rVar3.getContext(), rVar3.f11591n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f11295b;
                b4 b4Var = rVar4.f11593s;
                if (b4Var != null) {
                    b4Var.setSendEnabled(rVar4.f11592r.N3());
                    return;
                }
                return;
            default:
                this.f11295b.a0();
                return;
        }
    }
}
