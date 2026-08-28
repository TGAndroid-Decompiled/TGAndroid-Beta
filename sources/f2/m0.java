package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class m0 extends z0 {
    public int A;
    public l0 B;
    public final i0 C;
    public final j0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f5432o;
    public k0 f5433p;
    public androidx.emoji2.text.f f5434q;
    public boolean f5435r;
    public boolean f5436s;
    public boolean f5437t;
    public boolean f5438u;
    public boolean v;
    public boolean f5439w;
    public final boolean f5440x;
    public int f5441y;
    public boolean f5442z;

    public m0() {
        this(1, false);
    }

    public void A0(n1 n1Var, k0 k0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i9 = k0Var.d;
        if (i9 >= 0 && i9 < n1Var.b()) {
            iVar.a(i9, Math.max(0, k0Var.f5408g));
        }
    }

    public final int B0(n1 n1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.f fVar = this.f5434q;
            boolean z10 = this.f5440x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && n1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((a1) K0.getLayoutParams()).b() - ((a1) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(fVar.k(), fVar.a(J0) - fVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(n1 n1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.f fVar = this.f5434q;
            boolean z10 = this.f5440x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && n1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((a1) K0.getLayoutParams()).b(), ((a1) J0.getLayoutParams()).b());
                int max2 = Math.max(((a1) K0.getLayoutParams()).b(), ((a1) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (n1Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z10) {
                    return max;
                }
                return Math.round((max * (Math.abs(fVar.a(J0) - fVar.d(K0)) / (Math.abs(((a1) K0.getLayoutParams()).b() - ((a1) J0.getLayoutParams()).b()) + 1))) + (fVar.j() - fVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(n1 n1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.f fVar = this.f5434q;
            boolean z10 = this.f5440x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && n1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return n1Var.b();
                }
                return (int) (((fVar.a(J0) - fVar.d(K0)) / (Math.abs(((a1) K0.getLayoutParams()).b() - ((a1) J0.getLayoutParams()).b()) + 1)) * n1Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i9) {
        if (r() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i9 < z0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i10 = -1;
        }
        if (this.f5432o == 0) {
            return new PointF(i10, 0.0f);
        }
        return new PointF(0.0f, i10);
    }

    public final int F0(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 17) {
                    if (i9 != 33) {
                        if (i9 != 66) {
                            if (i9 == 130 && this.f5432o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f5432o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f5432o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5432o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5432o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f5432o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f5433p == null) {
            ?? obj = new Object();
            obj.f5403a = true;
            obj.h = 0;
            obj.f5409i = 0;
            obj.f5411k = null;
            this.f5433p = obj;
        }
    }

    public final int H0(g1 g1Var, k0 k0Var, n1 n1Var, boolean z10) {
        int i9 = k0Var.f5405c;
        int i10 = k0Var.f5408g;
        if (i10 != Integer.MIN_VALUE) {
            if (i9 < 0) {
                k0Var.f5408g = i10 + i9;
            }
            c1(g1Var, k0Var);
        }
        int i11 = k0Var.f5405c + k0Var.h;
        while (true) {
            if ((!k0Var.f5412l && i11 <= 0) || !k0Var.b(n1Var)) {
                break;
            }
            j0 j0Var = this.D;
            j0Var.f5395a = 0;
            j0Var.f5396b = false;
            j0Var.f5397c = false;
            j0Var.d = false;
            Z0(g1Var, n1Var, k0Var, j0Var);
            if (!j0Var.f5396b) {
                int i12 = k0Var.f5404b;
                int i13 = j0Var.f5395a;
                k0Var.f5404b = (k0Var.f5407f * i13) + i12;
                if (!j0Var.f5397c || k0Var.f5411k != null || !n1Var.f5474g) {
                    k0Var.f5405c -= i13;
                    i11 -= i13;
                }
                int i14 = k0Var.f5408g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    k0Var.f5408g = i15;
                    int i16 = k0Var.f5405c;
                    if (i16 < 0) {
                        k0Var.f5408g = i15 + i16;
                    }
                    c1(g1Var, k0Var);
                }
                if (z10 && j0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i9 - k0Var.f5405c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z10) {
        if (this.v) {
            return P0(0, r(), z10, true);
        }
        return P0(r() - 1, -1, z10, true);
    }

    public final View K0(boolean z10) {
        if (this.v) {
            return P0(r() - 1, -1, z10, true);
        }
        return P0(0, r(), z10, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final View O0(int i9, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 > i9 || i10 < i9) {
            if (this.f5434q.d(q(i9)) < this.f5434q.j()) {
                i11 = 16644;
                i12 = 16388;
            } else {
                i11 = 4161;
                i12 = 4097;
            }
            if (this.f5432o == 0) {
                return this.f5564c.B(i9, i10, i11, i12);
            }
            return this.d.B(i9, i10, i11, i12);
        }
        return q(i9);
    }

    public final View P0(int i9, int i10, boolean z10, boolean z11) {
        int i11;
        G0();
        int i12 = 320;
        if (z10) {
            i11 = 24579;
        } else {
            i11 = 320;
        }
        if (!z11) {
            i12 = 0;
        }
        if (this.f5432o == 0) {
            return this.f5564c.B(i9, i10, i11, i12);
        }
        return this.d.B(i9, i10, i11, i12);
    }

    public View Q0(g1 g1Var, n1 n1Var, int i9, int i10, int i11) {
        int j10;
        int i12;
        G0();
        if (this.f5435r) {
            j10 = 0;
        } else {
            j10 = this.f5434q.j();
        }
        int f10 = this.f5434q.f();
        if (i10 > i9) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View q10 = q(i9);
            int H = z0.H(q10);
            if (H >= 0 && H < i11) {
                if (((a1) q10.getLayoutParams()).f5311a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f5434q.d(q10) < f10 && this.f5434q.a(q10) >= j10) {
                    return q10;
                } else {
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i9 += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public View R(View view, int i9, g1 g1Var, n1 n1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i9)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f5434q.k() * 0.33333334f), false, n1Var);
            k0 k0Var = this.f5433p;
            k0Var.f5408g = Integer.MIN_VALUE;
            k0Var.f5403a = false;
            H0(g1Var, k0Var, n1Var, true);
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

    public final int S0(int i9, g1 g1Var, n1 n1Var, boolean z10) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f5434q.f() - i9) > 0) {
            int i10 = -g1(-f10, g1Var, n1Var);
            int i11 = i9 + i10;
            if (z10 && (f11 = this.f5434q.f() - i11) > 0) {
                this.f5434q.n(f11);
                return f11 + i10;
            }
            return i10;
        }
        return 0;
    }

    public final int T0(int i9, g1 g1Var, n1 n1Var, boolean z10) {
        int X0;
        int j10;
        if (this.G && (X0 = i9 - X0()) > 0) {
            int i10 = -g1(X0, g1Var, n1Var);
            int i11 = i9 + i10;
            if (z10 && (j10 = i11 - this.f5434q.j()) > 0) {
                this.f5434q.n(-j10);
                return i10 - j10;
            }
            return i10;
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
        int i9;
        if (this.v) {
            i9 = r() - 1;
        } else {
            i9 = 0;
        }
        return q(i9);
    }

    public int W0(n1 n1Var) {
        if (n1Var.f5469a != -1) {
            return this.f5434q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f5434q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f5563b;
        WeakHashMap weakHashMap = r0.j0.f46915a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(g1 g1Var, n1 n1Var, k0 k0Var, j0 j0Var) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z11;
        View c10 = k0Var.c(g1Var);
        if (c10 == null) {
            j0Var.f5396b = true;
            return;
        }
        a1 a1Var = (a1) c10.getLayoutParams();
        if (k0Var.f5411k == null) {
            boolean z12 = this.v;
            if (k0Var.f5407f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            boolean z13 = this.v;
            if (k0Var.f5407f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        j0Var.f5395a = this.f5434q.b(c10);
        if (this.f5432o == 1) {
            if (Y0()) {
                i12 = this.f5572m - E();
                i9 = i12 - this.f5434q.c(c10);
            } else {
                i9 = D();
                i12 = this.f5434q.c(c10) + i9;
            }
            if (k0Var.f5407f == -1) {
                i10 = k0Var.f5404b;
                i11 = i10 - j0Var.f5395a;
            } else {
                i11 = k0Var.f5404b;
                i10 = j0Var.f5395a + i11;
            }
        } else {
            int F = F();
            int c11 = this.f5434q.c(c10) + F;
            if (k0Var.f5407f == -1) {
                int i13 = k0Var.f5404b;
                int i14 = i13 - j0Var.f5395a;
                i12 = i13;
                i10 = c11;
                i9 = i14;
                i11 = F;
            } else {
                int i15 = k0Var.f5404b;
                int i16 = j0Var.f5395a + i15;
                i9 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        z0.O(c10, i9, i11, i12, i10);
        if (a1Var.f5311a.j() || a1Var.f5311a.m()) {
            j0Var.f5397c = true;
        }
        j0Var.d = c10.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f5563b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(f2.g1 r18, f2.n1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: f2.m0.b0(f2.g1, f2.n1):void");
    }

    public void b1(View view, View view2, int i9, int i10) {
        char c10;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = z0.H(view);
        int H2 = z0.H(view2);
        if (H < H2) {
            c10 = 1;
        } else {
            c10 = 65535;
        }
        if (this.v) {
            if (c10 == 1) {
                h1(H2, this.f5434q.f() - (this.f5434q.b(view) + this.f5434q.d(view2)));
                return;
            }
            h1(H2, this.f5434q.f() - this.f5434q.a(view2));
        } else if (c10 == 65535) {
            h1(H2, this.f5434q.d(view2));
        } else {
            h1(H2, this.f5434q.a(view2) - this.f5434q.b(view));
        }
    }

    @Override
    public void c0(n1 n1Var) {
        this.B = null;
        this.f5441y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.f();
    }

    public final void c1(g1 g1Var, k0 k0Var) {
        q1 T;
        q1 T2;
        if (k0Var.f5403a && !k0Var.f5412l) {
            int i9 = k0Var.f5408g;
            int i10 = k0Var.f5409i;
            if (k0Var.f5407f == -1) {
                int r10 = r();
                if (i9 >= 0) {
                    int e10 = (this.f5434q.e() - i9) + i10;
                    if (this.v) {
                        for (int i11 = 0; i11 < r10; i11++) {
                            View q10 = q(i11);
                            if (q10 != null && (T2 = this.f5563b.T(q10)) != null && !T2.r() && (this.f5434q.d(q10) < e10 || this.f5434q.m(q10) < e10)) {
                                d1(g1Var, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = r10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View q11 = q(i13);
                        if (q11 != null && (T = this.f5563b.T(q11)) != null && !T.r() && (this.f5434q.d(q11) < e10 || this.f5434q.m(q11) < e10)) {
                            d1(g1Var, i12, i13);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(g1Var, i9, i10);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f5438u && this.f5432o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(g1 g1Var, int i9, int i10) {
        if (i9 != i10) {
            if (i10 > i9) {
                for (int i11 = i10 - 1; i11 >= i9; i11--) {
                    i0(i11, g1Var);
                }
                return;
            }
            while (i9 > i10) {
                i0(i9, g1Var);
                i9--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f5438u && this.f5432o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final l0 e0() {
        l0 l0Var = this.B;
        if (l0Var != null) {
            ?? obj = new Object();
            obj.f5419a = l0Var.f5419a;
            obj.f5420b = l0Var.f5420b;
            obj.f5421c = l0Var.f5421c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f5436s ^ this.v;
            obj2.f5421c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f5420b = this.f5434q.f() - this.f5434q.a(U0);
                obj2.f5419a = ((a1) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f5419a = z0.H(V0);
            obj2.f5420b = this.f5434q.d(V0) - this.f5434q.j();
            return obj2;
        }
        obj2.f5419a = -1;
        return obj2;
    }

    public void e1(g1 g1Var, int i9, int i10) {
        q1 T;
        q1 T2;
        if (i9 >= 0) {
            int i11 = i9 - i10;
            int r10 = r();
            if (this.v) {
                int i12 = r10 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q10 = q(i13);
                    if (q10 != null && (T2 = this.f5563b.T(q10)) != null && !T2.r() && (this.f5434q.a(q10) > i11 || this.f5434q.l(q10) > i11)) {
                        d1(g1Var, i12, i13);
                        return;
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < r10; i14++) {
                View q11 = q(i14);
                if (q11 != null && (T = this.f5563b.T(q11)) != null && !T.r() && (this.f5434q.a(q11) > i11 || this.f5434q.l(q11) > i11)) {
                    d1(g1Var, 0, i14);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f5432o != 1 && Y0()) {
            this.v = !this.f5437t;
        } else {
            this.v = this.f5437t;
        }
    }

    public final int g1(int i9, g1 g1Var, n1 n1Var) {
        int i10;
        if (r() == 0 || i9 == 0) {
            return 0;
        }
        G0();
        this.f5433p.f5403a = true;
        if (i9 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int abs = Math.abs(i9);
        m1(i10, abs, true, n1Var);
        k0 k0Var = this.f5433p;
        int H0 = H0(g1Var, k0Var, n1Var, false) + k0Var.f5408g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i9 = i10 * H0;
        }
        this.f5434q.n(-i9);
        this.f5433p.f5410j = i9;
        return i9;
    }

    @Override
    public int h(n1 n1Var) {
        return C0(n1Var);
    }

    public void h1(int i9, int i10) {
        i1(i9, i10, this.v);
    }

    @Override
    public int i(n1 n1Var) {
        return D0(n1Var);
    }

    public void i1(int i9, int i10, boolean z10) {
        if (this.f5441y == i9 && this.A == i10 && this.f5442z == z10) {
            return;
        }
        this.f5441y = i9;
        this.A = i10;
        this.f5442z = z10;
        l0 l0Var = this.B;
        if (l0Var != null) {
            l0Var.f5419a = -1;
        }
        l0();
    }

    @Override
    public int j(n1 n1Var) {
        return B0(n1Var);
    }

    public final void j1(int i9) {
        p0 p0Var;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(j3.r0.l(i9, "invalid orientation:"));
        }
        b(null);
        if (i9 == this.f5432o && this.f5434q != null) {
            return;
        }
        if (i9 != 0) {
            if (i9 == 1) {
                p0Var = new p0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            p0Var = new p0(this, 0);
        }
        this.f5434q = p0Var;
        this.C.f5387f = p0Var;
        this.f5432o = i9;
        l0();
    }

    @Override
    public int k(n1 n1Var) {
        return C0(n1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f5437t) {
            return;
        }
        this.f5437t = z10;
        l0();
    }

    @Override
    public int l(n1 n1Var) {
        return D0(n1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f5439w == z10) {
            return;
        }
        this.f5439w = z10;
        l0();
    }

    @Override
    public final View m(int i9) {
        int r10 = r();
        if (r10 != 0) {
            int H = i9 - z0.H(q(0));
            if (H >= 0 && H < r10) {
                View q10 = q(H);
                if (z0.H(q10) == i9) {
                    return q10;
                }
            }
            int r11 = r();
            for (int i10 = 0; i10 < r11; i10++) {
                View q11 = q(i10);
                q1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i9 && !U.r() && (this.f5563b.f1357p0.f5474g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i9, g1 g1Var, n1 n1Var) {
        if (this.f5432o == 1) {
            return 0;
        }
        return g1(i9, g1Var, n1Var);
    }

    public final void m1(int i9, int i10, boolean z10, n1 n1Var) {
        boolean z11;
        int i11;
        int j10;
        k0 k0Var = this.f5433p;
        boolean z12 = false;
        int i12 = 1;
        if (this.f5434q.h() == 0 && this.f5434q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        k0Var.f5412l = z11;
        this.f5433p.f5407f = i9;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(n1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i9 == 1) {
            z12 = true;
        }
        k0 k0Var2 = this.f5433p;
        if (z12) {
            i11 = max2;
        } else {
            i11 = max;
        }
        k0Var2.h = i11;
        if (!z12) {
            max = max2;
        }
        k0Var2.f5409i = max;
        if (z12) {
            k0Var2.h = this.f5434q.g() + i11;
            View U0 = U0();
            k0 k0Var3 = this.f5433p;
            if (this.v) {
                i12 = -1;
            }
            k0Var3.f5406e = i12;
            int H = z0.H(U0);
            k0 k0Var4 = this.f5433p;
            k0Var3.d = H + k0Var4.f5406e;
            k0Var4.f5404b = this.f5434q.a(U0);
            j10 = this.f5434q.a(U0) - this.f5434q.f();
        } else {
            View V0 = V0();
            k0 k0Var5 = this.f5433p;
            k0Var5.h = this.f5434q.j() + k0Var5.h;
            k0 k0Var6 = this.f5433p;
            if (!this.v) {
                i12 = -1;
            }
            k0Var6.f5406e = i12;
            int H2 = z0.H(V0);
            k0 k0Var7 = this.f5433p;
            k0Var6.d = H2 + k0Var7.f5406e;
            k0Var7.f5404b = this.f5434q.d(V0);
            j10 = (-this.f5434q.d(V0)) + this.f5434q.j();
        }
        k0 k0Var8 = this.f5433p;
        k0Var8.f5405c = i10;
        if (z10) {
            k0Var8.f5405c = i10 - j10;
        }
        k0Var8.f5408g = j10;
    }

    @Override
    public a1 n() {
        return new a1(-2, -2);
    }

    @Override
    public void n0(int i9) {
        this.f5441y = i9;
        this.A = Integer.MIN_VALUE;
        l0 l0Var = this.B;
        if (l0Var != null) {
            l0Var.f5419a = -1;
        }
        l0();
    }

    public final void n1(int i9, int i10) {
        int i11;
        this.f5433p.f5405c = this.f5434q.f() - i10;
        k0 k0Var = this.f5433p;
        if (this.v) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        k0Var.f5406e = i11;
        k0Var.d = i9;
        k0Var.f5407f = 1;
        k0Var.f5404b = i10;
        k0Var.f5408g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i9, g1 g1Var, n1 n1Var) {
        if (this.f5432o == 0) {
            return 0;
        }
        return g1(i9, g1Var, n1Var);
    }

    public final void o1(int i9, int i10) {
        int i11;
        this.f5433p.f5405c = i10 - this.f5434q.j();
        k0 k0Var = this.f5433p;
        k0Var.d = i9;
        if (this.v) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        k0Var.f5406e = i11;
        k0Var.f5407f = -1;
        k0Var.f5404b = i10;
        k0Var.f5408g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, n1 n1Var, int i9) {
        n0 n0Var = new n0(recyclerView.getContext());
        n0Var.f5443a = i9;
        w0(n0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f5436s == this.f5439w) {
            return true;
        }
        return false;
    }

    public void z0(n1 n1Var, int[] iArr) {
        int i9;
        int W0 = W0(n1Var);
        if (this.f5433p.f5407f == -1) {
            i9 = 0;
        } else {
            i9 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i9;
    }

    public m0(int i9, boolean z10) {
        this.f5432o = 1;
        this.f5435r = false;
        this.f5437t = false;
        this.f5438u = false;
        this.v = false;
        this.f5439w = false;
        this.f5440x = true;
        this.f5441y = -1;
        this.f5442z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        i0 i0Var = new i0();
        i0Var.f();
        this.C = i0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i9);
        k1(z10);
    }

    public void a1(g1 g1Var, n1 n1Var, i0 i0Var, int i9) {
    }
}
