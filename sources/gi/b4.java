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
    public final int f11100a;
    public final Object f11101b;
    public final Object f11102c;

    public b4(int i10, Object obj, Object obj2) {
        this.f11100a = i10;
        this.f11101b = obj;
        this.f11102c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f11100a) {
            case 0:
                e4 e4Var = (e4) this.f11101b;
                Runnable runnable = (Runnable) this.f11102c;
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
                        boolean z11 = e4Var.f11191s;
                        e4Var.f11191s = true;
                        e4Var.setOffsetY(f11);
                        e4Var.h = -1.0f;
                        e4Var.f11191s = z11;
                    }
                    e4Var.f11189n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f11102c;
                ((ub) this.f11101b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                ti.s((ti) this.f11101b, (lg) this.f11102c);
                return;
            case 3:
                ti tiVar = (ti) ((b5) this.f11101b).d;
                tiVar.C0.setTranslationY(0.0f);
                tiVar.C0.l(tiVar.f30609o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f11102c).run();
                tiVar.e2(0);
                return;
            default:
                le0 le0Var = (le0) this.f11101b;
                wc0 wc0Var = (wc0) this.f11102c;
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
