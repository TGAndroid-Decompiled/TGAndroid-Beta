package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zm implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Object f;

    public zm(Object obj, float f, float f2, float f3, float f4, byte b) {
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
                gn gnVar = (gn) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.lastDrawnCy = gm.R1(f4, f3, floatValue);
                gnVar.lastDrawnCx = gm.R1(f2, f, floatValue);
                return;
            case 1:
                tl1 tl1Var = (tl1) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tl1Var.k = td4.A(f3, f4, floatValue2, f4);
                tl1Var.l = td4.A(f, f2, floatValue2, f2);
                tl1Var.a.a(f3, f, false);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.z7;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float A = td4.A(f3, f4, floatValue3, f4);
                m6a m6aVar = chatActivityEnterView.q0;
                if (m6aVar != null) {
                    m6aVar.setAlpha(((f - f2) * floatValue3) + f2);
                    chatActivityEnterView.q0.setTranslationX(A);
                }
                chatActivityEnterView.R0.setTranslationX(A);
                chatActivityEnterView.H = A;
                chatActivityEnterView.u2();
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vs4 vs4Var = ((sm3) ((rm3) obj).b).a;
                vs4Var.d = td4.A(f3, f4, floatValue4, f4);
                vs4Var.i = td4.A(f, f2, floatValue4, f2);
                return;
            default:
                wc1 wc1Var = (wc1) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an9 an9Var = wc1Var.a;
                an9Var.setScaleX(gm.R1(f4, f3, floatValue5));
                an9Var.setScaleY(gm.R1(f4, f3, floatValue5));
                an9Var.setTranslationX(f2 * floatValue5);
                an9Var.setTranslationY(f * floatValue5);
                float f5 = 1.0f - floatValue5;
                an9Var.setAlpha(f5);
                wc1Var.s = f5;
                wc1Var.invalidate();
                return;
        }
    }
}
