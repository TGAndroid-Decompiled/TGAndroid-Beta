package oi;

import org.telegram.messenger.m10;
import org.telegram.ui.bg0;
public final class d implements Runnable {
    public final int f21624a;
    public final o f21625b;

    public d(o oVar, int i7) {
        this.f21624a = i7;
        this.f21625b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f21624a) {
            case 0:
                o oVar = this.f21625b;
                oVar.M(true, 2147483646, 0, 0L, false);
                bg0 bg0Var = oVar.P;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    oVar.P = null;
                    return;
                }
                return;
            case 1:
                o oVar2 = this.f21625b;
                oVar2.M(false, 0, 0, 0L, false);
                bg0 bg0Var2 = oVar2.P;
                if (bg0Var2 != null) {
                    bg0Var2.h(true);
                    oVar2.P = null;
                    return;
                }
                return;
            case 2:
                o oVar3 = this.f21625b;
                if (!m10.i(oVar3.f21847n).q()) {
                    new ug.x0(oVar3.f33609b.f36424a2, oVar3.getContext(), oVar3.f21847n, 43, true).show();
                    return;
                }
                return;
            case 3:
                o oVar4 = this.f21625b;
                v3 v3Var = oVar4.f21849s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(oVar4.f21848r.P3());
                    return;
                }
                return;
            default:
                this.f21625b.f0();
                return;
        }
    }
}
