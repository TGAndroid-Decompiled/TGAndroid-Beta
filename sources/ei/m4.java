package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vi;
public final class m4 implements o1.f {
    public final int f8492a;
    public final Object f8493b;
    public final Object f8494c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8492a = i10;
        this.f8493b = obj;
        this.f8494c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8492a) {
            case 0:
                p4 p4Var = (p4) this.f8493b;
                Runnable runnable = (Runnable) this.f8494c;
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
                        boolean z11 = p4Var.f8554s;
                        p4Var.f8554s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8554s = z11;
                    }
                    p4Var.f8552n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                ng ngVar = (ng) this.f8494c;
                ((sb) this.f8493b).setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    return;
                }
                return;
            case 2:
                vi.r((vi) this.f8493b, (org.telegram.ui.ActionBar.q) this.f8494c);
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f8493b).d;
                viVar.f28806z0.setTranslationY(0.0f);
                viVar.f28806z0.k(viVar.f28761l2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) viVar).containerView;
                viewGroup.invalidate();
                ((fh) this.f8494c).run();
                viVar.a2(0);
                return;
            default:
                sd0 sd0Var = (sd0) this.f8493b;
                cc0 cc0Var = (cc0) this.f8494c;
                LinkedList linkedList = sd0Var.M;
                sd0Var.L = null;
                cc0Var.D = null;
                cc0Var.z();
                if (!z10) {
                    cc0Var.h = 1.0f;
                    cc0Var.z();
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
