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
import java.lang.reflect.Method;
import v7.r8;
public final class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static Method f11434n;
    public int f11435a;
    public PorterDuff.Mode f11436b;
    public boolean f11437c;
    public e d;
    public boolean e;
    public Drawable f11438f;

    public static void a() {
        if (f11434n == null) {
            try {
                f11434n = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f11438f;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    public final e c() {
        e eVar = this.d;
        ?? constantState = new Drawable.ConstantState();
        constantState.f11441c = null;
        constantState.d = h;
        if (eVar != null) {
            constantState.f11439a = eVar.f11439a;
            constantState.f11440b = eVar.f11440b;
            constantState.f11441c = eVar.f11441c;
            constantState.d = eVar.d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f11438f.setState(iArr);
        if (!i(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f11438f.draw(canvas);
    }

    public final void e(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public final void f(ColorStateList colorStateList) {
        this.d.f11441c = colorStateList;
        i(this.f11438f.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.d.d = mode;
        i(this.f11438f.getState());
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
        return changingConfigurations | i10 | this.f11438f.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        e eVar = this.d;
        if (eVar != null && eVar.f11440b != null) {
            eVar.f11439a = getChangingConfigurations();
            return this.d;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f11438f.getCurrent();
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f11438f.getDirtyBounds();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f11438f.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f11438f.getIntrinsicWidth();
    }

    @Override
    public final int getLayoutDirection() {
        return r8.a(this.f11438f);
    }

    @Override
    public final int getMinimumHeight() {
        return this.f11438f.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f11438f.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f11438f.getOpacity();
    }

    @Override
    public final void getOutline(Outline outline) {
        this.f11438f.getOutline(outline);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f11438f.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f11438f.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f11438f.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f11438f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11438f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.d;
            if (eVar != null) {
                eVar.f11440b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (b()) {
            e eVar = this.d;
            ColorStateList colorStateList = eVar.f11441c;
            PorterDuff.Mode mode = eVar.d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f11437c || colorForState != this.f11435a || mode != this.f11436b) {
                    setColorFilter(colorForState, mode);
                    this.f11435a = colorForState;
                    this.f11436b = mode;
                    this.f11437c = true;
                    return true;
                }
            } else {
                this.f11437c = false;
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
        return this.f11438f.isAutoMirrored();
    }

    @Override
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f11438f;
        if (drawable != null && (method = f11434n) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
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
            colorStateList = eVar.f11441c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f11438f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public final void jumpToCurrentState() {
        this.f11438f.jumpToCurrentState();
    }

    @Override
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.e && super.mutate() == this) {
            this.d = c();
            Drawable drawable = this.f11438f;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.d;
            if (eVar != null) {
                Drawable drawable2 = this.f11438f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                eVar.f11440b = constantState;
            }
            this.e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11438f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        return r8.b(i10, this.f11438f);
    }

    @Override
    public final boolean onLevelChange(int i10) {
        return this.f11438f.setLevel(i10);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f11438f.setAlpha(i10);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f11438f.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i10) {
        this.f11438f.setChangingConfigurations(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11438f.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f11438f.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f11438f.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        this.f11438f.setHotspot(f7, f10);
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f11438f.setHotspotBounds(i10, i11, i12, i13);
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
            this.f11438f.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f11438f.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f11438f.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f11438f.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
