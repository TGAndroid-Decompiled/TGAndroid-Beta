package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
public class il0 extends fw4 implements tjb {
    public static Path i0 = new Path();
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float K;
    public int L;
    public int M;
    public bx4 P;
    public bx4 Q;
    public boolean R;
    public final hl0 S;
    public cl0 T;
    public boolean U;
    public float V;
    public float W;
    public float X;
    public boolean Y;
    public int Z;
    public mod a0;
    public boolean b0;
    public gx4 c0;
    public boolean d0;
    public final fl0 e0;
    public final gx4 f;
    public dl0 f0;
    public el0 g0;
    public final gx4 h;
    public gl0 h0;
    public final gx4 n;
    public gx4 r;
    public al0 w;
    public int x;
    public int y;
    public boolean s = true;
    public float J = -1.0f;
    public int N = zkb.b;
    public final ex4 O = new ex4();

    public il0(gx4 gx4Var, gx4 gx4Var2, gx4 gx4Var3) {
        hl0 hl0Var = new hl0();
        this.S = hl0Var;
        this.X = 1.0f;
        this.Z = qw4.G;
        this.b0 = true;
        this.e0 = new fl0(this);
        this.f = gx4Var;
        this.h = gx4Var2;
        this.n = gx4Var3;
        fx4 fx4Var = this.b;
        if (!fx4Var.a) {
            gx4Var = gx4Var3;
        } else if (!this.Y || !fx4Var.b || Build.VERSION.SDK_INT < 33) {
            gx4Var = gx4Var2;
        }
        this.r = gx4Var;
        hl0Var.i = gl.N(1.0f);
        hl0Var.j = gl.N(0.6666667f);
        this.V = gl.N(1.0f);
        this.W = gl.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (hse.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = i0;
        if (path == null) {
            i0 = new Path();
        } else {
            path.rewind();
        }
        i0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(i0);
    }

    public static gx4 v(gx4 gx4Var) {
        while (gx4Var instanceof mx4) {
            gx4Var = ((mx4) gx4Var).a;
        }
        return gx4Var;
    }

    @Override
    public final void a() {
        mod o = o();
        gl0 gl0Var = this.h0;
        if (o == gl0Var && gl0Var != null) {
            gl0Var.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.S.m);
    }

    @Override
    public final int c() {
        return this.L;
    }

    @Override
    public final int d() {
        return this.M;
    }

    @Override
    public void draw(Canvas canvas) {
        gx4 gx4Var;
        int i = zkb.b;
        if (this.N != i) {
            this.N = i;
            try {
                updateColors();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        int i2 = qw4.G;
        if (this.Z != i2) {
            this.Z = i2;
            fx4 f = qw4.f();
            if (!Objects.equals(this.b, f)) {
                this.b = f;
                g(f);
            }
        }
        hl0 hl0Var = this.S;
        if (!hl0Var.m.isEmpty()) {
            mod o = o();
            gx4 gx4Var2 = this.r;
            if (o == this.h0 && !canvas.isHardwareAccelerated()) {
                gx4 v = v(v(this.r));
                if (Build.VERSION.SDK_INT >= 29 && (v instanceof lx4) && (gx4Var = ((lx4) v).a) != null) {
                    v = v(gx4Var);
                }
                gx4Var2 = v;
                o = k(gx4Var2);
            }
            o.b(canvas, gx4Var2);
            float f2 = this.c / 255.0f;
            Rect rect = hl0Var.m;
            boolean e2 = hl0Var.e();
            ex4 ex4Var = this.O;
            if (e2) {
                Path path = hl0Var.k;
                long j = hl0Var.x;
                float f3 = rect.left;
                float f4 = rect.top;
                float f5 = rect.right;
                float f6 = rect.bottom;
                bx4 m = m();
                ex4Var.getClass();
                float f7 = f6 - f4;
                if (f5 - f3 >= 1.0f && f7 >= 1.0f && f2 > 0.0f) {
                    if (m.a()) {
                        ex4Var.d(canvas, 2, path, j, f3, f4, f5, f6, m, m.f, f2);
                    }
                    if (m.a > 0.05f) {
                        int i3 = m.b;
                        if ((i3 >>> 24) != 0) {
                            ex4Var.d(canvas, 0, path, j, f3, f4, f5, f6, m, i3, f2);
                        }
                    }
                    if (m.c > 0.05f) {
                        int i4 = m.d;
                        if ((i4 >>> 24) != 0) {
                            ex4Var.d(canvas, 1, path, j, f3, f4, f5, f6, m, i4, f2);
                        }
                    }
                    if (m.k > 0.05f) {
                        int i5 = m.l;
                        if ((i5 >>> 24) != 0) {
                            ex4Var.d(canvas, 3, path, j, f3, f4, f5, f6, m, i5, f2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ex4Var.a(canvas, rect.left, rect.top, rect.right, rect.bottom, hl0Var.b, m(), f2);
        }
    }

    @Override
    public final boolean e() {
        mod o = o();
        gl0 gl0Var = this.h0;
        if (o == gl0Var && gl0Var != null && !gl0Var.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i) {
        gl0 gl0Var = this.h0;
        if (gl0Var != null) {
            gl0Var.f(i / 255.0f);
        }
    }

    @Override
    public final void g(fx4 fx4Var) {
        this.b0 = true;
        updateColors();
        invalidateSelf();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        hl0 hl0Var = this.S;
        boolean e = hl0Var.e();
        float[] fArr = hl0Var.b;
        if (e) {
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(hl0Var.k);
                return;
            }
            RectF rectF = hl0Var.s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fArr[0]);
            return;
        }
        l(outline, hl0Var.m, fArr);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        hl0 hl0Var = this.S;
        int i = hl0Var.d;
        rect.set(i, i, i, i);
        return hl0Var.e;
    }

    @Override
    public final void h() {
        gl0 gl0Var = this.h0;
        if (gl0Var != null) {
            gl0Var.h = true;
        }
    }

    @Override
    public final boolean j() {
        mod o = o();
        gl0 gl0Var = this.h0;
        if (o == gl0Var && gl0Var != null) {
            return true;
        }
        return false;
    }

    public final mod k(gx4 gx4Var) {
        gx4 v = v(gx4Var);
        if (Color.alpha(this.y) != 255 && !(v instanceof ix4)) {
            if (v instanceof hx4) {
                dl0 dl0Var = this.f0;
                if (dl0Var == null) {
                    dl0 dl0Var2 = new dl0(this);
                    this.f0 = dl0Var2;
                    return dl0Var2;
                }
                return dl0Var;
            }
            el0 el0Var = this.g0;
            if (el0Var == null) {
                el0 el0Var2 = new el0(this);
                this.g0 = el0Var2;
                return el0Var2;
            }
            return el0Var;
        }
        return this.e0;
    }

    public final bx4 m() {
        bx4 bx4Var;
        bx4 bx4Var2 = this.P;
        if (bx4Var2 != null) {
            return bx4Var2;
        }
        bx4 bx4Var3 = this.Q;
        if (bx4Var3 == null) {
            boolean z = this.R;
            hl0 hl0Var = this.S;
            if (z) {
                float f = hl0Var.i;
                int i = this.E;
                bx4Var = new bx4(0.0f, 0, 0.0f, 0, this.I, this.H, 1.0f, 1.0f, 1.0f, 0.0f, (f + hl0Var.j) / 2.0f, bm2.f(0.5f, i, this.F));
            } else {
                bx4Var = new bx4(hl0Var.i, this.E, hl0Var.j, this.F, this.I, this.H, 1.0f, 1.0f, 1.0f, 0.0f);
            }
            this.Q = bx4Var;
            return bx4Var;
        }
        return bx4Var3;
    }

    public final void n() {
        gl0 gl0Var = this.h0;
        if (gl0Var != null) {
            gl0Var.d();
        }
    }

    public final mod o() {
        boolean z;
        gl0 gl0Var;
        gx4 gx4Var;
        boolean z2 = true;
        if (this.b0) {
            fx4 fx4Var = this.b;
            if (!fx4Var.a) {
                gx4Var = this.n;
            } else if (this.Y && fx4Var.b && Build.VERSION.SDK_INT >= 33) {
                gx4Var = this.f;
            } else {
                gx4Var = this.h;
            }
            if (this.r != gx4Var) {
                this.r = gx4Var;
                gl0 gl0Var2 = this.h0;
                if (gl0Var2 != null) {
                    gl0Var2.h = true;
                }
            }
        }
        gx4 v = v(this.r);
        if (Color.alpha(this.y) == 255) {
            z = true;
        } else {
            z = false;
        }
        mod modVar = this.a0;
        if (modVar != null && !this.b0 && this.c0 == v && this.d0 == z) {
            return modVar;
        }
        this.b0 = false;
        this.c0 = v;
        this.d0 = z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && (this.r instanceof jl0) && !(v instanceof ix4) && !(v instanceof hx4)) {
            gl0 gl0Var3 = this.h0;
            gl0Var = gl0Var3;
            if (gl0Var3 == null) {
                gl0 gl0Var4 = new gl0(this);
                gl0Var4.g(this.s);
                gl0Var4.f(this.c / 255.0f);
                gl0Var4.d();
                this.h0 = gl0Var4;
                gl0Var = gl0Var4;
            }
        } else {
            gl0Var = k(v);
        }
        gl0 gl0Var5 = this.h0;
        if (gl0Var5 != null) {
            if (gl0Var != gl0Var5 || !this.Y || !this.b.b || i < 33) {
                z2 = false;
            }
            gl0Var5.h(z2);
        }
        mod modVar2 = this.a0;
        if (modVar2 != gl0Var && modVar2 != null) {
            modVar2.a();
        }
        this.a0 = gl0Var;
        return gl0Var;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        hl0 hl0Var = this.S;
        hl0Var.a.set(rect);
        hl0Var.a();
        n();
    }

    public final void p(al0 al0Var) {
        this.w = al0Var;
        if (this.J < 0.0f) {
            this.J = this.V;
            this.K = this.W;
        }
        updateColors();
        if (al0Var instanceof nl0) {
            nl0 nl0Var = (nl0) al0Var;
            float f = nl0Var.f;
            float f2 = nl0Var.h;
            hl0 hl0Var = this.S;
            hl0Var.i = f;
            hl0Var.j = f2;
            this.Q = null;
            float c = nl0Var.c();
            float b = nl0Var.b();
            this.V = c;
            this.W = b;
        }
    }

    public final void q(int i) {
        hl0 hl0Var = this.S;
        if (hl0Var.d != i) {
            hl0Var.d = i;
            hl0Var.a();
            n();
        }
    }

    public final void r(float f) {
        hl0 hl0Var = this.S;
        Arrays.fill(hl0Var.b, f);
        Arrays.fill(hl0Var.c, f);
        hl0Var.a();
        n();
    }

    public final void s(float f, float f2, float f3, float f4) {
        hl0 hl0Var = this.S;
        float[] fArr = hl0Var.b;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        hl0Var.a();
        n();
    }

    public final void t(float f, float f2, float f3, float f4, boolean z) {
        float f5;
        hl0 hl0Var = this.S;
        float[] fArr = hl0Var.b;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        float f6 = 0.0f;
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = f3;
        }
        fArr[5] = f5;
        fArr[4] = f5;
        if (!z) {
            f6 = f4;
        }
        fArr[7] = f6;
        fArr[6] = f6;
        float[] fArr2 = hl0Var.c;
        fArr2[1] = f;
        fArr2[0] = f;
        fArr2[3] = f2;
        fArr2[2] = f2;
        fArr2[5] = f3;
        fArr2[4] = f3;
        fArr2[7] = f4;
        fArr2[6] = f4;
        hl0Var.a();
        n();
    }

    public final void u(int i) {
        this.S.f = i;
        n();
    }

    @Override
    public final void updateColors() {
        this.N = zkb.b;
        al0 al0Var = this.w;
        if (al0Var != null) {
            if (al0Var instanceof bl0) {
                ((bl0) al0Var).d();
            }
            this.y = this.w.t1();
            this.x = this.w.d1();
            this.E = this.w.L();
            this.F = this.w.m0();
            this.G = this.w.a1();
            this.H = this.w.j0();
            this.I = this.w.U0();
            al0 al0Var2 = this.w;
            if (al0Var2 instanceof nl0) {
                nl0 nl0Var = (nl0) al0Var2;
                float c = nl0Var.c();
                float b = nl0Var.b();
                this.V = c;
                this.W = b;
            } else if (al0Var2.s0() >= 0.0f) {
                float s0 = this.w.s0();
                float p0 = this.w.p0();
                this.V = s0;
                this.W = p0;
            } else {
                float f = this.J;
                if (f >= 0.0f) {
                    float f2 = this.K;
                    this.V = f;
                    this.W = f2;
                }
            }
            this.Q = null;
            gl0 gl0Var = this.h0;
            if (gl0Var != null) {
                gl0Var.h = true;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
