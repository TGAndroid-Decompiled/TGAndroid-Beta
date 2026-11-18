package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.si;
public final class v0 implements r1.c {
    public final int f4127a;
    public final Object f4128b;
    public final Object f4129c;

    public v0(int i7, Object obj, Object obj2) {
        this.f4127a = i7;
        this.f4128b = obj;
        this.f4129c = obj2;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f4127a) {
            case 0:
                ((x0) this.f4128b).b(0.0f);
                ((a3.f) this.f4129c).run();
                return;
            case 1:
                ki.s3 s3Var = (ki.s3) this.f4128b;
                Runnable runnable = (Runnable) this.f4129c;
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
                        boolean z11 = s3Var.f18901s;
                        s3Var.f18901s = true;
                        s3Var.setOffsetY(f12);
                        s3Var.h = -1.0f;
                        s3Var.f18901s = z11;
                    }
                    s3Var.f18899n = -2.1474836E9f;
                    return;
                }
                return;
            case 2:
                lg lgVar = (lg) this.f4129c;
                ((lb) this.f4128b).setInOutOffset(0.0f);
                if (!z10) {
                    lgVar.run();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.k7 k7Var = (org.telegram.ui.Components.k7) this.f4129c;
                AnimatorSet animatorSet = ((si) this.f4128b).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    k7Var.run();
                    return;
                }
                return;
            case 4:
                si siVar = (si) ((di.a4) this.f4128b).d;
                siVar.f39736x2.setTranslationY(0.0f);
                siVar.f39736x2.m(siVar.f39686j4);
                siVar.Y0.g();
                siVar.f30192b.invalidate();
                ((eh) this.f4129c).run();
                siVar.Q1(0);
                return;
            default:
                pc0 pc0Var = (pc0) this.f4128b;
                bb0 bb0Var = (bb0) this.f4129c;
                LinkedList linkedList = pc0Var.V;
                pc0Var.U = null;
                bb0Var.D = null;
                bb0Var.y();
                if (!z10) {
                    bb0Var.h = 1.0f;
                    bb0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        pc0Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
