package i;

import ag.q1;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import h7.l8;
public abstract class f extends Drawable implements Drawable.Callback {
    public static final int f8174x = 0;
    public b f8175a;
    public Rect f8176b;
    public Drawable f8177c;
    public Drawable d;
    public int f8178e;
    public boolean f8179f;
    public int h;
    public boolean f8180n;
    public q1 f8181r;
    public long f8182s;
    public long v;
    public hg.a f8183w;

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f8175a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f8150g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.f8148e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f8146b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f8147c;
                bVar.f8147c = i12;
                if (i13 != i12) {
                    bVar.f8155m = false;
                    bVar.f8152j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f8183w == null) {
            this.f8183w = new hg.a();
        }
        hg.a aVar = this.f8183w;
        aVar.f7999b = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f8175a.f8166y <= 0 && this.f8179f) {
                drawable.setAlpha(this.f8178e);
            }
            b bVar = this.f8175a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f8175a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f8175a.f8164w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                l8.b(l8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f8175a.A);
            Rect rect = this.f8176b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            hg.a aVar2 = this.f8183w;
            aVar2.f7999b = null;
            drawable.setCallback((Drawable.Callback) aVar2.f7999b);
        } catch (Throwable th2) {
            hg.a aVar3 = this.f8183w;
            aVar3.f7999b = null;
            drawable.setCallback((Drawable.Callback) aVar3.f7999b);
            throw th2;
        }
    }

    public final boolean c(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.f.c(int):boolean");
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f8175a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f8177c;
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
        return this.f8178e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f8175a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f8175a;
        if (bVar.f8163u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f8163u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f8150g;
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
            this.f8175a.d = getChangingConfigurations();
            return this.f8175a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f8177c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f8176b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f8175a;
        if (bVar.f8154l) {
            if (!bVar.f8155m) {
                bVar.b();
            }
            return bVar.f8157o;
        }
        Drawable drawable = this.f8177c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f8175a;
        if (bVar.f8154l) {
            if (!bVar.f8155m) {
                bVar.b();
            }
            return bVar.f8156n;
        }
        Drawable drawable = this.f8177c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f8175a;
        if (bVar.f8154l) {
            if (!bVar.f8155m) {
                bVar.b();
            }
            return bVar.f8159q;
        }
        Drawable drawable = this.f8177c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f8175a;
        if (bVar.f8154l) {
            if (!bVar.f8155m) {
                bVar.b();
            }
            return bVar.f8158p;
        }
        Drawable drawable = this.f8177c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f8177c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f8175a;
            if (bVar.f8160r) {
                return bVar.f8161s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f8150g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f8161s = i10;
            bVar.f8160r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f8177c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f8175a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f8151i) {
            Rect rect3 = bVar.f8153k;
            if (rect3 == null && !bVar.f8152j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f8150g;
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
                bVar.f8152j = true;
                bVar.f8153k = rect2;
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
            Drawable drawable = this.f8177c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f8175a.A && l8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f8175a;
        if (bVar != null) {
            bVar.f8160r = false;
            bVar.f8162t = false;
        }
        if (drawable == this.f8177c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f8175a.A;
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
        Drawable drawable2 = this.f8177c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f8179f) {
                this.f8177c.setAlpha(this.f8178e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f8182s != 0) {
            this.f8182s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f8180n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.B, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f8180n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f8177c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z10;
        b bVar = this.f8175a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f8150g;
        boolean z11 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = l8.b(i10, drawable);
                } else {
                    z10 = false;
                }
                if (i13 == i11) {
                    z11 = z10;
                }
            }
        }
        bVar.f8165x = i10;
        return z11;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f8177c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f8177c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f8179f || this.f8178e != i10) {
            this.f8179f = true;
            this.f8178e = i10;
            Drawable drawable = this.f8177c;
            if (drawable != null) {
                if (this.f8182s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f8175a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f8177c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f8175a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f8177c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f8175a;
        if (bVar.f8164w != z10) {
            bVar.f8164w = z10;
            Drawable drawable = this.f8177c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f9, float f10) {
        Drawable drawable = this.f8177c;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f8176b;
        if (rect == null) {
            this.f8176b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f8177c;
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
        b bVar = this.f8175a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f8177c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f8175a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f8177c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f8177c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f8177c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
