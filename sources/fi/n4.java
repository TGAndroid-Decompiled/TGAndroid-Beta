package fi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vi;
public final class n4 implements o1.f {
    public final int f9843a;
    public final Object f9844b;
    public final Object f9845c;

    public n4(int i10, Object obj, Object obj2) {
        this.f9843a = i10;
        this.f9844b = obj;
        this.f9845c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f9843a) {
            case 0:
                q4 q4Var = (q4) this.f9844b;
                Runnable runnable = (Runnable) this.f9845c;
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
                        boolean z11 = q4Var.f9911s;
                        q4Var.f9911s = true;
                        q4Var.setOffsetY(f11);
                        q4Var.h = -1.0f;
                        q4Var.f9911s = z11;
                    }
                    q4Var.f9909n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f9845c;
                ((ub) this.f9844b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                vi.r((vi) this.f9844b, (org.telegram.ui.ActionBar.p) this.f9845c);
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f9844b).d;
                viVar.f31343z0.setTranslationY(0.0f);
                viVar.f31343z0.k(viVar.f31298l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                ((hh) this.f9845c).run();
                viVar.a2(0);
                return;
            default:
                sd0 sd0Var = (sd0) this.f9844b;
                dc0 dc0Var = (dc0) this.f9845c;
                LinkedList linkedList = sd0Var.M;
                sd0Var.L = null;
                dc0Var.D = null;
                dc0Var.z();
                if (!z10) {
                    dc0Var.h = 1.0f;
                    dc0Var.z();
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
