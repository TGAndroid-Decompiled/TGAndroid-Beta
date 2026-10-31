package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.h0;
import r0.k0;
public final class h implements Runnable {
    public final int f7196a;
    public final r f7197b;

    public h(r rVar, int i10) {
        this.f7196a = i10;
        this.f7197b = rVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f7196a;
        r rVar = this.f7197b;
        switch (i10) {
            case 0:
                if ((rVar.f7232i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.f7232i0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.f7231h0 = false;
                rVar.f7232i0 = 0;
                return;
            default:
                rVar.E.showAtLocation(rVar.D, 55, 0, 0);
                k0 k0Var = rVar.G;
                if (k0Var != null) {
                    k0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = h0.f46123a;
                    if (viewGroup.isLaidOut()) {
                        rVar.D.setAlpha(0.0f);
                        k0 a2 = h0.a(rVar.D);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                rVar.D.setAlpha(1.0f);
                rVar.D.setVisibility(0);
                return;
        }
    }
}
