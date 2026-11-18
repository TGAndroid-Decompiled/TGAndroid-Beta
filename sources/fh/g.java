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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.u6;
import ri.q;
import ri.r;
public final class g extends ri.e implements c6 {
    public static Path f11662h0 = new Path();
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
    public boolean f11663a0;
    public ui.a f11664b0;
    public boolean f11665c0;
    public final d f11666d0;
    public b f11667e0;
    public final ui.a f11668f;
    public c f11669f0;
    public e f11670g0;
    public final ui.a h;
    public final ui.a f11671n;
    public ui.a f11672r;
    public gh.a f11674w;
    public int f11675x;
    public int f11676y;
    public boolean f11673s = true;
    public float J = -1.0f;
    public int N = u6.f30085b;
    public final l O = new l();

    public g(ui.a aVar, ui.a aVar2, ui.a aVar3) {
        f fVar = new f();
        this.R = fVar;
        this.W = 1.0f;
        this.Y = q.G;
        this.f11663a0 = true;
        this.f11666d0 = new d(this);
        this.f11668f = aVar;
        this.h = aVar2;
        this.f11671n = aVar3;
        r rVar = this.f56670b;
        if (!rVar.f56717a) {
            aVar = aVar3;
        } else if (!this.X || !rVar.f56718b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.f11672r = aVar;
        fVar.f11645i = g0.N(1.0f);
        fVar.f11646j = g0.N(0.6666667f);
        this.U = g0.N(1.0f);
        this.V = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (n7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f11662h0;
        if (path == null) {
            f11662h0 = new Path();
        } else {
            path.rewind();
        }
        f11662h0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f11662h0);
    }

    public static ui.a v(ui.a aVar) {
        while (aVar instanceof ui.g) {
            aVar = ((ui.g) aVar).f59012a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        ea o4 = o();
        e eVar = this.f11670g0;
        if (o4 == eVar && eVar != null) {
            eVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.R.f11649m);
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
        int i7 = u6.f30085b;
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
            if (!Objects.equals(this.f56670b, f10)) {
                this.f56670b = f10;
                g(f10);
            }
        }
        f fVar = this.R;
        if (!fVar.f11649m.isEmpty()) {
            ea o4 = o();
            ui.a aVar2 = this.f11672r;
            if (o4 == this.f11670g0 && !canvas.isHardwareAccelerated()) {
                ui.a v = v(v(this.f11672r));
                if (Build.VERSION.SDK_INT >= 29 && (v instanceof ui.f) && (aVar = ((ui.f) v).f59003a) != null) {
                    v = v(aVar);
                }
                aVar2 = v;
                o4 = k(aVar2);
            }
            o4.b(canvas, aVar2);
            float f11 = this.f56671c / 255.0f;
            Rect rect = fVar.f11649m;
            if (fVar.e()) {
                Path path = fVar.f11647k;
                long j3 = fVar.f11659x;
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
                        lVar.d(canvas, 2, path, j3, f12, f13, f14, f15, m10, m10.f11681f, f11);
                    }
                    if (m10.f11677a > 0.05f) {
                        int i11 = m10.f11678b;
                        if ((i11 >>> 24) != 0) {
                            lVar.d(canvas, 0, path, j3, f12, f13, f14, f15, m10, i11, f11);
                        }
                    }
                    if (m10.f11679c > 0.05f) {
                        int i12 = m10.d;
                        if ((i12 >>> 24) != 0) {
                            lVar.d(canvas, 1, path, j3, f12, f13, f14, f15, m10, i12, f11);
                        }
                    }
                    if (m10.f11682g > 0.05f) {
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
            this.O.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.f11640b, m(), f11);
        }
    }

    @Override
    public final boolean e() {
        ea o4 = o();
        e eVar = this.f11670g0;
        if (o4 == eVar && eVar != null && !eVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i7) {
        e eVar = this.f11670g0;
        if (eVar != null) {
            eVar.f(i7 / 255.0f);
        }
    }

    @Override
    public final void g(r rVar) {
        this.f11663a0 = true;
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
                outline.setPath(fVar.f11647k);
                return;
            }
            RectF rectF = fVar.f11655s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fVar.f11640b[0]);
            return;
        }
        l(outline, fVar.f11649m, fVar.f11640b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        f fVar = this.R;
        int i7 = fVar.d;
        rect.set(i7, i7, i7, i7);
        return fVar.f11642e;
    }

    @Override
    public final void h() {
        e eVar = this.f11670g0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        ea o4 = o();
        e eVar = this.f11670g0;
        if (o4 == eVar && eVar != null) {
            return true;
        }
        return false;
    }

    public final ea k(ui.a aVar) {
        ui.a v = v(aVar);
        if (Color.alpha(this.f11676y) != 255 && !(v instanceof ui.c)) {
            if (v instanceof ui.b) {
                if (this.f11667e0 == null) {
                    this.f11667e0 = new b(this);
                }
                return this.f11667e0;
            }
            if (this.f11669f0 == null) {
                this.f11669f0 = new c(this);
            }
            return this.f11669f0;
        }
        return this.f11666d0;
    }

    public final h m() {
        h hVar;
        if (this.P == null) {
            boolean z10 = this.Q;
            f fVar = this.R;
            if (z10) {
                float f10 = fVar.f11645i;
                int i7 = this.E;
                hVar = new h(0.0f, 0, 0.0f, 0, this.I, this.H, (f10 + fVar.f11646j) / 2.0f, i0.a.f(0.5f, i7, this.F));
            } else {
                hVar = new h(fVar.f11645i, this.E, fVar.f11646j, this.F, this.I, this.H, 0.0f, 0);
            }
            this.P = hVar;
        }
        return this.P;
    }

    public final void n() {
        e eVar = this.f11670g0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final ea o() {
        boolean z10;
        ea k10;
        ui.a aVar;
        boolean z11 = true;
        if (this.f11663a0) {
            r rVar = this.f56670b;
            if (!rVar.f56717a) {
                aVar = this.f11671n;
            } else if (this.X && rVar.f56718b && Build.VERSION.SDK_INT >= 33) {
                aVar = this.f11668f;
            } else {
                aVar = this.h;
            }
            if (this.f11672r != aVar) {
                this.f11672r = aVar;
                e eVar = this.f11670g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ui.a v = v(this.f11672r);
        if (Color.alpha(this.f11676y) == 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Z == null || this.f11663a0 || this.f11664b0 != v || this.f11665c0 != z10) {
            this.f11663a0 = false;
            this.f11664b0 = v;
            this.f11665c0 = z10;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && (this.f11672r instanceof dh.b) && !(v instanceof ui.c) && !(v instanceof ui.b)) {
                if (this.f11670g0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.f11673s);
                    eVar2.f(this.f56671c / 255.0f);
                    eVar2.d();
                    this.f11670g0 = eVar2;
                }
                k10 = this.f11670g0;
            } else {
                k10 = k(v);
            }
            e eVar3 = this.f11670g0;
            if (eVar3 != null) {
                if (k10 != eVar3 || !this.X || !this.f56670b.f56718b || i7 < 33) {
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
        fVar.f11639a.set(rect);
        fVar.a();
        n();
    }

    public final void p(gh.a aVar) {
        this.f11674w = aVar;
        if (this.J < 0.0f) {
            this.J = this.U;
            this.K = this.V;
        }
        updateColors();
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            float f10 = eVar.f13629f;
            float f11 = eVar.h;
            f fVar = this.R;
            fVar.f11645i = f10;
            fVar.f11646j = f11;
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
        Arrays.fill(fVar.f11640b, f10);
        Arrays.fill(fVar.f11641c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.R;
        float[] fArr = fVar.f11640b;
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
        float[] fArr = fVar.f11640b;
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
        float[] fArr2 = fVar.f11641c;
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
        this.R.f11643f = i7;
        n();
    }

    @Override
    public final void updateColors() {
        this.N = u6.f30085b;
        gh.a aVar = this.f11674w;
        if (aVar != null) {
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).d();
            }
            this.f11676y = this.f11674w.A2();
            this.f11675x = this.f11674w.W1();
            this.E = this.f11674w.t0();
            this.F = this.f11674w.U0();
            this.G = this.f11674w.D1();
            this.H = this.f11674w.M0();
            this.I = this.f11674w.A1();
            gh.a aVar2 = this.f11674w;
            if (aVar2 instanceof gh.e) {
                gh.e eVar = (gh.e) aVar2;
                float c10 = eVar.c();
                float b10 = eVar.b();
                this.U = c10;
                this.V = b10;
            } else if (aVar2.Z0() >= 0.0f) {
                float Z0 = this.f11674w.Z0();
                float Y0 = this.f11674w.Y0();
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
            e eVar2 = this.f11670g0;
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
