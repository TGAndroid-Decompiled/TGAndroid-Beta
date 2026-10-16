package fi;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wb;
public final class m4 implements o1.f {
    public final int f9420a;
    public final Object f9421b;
    public final Object f9422c;

    public m4(int i10, Object obj, Object obj2) {
        this.f9420a = i10;
        this.f9421b = obj;
        this.f9422c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.f9420a) {
            case 0:
                p4 p4Var = (p4) this.f9421b;
                Runnable runnable = (Runnable) this.f9422c;
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
                        boolean z11 = p4Var.f9481s;
                        p4Var.f9481s = true;
                        p4Var.setOffsetY(f11);
                        p4Var.h = -1.0f;
                        p4Var.f9481s = z11;
                    }
                    p4Var.f9479n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                qg qgVar = (qg) this.f9422c;
                ((wb) this.f9421b).setInOutOffset(0.0f);
                if (!z10) {
                    qgVar.run();
                    return;
                }
                return;
            case 2:
                vi.t((vi) this.f9421b, (org.telegram.messenger.video.f) this.f9422c);
                return;
            case 3:
                vi viVar = (vi) ((gi) this.f9421b).d;
                viVar.C0.setTranslationY(0.0f);
                viVar.C0.l(viVar.f29700o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                viewGroup.invalidate();
                ((hh) this.f9422c).run();
                viVar.e2(0);
                return;
            default:
                re0 re0Var = (re0) this.f9421b;
                cd0 cd0Var = (cd0) this.f9422c;
                LinkedList linkedList = re0Var.Q;
                re0Var.P = null;
                cd0Var.D = null;
                cd0Var.z();
                if (!z10) {
                    cd0Var.h = 1.0f;
                    cd0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        re0Var.R.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
