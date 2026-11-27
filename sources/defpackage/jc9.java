package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class jc9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nd9 b;

    public jc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                nd9Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd9Var.t0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd9Var.U = floatValue;
                nd9Var.S.setAlpha(floatValue);
                nd9Var.S.setScaleX(hl.R1(0.6f, 1.0f, floatValue));
                nd9Var.S.setScaleY(hl.R1(0.6f, 1.0f, floatValue));
                FrameLayout frameLayout = nd9Var.S;
                if (floatValue > 0.0f) {
                    i = 0;
                } else {
                    i = 4;
                }
                frameLayout.setVisibility(i);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nd9Var.S.getLayoutParams();
                layoutParams.rightMargin = hl.U1(floatValue, -nd9Var.S.getMeasuredWidth(), hl.L(-4.0f));
                nd9Var.S.setLayoutParams(layoutParams);
                return;
        }
    }
}
