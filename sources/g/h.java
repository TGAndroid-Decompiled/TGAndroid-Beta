package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f10678a;
    public final r f10679b;

    public h(r rVar, int i10) {
        this.f10678a = i10;
        this.f10679b = rVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f10678a;
        r rVar = this.f10679b;
        switch (i10) {
            case 0:
                if ((rVar.f10714i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.f10714i0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.f10713h0 = false;
                rVar.f10714i0 = 0;
                return;
            default:
                rVar.E.showAtLocation(rVar.f10726y, 55, 0, 0);
                l0 l0Var = rVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f44816a;
                    if (viewGroup.isLaidOut()) {
                        rVar.f10726y.setAlpha(0.0f);
                        l0 a2 = i0.a(rVar.f10726y);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                rVar.f10726y.setAlpha(1.0f);
                rVar.f10726y.setVisibility(0);
                return;
        }
    }
}
