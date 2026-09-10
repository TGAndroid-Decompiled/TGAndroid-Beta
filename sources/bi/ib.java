package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.wr;
public final class ib extends LinearLayout {
    public float f2888a;
    public float f2889b;
    public ValueAnimator f2890c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.d6 f2891f;
    public final kb h;

    public ib(kb kbVar, Context context) {
        super(context);
        this.h = kbVar;
        this.e = new Paint(1);
        this.f2891f = new org.telegram.ui.Components.d6(this);
    }

    public static void a(ib ibVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ibVar.f2889b = floatValue;
        super.setTranslationY(floatValue + ibVar.f2888a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f2890c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 8;
        float f7 = 0.0f;
        if (z11) {
            setVisibility(0);
            float f10 = this.f2889b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f2890c = ofFloat;
            ofFloat.addUpdateListener(new hb(this, 0));
            this.f2890c.addListener(new ai.e(8, this, z10));
            this.f2890c.setDuration(320L);
            this.f2890c.setInterpolator(wr.h);
            this.f2890c.start();
            return;
        }
        if (!z10) {
            i10 = 0;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f2889b = f7;
        super.setTranslationY(f7 + this.f2888a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        kb kbVar = this.h;
        f6Var = ((org.telegram.ui.ActionBar.h3) kbVar.W).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        Paint paint = this.e;
        paint.setColor(v02);
        if (kbVar.f3009f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f2891f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f2889b;
        this.f2888a = f7;
        super.setTranslationY(f10 + f7);
    }
}
