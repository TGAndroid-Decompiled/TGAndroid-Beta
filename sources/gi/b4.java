package gi;

import ai.b5;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wc0;
public final class b4 implements o1.f {
    public final int f11099a;
    public final Object f11100b;
    public final Object f11101c;

    public b4(int i10, Object obj, Object obj2) {
        this.f11099a = i10;
        this.f11100b = obj;
        this.f11101c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f11099a) {
            case 0:
                e4 e4Var = (e4) this.f11100b;
                Runnable runnable = (Runnable) this.f11101c;
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
                        boolean z11 = e4Var.f11190s;
                        e4Var.f11190s = true;
                        e4Var.setOffsetY(f11);
                        e4Var.h = -1.0f;
                        e4Var.f11190s = z11;
                    }
                    e4Var.f11188n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f11101c;
                ((ub) this.f11100b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                ti.t((ti) this.f11100b, (lg) this.f11101c);
                return;
            case 3:
                ti tiVar = (ti) ((b5) this.f11100b).d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.f30564o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f11101c).run();
                tiVar.e2(0);
                return;
            default:
                le0 le0Var = (le0) this.f11100b;
                wc0 wc0Var = (wc0) this.f11101c;
                LinkedList linkedList = le0Var.U;
                le0Var.T = null;
                wc0Var.D = null;
                wc0Var.y();
                if (!z10) {
                    wc0Var.h = 1.0f;
                    wc0Var.y();
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
