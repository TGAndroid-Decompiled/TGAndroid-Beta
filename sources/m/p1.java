package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class p1 extends Drawable implements Drawable.Callback {
    public Drawable f20207a;
    public boolean f20208b;

    public final void a(Canvas canvas) {
        this.f20207a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f20207a.setHotspot(f10, f11);
    }

    public final void c(int i7, int i10, int i11, int i12) {
        this.f20207a.setHotspotBounds(i7, i10, i11, i12);
    }

    public final boolean d(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f20207a.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f20208b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f20207a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f20207a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f20207a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f20207a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f20207a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f20207a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f20207a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f20207a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f20207a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f20207a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f20207a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f20207a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f20207a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f20207a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i7) {
        return this.f20207a.setLevel(i7);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f20207a.setAlpha(i7);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f20207a.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i7) {
        this.f20207a.setChangingConfigurations(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20207a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f20207a.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f20207a.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        if (this.f20208b) {
            b(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        if (this.f20208b) {
            c(i7, i10, i11, i12);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f20208b) {
            return this.f20207a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i7) {
        this.f20207a.setTint(i7);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f20207a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f20207a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f20208b) {
            return d(z10, z11);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
