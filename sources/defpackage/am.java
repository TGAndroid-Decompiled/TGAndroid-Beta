package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class am implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Object f;

    public am(Object obj, float f, float f2, float f3, float f4, byte b) {
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
                hm hmVar = (hm) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hmVar.lastDrawnCy = hl.R1(f4, f3, floatValue);
                hmVar.lastDrawnCx = hl.R1(f2, f, floatValue);
                return;
            case 1:
                uk1 uk1Var = (uk1) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uk1Var.k = qd4.A(f3, f4, floatValue2, f4);
                uk1Var.l = qd4.A(f, f2, floatValue2, f2);
                uk1Var.a.a(f3, f, false);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.X7;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float A = qd4.A(f3, f4, floatValue3, f4);
                c8a c8aVar = chatActivityEnterView.q0;
                if (c8aVar != null) {
                    c8aVar.setAlpha(((f - f2) * floatValue3) + f2);
                    chatActivityEnterView.q0.setTranslationX(A);
                }
                chatActivityEnterView.R0.setTranslationX(A);
                chatActivityEnterView.H = A;
                chatActivityEnterView.B2();
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ys4 ys4Var = ((zl3) ((yl3) obj).b).a;
                ys4Var.d = qd4.A(f3, f4, floatValue4, f4);
                ys4Var.i = qd4.A(f, f2, floatValue4, f2);
                return;
            default:
                xb1 xb1Var = (xb1) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oo9 oo9Var = xb1Var.a;
                oo9Var.setScaleX(hl.R1(f4, f3, floatValue5));
                oo9Var.setScaleY(hl.R1(f4, f3, floatValue5));
                oo9Var.setTranslationX(f2 * floatValue5);
                oo9Var.setTranslationY(f * floatValue5);
                float f5 = 1.0f - floatValue5;
                oo9Var.setAlpha(f5);
                xb1Var.s = f5;
                xb1Var.invalidate();
                return;
        }
    }
}
