package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class q1 extends Drawable implements Drawable.Callback {
    public Drawable f19223a;
    public boolean f19224b;

    public final void a(Canvas canvas) {
        this.f19223a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f19223a.setHotspot(f10, f11);
    }

    public final void c(int i7, int i10, int i11, int i12) {
        this.f19223a.setHotspotBounds(i7, i10, i11, i12);
    }

    public final boolean d(boolean z9, boolean z10) {
        if (!super.setVisible(z9, z10) && !this.f19223a.setVisible(z9, z10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f19224b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f19223a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f19223a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f19223a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f19223a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f19223a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f19223a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f19223a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f19223a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f19223a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f19223a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f19223a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f19223a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f19223a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f19223a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i7) {
        return this.f19223a.setLevel(i7);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i7) {
        this.f19223a.setAlpha(i7);
    }

    @Override
    public final void setAutoMirrored(boolean z9) {
        this.f19223a.setAutoMirrored(z9);
    }

    @Override
    public final void setChangingConfigurations(int i7) {
        this.f19223a.setChangingConfigurations(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19223a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z9) {
        this.f19223a.setDither(z9);
    }

    @Override
    public final void setFilterBitmap(boolean z9) {
        this.f19223a.setFilterBitmap(z9);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        if (this.f19224b) {
            b(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        if (this.f19224b) {
            c(i7, i10, i11, i12);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f19224b) {
            return this.f19223a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i7) {
        this.f19223a.setTint(i7);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f19223a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f19223a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z9, boolean z10) {
        if (this.f19224b) {
            return d(z9, z10);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
