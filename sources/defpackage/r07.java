package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class r07 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final KeyEvent.Callback g;

    public r07(KeyEvent.Callback callback, float f, float f2, float f3, float f4, int i, byte b) {
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
                w07 w07Var = (w07) callback;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w07Var.y = floatValue;
                float A = td4.A(1.0f, f4, floatValue, f4);
                v07 v07Var = w07Var.E;
                v07Var.setScaleX(A);
                v07Var.setScaleY(A);
                v07Var.setTranslationX((1.0f - w07Var.y) * f3);
                v07Var.setTranslationY((1.0f - w07Var.y) * f2);
                int i2 = (int) ((1.0f - w07Var.y) * f);
                w07Var.h.N(i2, i2);
                float a = pqe.a((w07Var.y * 2.0f) - 1.0f, 0.0f, 1.0f);
                w07Var.c.setAlpha((int) (a * 255.0f));
                w07Var.d.setAlpha(a);
                w07Var.e.setAlpha(a);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w07Var.f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - w07Var.y) * i);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a);
                BitmapDrawable bitmapDrawable = w07Var.x;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (w07Var.y * 255.0f));
                }
                w07Var.n.setAlpha(a);
                return;
            default:
                qrc qrcVar = (qrc) callback;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d53 d53Var = d53.h;
                float interpolation = d53Var.getInterpolation(floatValue2);
                float interpolation2 = d53Var.getInterpolation(Math.min(1.0f, (floatValue2 * 320.0f) / 120.0f));
                qrcVar.d.setAlpha(((f3 - f4) * interpolation2) + f4);
                qrcVar.f.setAlpha(((f - f2) * interpolation2) + f2);
                FrameLayout frameLayout = qrcVar.e;
                frameLayout.getLayoutParams().width = Math.round(((qrcVar.E - i) * interpolation) + i);
                frameLayout.requestLayout();
                return;
        }
    }
}
