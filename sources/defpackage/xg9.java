package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class xg9 extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public final Paint b;
    public final Path c;
    public final RectF d;
    public final Outline e;
    public boolean f;
    public final boolean h;
    public boolean n;

    public xg9(Drawable drawable) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f = true;
        this.a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(aob.I.o());
    }

    public final void a(boolean z) {
        float f;
        this.n = z;
        float L = hl.L(12.0f);
        float L2 = hl.L(4.0f);
        if (z) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        this.b.setShadowLayer(L, 0.0f, L2, aob.p1(f, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg9.draw(android.graphics.Canvas):void");
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
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        this.f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f, float f2) {
        this.a.setHotspot(f, f2);
    }

    @Override
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.a.setHotspotBounds(i, i2, i3, i4);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
