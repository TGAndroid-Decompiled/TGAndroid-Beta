package ii;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.e7;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.zb0;
public final class z3 implements q1.c {
    public final int f15348a;
    public final Object f15349b;
    public final Object f15350c;

    public z3(int i3, Object obj, Object obj2) {
        this.f15348a = i3;
        this.f15349b = obj;
        this.f15350c = obj2;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f15348a) {
            case 0:
                c4 c4Var = (c4) this.f15349b;
                Runnable runnable = (Runnable) this.f15350c;
                if (gVar == c4Var.H) {
                    c4Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = c4Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = c4Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = c4Var.f14881s;
                        c4Var.f14881s = true;
                        c4Var.setOffsetY(f12);
                        c4Var.h = -1.0f;
                        c4Var.f14881s = z11;
                    }
                    c4Var.f14879n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                vf vfVar = (vf) this.f15350c;
                ((fb) this.f15349b).setInOutOffset(0.0f);
                if (!z10) {
                    vfVar.run();
                    return;
                }
                return;
            case 2:
                e7 e7Var = (e7) this.f15350c;
                AnimatorSet animatorSet = ((bi) this.f15349b).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    e7Var.run();
                    return;
                }
                return;
            case 3:
                bi biVar = (bi) ((ci.h4) this.f15349b).d;
                biVar.f32279u2.setTranslationY(0.0f);
                biVar.f32279u2.m(biVar.f32231g4);
                biVar.Y0.g();
                biVar.f28586b.invalidate();
                ((ng) this.f15350c).run();
                biVar.P1(0);
                return;
            default:
                zb0 zb0Var = (zb0) this.f15349b;
                la0 la0Var = (la0) this.f15350c;
                LinkedList linkedList = zb0Var.V;
                zb0Var.U = null;
                la0Var.D = null;
                la0Var.y();
                if (!z10) {
                    la0Var.h = 1.0f;
                    la0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        zb0Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
