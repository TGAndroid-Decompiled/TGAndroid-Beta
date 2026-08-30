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
import j7.h8;
public abstract class g extends Drawable implements Drawable.Callback {
    public static final int f7203x = 0;
    public b f7204a;
    public Rect f7205b;
    public Drawable f7206c;
    public Drawable d;
    public int e;
    public boolean f7207f;
    public int h;
    public boolean f7208n;
    public i f7209r;
    public long f7210s;
    public long v;
    public f f7211w;

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.g.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f7204a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f7177g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f7174b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f7175c;
                bVar.f7175c = i12;
                if (i13 != i12) {
                    bVar.f7182m = false;
                    bVar.f7179j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f7211w == null) {
            this.f7211w = new f();
        }
        f fVar = this.f7211w;
        fVar.f7202b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f7204a.f7193y <= 0 && this.f7207f) {
                drawable.setAlpha(this.e);
            }
            b bVar = this.f7204a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f7204a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7204a.f7191w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                h8.b(h8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f7204a.A);
            Rect rect = this.f7205b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.f7211w;
            fVar2.f7202b = null;
            drawable.setCallback((Drawable.Callback) fVar2.f7202b);
        } catch (Throwable th2) {
            f fVar3 = this.f7211w;
            fVar3.f7202b = null;
            drawable.setCallback((Drawable.Callback) fVar3.f7202b);
            throw th2;
        }
    }

    public final boolean c(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.g.c(int):boolean");
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f7204a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7206c;
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
        return this.e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f7204a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z4;
        b bVar = this.f7204a;
        if (bVar.f7190u) {
            z4 = bVar.v;
        } else {
            bVar.c();
            bVar.f7190u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f7177g;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (drawableArr[i11].getConstantState() == null) {
                        bVar.v = false;
                        z4 = false;
                        break;
                    }
                    i11++;
                } else {
                    bVar.v = true;
                    z4 = true;
                    break;
                }
            }
        }
        if (z4) {
            this.f7204a.d = getChangingConfigurations();
            return this.f7204a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f7206c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f7205b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f7204a;
        if (bVar.f7181l) {
            if (!bVar.f7182m) {
                bVar.b();
            }
            return bVar.f7184o;
        }
        Drawable drawable = this.f7206c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f7204a;
        if (bVar.f7181l) {
            if (!bVar.f7182m) {
                bVar.b();
            }
            return bVar.f7183n;
        }
        Drawable drawable = this.f7206c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f7204a;
        if (bVar.f7181l) {
            if (!bVar.f7182m) {
                bVar.b();
            }
            return bVar.f7186q;
        }
        Drawable drawable = this.f7206c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f7204a;
        if (bVar.f7181l) {
            if (!bVar.f7182m) {
                bVar.b();
            }
            return bVar.f7185p;
        }
        Drawable drawable = this.f7206c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f7206c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f7204a;
            if (bVar.f7187r) {
                return bVar.f7188s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f7177g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f7188s = i10;
            bVar.f7187r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f7206c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f7204a;
        Rect rect2 = null;
        boolean z4 = false;
        if (!bVar.f7178i) {
            Rect rect3 = bVar.f7180k;
            if (rect3 == null && !bVar.f7179j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f7177g;
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
                bVar.f7179j = true;
                bVar.f7180k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z4 = true;
            }
        } else {
            Drawable drawable = this.f7206c;
            if (drawable != null) {
                z4 = drawable.getPadding(rect);
            } else {
                z4 = super.getPadding(rect);
            }
        }
        if (this.f7204a.A && h8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z4;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f7204a;
        if (bVar != null) {
            bVar.f7187r = false;
            bVar.f7189t = false;
        }
        if (drawable == this.f7206c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f7204a.A;
    }

    @Override
    public void jumpToCurrentState() {
        boolean z4;
        Drawable drawable = this.d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable2 = this.f7206c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f7207f) {
                this.f7206c.setAlpha(this.e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z4 = true;
        }
        if (this.f7210s != 0) {
            this.f7210s = 0L;
        } else {
            z10 = z4;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f7208n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.C, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f7208n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7206c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z4;
        b bVar = this.f7204a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f7177g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z4 = h8.b(i10, drawable);
                } else {
                    z4 = false;
                }
                if (i13 == i11) {
                    z10 = z4;
                }
            }
        }
        bVar.f7192x = i10;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f7206c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f7206c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f7207f || this.e != i10) {
            this.f7207f = true;
            this.e = i10;
            Drawable drawable = this.f7206c;
            if (drawable != null) {
                if (this.f7210s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z4) {
        b bVar = this.f7204a;
        if (bVar.A != z4) {
            bVar.A = z4;
            Drawable drawable = this.f7206c;
            if (drawable != null) {
                drawable.setAutoMirrored(z4);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f7204a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f7206c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z4) {
        b bVar = this.f7204a;
        if (bVar.f7191w != z4) {
            bVar.f7191w = z4;
            Drawable drawable = this.f7206c;
            if (drawable != null) {
                drawable.setDither(z4);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f7206c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f7205b;
        if (rect == null) {
            this.f7205b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f7206c;
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
        b bVar = this.f7204a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f7206c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f7204a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f7206c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z4, boolean z10) {
        boolean visible = super.setVisible(z4, z10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z4, z10);
        }
        Drawable drawable2 = this.f7206c;
        if (drawable2 != null) {
            drawable2.setVisible(z4, z10);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f7206c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
