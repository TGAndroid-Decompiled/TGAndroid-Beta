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
import android.os.SystemClock;
import g7.k8;

public abstract class f extends Drawable implements Drawable.Callback {

    public static final int f10477x = 0;

    public b f10478a;

    public Rect f10479b;

    public Drawable f10480c;
    public Drawable d;

    public int f10481e;

    public boolean f10482f;
    public int h;

    public boolean f10483n;

    public a8.b f10484r;

    public long f10485s;
    public long v;

    public fg.a f10486w;

    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j10;
        boolean z12 = true;
        this.f10482f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f10480c;
        if (drawable2 != null) {
            long j11 = this.f10485s;
            if (j11 != 0) {
                if (j11 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f10481e);
                    this.f10485s = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - jUptimeMillis) * 255)) / this.f10478a.f10469y)) * this.f10481e) / 255);
                    z11 = true;
                }
            }
            drawable = this.d;
            if (drawable != null) {
                j10 = this.v;
                if (j10 == 0) {
                    if (j10 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.d = null;
                        this.v = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f10478a.f10470z) * this.f10481e) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f10484r, jUptimeMillis + 16);
                return;
            }
            this.v = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f10485s = 0L;
        z11 = false;
        drawable = this.d;
        if (drawable != null) {
            j10 = this.v;
            if (j10 == 0) {
                if (j10 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.d = null;
                    this.v = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f10478a.f10470z) * this.f10481e) / 255);
                }
            }
            if (z10) {
            }
        }
        this.v = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f10478a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i10 = bVar.h;
        Drawable[] drawableArr = bVar.f10453g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i11].applyTheme(theme);
                bVar.f10451e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f10449b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar.f10450c;
            bVar.f10450c = i12;
            if (i13 != i12) {
                bVar.f10458m = false;
                bVar.f10455j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.f10486w == null) {
            this.f10486w = new fg.a();
        }
        fg.a aVar = this.f10486w;
        aVar.f6052b = drawable.getCallback();
        drawable.setCallback(aVar);
        try {
            if (this.f10478a.f10469y <= 0 && this.f10482f) {
                drawable.setAlpha(this.f10481e);
            }
            b bVar = this.f10478a;
            if (bVar.C) {
                drawable.setColorFilter(bVar.B);
            } else {
                if (bVar.F) {
                    drawable.setTintList(bVar.D);
                }
                b bVar2 = this.f10478a;
                if (bVar2.G) {
                    drawable.setTintMode(bVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10478a.f10467w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                k8.b(k8.a(this), drawable);
            }
            drawable.setAutoMirrored(this.f10478a.A);
            Rect rect = this.f10479b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            fg.a aVar2 = this.f10486w;
            Drawable.Callback callback = (Drawable.Callback) aVar2.f6052b;
            aVar2.f6052b = null;
            drawable.setCallback(callback);
        }
    }

    public final boolean c(int i10) {
        if (i10 == this.h) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f10478a.f10470z > 0) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f10480c;
            if (drawable2 != null) {
                this.d = drawable2;
                this.v = ((long) this.f10478a.f10470z) + jUptimeMillis;
            } else {
                this.d = null;
                this.v = 0L;
            }
        } else {
            Drawable drawable3 = this.f10480c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            b bVar = this.f10478a;
            if (i10 < bVar.h) {
                Drawable drawableD = bVar.d(i10);
                this.f10480c = drawableD;
                this.h = i10;
                if (drawableD != null) {
                    int i11 = this.f10478a.f10469y;
                    if (i11 > 0) {
                        this.f10485s = jUptimeMillis + ((long) i11);
                    }
                    b(drawableD);
                }
            } else {
                this.f10480c = null;
                this.h = -1;
            }
        } else {
            this.f10480c = null;
            this.h = -1;
        }
        if (this.f10485s != 0 || this.v != 0) {
            a8.b bVar2 = this.f10484r;
            if (bVar2 == null) {
                this.f10484r = new a8.b((e) this, 22);
            } else {
                unscheduleSelf(bVar2);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f10478a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f10480c;
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
        return this.f10481e;
    }

    @Override
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f10478a.getChangingConfigurations();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f10478a;
        if (!bVar.f10466u) {
            bVar.c();
            bVar.f10466u = true;
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f10453g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    bVar.v = true;
                    z10 = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    bVar.v = false;
                    z10 = false;
                    break;
                }
                i11++;
            }
        } else {
            z10 = bVar.v;
        }
        if (!z10) {
            return null;
        }
        this.f10478a.d = getChangingConfigurations();
        return this.f10478a;
    }

    @Override
    public final Drawable getCurrent() {
        return this.f10480c;
    }

    @Override
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10479b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        b bVar = this.f10478a;
        if (bVar.f10457l) {
            if (!bVar.f10458m) {
                bVar.b();
            }
            return bVar.f10460o;
        }
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override
    public final int getIntrinsicWidth() {
        b bVar = this.f10478a;
        if (bVar.f10457l) {
            if (!bVar.f10458m) {
                bVar.b();
            }
            return bVar.f10459n;
        }
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override
    public final int getMinimumHeight() {
        b bVar = this.f10478a;
        if (bVar.f10457l) {
            if (!bVar.f10458m) {
                bVar.b();
            }
            return bVar.f10462q;
        }
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override
    public final int getMinimumWidth() {
        b bVar = this.f10478a;
        if (bVar.f10457l) {
            if (!bVar.f10458m) {
                bVar.b();
            }
            return bVar.f10461p;
        }
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f10480c;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f10478a;
            if (bVar.f10463r) {
                return bVar.f10464s;
            }
            bVar.c();
            int i10 = bVar.h;
            Drawable[] drawableArr = bVar.f10453g;
            opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            bVar.f10464s = opacity;
            bVar.f10463r = true;
        }
        return opacity;
    }

    @Override
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override
    public final boolean getPadding(Rect rect) {
        b bVar = this.f10478a;
        Rect rect2 = null;
        boolean padding = false;
        if (!bVar.f10454i) {
            Rect rect3 = bVar.f10456k;
            if (rect3 != null || bVar.f10455j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.h;
                Drawable[] drawableArr = bVar.f10453g;
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
                bVar.f10455j = true;
                bVar.f10456k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f10480c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f10478a.A && k8.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f10478a;
        if (bVar != null) {
            bVar.f10463r = false;
            bVar.f10465t = false;
        }
        if (drawable != this.f10480c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override
    public final boolean isAutoMirrored() {
        return this.f10478a.A;
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
        Drawable drawable2 = this.f10480c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10482f) {
                this.f10480c.setAlpha(this.f10481e);
            }
        }
        if (this.v != 0) {
            this.v = 0L;
            z10 = true;
        }
        if (this.f10485s != 0) {
            this.f10485s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.f10483n && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.B, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f10483n = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10480c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.f10478a;
        int i11 = this.h;
        int i12 = bVar.h;
        Drawable[] drawableArr = bVar.f10453g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean zB = Build.VERSION.SDK_INT >= 23 ? k8.b(i10, drawable) : false;
                if (i13 == i11) {
                    z10 = zB;
                }
            }
        }
        bVar.f10468x = i10;
        return z10;
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f10480c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f10480c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.f10482f && this.f10481e == i10) {
            return;
        }
        this.f10482f = true;
        this.f10481e = i10;
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            if (this.f10485s == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f10478a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f10480c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f10478a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f10480c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override
    public final void setDither(boolean z10) {
        b bVar = this.f10478a;
        if (bVar.f10467w != z10) {
            bVar.f10467w = z10;
            Drawable drawable = this.f10480c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f10480c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f10479b;
        if (rect == null) {
            this.f10479b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f10480c;
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
        b bVar = this.f10478a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f10480c.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f10478a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f10480c.setTintMode(mode);
        }
    }

    @Override
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f10480c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f10480c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
