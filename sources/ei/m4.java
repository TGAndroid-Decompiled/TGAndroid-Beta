package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wi;
public final class m4 implements o1.f {
    public final int f8476a;
    public final Object f8477b;
    public final Object f8478c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8476a = i10;
        this.f8477b = obj;
        this.f8478c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8476a) {
            case 0:
                p4 p4Var = (p4) this.f8477b;
                Runnable runnable = (Runnable) this.f8478c;
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
                        boolean z11 = p4Var.f8539s;
                        p4Var.f8539s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8539s = z11;
                    }
                    p4Var.f8537n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f8478c;
                ((ub) this.f8477b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                wi.u((wi) this.f8477b, (org.telegram.messenger.video.o) this.f8478c);
                return;
            case 3:
                wi wiVar = (wi) ((ei) this.f8477b).d;
                wiVar.f30026z0.setTranslationY(0.0f);
                wiVar.f30026z0.k(wiVar.f29981l2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) wiVar).containerView;
                viewGroup.invalidate();
                ((hh) this.f8478c).run();
                wiVar.X1(0);
                return;
            default:
                ce0 ce0Var = (ce0) this.f8477b;
                nc0 nc0Var = (nc0) this.f8478c;
                LinkedList linkedList = ce0Var.M;
                ce0Var.L = null;
                nc0Var.D = null;
                nc0Var.z();
                if (!z10) {
                    nc0Var.h = 1.0f;
                    nc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ce0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
