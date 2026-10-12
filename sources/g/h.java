package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;
public final class h implements Runnable {
    public final int f9768a;
    public final r f9769b;

    public h(r rVar, int i10) {
        this.f9768a = i10;
        this.f9769b = rVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f9768a;
        r rVar = this.f9769b;
        switch (i10) {
            case 0:
                if ((rVar.f9804i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.f9804i0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.f9803h0 = false;
                rVar.f9804i0 = 0;
                return;
            default:
                rVar.E.showAtLocation(rVar.f9816y, 55, 0, 0);
                m0 m0Var = rVar.G;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = j0.f43732a;
                    if (viewGroup.isLaidOut()) {
                        rVar.f9816y.setAlpha(0.0f);
                        m0 a2 = j0.a(rVar.f9816y);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                rVar.f9816y.setAlpha(1.0f);
                rVar.f9816y.setVisibility(0);
                return;
        }
    }
}
