package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.yi;
public final class l4 implements o1.f {
    public final int f9208a;
    public final Object f9209b;
    public final Object f9210c;

    public l4(int i10, Object obj, Object obj2) {
        this.f9208a = i10;
        this.f9209b = obj;
        this.f9210c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f9208a) {
            case 0:
                o4 o4Var = (o4) this.f9209b;
                Runnable runnable = (Runnable) this.f9210c;
                if (hVar == o4Var.G) {
                    o4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = o4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = o4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = o4Var.f9265s;
                        o4Var.f9265s = true;
                        o4Var.setOffsetY(f11);
                        o4Var.h = -1.0f;
                        o4Var.f9265s = z11;
                    }
                    o4Var.f9263n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                rg rgVar = (rg) this.f9210c;
                ((wb) this.f9209b).setInOutOffset(0.0f);
                if (!z10) {
                    rgVar.run();
                    return;
                }
                return;
            case 2:
                yi.t((yi) this.f9209b, (org.telegram.messenger.video.f) this.f9210c);
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f9209b).d;
                yiVar.C0.setTranslationY(0.0f);
                yiVar.C0.l(yiVar.f33317o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) yiVar).containerView;
                viewGroup.invalidate();
                ((jh) this.f9210c).run();
                yiVar.e2(0);
                return;
            default:
                te0 te0Var = (te0) this.f9209b;
                cd0 cd0Var = (cd0) this.f9210c;
                LinkedList linkedList = te0Var.Q;
                te0Var.P = null;
                cd0Var.D = null;
                cd0Var.z();
                if (!z10) {
                    cd0Var.h = 1.0f;
                    cd0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        te0Var.R.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
