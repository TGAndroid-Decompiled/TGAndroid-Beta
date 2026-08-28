package kh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.pl0;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16193a;
    public final int f16194b;
    public final int f16195c;
    public final Object d;

    public v4(Object obj, int i9, int i10, int i11) {
        this.f16193a = i11;
        this.d = obj;
        this.f16194b = i9;
        this.f16195c = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.f16193a;
        int i10 = this.f16195c;
        int i11 = this.f16194b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                g6 g6Var = (g6) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.f15310w1.f49333a = i0.a.d(floatValue, i11, i10);
                g6Var.P0.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i11, i10, valueAnimator.getAnimatedFraction(), 1.0f);
                pi0 pi0Var = e4Var.f24293f;
                pi0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.f6.B1(pi0Var.getDrawable(), offsetColor & 620756991, true);
                return;
            case 2:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) obj;
                i6Var.getClass();
                i6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                i6Var.invalidateSelf();
                return;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.f26511k0;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.S = i11 * floatValue2;
                scrollSlidingTextTabStrip.T = i10 * floatValue2;
                scrollSlidingTextTabStrip.f26512a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                return;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                cx0 cx0Var = (cx0) ((pl0) obj).f31689b;
                cx0Var.f27573c.setAlpha(animatedFraction);
                cx0Var.h.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    cx0Var.x0(i10 + i13);
                    cx0Var.f27573c.setTranslationY(i13);
                    return;
                }
                return;
            default:
                yf.l0 l0Var = (yf.l0) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.G1.f49333a = i0.a.d(floatValue3, i11, i10);
                l0Var.Y0.invalidate();
                return;
        }
    }
}
