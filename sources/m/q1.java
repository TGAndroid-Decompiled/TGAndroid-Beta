package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class q1 extends Drawable implements Drawable.Callback {
    public Drawable f19226a;
    public boolean f19227b;

    public final void a(Canvas canvas) {
        this.f19226a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f19226a.setHotspot(f10, f11);
    }

    public final void c(int i7, int i10, int i11, int i12) {
        this.f19226a.setHotspotBounds(i7, i10, i11, i12);
    }

    public final boolean d(boolean z9, boolean z10) {
        if (!super.setVisible(z9, z10) && !this.f19226a.setVisible(z9, z10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f19227b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f19226a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f19226a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f19226a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f19226a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f19226a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f19226a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f19226a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f19226a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f19226a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f19226a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f19226a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f19226a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f19226a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f19226a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i7) {
        return this.f19226a.setLevel(i7);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f19226a.setAlpha(i7);
    }

    @Override
    public final void setAutoMirrored(boolean z9) {
        this.f19226a.setAutoMirrored(z9);
    }

    @Override
    public final void setChangingConfigurations(int i7) {
        this.f19226a.setChangingConfigurations(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19226a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z9) {
        this.f19226a.setDither(z9);
    }

    @Override
    public final void setFilterBitmap(boolean z9) {
        this.f19226a.setFilterBitmap(z9);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        if (this.f19227b) {
            b(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        if (this.f19227b) {
            c(i7, i10, i11, i12);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f19227b) {
            return this.f19226a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i7) {
        this.f19226a.setTint(i7);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f19226a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f19226a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z9, boolean z10) {
        if (this.f19227b) {
            return d(z9, z10);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
