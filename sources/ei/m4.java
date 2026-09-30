package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xi;
public final class m4 implements o1.f {
    public final int f8486a;
    public final Object f8487b;
    public final Object f8488c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8486a = i10;
        this.f8487b = obj;
        this.f8488c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8486a) {
            case 0:
                p4 p4Var = (p4) this.f8487b;
                Runnable runnable = (Runnable) this.f8488c;
                if (hVar == p4Var.G) {
                    p4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = p4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = p4Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = p4Var.f8548s;
                        p4Var.f8548s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8548s = z11;
                    }
                    p4Var.f8546n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                qg qgVar = (qg) this.f8488c;
                ((vb) this.f8487b).setInOutOffset(0.0f);
                if (!z10) {
                    qgVar.run();
                    return;
                }
                return;
            case 2:
                xi.r((xi) this.f8487b, (org.telegram.messenger.video.o) this.f8488c);
                return;
            case 3:
                xi xiVar = (xi) ((ii) this.f8487b).d;
                xiVar.f30334z0.setTranslationY(0.0f);
                xiVar.f30334z0.k(xiVar.f30289l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) xiVar).containerView;
                viewGroup.invalidate();
                ((ih) this.f8488c).run();
                xiVar.a2(0);
                return;
            default:
                fe0 fe0Var = (fe0) this.f8487b;
                pc0 pc0Var = (pc0) this.f8488c;
                LinkedList linkedList = fe0Var.M;
                fe0Var.L = null;
                pc0Var.D = null;
                pc0Var.z();
                if (!z10) {
                    pc0Var.h = 1.0f;
                    pc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        fe0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
