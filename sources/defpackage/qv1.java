package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;
public final class qv1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public qv1(ChatActivityEnterView chatActivityEnterView, byte b) {
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
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.G5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.p();
                return;
            case 1:
                int i2 = ChatActivityEnterView.X7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.O1 = floatValue;
                z92 G0 = chatActivityEnterView.G0();
                if (G0 != null) {
                    G0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                rw1 rw1Var = chatActivityEnterView.f1;
                if (rw1Var != null) {
                    rw1Var.invalidate();
                    return;
                }
                return;
            case 2:
                int i3 = ChatActivityEnterView.X7;
                cx1 cx1Var = chatActivityEnterView.y2;
                if (cx1Var != null) {
                    cx1Var.setTranslationX(cx1Var.a);
                    return;
                }
                return;
            case 3:
                int i4 = ChatActivityEnterView.X7;
                chatActivityEnterView.b2.invalidate();
                return;
            case 4:
                int i5 = ChatActivityEnterView.X7;
                chatActivityEnterView.b2.invalidate();
                return;
            case 5:
                int i6 = ChatActivityEnterView.X7;
                chatActivityEnterView.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    my1Var.Y();
                    return;
                }
                return;
            case 6:
                int i7 = ChatActivityEnterView.X7;
                chatActivityEnterView.y2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                int i8 = ChatActivityEnterView.X7;
                cx1 cx1Var2 = chatActivityEnterView.y2;
                if (cx1Var2 != null) {
                    cx1Var2.setTranslationX(cx1Var2.a);
                    return;
                }
                return;
            case 8:
                int i9 = ChatActivityEnterView.X7;
                chatActivityEnterView.U6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = chatActivityEnterView.D2;
                if (lVar != null) {
                    lVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 9:
                int i10 = ChatActivityEnterView.X7;
                chatActivityEnterView.C2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.d1) {
                    x59 x59Var = chatActivityEnterView.i1;
                    if (!chatActivityEnterView.J1) {
                        f = chatActivityEnterView.C2.getTransformToSeekbarProgressStep3();
                    }
                    x59Var.setAlpha(f);
                    chatActivityEnterView.i1.invalidate();
                }
                chatActivityEnterView.Y0();
                return;
            case 10:
                int i11 = ChatActivityEnterView.X7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.l2.setScaleX(hl.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.l2.setScaleY(hl.R1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.l2.setAlpha(floatValue2);
                return;
            case 11:
                int i12 = ChatActivityEnterView.X7;
                chatActivityEnterView.v(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int i13 = ChatActivityEnterView.X7;
                chatActivityEnterView.C7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.s2();
                return;
        }
    }
}
