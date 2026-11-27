package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public final class cx8 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final Paint c;
    public final RectF d;
    public int e;
    public long f;
    public float g;
    public boolean h;
    public boolean i;

    public cx8(Context context) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new RectF();
        this.e = 0;
        this.a = c00.e(context, 2131232523);
        this.b = c00.e(context, 2131232522);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f = SystemClock.elapsedRealtime();
    }

    public final void a(Drawable drawable) {
        Rect bounds = getBounds();
        drawable.setBounds(bp1.A(2, bounds.centerX(), drawable), bp1.y(2, bounds.centerY(), drawable), bp1.w(2, bounds.centerX(), drawable), bp1.i(2, bounds.centerY(), drawable));
    }

    public final void b(boolean z, boolean z2, boolean z3) {
        float f;
        this.i = z;
        this.h = z2;
        this.f = SystemClock.elapsedRealtime();
        if (!z3) {
            if (this.h) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.g = f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cx8.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i) {
    }
}
