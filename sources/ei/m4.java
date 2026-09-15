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
    public final int f8487a;
    public final Object f8488b;
    public final Object f8489c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8487a = i10;
        this.f8488b = obj;
        this.f8489c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8487a) {
            case 0:
                p4 p4Var = (p4) this.f8488b;
                Runnable runnable = (Runnable) this.f8489c;
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
                        boolean z11 = p4Var.f8549s;
                        p4Var.f8549s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8549s = z11;
                    }
                    p4Var.f8547n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                ng ngVar = (ng) this.f8489c;
                ((sb) this.f8488b).setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    return;
                }
                return;
            case 2:
                vi.r((vi) this.f8488b, (org.telegram.ui.ActionBar.p) this.f8489c);
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f8488b).d;
                viVar.f28814z0.setTranslationY(0.0f);
                viVar.f28814z0.k(viVar.f28769l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                ((fh) this.f8489c).run();
                viVar.a2(0);
                return;
            default:
                sd0 sd0Var = (sd0) this.f8488b;
                cc0 cc0Var = (cc0) this.f8489c;
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
