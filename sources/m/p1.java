package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class p1 extends Drawable implements Drawable.Callback {
    public Drawable f15203a;
    public boolean f15204b;

    public final void a(Canvas canvas) {
        this.f15203a.draw(canvas);
    }

    public final void b(float f7, float f10) {
        this.f15203a.setHotspot(f7, f10);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        this.f15203a.setHotspotBounds(i10, i11, i12, i13);
    }

    public final boolean d(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f15203a.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f15204b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f15203a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f15203a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f15203a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f15203a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f15203a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f15203a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f15203a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f15203a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f15203a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f15203a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f15203a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f15203a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f15203a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f15203a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i10) {
        return this.f15203a.setLevel(i10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f15203a.setAlpha(i10);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f15203a.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        this.f15203a.setChangingConfigurations(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15203a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f15203a.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f15203a.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        if (this.f15204b) {
            b(f7, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f15204b) {
            c(i10, i11, i12, i13);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f15204b) {
            return this.f15203a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i10) {
        this.f15203a.setTint(i10);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f15203a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f15203a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f15204b) {
            return d(z10, z11);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
