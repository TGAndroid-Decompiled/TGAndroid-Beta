package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ry6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final KeyEvent.Callback g;

    public ry6(KeyEvent.Callback callback, float f, float f2, float f3, float f4, int i, byte b) {
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
                wy6 wy6Var = (wy6) callback;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy6Var.y = floatValue;
                float A = tb4.A(1.0f, f4, floatValue, f4);
                vy6 vy6Var = wy6Var.E;
                vy6Var.setScaleX(A);
                vy6Var.setScaleY(A);
                vy6Var.setTranslationX((1.0f - wy6Var.y) * f3);
                vy6Var.setTranslationY((1.0f - wy6Var.y) * f2);
                int i2 = (int) ((1.0f - wy6Var.y) * f);
                wy6Var.h.N(i2, i2);
                float a = moe.a((wy6Var.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                wy6Var.c.setAlpha((int) (a * 255.0f));
                wy6Var.d.setAlpha(a);
                wy6Var.e.setAlpha(a);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wy6Var.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - wy6Var.y) * i);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a);
                BitmapDrawable bitmapDrawable = wy6Var.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (wy6Var.y * 255.0f));
                }
                wy6Var.n.setAlpha(a);
                return;
            default:
                ppc ppcVar = (ppc) callback;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s33 s33Var = s33.h;
                float interpolation = s33Var.getInterpolation(floatValue2);
                float interpolation2 = s33Var.getInterpolation(Math.min(1.0f, (floatValue2 * 320.0f) / 120.0f));
                ppcVar.d.setAlpha(((f3 - f4) * interpolation2) + f4);
                ppcVar.f.setAlpha(((f - f2) * interpolation2) + f2);
                FrameLayout frameLayout = ppcVar.e;
                frameLayout.getLayoutParams().width = Math.round(((ppcVar.E - i) * interpolation) + i);
                frameLayout.requestLayout();
                return;
        }
    }
}
