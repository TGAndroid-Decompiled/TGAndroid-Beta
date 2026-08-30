package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class q1 extends Drawable implements Drawable.Callback {
    public Drawable f13611a;
    public boolean f13612b;

    public final void a(Canvas canvas) {
        this.f13611a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f13611a.setHotspot(f10, f11);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        this.f13611a.setHotspotBounds(i10, i11, i12, i13);
    }

    public final boolean d(boolean z4, boolean z10) {
        if (!super.setVisible(z4, z10) && !this.f13611a.setVisible(z4, z10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f13612b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f13611a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f13611a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f13611a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13611a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f13611a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f13611a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f13611a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f13611a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f13611a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f13611a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f13611a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f13611a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f13611a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f13611a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i10) {
        return this.f13611a.setLevel(i10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13611a.setAlpha(i10);
    }

    @Override
    public final void setAutoMirrored(boolean z4) {
        this.f13611a.setAutoMirrored(z4);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        this.f13611a.setChangingConfigurations(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13611a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z4) {
        this.f13611a.setDither(z4);
    }

    @Override
    public final void setFilterBitmap(boolean z4) {
        this.f13611a.setFilterBitmap(z4);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        if (this.f13612b) {
            b(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f13612b) {
            c(i10, i11, i12, i13);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f13612b) {
            return this.f13611a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i10) {
        this.f13611a.setTint(i10);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f13611a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f13611a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z4, boolean z10) {
        if (this.f13612b) {
            return d(z4, z10);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
