package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pr;
public final class z9 extends LinearLayout {
    public float f8556a;
    public float f8557b;
    public ValueAnimator f8558c;
    public ValueAnimator d;
    public final Paint f8559e;
    public final org.telegram.ui.Components.e6 f8560f;
    public final ba h;

    public z9(ba baVar, Context context) {
        super(context);
        this.h = baVar;
        this.f8559e = new Paint(1);
        this.f8560f = new org.telegram.ui.Components.e6(this);
    }

    public static void a(z9 z9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z9Var.f8557b = floatValue;
        super.setTranslationY(floatValue + z9Var.f8556a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f8558c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f8557b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f8558c = ofFloat;
            ofFloat.addUpdateListener(new y9(this, 0));
            this.f8558c.addListener(new ah.q0(13, this, z10));
            this.f8558c.setDuration(320L);
            this.f8558c.setInterpolator(pr.h);
            this.f8558c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f8557b = f7;
        super.setTranslationY(f7 + this.f8556a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.f20634a7;
        ba baVar = this.h;
        f6Var = ((org.telegram.ui.ActionBar.f3) baVar.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.f8559e;
        paint.setColor(v02);
        if (baVar.f6988f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f8560f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f8557b;
        this.f8556a = f7;
        super.setTranslationY(f10 + f7);
    }
}
