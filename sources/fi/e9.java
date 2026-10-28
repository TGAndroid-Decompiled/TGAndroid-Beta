package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.ds;
public final class e9 extends LinearLayout {
    public float f10833a;
    public float f10834b;
    public ValueAnimator f10835c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.h6 f10836f;
    public final g9 h;

    public e9(g9 g9Var, Context context) {
        super(context);
        this.h = g9Var;
        this.e = new Paint(1);
        this.f10836f = new org.telegram.ui.Components.h6(this);
    }

    public static void a(e9 e9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e9Var.f10834b = floatValue;
        super.setTranslationY(floatValue + e9Var.f10833a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f10835c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f10834b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f10835c = ofFloat;
            ofFloat.addUpdateListener(new d9(this, 0));
            this.f10835c.addListener(new bh.f0(13, this, z10));
            this.f10835c.setDuration(320L);
            this.f10835c.setInterpolator(ds.h);
            this.f10835c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f10834b = f7;
        super.setTranslationY(f7 + this.f10833a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.y6.f23300a7;
        g9 g9Var = this.h;
        u6Var = ((org.telegram.ui.ActionBar.k3) g9Var.W).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        Paint paint = this.e;
        paint.setColor(w02);
        if (g9Var.f10922f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f10836f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f10834b;
        this.f10833a = f7;
        super.setTranslationY(f10 + f7);
    }
}
