package hi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vc0;
public final class k4 implements o1.f {
    public final int f13070a;
    public final Object f13071b;
    public final Object f13072c;

    public k4(int i10, Object obj, Object obj2) {
        this.f13070a = i10;
        this.f13071b = obj;
        this.f13072c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        oi.q qVar;
        ViewGroup viewGroup;
        switch (this.f13070a) {
            case 0:
                n4 n4Var = (n4) this.f13071b;
                Runnable runnable = (Runnable) this.f13072c;
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
                        boolean z11 = n4Var.f13160s;
                        n4Var.f13160s = true;
                        n4Var.setOffsetY(f11);
                        n4Var.h = -1.0f;
                        n4Var.f13160s = z11;
                    }
                    n4Var.f13158n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f13072c;
                ((ub) this.f13071b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                ti.r((ti) this.f13071b, (kg) this.f13072c);
                return;
            case 3:
                ti tiVar = (ti) ((bi.x4) this.f13071b).d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.f33018o2);
                qVar = ((org.telegram.ui.ActionBar.k3) tiVar).glassEngine;
                qVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f13072c).run();
                tiVar.i2(0);
                return;
            default:
                me0 me0Var = (me0) this.f13071b;
                vc0 vc0Var = (vc0) this.f13072c;
                LinkedList linkedList = me0Var.U;
                me0Var.T = null;
                vc0Var.D = null;
                vc0Var.y();
                if (!z10) {
                    vc0Var.h = 1.0f;
                    vc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        me0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
