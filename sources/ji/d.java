package ji;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.gj0;
public final class d implements Runnable {
    public final int f13193a;
    public final r f13194b;

    public d(r rVar, int i10) {
        this.f13193a = i10;
        this.f13194b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f13193a) {
            case 0:
                r rVar = this.f13194b;
                rVar.K(2147483646, true, 0, false, 0L);
                gj0 gj0Var = rVar.O;
                if (gj0Var != null) {
                    gj0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f13194b;
                rVar2.K(0, false, 0, false, 0L);
                gj0 gj0Var2 = rVar2.O;
                if (gj0Var2 != null) {
                    gj0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f13194b;
                if (!UserConfig.getInstance(rVar3.f13485n).isPremium()) {
                    new sg.y0(rVar3.f27360b.f29672f0, rVar3.getContext(), rVar3.f13485n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f13194b;
                c4 c4Var = rVar4.f13487s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f13486r.N3());
                    return;
                }
                return;
            default:
                this.f13194b.d0();
                return;
        }
    }
}
