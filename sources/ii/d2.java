package ii;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class d2 extends Drawable implements Drawable.Callback {
    public final Drawable f11303a;
    public final Paint f11304b;
    public final Path f11305c;
    public final RectF d;
    public final Outline e;
    public boolean f11306f;

    public d2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f11304b = paint;
        this.f11305c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f11306f = true;
        this.f11303a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (org.telegram.ui.ActionBar.h6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.l1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.l1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: ii.d2.draw(android.graphics.Canvas):void");
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
        return this.f11303a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f11303a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f11303a.setBounds(rect);
        this.f11306f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f11303a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11303a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11303a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        this.f11303a.setHotspot(f7, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f11303a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
