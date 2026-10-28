package i;

import a8.qc;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bh.u0;
public final class e extends Drawable implements Drawable.Callback {
    public static final int J = 0;
    public b E;
    public qc F;
    public boolean I;
    public b f13438a;
    public Rect f13439b;
    public Drawable f13440c;
    public Drawable d;
    public boolean f13441f;
    public boolean f13442n;
    public a5.d f13443r;
    public long f13444s;
    public long v;
    public u0 f13445w;
    public b f13446x;
    public boolean f13447y;
    public int e = 255;
    public int h = -1;
    public int G = -1;
    public int H = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static i.e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):i.e");
    }

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.a(boolean):void");
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f13438a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f13415g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f13412b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f13413c;
                bVar.f13413c = i12;
                if (i13 != i12) {
                    bVar.f13420m = false;
                    bVar.f13417j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f13438a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f13445w == null) {
            this.f13445w = new u0();
        }
        u0 u0Var = this.f13445w;
        u0Var.f4160b = drawable.getCallback();
        drawable.setCallback(u0Var);
        try {
            if (this.f13438a.f13431y <= 0 && this.f13441f) {
                drawable.setAlpha(this.e);
            }
            b bVar = this.f13438a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f13438a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13438a.f13429w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f13438a.A);
            Rect rect = this.f13439b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            u0 u0Var2 = this.f13445w;
            u0Var2.f4160b = null;
            drawable.setCallback((Drawable.Callback) u0Var2.f4160b);
        } catch (Throwable th2) {
            u0 u0Var3 = this.f13445w;
            u0Var3.f4160b = null;
            drawable.setCallback((Drawable.Callback) u0Var3.f4160b);
            throw th2;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
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
        Drawable drawable2 = this.f13440c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13441f) {
                this.f13440c.setAlpha(this.e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f13444s != 0) {
            this.f13444s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f13442n && super.mutate() == this) {
            b bVar = new b(this.E, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f13442n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f13447y) {
            f();
            b bVar = this.f13446x;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f13447y = true;
        }
        return this;
    }

    @Override
    public final int getAlpha() {
        return this.e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13438a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f13438a;
        if (bVar.f13428u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f13428u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f13415g;
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
            this.f13438a.d = getChangingConfigurations();
            return this.f13438a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f13440c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13439b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f13438a;
        if (bVar.f13419l) {
            if (!bVar.f13420m) {
                bVar.b();
            }
            return bVar.f13422o;
        }
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f13438a;
        if (bVar.f13419l) {
            if (!bVar.f13420m) {
                bVar.b();
            }
            return bVar.f13421n;
        }
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f13438a;
        if (bVar.f13419l) {
            if (!bVar.f13420m) {
                bVar.b();
            }
            return bVar.f13424q;
        }
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f13438a;
        if (bVar.f13419l) {
            if (!bVar.f13420m) {
                bVar.b();
            }
            return bVar.f13423p;
        }
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f13440c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f13438a;
            if (bVar.f13425r) {
                return bVar.f13426s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f13415g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f13426s = i10;
            bVar.f13425r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f13438a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f13416i) {
            Rect rect3 = bVar.f13418k;
            if (rect3 == null && !bVar.f13417j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f13415g;
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
                bVar.f13417j = true;
                bVar.f13418k = rect2;
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
            Drawable drawable = this.f13440c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f13438a.A && getLayoutDirection() == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    public final boolean h(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f13438a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable d = bVar.d(i10);
            this.f13440c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.f13446x = bVar;
        this.E = bVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f13438a;
        if (bVar != null) {
            bVar.f13425r = false;
            bVar.f13427t = false;
        }
        if (drawable == this.f13440c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f13438a.A;
    }

    @Override
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f13440c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void jumpToCurrentState() {
        e();
        qc qcVar = this.F;
        if (qcVar != null) {
            qcVar.d();
            this.F = null;
            h(this.G);
            this.G = -1;
            this.H = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.I) {
            g();
            b bVar = this.E;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.I = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13440c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.f13438a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f13415g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i10);
                if (i13 == i11) {
                    z10 = layoutDirection;
                }
            }
        }
        bVar.f13430x = i10;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f13440c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final boolean onStateChange(int[] r18) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.onStateChange(int[]):boolean");
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f13440c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f13441f || this.e != i10) {
            this.f13441f = true;
            this.e = i10;
            Drawable drawable = this.f13440c;
            if (drawable != null) {
                if (this.f13444s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f13438a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f13440c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f13438a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f13440c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f13438a;
        if (bVar.f13429w != z10) {
            bVar.f13429w = z10;
            Drawable drawable = this.f13440c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        Drawable drawable = this.f13440c;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f13439b;
        if (rect == null) {
            this.f13439b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f13440c;
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
        b bVar = this.f13438a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f13440c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f13438a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f13440c.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean j10 = j(z10, z11);
        qc qcVar = this.F;
        if (qcVar != null && (j10 || z11)) {
            if (z10) {
                qcVar.c();
                return j10;
            }
            jumpToCurrentState();
        }
        return j10;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f13440c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
