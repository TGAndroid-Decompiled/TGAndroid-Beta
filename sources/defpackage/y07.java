package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y07 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final KeyEvent.Callback g;

    public y07(KeyEvent.Callback callback, float f, float f2, float f3, float f4, int i, byte b) {
        this.a = b;
        this.g = callback;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.f;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        float f4 = this.b;
        KeyEvent.Callback callback = this.g;
        switch (b) {
            case 0:
                d17 d17Var = (d17) callback;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d17Var.y = floatValue;
                float A = qd4.A(1.0f, f4, floatValue, f4);
                c17 c17Var = d17Var.E;
                c17Var.setScaleX(A);
                c17Var.setScaleY(A);
                c17Var.setTranslationX((1.0f - d17Var.y) * f3);
                c17Var.setTranslationY((1.0f - d17Var.y) * f2);
                int i2 = (int) ((1.0f - d17Var.y) * f);
                d17Var.h.N(i2, i2);
                float a = ete.a((d17Var.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                d17Var.c.setAlpha((int) (a * 255.0f));
                d17Var.d.setAlpha(a);
                d17Var.e.setAlpha(a);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d17Var.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - d17Var.y) * i);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a);
                BitmapDrawable bitmapDrawable = d17Var.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (d17Var.y * 255.0f));
                }
                d17Var.n.setAlpha(a);
                return;
            default:
                duc ducVar = (duc) callback;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k43 k43Var = k43.h;
                float interpolation = k43Var.getInterpolation(floatValue2);
                float interpolation2 = k43Var.getInterpolation(Math.min(1.0f, (floatValue2 * 320.0f) / 120.0f));
                ducVar.d.setAlpha(((f3 - f4) * interpolation2) + f4);
                ducVar.f.setAlpha(((f - f2) * interpolation2) + f2);
                FrameLayout frameLayout = ducVar.e;
                frameLayout.getLayoutParams().width = Math.round(((ducVar.E - i) * interpolation) + i);
                frameLayout.requestLayout();
                return;
        }
    }
}
