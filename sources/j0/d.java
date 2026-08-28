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
import f7.q8;
import java.lang.reflect.Method;
public final class d extends Drawable implements Drawable.Callback, c, b {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static Method f13185n;
    public int f13186a;
    public PorterDuff.Mode f13187b;
    public boolean f13188c;
    public e d;
    public boolean f13189e;
    public Drawable f13190f;

    public static void a() {
        if (f13185n == null) {
            try {
                f13185n = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f13190f;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    public final e c() {
        e eVar = this.d;
        ?? constantState = new Drawable.ConstantState();
        constantState.f13193c = null;
        constantState.d = h;
        if (eVar != null) {
            constantState.f13191a = eVar.f13191a;
            constantState.f13192b = eVar.f13192b;
            constantState.f13193c = eVar.f13193c;
            constantState.d = eVar.d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f13190f.setState(iArr);
        if (!i(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f13190f.draw(canvas);
    }

    public final void e(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    public final void f(ColorStateList colorStateList) {
        this.d.f13193c = colorStateList;
        i(this.f13190f.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.d.d = mode;
        i(this.f13190f.getState());
    }

    @Override
    public final int getChangingConfigurations() {
        int i9;
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.d;
        if (eVar != null) {
            i9 = eVar.getChangingConfigurations();
        } else {
            i9 = 0;
        }
        return changingConfigurations | i9 | this.f13190f.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        e eVar = this.d;
        if (eVar != null && eVar.f13192b != null) {
            eVar.f13191a = getChangingConfigurations();
            return this.d;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f13190f.getCurrent();
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f13190f.getDirtyBounds();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f13190f.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f13190f.getIntrinsicWidth();
    }

    @Override
    public final int getLayoutDirection() {
        return q8.a(this.f13190f);
    }

    @Override
    public final int getMinimumHeight() {
        return this.f13190f.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f13190f.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.f13190f.getOpacity();
    }

    @Override
    public final void getOutline(Outline outline) {
        this.f13190f.getOutline(outline);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        return this.f13190f.getPadding(rect);
    }

    @Override
    public final int[] getState() {
        return this.f13190f.getState();
    }

    @Override
    public final Region getTransparentRegion() {
        return this.f13190f.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f13190f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13190f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.d;
            if (eVar != null) {
                eVar.f13192b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (b()) {
            e eVar = this.d;
            ColorStateList colorStateList = eVar.f13193c;
            PorterDuff.Mode mode = eVar.d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f13188c || colorForState != this.f13186a || mode != this.f13187b) {
                    setColorFilter(colorForState, mode);
                    this.f13186a = colorForState;
                    this.f13187b = mode;
                    this.f13188c = true;
                    return true;
                }
            } else {
                this.f13188c = false;
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
        return this.f13190f.isAutoMirrored();
    }

    @Override
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f13190f;
        if (drawable != null && (method = f13185n) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
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
            colorStateList = eVar.f13193c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f13190f.isStateful()) {
            return true;
        }
        return false;
    }

    @Override
    public final void jumpToCurrentState() {
        this.f13190f.jumpToCurrentState();
    }

    @Override
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f13189e && super.mutate() == this) {
            this.d = c();
            Drawable drawable = this.f13190f;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.d;
            if (eVar != null) {
                Drawable drawable2 = this.f13190f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                eVar.f13192b = constantState;
            }
            this.f13189e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13190f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i9) {
        return q8.b(i9, this.f13190f);
    }

    @Override
    public final boolean onLevelChange(int i9) {
        return this.f13190f.setLevel(i9);
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override
    public final void setAlpha(int i9) {
        this.f13190f.setAlpha(i9);
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        this.f13190f.setAutoMirrored(z10);
    }

    @Override
    public final void setChangingConfigurations(int i9) {
        this.f13190f.setChangingConfigurations(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13190f.setColorFilter(colorFilter);
    }

    @Override
    public final void setDither(boolean z10) {
        this.f13190f.setDither(z10);
    }

    @Override
    public final void setFilterBitmap(boolean z10) {
        this.f13190f.setFilterBitmap(z10);
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        this.f13190f.setHotspot(f10, f11);
    }

    @Override
    public final void setHotspotBounds(int i9, int i10, int i11, int i12) {
        this.f13190f.setHotspotBounds(i9, i10, i11, i12);
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
    public final void setTint(int i9) {
        if (b()) {
            e(i9);
        } else {
            this.f13190f.setTint(i9);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f13190f.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f13190f.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        if (!super.setVisible(z10, z11) && !this.f13190f.setVisible(z10, z11)) {
            return false;
        }
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
