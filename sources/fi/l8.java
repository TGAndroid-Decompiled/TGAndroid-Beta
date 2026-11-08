package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.xq;
public final class l8 extends LinearLayout {
    public float f12343a;
    public float f12344b;
    public ValueAnimator f12345c;
    public ValueAnimator d;
    public final Paint f12346e;
    public final org.telegram.ui.Components.w5 f12347f;
    public final n8 h;

    public l8(n8 n8Var, Context context) {
        super(context);
        this.h = n8Var;
        this.f12346e = new Paint(1);
        this.f12347f = new org.telegram.ui.Components.w5(this);
    }

    public static void a(l8 l8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l8Var.f12344b = floatValue;
        super.setTranslationY(floatValue + l8Var.f12343a);
    }

    public final void b(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f12345c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z10) {
            setVisibility(0);
            float f11 = this.f12344b;
            if (z9) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f12345c = ofFloat;
            ofFloat.addUpdateListener(new k8(this, 0));
            this.f12345c.addListener(new ch.y(12, this, z9));
            this.f12345c.setDuration(320L);
            this.f12345c.setInterpolator(xq.h);
            this.f12345c.start();
            return;
        }
        if (z9) {
            i7 = 8;
        }
        setVisibility(i7);
        if (z9) {
            f10 = getMeasuredHeight();
        }
        this.f12344b = f10;
        super.setTranslationY(f10 + this.f12343a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
        n8 n8Var = this.h;
        s8 s8Var = n8Var.W;
        int i10 = s8.U1;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, s8Var.I0);
        Paint paint = this.f12346e;
        paint.setColor(w02);
        if (n8Var.f12489f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f12347f.e(false, f10) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f12344b;
        this.f12343a = f10;
        super.setTranslationY(f11 + f10);
    }
}
