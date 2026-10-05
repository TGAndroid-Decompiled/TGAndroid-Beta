package mi;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import li.q;
import org.telegram.ui.ActionBar.i6;
import w7.z;
import yf.y;
public final class f extends li.e {
    public final oi.a f16465e;
    public final li.c f16466f;
    public final z f16467g;
    public final z h;
    public z f16468i;
    public boolean f16469j = true;
    public boolean f16470k = true;
    public int f16471l = 1;
    public g f16472m;
    public g f16473n;
    public g f16474o;
    public fh.c f16475p;
    public int f16476q;
    public int f16477r;
    public int f16478s;
    public int f16479t;
    public final RectF f16480u;

    public f(oi.a aVar) {
        li.c cVar;
        z aVar2;
        g gVar = g.f16481b;
        this.f16472m = gVar;
        this.f16473n = gVar;
        this.f16474o = gVar;
        this.f16477r = 255;
        this.f16479t = 255;
        this.f16480u = new RectF();
        this.f16465e = aVar;
        if (aVar instanceof li.c) {
            cVar = (li.c) aVar;
        } else {
            cVar = null;
        }
        this.f16466f = cVar;
        if (aVar instanceof oi.b) {
            if (Build.VERSION.SDK_INT >= 29) {
                aVar2 = new b(this);
            } else {
                aVar2 = new a(this, false);
            }
            this.f16467g = aVar2;
            this.h = aVar2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.f16467g = new e(this);
                this.h = new b(this);
            } else if (i10 >= 31) {
                this.f16467g = new c(this);
                this.h = new b(this);
            } else {
                this.f16467g = new a(this, true);
                this.h = new a(this, false);
            }
        }
        g(this.f15649a);
    }

    public static float l(float f7, int i10, int i11) {
        float f10;
        float f11;
        return (((float) Math.floor((f7 - f10) / f11)) * i11) + i10;
    }

    public static LinearGradient m(f fVar, g gVar, float f7, float f10, int i10, int i11) {
        int i12;
        if (gVar == null) {
            i12 = -1;
        } else {
            i12 = gVar.f16482a;
        }
        boolean z10 = false;
        float f11 = 0;
        float f12 = f7 - f11;
        float f13 = 0.0f;
        float max = Math.max(0.0f, f12 - f10);
        if (i12 != -1) {
            max = Math.min(i12, max);
        }
        float f14 = 1.0f;
        float f15 = 1.0f / i11;
        int i13 = fVar.f16471l;
        z10 = (i13 == 1 || i13 == 2) ? true : true;
        if (z10) {
            f11 = f12;
        }
        if (z10) {
            f13 = -0.0f;
        }
        float f16 = (f11 + f13) * f15;
        if (z10) {
            f14 = -1.0f;
        }
        float max2 = (Math.max(max * f15, 0.001f) * f14) + f16;
        int[] iArr = new int[8];
        y.a(y.f51042i, i10, iArr);
        int i14 = fVar.f16471l;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f16468i.b();
            return;
        }
        RectF rectF = this.f16480u;
        rectF.set(bounds);
        rectF.offset(this.f15651c, this.d);
        this.f16468i.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: mi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f16468i.d();
    }

    @Override
    public final void f(int i10) {
        this.f16468i.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(q qVar) {
        z zVar;
        boolean z10 = qVar.f15694a;
        z zVar2 = this.h;
        if (z10) {
            zVar = this.f16467g;
        } else {
            zVar = zVar2;
        }
        z zVar3 = this.f16468i;
        if (zVar3 != zVar) {
            if (zVar3 != null) {
                zVar3.b();
            }
            this.f16468i = zVar;
            zVar.e(this.f15650b / 255.0f);
            if (this.f16468i == zVar2) {
                this.f16470k = true;
            } else {
                this.f16469j = true;
            }
            invalidateSelf();
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final boolean j() {
        z zVar = this.f16468i;
        zVar.getClass();
        return !(zVar instanceof a);
    }

    @Override
    public final void k() {
        fh.c cVar = this.f16475p;
        if (cVar != null) {
            this.f16476q = i6.l1(this.f16477r / 255.0f, cVar.f9858b);
            this.f16478s = i6.l1(this.f16479t / 255.0f, this.f16475p.f9858b);
        }
        this.f16469j = true;
        this.f16470k = true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16469j = true;
        this.f16470k = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
