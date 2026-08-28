package i;

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
import f7.q8;
public abstract class f extends Drawable implements Drawable.Callback {
    public static final int f10836x = 0;
    public b f10837a;
    public Rect f10838b;
    public Drawable f10839c;
    public Drawable d;
    public int f10840e;
    public boolean f10841f;
    public int h;
    public boolean f10842n;
    public i f10843r;
    public long f10844s;
    public long v;
    public eg.a f10845w;

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f10837a;
        if (theme != null) {
            bVar.c();
            int i9 = bVar.h;
            Drawable[] drawableArr = bVar.f10812g;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    bVar.f10810e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f10808b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar.f10809c;
                bVar.f10809c = i11;
                if (i12 != i11) {
                    bVar.f10817m = false;
                    bVar.f10814j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f10845w == null) {
            this.f10845w = new eg.a();
        }
        eg.a aVar = this.f10845w;
        aVar.f5121b = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f10837a.f10828y <= 0 && this.f10841f) {
                drawable.setAlpha(this.f10840e);
            }
            b bVar = this.f10837a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f10837a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10837a.f10826w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                q8.b(q8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f10837a.A);
            Rect rect = this.f10838b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            eg.a aVar2 = this.f10845w;
            aVar2.f5121b = null;
            drawable.setCallback((Drawable.Callback) aVar2.f5121b);
        } catch (Throwable th) {
            eg.a aVar3 = this.f10845w;
            aVar3.f5121b = null;
            drawable.setCallback((Drawable.Callback) aVar3.f5121b);
            throw th;
        }
    }

    public final boolean c(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.c(int):boolean");
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f10837a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10839c;
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
        return this.f10840e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f10837a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f10837a;
        if (bVar.f10825u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f10825u = true;
            int i9 = bVar.h;
            Drawable[] drawableArr = bVar.f10812g;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (drawableArr[i10].getConstantState() == null) {
                        bVar.v = false;
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    bVar.v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f10837a.d = getChangingConfigurations();
            return this.f10837a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f10839c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10838b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f10837a;
        if (bVar.f10816l) {
            if (!bVar.f10817m) {
                bVar.b();
            }
            return bVar.f10819o;
        }
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f10837a;
        if (bVar.f10816l) {
            if (!bVar.f10817m) {
                bVar.b();
            }
            return bVar.f10818n;
        }
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f10837a;
        if (bVar.f10816l) {
            if (!bVar.f10817m) {
                bVar.b();
            }
            return bVar.f10821q;
        }
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f10837a;
        if (bVar.f10816l) {
            if (!bVar.f10817m) {
                bVar.b();
            }
            return bVar.f10820p;
        }
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f10839c;
        int i9 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f10837a;
            if (bVar.f10822r) {
                return bVar.f10823s;
            }
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f10812g;
            if (i10 > 0) {
                i9 = drawableArr[0].getOpacity();
            }
            for (int i11 = 1; i11 < i10; i11++) {
                i9 = Drawable.resolveOpacity(i9, drawableArr[i11].getOpacity());
            }
            bVar.f10823s = i9;
            bVar.f10822r = true;
        }
        return i9;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f10837a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f10813i) {
            Rect rect3 = bVar.f10815k;
            if (rect3 == null && !bVar.f10814j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i9 = bVar.h;
                Drawable[] drawableArr = bVar.f10812g;
                for (int i10 = 0; i10 < i9; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.f10814j = true;
                bVar.f10815k = rect2;
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
            Drawable drawable = this.f10839c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f10837a.A && q8.a(this) == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z10;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f10837a;
        if (bVar != null) {
            bVar.f10822r = false;
            bVar.f10824t = false;
        }
        if (drawable == this.f10839c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f10837a.A;
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
        Drawable drawable2 = this.f10839c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10841f) {
                this.f10839c.setAlpha(this.f10840e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f10844s != 0) {
            this.f10844s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f10842n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.B, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f10842n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10839c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i9) {
        boolean z10;
        b bVar = this.f10837a;
        int i10 = this.h;
        int i11 = bVar.h;
        Drawable[] drawableArr = bVar.f10812g;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = q8.b(i9, drawable);
                } else {
                    z10 = false;
                }
                if (i12 == i10) {
                    z11 = z10;
                }
            }
        }
        bVar.f10827x = i9;
        return z11;
    }

    @Override
    public final boolean onLevelChange(int i9) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        Drawable drawable2 = this.f10839c;
        if (drawable2 != null) {
            return drawable2.setLevel(i9);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f10839c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i9) {
        if (!this.f10841f || this.f10840e != i9) {
            this.f10841f = true;
            this.f10840e = i9;
            Drawable drawable = this.f10839c;
            if (drawable != null) {
                if (this.f10844s == 0) {
                    drawable.setAlpha(i9);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f10837a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f10839c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f10837a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f10839c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f10837a;
        if (bVar.f10826w != z10) {
            bVar.f10826w = z10;
            Drawable drawable = this.f10839c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i9, int i10, int i11, int i12) {
        Rect rect = this.f10838b;
        if (rect == null) {
            this.f10838b = new Rect(i9, i10, i11, i12);
        } else {
            rect.set(i9, i10, i11, i12);
        }
        Drawable drawable = this.f10839c;
        if (drawable != null) {
            drawable.setHotspotBounds(i9, i10, i11, i12);
        }
    }

    @Override
    public final void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f10837a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f10839c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f10837a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f10839c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f10839c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f10839c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
