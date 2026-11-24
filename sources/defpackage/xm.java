package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class xm extends Drawable implements Drawable.Callback {
    public static final int K = 0;
    public boolean E;
    public um F;
    public wld G;
    public boolean J;
    public um a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean n;
    public o1 r;
    public long s;
    public long w;
    public in x;
    public um y;
    public int e = 255;
    public int h = -1;
    public int H = -1;
    public int I = -1;

    public xm(um umVar, Resources resources) {
        i(new um(umVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static defpackage.xm c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):xm");
    }

    public final void a(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm.a(boolean):void");
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        um umVar = this.a;
        if (theme != null) {
            umVar.c();
            int i = umVar.h;
            Drawable[] drawableArr = umVar.g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    umVar.e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                umVar.b = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = umVar.c;
                umVar.c = i3;
                if (i4 != i3) {
                    umVar.m = false;
                    umVar.j = false;
                    return;
                }
                return;
            }
            return;
        }
        umVar.getClass();
    }

    @Override
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        in inVar = this.x;
        if (inVar == null) {
            inVar = new in();
            this.x = inVar;
        }
        inVar.b = drawable.getCallback();
        drawable.setCallback(inVar);
        try {
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            um umVar = this.a;
            if (umVar.C) {
                drawable.setColorFilter(umVar.B);
            } else {
                if (umVar.F) {
                    drawable.setTintList(umVar.D);
                }
                um umVar2 = this.a;
                if (umVar2.G) {
                    drawable.setTintMode(umVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            in inVar2 = this.x;
            inVar2.b = null;
            drawable.setCallback((Drawable.Callback) inVar2.b);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z;
        Drawable drawable = this.d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.w != 0) {
            this.w = 0L;
            z = true;
        }
        if (this.s != 0) {
            this.s = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.n && super.mutate() == this) {
            um umVar = new um(this.F, this, null);
            umVar.I = umVar.I.clone();
            umVar.J = umVar.J.clone();
            i(umVar);
            this.n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.E) {
            f();
            um umVar = this.y;
            umVar.I = umVar.I.clone();
            umVar.J = umVar.J.clone();
            this.E = true;
        }
        return this;
    }

    @Override
    public final int getAlpha() {
        return this.e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        um umVar = this.a;
        if (umVar.u) {
            z = umVar.v;
        } else {
            umVar.c();
            umVar.u = true;
            int i = umVar.h;
            Drawable[] drawableArr = umVar.g;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        umVar.v = false;
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    umVar.v = true;
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.a.d = getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        um umVar = this.a;
        if (umVar.l) {
            if (!umVar.m) {
                umVar.b();
            }
            return umVar.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.c;
        int i = -2;
        if (drawable != null && drawable.isVisible()) {
            um umVar = this.a;
            if (umVar.r) {
                return umVar.s;
            }
            umVar.c();
            int i2 = umVar.h;
            Drawable[] drawableArr = umVar.g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            umVar.s = i;
            umVar.r = true;
        }
        return i;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        um umVar = this.a;
        Rect rect2 = null;
        boolean z = false;
        if (!umVar.i) {
            Rect rect3 = umVar.k;
            if (rect3 == null && !umVar.j) {
                umVar.c();
                Rect rect4 = new Rect();
                int i = umVar.h;
                Drawable[] drawableArr = umVar.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                umVar.j = true;
                umVar.k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.c;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (this.a.A && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    public final boolean h(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm.h(int):boolean");
    }

    public final void i(um umVar) {
        this.a = umVar;
        int i = this.h;
        if (i >= 0) {
            Drawable d = umVar.d(i);
            this.c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.y = umVar;
        this.F = umVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        um umVar = this.a;
        if (umVar != null) {
            umVar.r = false;
            umVar.t = false;
        }
        if (drawable == this.c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    @Override
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override
    public final void jumpToCurrentState() {
        e();
        wld wldVar = this.G;
        if (wldVar != null) {
            wldVar.d();
            this.G = null;
            h(this.H);
            this.H = -1;
            this.I = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.J) {
            g();
            um umVar = this.F;
            umVar.I = umVar.I.clone();
            umVar.J = umVar.J.clone();
            this.J = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i) {
        um umVar = this.a;
        int i2 = this.h;
        int i3 = umVar.h;
        Drawable[] drawableArr = umVar.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        umVar.x = i;
        return z;
    }

    @Override
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override
    public final boolean onStateChange(int[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm.onStateChange(int[]):boolean");
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override
    public final void setAlpha(int i) {
        if (!this.f || this.e != i) {
            this.f = true;
            this.e = i;
            Drawable drawable = this.c;
            if (drawable != null) {
                if (this.s == 0) {
                    drawable.setAlpha(i);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z) {
        um umVar = this.a;
        if (umVar.A != z) {
            umVar.A = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        um umVar = this.a;
        umVar.C = true;
        if (umVar.B != colorFilter) {
            umVar.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z) {
        um umVar = this.a;
        if (umVar.w != z) {
            umVar.w = z;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        um umVar = this.a;
        umVar.F = true;
        if (umVar.D != colorStateList) {
            umVar.D = colorStateList;
            this.c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        um umVar = this.a;
        umVar.G = true;
        if (umVar.E != mode) {
            umVar.E = mode;
            this.c.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z, boolean z2) {
        boolean j = j(z, z2);
        wld wldVar = this.G;
        if (wldVar != null && (j || z2)) {
            if (z) {
                wldVar.c();
                return j;
            }
            jumpToCurrentState();
        }
        return j;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
