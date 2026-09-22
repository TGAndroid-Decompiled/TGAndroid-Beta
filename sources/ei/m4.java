package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.vi;
public final class m4 implements o1.f {
    public final int f8491a;
    public final Object f8492b;
    public final Object f8493c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8491a = i10;
        this.f8492b = obj;
        this.f8493c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8491a) {
            case 0:
                p4 p4Var = (p4) this.f8492b;
                Runnable runnable = (Runnable) this.f8493c;
                if (hVar == p4Var.G) {
                    p4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = p4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = p4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = p4Var.f8553s;
                        p4Var.f8553s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8553s = z11;
                    }
                    p4Var.f8551n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                og ogVar = (og) this.f8493c;
                ((tb) this.f8492b).setInOutOffset(0.0f);
                if (!z10) {
                    ogVar.run();
                    return;
                }
                return;
            case 2:
                vi.r((vi) this.f8492b, (org.telegram.messenger.video.o) this.f8493c);
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f8492b).d;
                viVar.f29160z0.setTranslationY(0.0f);
                viVar.f29160z0.k(viVar.f29115l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f8493c).run();
                viVar.a2(0);
                return;
            default:
                de0 de0Var = (de0) this.f8492b;
                nc0 nc0Var = (nc0) this.f8493c;
                LinkedList linkedList = de0Var.M;
                de0Var.L = null;
                nc0Var.D = null;
                nc0Var.z();
                if (!z10) {
                    nc0Var.h = 1.0f;
                    nc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        de0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
