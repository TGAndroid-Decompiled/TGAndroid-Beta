package hi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.uc0;
public final class k4 implements o1.f {
    public final int f13071a;
    public final Object f13072b;
    public final Object f13073c;

    public k4(int i10, Object obj, Object obj2) {
        this.f13071a = i10;
        this.f13072b = obj;
        this.f13073c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        oi.q qVar;
        ViewGroup viewGroup;
        switch (this.f13071a) {
            case 0:
                n4 n4Var = (n4) this.f13072b;
                Runnable runnable = (Runnable) this.f13073c;
                if (hVar == n4Var.G) {
                    n4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = n4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = n4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = n4Var.f13161s;
                        n4Var.f13161s = true;
                        n4Var.setOffsetY(f11);
                        n4Var.h = -1.0f;
                        n4Var.f13161s = z11;
                    }
                    n4Var.f13159n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f13073c;
                ((ub) this.f13072b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                ti.w((ti) this.f13072b, (kg) this.f13073c);
                return;
            case 3:
                ti tiVar = (ti) ((bi.x4) this.f13072b).d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.f33046o2);
                qVar = ((org.telegram.ui.ActionBar.k3) tiVar).glassEngine;
                qVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f13073c).run();
                tiVar.h2(0);
                return;
            default:
                le0 le0Var = (le0) this.f13072b;
                uc0 uc0Var = (uc0) this.f13073c;
                LinkedList linkedList = le0Var.U;
                le0Var.T = null;
                uc0Var.D = null;
                uc0Var.y();
                if (!z10) {
                    uc0Var.h = 1.0f;
                    uc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        le0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
