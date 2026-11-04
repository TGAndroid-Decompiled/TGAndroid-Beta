package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class p1 extends Drawable implements Drawable.Callback {
    public Drawable f18700a;
    public boolean f18701b;

    public final void a(Canvas canvas) {
        this.f18700a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f18700a.setHotspot(f10, f11);
    }

    public final void c(int i3, int i10, int i11, int i12) {
        this.f18700a.setHotspotBounds(i3, i10, i11, i12);
    }

    public final boolean d(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f18700a.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f18701b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f18700a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f18700a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f18700a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f18700a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f18700a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f18700a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f18700a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f18700a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f18700a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f18700a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f18700a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f18700a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f18700a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f18700a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i3) {
        return this.f18700a.setLevel(i3);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i3) {
        this.f18700a.setAlpha(i3);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f18700a.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i3) {
        this.f18700a.setChangingConfigurations(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18700a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f18700a.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f18700a.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        if (this.f18701b) {
            b(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i3, int i10, int i11, int i12) {
        if (this.f18701b) {
            c(i3, i10, i11, i12);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f18701b) {
            return this.f18700a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i3) {
        this.f18700a.setTint(i3);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f18700a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f18700a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f18701b) {
            return d(z10, z11);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
