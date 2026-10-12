package ji;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class c2 extends Drawable implements Drawable.Callback {
    public final Drawable f13168a;
    public final Paint f13169b;
    public final Path f13170c;
    public final RectF d;
    public final Outline e;
    public boolean f13171f;

    public c2(Drawable drawable) {
        Paint paint = new Paint(1);
        this.f13169b = paint;
        this.f13170c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f13171f = true;
        this.f13168a = drawable;
        drawable.setCallback(this);
        paint.setColor(0);
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.m1(0.3f, -16777216));
        } else {
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.m1(0.1f, -16777216));
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: ji.c2.draw(android.graphics.Canvas):void");
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
        return this.f13168a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f13168a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f13168a.setBounds(rect);
        this.f13171f = true;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return this.f13168a.setState(iArr);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13168a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13168a.setColorFilter(colorFilter);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        this.f13168a.setHotspot(f7, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f13168a.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public c2(ShapeDrawable shapeDrawable, float f7, float f10) {
        Paint paint = new Paint(1);
        this.f13169b = paint;
        this.f13170c = new Path();
        this.d = new RectF();
        this.e = new Outline();
        this.f13171f = true;
        this.f13168a = shapeDrawable;
        shapeDrawable.setCallback(this);
        paint.setColor(0);
        paint.setShadowLayer(f7, 0.0f, f10, 553648128);
    }
}
