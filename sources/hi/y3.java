package hi;

import android.animation.AnimatorSet;
import bi.y4;
import java.util.LinkedList;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.wf;
public final class y3 implements r1.c {
    public final int f15057a;
    public final Object f15058b;
    public final Object f15059c;

    public y3(int i7, Object obj, Object obj2) {
        this.f15057a = i7;
        this.f15058b = obj;
        this.f15059c = obj2;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f15057a) {
            case 0:
                b4 b4Var = (b4) this.f15058b;
                Runnable runnable = (Runnable) this.f15059c;
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
                        boolean z10 = b4Var.f14570s;
                        b4Var.f14570s = true;
                        b4Var.setOffsetY(f12);
                        b4Var.h = -1.0f;
                        b4Var.f14570s = z10;
                    }
                    b4Var.f14568n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                wf wfVar = (wf) this.f15059c;
                ((fb) this.f15058b).setInOutOffset(0.0f);
                if (!z9) {
                    wfVar.run();
                    return;
                }
                return;
            case 2:
                mg mgVar = (mg) this.f15059c;
                AnimatorSet animatorSet = ((ci) this.f15058b).f28714z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    mgVar.run();
                    return;
                }
                return;
            case 3:
                ci ciVar = (ci) ((y4) this.f15058b).d;
                ciVar.f32664w2.setTranslationY(0.0f);
                ciVar.f32664w2.m(ciVar.f32616i4);
                ciVar.X0.g();
                ciVar.f28672b.invalidate();
                ((pg) this.f15059c).run();
                ciVar.P1(0);
                return;
            default:
                ec0 ec0Var = (ec0) this.f15058b;
                qa0 qa0Var = (qa0) this.f15059c;
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
