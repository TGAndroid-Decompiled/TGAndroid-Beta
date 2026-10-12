package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.ej0;
public final class d implements Runnable {
    public final int f12333a;
    public final r f12334b;

    public d(r rVar, int i10) {
        this.f12333a = i10;
        this.f12334b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f12333a) {
            case 0:
                r rVar = this.f12334b;
                rVar.K(2147483646, true, 0, false, 0L);
                ej0 ej0Var = rVar.O;
                if (ej0Var != null) {
                    ej0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f12334b;
                rVar2.K(0, false, 0, false, 0L);
                ej0 ej0Var2 = rVar2.O;
                if (ej0Var2 != null) {
                    ej0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f12334b;
                if (!UserConfig.getInstance(rVar3.f12644n).isPremium()) {
                    new rg.y0(rVar3.f30570b.f24338f0, rVar3.getContext(), rVar3.f12644n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f12334b;
                c4 c4Var = rVar4.f12646s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f12645r.N3());
                    return;
                }
                return;
            default:
                this.f12334b.d0();
                return;
        }
    }
}
