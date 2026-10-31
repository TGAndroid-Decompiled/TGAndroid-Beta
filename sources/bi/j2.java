package bi;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class j2 extends Drawable implements Drawable.Callback {
    public final Drawable f3114a;
    public final Paint f3115b;
    public final Path f3116c;
    public final RectF d;
    public final Outline e;
    public boolean f3117f;
    public final boolean h;
    public boolean f3118n;

    public j2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f3115b = paint;
        this.f3116c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f3117f = true;
        this.f3114a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(org.telegram.ui.ActionBar.t6.I.q());
    }

    public final void a(boolean z10) {
        float f7;
        this.f3118n = z10;
        float L = org.telegram.messenger.i0.L(12.0f);
        float L2 = org.telegram.messenger.i0.L(4.0f);
        if (z10) {
            f7 = 0.3f;
        } else {
            f7 = 0.1f;
        }
        this.f3115b.setShadowLayer(L, 0.0f, L2, org.telegram.ui.ActionBar.t6.r1(f7, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j2.draw(android.graphics.Canvas):void");
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
        return this.f3114a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f3114a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f3114a.setBounds(rect);
        this.f3117f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f3114a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f3114a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3114a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        this.f3114a.setHotspot(f7, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f3114a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
