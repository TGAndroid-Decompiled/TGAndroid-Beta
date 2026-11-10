package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f13327a;
    public final s f13328b;

    public h(s sVar, int i7) {
        this.f13327a = i7;
        this.f13328b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = this.f13327a;
        s sVar = this.f13328b;
        switch (i7) {
            case 0:
                if ((sVar.f13368i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.f13368i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.f13367h0 = false;
                sVar.f13368i0 = 0;
                return;
            default:
                sVar.E.showAtLocation(sVar.D, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f54202a;
                    if (viewGroup.isLaidOut()) {
                        sVar.D.setAlpha(0.0f);
                        l0 a10 = i0.a(sVar.D);
                        a10.a(1.0f);
                        sVar.G = a10;
                        a10.d(new j(this, 0));
                        return;
                    }
                }
                sVar.D.setAlpha(1.0f);
                sVar.D.setVisibility(0);
                return;
        }
    }
}
