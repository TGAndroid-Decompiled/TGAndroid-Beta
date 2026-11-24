package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class t7b extends LinearLayout {
    public float a;
    public float b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final Paint e;
    public final ln f;
    public final v7b h;

    public t7b(v7b v7bVar, Context context) {
        super(context);
        this.h = v7bVar;
        this.e = new Paint(1);
        this.f = new ln(this);
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
            ofFloat.addUpdateListener(new s7b(this, (byte) 0));
            this.c.addListener(new sw9((byte) 5, this, z));
            this.c.setDuration(320L);
            this.c.setInterpolator(d53.h);
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
        int i = cmb.Z6;
        v7b v7bVar = this.h;
        a8b a8bVar = v7bVar.a0;
        int i2 = a8b.X1;
        int v0 = cmb.v0(i, a8bVar.J0);
        Paint paint = this.e;
        paint.setColor(v0);
        if (v7bVar.f.canScrollVertically(1)) {
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
