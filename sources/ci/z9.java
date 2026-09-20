package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.qr;
public final class z9 extends LinearLayout {
    public float f5878a;
    public float f5879b;
    public ValueAnimator f5880c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.d6 f5881f;
    public final ba h;

    public z9(ba baVar, Context context) {
        super(context);
        this.h = baVar;
        this.e = new Paint(1);
        this.f5881f = new org.telegram.ui.Components.d6(this);
    }

    public static void a(z9 z9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z9Var.f5879b = floatValue;
        super.setTranslationY(floatValue + z9Var.f5878a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f5880c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f5879b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f5880c = ofFloat;
            ofFloat.addUpdateListener(new y9(this, 0));
            this.f5880c.addListener(new ai.n(12, this, z10));
            this.f5880c.setDuration(320L);
            this.f5880c.setInterpolator(qr.h);
            this.f5880c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f5879b = f7;
        super.setTranslationY(f7 + this.f5878a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.f19038a7;
        ba baVar = this.h;
        f6Var = ((org.telegram.ui.ActionBar.f3) baVar.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        if (baVar.f4405f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f5881f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f5879b;
        this.f5878a = f7;
        super.setTranslationY(f10 + f7);
    }
}
