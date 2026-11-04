package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f11709a;
    public final s f11710b;

    public h(s sVar, int i3) {
        this.f11709a = i3;
        this.f11710b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i3 = this.f11709a;
        s sVar = this.f11710b;
        switch (i3) {
            case 0:
                if ((sVar.f11751j0 & 1) != 0) {
                    sVar.k(0);
                }
                if ((sVar.f11751j0 & 4096) != 0) {
                    sVar.k(108);
                }
                sVar.f11750i0 = false;
                sVar.f11751j0 = 0;
                return;
            default:
                sVar.F.showAtLocation(sVar.E, 55, 0, 0);
                l0 l0Var = sVar.H;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.J && (viewGroup = sVar.K) != null) {
                    WeakHashMap weakHashMap = i0.f54015a;
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
