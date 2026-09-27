package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class i implements Runnable {
    public final int f9253a;
    public final s f9254b;

    public i(s sVar, int i10) {
        this.f9253a = i10;
        this.f9254b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f9253a;
        s sVar = this.f9254b;
        switch (i10) {
            case 0:
                if ((sVar.f9289i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.f9289i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.f9288h0 = false;
                sVar.f9289i0 = 0;
                return;
            default:
                sVar.E.showAtLocation(sVar.f9301y, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f42173a;
                    if (viewGroup.isLaidOut()) {
                        sVar.f9301y.setAlpha(0.0f);
                        l0 a2 = i0.a(sVar.f9301y);
                        a2.a(1.0f);
                        sVar.G = a2;
                        a2.d(new j(this, 0));
                        return;
                    }
                }
                sVar.f9301y.setAlpha(1.0f);
                sVar.f9301y.setVisibility(0);
                return;
        }
    }
}
