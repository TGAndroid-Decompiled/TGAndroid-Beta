package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.jr;
public final class w8 extends LinearLayout {
    public float f18798a;
    public float f18799b;
    public ValueAnimator f18800c;
    public ValueAnimator d;
    public final Paint f18801e;
    public final org.telegram.ui.Components.d6 f18802f;
    public final y8 h;

    public w8(y8 y8Var, Context context) {
        super(context);
        this.h = y8Var;
        this.f18801e = new Paint(1);
        this.f18802f = new org.telegram.ui.Components.d6(this);
    }

    public static void a(w8 w8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w8Var.f18799b = floatValue;
        super.setTranslationY(floatValue + w8Var.f18798a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f18800c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f18799b;
            if (z10) {
                f9 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f18800c = ofFloat;
            ofFloat.addUpdateListener(new v8(this, 0));
            this.f18800c.addListener(new bg.z2(16, this, z10));
            this.f18800c.setDuration(320L);
            this.f18800c.setInterpolator(jr.h);
            this.f18800c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f9 = getMeasuredHeight();
        }
        this.f18799b = f9;
        super.setTranslationY(f9 + this.f18798a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        y8 y8Var = this.h;
        c6Var = ((org.telegram.ui.ActionBar.f3) y8Var.S).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        Paint paint = this.f18801e;
        paint.setColor(v02);
        if (y8Var.f18905f.canScrollVertically(1)) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        paint.setAlpha((int) (this.f18802f.d(f9, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f9) {
        float f10 = this.f18799b;
        this.f18798a = f9;
        super.setTranslationY(f10 + f9);
    }
}
