package mi;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import li.o;
import org.telegram.ui.ActionBar.i6;
import w7.z;
import yf.y;
public final class f extends li.e {
    public final oi.a f16460e;
    public final li.c f16461f;
    public final z f16462g;
    public final z h;
    public z f16463i;
    public boolean f16464j = true;
    public boolean f16465k = true;
    public int f16466l = 1;
    public g f16467m;
    public g f16468n;
    public g f16469o;
    public fh.c f16470p;
    public int f16471q;
    public int f16472r;
    public int f16473s;
    public int f16474t;
    public final RectF f16475u;

    public f(oi.a aVar) {
        li.c cVar;
        z aVar2;
        g gVar = g.f16476b;
        this.f16467m = gVar;
        this.f16468n = gVar;
        this.f16469o = gVar;
        this.f16472r = 255;
        this.f16474t = 255;
        this.f16475u = new RectF();
        this.f16460e = aVar;
        if (aVar instanceof li.c) {
            cVar = (li.c) aVar;
        } else {
            cVar = null;
        }
        this.f16461f = cVar;
        if (aVar instanceof oi.b) {
            if (Build.VERSION.SDK_INT >= 29) {
                aVar2 = new b(this);
            } else {
                aVar2 = new a(this, false);
            }
            this.f16462g = aVar2;
            this.h = aVar2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.f16462g = new e(this);
                this.h = new b(this);
            } else if (i10 >= 31) {
                this.f16462g = new c(this);
                this.h = new b(this);
            } else {
                this.f16462g = new a(this, true);
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
            i12 = gVar.f16477a;
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
        int i13 = fVar.f16466l;
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
        y.a(y.f51035i, i10, iArr);
        int i14 = fVar.f16466l;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f16463i.b();
            return;
        }
        RectF rectF = this.f16475u;
        rectF.set(bounds);
        rectF.offset(this.f15651c, this.d);
        this.f16463i.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: mi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f16463i.d();
    }

    @Override
    public final void f(int i10) {
        this.f16463i.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(o oVar) {
        z zVar;
        boolean z10 = oVar.f15689a;
        z zVar2 = this.h;
        if (z10) {
            zVar = this.f16462g;
        } else {
            zVar = zVar2;
        }
        z zVar3 = this.f16463i;
        if (zVar3 != zVar) {
            if (zVar3 != null) {
                zVar3.b();
            }
            this.f16463i = zVar;
            zVar.e(this.f15650b / 255.0f);
            if (this.f16463i == zVar2) {
                this.f16465k = true;
            } else {
                this.f16464j = true;
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
        z zVar = this.f16463i;
        zVar.getClass();
        return !(zVar instanceof a);
    }

    @Override
    public final void k() {
        fh.c cVar = this.f16470p;
        if (cVar != null) {
            this.f16471q = i6.l1(this.f16472r / 255.0f, cVar.f9858b);
            this.f16473s = i6.l1(this.f16474t / 255.0f, this.f16470p.f9858b);
        }
        this.f16464j = true;
        this.f16465k = true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16464j = true;
        this.f16465k = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
