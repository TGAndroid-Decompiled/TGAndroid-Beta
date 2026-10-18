package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.bs;
public final class i9 extends LinearLayout {
    public float f9208a;
    public float f9209b;
    public ValueAnimator f9210c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.f6 f9211f;
    public final k9 h;

    public i9(k9 k9Var, Context context) {
        super(context);
        this.h = k9Var;
        this.e = new Paint(1);
        this.f9211f = new org.telegram.ui.Components.f6(this);
    }

    public static void a(i9 i9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i9Var.f9209b = floatValue;
        super.setTranslationY(floatValue + i9Var.f9208a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f9210c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f9209b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f9210c = ofFloat;
            ofFloat.addUpdateListener(new h9(this, 0));
            this.f9210c.addListener(new ah.p0(13, this, z10));
            this.f9210c.setDuration(320L);
            this.f9210c.setInterpolator(bs.h);
            this.f9210c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f9209b = f7;
        super.setTranslationY(f7 + this.f9208a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.h6.f20935a7;
        k9 k9Var = this.h;
        d6Var = ((org.telegram.ui.ActionBar.f3) k9Var.W).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        Paint paint = this.e;
        paint.setColor(w02);
        if (k9Var.f9331f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f9211f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f9209b;
        this.f9208a = f7;
        super.setTranslationY(f10 + f7);
    }
}
