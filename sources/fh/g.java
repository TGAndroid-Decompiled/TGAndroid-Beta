package fh;

import a8.aa;
import a8.m7;
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
import oi.q;
import oi.r;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.r6;
public final class g extends oi.e implements a6 {
    public static Path f11528g0 = new Path();
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float J;
    public int K;
    public int L;
    public h O;
    public boolean P;
    public final f Q;
    public a R;
    public boolean S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public int X;
    public aa Y;
    public boolean Z;
    public ri.a f11529a0;
    public boolean f11530b0;
    public final d f11531c0;
    public b f11532d0;
    public c f11533e0;
    public final ri.a f11534f;
    public e f11535f0;
    public final ri.a h;
    public final ri.a f11536n;
    public ri.a f11537r;
    public gh.a f11539w;
    public int f11540x;
    public int f11541y;
    public boolean f11538s = true;
    public float I = -1.0f;
    public int M = r6.f28475b;
    public final l N = new l();

    public g(ri.a aVar, ri.a aVar2, ri.a aVar3) {
        f fVar = new f();
        this.Q = fVar;
        this.V = 1.0f;
        this.X = q.G;
        this.Z = true;
        this.f11531c0 = new d(this);
        this.f11534f = aVar;
        this.h = aVar2;
        this.f11536n = aVar3;
        r rVar = this.f21072b;
        if (!rVar.f21119a) {
            aVar = aVar3;
        } else if (!this.W || !rVar.f21120b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.f11537r = aVar;
        fVar.f11511i = g0.N(1.0f);
        fVar.f11512j = g0.N(0.6666667f);
        this.T = g0.N(1.0f);
        this.U = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (m7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f11528g0;
        if (path == null) {
            f11528g0 = new Path();
        } else {
            path.rewind();
        }
        f11528g0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f11528g0);
    }

    public static ri.a v(ri.a aVar) {
        while (aVar instanceof ri.g) {
            aVar = ((ri.g) aVar).f54486a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        aa o4 = o();
        e eVar = this.f11535f0;
        if (o4 == eVar && eVar != null) {
            eVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.Q.f11515m);
    }

    @Override
    public final int c() {
        return this.K;
    }

    @Override
    public final int d() {
        return this.L;
    }

    @Override
    public final void draw(Canvas canvas) {
        ri.a aVar;
        int i7 = r6.f28475b;
        if (this.M != i7) {
            this.M = i7;
            try {
                updateColors();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        int i10 = q.G;
        if (this.X != i10) {
            this.X = i10;
            r f10 = q.f();
            if (!Objects.equals(this.f21072b, f10)) {
                this.f21072b = f10;
                g(f10);
            }
        }
        f fVar = this.Q;
        if (!fVar.f11515m.isEmpty()) {
            aa o4 = o();
            ri.a aVar2 = this.f11537r;
            if (o4 == this.f11535f0 && !canvas.isHardwareAccelerated()) {
                ri.a v = v(v(this.f11537r));
                if (Build.VERSION.SDK_INT >= 29 && (v instanceof ri.f) && (aVar = ((ri.f) v).f54477a) != null) {
                    v = v(aVar);
                }
                aVar2 = v;
                o4 = k(aVar2);
            }
            o4.b(canvas, aVar2);
            float f11 = this.f21073c / 255.0f;
            Rect rect = fVar.f11515m;
            if (fVar.e()) {
                Path path = fVar.f11513k;
                long j3 = fVar.f11525x;
                float f12 = rect.left;
                float f13 = rect.top;
                float f14 = rect.right;
                float f15 = rect.bottom;
                h m10 = m();
                l lVar = this.N;
                lVar.getClass();
                float f16 = f15 - f13;
                if (f14 - f12 >= 1.0f && f16 >= 1.0f && f11 > 0.0f) {
                    if (m10.a()) {
                        lVar.d(canvas, 2, path, j3, f12, f13, f14, f15, m10, m10.f11546f, f11);
                    }
                    if (m10.f11542a > 0.05f) {
                        int i11 = m10.f11543b;
                        if ((i11 >>> 24) != 0) {
                            lVar.d(canvas, 0, path, j3, f12, f13, f14, f15, m10, i11, f11);
                        }
                    }
                    if (m10.f11544c > 0.05f) {
                        int i12 = m10.d;
                        if ((i12 >>> 24) != 0) {
                            lVar.d(canvas, 1, path, j3, f12, f13, f14, f15, m10, i12, f11);
                        }
                    }
                    if (m10.f11547g > 0.05f) {
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
            this.N.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.f11506b, m(), f11);
        }
    }

    @Override
    public final boolean e() {
        aa o4 = o();
        e eVar = this.f11535f0;
        if (o4 == eVar && eVar != null && !eVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i7) {
        e eVar = this.f11535f0;
        if (eVar != null) {
            eVar.f(i7 / 255.0f);
        }
    }

    @Override
    public final void g(r rVar) {
        this.Z = true;
        updateColors();
        invalidateSelf();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        f fVar = this.Q;
        if (fVar.e()) {
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(fVar.f11513k);
                return;
            }
            RectF rectF = fVar.f11521s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fVar.f11506b[0]);
            return;
        }
        l(outline, fVar.f11515m, fVar.f11506b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        f fVar = this.Q;
        int i7 = fVar.d;
        rect.set(i7, i7, i7, i7);
        return fVar.f11508e;
    }

    @Override
    public final void h() {
        e eVar = this.f11535f0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        aa o4 = o();
        e eVar = this.f11535f0;
        if (o4 == eVar && eVar != null) {
            return true;
        }
        return false;
    }

    public final aa k(ri.a aVar) {
        ri.a v = v(aVar);
        if (Color.alpha(this.f11541y) != 255 && !(v instanceof ri.c)) {
            if (v instanceof ri.b) {
                if (this.f11532d0 == null) {
                    this.f11532d0 = new b(this);
                }
                return this.f11532d0;
            }
            if (this.f11533e0 == null) {
                this.f11533e0 = new c(this);
            }
            return this.f11533e0;
        }
        return this.f11531c0;
    }

    public final h m() {
        h hVar;
        if (this.O == null) {
            boolean z9 = this.P;
            f fVar = this.Q;
            if (z9) {
                float f10 = fVar.f11511i;
                int i7 = this.D;
                hVar = new h(0.0f, 0, 0.0f, 0, this.H, this.G, (f10 + fVar.f11512j) / 2.0f, i0.a.f(0.5f, i7, this.E));
            } else {
                hVar = new h(fVar.f11511i, this.D, fVar.f11512j, this.E, this.H, this.G, 0.0f, 0);
            }
            this.O = hVar;
        }
        return this.O;
    }

    public final void n() {
        e eVar = this.f11535f0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final aa o() {
        boolean z9;
        aa k10;
        ri.a aVar;
        boolean z10 = true;
        if (this.Z) {
            r rVar = this.f21072b;
            if (!rVar.f21119a) {
                aVar = this.f11536n;
            } else if (this.W && rVar.f21120b && Build.VERSION.SDK_INT >= 33) {
                aVar = this.f11534f;
            } else {
                aVar = this.h;
            }
            if (this.f11537r != aVar) {
                this.f11537r = aVar;
                e eVar = this.f11535f0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        ri.a v = v(this.f11537r);
        if (Color.alpha(this.f11541y) == 255) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.Y == null || this.Z || this.f11529a0 != v || this.f11530b0 != z9) {
            this.Z = false;
            this.f11529a0 = v;
            this.f11530b0 = z9;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && (this.f11537r instanceof dh.b) && !(v instanceof ri.c) && !(v instanceof ri.b)) {
                if (this.f11535f0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.f11538s);
                    eVar2.f(this.f21073c / 255.0f);
                    eVar2.d();
                    this.f11535f0 = eVar2;
                }
                k10 = this.f11535f0;
            } else {
                k10 = k(v);
            }
            e eVar3 = this.f11535f0;
            if (eVar3 != null) {
                if (k10 != eVar3 || !this.W || !this.f21072b.f21120b || i7 < 33) {
                    z10 = false;
                }
                eVar3.h(z10);
            }
            aa aaVar = this.Y;
            if (aaVar != k10 && aaVar != null) {
                aaVar.a();
            }
            this.Y = k10;
        }
        return this.Y;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f fVar = this.Q;
        fVar.f11505a.set(rect);
        fVar.a();
        n();
    }

    public final void p(gh.a aVar) {
        this.f11539w = aVar;
        if (this.I < 0.0f) {
            this.I = this.T;
            this.J = this.U;
        }
        updateColors();
        if (aVar instanceof gh.e) {
            gh.e eVar = (gh.e) aVar;
            float f10 = eVar.f13972f;
            float f11 = eVar.h;
            f fVar = this.Q;
            fVar.f11511i = f10;
            fVar.f11512j = f11;
            this.O = null;
            float c10 = eVar.c();
            float b10 = eVar.b();
            this.T = c10;
            this.U = b10;
        }
    }

    public final void q(int i7) {
        f fVar = this.Q;
        if (fVar.d != i7) {
            fVar.d = i7;
            fVar.a();
            n();
        }
    }

    public final void r(float f10) {
        f fVar = this.Q;
        Arrays.fill(fVar.f11506b, f10);
        Arrays.fill(fVar.f11507c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.Q;
        float[] fArr = fVar.f11506b;
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

    public final void t(float f10, float f11, float f12, float f13, boolean z9) {
        float f14;
        f fVar = this.Q;
        float[] fArr = fVar.f11506b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        float f15 = 0.0f;
        if (z9) {
            f14 = 0.0f;
        } else {
            f14 = f12;
        }
        fArr[5] = f14;
        fArr[4] = f14;
        if (!z9) {
            f15 = f13;
        }
        fArr[7] = f15;
        fArr[6] = f15;
        float[] fArr2 = fVar.f11507c;
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
        this.Q.f11509f = i7;
        n();
    }

    @Override
    public final void updateColors() {
        this.M = r6.f28475b;
        gh.a aVar = this.f11539w;
        if (aVar != null) {
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).d();
            }
            this.f11541y = this.f11539w.e1();
            this.f11540x = this.f11539w.R0();
            this.D = this.f11539w.A();
            this.E = this.f11539w.O();
            this.F = this.f11539w.C0();
            this.G = this.f11539w.M();
            this.H = this.f11539w.v0();
            gh.a aVar2 = this.f11539w;
            if (aVar2 instanceof gh.e) {
                gh.e eVar = (gh.e) aVar2;
                float c10 = eVar.c();
                float b10 = eVar.b();
                this.T = c10;
                this.U = b10;
            } else if (aVar2.o0() >= 0.0f) {
                float o02 = this.f11539w.o0();
                float j02 = this.f11539w.j0();
                this.T = o02;
                this.U = j02;
            } else {
                float f10 = this.I;
                if (f10 >= 0.0f) {
                    float f11 = this.J;
                    this.T = f10;
                    this.U = f11;
                }
            }
            this.O = null;
            e eVar2 = this.f11535f0;
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
