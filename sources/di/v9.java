package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.es;
public final class v9 extends LinearLayout {
    public float f8011a;
    public float f8012b;
    public ValueAnimator f8013c;
    public ValueAnimator d;
    public final Paint e;
    public final org.telegram.ui.Components.g6 f8014f;
    public final x9 h;

    public v9(x9 x9Var, Context context) {
        super(context);
        this.h = x9Var;
        this.e = new Paint(1);
        this.f8014f = new org.telegram.ui.Components.g6(this);
    }

    public static void a(v9 v9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v9Var.f8012b = floatValue;
        super.setTranslationY(floatValue + v9Var.f8011a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f8013c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            setVisibility(0);
            float f10 = this.f8012b;
            if (z10) {
                f7 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f8013c = ofFloat;
            ofFloat.addUpdateListener(new u9(this, 0));
            this.f8013c.addListener(new ah.p0(13, this, z10));
            this.f8013c.setDuration(320L);
            this.f8013c.setInterpolator(es.h);
            this.f8013c.start();
            return;
        }
        if (z10) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z10) {
            f7 = getMeasuredHeight();
        }
        this.f8012b = f7;
        super.setTranslationY(f7 + this.f8011a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f7;
        super.dispatchDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.g6.f19843a7;
        x9 x9Var = this.h;
        c6Var = ((org.telegram.ui.ActionBar.e3) x9Var.W).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        Paint paint = this.e;
        paint.setColor(w02);
        if (x9Var.f8097f.canScrollVertically(1)) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        paint.setAlpha((int) (this.f8014f.d(f7, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f7) {
        float f10 = this.f8012b;
        this.f8011a = f7;
        super.setTranslationY(f10 + f7);
    }
}
