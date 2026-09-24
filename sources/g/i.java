package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class i implements Runnable {
    public final int f9248a;
    public final s f9249b;

    public i(s sVar, int i10) {
        this.f9248a = i10;
        this.f9249b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f9248a;
        s sVar = this.f9249b;
        switch (i10) {
            case 0:
                if ((sVar.f9284i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.f9284i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.f9283h0 = false;
                sVar.f9284i0 = 0;
                return;
            default:
                sVar.E.showAtLocation(sVar.f9296y, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f42114a;
                    if (viewGroup.isLaidOut()) {
                        sVar.f9296y.setAlpha(0.0f);
                        l0 a2 = i0.a(sVar.f9296y);
                        a2.a(1.0f);
                        sVar.G = a2;
                        a2.d(new j(this, 0));
                        return;
                    }
                }
                sVar.f9296y.setAlpha(1.0f);
                sVar.f9296y.setVisibility(0);
                return;
        }
    }
}
