package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f12984a;
    public final s f12985b;

    public h(s sVar, int i7) {
        this.f12984a = i7;
        this.f12985b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = this.f12984a;
        s sVar = this.f12985b;
        switch (i7) {
            case 0:
                if ((sVar.f13026j0 & 1) != 0) {
                    sVar.l(0);
                }
                if ((sVar.f13026j0 & 4096) != 0) {
                    sVar.l(108);
                }
                sVar.f13025i0 = false;
                sVar.f13026j0 = 0;
                return;
            default:
                sVar.F.showAtLocation(sVar.E, 55, 0, 0);
                l0 l0Var = sVar.H;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.J && (viewGroup = sVar.K) != null) {
                    WeakHashMap weakHashMap = i0.f56254a;
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
