package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.i0;
import r0.l0;
public final class h implements Runnable {
    public final int f13325a;
    public final s f13326b;

    public h(s sVar, int i7) {
        this.f13325a = i7;
        this.f13326b = sVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i7 = this.f13325a;
        s sVar = this.f13326b;
        switch (i7) {
            case 0:
                if ((sVar.f13366i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.f13366i0 & 4096) != 0) {
                    sVar.j(108);
                }
                sVar.f13365h0 = false;
                sVar.f13366i0 = 0;
                return;
            default:
                sVar.E.showAtLocation(sVar.D, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.f54190a;
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
