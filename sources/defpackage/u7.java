package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class u7 extends AnimatorListenerAdapter {
    public final byte a;
    public final float b;
    public final Object c;

    public u7(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                x7 x7Var = (x7) obj;
                x7Var.U = null;
                x7Var.a = f;
                x7Var.invalidate();
                return;
            case 1:
                dh0 dh0Var = (dh0) obj;
                dh0Var.g = f;
                dh0Var.invalidateSelf();
                return;
            case 2:
                fy0 fy0Var = (fy0) obj;
                fy0Var.i = f;
                fy0Var.b.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.b7 = null;
                chatActivityEnterView.c7 = false;
                if (!chatActivityEnterView.N2) {
                    tx1 tx1Var = chatActivityEnterView.F0;
                    if (tx1Var != null) {
                        tx1Var.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    bn3 bn3Var = chatActivityEnterView.j1;
                    if (bn3Var != null) {
                        bn3Var.o();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new qm1(this, f, (byte) 2));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(k43.g);
                    ofFloat.start();
                    return;
                }
                return;
            case 4:
                fj8 fj8Var = (fj8) obj;
                fj8Var.I.e();
                fj8Var.b = f;
                if (f <= 0.0f) {
                    fj8Var.H = -1;
                }
                fj8Var.c(true);
                fj8Var.f = false;
                if (fj8Var.Q != null && Math.abs(f - 1.0f) < 0.01f) {
                    fj8Var.Q.run();
                    return;
                }
                return;
            case 5:
                sv8 sv8Var = (sv8) obj;
                frc frcVar = sv8Var.r;
                frcVar.getClass();
                frcVar.setLayerType(0, null);
                if (f == 0.0f) {
                    sv8Var.b();
                    return;
                } else if (!sv8Var.S) {
                    ValueAnimator valueAnimator = sv8Var.Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(sv8Var.R, 1.0f);
                    sv8Var.Q = ofFloat2;
                    ofFloat2.setDuration(320L);
                    sv8Var.Q.setInterpolator(k43.g);
                    sv8Var.Q.addUpdateListener(new nv8(sv8Var, (byte) 0));
                    sv8Var.Q.start();
                    return;
                } else {
                    return;
                }
            case 6:
                e39 e39Var = (e39) obj;
                e39Var.G = f;
                e39Var.invalidate();
                return;
            case 7:
                ColorMatrix colorMatrix = new ColorMatrix();
                bna bnaVar = (bna) obj;
                bnaVar.w = f;
                colorMatrix.setSaturation(f);
                if (aob.I.o()) {
                    hl.h(colorMatrix, (1.0f - bnaVar.w) * (-0.3f));
                }
                bnaVar.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            default:
                uqc uqcVar = (uqc) obj;
                if (uqcVar.n0 == animator) {
                    uqcVar.n0 = null;
                    uqcVar.P0(f);
                    uqcVar.s0.m(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                fj8 fj8Var = (fj8) this.c;
                fj8Var.f = true;
                fj8Var.c = this.b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
