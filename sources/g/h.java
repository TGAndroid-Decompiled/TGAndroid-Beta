package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f12143a;
    public final r f12144b;

    public h(r rVar, int i10) {
        this.f12143a = i10;
        this.f12144b = rVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f12143a;
        r rVar = this.f12144b;
        switch (i10) {
            case 0:
                if ((rVar.f12179i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.f12179i0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.f12178h0 = false;
                rVar.f12179i0 = 0;
                return;
            default:
                rVar.E.showAtLocation(rVar.f12191y, 55, 0, 0);
                l0 l0Var = rVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f47108a;
                    if (viewGroup.isLaidOut()) {
                        rVar.f12191y.setAlpha(0.0f);
                        l0 a2 = i0.a(rVar.f12191y);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                rVar.f12191y.setAlpha(1.0f);
                rVar.f12191y.setVisibility(0);
                return;
        }
    }
}
