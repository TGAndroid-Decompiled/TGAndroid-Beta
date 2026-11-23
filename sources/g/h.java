package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f12983a;
    public final s f12984b;

    public h(s sVar, int i7) {
        this.f12983a = i7;
        this.f12984b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = this.f12983a;
        s sVar = this.f12984b;
        switch (i7) {
            case 0:
                if ((sVar.f13025j0 & 1) != 0) {
                    sVar.k(0);
                }
                if ((sVar.f13025j0 & 4096) != 0) {
                    sVar.k(108);
                }
                sVar.f13024i0 = false;
                sVar.f13025j0 = 0;
                return;
            default:
                sVar.F.showAtLocation(sVar.E, 55, 0, 0);
                l0 l0Var = sVar.H;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.J && (viewGroup = sVar.K) != null) {
                    WeakHashMap weakHashMap = i0.f56367a;
                    if (viewGroup.isLaidOut()) {
                        sVar.E.setAlpha(0.0f);
                        l0 a10 = i0.a(sVar.E);
                        a10.a(1.0f);
                        sVar.H = a10;
                        a10.d(new j(this, 0));
                        return;
                    }
                }
                sVar.E.setAlpha(1.0f);
                sVar.E.setVisibility(0);
                return;
        }
    }
}
