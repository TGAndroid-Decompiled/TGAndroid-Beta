package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class r5b extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final lm f;
    public final t5b h;

    public r5b(t5b t5bVar, Context context) {
        super(context);
        this.h = t5bVar;
        this.e = new Paint(1);
        this.f = new lm(this);
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = 0.0f;
        int i = 0;
        if (z2) {
            setVisibility(0);
            float f2 = this.b;
            if (z) {
                f = getMeasuredHeight();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new q5b(this, (byte) 0));
            this.c.addListener(new pu9((byte) 5, this, z));
            this.c.setDuration(320L);
            this.c.setInterpolator(s33.h);
            this.c.start();
            return;
        }
        if (z) {
            i = 8;
        }
        setVisibility(i);
        if (z) {
            f = getMeasuredHeight();
        }
        this.b = f;
        super.setTranslationY(f + this.a);
    }

    public final void b(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.b = floatValue;
        super.setTranslationY(floatValue + this.a);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        int i = bkb.Z6;
        t5b t5bVar = this.h;
        y5b y5bVar = t5bVar.a0;
        int i2 = y5b.X1;
        int v0 = bkb.v0(i, y5bVar.J0);
        Paint paint = this.e;
        paint.setColor(v0);
        if (t5bVar.f.canScrollVertically(1)) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        paint.setAlpha((int) (this.f.e(false, f) * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
    }

    @Override
    public final void setTranslationY(float f) {
        float f2 = this.b;
        this.a = f;
        super.setTranslationY(f2 + f);
    }
}
