package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.pr;
public final class z9 extends LinearLayout {
    public float f8528a;
    public float f8529b;
    public ValueAnimator f8530c;
    public ValueAnimator d;
    public final Paint f8531e;
    public final org.telegram.ui.Components.e6 f8532f;
    public final ba h;

    public z9(ba baVar, Context context) {
        super(context);
        this.h = baVar;
        this.f8531e = new Paint(1);
        this.f8532f = new org.telegram.ui.Components.e6(this);
    }

    public static void a(z9 z9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z9Var.f8529b = floatValue;
        super.setTranslationY(floatValue + z9Var.f8528a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f8530c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f8529b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f8530c = ofFloat;
            ofFloat.addUpdateListener(new y9(this, 0));
            this.f8530c.addListener(new ah.q0(13, this, z10));
            this.f8530c.setDuration(320L);
            this.f8530c.setInterpolator(pr.h);
            this.f8530c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f8529b = f7;
        super.setTranslationY(f7 + this.f8528a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.f20607a7;
        ba baVar = this.h;
        f6Var = ((org.telegram.ui.ActionBar.f3) baVar.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.f8531e;
        paint.setColor(v02);
        if (baVar.f6960f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f8532f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f8529b;
        this.f8528a = f7;
        super.setTranslationY(f10 + f7);
    }
}
