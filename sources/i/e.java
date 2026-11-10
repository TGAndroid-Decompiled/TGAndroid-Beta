package i;

import a8.ra;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c8.h0;
public final class e extends Drawable implements Drawable.Callback {
    public static final int J = 0;
    public boolean D;
    public b E;
    public h0 F;
    public boolean I;
    public b f15109a;
    public Rect f15110b;
    public Drawable f15111c;
    public Drawable d;
    public boolean f15113f;
    public boolean f15114n;
    public ra f15115r;
    public long f15116s;
    public long f15117w;
    public a5.b f15118x;
    public b f15119y;
    public int f15112e = 255;
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
        b bVar = this.f15109a;
        if (theme != null) {
            bVar.c();
            int i7 = bVar.h;
            Drawable[] drawableArr = bVar.f15086g;
            for (int i10 = 0; i10 < i7; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    bVar.f15084e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f15082b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar.f15083c;
                bVar.f15083c = i11;
                if (i12 != i11) {
                    bVar.f15091m = false;
                    bVar.f15088j = false;
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
        return this.f15109a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f15118x == null) {
            this.f15118x = new a5.b();
        }
        a5.b bVar = this.f15118x;
        bVar.f210b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f15109a.f15102y <= 0 && this.f15113f) {
                drawable.setAlpha(this.f15112e);
            }
            b bVar2 = this.f15109a;
            if (bVar2.C) {
                drawable.setColorFilter(bVar2.B);
            } else {
                if (bVar2.F) {
                    drawable.setTintList(bVar2.D);
                }
                b bVar3 = this.f15109a;
                if (bVar3.G) {
                    drawable.setTintMode(bVar3.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f15109a.f15100w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f15109a.A);
            Rect rect = this.f15110b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            a5.b bVar4 = this.f15118x;
            bVar4.f210b = null;
            drawable.setCallback((Drawable.Callback) bVar4.f210b);
        } catch (Throwable th2) {
            a5.b bVar5 = this.f15118x;
            bVar5.f210b = null;
            drawable.setCallback((Drawable.Callback) bVar5.f210b);
            throw th2;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z9;
        Drawable drawable = this.d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f15111c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f15113f) {
                this.f15111c.setAlpha(this.f15112e);
            }
        }
        if (this.f15117w != 0) {
            this.f15117w = 0L;
            z9 = true;
        }
        if (this.f15116s != 0) {
            this.f15116s = 0L;
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f15114n && super.mutate() == this) {
            b bVar = new b(this.E, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f15114n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.D) {
            f();
            b bVar = this.f15119y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.D = true;
        }
        return this;
    }

    @Override
    public final int getAlpha() {
        return this.f15112e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f15109a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z9;
        b bVar = this.f15109a;
        if (bVar.f15099u) {
            z9 = bVar.v;
        } else {
            bVar.c();
            bVar.f15099u = true;
            int i7 = bVar.h;
            Drawable[] drawableArr = bVar.f15086g;
            int i10 = 0;
            while (true) {
                if (i10 < i7) {
                    if (drawableArr[i10].getConstantState() == null) {
                        bVar.v = false;
                        z9 = false;
                        break;
                    }
                    i10++;
                } else {
                    bVar.v = true;
                    z9 = true;
                    break;
                }
            }
        }
        if (z9) {
            this.f15109a.d = getChangingConfigurations();
            return this.f15109a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f15111c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f15110b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f15109a;
        if (bVar.f15090l) {
            if (!bVar.f15091m) {
                bVar.b();
            }
            return bVar.f15093o;
        }
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f15109a;
        if (bVar.f15090l) {
            if (!bVar.f15091m) {
                bVar.b();
            }
            return bVar.f15092n;
        }
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f15109a;
        if (bVar.f15090l) {
            if (!bVar.f15091m) {
                bVar.b();
            }
            return bVar.f15095q;
        }
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f15109a;
        if (bVar.f15090l) {
            if (!bVar.f15091m) {
                bVar.b();
            }
            return bVar.f15094p;
        }
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f15111c;
        int i7 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f15109a;
            if (bVar.f15096r) {
                return bVar.f15097s;
            }
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f15086g;
            if (i10 > 0) {
                i7 = drawableArr[0].getOpacity();
            }
            for (int i11 = 1; i11 < i10; i11++) {
                i7 = Drawable.resolveOpacity(i7, drawableArr[i11].getOpacity());
            }
            bVar.f15097s = i7;
            bVar.f15096r = true;
        }
        return i7;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f15109a;
        Rect rect2 = null;
        boolean z9 = false;
        if (!bVar.f15087i) {
            Rect rect3 = bVar.f15089k;
            if (rect3 == null && !bVar.f15088j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i7 = bVar.h;
                Drawable[] drawableArr = bVar.f15086g;
                for (int i10 = 0; i10 < i7; i10++) {
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
                bVar.f15088j = true;
                bVar.f15089k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z9 = true;
            }
        } else {
            Drawable drawable = this.f15111c;
            if (drawable != null) {
                z9 = drawable.getPadding(rect);
            } else {
                z9 = super.getPadding(rect);
            }
        }
        if (this.f15109a.A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z9;
    }

    public final boolean h(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f15109a = bVar;
        int i7 = this.h;
        if (i7 >= 0) {
            Drawable d = bVar.d(i7);
            this.f15111c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.f15119y = bVar;
        this.E = bVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f15109a;
        if (bVar != null) {
            bVar.f15096r = false;
            bVar.f15098t = false;
        }
        if (drawable == this.f15111c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f15109a.A;
    }

    @Override
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.f15111c;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    @Override
    public final void jumpToCurrentState() {
        e();
        h0 h0Var = this.F;
        if (h0Var != null) {
            h0Var.d();
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
        Drawable drawable2 = this.f15111c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i7) {
        b bVar = this.f15109a;
        int i10 = this.h;
        int i11 = bVar.h;
        Drawable[] drawableArr = bVar.f15086g;
        boolean z9 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i7);
                if (i12 == i10) {
                    z9 = layoutDirection;
                }
            }
        }
        bVar.f15101x = i7;
        return z9;
    }

    @Override
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f15111c;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    @Override
    public final boolean onStateChange(int[] r18) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.onStateChange(int[]):boolean");
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable == this.f15111c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        if (!this.f15113f || this.f15112e != i7) {
            this.f15113f = true;
            this.f15112e = i7;
            Drawable drawable = this.f15111c;
            if (drawable != null) {
                if (this.f15116s == 0) {
                    drawable.setAlpha(i7);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z9) {
        b bVar = this.f15109a;
        if (bVar.A != z9) {
            bVar.A = z9;
            Drawable drawable = this.f15111c;
            if (drawable != null) {
                drawable.setAutoMirrored(z9);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f15109a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f15111c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z9) {
        b bVar = this.f15109a;
        if (bVar.f15100w != z9) {
            bVar.f15100w = z9;
            Drawable drawable = this.f15111c;
            if (drawable != null) {
                drawable.setDither(z9);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        Rect rect = this.f15110b;
        if (rect == null) {
            this.f15110b = new Rect(i7, i10, i11, i12);
        } else {
            rect.set(i7, i10, i11, i12);
        }
        Drawable drawable = this.f15111c;
        if (drawable != null) {
            drawable.setHotspotBounds(i7, i10, i11, i12);
        }
    }

    @Override
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f15109a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f15111c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f15109a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f15111c.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean j3 = j(z9, z10);
        h0 h0Var = this.F;
        if (h0Var != null && (j3 || z10)) {
            if (z9) {
                h0Var.c();
                return j3;
            }
            jumpToCurrentState();
        }
        return j3;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f15111c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
