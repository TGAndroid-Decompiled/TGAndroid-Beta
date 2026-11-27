package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class ez7 extends Drawable implements Drawable.Callback {
    public final jl0 a;
    public final RectF b = new RectF();
    public int c = 255;

    public ez7(jl0 jl0Var) {
        this.a = jl0Var;
        jl0Var.setCallback(this);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        float f = this.c / 255.0f;
        fz8.c(canvas, rectF, min, f);
        fz8.a(min, f, 0, canvas, rectF);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        this.c = i;
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
