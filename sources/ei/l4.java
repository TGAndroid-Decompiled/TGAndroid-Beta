package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yi;
public final class l4 implements o1.f {
    public final int f9209a;
    public final Object f9210b;
    public final Object f9211c;

    public l4(int i10, Object obj, Object obj2) {
        this.f9209a = i10;
        this.f9210b = obj;
        this.f9211c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f9209a) {
            case 0:
                o4 o4Var = (o4) this.f9210b;
                Runnable runnable = (Runnable) this.f9211c;
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
                        boolean z11 = o4Var.f9266s;
                        o4Var.f9266s = true;
                        o4Var.setOffsetY(f11);
                        o4Var.h = -1.0f;
                        o4Var.f9266s = z11;
                    }
                    o4Var.f9264n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                rg rgVar = (rg) this.f9211c;
                ((xb) this.f9210b).setInOutOffset(0.0f);
                if (!z10) {
                    rgVar.run();
                    return;
                }
                return;
            case 2:
                yi.t((yi) this.f9210b, (org.telegram.messenger.video.f) this.f9211c);
                return;
            case 3:
                yi yiVar = (yi) ((ji) this.f9210b).d;
                yiVar.C0.setTranslationY(0.0f);
                yiVar.C0.l(yiVar.f33263o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                viewGroup.invalidate();
                ((jh) this.f9211c).run();
                yiVar.e2(0);
                return;
            default:
                ue0 ue0Var = (ue0) this.f9210b;
                dd0 dd0Var = (dd0) this.f9211c;
                LinkedList linkedList = ue0Var.Q;
                ue0Var.P = null;
                dd0Var.D = null;
                dd0Var.z();
                if (!z10) {
                    dd0Var.h = 1.0f;
                    dd0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ue0Var.R.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
