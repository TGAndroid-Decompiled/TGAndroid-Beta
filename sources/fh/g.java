package fh;

import a8.fa;
import a8.q7;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.t6;
import ri.q;
import ri.r;
public final class g extends ri.e implements b6 {
    public static Path f11654h0 = new Path();
    public int E;
    public int F;
    public int G;
    public int H;
    public float I;
    public float K;
    public int L;
    public int M;
    public h P;
    public boolean Q;
    public final f R;
    public a S;
    public boolean T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public int Y;
    public fa Z;
    public boolean f11655a0;
    public ui.a f11656b0;
    public boolean f11657c0;
    public final d f11658d0;
    public b f11659e0;
    public final ui.a f11660f;
    public c f11661f0;
    public e f11662g0;
    public final ui.a h;
    public final ui.a f11663n;
    public ui.a f11664r;
    public gh.a f11666w;
    public int f11667x;
    public int f11668y;
    public boolean f11665s = true;
    public float J = -1.0f;
    public int N = t6.f30035b;
    public final l O = new l();

    public g(ui.a aVar, ui.a aVar2, ui.a aVar3) {
        f fVar = new f();
        this.R = fVar;
        this.W = 1.0f;
        this.Y = q.G;
        this.f11655a0 = true;
        this.f11658d0 = new d(this);
        this.f11660f = aVar;
        this.h = aVar2;
        this.f11663n = aVar3;
        r rVar = this.f56680b;
        if (!rVar.f56727a) {
            aVar = aVar3;
        } else if (!this.X || !rVar.f56728b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.f11664r = aVar;
        fVar.f11637i = g0.N(1.0f);
        fVar.f11638j = g0.N(0.6666667f);
        this.U = g0.N(1.0f);
        this.V = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (q7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f11654h0;
        if (path == null) {
            f11654h0 = new Path();
        } else {
            path.rewind();
        }
        f11654h0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f11654h0);
    }

    public static ui.a v(ui.a aVar) {
        while (aVar instanceof ui.g) {
            aVar = ((ui.g) aVar).f59020a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        fa o4 = o();
        e eVar = this.f11662g0;
        if (o4 == eVar && eVar != null) {
            eVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.R.f11641m);
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
    public final void draw(Canvas canvas) {
        ui.a aVar;
        int i7 = t6.f30035b;
        if (this.N != i7) {
            this.N = i7;
            try {
                updateColors();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        int i10 = q.G;
        if (this.Y != i10) {
            this.Y = i10;
            r f10 = q.f();
            if (!Objects.equals(this.f56680b, f10)) {
                this.f56680b = f10;
                g(f10);
            }
        }
        f fVar = this.R;
        if (!fVar.f11641m.isEmpty()) {
            fa o4 = o();
            ui.a aVar2 = this.f11664r;
            if (o4 == this.f11662g0 && !canvas.isHardwareAccelerated()) {
                ui.a v = v(v(this.f11664r));
                if (Build.VERSION.SDK_INT >= 29 && (v instanceof ui.f) && (aVar = ((ui.f) v).f59011a) != null) {
                    v = v(aVar);
                }
                aVar2 = v;
                o4 = k(aVar2);
            }
            o4.b(canvas, aVar2);
            float f11 = this.f56681c / 255.0f;
            Rect rect = fVar.f11641m;
            if (fVar.e()) {
                Path path = fVar.f11639k;
                long j3 = fVar.f11651x;
                float f12 = rect.left;
                float f13 = rect.top;
                float f14 = rect.right;
                float f15 = rect.bottom;
                h m10 = m();
                l lVar = this.O;
                lVar.getClass();
                float f16 = f15 - f13;
                if (f14 - f12 >= 1.0f && f16 >= 1.0f && f11 > 0.0f) {
                    if (m10.a()) {
                        lVar.d(canvas, 2, path, j3, f12, f13, f14, f15, m10, m10.f11673f, f11);
                    }
                    if (m10.f11669a > 0.05f) {
                        int i11 = m10.f11670b;
                        if ((i11 >>> 24) != 0) {
                            lVar.d(canvas, 0, path, j3, f12, f13, f14, f15, m10, i11, f11);
                        }
                    }
                    if (m10.f11671c > 0.05f) {
                        int i12 = m10.d;
                        if ((i12 >>> 24) != 0) {
                            lVar.d(canvas, 1, path, j3, f12, f13, f14, f15, m10, i12, f11);
                        }
                    }
                    if (m10.f11674g > 0.05f) {
                        int i13 = m10.h;
                        if ((i13 >>> 24) != 0) {
                            lVar.d(canvas, 3, path, j3, f12, f13, f14, f15, m10, i13, f11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.O.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.f11632b, m(), f11);
        }
    }

    @Override
    public final boolean e() {
        fa o4 = o();
        e eVar = this.f11662g0;
        if (o4 == eVar && eVar != null && !eVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i7) {
        e eVar = this.f11662g0;
        if (eVar != null) {
            eVar.f(i7 / 255.0f);
        }
    }

    @Override
    public final void g(r rVar) {
        this.f11655a0 = true;
        updateColors();
        invalidateSelf();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        f fVar = this.R;
        if (fVar.e()) {
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(fVar.f11639k);
                return;
            }
            RectF rectF = fVar.f11647s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fVar.f11632b[0]);
            return;
        }
        l(outline, fVar.f11641m, fVar.f11632b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        f fVar = this.R;
        int i7 = fVar.d;
        rect.set(i7, i7, i7, i7);
        return fVar.f11634e;
    }

    @Override
    public final void h() {
        e eVar = this.f11662g0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        fa o4 = o();
        e eVar = this.f11662g0;
        if (o4 == eVar && eVar != null) {
            return true;
        }
        return false;
    }

    public final fa k(ui.a aVar) {
        ui.a v = v(aVar);
        if (Color.alpha(this.f11668y) != 255 && !(v instanceof ui.c)) {
            if (v instanceof ui.b) {
                if (this.f11659e0 == null) {
                    this.f11659e0 = new b(this);
                }
                return this.f11659e0;
            }
            if (this.f11661f0 == null) {
                this.f11661f0 = new c(this);
            }
            return this.f11661f0;
        }
        return this.f11658d0;
    }

    public final h m() {
        h hVar;
        if (this.P == null) {
            boolean z10 = this.Q;
            f fVar = this.R;
            if (z10) {
                float f10 = fVar.f11637i;
                int i7 = this.E;
                hVar = new h(0.0f, 0, 0.0f, 0, this.I, this.H, (f10 + fVar.f11638j) / 2.0f, i0.a.f(0.5f, i7, this.F));
            } else {
                hVar = new h(fVar.f11637i, this.E, fVar.f11638j, this.F, this.I, this.H, 0.0f, 0);
            }
            this.P = hVar;
        }
        return this.P;
    }

    public final void n() {
        e eVar = this.f11662g0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final fa o() {
        boolean z10;
        fa k10;
        ui.a aVar;
        boolean z11 = true;
        if (this.f11655a0) {
            r rVar = this.f56680b;
            if (!rVar.f56727a) {
                aVar = this.f11663n;
            } else if (this.X && rVar.f56728b && Build.VERSION.SDK_INT >= 33) {
                aVar = this.f11660f;
            } else {
                aVar = this.h;
            }
            if (this.f11664r != aVar) {
                this.f11664r = aVar;
                e eVar = this.f11662g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.a v = v(this.f11664r);
        if (Color.alpha(this.f11668y) == 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Z == null || this.f11655a0 || this.f11656b0 != v || this.f11657c0 != z10) {
            this.f11655a0 = false;
            this.f11656b0 = v;
            this.f11657c0 = z10;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && (this.f11664r instanceof dh.b) && !(v instanceof ui.c) && !(v instanceof ui.b)) {
                if (this.f11662g0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.f11665s);
                    eVar2.f(this.f56681c / 255.0f);
                    eVar2.d();
                    this.f11662g0 = eVar2;
                }
                k10 = this.f11662g0;
            } else {
                k10 = k(v);
            }
            e eVar3 = this.f11662g0;
            if (eVar3 != null) {
                if (k10 != eVar3 || !this.X || !this.f56680b.f56728b || i7 < 33) {
                    z11 = false;
                }
                eVar3.h(z11);
            }
            fa faVar = this.Z;
            if (faVar != k10 && faVar != null) {
                faVar.a();
            }
            this.Z = k10;
        }
        return this.Z;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f fVar = this.R;
        fVar.f11631a.set(rect);
        fVar.a();
        n();
    }

    public final void p(gh.a aVar) {
        this.f11666w = aVar;
        if (this.J < 0.0f) {
            this.J = this.U;
            this.K = this.V;
        }
        updateColors();
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            float f10 = eVar.f13621f;
            float f11 = eVar.h;
            f fVar = this.R;
            fVar.f11637i = f10;
            fVar.f11638j = f11;
            this.P = null;
            float c10 = eVar.c();
            float b10 = eVar.b();
            this.U = c10;
            this.V = b10;
        }
    }

    public final void q(int i7) {
        f fVar = this.R;
        if (fVar.d != i7) {
            fVar.d = i7;
            fVar.a();
            n();
        }
    }

    public final void r(float f10) {
        f fVar = this.R;
        Arrays.fill(fVar.f11632b, f10);
        Arrays.fill(fVar.f11633c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.R;
        float[] fArr = fVar.f11632b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = f12;
        fArr[4] = f12;
        fArr[7] = f13;
        fArr[6] = f13;
        fVar.a();
        n();
    }

    public final void t(float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        f fVar = this.R;
        float[] fArr = fVar.f11632b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        float f15 = 0.0f;
        if (z10) {
            f14 = 0.0f;
        } else {
            f14 = f12;
        }
        fArr[5] = f14;
        fArr[4] = f14;
        if (!z10) {
            f15 = f13;
        }
        fArr[7] = f15;
        fArr[6] = f15;
        float[] fArr2 = fVar.f11633c;
        fArr2[1] = f10;
        fArr2[0] = f10;
        fArr2[3] = f11;
        fArr2[2] = f11;
        fArr2[5] = f12;
        fArr2[4] = f12;
        fArr2[7] = f13;
        fArr2[6] = f13;
        fVar.a();
        n();
    }

    public final void u(int i7) {
        this.R.f11635f = i7;
        n();
    }

    @Override
    public final void updateColors() {
        this.N = t6.f30035b;
        gh.a aVar = this.f11666w;
        if (aVar != null) {
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).d();
            }
            this.f11668y = this.f11666w.A2();
            this.f11667x = this.f11666w.W1();
            this.E = this.f11666w.t0();
            this.F = this.f11666w.U0();
            this.G = this.f11666w.D1();
            this.H = this.f11666w.M0();
            this.I = this.f11666w.A1();
            gh.a aVar2 = this.f11666w;
            if (aVar2 instanceof gh.e) {
                gh.e eVar = (gh.e) aVar2;
                float c10 = eVar.c();
                float b10 = eVar.b();
                this.U = c10;
                this.V = b10;
            } else if (aVar2.Z0() >= 0.0f) {
                float Z0 = this.f11666w.Z0();
                float Y0 = this.f11666w.Y0();
                this.U = Z0;
                this.V = Y0;
            } else {
                float f10 = this.J;
                if (f10 >= 0.0f) {
                    float f11 = this.K;
                    this.U = f10;
                    this.V = f11;
                }
            }
            this.P = null;
            e eVar2 = this.f11662g0;
            if (eVar2 != null) {
                eVar2.h = true;
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
