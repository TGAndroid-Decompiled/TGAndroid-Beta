package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class i implements Runnable {
    public final int f10066a;
    public final s f10067b;

    public i(s sVar, int i10) {
        this.f10066a = i10;
        this.f10067b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f10066a;
        s sVar = this.f10067b;
        switch (i10) {
            case 0:
                if ((sVar.f10106i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.f10106i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.f10105h0 = false;
                sVar.f10106i0 = 0;
                return;
            default:
                sVar.E.showAtLocation(sVar.f10118y, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f45596a;
                    if (viewGroup.isLaidOut()) {
                        sVar.f10118y.setAlpha(0.0f);
                        l0 a2 = i0.a(sVar.f10118y);
                        a2.a(1.0f);
                        sVar.G = a2;
                        a2.d(new j(this, 0));
                        return;
                    }
                }
                sVar.f10118y.setAlpha(1.0f);
                sVar.f10118y.setVisibility(0);
                return;
        }
    }
}
