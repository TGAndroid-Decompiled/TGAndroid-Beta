package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.er;

public final class i9 extends LinearLayout {

    public float f16134a;

    public float f16135b;

    public ValueAnimator f16136c;
    public ValueAnimator d;

    public final Paint f16137e;

    public final org.telegram.ui.Components.y5 f16138f;
    public final k9 h;

    public i9(k9 k9Var, Context context) {
        super(context);
        this.h = k9Var;
        this.f16137e = new Paint(1);
        this.f16138f = new org.telegram.ui.Components.y5(this);
    }

    public static void a(i9 i9Var, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i9Var.f16135b = fFloatValue;
        super.setTranslationY(fFloatValue + i9Var.f16134a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f16136c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (!z11) {
            setVisibility(z10 ? 8 : 0);
            float measuredHeight = z10 ? getMeasuredHeight() : 0.0f;
            this.f16135b = measuredHeight;
            super.setTranslationY(measuredHeight + this.f16134a);
            return;
        }
        setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16135b, z10 ? getMeasuredHeight() : 0.0f);
        this.f16136c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g9(this, i10));
        this.f16136c.addListener(new ag.x(15, this, z10));
        this.f16136c.setDuration(320L);
        this.f16136c.setInterpolator(er.h);
        this.f16136c.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        k9 k9Var = this.h;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, ((org.telegram.ui.ActionBar.e3) k9Var.S).resourcesProvider);
        Paint paint = this.f16137e;
        paint.setColor(iV0);
        paint.setAlpha((int) (this.f16138f.d(k9Var.f16253f.canScrollVertically(1) ? 1.0f : 0.0f, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f16135b;
        this.f16134a = f10;
        super.setTranslationY(f11 + f10);
    }
}
