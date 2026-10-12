package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xe0;
public final class l4 implements o1.f {
    public final int f9206a;
    public final Object f9207b;
    public final Object f9208c;

    public l4(int i10, Object obj, Object obj2) {
        this.f9206a = i10;
        this.f9207b = obj;
        this.f9208c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f9206a) {
            case 0:
                o4 o4Var = (o4) this.f9207b;
                Runnable runnable = (Runnable) this.f9208c;
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
                        boolean z11 = o4Var.f9263s;
                        o4Var.f9263s = true;
                        o4Var.setOffsetY(f11);
                        o4Var.h = -1.0f;
                        o4Var.f9263s = z11;
                    }
                    o4Var.f9261n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                tg tgVar = (tg) this.f9208c;
                ((wb) this.f9207b).setInOutOffset(0.0f);
                if (!z10) {
                    tgVar.run();
                    return;
                }
                return;
            case 2:
                aj.t((aj) this.f9207b, (org.telegram.tgnet.h) this.f9208c);
                return;
            case 3:
                aj ajVar = (aj) ((li) this.f9207b).d;
                ajVar.C0.setTranslationY(0.0f);
                ajVar.C0.l(ajVar.f24366o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
                viewGroup.invalidate();
                ((lh) this.f9208c).run();
                ajVar.e2(0);
                return;
            default:
                xe0 xe0Var = (xe0) this.f9207b;
                gd0 gd0Var = (gd0) this.f9208c;
                LinkedList linkedList = xe0Var.Q;
                xe0Var.P = null;
                gd0Var.D = null;
                gd0Var.z();
                if (!z10) {
                    gd0Var.h = 1.0f;
                    gd0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        xe0Var.R.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
