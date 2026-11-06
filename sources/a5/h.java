package a5;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import bi.m6;
import org.telegram.ui.Components.gp;
public abstract class h extends Drawable {
    public final int f219a;
    public Object f220b;

    public h() {
        this.f219a = 0;
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
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
    public void clearColorFilter() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
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
    public Drawable getCurrent() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.getCurrent();
                }
                return super.getCurrent();
            default:
                return super.getCurrent();
        }
    }

    @Override
    public int getMinimumHeight() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.getMinimumHeight();
                }
                return super.getMinimumHeight();
            default:
                return super.getMinimumHeight();
        }
    }

    @Override
    public int getMinimumWidth() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
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
    public boolean getPadding(Rect rect) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.getPadding(rect);
                }
                return super.getPadding(rect);
            default:
                return super.getPadding(rect);
        }
    }

    @Override
    public int[] getState() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.getState();
                }
                return super.getState();
            default:
                return super.getState();
        }
    }

    @Override
    public Region getTransparentRegion() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.getTransparentRegion();
                }
                return super.getTransparentRegion();
            default:
                return super.getTransparentRegion();
        }
    }

    @Override
    public void jumpToCurrentState() {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
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
    public boolean onLevelChange(int i7) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.setLevel(i7);
                }
                return super.onLevelChange(i7);
            default:
                return super.onLevelChange(i7);
        }
    }

    @Override
    public void setAlpha(int i7) {
        ((Paint) this.f220b).setAlpha(i7);
    }

    @Override
    public void setChangingConfigurations(int i7) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    drawable.setChangingConfigurations(i7);
                    return;
                } else {
                    super.setChangingConfigurations(i7);
                    return;
                }
            default:
                super.setChangingConfigurations(i7);
                return;
        }
    }

    @Override
    public void setColorFilter(int i7, PorterDuff.Mode mode) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    drawable.setColorFilter(i7, mode);
                    return;
                } else {
                    super.setColorFilter(i7, mode);
                    return;
                }
            default:
                super.setColorFilter(i7, mode);
                return;
        }
    }

    @Override
    public void setFilterBitmap(boolean z9) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    drawable.setFilterBitmap(z9);
                    return;
                }
                return;
            default:
                super.setFilterBitmap(z9);
                return;
        }
    }

    @Override
    public void setHotspot(float f10, float f11) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    drawable.setHotspot(f10, f11);
                    return;
                }
                return;
            default:
                super.setHotspot(f10, f11);
                return;
        }
    }

    @Override
    public void setHotspotBounds(int i7, int i10, int i11, int i12) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i7, i10, i11, i12);
                    return;
                }
                return;
            default:
                super.setHotspotBounds(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean setState(int[] iArr) {
        switch (this.f219a) {
            case 0:
                Drawable drawable = (Drawable) this.f220b;
                if (drawable != null) {
                    return drawable.setState(iArr);
                }
                return super.setState(iArr);
            default:
                return super.setState(iArr);
        }
    }

    public h(View view) {
        this.f219a = 1;
        this.f220b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new m6(this, 9));
            if (view.isAttachedToWindow()) {
                view.post(new gp(this, 1));
            }
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.f220b).setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
