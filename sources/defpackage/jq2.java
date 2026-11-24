package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
public abstract class jq2 extends Drawable {
    public final byte a;
    public Object b;

    public jq2(View view) {
        this.a = (byte) 0;
        this.b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new wd(this, (byte) 6));
            if (view.isAttachedToWindow()) {
                view.post(new xf2(this, (byte) 7));
            }
        }
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.applyTheme(theme);
                    return;
                }
                return;
            default:
                super.applyTheme(theme);
                return;
        }
    }

    @Override
    public final void clearColorFilter() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.clearColorFilter();
                    return;
                } else {
                    super.clearColorFilter();
                    return;
                }
            default:
                super.clearColorFilter();
                return;
        }
    }

    @Override
    public final Drawable getCurrent() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.getCurrent();
                }
                return super.getCurrent();
            default:
                return super.getCurrent();
        }
    }

    @Override
    public final int getMinimumHeight() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.getMinimumHeight();
                }
                return super.getMinimumHeight();
            default:
                return super.getMinimumHeight();
        }
    }

    @Override
    public final int getMinimumWidth() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.getMinimumWidth();
                }
                return super.getMinimumWidth();
            default:
                return super.getMinimumWidth();
        }
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.getPadding(rect);
                }
                return super.getPadding(rect);
            default:
                return super.getPadding(rect);
        }
    }

    @Override
    public final int[] getState() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.getState();
                }
                return super.getState();
            default:
                return super.getState();
        }
    }

    @Override
    public final Region getTransparentRegion() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.getTransparentRegion();
                }
                return super.getTransparentRegion();
            default:
                return super.getTransparentRegion();
        }
    }

    @Override
    public final void jumpToCurrentState() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                    return;
                }
                return;
            default:
                super.jumpToCurrentState();
                return;
        }
    }

    @Override
    public boolean onLevelChange(int i) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.setLevel(i);
                }
                return super.onLevelChange(i);
            default:
                return super.onLevelChange(i);
        }
    }

    @Override
    public void setAlpha(int i) {
        ((Paint) this.b).setAlpha(i);
    }

    @Override
    public final void setChangingConfigurations(int i) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setChangingConfigurations(i);
                    return;
                } else {
                    super.setChangingConfigurations(i);
                    return;
                }
            default:
                super.setChangingConfigurations(i);
                return;
        }
    }

    @Override
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setColorFilter(i, mode);
                    return;
                } else {
                    super.setColorFilter(i, mode);
                    return;
                }
            default:
                super.setColorFilter(i, mode);
                return;
        }
    }

    @Override
    public final void setFilterBitmap(boolean z) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                    return;
                }
                return;
            default:
                super.setFilterBitmap(z);
                return;
        }
    }

    @Override
    public final void setHotspot(float f, float f2) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                    return;
                }
                return;
            default:
                super.setHotspot(f, f2);
                return;
        }
    }

    @Override
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i, i2, i3, i4);
                    return;
                }
                return;
            default:
                super.setHotspotBounds(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean setState(int[] iArr) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    return drawable.setState(iArr);
                }
                return super.setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    public void a() {
    }

    public void b() {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.b).setColorFilter(colorFilter);
    }

    public jq2() {
        this.a = (byte) 1;
    }
}
