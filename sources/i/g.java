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
import j7.i8;
public abstract class g extends Drawable implements Drawable.Callback {
    public static final int f7186x = 0;
    public b f7187a;
    public Rect f7188b;
    public Drawable f7189c;
    public Drawable d;
    public int e;
    public boolean f7190f;
    public int h;
    public boolean f7191n;
    public i f7192r;
    public long f7193s;
    public long v;
    public f f7194w;

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.g.a(boolean):void");
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f7187a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f7160g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f7157b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f7158c;
                bVar.f7158c = i12;
                if (i13 != i12) {
                    bVar.f7165m = false;
                    bVar.f7162j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f7194w == null) {
            this.f7194w = new f();
        }
        f fVar = this.f7194w;
        fVar.f7185b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f7187a.f7176y <= 0 && this.f7190f) {
                drawable.setAlpha(this.e);
            }
            b bVar = this.f7187a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f7187a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7187a.f7174w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                i8.b(i8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f7187a.A);
            Rect rect = this.f7188b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.f7194w;
            fVar2.f7185b = null;
            drawable.setCallback((Drawable.Callback) fVar2.f7185b);
        } catch (Throwable th2) {
            f fVar3 = this.f7194w;
            fVar3.f7185b = null;
            drawable.setCallback((Drawable.Callback) fVar3.f7185b);
            throw th2;
        }
    }

    public final boolean c(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.g.c(int):boolean");
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f7187a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7189c;
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
        return super.getChangingConfigurations() | this.f7187a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z4;
        b bVar = this.f7187a;
        if (bVar.f7173u) {
            z4 = bVar.v;
        } else {
            bVar.c();
            bVar.f7173u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f7160g;
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
            this.f7187a.d = getChangingConfigurations();
            return this.f7187a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f7189c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f7188b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f7187a;
        if (bVar.f7164l) {
            if (!bVar.f7165m) {
                bVar.b();
            }
            return bVar.f7167o;
        }
        Drawable drawable = this.f7189c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f7187a;
        if (bVar.f7164l) {
            if (!bVar.f7165m) {
                bVar.b();
            }
            return bVar.f7166n;
        }
        Drawable drawable = this.f7189c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f7187a;
        if (bVar.f7164l) {
            if (!bVar.f7165m) {
                bVar.b();
            }
            return bVar.f7169q;
        }
        Drawable drawable = this.f7189c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f7187a;
        if (bVar.f7164l) {
            if (!bVar.f7165m) {
                bVar.b();
            }
            return bVar.f7168p;
        }
        Drawable drawable = this.f7189c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f7189c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f7187a;
            if (bVar.f7170r) {
                return bVar.f7171s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f7160g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f7171s = i10;
            bVar.f7170r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f7189c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f7187a;
        Rect rect2 = null;
        boolean z4 = false;
        if (!bVar.f7161i) {
            Rect rect3 = bVar.f7163k;
            if (rect3 == null && !bVar.f7162j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f7160g;
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
                bVar.f7162j = true;
                bVar.f7163k = rect2;
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
            Drawable drawable = this.f7189c;
            if (drawable != null) {
                z4 = drawable.getPadding(rect);
            } else {
                z4 = super.getPadding(rect);
            }
        }
        if (this.f7187a.A && i8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z4;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f7187a;
        if (bVar != null) {
            bVar.f7170r = false;
            bVar.f7172t = false;
        }
        if (drawable == this.f7189c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f7187a.A;
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
        Drawable drawable2 = this.f7189c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f7190f) {
                this.f7189c.setAlpha(this.e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z4 = true;
        }
        if (this.f7193s != 0) {
            this.f7193s = 0L;
        } else {
            z10 = z4;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f7191n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.C, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f7191n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7189c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean z4;
        b bVar = this.f7187a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f7160g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z4 = i8.b(i10, drawable);
                } else {
                    z4 = false;
                }
                if (i13 == i11) {
                    z10 = z4;
                }
            }
        }
        bVar.f7175x = i10;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f7189c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f7189c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f7190f || this.e != i10) {
            this.f7190f = true;
            this.e = i10;
            Drawable drawable = this.f7189c;
            if (drawable != null) {
                if (this.f7193s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z4) {
        b bVar = this.f7187a;
        if (bVar.A != z4) {
            bVar.A = z4;
            Drawable drawable = this.f7189c;
            if (drawable != null) {
                drawable.setAutoMirrored(z4);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f7187a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f7189c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z4) {
        b bVar = this.f7187a;
        if (bVar.f7174w != z4) {
            bVar.f7174w = z4;
            Drawable drawable = this.f7189c;
            if (drawable != null) {
                drawable.setDither(z4);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f7189c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f7188b;
        if (rect == null) {
            this.f7188b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f7189c;
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
        b bVar = this.f7187a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f7189c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f7187a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f7189c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z4, boolean z10) {
        boolean visible = super.setVisible(z4, z10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z4, z10);
        }
        Drawable drawable2 = this.f7189c;
        if (drawable2 != null) {
            drawable2.setVisible(z4, z10);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f7189c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
