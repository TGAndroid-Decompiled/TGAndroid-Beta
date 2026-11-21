package fh;

import a8.ea;
import a8.n7;
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
    public static Path f11688h0 = new Path();
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
    public ea Z;
    public boolean f11689a0;
    public ui.a f11690b0;
    public boolean f11691c0;
    public final d f11692d0;
    public b f11693e0;
    public final ui.a f11694f;
    public c f11695f0;
    public e f11696g0;
    public final ui.a h;
    public final ui.a f11697n;
    public ui.a f11698r;
    public gh.a f11700w;
    public int f11701x;
    public int f11702y;
    public boolean f11699s = true;
    public float J = -1.0f;
    public int N = t6.f30066b;
    public final l O = new l();

    public g(ui.a aVar, ui.a aVar2, ui.a aVar3) {
        f fVar = new f();
        this.R = fVar;
        this.W = 1.0f;
        this.Y = q.G;
        this.f11689a0 = true;
        this.f11692d0 = new d(this);
        this.f11694f = aVar;
        this.h = aVar2;
        this.f11697n = aVar3;
        r rVar = this.f56711b;
        if (!rVar.f56758a) {
            aVar = aVar3;
        } else if (!this.X || !rVar.f56759b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.f11698r = aVar;
        fVar.f11671i = g0.N(1.0f);
        fVar.f11672j = g0.N(0.6666667f);
        this.U = g0.N(1.0f);
        this.V = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (n7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f11688h0;
        if (path == null) {
            f11688h0 = new Path();
        } else {
            path.rewind();
        }
        f11688h0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f11688h0);
    }

    public static ui.a v(ui.a aVar) {
        while (aVar instanceof ui.g) {
            aVar = ((ui.g) aVar).f59051a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        ea o4 = o();
        e eVar = this.f11696g0;
        if (o4 == eVar && eVar != null) {
            eVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.R.f11675m);
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
        int i7 = t6.f30066b;
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
            if (!Objects.equals(this.f56711b, f10)) {
                this.f56711b = f10;
                g(f10);
            }
        }
        f fVar = this.R;
        if (!fVar.f11675m.isEmpty()) {
            ea o4 = o();
            ui.a aVar2 = this.f11698r;
            if (o4 == this.f11696g0 && !canvas.isHardwareAccelerated()) {
                ui.a v = v(v(this.f11698r));
                if (Build.VERSION.SDK_INT >= 29 && (v instanceof ui.f) && (aVar = ((ui.f) v).f59042a) != null) {
                    v = v(aVar);
                }
                aVar2 = v;
                o4 = k(aVar2);
            }
            o4.b(canvas, aVar2);
            float f11 = this.f56712c / 255.0f;
            Rect rect = fVar.f11675m;
            if (fVar.e()) {
                Path path = fVar.f11673k;
                long j3 = fVar.f11685x;
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
                        lVar.d(canvas, 2, path, j3, f12, f13, f14, f15, m10, m10.f11707f, f11);
                    }
                    if (m10.f11703a > 0.05f) {
                        int i11 = m10.f11704b;
                        if ((i11 >>> 24) != 0) {
                            lVar.d(canvas, 0, path, j3, f12, f13, f14, f15, m10, i11, f11);
                        }
                    }
                    if (m10.f11705c > 0.05f) {
                        int i12 = m10.d;
                        if ((i12 >>> 24) != 0) {
                            lVar.d(canvas, 1, path, j3, f12, f13, f14, f15, m10, i12, f11);
                        }
                    }
                    if (m10.f11708g > 0.05f) {
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
            this.O.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.f11666b, m(), f11);
        }
    }

    @Override
    public final boolean e() {
        ea o4 = o();
        e eVar = this.f11696g0;
        if (o4 == eVar && eVar != null && !eVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i7) {
        e eVar = this.f11696g0;
        if (eVar != null) {
            eVar.f(i7 / 255.0f);
        }
    }

    @Override
    public final void g(r rVar) {
        this.f11689a0 = true;
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
                outline.setPath(fVar.f11673k);
                return;
            }
            RectF rectF = fVar.f11681s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fVar.f11666b[0]);
            return;
        }
        l(outline, fVar.f11675m, fVar.f11666b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        f fVar = this.R;
        int i7 = fVar.d;
        rect.set(i7, i7, i7, i7);
        return fVar.f11668e;
    }

    @Override
    public final void h() {
        e eVar = this.f11696g0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        ea o4 = o();
        e eVar = this.f11696g0;
        if (o4 == eVar && eVar != null) {
            return true;
        }
        return false;
    }

    public final ea k(ui.a aVar) {
        ui.a v = v(aVar);
        if (Color.alpha(this.f11702y) != 255 && !(v instanceof ui.c)) {
            if (v instanceof ui.b) {
                if (this.f11693e0 == null) {
                    this.f11693e0 = new b(this);
                }
                return this.f11693e0;
            }
            if (this.f11695f0 == null) {
                this.f11695f0 = new c(this);
            }
            return this.f11695f0;
        }
        return this.f11692d0;
    }

    public final h m() {
        h hVar;
        if (this.P == null) {
            boolean z10 = this.Q;
            f fVar = this.R;
            if (z10) {
                float f10 = fVar.f11671i;
                int i7 = this.E;
                hVar = new h(0.0f, 0, 0.0f, 0, this.I, this.H, (f10 + fVar.f11672j) / 2.0f, i0.a.f(0.5f, i7, this.F));
            } else {
                hVar = new h(fVar.f11671i, this.E, fVar.f11672j, this.F, this.I, this.H, 0.0f, 0);
            }
            this.P = hVar;
        }
        return this.P;
    }

    public final void n() {
        e eVar = this.f11696g0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final ea o() {
        boolean z10;
        ea k10;
        ui.a aVar;
        boolean z11 = true;
        if (this.f11689a0) {
            r rVar = this.f56711b;
            if (!rVar.f56758a) {
                aVar = this.f11697n;
            } else if (this.X && rVar.f56759b && Build.VERSION.SDK_INT >= 33) {
                aVar = this.f11694f;
            } else {
                aVar = this.h;
            }
            if (this.f11698r != aVar) {
                this.f11698r = aVar;
                e eVar = this.f11696g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.a v = v(this.f11698r);
        if (Color.alpha(this.f11702y) == 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Z == null || this.f11689a0 || this.f11690b0 != v || this.f11691c0 != z10) {
            this.f11689a0 = false;
            this.f11690b0 = v;
            this.f11691c0 = z10;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && (this.f11698r instanceof dh.b) && !(v instanceof ui.c) && !(v instanceof ui.b)) {
                if (this.f11696g0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.f11699s);
                    eVar2.f(this.f56712c / 255.0f);
                    eVar2.d();
                    this.f11696g0 = eVar2;
                }
                k10 = this.f11696g0;
            } else {
                k10 = k(v);
            }
            e eVar3 = this.f11696g0;
            if (eVar3 != null) {
                if (k10 != eVar3 || !this.X || !this.f56711b.f56759b || i7 < 33) {
                    z11 = false;
                }
                eVar3.h(z11);
            }
            ea eaVar = this.Z;
            if (eaVar != k10 && eaVar != null) {
                eaVar.a();
            }
            this.Z = k10;
        }
        return this.Z;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f fVar = this.R;
        fVar.f11665a.set(rect);
        fVar.a();
        n();
    }

    public final void p(gh.a aVar) {
        this.f11700w = aVar;
        if (this.J < 0.0f) {
            this.J = this.U;
            this.K = this.V;
        }
        updateColors();
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            float f10 = eVar.f13655f;
            float f11 = eVar.h;
            f fVar = this.R;
            fVar.f11671i = f10;
            fVar.f11672j = f11;
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
        Arrays.fill(fVar.f11666b, f10);
        Arrays.fill(fVar.f11667c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.R;
        float[] fArr = fVar.f11666b;
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
        float[] fArr = fVar.f11666b;
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
        float[] fArr2 = fVar.f11667c;
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
        this.R.f11669f = i7;
        n();
    }

    @Override
    public final void updateColors() {
        this.N = t6.f30066b;
        gh.a aVar = this.f11700w;
        if (aVar != null) {
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).d();
            }
            this.f11702y = this.f11700w.A2();
            this.f11701x = this.f11700w.W1();
            this.E = this.f11700w.t0();
            this.F = this.f11700w.U0();
            this.G = this.f11700w.D1();
            this.H = this.f11700w.M0();
            this.I = this.f11700w.A1();
            gh.a aVar2 = this.f11700w;
            if (aVar2 instanceof gh.e) {
                gh.e eVar = (gh.e) aVar2;
                float c10 = eVar.c();
                float b10 = eVar.b();
                this.U = c10;
                this.V = b10;
            } else if (aVar2.Z0() >= 0.0f) {
                float Z0 = this.f11700w.Z0();
                float Y0 = this.f11700w.Y0();
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
            e eVar2 = this.f11696g0;
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
