package ig;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import org.telegram.messenger.t2;
import org.telegram.ui.Components.gr;
public final class l0 implements Runnable {
    public final int f8358a;
    public final q0 f8359b;
    public final f1 f8360c;

    public l0(q0 q0Var, f1 f1Var, int i10) {
        this.f8358a = i10;
        this.f8359b = q0Var;
        this.f8360c = f1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f8358a;
        f1 f1Var = this.f8360c;
        q0 q0Var = this.f8359b;
        switch (i10) {
            case 0:
                q0Var.f8413c = f1Var;
                if (q0Var.h == null) {
                    q0Var.h = new RectF();
                }
                q0Var.f8413c.a(q0Var.h);
                a4.l lVar = q0Var.f8411a;
                if (lVar != null) {
                    lVar.u();
                    return;
                }
                return;
            default:
                if (f1Var != null && q0Var.f8424q == 0) {
                    q0Var.f8424q = r1.b(q0Var.f8415g);
                }
                boolean z12 = q0Var.H;
                if (f1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z12 != z10) {
                    if (f1Var != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q0Var.H = z11;
                    ValueAnimator valueAnimator = q0Var.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q0Var.K = null;
                    }
                    float f10 = q0Var.I;
                    if (q0Var.H) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    q0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new j0(q0Var, 0));
                    q0Var.K.addListener(new p0(q0Var, 0));
                    q0Var.K.setInterpolator(gr.h);
                    q0Var.K.start();
                    q0Var.d = f1Var;
                    a4.l lVar2 = q0Var.f8411a;
                    if (lVar2 != null) {
                        lVar2.u();
                    }
                    if (q0Var.H) {
                        t2.SELECTION_CHANGE.a();
                        return;
                    }
                    return;
                } else if (f1Var != q0Var.d) {
                    q0Var.d = f1Var;
                    a4.l lVar3 = q0Var.f8411a;
                    if (lVar3 != null) {
                        lVar3.u();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
