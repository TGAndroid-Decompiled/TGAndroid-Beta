package i;

import a8.sa;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c8.i0;
public final class e extends Drawable implements Drawable.Callback {
    public static final int K = 0;
    public boolean E;
    public b F;
    public i0 G;
    public boolean J;
    public b f15560a;
    public Rect f15561b;
    public Drawable f15562c;
    public Drawable d;
    public boolean f15564f;
    public boolean f15565n;
    public sa f15566r;
    public long f15567s;
    public long f15568w;
    public a5.b f15569x;
    public b f15570y;
    public int f15563e = 255;
    public int h = -1;
    public int H = -1;
    public int I = -1;

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
        b bVar = this.f15560a;
        if (theme != null) {
            bVar.c();
            int i7 = bVar.h;
            Drawable[] drawableArr = bVar.f15537g;
            for (int i10 = 0; i10 < i7; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    bVar.f15535e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f15533b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar.f15534c;
                bVar.f15534c = i11;
                if (i12 != i11) {
                    bVar.f15542m = false;
                    bVar.f15539j = false;
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
        return this.f15560a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f15569x == null) {
            this.f15569x = new a5.b();
        }
        a5.b bVar = this.f15569x;
        bVar.f210b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f15560a.f15553y <= 0 && this.f15564f) {
                drawable.setAlpha(this.f15563e);
            }
            b bVar2 = this.f15560a;
            if (bVar2.C) {
                drawable.setColorFilter(bVar2.B);
            } else {
                if (bVar2.F) {
                    drawable.setTintList(bVar2.D);
                }
                b bVar3 = this.f15560a;
                if (bVar3.G) {
                    drawable.setTintMode(bVar3.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f15560a.f15551w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f15560a.A);
            Rect rect = this.f15561b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            a5.b bVar4 = this.f15569x;
            bVar4.f210b = null;
            drawable.setCallback((Drawable.Callback) bVar4.f210b);
        } catch (Throwable th2) {
            a5.b bVar5 = this.f15569x;
            bVar5.f210b = null;
            drawable.setCallback((Drawable.Callback) bVar5.f210b);
            throw th2;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f15562c;
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
        Drawable drawable2 = this.f15562c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f15564f) {
                this.f15562c.setAlpha(this.f15563e);
            }
        }
        if (this.f15568w != 0) {
            this.f15568w = 0L;
            z10 = true;
        }
        if (this.f15567s != 0) {
            this.f15567s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f15565n && super.mutate() == this) {
            b bVar = new b(this.F, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f15565n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.E) {
            f();
            b bVar = this.f15570y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.E = true;
        }
        return this;
    }

    @Override
    public final int getAlpha() {
        return this.f15563e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f15560a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f15560a;
        if (bVar.f15550u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f15550u = true;
            int i7 = bVar.h;
            Drawable[] drawableArr = bVar.f15537g;
            int i10 = 0;
            while (true) {
                if (i10 < i7) {
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
            this.f15560a.d = getChangingConfigurations();
            return this.f15560a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f15562c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f15561b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f15560a;
        if (bVar.f15541l) {
            if (!bVar.f15542m) {
                bVar.b();
            }
            return bVar.f15544o;
        }
        Drawable drawable = this.f15562c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f15560a;
        if (bVar.f15541l) {
            if (!bVar.f15542m) {
                bVar.b();
            }
            return bVar.f15543n;
        }
        Drawable drawable = this.f15562c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f15560a;
        if (bVar.f15541l) {
            if (!bVar.f15542m) {
                bVar.b();
            }
            return bVar.f15546q;
        }
        Drawable drawable = this.f15562c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f15560a;
        if (bVar.f15541l) {
            if (!bVar.f15542m) {
                bVar.b();
            }
            return bVar.f15545p;
        }
        Drawable drawable = this.f15562c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f15562c;
        int i7 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f15560a;
            if (bVar.f15547r) {
                return bVar.f15548s;
            }
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f15537g;
            if (i10 > 0) {
                i7 = drawableArr[0].getOpacity();
            }
            for (int i11 = 1; i11 < i10; i11++) {
                i7 = Drawable.resolveOpacity(i7, drawableArr[i11].getOpacity());
            }
            bVar.f15548s = i7;
            bVar.f15547r = true;
        }
        return i7;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f15562c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f15560a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f15538i) {
            Rect rect3 = bVar.f15540k;
            if (rect3 == null && !bVar.f15539j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i7 = bVar.h;
                Drawable[] drawableArr = bVar.f15537g;
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
                bVar.f15539j = true;
                bVar.f15540k = rect2;
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
            Drawable drawable = this.f15562c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f15560a.A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z10;
    }

    public final boolean h(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f15560a = bVar;
        int i7 = this.h;
        if (i7 >= 0) {
            Drawable d = bVar.d(i7);
            this.f15562c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.f15570y = bVar;
        this.F = bVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f15560a;
        if (bVar != null) {
            bVar.f15547r = false;
            bVar.f15549t = false;
        }
        if (drawable == this.f15562c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f15560a.A;
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
        Drawable drawable2 = this.f15562c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void jumpToCurrentState() {
        e();
        i0 i0Var = this.G;
        if (i0Var != null) {
            i0Var.d();
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
            b bVar = this.F;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
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
        Drawable drawable2 = this.f15562c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i7) {
        b bVar = this.f15560a;
        int i10 = this.h;
        int i11 = bVar.h;
        Drawable[] drawableArr = bVar.f15537g;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i7);
                if (i12 == i10) {
                    z10 = layoutDirection;
                }
            }
        }
        bVar.f15552x = i7;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f15562c;
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
        if (drawable == this.f15562c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        if (!this.f15564f || this.f15563e != i7) {
            this.f15564f = true;
            this.f15563e = i7;
            Drawable drawable = this.f15562c;
            if (drawable != null) {
                if (this.f15567s == 0) {
                    drawable.setAlpha(i7);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f15560a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f15562c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f15560a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f15562c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f15560a;
        if (bVar.f15551w != z10) {
            bVar.f15551w = z10;
            Drawable drawable = this.f15562c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f15562c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        Rect rect = this.f15561b;
        if (rect == null) {
            this.f15561b = new Rect(i7, i10, i11, i12);
        } else {
            rect.set(i7, i10, i11, i12);
        }
        Drawable drawable = this.f15562c;
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
        b bVar = this.f15560a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f15562c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f15560a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f15562c.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean j3 = j(z10, z11);
        i0 i0Var = this.G;
        if (i0Var != null && (j3 || z11)) {
            if (z10) {
                i0Var.c();
                return j3;
            }
            jumpToCurrentState();
        }
        return j3;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f15562c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
