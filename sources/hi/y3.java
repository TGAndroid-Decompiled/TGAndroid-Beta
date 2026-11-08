package hi;

import android.animation.AnimatorSet;
import bi.y4;
import java.util.LinkedList;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.xf;
public final class y3 implements r1.c {
    public final int f15055a;
    public final Object f15056b;
    public final Object f15057c;

    public y3(int i7, Object obj, Object obj2) {
        this.f15055a = i7;
        this.f15056b = obj;
        this.f15057c = obj2;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f15055a) {
            case 0:
                b4 b4Var = (b4) this.f15056b;
                Runnable runnable = (Runnable) this.f15057c;
                if (gVar == b4Var.G) {
                    b4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = b4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = b4Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = b4Var.f14568s;
                        b4Var.f14568s = true;
                        b4Var.setOffsetY(f12);
                        b4Var.h = -1.0f;
                        b4Var.f14568s = z10;
                    }
                    b4Var.f14566n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                xf xfVar = (xf) this.f15057c;
                ((gb) this.f15056b).setInOutOffset(0.0f);
                if (!z9) {
                    xfVar.run();
                    return;
                }
                return;
            case 2:
                ng ngVar = (ng) this.f15057c;
                AnimatorSet animatorSet = ((di) this.f15056b).f28658z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    ngVar.run();
                    return;
                }
                return;
            case 3:
                di diVar = (di) ((y4) this.f15056b).d;
                diVar.f32996t2.setTranslationY(0.0f);
                diVar.f32996t2.m(diVar.f32948f4);
                diVar.X0.g();
                diVar.f28619b.invalidate();
                ((qg) this.f15057c).run();
                diVar.P1(0);
                return;
            default:
                ec0 ec0Var = (ec0) this.f15056b;
                qa0 qa0Var = (qa0) this.f15057c;
                LinkedList linkedList = ec0Var.U;
                ec0Var.T = null;
                qa0Var.D = null;
                qa0Var.y();
                if (!z9) {
                    qa0Var.h = 1.0f;
                    qa0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ec0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
