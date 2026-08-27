package k2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class g extends Drawable implements j0.b {

    public Drawable f14354a;

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final void clearColorFilter() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override
    public final Drawable getCurrent() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override
    public final int getMinimumHeight() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override
    public final void jumpToCurrentState() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.setLevel(i10) : super.onLevelChange(i10);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i10);
        } else {
            super.setChangingConfigurations(i10);
        }
    }

    @Override
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setColorFilter(i10, mode);
        } else {
            super.setColorFilter(i10, mode);
        }
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
