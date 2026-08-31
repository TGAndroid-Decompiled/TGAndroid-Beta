package j0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import j7.i8;
import java.lang.reflect.Method;
public final class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static Method f8957n;
    public int f8958a;
    public PorterDuff.Mode f8959b;
    public boolean f8960c;
    public e d;
    public boolean f8961e;
    public Drawable f8962f;

    public static void a() {
        if (f8957n == null) {
            try {
                f8957n = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e6) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e6);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f8962f;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    public final e c() {
        e eVar = this.d;
        ?? constantState = new Drawable.ConstantState();
        constantState.f8965c = null;
        constantState.d = h;
        if (eVar != null) {
            constantState.f8963a = eVar.f8963a;
            constantState.f8964b = eVar.f8964b;
            constantState.f8965c = eVar.f8965c;
            constantState.d = eVar.d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f8962f.setState(iArr);
        if (!i(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f8962f.draw(canvas);
    }

    public final void e(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public final void f(ColorStateList colorStateList) {
        this.d.f8965c = colorStateList;
        i(this.f8962f.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.d.d = mode;
        i(this.f8962f.getState());
    }

    @Override
    public final int getChangingConfigurations() {
        int i10;
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.d;
        if (eVar != null) {
            i10 = eVar.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return changingConfigurations | i10 | this.f8962f.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        e eVar = this.d;
        if (eVar != null && eVar.f8964b != null) {
            eVar.f8963a = getChangingConfigurations();
            return this.d;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f8962f.getCurrent();
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f8962f.getDirtyBounds();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f8962f.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f8962f.getIntrinsicWidth();
    }

    @Override
    public final int getLayoutDirection() {
        return i8.a(this.f8962f);
    }

    @Override
    public final int getMinimumHeight() {
        return this.f8962f.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f8962f.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f8962f.getOpacity();
    }

    @Override
    public final void getOutline(Outline outline) {
        this.f8962f.getOutline(outline);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f8962f.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f8962f.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f8962f.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f8962f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8962f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.d;
            if (eVar != null) {
                eVar.f8964b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (b()) {
            e eVar = this.d;
            ColorStateList colorStateList = eVar.f8965c;
            PorterDuff.Mode mode = eVar.d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f8960c || colorForState != this.f8958a || mode != this.f8959b) {
                    setColorFilter(colorForState, mode);
                    this.f8958a = colorForState;
                    this.f8959b = mode;
                    this.f8960c = true;
                    return true;
                }
            } else {
                this.f8960c = false;
                clearColorFilter();
                return false;
            }
        }
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f8962f.isAutoMirrored();
    }

    @Override
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f8962f;
        if (drawable != null && (method = f8957n) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e6) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e6);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean isStateful() {
        ColorStateList colorStateList;
        e eVar;
        if (b() && (eVar = this.d) != null) {
            colorStateList = eVar.f8965c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f8962f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public final void jumpToCurrentState() {
        this.f8962f.jumpToCurrentState();
    }

    @Override
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f8961e && super.mutate() == this) {
            this.d = c();
            Drawable drawable = this.f8962f;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.d;
            if (eVar != null) {
                Drawable drawable2 = this.f8962f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                eVar.f8964b = constantState;
            }
            this.f8961e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8962f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        return i8.b(i10, this.f8962f);
    }

    @Override
    public final boolean onLevelChange(int i10) {
        return this.f8962f.setLevel(i10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f8962f.setAlpha(i10);
    }

    @Override
    public final void setAutoMirrored(boolean z4) {
        this.f8962f.setAutoMirrored(z4);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        this.f8962f.setChangingConfigurations(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8962f.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z4) {
        this.f8962f.setDither(z4);
    }

    @Override
    public final void setFilterBitmap(boolean z4) {
        this.f8962f.setFilterBitmap(z4);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f8962f.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f8962f.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override
    public final boolean setState(int[] iArr) {
        if (d(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override
    public final void setTint(int i10) {
        if (b()) {
            e(i10);
        } else {
            this.f8962f.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f8962f.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f8962f.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z4, boolean z10) {
        if (!super.setVisible(z4, z10) && !this.f8962f.setVisible(z4, z10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
