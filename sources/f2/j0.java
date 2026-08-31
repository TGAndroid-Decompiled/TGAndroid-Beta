package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class j0 extends w0 {
    public int A;
    public i0 B;
    public final b4.v C;
    public final g0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f5816o;
    public h0 f5817p;
    public androidx.emoji2.text.g f5818q;
    public boolean f5819r;
    public boolean f5820s;
    public boolean f5821t;
    public boolean f5822u;
    public boolean v;
    public boolean f5823w;
    public final boolean f5824x;
    public int f5825y;
    public boolean f5826z;

    public j0() {
        this(1, false);
    }

    public void A0(j1 j1Var, h0 h0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = h0Var.d;
        if (i10 >= 0 && i10 < j1Var.b()) {
            iVar.a(i10, Math.max(0, h0Var.f5787g));
        }
    }

    public final int B0(j1 j1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5818q;
            boolean z4 = this.f5824x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            if (r() != 0 && j1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z4) {
                    return Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(j1 j1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5818q;
            boolean z4 = this.f5824x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            boolean z11 = this.v;
            if (r() != 0 && j1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((x0) K0.getLayoutParams()).b(), ((x0) J0.getLayoutParams()).b());
                int max2 = Math.max(((x0) K0.getLayoutParams()).b(), ((x0) J0.getLayoutParams()).b());
                if (z11) {
                    max = Math.max(0, (j1Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z4) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(j1 j1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5818q;
            boolean z4 = this.f5824x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            if (r() != 0 && j1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z4) {
                    return j1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1)) * j1Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        boolean z4 = false;
        int i11 = 1;
        if (i10 < w0.H(q(0))) {
            z4 = true;
        }
        if (z4 != this.v) {
            i11 = -1;
        }
        if (this.f5816o == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    public final int F0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f5816o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f5816o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f5816o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5816o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5816o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f5816o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f5817p == null) {
            ?? obj = new Object();
            obj.f5782a = true;
            obj.h = 0;
            obj.f5788i = 0;
            obj.f5790k = null;
            this.f5817p = obj;
        }
    }

    public final int H0(bf.f fVar, h0 h0Var, j1 j1Var, boolean z4) {
        int i10 = h0Var.f5784c;
        int i11 = h0Var.f5787g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                h0Var.f5787g = i11 + i10;
            }
            c1(fVar, h0Var);
        }
        int i12 = h0Var.f5784c + h0Var.h;
        while (true) {
            if ((!h0Var.f5791l && i12 <= 0) || !h0Var.b(j1Var)) {
                break;
            }
            g0 g0Var = this.D;
            g0Var.f5773a = 0;
            g0Var.f5774b = false;
            g0Var.f5775c = false;
            g0Var.d = false;
            Z0(fVar, j1Var, h0Var, g0Var);
            if (!g0Var.f5774b) {
                int i13 = h0Var.f5783b;
                int i14 = g0Var.f5773a;
                h0Var.f5783b = (h0Var.f5786f * i14) + i13;
                if (!g0Var.f5775c || h0Var.f5790k != null || !j1Var.f5832g) {
                    h0Var.f5784c -= i14;
                    i12 -= i14;
                }
                int i15 = h0Var.f5787g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    h0Var.f5787g = i16;
                    int i17 = h0Var.f5784c;
                    if (i17 < 0) {
                        h0Var.f5787g = i16 + i17;
                    }
                    c1(fVar, h0Var);
                }
                if (z4 && g0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - h0Var.f5784c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z4) {
        if (this.v) {
            return P0(0, r(), z4, true);
        }
        return P0(r() - 1, -1, z4, true);
    }

    public final View K0(boolean z4) {
        if (this.v) {
            return P0(r() - 1, -1, z4, true);
        }
        return P0(0, r(), z4, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 > i10 || i11 < i10) {
            if (this.f5818q.d(q(i10)) < this.f5818q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f5816o == 0) {
                return this.f5942c.M(i10, i11, i12, i13);
            }
            return this.d.M(i10, i11, i12, i13);
        }
        return q(i10);
    }

    public final View P0(int i10, int i11, boolean z4, boolean z10) {
        int i12;
        G0();
        int i13 = 320;
        if (z4) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z10) {
            i13 = 0;
        }
        if (this.f5816o == 0) {
            return this.f5942c.M(i10, i11, i12, i13);
        }
        return this.d.M(i10, i11, i12, i13);
    }

    public View Q0(bf.f fVar, j1 j1Var, int i10, int i11, int i12) {
        int j10;
        int i13;
        G0();
        if (this.f5819r) {
            j10 = 0;
        } else {
            j10 = this.f5818q.j();
        }
        int f10 = this.f5818q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q10 = q(i10);
            int H = w0.H(q10);
            if (H >= 0 && H < i12) {
                if (((x0) q10.getLayoutParams()).f5952a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f5818q.d(q10) < f10 && this.f5818q.a(q10) >= j10) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public View R(View view, int i10, bf.f fVar, j1 j1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f5818q.k() * 0.33333334f), false, j1Var);
            h0 h0Var = this.f5817p;
            h0Var.f5787g = Integer.MIN_VALUE;
            h0Var.f5782a = false;
            H0(fVar, h0Var, j1Var, true);
            if (F0 == -1) {
                if (this.v) {
                    O0 = O0(r() - 1, -1);
                } else {
                    O0 = O0(0, r());
                }
            } else if (this.v) {
                O0 = O0(0, r());
            } else {
                O0 = O0(r() - 1, -1);
            }
            if (F0 == -1) {
                U0 = V0();
            } else {
                U0 = U0();
            }
            if (U0.hasFocusable()) {
                if (O0 != null) {
                    return U0;
                }
            } else {
                return O0;
            }
        }
        return null;
    }

    public int R0() {
        return 0;
    }

    public final int S0(int i10, bf.f fVar, j1 j1Var, boolean z4) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f5818q.f() - i10) > 0) {
            int i11 = -g1(-f10, fVar, j1Var);
            int i12 = i10 + i11;
            if (z4 && (f11 = this.f5818q.f() - i12) > 0) {
                this.f5818q.n(f11);
                return f11 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, bf.f fVar, j1 j1Var, boolean z4) {
        int X0;
        int j10;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, fVar, j1Var);
            int i12 = i10 + i11;
            if (z4 && (j10 = i12 - this.f5818q.j()) > 0) {
                this.f5818q.n(-j10);
                return i11 - j10;
            }
            return i11;
        }
        return 0;
    }

    public final View U0() {
        int r10;
        if (this.v) {
            r10 = 0;
        } else {
            r10 = r() - 1;
        }
        return q(r10);
    }

    public final View V0() {
        int i10;
        if (this.v) {
            i10 = r() - 1;
        } else {
            i10 = 0;
        }
        return q(i10);
    }

    public int W0(j1 j1Var) {
        if (j1Var.f5827a != -1) {
            return this.f5818q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f5818q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f5941b;
        WeakHashMap weakHashMap = r0.j0.f46438a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(bf.f fVar, j1 j1Var, h0 h0Var, g0 g0Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        View c3 = h0Var.c(fVar);
        if (c3 == null) {
            g0Var.f5774b = true;
            return;
        }
        x0 x0Var = (x0) c3.getLayoutParams();
        if (h0Var.f5790k == null) {
            boolean z11 = this.v;
            if (h0Var.f5786f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                a(c3, -1, false);
            } else {
                a(c3, 0, false);
            }
        } else {
            boolean z12 = this.v;
            if (h0Var.f5786f == -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z12 == z4) {
                a(c3, -1, true);
            } else {
                a(c3, 0, true);
            }
        }
        P(c3);
        g0Var.f5773a = this.f5818q.b(c3);
        if (this.f5816o == 1) {
            if (Y0()) {
                i13 = this.f5950m - E();
                i10 = i13 - this.f5818q.c(c3);
            } else {
                i10 = D();
                i13 = this.f5818q.c(c3) + i10;
            }
            if (h0Var.f5786f == -1) {
                i11 = h0Var.f5783b;
                i12 = i11 - g0Var.f5773a;
            } else {
                i12 = h0Var.f5783b;
                i11 = g0Var.f5773a + i12;
            }
        } else {
            int F = F();
            int c10 = this.f5818q.c(c3) + F;
            if (h0Var.f5786f == -1) {
                int i14 = h0Var.f5783b;
                int i15 = i14 - g0Var.f5773a;
                i13 = i14;
                i11 = c10;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = h0Var.f5783b;
                int i17 = g0Var.f5773a + i16;
                i10 = i16;
                i11 = c10;
                i12 = F;
                i13 = i17;
            }
        }
        w0.O(c3, i10, i12, i13, i11);
        if (x0Var.f5952a.j() || x0Var.f5952a.m()) {
            g0Var.f5775c = true;
        }
        g0Var.d = c3.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f5941b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(bf.f r18, f2.j1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: f2.j0.b0(bf.f, f2.j1):void");
    }

    public void b1(View view, View view2, int i10, int i11) {
        char c3;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = w0.H(view);
        int H2 = w0.H(view2);
        if (H < H2) {
            c3 = 1;
        } else {
            c3 = 65535;
        }
        if (this.v) {
            if (c3 == 1) {
                h1(H2, this.f5818q.f() - (this.f5818q.b(view) + this.f5818q.d(view2)));
                return;
            }
            h1(H2, this.f5818q.f() - this.f5818q.a(view2));
        } else if (c3 == 65535) {
            h1(H2, this.f5818q.d(view2));
        } else {
            h1(H2, this.f5818q.a(view2) - this.f5818q.b(view));
        }
    }

    @Override
    public void c0(j1 j1Var) {
        this.B = null;
        this.f5825y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.f();
    }

    public final void c1(bf.f fVar, h0 h0Var) {
        m1 T;
        m1 T2;
        if (h0Var.f5782a && !h0Var.f5791l) {
            int i10 = h0Var.f5787g;
            int i11 = h0Var.f5788i;
            if (h0Var.f5786f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e6 = (this.f5818q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q10 = q(i12);
                            if (q10 != null && (T2 = this.f5941b.T(q10)) != null && !T2.r() && (this.f5818q.d(q10) < e6 || this.f5818q.m(q10) < e6)) {
                                d1(fVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q11 = q(i14);
                        if (q11 != null && (T = this.f5941b.T(q11)) != null && !T.r() && (this.f5818q.d(q11) < e6 || this.f5818q.m(q11) < e6)) {
                            d1(fVar, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(fVar, i10, i11);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f5822u && this.f5816o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(bf.f fVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    i0(i12, fVar);
                }
                return;
            }
            while (i10 > i11) {
                i0(i10, fVar);
                i10--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f5822u && this.f5816o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final i0 e0() {
        i0 i0Var = this.B;
        if (i0Var != null) {
            ?? obj = new Object();
            obj.f5802a = i0Var.f5802a;
            obj.f5803b = i0Var.f5803b;
            obj.f5804c = i0Var.f5804c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z4 = this.f5820s ^ this.v;
            obj2.f5804c = z4;
            if (z4) {
                View U0 = U0();
                obj2.f5803b = this.f5818q.f() - this.f5818q.a(U0);
                obj2.f5802a = ((x0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f5802a = w0.H(V0);
            obj2.f5803b = this.f5818q.d(V0) - this.f5818q.j();
            return obj2;
        }
        obj2.f5802a = -1;
        return obj2;
    }

    public void e1(bf.f fVar, int i10, int i11) {
        m1 T;
        m1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q10 = q(i14);
                    if (q10 != null && (T2 = this.f5941b.T(q10)) != null && !T2.r() && (this.f5818q.a(q10) > i12 || this.f5818q.l(q10) > i12)) {
                        d1(fVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q11 = q(i15);
                if (q11 != null && (T = this.f5941b.T(q11)) != null && !T.r() && (this.f5818q.a(q11) > i12 || this.f5818q.l(q11) > i12)) {
                    d1(fVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f5816o != 1 && Y0()) {
            this.v = !this.f5821t;
        } else {
            this.v = this.f5821t;
        }
    }

    public final int g1(int i10, bf.f fVar, j1 j1Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f5817p.f5782a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, j1Var);
        h0 h0Var = this.f5817p;
        int H0 = H0(fVar, h0Var, j1Var, false) + h0Var.f5787g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f5818q.n(-i10);
        this.f5817p.f5789j = i10;
        return i10;
    }

    @Override
    public int h(j1 j1Var) {
        return C0(j1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(j1 j1Var) {
        return D0(j1Var);
    }

    public void i1(int i10, int i11, boolean z4) {
        if (this.f5825y == i10 && this.A == i11 && this.f5826z == z4) {
            return;
        }
        this.f5825y = i10;
        this.A = i11;
        this.f5826z = z4;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.f5802a = -1;
        }
        l0();
    }

    @Override
    public int j(j1 j1Var) {
        return B0(j1Var);
    }

    public final void j1(int i10) {
        m0 m0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(l.d.j(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f5816o && this.f5818q != null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                m0Var = new m0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            m0Var = new m0(this, 0);
        }
        this.f5818q = m0Var;
        this.C.f1654f = m0Var;
        this.f5816o = i10;
        l0();
    }

    @Override
    public int k(j1 j1Var) {
        return C0(j1Var);
    }

    public void k1(boolean z4) {
        b(null);
        if (z4 == this.f5821t) {
            return;
        }
        this.f5821t = z4;
        l0();
    }

    @Override
    public int l(j1 j1Var) {
        return D0(j1Var);
    }

    public void l1(boolean z4) {
        b(null);
        if (this.f5823w == z4) {
            return;
        }
        this.f5823w = z4;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r10 = r();
        if (r10 != 0) {
            int H = i10 - w0.H(q(0));
            if (H >= 0 && H < r10) {
                View q10 = q(H);
                if (w0.H(q10) == i10) {
                    return q10;
                }
            }
            int r11 = r();
            for (int i11 = 0; i11 < r11; i11++) {
                View q11 = q(i11);
                m1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i10 && !U.r() && (this.f5941b.f1339q0.f5832g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, bf.f fVar, j1 j1Var) {
        if (this.f5816o == 1) {
            return 0;
        }
        return g1(i10, fVar, j1Var);
    }

    public final void m1(int i10, int i11, boolean z4, j1 j1Var) {
        boolean z10;
        int i12;
        int j10;
        h0 h0Var = this.f5817p;
        boolean z11 = false;
        int i13 = 1;
        if (this.f5818q.h() == 0 && this.f5818q.e() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f5791l = z10;
        this.f5817p.f5786f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(j1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z11 = true;
        }
        h0 h0Var2 = this.f5817p;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        h0Var2.h = i12;
        if (!z11) {
            max = max2;
        }
        h0Var2.f5788i = max;
        if (z11) {
            h0Var2.h = this.f5818q.g() + i12;
            View U0 = U0();
            h0 h0Var3 = this.f5817p;
            if (this.v) {
                i13 = -1;
            }
            h0Var3.f5785e = i13;
            int H = w0.H(U0);
            h0 h0Var4 = this.f5817p;
            h0Var3.d = H + h0Var4.f5785e;
            h0Var4.f5783b = this.f5818q.a(U0);
            j10 = this.f5818q.a(U0) - this.f5818q.f();
        } else {
            View V0 = V0();
            h0 h0Var5 = this.f5817p;
            h0Var5.h = this.f5818q.j() + h0Var5.h;
            h0 h0Var6 = this.f5817p;
            if (!this.v) {
                i13 = -1;
            }
            h0Var6.f5785e = i13;
            int H2 = w0.H(V0);
            h0 h0Var7 = this.f5817p;
            h0Var6.d = H2 + h0Var7.f5785e;
            h0Var7.f5783b = this.f5818q.d(V0);
            j10 = (-this.f5818q.d(V0)) + this.f5818q.j();
        }
        h0 h0Var8 = this.f5817p;
        h0Var8.f5784c = i11;
        if (z4) {
            h0Var8.f5784c = i11 - j10;
        }
        h0Var8.f5787g = j10;
    }

    @Override
    public x0 n() {
        return new x0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f5825y = i10;
        this.A = Integer.MIN_VALUE;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.f5802a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f5817p.f5784c = this.f5818q.f() - i11;
        h0 h0Var = this.f5817p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        h0Var.f5785e = i12;
        h0Var.d = i10;
        h0Var.f5786f = 1;
        h0Var.f5783b = i11;
        h0Var.f5787g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, bf.f fVar, j1 j1Var) {
        if (this.f5816o == 0) {
            return 0;
        }
        return g1(i10, fVar, j1Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f5817p.f5784c = i11 - this.f5818q.j();
        h0 h0Var = this.f5817p;
        h0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        h0Var.f5785e = i12;
        h0Var.f5786f = -1;
        h0Var.f5783b = i11;
        h0Var.f5787g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, j1 j1Var, int i10) {
        k0 k0Var = new k0(recyclerView.getContext());
        k0Var.f5805a = i10;
        w0(k0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f5820s == this.f5823w) {
            return true;
        }
        return false;
    }

    public void z0(j1 j1Var, int[] iArr) {
        int i10;
        int W0 = W0(j1Var);
        if (this.f5817p.f5786f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public j0(int i10, boolean z4) {
        this.f5816o = 1;
        this.f5819r = false;
        this.f5821t = false;
        this.f5822u = false;
        this.v = false;
        this.f5823w = false;
        this.f5824x = true;
        this.f5825y = -1;
        this.f5826z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        b4.v vVar = new b4.v();
        vVar.f();
        this.C = vVar;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z4);
    }

    public void a1(bf.f fVar, j1 j1Var, b4.v vVar, int i10) {
    }
}
