package gi;

import ai.c5;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.yc0;
public final class b4 implements o1.f {
    public final int f11116a;
    public final Object f11117b;
    public final Object f11118c;

    public b4(int i10, Object obj, Object obj2) {
        this.f11116a = i10;
        this.f11117b = obj;
        this.f11118c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f11116a) {
            case 0:
                e4 e4Var = (e4) this.f11117b;
                Runnable runnable = (Runnable) this.f11118c;
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
                        boolean z11 = e4Var.f11210s;
                        e4Var.f11210s = true;
                        e4Var.setOffsetY(f11);
                        e4Var.h = -1.0f;
                        e4Var.f11210s = z11;
                    }
                    e4Var.f11208n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f11118c;
                ((ub) this.f11117b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                ti.s((ti) this.f11117b, (lg) this.f11118c);
                return;
            case 3:
                ti tiVar = (ti) ((c5) this.f11117b).d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.f30758o2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) tiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f11118c).run();
                tiVar.i2(0);
                return;
            default:
                pe0 pe0Var = (pe0) this.f11117b;
                yc0 yc0Var = (yc0) this.f11118c;
                LinkedList linkedList = pe0Var.U;
                pe0Var.T = null;
                yc0Var.D = null;
                yc0Var.y();
                if (!z10) {
                    yc0Var.h = 1.0f;
                    yc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        pe0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
