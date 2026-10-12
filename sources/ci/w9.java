package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.js;
public final class w9 extends LinearLayout {
    public float f6218a;
    public float f6219b;
    public ValueAnimator f6220c;
    public ValueAnimator d;
    public final Paint f6221e;
    public final org.telegram.ui.Components.g6 f6222f;
    public final y9 h;

    public w9(y9 y9Var, Context context) {
        super(context);
        this.h = y9Var;
        this.f6221e = new Paint(1);
        this.f6222f = new org.telegram.ui.Components.g6(this);
    }

    public static void a(w9 w9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w9Var.f6219b = floatValue;
        super.setTranslationY(floatValue + w9Var.f6218a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f6220c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f6219b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f6220c = ofFloat;
            ofFloat.addUpdateListener(new v9(this, 0));
            this.f6220c.addListener(new ai.n(12, this, z10));
            this.f6220c.setDuration(320L);
            this.f6220c.setInterpolator(js.h);
            this.f6220c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f6219b = f7;
        super.setTranslationY(f7 + this.f6218a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.h6.f20503a7;
        y9 y9Var = this.h;
        c6Var = ((org.telegram.ui.ActionBar.e3) y9Var.W).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
        Paint paint = this.f6221e;
        paint.setColor(w02);
        if (y9Var.f6362f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f6222f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f6219b;
        this.f6218a = f7;
        super.setTranslationY(f10 + f7);
    }
}
