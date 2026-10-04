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
    public final oi.a f16456e;
    public final li.c f16457f;
    public final z f16458g;
    public final z h;
    public z f16459i;
    public boolean f16460j = true;
    public boolean f16461k = true;
    public int f16462l = 1;
    public g f16463m;
    public g f16464n;
    public g f16465o;
    public fh.c f16466p;
    public int f16467q;
    public int f16468r;
    public int f16469s;
    public int f16470t;
    public final RectF f16471u;

    public f(oi.a aVar) {
        li.c cVar;
        z aVar2;
        g gVar = g.f16472b;
        this.f16463m = gVar;
        this.f16464n = gVar;
        this.f16465o = gVar;
        this.f16468r = 255;
        this.f16470t = 255;
        this.f16471u = new RectF();
        this.f16456e = aVar;
        if (aVar instanceof li.c) {
            cVar = (li.c) aVar;
        } else {
            cVar = null;
        }
        this.f16457f = cVar;
        if (aVar instanceof oi.b) {
            if (Build.VERSION.SDK_INT >= 29) {
                aVar2 = new b(this);
            } else {
                aVar2 = new a(this, false);
            }
            this.f16458g = aVar2;
            this.h = aVar2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.f16458g = new e(this);
                this.h = new b(this);
            } else if (i10 >= 31) {
                this.f16458g = new c(this);
                this.h = new b(this);
            } else {
                this.f16458g = new a(this, true);
                this.h = new a(this, false);
            }
        }
        g(this.f15648a);
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
            i12 = gVar.f16473a;
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
        int i13 = fVar.f16462l;
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
        y.a(y.f51029i, i10, iArr);
        int i14 = fVar.f16462l;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f16459i.b();
            return;
        }
        RectF rectF = this.f16471u;
        rectF.set(bounds);
        rectF.offset(this.f15650c, this.d);
        this.f16459i.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: mi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f16459i.d();
    }

    @Override
    public final void f(int i10, int i11) {
        this.f16459i.e(i11 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(n nVar) {
        z zVar;
        boolean z10 = nVar.f15685a;
        z zVar2 = this.h;
        if (z10) {
            zVar = this.f16458g;
        } else {
            zVar = zVar2;
        }
        z zVar3 = this.f16459i;
        if (zVar3 != zVar) {
            if (zVar3 != null) {
                zVar3.b();
            }
            this.f16459i = zVar;
            zVar.e(this.f15649b / 255.0f);
            if (this.f16459i == zVar2) {
                this.f16461k = true;
            } else {
                this.f16460j = true;
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
        z zVar = this.f16459i;
        zVar.getClass();
        return !(zVar instanceof a);
    }

    @Override
    public final void k() {
        fh.c cVar = this.f16466p;
        if (cVar != null) {
            this.f16467q = i6.l1(this.f16468r / 255.0f, cVar.f9857b);
            this.f16469s = i6.l1(this.f16470t / 255.0f, this.f16466p.f9857b);
        }
        this.f16460j = true;
        this.f16461k = true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16460j = true;
        this.f16461k = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
