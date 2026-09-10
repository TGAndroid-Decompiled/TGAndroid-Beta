package di;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.yi;
public final class q4 implements o1.f {
    public final int f6863a;
    public final Object f6864b;
    public final Object f6865c;

    public q4(int i10, Object obj, Object obj2) {
        this.f6863a = i10;
        this.f6864b = obj;
        this.f6865c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f6863a) {
            case 0:
                t4 t4Var = (t4) this.f6864b;
                Runnable runnable = (Runnable) this.f6865c;
                if (hVar == t4Var.G) {
                    t4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = t4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = t4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = t4Var.f6922s;
                        t4Var.f6922s = true;
                        t4Var.setOffsetY(f11);
                        t4Var.h = -1.0f;
                        t4Var.f6922s = z11;
                    }
                    t4Var.f6920n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                rg rgVar = (rg) this.f6865c;
                ((tb) this.f6864b).setInOutOffset(0.0f);
                if (!z10) {
                    rgVar.run();
                    return;
                }
                return;
            case 2:
                yi.r((yi) this.f6864b, (gf) this.f6865c);
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f6864b).d;
                yiVar.f29430z0.setTranslationY(0.0f);
                yiVar.f29430z0.k(yiVar.f29385l2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                viewGroup.invalidate();
                ((jh) this.f6865c).run();
                yiVar.a2(0);
                return;
            default:
                be0 be0Var = (be0) this.f6864b;
                lc0 lc0Var = (lc0) this.f6865c;
                LinkedList linkedList = be0Var.M;
                be0Var.L = null;
                lc0Var.D = null;
                lc0Var.z();
                if (!z10) {
                    lc0Var.h = 1.0f;
                    lc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        be0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
