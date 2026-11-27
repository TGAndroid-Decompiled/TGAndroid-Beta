package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public final class tr3 extends Drawable implements Drawable.Callback {
    public Drawable a;
    public boolean b;

    public final void a(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final void b(float f, float f2) {
        this.a.setHotspot(f, f2);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.a.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean d(boolean z, boolean z2) {
        if (!super.setVisible(z, z2) && !this.a.setVisible(z, z2)) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.b) {
            a(canvas);
        }
    }

    @Override
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override
    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.a.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.a.isAutoMirrored();
    }

    @Override
    public final boolean isStateful() {
        return this.a.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    @Override
    public final boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setAutoMirrored(boolean z) {
        this.a.setAutoMirrored(z);
    }

    @Override
    public final void setChangingConfigurations(int i) {
        this.a.setChangingConfigurations(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z) {
        this.a.setDither(z);
    }

    @Override
    public final void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }

    @Override
    public final void setHotspot(float f, float f2) {
        if (this.b) {
            b(f, f2);
        }
    }

    @Override
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.b) {
            c(i, i2, i3, i4);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (this.b) {
            return this.a.setState(iArr);
        }
        return false;
    }

    @Override
    public final void setTint(int i) {
        this.a.setTint(i);
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.setTintMode(mode);
    }

    @Override
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b) {
            return d(z, z2);
        }
        return false;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
