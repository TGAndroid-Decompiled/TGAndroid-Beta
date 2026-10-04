package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xi;
public final class n4 implements o1.f {
    public final int f9221a;
    public final Object f9222b;
    public final Object f9223c;

    public n4(int i10, Object obj, Object obj2) {
        this.f9221a = i10;
        this.f9222b = obj;
        this.f9223c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        li.n nVar;
        ViewGroup viewGroup;
        switch (this.f9221a) {
            case 0:
                q4 q4Var = (q4) this.f9222b;
                Runnable runnable = (Runnable) this.f9223c;
                if (hVar == q4Var.G) {
                    q4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = q4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = q4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = q4Var.f9290s;
                        q4Var.f9290s = true;
                        q4Var.setOffsetY(f11);
                        q4Var.h = -1.0f;
                        q4Var.f9290s = z11;
                    }
                    q4Var.f9288n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                qg qgVar = (qg) this.f9223c;
                ((vb) this.f9222b).setInOutOffset(0.0f);
                if (!z10) {
                    qgVar.run();
                    return;
                }
                return;
            case 2:
                xi.u((xi) this.f9222b, (org.telegram.messenger.video.o) this.f9223c);
                return;
            case 3:
                xi xiVar = (xi) ((fi) this.f9222b).d;
                xiVar.f32883z0.setTranslationY(0.0f);
                xiVar.f32883z0.k(xiVar.f32838l2);
                nVar = ((org.telegram.ui.ActionBar.f3) xiVar).glassEngine;
                nVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                viewGroup.invalidate();
                ((ih) this.f9223c).run();
                xiVar.Z1(0);
                return;
            default:
                ee0 ee0Var = (ee0) this.f9222b;
                pc0 pc0Var = (pc0) this.f9223c;
                LinkedList linkedList = ee0Var.M;
                ee0Var.L = null;
                pc0Var.D = null;
                pc0Var.z();
                if (!z10) {
                    pc0Var.h = 1.0f;
                    pc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ee0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
