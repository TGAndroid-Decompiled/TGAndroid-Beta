package mi;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.k6;
public final class b2 extends Drawable implements Drawable.Callback {
    public final Drawable f19472a;
    public final Paint f19473b;
    public final Path f19474c;
    public final RectF d;
    public final Outline f19475e;
    public boolean f19476f;
    public final boolean h;
    public boolean f19477n;

    public b2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f19473b = paint;
        this.f19474c = new Path();
        this.d = new RectF();
        this.f19475e = new Outline();
        this.f19476f = true;
        this.f19472a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(k6.I.q());
    }

    public final void a(boolean z10) {
        float f10;
        this.f19477n = z10;
        float L = org.telegram.messenger.g0.L(12.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        if (z10) {
            f10 = 0.3f;
        } else {
            f10 = 0.1f;
        }
        this.f19473b.setShadowLayer(L, 0.0f, L2, k6.r1(f10, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: mi.b2.draw(android.graphics.Canvas):void");
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
        return this.f19472a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f19472a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f19472a.setBounds(rect);
        this.f19476f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f19472a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i3) {
        this.f19472a.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19472a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f19472a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i3, int i10, int i11, int i12) {
        this.f19472a.setHotspotBounds(i3, i10, i11, i12);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
