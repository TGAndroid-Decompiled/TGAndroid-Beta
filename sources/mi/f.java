package mi;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import li.n;
import org.telegram.ui.ActionBar.i6;
import w7.z;
import yf.y;
public final class f extends li.e {
    public final oi.a f16455e;
    public final li.c f16456f;
    public final z f16457g;
    public final z h;
    public z f16458i;
    public boolean f16459j = true;
    public boolean f16460k = true;
    public int f16461l = 1;
    public g f16462m;
    public g f16463n;
    public g f16464o;
    public fh.c f16465p;
    public int f16466q;
    public int f16467r;
    public int f16468s;
    public int f16469t;
    public final RectF f16470u;

    public f(oi.a aVar) {
        li.c cVar;
        z aVar2;
        g gVar = g.f16471b;
        this.f16462m = gVar;
        this.f16463n = gVar;
        this.f16464o = gVar;
        this.f16467r = 255;
        this.f16469t = 255;
        this.f16470u = new RectF();
        this.f16455e = aVar;
        if (aVar instanceof li.c) {
            cVar = (li.c) aVar;
        } else {
            cVar = null;
        }
        this.f16456f = cVar;
        if (aVar instanceof oi.b) {
            if (Build.VERSION.SDK_INT >= 29) {
                aVar2 = new b(this);
            } else {
                aVar2 = new a(this, false);
            }
            this.f16457g = aVar2;
            this.h = aVar2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.f16457g = new e(this);
                this.h = new b(this);
            } else if (i10 >= 31) {
                this.f16457g = new c(this);
                this.h = new b(this);
            } else {
                this.f16457g = new a(this, true);
                this.h = new a(this, false);
            }
        }
        g(this.f15647a);
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
            i12 = gVar.f16472a;
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
        int i13 = fVar.f16461l;
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
        y.a(y.f51028i, i10, iArr);
        int i14 = fVar.f16461l;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f16458i.b();
            return;
        }
        RectF rectF = this.f16470u;
        rectF.set(bounds);
        rectF.offset(this.f15649c, this.d);
        this.f16458i.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: mi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f16458i.d();
    }

    @Override
    public final void f(int i10, int i11) {
        this.f16458i.e(i11 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(n nVar) {
        z zVar;
        boolean z10 = nVar.f15684a;
        z zVar2 = this.h;
        if (z10) {
            zVar = this.f16457g;
        } else {
            zVar = zVar2;
        }
        z zVar3 = this.f16458i;
        if (zVar3 != zVar) {
            if (zVar3 != null) {
                zVar3.b();
            }
            this.f16458i = zVar;
            zVar.e(this.f15648b / 255.0f);
            if (this.f16458i == zVar2) {
                this.f16460k = true;
            } else {
                this.f16459j = true;
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
        z zVar = this.f16458i;
        zVar.getClass();
        return !(zVar instanceof a);
    }

    @Override
    public final void k() {
        fh.c cVar = this.f16465p;
        if (cVar != null) {
            this.f16466q = i6.l1(this.f16467r / 255.0f, cVar.f9857b);
            this.f16468s = i6.l1(this.f16469t / 255.0f, this.f16465p.f9857b);
        }
        this.f16459j = true;
        this.f16460k = true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16459j = true;
        this.f16460k = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
