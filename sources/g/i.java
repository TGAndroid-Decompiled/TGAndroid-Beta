package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class i implements Runnable {
    public final int f8394a;
    public final s f8395b;

    public i(s sVar, int i10) {
        this.f8394a = i10;
        this.f8395b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f8394a;
        s sVar = this.f8395b;
        switch (i10) {
            case 0:
                if ((sVar.f8430i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.f8430i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.f8429h0 = false;
                sVar.f8430i0 = 0;
                return;
            default:
                sVar.E.showAtLocation(sVar.f8442y, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f41062a;
                    if (viewGroup.isLaidOut()) {
                        sVar.f8442y.setAlpha(0.0f);
                        l0 a2 = i0.a(sVar.f8442y);
                        a2.a(1.0f);
                        sVar.G = a2;
                        a2.d(new j(this, 0));
                        return;
                    }
                }
                sVar.f8442y.setAlpha(1.0f);
                sVar.f8442y.setVisibility(0);
                return;
        }
    }
}
