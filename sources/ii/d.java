package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.dj0;
public final class d implements Runnable {
    public final int f12337a;
    public final r f12338b;

    public d(r rVar, int i10) {
        this.f12337a = i10;
        this.f12338b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f12337a) {
            case 0:
                r rVar = this.f12338b;
                rVar.K(2147483646, true, 0, false, 0L);
                dj0 dj0Var = rVar.O;
                if (dj0Var != null) {
                    dj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f12338b;
                rVar2.K(0, false, 0, false, 0L);
                dj0 dj0Var2 = rVar2.O;
                if (dj0Var2 != null) {
                    dj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f12338b;
                if (!UserConfig.getInstance(rVar3.f12649n).isPremium()) {
                    new rg.y0(rVar3.f30211b.f33235f0, rVar3.getContext(), rVar3.f12649n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f12338b;
                c4 c4Var = rVar4.f12651s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f12650r.N3());
                    return;
                }
                return;
            default:
                this.f12338b.d0();
                return;
        }
    }
}
