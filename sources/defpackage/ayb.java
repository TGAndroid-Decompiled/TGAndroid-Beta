package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class ayb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final oyb b;

    public ayb(oyb oybVar, byte b) {
        this.a = b;
        this.b = oybVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        oyb oybVar = this.b;
        switch (b) {
            case 0:
                oybVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oybVar.a0 = floatValue;
                smb smbVar = oybVar.S;
                if (floatValue > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                smbVar.setVisibility(i);
                smbVar.setAlpha(floatValue);
                smbVar.setTranslationY((1.0f - floatValue) * (-gm.L(8.0f)));
                oybVar.b(floatValue);
                int L = gm.L(100.0f) + gm.m + ((int) (gm.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) oybVar.r.getLayoutParams()).topMargin = L;
                View view = oybVar.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                oybVar.h.requestLayout();
                return;
            default:
                oybVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
