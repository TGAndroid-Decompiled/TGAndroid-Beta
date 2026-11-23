package oi;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.m6;
public final class z1 extends Drawable implements Drawable.Callback {
    public final Drawable f22537a;
    public final Paint f22538b;
    public final Path f22539c;
    public final RectF d;
    public final Outline f22540e;
    public boolean f22541f;
    public final boolean h;
    public boolean f22542n;

    public z1(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f22538b = paint;
        this.f22539c = new Path();
        this.d = new RectF();
        this.f22540e = new Outline();
        this.f22541f = true;
        this.f22537a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(m6.I.q());
    }

    public final void a(boolean z10) {
        float f10;
        this.f22542n = z10;
        float L = org.telegram.messenger.g0.L(12.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        if (z10) {
            f10 = 0.3f;
        } else {
            f10 = 0.1f;
        }
        this.f22538b.setShadowLayer(L, 0.0f, L2, m6.r1(f10, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: oi.z1.draw(android.graphics.Canvas):void");
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
        return this.f22537a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f22537a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f22537a.setBounds(rect);
        this.f22541f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f22537a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f22537a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22537a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f22537a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        this.f22537a.setHotspotBounds(i7, i10, i11, i12);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
