package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f10136a;
    public final r f10137b;

    public h(r rVar, int i10) {
        this.f10136a = i10;
        this.f10137b = rVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f10136a;
        r rVar = this.f10137b;
        switch (i10) {
            case 0:
                if ((rVar.f10176i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.f10176i0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.f10175h0 = false;
                rVar.f10176i0 = 0;
                return;
            default:
                rVar.E.showAtLocation(rVar.f10188y, 55, 0, 0);
                l0 l0Var = rVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f46856a;
                    if (viewGroup.isLaidOut()) {
                        rVar.f10188y.setAlpha(0.0f);
                        l0 a2 = i0.a(rVar.f10188y);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                rVar.f10188y.setAlpha(1.0f);
                rVar.f10188y.setVisibility(0);
                return;
        }
    }
}
