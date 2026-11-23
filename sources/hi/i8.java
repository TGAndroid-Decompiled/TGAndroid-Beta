package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.nr;
public final class i8 extends LinearLayout {
    public float f14803a;
    public float f14804b;
    public ValueAnimator f14805c;
    public ValueAnimator d;
    public final Paint f14806e;
    public final org.telegram.ui.Components.d6 f14807f;
    public final k8 h;

    public i8(k8 k8Var, Context context) {
        super(context);
        this.h = k8Var;
        this.f14806e = new Paint(1);
        this.f14807f = new org.telegram.ui.Components.d6(this);
    }

    public static void a(i8 i8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i8Var.f14804b = floatValue;
        super.setTranslationY(floatValue + i8Var.f14803a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f14805c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            setVisibility(0);
            float f11 = this.f14804b;
            if (z10) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14805c = ofFloat;
            ofFloat.addUpdateListener(new h8(this, 0));
            this.f14805c.addListener(new bi.g7(13, this, z10));
            this.f14805c.setDuration(320L);
            this.f14805c.setInterpolator(nr.h);
            this.f14805c.start();
            return;
        }
        if (z10) {
            i7 = 8;
        }
        setVisibility(i7);
        if (z10) {
            f10 = getMeasuredHeight();
        }
        this.f14804b = f10;
        super.setTranslationY(f10 + this.f14803a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.m6.f29324a7;
        k8 k8Var = this.h;
        p8 p8Var = k8Var.f14930a0;
        int i10 = p8.Y1;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, p8Var.J0);
        Paint paint = this.f14806e;
        paint.setColor(w02);
        if (k8Var.f14934f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f14807f.e(false, f10) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f14804b;
        this.f14803a = f10;
        super.setTranslationY(f11 + f10);
    }
}
