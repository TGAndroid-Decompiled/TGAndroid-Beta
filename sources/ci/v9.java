package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.tr;
public final class v9 extends LinearLayout {
    public float f6127a;
    public float f6128b;
    public ValueAnimator f6129c;
    public ValueAnimator d;
    public final Paint f6130e;
    public final org.telegram.ui.Components.e6 f6131f;
    public final x9 h;

    public v9(x9 x9Var, Context context) {
        super(context);
        this.h = x9Var;
        this.f6130e = new Paint(1);
        this.f6131f = new org.telegram.ui.Components.e6(this);
    }

    public static void a(v9 v9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v9Var.f6128b = floatValue;
        super.setTranslationY(floatValue + v9Var.f6127a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f6129c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f6128b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f6129c = ofFloat;
            ofFloat.addUpdateListener(new u9(this, 0));
            this.f6129c.addListener(new ai.n(12, this, z10));
            this.f6129c.setDuration(320L);
            this.f6129c.setInterpolator(tr.h);
            this.f6129c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f6128b = f7;
        super.setTranslationY(f7 + this.f6127a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.i6.f20761a7;
        x9 x9Var = this.h;
        d6Var = ((org.telegram.ui.ActionBar.f3) x9Var.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        Paint paint = this.f6130e;
        paint.setColor(v02);
        if (x9Var.f6306f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f6131f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f6128b;
        this.f6127a = f7;
        super.setTranslationY(f10 + f7);
    }
}
