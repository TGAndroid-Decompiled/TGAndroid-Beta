package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.tr;
public final class w9 extends LinearLayout {
    public float f5749a;
    public float f5750b;
    public ValueAnimator f5751c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.e6 f5752f;
    public final y9 h;

    public w9(y9 y9Var, Context context) {
        super(context);
        this.h = y9Var;
        this.e = new Paint(1);
        this.f5752f = new org.telegram.ui.Components.e6(this);
    }

    public static void a(w9 w9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w9Var.f5750b = floatValue;
        super.setTranslationY(floatValue + w9Var.f5749a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f5751c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f5750b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f5751c = ofFloat;
            ofFloat.addUpdateListener(new v9(this, 0));
            this.f5751c.addListener(new ai.n(12, this, z10));
            this.f5751c.setDuration(320L);
            this.f5751c.setInterpolator(tr.h);
            this.f5751c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f5750b = f7;
        super.setTranslationY(f7 + this.f5749a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.h6.f19020a7;
        y9 y9Var = this.h;
        d6Var = ((org.telegram.ui.ActionBar.e3) y9Var.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        if (y9Var.f5895f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f5752f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f5750b;
        this.f5749a = f7;
        super.setTranslationY(f10 + f7);
    }
}
