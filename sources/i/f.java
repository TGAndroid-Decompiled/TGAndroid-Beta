package i;

import ai.q4;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import v7.r8;
public abstract class f extends Drawable implements Drawable.Callback {
    public static final int f11514x = 0;
    public b f11515a;
    public Rect f11516b;
    public Drawable f11517c;
    public Drawable d;
    public int f11518e;
    public boolean f11519f;
    public int h;
    public boolean f11520n;
    public q4 f11521r;
    public long f11522s;
    public long v;
    public ah.d f11523w;

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f11515a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f11490g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.f11488e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f11486b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f11487c;
                bVar.f11487c = i12;
                if (i13 != i12) {
                    bVar.f11495m = false;
                    bVar.f11492j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f11523w == null) {
            this.f11523w = new ah.d();
        }
        ah.d dVar = this.f11523w;
        dVar.f463b = drawable.getCallback();
        drawable.setCallback(dVar);
        try {
            if (this.f11515a.f11506y <= 0 && this.f11519f) {
                drawable.setAlpha(this.f11518e);
            }
            b bVar = this.f11515a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f11515a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f11515a.f11504w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                r8.b(r8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f11515a.A);
            Rect rect = this.f11516b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            ah.d dVar2 = this.f11523w;
            dVar2.f463b = null;
            drawable.setCallback((Drawable.Callback) dVar2.f463b);
        } catch (Throwable th2) {
            ah.d dVar3 = this.f11523w;
            dVar3.f463b = null;
            drawable.setCallback((Drawable.Callback) dVar3.f463b);
            throw th2;
        }
    }

    public final boolean c(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.c(int):boolean");
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f11515a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f11517c;
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
        return this.f11518e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f11515a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f11515a;
        if (bVar.f11503u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f11503u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f11490g;
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
            this.f11515a.d = getChangingConfigurations();
            return this.f11515a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f11517c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f11516b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f11515a;
        if (bVar.f11494l) {
            if (!bVar.f11495m) {
                bVar.b();
            }
            return bVar.f11497o;
        }
        Drawable drawable = this.f11517c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f11515a;
        if (bVar.f11494l) {
            if (!bVar.f11495m) {
                bVar.b();
            }
            return bVar.f11496n;
        }
        Drawable drawable = this.f11517c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f11515a;
        if (bVar.f11494l) {
            if (!bVar.f11495m) {
                bVar.b();
            }
            return bVar.f11499q;
        }
        Drawable drawable = this.f11517c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f11515a;
        if (bVar.f11494l) {
            if (!bVar.f11495m) {
                bVar.b();
            }
            return bVar.f11498p;
        }
        Drawable drawable = this.f11517c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f11517c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f11515a;
            if (bVar.f11500r) {
                return bVar.f11501s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f11490g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f11501s = i10;
            bVar.f11500r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f11517c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f11515a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f11491i) {
            Rect rect3 = bVar.f11493k;
            if (rect3 == null && !bVar.f11492j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f11490g;
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
                bVar.f11492j = true;
                bVar.f11493k = rect2;
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
            Drawable drawable = this.f11517c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f11515a.A && r8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f11515a;
        if (bVar != null) {
            bVar.f11500r = false;
            bVar.f11502t = false;
        }
        if (drawable == this.f11517c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f11515a.A;
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
        Drawable drawable2 = this.f11517c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f11519f) {
                this.f11517c.setAlpha(this.f11518e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f11522s != 0) {
            this.f11522s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f11520n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.F, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f11520n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f11517c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z10;
        b bVar = this.f11515a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f11490g;
        boolean z11 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = r8.b(i10, drawable);
                } else {
                    z10 = false;
                }
                if (i13 == i11) {
                    z11 = z10;
                }
            }
        }
        bVar.f11505x = i10;
        return z11;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f11517c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable == this.f11517c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f11519f || this.f11518e != i10) {
            this.f11519f = true;
            this.f11518e = i10;
            Drawable drawable = this.f11517c;
            if (drawable != null) {
                if (this.f11522s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f11515a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f11517c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f11515a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f11517c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f11515a;
        if (bVar.f11504w != z10) {
            bVar.f11504w = z10;
            Drawable drawable = this.f11517c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        Drawable drawable = this.f11517c;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f11516b;
        if (rect == null) {
            this.f11516b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f11517c;
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
        b bVar = this.f11515a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f11517c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f11515a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f11517c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f11517c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f11517c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
