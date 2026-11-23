package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.kr;
public final class d9 extends LinearLayout {
    public float f14319a;
    public float f14320b;
    public ValueAnimator f14321c;
    public ValueAnimator d;
    public final Paint f14322e;
    public final org.telegram.ui.Components.c6 f14323f;
    public final f9 h;

    public d9(f9 f9Var, Context context) {
        super(context);
        this.h = f9Var;
        this.f14322e = new Paint(1);
        this.f14323f = new org.telegram.ui.Components.c6(this);
    }

    public static void a(d9 d9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d9Var.f14320b = floatValue;
        super.setTranslationY(floatValue + d9Var.f14319a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f14321c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i7 = 0;
        if (z11) {
            setVisibility(0);
            float f11 = this.f14320b;
            if (z10) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14321c = ofFloat;
            ofFloat.addUpdateListener(new c9(this, 0));
            this.f14321c.addListener(new bi.j7(13, this, z10));
            this.f14321c.setDuration(320L);
            this.f14321c.setInterpolator(kr.h);
            this.f14321c.start();
            return;
        }
        if (z10) {
            i7 = 8;
        }
        setVisibility(i7);
        if (z10) {
            f10 = getMeasuredHeight();
        }
        this.f14320b = f10;
        super.setTranslationY(f10 + this.f14319a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.n6.f29394a7;
        f9 f9Var = this.h;
        k9 k9Var = f9Var.f14495a0;
        int i10 = k9.Y1;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, k9Var.J0);
        Paint paint = this.f14322e;
        paint.setColor(w02);
        if (f9Var.f14499f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f14323f.e(false, f10) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f14320b;
        this.f14319a = f10;
        super.setTranslationY(f11 + f10);
    }
}
