package li;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.k6;
public final class a2 extends Drawable implements Drawable.Callback {
    public final Drawable f18413a;
    public final Paint f18414b;
    public final Path f18415c;
    public final RectF d;
    public final Outline f18416e;
    public boolean f18417f;
    public final boolean h;
    public boolean f18418n;

    public a2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f18414b = paint;
        this.f18415c = new Path();
        this.d = new RectF();
        this.f18416e = new Outline();
        this.f18417f = true;
        this.f18413a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        this.h = true;
        a(k6.I.q());
    }

    public final void a(boolean z9) {
        float f10;
        this.f18418n = z9;
        float L = org.telegram.messenger.g0.L(12.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        if (z9) {
            f10 = 0.3f;
        } else {
            f10 = 0.1f;
        }
        this.f18414b.setShadowLayer(L, 0.0f, L2, k6.r1(f10, -16777216));
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: li.a2.draw(android.graphics.Canvas):void");
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
        return this.f18413a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f18413a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f18413a.setBounds(rect);
        this.f18417f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f18413a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f18413a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18413a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f18413a.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        this.f18413a.setHotspotBounds(i7, i10, i11, i12);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
