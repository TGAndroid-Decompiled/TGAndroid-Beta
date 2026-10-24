package gi;

import ai.c5;
import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.wc0;
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
                ng ngVar = (ng) this.f11118c;
                ((sb) this.f11117b).setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    return;
                }
                return;
            case 2:
                ri.s((ri) this.f11117b, (jg) this.f11118c);
                return;
            case 3:
                ri riVar = (ri) ((c5) this.f11117b).d;
                riVar.C0.setTranslationY(0.0f);
                riVar.C0.l(riVar.f30174o2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
                viewGroup.invalidate();
                ((eh) this.f11118c).run();
                riVar.i2(0);
                return;
            default:
                ne0 ne0Var = (ne0) this.f11117b;
                wc0 wc0Var = (wc0) this.f11118c;
                LinkedList linkedList = ne0Var.U;
                ne0Var.T = null;
                wc0Var.D = null;
                wc0Var.y();
                if (!z10) {
                    wc0Var.h = 1.0f;
                    wc0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ne0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
