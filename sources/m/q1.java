package m;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public final class q1 extends Drawable implements Drawable.Callback {

    public Drawable f17435a;

    public boolean f17436b;

    public final void a(Canvas canvas) {
        this.f17435a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f17435a.setHotspot(f10, f11);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        this.f17435a.setHotspotBounds(i10, i11, i12, i13);
    }

    public final boolean d(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f17435a.setVisible(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f17436b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f17435a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.f17435a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f17435a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f17435a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f17435a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f17435a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f17435a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f17435a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f17435a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f17435a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f17435a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.f17435a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.f17435a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.f17435a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i10) {
        return this.f17435a.setLevel(i10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f17435a.setAlpha(i10);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f17435a.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        this.f17435a.setChangingConfigurations(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17435a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f17435a.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f17435a.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        if (this.f17436b) {
            b(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f17436b) {
            c(i10, i11, i12, i13);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.f17436b) {
            return this.f17435a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i10) {
        this.f17435a.setTint(i10);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.f17435a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f17435a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f17436b) {
            return d(z10, z11);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
