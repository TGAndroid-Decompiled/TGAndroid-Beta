package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class r86 extends Drawable {
    public static final float[][] h = {new float[]{7.0f, 9.5f, 10.25f}, new float[]{12.0f, 17.0f, 10.25f}, new float[]{7.0f, 13.0f, 13.75f}, new float[]{15.5f, 17.0f, 13.75f}};
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public float d;
    public boolean e;
    public ValueAnimator f;
    public int g;

    public r86(boolean z) {
        float f;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new RectF();
        this.g = 255;
        this.e = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.d = f;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z, boolean z2) {
        long j;
        float f;
        float f2 = 0.0f;
        if (this.e == z) {
            if (this.f == null) {
                float f3 = this.d;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                if (f3 == f) {
                    return;
                }
            } else {
                return;
            }
        }
        this.e = z;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        if (!z2) {
            if (z) {
                f2 = 1.0f;
            }
            this.d = f2;
            invalidateSelf();
            return;
        }
        float f4 = this.d;
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f2);
        this.f = ofFloat;
        if (z) {
            j = 420;
        } else {
            j = 340;
        }
        ofFloat.setDuration(j);
        this.f.setInterpolator(d53.h);
        this.f.addUpdateListener(new fh4(this, (byte) 19));
        this.f.start();
    }

    @Override
    public final void draw(android.graphics.Canvas r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r86.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i) {
        this.g = i;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
