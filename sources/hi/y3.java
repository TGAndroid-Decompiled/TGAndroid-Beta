package hi;

import android.animation.AnimatorSet;
import bi.y4;
import java.util.LinkedList;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.ra0;
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
                AnimatorSet animatorSet = ((di) this.f15056b).f28663z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    ngVar.run();
                    return;
                }
                return;
            case 3:
                di diVar = (di) ((y4) this.f15056b).d;
                diVar.f33051t2.setTranslationY(0.0f);
                diVar.f33051t2.m(diVar.f33003f4);
                diVar.X0.g();
                diVar.f28624b.invalidate();
                ((qg) this.f15057c).run();
                diVar.P1(0);
                return;
            default:
                fc0 fc0Var = (fc0) this.f15056b;
                ra0 ra0Var = (ra0) this.f15057c;
                LinkedList linkedList = fc0Var.U;
                fc0Var.T = null;
                ra0Var.D = null;
                ra0Var.y();
                if (!z9) {
                    ra0Var.h = 1.0f;
                    ra0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        fc0Var.V.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
