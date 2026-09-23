package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wi;
public final class m4 implements o1.f {
    public final int f8475a;
    public final Object f8476b;
    public final Object f8477c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8475a = i10;
        this.f8476b = obj;
        this.f8477c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8475a) {
            case 0:
                p4 p4Var = (p4) this.f8476b;
                Runnable runnable = (Runnable) this.f8477c;
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
                        boolean z11 = p4Var.f8537s;
                        p4Var.f8537s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8537s = z11;
                    }
                    p4Var.f8535n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                og ogVar = (og) this.f8477c;
                ((ub) this.f8476b).setInOutOffset(0.0f);
                if (!z10) {
                    ogVar.run();
                    return;
                }
                return;
            case 2:
                wi.r((wi) this.f8476b, (org.telegram.ui.ActionBar.p) this.f8477c);
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f8476b).d;
                wiVar.f29729z0.setTranslationY(0.0f);
                wiVar.f29729z0.k(wiVar.f29684l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f8477c).run();
                wiVar.a2(0);
                return;
            default:
                sd0 sd0Var = (sd0) this.f8476b;
                bc0 bc0Var = (bc0) this.f8477c;
                LinkedList linkedList = sd0Var.M;
                sd0Var.L = null;
                bc0Var.D = null;
                bc0Var.z();
                if (!z10) {
                    bc0Var.h = 1.0f;
                    bc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        sd0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
