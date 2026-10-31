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
public final class f extends ei.f {
    public g D;
    public g E;
    public g F;
    public hi.c G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final RectF L;
    public final hi.a f7124f;
    public final ei.d h;
    public final i7 f7125n;
    public final i7 f7126r;
    public i7 f7127s;
    public boolean f7128w = true;
    public boolean f7129x = true;
    public int f7130y = 1;

    public f(hi.a aVar) {
        ei.d dVar;
        i7 aVar2;
        g gVar = g.f7131b;
        this.D = gVar;
        this.E = gVar;
        this.F = gVar;
        this.I = 255;
        this.K = 255;
        this.L = new RectF();
        this.f7124f = aVar;
        if (aVar instanceof ei.d) {
            dVar = (ei.d) aVar;
        } else {
            dVar = null;
        }
        this.h = dVar;
        if (aVar instanceof hi.e) {
            if (Build.VERSION.SDK_INT >= 29) {
                aVar2 = new b(this);
            } else {
                aVar2 = new a(this, false);
            }
            this.f7125n = aVar2;
            this.f7126r = aVar2;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.f7125n = new e(this);
                this.f7126r = new b(this);
            } else if (i10 >= 31) {
                this.f7125n = new c(this);
                this.f7126r = new b(this);
            } else {
                this.f7125n = new a(this, true);
                this.f7126r = new a(this, false);
            }
        }
        g(this.f6648b);
    }

    public static float k(float f7, int i10, int i11) {
        float f10;
        float f11;
        return (((float) Math.floor((f7 - f10) / f11)) * i11) + i10;
    }

    public static LinearGradient l(f fVar, g gVar, float f7, float f10, int i10, int i11) {
        int i12;
        if (gVar == null) {
            i12 = -1;
        } else {
            i12 = gVar.f7132a;
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
        int i13 = fVar.f7130y;
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
        w.a(w.f46569i, i10, iArr);
        int i14 = fVar.f7130y;
        if (i14 != 1 && i14 != 4) {
            return new LinearGradient(max2, 0.0f, f16, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f16, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.f7127s.b();
            return;
        }
        RectF rectF = this.L;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.f7127s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: fi.f.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.f7127s.d();
    }

    @Override
    public final void f(int i10) {
        this.f7127s.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(s sVar) {
        i7 i7Var;
        boolean z10 = sVar.f6692a;
        i7 i7Var2 = this.f7126r;
        if (z10) {
            i7Var = this.f7125n;
        } else {
            i7Var = i7Var2;
        }
        i7 i7Var3 = this.f7127s;
        if (i7Var3 != i7Var) {
            if (i7Var3 != null) {
                i7Var3.b();
            }
            this.f7127s = i7Var;
            i7Var.e(this.f6649c / 255.0f);
            if (this.f7127s == i7Var2) {
                this.f7129x = true;
            } else {
                this.f7128w = true;
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
        i7 i7Var = this.f7127s;
        i7Var.getClass();
        return !(i7Var instanceof a);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7128w = true;
        this.f7129x = true;
    }

    @Override
    public final void updateColors() {
        hi.c cVar = this.G;
        if (cVar != null) {
            this.H = t6.r1(this.I / 255.0f, cVar.f7711b);
            this.J = t6.r1(this.K / 255.0f, this.G.f7711b);
        }
        this.f7128w = true;
        this.f7129x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
