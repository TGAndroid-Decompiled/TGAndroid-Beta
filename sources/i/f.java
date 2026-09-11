package i;

import ah.g1;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.activity.i;
import v7.o8;
public abstract class f extends Drawable implements Drawable.Callback {
    public static final int f11412x = 0;
    public b f11413a;
    public Rect f11414b;
    public Drawable f11415c;
    public Drawable d;
    public int f11416e;
    public boolean f11417f;
    public int h;
    public boolean f11418n;
    public i f11419r;
    public long f11420s;
    public long v;
    public g1 f11421w;

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f11413a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f11388g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.f11386e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f11384b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f11385c;
                bVar.f11385c = i12;
                if (i13 != i12) {
                    bVar.f11393m = false;
                    bVar.f11390j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f11421w == null) {
            this.f11421w = new g1();
        }
        g1 g1Var = this.f11421w;
        g1Var.f547b = drawable.getCallback();
        drawable.setCallback(g1Var);
        try {
            if (this.f11413a.f11404y <= 0 && this.f11417f) {
                drawable.setAlpha(this.f11416e);
            }
            b bVar = this.f11413a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f11413a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f11413a.f11402w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                o8.b(o8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f11413a.A);
            Rect rect = this.f11414b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            g1 g1Var2 = this.f11421w;
            g1Var2.f547b = null;
            drawable.setCallback((Drawable.Callback) g1Var2.f547b);
        } catch (Throwable th2) {
            g1 g1Var3 = this.f11421w;
            g1Var3.f547b = null;
            drawable.setCallback((Drawable.Callback) g1Var3.f547b);
            throw th2;
        }
    }

    public final boolean c(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.c(int):boolean");
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f11413a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f11416e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f11413a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f11413a;
        if (bVar.f11401u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f11401u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f11388g;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (drawableArr[i11].getConstantState() == null) {
                        bVar.v = false;
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    bVar.v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f11413a.d = getChangingConfigurations();
            return this.f11413a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f11415c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f11414b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f11413a;
        if (bVar.f11392l) {
            if (!bVar.f11393m) {
                bVar.b();
            }
            return bVar.f11395o;
        }
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f11413a;
        if (bVar.f11392l) {
            if (!bVar.f11393m) {
                bVar.b();
            }
            return bVar.f11394n;
        }
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f11413a;
        if (bVar.f11392l) {
            if (!bVar.f11393m) {
                bVar.b();
            }
            return bVar.f11397q;
        }
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f11413a;
        if (bVar.f11392l) {
            if (!bVar.f11393m) {
                bVar.b();
            }
            return bVar.f11396p;
        }
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f11415c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f11413a;
            if (bVar.f11398r) {
                return bVar.f11399s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f11388g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f11399s = i10;
            bVar.f11398r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f11413a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f11389i) {
            Rect rect3 = bVar.f11391k;
            if (rect3 == null && !bVar.f11390j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f11388g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                bVar.f11390j = true;
                bVar.f11391k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z10 = true;
            }
        } else {
            Drawable drawable = this.f11415c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f11413a.A && o8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f11413a;
        if (bVar != null) {
            bVar.f11398r = false;
            bVar.f11400t = false;
        }
        if (drawable == this.f11415c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f11413a.A;
    }

    @Override
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f11415c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f11417f) {
                this.f11415c.setAlpha(this.f11416e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f11420s != 0) {
            this.f11420s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f11418n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.F, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f11418n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f11415c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z10;
        b bVar = this.f11413a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f11388g;
        boolean z11 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = o8.b(i10, drawable);
                } else {
                    z10 = false;
                }
                if (i13 == i11) {
                    z11 = z10;
                }
            }
        }
        bVar.f11403x = i10;
        return z11;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f11415c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable == this.f11415c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f11417f || this.f11416e != i10) {
            this.f11417f = true;
            this.f11416e = i10;
            Drawable drawable = this.f11415c;
            if (drawable != null) {
                if (this.f11420s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f11413a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f11415c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f11413a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f11415c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f11413a;
        if (bVar.f11402w != z10) {
            bVar.f11402w = z10;
            Drawable drawable = this.f11415c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f11414b;
        if (rect == null) {
            this.f11414b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f11415c;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f11413a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f11415c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f11413a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f11415c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f11415c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f11415c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
