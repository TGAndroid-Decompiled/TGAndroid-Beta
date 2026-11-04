package i;

import a3.o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b8.qc;
public final class e extends Drawable implements Drawable.Callback {
    public static final int K = 0;
    public boolean E;
    public b F;
    public qc G;
    public boolean J;
    public b f14482a;
    public Rect f14483b;
    public Drawable f14484c;
    public Drawable d;
    public boolean f14486f;
    public boolean f14487n;
    public o f14488r;
    public long f14489s;
    public long f14490w;
    public ah.a f14491x;
    public b f14492y;
    public int f14485e = 255;
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
        b bVar = this.f14482a;
        if (theme != null) {
            bVar.c();
            int i3 = bVar.h;
            Drawable[] drawableArr = bVar.f14459g;
            for (int i10 = 0; i10 < i3; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    bVar.f14457e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f14455b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar.f14456c;
                bVar.f14456c = i11;
                if (i12 != i11) {
                    bVar.f14464m = false;
                    bVar.f14461j = false;
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
        return this.f14482a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f14491x == null) {
            this.f14491x = new ah.a();
        }
        ah.a aVar = this.f14491x;
        aVar.f423b = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f14482a.f14475y <= 0 && this.f14486f) {
                drawable.setAlpha(this.f14485e);
            }
            b bVar = this.f14482a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f14482a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f14482a.f14473w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f14482a.A);
            Rect rect = this.f14483b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            ah.a aVar2 = this.f14491x;
            aVar2.f423b = null;
            drawable.setCallback((Drawable.Callback) aVar2.f423b);
        } catch (Throwable th2) {
            ah.a aVar3 = this.f14491x;
            aVar3.f423b = null;
            drawable.setCallback((Drawable.Callback) aVar3.f423b);
            throw th2;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14484c;
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
        Drawable drawable2 = this.f14484c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f14486f) {
                this.f14484c.setAlpha(this.f14485e);
            }
        }
        if (this.f14490w != 0) {
            this.f14490w = 0L;
            z10 = true;
        }
        if (this.f14489s != 0) {
            this.f14489s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f14487n && super.mutate() == this) {
            b bVar = new b(this.F, this, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            i(bVar);
            this.f14487n = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.E) {
            f();
            b bVar = this.f14492y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.E = true;
        }
        return this;
    }

    @Override
    public final int getAlpha() {
        return this.f14485e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f14482a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f14482a;
        if (bVar.f14472u) {
            z10 = bVar.v;
        } else {
            bVar.c();
            bVar.f14472u = true;
            int i3 = bVar.h;
            Drawable[] drawableArr = bVar.f14459g;
            int i10 = 0;
            while (true) {
                if (i10 < i3) {
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
            this.f14482a.d = getChangingConfigurations();
            return this.f14482a;
        }
        return null;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f14484c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f14483b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f14482a;
        if (bVar.f14463l) {
            if (!bVar.f14464m) {
                bVar.b();
            }
            return bVar.f14466o;
        }
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f14482a;
        if (bVar.f14463l) {
            if (!bVar.f14464m) {
                bVar.b();
            }
            return bVar.f14465n;
        }
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f14482a;
        if (bVar.f14463l) {
            if (!bVar.f14464m) {
                bVar.b();
            }
            return bVar.f14468q;
        }
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f14482a;
        if (bVar.f14463l) {
            if (!bVar.f14464m) {
                bVar.b();
            }
            return bVar.f14467p;
        }
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f14484c;
        int i3 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f14482a;
            if (bVar.f14469r) {
                return bVar.f14470s;
            }
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f14459g;
            if (i10 > 0) {
                i3 = drawableArr[0].getOpacity();
            }
            for (int i11 = 1; i11 < i10; i11++) {
                i3 = Drawable.resolveOpacity(i3, drawableArr[i11].getOpacity());
            }
            bVar.f14470s = i3;
            bVar.f14469r = true;
        }
        return i3;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f14482a;
        Rect rect2 = null;
        boolean z10 = false;
        if (!bVar.f14460i) {
            Rect rect3 = bVar.f14462k;
            if (rect3 == null && !bVar.f14461j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i3 = bVar.h;
                Drawable[] drawableArr = bVar.f14459g;
                for (int i10 = 0; i10 < i3; i10++) {
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
                bVar.f14461j = true;
                bVar.f14462k = rect2;
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
            Drawable drawable = this.f14484c;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f14482a.A && getLayoutDirection() == 1) {
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
        this.f14482a = bVar;
        int i3 = this.h;
        if (i3 >= 0) {
            Drawable d = bVar.d(i3);
            this.f14484c = d;
            if (d != null) {
                d(d);
            }
        }
        this.d = null;
        this.f14492y = bVar;
        this.F = bVar;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f14482a;
        if (bVar != null) {
            bVar.f14469r = false;
            bVar.f14471t = false;
        }
        if (drawable == this.f14484c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f14482a.A;
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
        Drawable drawable2 = this.f14484c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void jumpToCurrentState() {
        e();
        qc qcVar = this.G;
        if (qcVar != null) {
            qcVar.d();
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
        Drawable drawable2 = this.f14484c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i3) {
        b bVar = this.f14482a;
        int i10 = this.h;
        int i11 = bVar.h;
        Drawable[] drawableArr = bVar.f14459g;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i3);
                if (i12 == i10) {
                    z10 = layoutDirection;
                }
            }
        }
        bVar.f14474x = i3;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        Drawable drawable2 = this.f14484c;
        if (drawable2 != null) {
            return drawable2.setLevel(i3);
        }
        return false;
    }

    @Override
    public final boolean onStateChange(int[] r18) {
        throw new UnsupportedOperationException("Method not decompiled: i.e.onStateChange(int[]):boolean");
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f14484c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i3) {
        if (!this.f14486f || this.f14485e != i3) {
            this.f14486f = true;
            this.f14485e = i3;
            Drawable drawable = this.f14484c;
            if (drawable != null) {
                if (this.f14489s == 0) {
                    drawable.setAlpha(i3);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f14482a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f14484c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f14482a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f14484c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f14482a;
        if (bVar.f14473w != z10) {
            bVar.f14473w = z10;
            Drawable drawable = this.f14484c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i3, int i10, int i11, int i12) {
        Rect rect = this.f14483b;
        if (rect == null) {
            this.f14483b = new Rect(i3, i10, i11, i12);
        } else {
            rect.set(i3, i10, i11, i12);
        }
        Drawable drawable = this.f14484c;
        if (drawable != null) {
            drawable.setHotspotBounds(i3, i10, i11, i12);
        }
    }

    @Override
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f14482a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f14484c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f14482a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f14484c.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean j10 = j(z10, z11);
        qc qcVar = this.G;
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
        if (drawable == this.f14484c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
