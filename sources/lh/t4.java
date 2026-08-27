package lh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.sl0;

public final class t4 implements ValueAnimator.AnimatorUpdateListener {

    public final int f16848a;

    public final int f16849b;

    public final int f16850c;
    public final Object d;

    public t4(Object obj, int i10, int i11, int i12) {
        this.f16848a = i12;
        this.d = obj;
        this.f16849b = i10;
        this.f16850c = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f16848a;
        int i11 = this.f16850c;
        int i12 = this.f16849b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                f6 f6Var = (f6) obj;
                f6Var.f16000w1.f50034a = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                f6Var.P0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) obj;
                b4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                ri0 ri0Var = b4Var.f24100f;
                ri0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.g6.B1(ri0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) obj;
                i6Var.getClass();
                i6Var.r(i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                i6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.f26507k0;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.S = i12 * fFloatValue;
                scrollSlidingTextTabStrip.T = i11 * fFloatValue;
                scrollSlidingTextTabStrip.f26508a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ex0 ex0Var = (ex0) ((sl0) obj).f32482b;
                ex0Var.f28173c.setAlpha(animatedFraction);
                ex0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ex0Var.y0(i11 + i14);
                    ex0Var.f28173c.setTranslationY(i14);
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) obj;
                l0Var.G1.f50034a = i0.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                l0Var.Y0.invalidate();
                break;
        }
    }
}
