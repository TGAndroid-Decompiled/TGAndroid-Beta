package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;
public final class pv1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public pv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = 1.0f;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                pw1 pw1Var = chatActivityEnterView.z2;
                if (pw1Var != null) {
                    pw1Var.setTranslationX(pw1Var.a);
                    return;
                }
                return;
            case 1:
                int i2 = ChatActivityEnterView.r7;
                pw1 pw1Var2 = chatActivityEnterView.z2;
                if (pw1Var2 != null) {
                    pw1Var2.setTranslationX(pw1Var2.a);
                    return;
                }
                return;
            case 2:
                int i3 = ChatActivityEnterView.r7;
                chatActivityEnterView.c2.invalidate();
                return;
            case 3:
                int i4 = ChatActivityEnterView.r7;
                chatActivityEnterView.c2.invalidate();
                return;
            case 4:
                int i5 = ChatActivityEnterView.r7;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null) {
                    wx1Var.Z();
                    return;
                }
                return;
            case 5:
                int i6 = ChatActivityEnterView.r7;
                chatActivityEnterView.z2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i7 = ChatActivityEnterView.r7;
                chatActivityEnterView.D2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    i29 i29Var = chatActivityEnterView.i1;
                    if (!chatActivityEnterView.K1) {
                        f = chatActivityEnterView.D2.getTransformToSeekbarProgressStep3();
                    }
                    i29Var.setAlpha(f);
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.U0();
                return;
            case 7:
                int i8 = ChatActivityEnterView.r7;
                chatActivityEnterView.v(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                int i9 = ChatActivityEnterView.r7;
                chatActivityEnterView.A6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = chatActivityEnterView.E2;
                if (lVar != null) {
                    lVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 9:
                int i10 = ChatActivityEnterView.r7;
                chatActivityEnterView.C5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.q();
                return;
            case 10:
                int i11 = ChatActivityEnterView.r7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.P1 = floatValue;
                j92 C0 = chatActivityEnterView.C0();
                if (C0 != null) {
                    C0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                cw1 cw1Var = chatActivityEnterView.f1;
                if (cw1Var != null) {
                    cw1Var.invalidate();
                    return;
                }
                return;
            default:
                int i12 = ChatActivityEnterView.r7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.m2.setScaleX(gl.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.m2.setScaleY(gl.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.m2.setAlpha(floatValue2);
                return;
        }
    }
}
