package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.ui;
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
                ki.r3 r3Var = (ki.r3) this.f4245b;
                Runnable runnable = (Runnable) this.f4246c;
                if (gVar == r3Var.H) {
                    r3Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = r3Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = r3Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = r3Var.f18877s;
                        r3Var.f18877s = true;
                        r3Var.setOffsetY(f12);
                        r3Var.h = -1.0f;
                        r3Var.f18877s = z11;
                    }
                    r3Var.f18875n = -2.1474836E9f;
                    return;
                }
                return;
            case 2:
                ng ngVar = (ng) this.f4246c;
                ((lb) this.f4245b).setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.g gVar2 = (org.telegram.ui.Components.g) this.f4246c;
                AnimatorSet animatorSet = ((ui) this.f4245b).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    gVar2.run();
                    return;
                }
                return;
            case 4:
                ui uiVar = (ui) ((di.a4) this.f4245b).d;
                uiVar.f40429x2.setTranslationY(0.0f);
                uiVar.f40429x2.m(uiVar.f40379j4);
                uiVar.Y0.g();
                uiVar.f30142b.invalidate();
                ((gh) this.f4246c).run();
                uiVar.Q1(0);
                return;
            default:
                qc0 qc0Var = (qc0) this.f4245b;
                cb0 cb0Var = (cb0) this.f4246c;
                LinkedList linkedList = qc0Var.V;
                qc0Var.U = null;
                cb0Var.D = null;
                cb0Var.y();
                if (!z10) {
                    cb0Var.h = 1.0f;
                    cb0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        qc0Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
