package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.tr;
public final class v9 extends LinearLayout {
    public float f6128a;
    public float f6129b;
    public ValueAnimator f6130c;
    public ValueAnimator d;
    public final Paint f6131e;
    public final org.telegram.ui.Components.e6 f6132f;
    public final x9 h;

    public v9(x9 x9Var, Context context) {
        super(context);
        this.h = x9Var;
        this.f6131e = new Paint(1);
        this.f6132f = new org.telegram.ui.Components.e6(this);
    }

    public static void a(v9 v9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v9Var.f6129b = floatValue;
        super.setTranslationY(floatValue + v9Var.f6128a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f6130c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f6129b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f6130c = ofFloat;
            ofFloat.addUpdateListener(new u9(this, 0));
            this.f6130c.addListener(new ai.n(12, this, z10));
            this.f6130c.setDuration(320L);
            this.f6130c.setInterpolator(tr.h);
            this.f6130c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f6129b = f7;
        super.setTranslationY(f7 + this.f6128a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.i6.f20771a7;
        x9 x9Var = this.h;
        d6Var = ((org.telegram.ui.ActionBar.f3) x9Var.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        Paint paint = this.f6131e;
        paint.setColor(v02);
        if (x9Var.f6307f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f6132f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f6129b;
        this.f6128a = f7;
        super.setTranslationY(f10 + f7);
    }
}
