package fi;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import ei.s;
import org.telegram.ui.ActionBar.t6;
import rf.w;
import v7.i7;
public final class g extends ei.f {
    public h D;
    public h E;
    public h F;
    public hi.c G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final RectF L;
    public final hi.a f7125f;
    public final a h;
    public final i7 f7126n;
    public final i7 f7127r;
    public i7 f7128s;
    public boolean f7129w = true;
    public boolean f7130x = true;
    public int f7131y = 1;

    public g(hi.a aVar) {
        a aVar2;
        i7 bVar;
        h hVar = h.f7132b;
        this.D = hVar;
        this.E = hVar;
        this.F = hVar;
        this.I = 255;
        this.K = 255;
        this.L = new RectF();
        this.f7125f = aVar;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
        } else {
            aVar2 = null;
        }
        this.h = aVar2;
        if (aVar instanceof hi.e) {
            if (Build.VERSION.SDK_INT >= 29) {
                bVar = new c(this);
            } else {
                bVar = new b(this, false);
            }
            this.f7126n = bVar;
            this.f7127r = bVar;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.f7126n = new f(this);
                this.f7127r = new c(this);
            } else if (i10 >= 31) {
                this.f7126n = new d(this);
                this.f7127r = new c(this);
            } else {
                this.f7126n = new b(this, true);
                this.f7127r = new b(this, false);
            }
        }
        g(this.f6649b);
    }

    public static LinearGradient k(g gVar, h hVar, float f7, float f10, int i10, int i11) {
        int i12;
        if (hVar == null) {
            i12 = -1;
        } else {
            i12 = hVar.f7133a;
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
        int i13 = gVar.f7131y;
        if (i13 == 1 || i13 == 2) {
            z10 = true;
        }
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
        w.a(w.f46580i, i10, iArr);
        int i14 = gVar.f7131y;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static float l(float f7, int i10, int i11) {
        float f10;
        float f11;
        return (((float) Math.floor((f7 - f10) / f11)) * i11) + i10;
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f7128s.b();
            return;
        }
        RectF rectF = this.L;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.f7128s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f7128s.d();
    }

    @Override
    public final void f(int i10) {
        this.f7128s.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(s sVar) {
        i7 i7Var;
        boolean z10 = sVar.f6693a;
        i7 i7Var2 = this.f7127r;
        if (z10) {
            i7Var = this.f7126n;
        } else {
            i7Var = i7Var2;
        }
        i7 i7Var3 = this.f7128s;
        if (i7Var3 != i7Var) {
            if (i7Var3 != null) {
                i7Var3.b();
            }
            this.f7128s = i7Var;
            i7Var.e(this.f6650c / 255.0f);
            if (this.f7128s == i7Var2) {
                this.f7130x = true;
            } else {
                this.f7129w = true;
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
        i7 i7Var = this.f7128s;
        i7Var.getClass();
        return !(i7Var instanceof b);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7129w = true;
        this.f7130x = true;
    }

    @Override
    public final void updateColors() {
        hi.c cVar = this.G;
        if (cVar != null) {
            this.H = t6.r1(this.I / 255.0f, cVar.f7712b);
            this.J = t6.r1(this.K / 255.0f, this.G.f7712b);
        }
        this.f7129w = true;
        this.f7130x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
