package ei;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wi;
public final class m4 implements o1.f {
    public final int f8474a;
    public final Object f8475b;
    public final Object f8476c;

    public m4(int i10, Object obj, Object obj2) {
        this.f8474a = i10;
        this.f8475b = obj;
        this.f8476c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f8474a) {
            case 0:
                p4 p4Var = (p4) this.f8475b;
                Runnable runnable = (Runnable) this.f8476c;
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
                        boolean z11 = p4Var.f8536s;
                        p4Var.f8536s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f8536s = z11;
                    }
                    p4Var.f8534n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                pg pgVar = (pg) this.f8476c;
                ((ub) this.f8475b).setInOutOffset(0.0f);
                if (!z10) {
                    pgVar.run();
                    return;
                }
                return;
            case 2:
                wi.r((wi) this.f8475b, (org.telegram.messenger.video.o) this.f8476c);
                return;
            case 3:
                wi wiVar = (wi) ((hi) this.f8475b).d;
                wiVar.f30084z0.setTranslationY(0.0f);
                wiVar.f30084z0.k(wiVar.f30039l2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) wiVar).containerView;
                viewGroup.invalidate();
                ((hh) this.f8476c).run();
                wiVar.a2(0);
                return;
            default:
                de0 de0Var = (de0) this.f8475b;
                nc0 nc0Var = (nc0) this.f8476c;
                LinkedList linkedList = de0Var.M;
                de0Var.L = null;
                nc0Var.D = null;
                nc0Var.z();
                if (!z10) {
                    nc0Var.h = 1.0f;
                    nc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        de0Var.N.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
