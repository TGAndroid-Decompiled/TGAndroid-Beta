package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.er;
public final class j8 extends LinearLayout {
    public float f14472a;
    public float f14473b;
    public ValueAnimator f14474c;
    public ValueAnimator d;
    public final Paint f14475e;
    public final org.telegram.ui.Components.u5 f14476f;
    public final l8 h;

    public j8(l8 l8Var, Context context) {
        super(context);
        this.h = l8Var;
        this.f14475e = new Paint(1);
        this.f14476f = new org.telegram.ui.Components.u5(this);
    }

    public static void a(j8 j8Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j8Var.f14473b = floatValue;
        super.setTranslationY(floatValue + j8Var.f14472a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f14474c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            setVisibility(0);
            float f11 = this.f14473b;
            if (z10) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14474c = ofFloat;
            ofFloat.addUpdateListener(new i8(this, 0));
            this.f14474c.addListener(new bi.v4(13, this, z10));
            this.f14474c.setDuration(320L);
            this.f14474c.setInterpolator(er.h);
            this.f14474c.start();
            return;
        }
        if (z10) {
            i7 = 8;
        }
        setVisibility(i7);
        if (z10) {
            f10 = getMeasuredHeight();
        }
        this.f14473b = f10;
        super.setTranslationY(f10 + this.f14472a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
        l8 l8Var = this.h;
        q8 q8Var = l8Var.f14600a0;
        int i10 = q8.Y1;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, q8Var.J0);
        Paint paint = this.f14475e;
        paint.setColor(w02);
        if (l8Var.f14604f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f14476f.e(false, f10) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f14473b;
        this.f14472a = f10;
        super.setTranslationY(f11 + f10);
    }
}
