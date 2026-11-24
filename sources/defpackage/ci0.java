package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class ci0 extends Drawable {
    public TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final float e;
    public float f;
    public float g;
    public final RectF h;
    public ValueAnimator i;

    public ci0() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = 1.0f;
        this.f = 0.0f;
        this.g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(boolean z, float f) {
        float max = Math.max(Math.min(f, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (!z) {
            this.g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g, max);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 14));
        this.i.addListener(new t7(this, max, (byte) 1));
        this.i.setInterpolator(d53.h);
        this.i.setDuration(200L);
        this.i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i = getBounds().left;
            int i2 = getBounds().top + ((int) this.f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f);
            TextPaint textPaint = this.a;
            Paint paint = this.d;
            Paint paint2 = this.c;
            Paint paint3 = this.b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            float f = this.e;
            if (f != 1.0f) {
                canvas.save();
                canvas.scale(f, f, centerX, centerY);
            }
            paint3.setStrokeWidth(gm.N(1.1f));
            float f2 = i;
            float f3 = width;
            float f4 = i2;
            float f5 = height;
            RectF rectF = this.h;
            rectF.set((((f3 - gm.N(16.33f)) / 2.0f) + f2) - gm.N(1.33f), ((f5 - gm.N(10.33f)) / 2.0f) + f4, (((gm.N(16.33f) + f3) / 2.0f) + f2) - gm.N(1.33f), ((gm.N(10.33f) + f5) / 2.0f) + f4);
            canvas.drawRoundRect(rectF, gm.N(2.33f), gm.N(2.33f), paint3);
            rectF.set((((f3 - gm.N(13.0f)) / 2.0f) + f2) - gm.N(1.66f), ((f5 - gm.N(7.33f)) / 2.0f) + f4, Math.max(gm.N(1.1f), gm.N(13.0f) * this.g) + ((((f3 - gm.N(13.0f)) / 2.0f) + f2) - gm.N(1.66f)), ((gm.N(7.33f) + f5) / 2.0f) + f4);
            canvas.drawRoundRect(rectF, gm.N(0.83f), gm.N(0.83f), paint);
            float f6 = centerY;
            rectF.set((((gm.N(17.5f) + f3) - gm.N(4.66f)) / 2.0f) + f2, f6 - gm.N(2.65f), ((gm.N(4.66f) + (gm.N(17.5f) + f3)) / 2.0f) + f2, gm.N(2.65f) + f6);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (f != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(this.e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(this.e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public ci0(float f, int i) {
        this();
        a(false, f);
        this.b.setColor(-1);
        this.c.setColor(-1);
        this.d.setColor(i);
        this.e = 1.3f;
        invalidateSelf();
    }
}
