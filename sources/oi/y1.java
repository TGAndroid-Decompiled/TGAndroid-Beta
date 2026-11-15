package oi;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.j6;
public final class y1 extends Drawable implements Drawable.Callback {
    public final Drawable f22132a;
    public final Paint f22133b;
    public final Path f22134c;
    public final RectF d;
    public final Outline f22135e;
    public boolean f22136f;
    public final boolean h;
    public boolean f22137n;

    public y1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f22133b = paint;
        this.f22134c = new Path();
        this.d = new RectF();
        this.f22135e = new Outline();
        this.f22136f = true;
        this.f22132a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(j6.I.q());
    }

    public final void a(boolean z10) {
        float f10;
        this.f22137n = z10;
        float L = org.telegram.messenger.g0.L(12.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        if (z10) {
            f10 = 0.3f;
        } else {
            f10 = 0.1f;
        }
        this.f22133b.setShadowLayer(L, 0.0f, L2, j6.r1(f10, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: oi.y1.draw(android.graphics.Canvas):void");
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
        return this.f22132a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f22132a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f22132a.setBounds(rect);
        this.f22136f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f22132a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22132a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22132a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f22132a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        this.f22132a.setHotspotBounds(i7, i10, i11, i12);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
