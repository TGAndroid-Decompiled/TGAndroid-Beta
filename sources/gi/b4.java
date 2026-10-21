package gi;

import ai.c5;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc0;
public final class b4 implements o1.f {
    public final int f11097a;
    public final Object f11098b;
    public final Object f11099c;

    public b4(int i10, Object obj, Object obj2) {
        this.f11097a = i10;
        this.f11098b = obj;
        this.f11099c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f11097a) {
            case 0:
                e4 e4Var = (e4) this.f11098b;
                Runnable runnable = (Runnable) this.f11099c;
                if (hVar == e4Var.G) {
                    e4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = e4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = e4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = e4Var.f11188s;
                        e4Var.f11188s = true;
                        e4Var.setOffsetY(f11);
                        e4Var.h = -1.0f;
                        e4Var.f11188s = z11;
                    }
                    e4Var.f11186n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f11099c;
                ((ub) this.f11098b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                ti.t((ti) this.f11098b, (lg) this.f11099c);
                return;
            case 3:
                ti tiVar = (ti) ((c5) this.f11098b).d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.f30574o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f11099c).run();
                tiVar.e2(0);
                return;
            default:
                me0 me0Var = (me0) this.f11098b;
                wc0 wc0Var = (wc0) this.f11099c;
                LinkedList linkedList = me0Var.U;
                me0Var.T = null;
                wc0Var.D = null;
                wc0Var.y();
                if (!z10) {
                    wc0Var.h = 1.0f;
                    wc0Var.y();
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
