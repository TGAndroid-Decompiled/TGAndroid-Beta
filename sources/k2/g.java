package k2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
public abstract class g extends Drawable implements j0.b {
    public Drawable f14533a;

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final void clearColorFilter() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override
    public final Drawable getCurrent() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override
    public final int getMinimumHeight() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override
    public final void jumpToCurrentState() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public boolean onLevelChange(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        return super.onLevelChange(i9);
    }

    @Override
    public final void setChangingConfigurations(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i9);
        } else {
            super.setChangingConfigurations(i9);
        }
    }

    @Override
    public final void setColorFilter(int i9, PorterDuff.Mode mode) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setColorFilter(i9, mode);
        } else {
            super.setColorFilter(i9, mode);
        }
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i9, int i10, int i11, int i12) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setHotspotBounds(i9, i10, i11, i12);
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
