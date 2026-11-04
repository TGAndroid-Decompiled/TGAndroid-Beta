package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.xq;
public final class m8 extends LinearLayout {
    public float f13261a;
    public float f13262b;
    public ValueAnimator f13263c;
    public ValueAnimator d;
    public final Paint f13264e;
    public final org.telegram.ui.Components.u5 f13265f;
    public final o8 h;

    public m8(o8 o8Var, Context context) {
        super(context);
        this.h = o8Var;
        this.f13264e = new Paint(1);
        this.f13265f = new org.telegram.ui.Components.u5(this);
    }

    public static void a(m8 m8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m8Var.f13262b = floatValue;
        super.setTranslationY(floatValue + m8Var.f13261a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f13263c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i3 = 0;
        if (z11) {
            setVisibility(0);
            float f11 = this.f13262b;
            if (z10) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f13263c = ofFloat;
            ofFloat.addUpdateListener(new l8(this, 0));
            this.f13263c.addListener(new dh.x(13, this, z10));
            this.f13263c.setDuration(320L);
            this.f13263c.setInterpolator(xq.h);
            this.f13263c.start();
            return;
        }
        if (z10) {
            i3 = 8;
        }
        setVisibility(i3);
        if (z10) {
            f10 = getMeasuredHeight();
        }
        this.f13262b = f10;
        super.setTranslationY(f10 + this.f13261a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        int i3 = org.telegram.ui.ActionBar.k6.f27824a7;
        o8 o8Var = this.h;
        t8 t8Var = o8Var.f13340a0;
        int i10 = t8.V1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, t8Var.J0);
        Paint paint = this.f13264e;
        paint.setColor(w02);
        if (o8Var.f13344f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f13265f.e(false, f10) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f13262b;
        this.f13261a = f10;
        super.setTranslationY(f11 + f10);
    }
}
