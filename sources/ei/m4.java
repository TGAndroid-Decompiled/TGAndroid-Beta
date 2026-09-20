package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.vi;
public final class m4 implements o1.f {
    public final int f8492a;
    public final Object f8493b;
    public final Object f8494c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8492a = i10;
        this.f8493b = obj;
        this.f8494c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8492a) {
            case 0:
                p4 p4Var = (p4) this.f8493b;
                Runnable runnable = (Runnable) this.f8494c;
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
                        boolean z11 = p4Var.f8554s;
                        p4Var.f8554s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8554s = z11;
                    }
                    p4Var.f8552n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                og ogVar = (og) this.f8494c;
                ((tb) this.f8493b).setInOutOffset(0.0f);
                if (!z10) {
                    ogVar.run();
                    return;
                }
                return;
            case 2:
                vi.r((vi) this.f8493b, (org.telegram.messenger.video.o) this.f8494c);
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f8493b).d;
                viVar.f29162z0.setTranslationY(0.0f);
                viVar.f29162z0.k(viVar.f29117l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                ((gh) this.f8494c).run();
                viVar.a2(0);
                return;
            default:
                ae0 ae0Var = (ae0) this.f8493b;
                kc0 kc0Var = (kc0) this.f8494c;
                LinkedList linkedList = ae0Var.M;
                ae0Var.L = null;
                kc0Var.D = null;
                kc0Var.z();
                if (!z10) {
                    kc0Var.h = 1.0f;
                    kc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ae0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
