package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rv1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a = 1;
    public final float b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rv1(bq5 bq5Var, vg8 vg8Var, v01 v01Var, float f) {
        this.c = bq5Var;
        this.d = vg8Var;
        this.e = v01Var;
        this.b = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int currentColor;
        byte b = this.a;
        float f2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                zy1 zy1Var = (zy1) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i = ChatActivityEnterView.X7;
                int i2 = (chatActivityEnterView.M5 > 0.0f ? 1 : (chatActivityEnterView.M5 == 0.0f ? 0 : -1));
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i2 != 0) {
                    if (chatActivityEnterView.M5 != 0.0f) {
                        f = (float) (AnimationUtils.currentAnimationTimeMillis() - chatActivityEnterView.N5);
                    } else {
                        f = chatActivityEnterView.T5;
                    }
                    floatValue = Math.max(floatValue, (f / 1000.0f) * 1000.0f);
                }
                chatActivityEnterView.T5 = floatValue;
                float interpolation = k43.g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f3 = chatActivityEnterView.U5;
                float i3 = Utilities.i((floatValue - f3) / Math.max(60.0f, chatActivityEnterView.V5 - f3), 1.0f, 0.0f);
                zy1Var.w = interpolation;
                zy1Var.x = i3;
                zy1Var.invalidate();
                double radians = Math.toRadians(zy1Var.e());
                chatActivityEnterView.L5.S = ((float) Math.sin(radians)) * f2;
                chatActivityEnterView.L5.T = (1.0f - ((float) Math.cos(radians))) * f2;
                float f4 = chatActivityEnterView.W5;
                if (floatValue >= f4) {
                    float min = Math.min(1.0f, (floatValue - f4) / 260.0f);
                    zy1Var.y = min;
                    zy1Var.invalidate();
                    chatActivityEnterView.s(min);
                }
                recordCircle.invalidate();
                return;
            default:
                v01 v01Var = (v01) obj;
                pa9 pa9Var = ((bq5) obj3).a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j18 j18Var = new j18(new vg8[]{(vg8) obj2});
                v01Var.getClass();
                if (v01Var instanceof r01) {
                    currentColor = -1;
                } else {
                    currentColor = pa9Var.getCurrentColor();
                }
                j18Var.c = currentColor;
                j18Var.d = floatValue2 * f2;
                j18Var.e = v01Var;
                nx7 painting = pa9Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new my6(painting, j18Var, true, true, null, (byte) 1));
                    return;
                }
                return;
        }
    }

    public rv1(ChatActivityEnterView chatActivityEnterView, zy1 zy1Var, float f, ChatActivityEnterView.RecordCircle recordCircle) {
        this.c = chatActivityEnterView;
        this.d = zy1Var;
        this.b = f;
        this.e = recordCircle;
    }
}
