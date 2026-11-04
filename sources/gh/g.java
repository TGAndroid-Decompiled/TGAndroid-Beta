package gh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import b8.mc;
import b8.w9;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import pi.q;
import pi.r;
public final class g extends pi.e implements z5 {
    public static Path f12322h0 = new Path();
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
    public mc Z;
    public boolean f12323a0;
    public si.a f12324b0;
    public boolean f12325c0;
    public final d f12326d0;
    public b f12327e0;
    public final si.a f12328f;
    public c f12329f0;
    public e f12330g0;
    public final si.a h;
    public final si.a f12331n;
    public si.a f12332r;
    public hh.a f12334w;
    public int f12335x;
    public int f12336y;
    public boolean f12333s = true;
    public float J = -1.0f;
    public int N = r6.f28515b;
    public final l O = new l();

    public g(si.a aVar, si.a aVar2, si.a aVar3) {
        f fVar = new f();
        this.R = fVar;
        this.W = 1.0f;
        this.Y = q.G;
        this.f12323a0 = true;
        this.f12326d0 = new d(this);
        this.f12328f = aVar;
        this.h = aVar2;
        this.f12331n = aVar3;
        r rVar = this.f53578b;
        if (!rVar.f53625a) {
            aVar = aVar3;
        } else if (!this.X || !rVar.f53626b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.f12332r = aVar;
        fVar.f12305i = g0.N(1.0f);
        fVar.f12306j = g0.N(0.6666667f);
        this.U = g0.N(1.0f);
        this.V = g0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (w9.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f12322h0;
        if (path == null) {
            f12322h0 = new Path();
        } else {
            path.rewind();
        }
        f12322h0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f12322h0);
    }

    public static si.a v(si.a aVar) {
        while (aVar instanceof si.g) {
            aVar = ((si.g) aVar).f54761a;
        }
        return aVar;
    }

    @Override
    public final void a() {
        mc o10 = o();
        e eVar = this.f12330g0;
        if (o10 == eVar && eVar != null) {
            eVar.e();
        }
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.R.f12309m);
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
        si.a aVar;
        int i3 = r6.f28515b;
        if (this.N != i3) {
            this.N = i3;
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
            if (!Objects.equals(this.f53578b, f10)) {
                this.f53578b = f10;
                g(f10);
            }
        }
        f fVar = this.R;
        if (!fVar.f12309m.isEmpty()) {
            mc o10 = o();
            si.a aVar2 = this.f12332r;
            if (o10 == this.f12330g0 && !canvas.isHardwareAccelerated()) {
                si.a v = v(v(this.f12332r));
                if (Build.VERSION.SDK_INT >= 29 && (v instanceof si.f) && (aVar = ((si.f) v).f54752a) != null) {
                    v = v(aVar);
                }
                aVar2 = v;
                o10 = k(aVar2);
            }
            o10.b(canvas, aVar2);
            float f11 = this.f53579c / 255.0f;
            Rect rect = fVar.f12309m;
            if (fVar.e()) {
                Path path = fVar.f12307k;
                long j10 = fVar.f12319x;
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
                        lVar.d(canvas, 2, path, j10, f12, f13, f14, f15, m10, m10.f12341f, f11);
                    }
                    if (m10.f12337a > 0.05f) {
                        int i11 = m10.f12338b;
                        if ((i11 >>> 24) != 0) {
                            lVar.d(canvas, 0, path, j10, f12, f13, f14, f15, m10, i11, f11);
                        }
                    }
                    if (m10.f12339c > 0.05f) {
                        int i12 = m10.d;
                        if ((i12 >>> 24) != 0) {
                            lVar.d(canvas, 1, path, j10, f12, f13, f14, f15, m10, i12, f11);
                        }
                    }
                    if (m10.f12342g > 0.05f) {
                        int i13 = m10.h;
                        if ((i13 >>> 24) != 0) {
                            lVar.d(canvas, 3, path, j10, f12, f13, f14, f15, m10, i13, f11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.O.a(canvas, rect.left, rect.top, rect.right, rect.bottom, fVar.f12300b, m(), f11);
        }
    }

    @Override
    public final boolean e() {
        mc o10 = o();
        e eVar = this.f12330g0;
        if (o10 == eVar && eVar != null && !eVar.c()) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(int i3) {
        e eVar = this.f12330g0;
        if (eVar != null) {
            eVar.f(i3 / 255.0f);
        }
    }

    @Override
    public final void g(r rVar) {
        this.f12323a0 = true;
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
                outline.setPath(fVar.f12307k);
                return;
            }
            RectF rectF = fVar.f12315s;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, fVar.f12300b[0]);
            return;
        }
        l(outline, fVar.f12309m, fVar.f12300b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        f fVar = this.R;
        int i3 = fVar.d;
        rect.set(i3, i3, i3, i3);
        return fVar.f12302e;
    }

    @Override
    public final void h() {
        e eVar = this.f12330g0;
        if (eVar != null) {
            eVar.h = true;
        }
    }

    @Override
    public final boolean j() {
        mc o10 = o();
        e eVar = this.f12330g0;
        if (o10 == eVar && eVar != null) {
            return true;
        }
        return false;
    }

    public final mc k(si.a aVar) {
        si.a v = v(aVar);
        if (Color.alpha(this.f12336y) != 255 && !(v instanceof si.c)) {
            if (v instanceof si.b) {
                if (this.f12327e0 == null) {
                    this.f12327e0 = new b(this);
                }
                return this.f12327e0;
            }
            if (this.f12329f0 == null) {
                this.f12329f0 = new c(this);
            }
            return this.f12329f0;
        }
        return this.f12326d0;
    }

    public final h m() {
        h hVar;
        if (this.P == null) {
            boolean z10 = this.Q;
            f fVar = this.R;
            if (z10) {
                float f10 = fVar.f12305i;
                int i3 = this.E;
                hVar = new h(0.0f, 0, 0.0f, 0, this.I, this.H, (f10 + fVar.f12306j) / 2.0f, i0.a.f(0.5f, i3, this.F));
            } else {
                hVar = new h(fVar.f12305i, this.E, fVar.f12306j, this.F, this.I, this.H, 0.0f, 0);
            }
            this.P = hVar;
        }
        return this.P;
    }

    public final void n() {
        e eVar = this.f12330g0;
        if (eVar != null) {
            eVar.d();
        }
    }

    public final mc o() {
        boolean z10;
        mc k10;
        si.a aVar;
        boolean z11 = true;
        if (this.f12323a0) {
            r rVar = this.f53578b;
            if (!rVar.f53625a) {
                aVar = this.f12331n;
            } else if (this.X && rVar.f53626b && Build.VERSION.SDK_INT >= 33) {
                aVar = this.f12328f;
            } else {
                aVar = this.h;
            }
            if (this.f12332r != aVar) {
                this.f12332r = aVar;
                e eVar = this.f12330g0;
                if (eVar != null) {
                    eVar.h = true;
                }
            }
        }
        si.a v = v(this.f12332r);
        if (Color.alpha(this.f12336y) == 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Z == null || this.f12323a0 || this.f12324b0 != v || this.f12325c0 != z10) {
            this.f12323a0 = false;
            this.f12324b0 = v;
            this.f12325c0 = z10;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && (this.f12332r instanceof eh.b) && !(v instanceof si.c) && !(v instanceof si.b)) {
                if (this.f12330g0 == null) {
                    e eVar2 = new e(this);
                    eVar2.g(this.f12333s);
                    eVar2.f(this.f53579c / 255.0f);
                    eVar2.d();
                    this.f12330g0 = eVar2;
                }
                k10 = this.f12330g0;
            } else {
                k10 = k(v);
            }
            e eVar3 = this.f12330g0;
            if (eVar3 != null) {
                if (k10 != eVar3 || !this.X || !this.f53578b.f53626b || i3 < 33) {
                    z11 = false;
                }
                eVar3.h(z11);
            }
            mc mcVar = this.Z;
            if (mcVar != k10 && mcVar != null) {
                mcVar.a();
            }
            this.Z = k10;
        }
        return this.Z;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f fVar = this.R;
        fVar.f12299a.set(rect);
        fVar.a();
        n();
    }

    public final void p(hh.a aVar) {
        this.f12334w = aVar;
        if (this.J < 0.0f) {
            this.J = this.U;
            this.K = this.V;
        }
        updateColors();
        if (aVar instanceof hh.e) {
            hh.e eVar = (hh.e) aVar;
            float f10 = eVar.f14418f;
            float f11 = eVar.h;
            f fVar = this.R;
            fVar.f12305i = f10;
            fVar.f12306j = f11;
            this.P = null;
            float c2 = eVar.c();
            float b10 = eVar.b();
            this.U = c2;
            this.V = b10;
        }
    }

    public final void q(int i3) {
        f fVar = this.R;
        if (fVar.d != i3) {
            fVar.d = i3;
            fVar.a();
            n();
        }
    }

    public final void r(float f10) {
        f fVar = this.R;
        Arrays.fill(fVar.f12300b, f10);
        Arrays.fill(fVar.f12301c, f10);
        fVar.a();
        n();
    }

    public final void s(float f10, float f11, float f12, float f13) {
        f fVar = this.R;
        float[] fArr = fVar.f12300b;
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
        float[] fArr = fVar.f12300b;
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
        float[] fArr2 = fVar.f12301c;
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

    public final void u(int i3) {
        this.R.f12303f = i3;
        n();
    }

    @Override
    public final void updateColors() {
        this.N = r6.f28515b;
        hh.a aVar = this.f12334w;
        if (aVar != null) {
            if (aVar instanceof hh.b) {
                ((hh.b) aVar).d();
            }
            this.f12336y = this.f12334w.w0();
            this.f12335x = this.f12334w.u0();
            this.E = this.f12334w.x();
            this.F = this.f12334w.M();
            this.G = this.f12334w.c0();
            this.H = this.f12334w.F();
            this.I = this.f12334w.a0();
            hh.a aVar2 = this.f12334w;
            if (aVar2 instanceof hh.e) {
                hh.e eVar = (hh.e) aVar2;
                float c2 = eVar.c();
                float b10 = eVar.b();
                this.U = c2;
                this.V = b10;
            } else if (aVar2.W() >= 0.0f) {
                float W = this.f12334w.W();
                float O = this.f12334w.O();
                this.U = W;
                this.V = O;
            } else {
                float f10 = this.J;
                if (f10 >= 0.0f) {
                    float f11 = this.K;
                    this.U = f10;
                    this.V = f11;
                }
            }
            this.P = null;
            e eVar2 = this.f12330g0;
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
