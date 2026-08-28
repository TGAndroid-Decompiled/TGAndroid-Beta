package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.gr;
public final class l9 extends LinearLayout {
    public float f15609a;
    public float f15610b;
    public ValueAnimator f15611c;
    public ValueAnimator d;
    public final Paint f15612e;
    public final org.telegram.ui.Components.y5 f15613f;
    public final n9 h;

    public l9(n9 n9Var, Context context) {
        super(context);
        this.h = n9Var;
        this.f15612e = new Paint(1);
        this.f15613f = new org.telegram.ui.Components.y5(this);
    }

    public static void a(l9 l9Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l9Var.f15610b = floatValue;
        super.setTranslationY(floatValue + l9Var.f15609a);
    }

    public final void b(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f15611c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        int i9 = 0;
        if (z11) {
            setVisibility(0);
            float f11 = this.f15610b;
            if (z10) {
                f10 = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15611c = ofFloat;
            ofFloat.addUpdateListener(new k9(this, 0));
            this.f15611c.addListener(new hg.b0(13, this, z10));
            this.f15611c.setDuration(320L);
            this.f15611c.setInterpolator(gr.h);
            this.f15611c.start();
            return;
        }
        if (z10) {
            i9 = 8;
        }
        setVisibility(i9);
        if (z10) {
            f10 = getMeasuredHeight();
        }
        this.f15610b = f10;
        super.setTranslationY(f10 + this.f15609a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        super.dispatchDraw(canvas);
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        n9 n9Var = this.h;
        b6Var = ((org.telegram.ui.ActionBar.f3) n9Var.S).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        Paint paint = this.f15612e;
        paint.setColor(v02);
        if (n9Var.f15771f.canScrollVertically(1)) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        paint.setAlpha((int) (this.f15613f.d(f10, false) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f10) {
        float f11 = this.f15610b;
        this.f15609a = f10;
        super.setTranslationY(f11 + f10);
    }
}
