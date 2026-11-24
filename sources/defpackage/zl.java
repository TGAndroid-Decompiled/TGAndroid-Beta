package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zl implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Object f;

    public zl(Object obj, float f, float f2, float f3, float f4, byte b) {
        this.a = b;
        this.f = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                gm gmVar = (gm) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gmVar.lastDrawnCy = gl.R1(f4, f3, floatValue);
                gmVar.lastDrawnCx = gl.R1(f2, f, floatValue);
                return;
            case 1:
                lk1 lk1Var = (lk1) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lk1Var.k = tb4.A(f3, f4, floatValue2, f4);
                lk1Var.l = tb4.A(f, f2, floatValue2, f2);
                lk1Var.a.a(f3, f, false);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.r7;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float A = tb4.A(f3, f4, floatValue3, f4);
                k4a k4aVar = chatActivityEnterView.q0;
                if (k4aVar != null) {
                    k4aVar.setAlpha(((f - f2) * floatValue3) + f2);
                    chatActivityEnterView.q0.setTranslationX(A);
                }
                chatActivityEnterView.R0.setTranslationX(A);
                chatActivityEnterView.H = A;
                chatActivityEnterView.p2();
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq4 uq4Var = ((hl3) ((gl3) obj).b).a;
                uq4Var.d = tb4.A(f3, f4, floatValue4, f4);
                uq4Var.i = tb4.A(f, f2, floatValue4, f2);
                return;
            default:
                pb1 pb1Var = (pb1) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                al9 al9Var = pb1Var.a;
                al9Var.setScaleX(gl.R1(f4, f3, floatValue5));
                al9Var.setScaleY(gl.R1(f4, f3, floatValue5));
                al9Var.setTranslationX(f2 * floatValue5);
                al9Var.setTranslationY(f * floatValue5);
                float f5 = 1.0f - floatValue5;
                al9Var.setAlpha(f5);
                pb1Var.s = f5;
                pb1Var.invalidate();
                return;
        }
    }
}
