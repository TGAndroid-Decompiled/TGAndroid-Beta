package i;

import ah.f1;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.activity.i;
import v7.w7;
public final class e extends Drawable implements Drawable.Callback {
    public static final int J = 0;
    public b E;
    public w7 F;
    public boolean I;
    public b f10881a;
    public Rect f10882b;
    public Drawable f10883c;
    public Drawable d;
    public boolean f10884f;
    public boolean f10885n;
    public i f10886r;
    public long f10887s;
    public long v;
    public f1 f10888w;
    public b f10889x;
    public boolean f10890y;
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
        b bVar = this.f10881a;
        if (theme != null) {
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f10858g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    bVar.e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f10855b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = bVar.f10856c;
                bVar.f10856c = i12;
                if (i13 != i12) {
                    bVar.f10863m = false;
                    bVar.f10860j = false;
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
        return this.f10881a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f10888w == null) {
            this.f10888w = new f1();
        }
        f1 f1Var = this.f10888w;
        f1Var.f734b = drawable.getCallback();
        drawable.setCallback(f1Var);
        try {
            if (this.f10881a.f10874y <= 0 && this.f10884f) {
                drawable.setAlpha(this.e);
            }
            b bVar = this.f10881a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f10881a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10881a.f10872w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f10881a.A);
            Rect rect = this.f10882b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f1 f1Var2 = this.f10888w;
            f1Var2.f734b = null;
            drawable.setCallback((Drawable.Callback) f1Var2.f734b);
        } catch (Throwable th2) {
            f1 f1Var3 = this.f10888w;
            f1Var3.f734b = null;
            drawable.setCallback((Drawable.Callback) f1Var3.f734b);
            throw th2;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10883c;
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
        Drawable drawable2 = this.f10883c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10884f) {
                this.f10883c.setAlpha(this.e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f10887s != 0) {
            this.f10887s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f10885n && super.mutate() == this) {
            b bVar = new b(this.E, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f10885n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f10890y) {
            f();
            b bVar = this.f10889x;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.f10890y = true;
        }
        return this;
    }

    @Override
    public final int getAlpha() {
        return this.e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f10881a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f10881a;
        if (bVar.f10871u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f10871u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f10858g;
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
            this.f10881a.d = getChangingConfigurations();
            return this.f10881a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f10883c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10882b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f10881a;
        if (bVar.f10862l) {
            if (!bVar.f10863m) {
                bVar.b();
            }
            return bVar.f10865o;
        }
        Drawable drawable = this.f10883c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f10881a;
        if (bVar.f10862l) {
            if (!bVar.f10863m) {
                bVar.b();
            }
            return bVar.f10864n;
        }
        Drawable drawable = this.f10883c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f10881a;
        if (bVar.f10862l) {
            if (!bVar.f10863m) {
                bVar.b();
            }
            return bVar.f10867q;
        }
        Drawable drawable = this.f10883c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f10881a;
        if (bVar.f10862l) {
            if (!bVar.f10863m) {
                bVar.b();
            }
            return bVar.f10866p;
        }
        Drawable drawable = this.f10883c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f10883c;
        int i10 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f10881a;
            if (bVar.f10868r) {
                return bVar.f10869s;
            }
            bVar.c();
            int i11 = bVar.h;
            Drawable[] drawableArr = bVar.f10858g;
            if (i11 > 0) {
                i10 = drawableArr[0].getOpacity();
            }
            for (int i12 = 1; i12 < i11; i12++) {
                i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
            }
            bVar.f10869s = i10;
            bVar.f10868r = true;
        }
        return i10;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f10883c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f10881a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f10859i) {
            Rect rect3 = bVar.f10861k;
            if (rect3 == null && !bVar.f10860j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f10858g;
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
                bVar.f10860j = true;
                bVar.f10861k = rect2;
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
            Drawable drawable = this.f10883c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f10881a.A && getLayoutDirection() == 1) {
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
        this.f10881a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable d = bVar.d(i10);
            this.f10883c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.f10889x = bVar;
        this.E = bVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f10881a;
        if (bVar != null) {
            bVar.f10868r = false;
            bVar.f10870t = false;
        }
        if (drawable == this.f10883c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f10881a.A;
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
        Drawable drawable2 = this.f10883c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void jumpToCurrentState() {
        e();
        w7 w7Var = this.F;
        if (w7Var != null) {
            w7Var.d();
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
        Drawable drawable2 = this.f10883c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.f10881a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f10858g;
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
        bVar.f10873x = i10;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f10883c;
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
        if (drawable == this.f10883c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (!this.f10884f || this.e != i10) {
            this.f10884f = true;
            this.e = i10;
            Drawable drawable = this.f10883c;
            if (drawable != null) {
                if (this.f10887s == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f10881a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f10883c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f10881a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f10883c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f10881a;
        if (bVar.f10872w != z10) {
            bVar.f10872w = z10;
            Drawable drawable = this.f10883c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f7, float f10) {
        Drawable drawable = this.f10883c;
        if (drawable != null) {
            drawable.setHotspot(f7, f10);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f10882b;
        if (rect == null) {
            this.f10882b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f10883c;
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
        b bVar = this.f10881a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f10883c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f10881a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f10883c.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean j10 = j(z10, z11);
        w7 w7Var = this.F;
        if (w7Var != null && (j10 || z11)) {
            if (z10) {
                w7Var.c();
                return j10;
            }
            jumpToCurrentState();
        }
        return j10;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f10883c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
