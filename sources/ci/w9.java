package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.rr;
public final class w9 extends LinearLayout {
    public float f5737a;
    public float f5738b;
    public ValueAnimator f5739c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.e6 f5740f;
    public final y9 h;

    public w9(y9 y9Var, Context context) {
        super(context);
        this.h = y9Var;
        this.e = new Paint(1);
        this.f5740f = new org.telegram.ui.Components.e6(this);
    }

    public static void a(w9 w9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w9Var.f5738b = floatValue;
        super.setTranslationY(floatValue + w9Var.f5737a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f5739c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f5738b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f5739c = ofFloat;
            ofFloat.addUpdateListener(new v9(this, 0));
            this.f5739c.addListener(new ai.n(12, this, z10));
            this.f5739c.setDuration(320L);
            this.f5739c.setInterpolator(rr.h);
            this.f5739c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f5738b = f7;
        super.setTranslationY(f7 + this.f5737a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.h6.f18733a7;
        y9 y9Var = this.h;
        d6Var = ((org.telegram.ui.ActionBar.f3) y9Var.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        if (y9Var.f5883f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f5740f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f5738b;
        this.f5737a = f7;
        super.setTranslationY(f10 + f7);
    }
}
