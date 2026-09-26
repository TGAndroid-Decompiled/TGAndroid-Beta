package ii;

import org.telegram.messenger.UserConfig;
import org.telegram.ui.vi0;
public final class d implements Runnable {
    public final int f11284a;
    public final r f11285b;

    public d(r rVar, int i10) {
        this.f11284a = i10;
        this.f11285b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f11284a) {
            case 0:
                r rVar = this.f11285b;
                rVar.I(2147483646, true, 0, false, 0L);
                vi0 vi0Var = rVar.O;
                if (vi0Var != null) {
                    vi0Var.h(false);
                    rVar.O = null;
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f11285b;
                rVar2.I(0, false, 0, false, 0L);
                vi0 vi0Var2 = rVar2.O;
                if (vi0Var2 != null) {
                    vi0Var2.h(true);
                    rVar2.O = null;
                    return;
                }
                return;
            case 2:
                r rVar3 = this.f11285b;
                if (!UserConfig.getInstance(rVar3.f11571n).isPremium()) {
                    new rg.x0(rVar3.f27087b.f30005f0, rVar3.getContext(), rVar3.f11571n, 43, true).show();
                    return;
                }
                return;
            case 3:
                r rVar4 = this.f11285b;
                c4 c4Var = rVar4.f11573s;
                if (c4Var != null) {
                    c4Var.setSendEnabled(rVar4.f11572r.M3());
                    return;
                }
                return;
            default:
                this.f11285b.a0();
                return;
        }
    }
}
