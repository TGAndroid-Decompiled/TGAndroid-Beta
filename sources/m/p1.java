package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class p1 extends Drawable implements Drawable.Callback {
    public Drawable f17814a;
    public boolean f17815b;

    public final void a(Canvas canvas) {
        this.f17814a.draw(canvas);
    }

    public final void b(float f7, float f10) {
        this.f17814a.setHotspot(f7, f10);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        this.f17814a.setHotspotBounds(i10, i11, i12, i13);
    }

    public final boolean d(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f17814a.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f17815b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f17814a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f17814a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f17814a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f17814a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f17814a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f17814a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f17814a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f17814a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f17814a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f17814a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f17814a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f17814a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f17814a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f17814a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i10) {
        return this.f17814a.setLevel(i10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17814a.setAlpha(i10);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f17814a.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        this.f17814a.setChangingConfigurations(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17814a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f17814a.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f17814a.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        if (this.f17815b) {
            b(f7, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f17815b) {
            c(i10, i11, i12, i13);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f17815b) {
            return this.f17814a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i10) {
        this.f17814a.setTint(i10);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f17814a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f17814a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f17815b) {
            return d(z10, z11);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
