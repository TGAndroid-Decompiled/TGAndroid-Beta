package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.zi0;
public final class d implements Runnable {
    public final int f12289a;
    public final r f12290b;

    public d(r rVar, int i10) {
        this.f12289a = i10;
        this.f12290b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f12289a) {
            case 0:
                r rVar = this.f12290b;
                rVar.G(2147483646, true, 0, false, 0L);
                zi0 zi0Var = rVar.O;
                if (zi0Var != null) {
                    zi0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f12290b;
                rVar2.G(0, false, 0, false, 0L);
                zi0 zi0Var2 = rVar2.O;
                if (zi0Var2 != null) {
                    zi0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f12290b;
                if (!UserConfig.getInstance(rVar3.f12602n).isPremium()) {
                    new rg.y0(rVar3.f29741b.f32910f0, rVar3.getContext(), rVar3.f12602n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f12290b;
                c4 c4Var = rVar4.f12604s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f12603r.N3());
                    return;
                }
                return;
            default:
                this.f12290b.Z();
                return;
        }
    }
}
