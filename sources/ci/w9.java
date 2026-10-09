package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.hs;
public final class w9 extends LinearLayout {
    public float f6220a;
    public float f6221b;
    public ValueAnimator f6222c;
    public ValueAnimator d;
    public final Paint f6223e;
    public final org.telegram.ui.Components.g6 f6224f;
    public final y9 h;

    public w9(y9 y9Var, Context context) {
        super(context);
        this.h = y9Var;
        this.f6223e = new Paint(1);
        this.f6224f = new org.telegram.ui.Components.g6(this);
    }

    public static void a(w9 w9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        w9Var.f6221b = floatValue;
        super.setTranslationY(floatValue + w9Var.f6220a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f6222c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f6221b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f6222c = ofFloat;
            ofFloat.addUpdateListener(new v9(this, 0));
            this.f6222c.addListener(new ai.n(12, this, z10));
            this.f6222c.setDuration(320L);
            this.f6222c.setInterpolator(hs.h);
            this.f6222c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f6221b = f7;
        super.setTranslationY(f7 + this.f6220a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.i6.f20741a7;
        y9 y9Var = this.h;
        e6Var = ((org.telegram.ui.ActionBar.f3) y9Var.W).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        Paint paint = this.f6223e;
        paint.setColor(w02);
        if (y9Var.f6364f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f6224f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f6221b;
        this.f6220a = f7;
        super.setTranslationY(f10 + f7);
    }
}
