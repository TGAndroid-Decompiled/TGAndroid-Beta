package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.za0;
public final class y0 implements r1.c {
    public final int f4244a;
    public final Object f4245b;
    public final Object f4246c;

    public y0(int i7, Object obj, Object obj2) {
        this.f4244a = i7;
        this.f4245b = obj;
        this.f4246c = obj2;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f4244a) {
            case 0:
                ((b1) this.f4245b).b(0.0f);
                ((a3.f) this.f4246c).run();
                return;
            case 1:
                ki.s3 s3Var = (ki.s3) this.f4245b;
                Runnable runnable = (Runnable) this.f4246c;
                if (gVar == s3Var.H) {
                    s3Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = s3Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = s3Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = s3Var.f18997s;
                        s3Var.f18997s = true;
                        s3Var.setOffsetY(f12);
                        s3Var.h = -1.0f;
                        s3Var.f18997s = z11;
                    }
                    s3Var.f18995n = -2.1474836E9f;
                    return;
                }
                return;
            case 2:
                ng ngVar = (ng) this.f4246c;
                ((kb) this.f4245b).setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    return;
                }
                return;
            case 3:
                fa faVar = (fa) this.f4246c;
                AnimatorSet animatorSet = ((ti) this.f4245b).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    faVar.run();
                    return;
                }
                return;
            case 4:
                ti tiVar = (ti) ((di.a4) this.f4245b).d;
                tiVar.f40033x2.setTranslationY(0.0f);
                tiVar.f40033x2.m(tiVar.f39983j4);
                tiVar.Y0.g();
                tiVar.f30226b.invalidate();
                ((fh) this.f4246c).run();
                tiVar.Q1(0);
                return;
            default:
                oc0 oc0Var = (oc0) this.f4245b;
                za0 za0Var = (za0) this.f4246c;
                LinkedList linkedList = oc0Var.V;
                oc0Var.U = null;
                za0Var.D = null;
                za0Var.y();
                if (!z10) {
                    za0Var.h = 1.0f;
                    za0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        oc0Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
