package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f12675a;
    public final s f12676b;

    public h(s sVar, int i7) {
        this.f12675a = i7;
        this.f12676b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = this.f12675a;
        s sVar = this.f12676b;
        switch (i7) {
            case 0:
                if ((sVar.f12717j0 & 1) != 0) {
                    sVar.k(0);
                }
                if ((sVar.f12717j0 & 4096) != 0) {
                    sVar.k(108);
                }
                sVar.f12716i0 = false;
                sVar.f12717j0 = 0;
                return;
            default:
                sVar.F.showAtLocation(sVar.E, 55, 0, 0);
                l0 l0Var = sVar.H;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.J && (viewGroup = sVar.K) != null) {
                    WeakHashMap weakHashMap = i0.f55671a;
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
