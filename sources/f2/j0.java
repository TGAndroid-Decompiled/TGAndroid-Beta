package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class j0 extends w0 {
    public int A;
    public i0 B;
    public final f0 C;
    public final g0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f6362o;
    public h0 f6363p;
    public androidx.emoji2.text.g f6364q;
    public boolean f6365r;
    public boolean f6366s;
    public boolean f6367t;
    public boolean f6368u;
    public boolean v;
    public boolean f6369w;
    public final boolean f6370x;
    public int f6371y;
    public boolean f6372z;

    public j0() {
        this(1, false);
    }

    public void A0(k1 k1Var, h0 h0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = h0Var.d;
        if (i10 >= 0 && i10 < k1Var.b()) {
            iVar.a(i10, Math.max(0, h0Var.f6338g));
        }
    }

    public final int B0(k1 k1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f6364q;
            boolean z10 = this.f6370x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && k1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(k1 k1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f6364q;
            boolean z10 = this.f6370x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && k1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((x0) K0.getLayoutParams()).b(), ((x0) J0.getLayoutParams()).b());
                int max2 = Math.max(((x0) K0.getLayoutParams()).b(), ((x0) J0.getLayoutParams()).b());
                if (z12) {
                    max = Math.max(0, (k1Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z10) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(k1 k1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f6364q;
            boolean z10 = this.f6370x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            if (r() != 0 && k1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z10) {
                    return k1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1)) * k1Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < w0.H(q(0))) {
            z10 = true;
        }
        if (z10 != this.v) {
            i11 = -1;
        }
        if (this.f6362o == 0) {
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
                            if (i10 == 130 && this.f6362o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f6362o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f6362o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f6362o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f6362o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f6362o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f6363p == null) {
            ?? obj = new Object();
            obj.f6333a = true;
            obj.h = 0;
            obj.f6339i = 0;
            obj.f6341k = null;
            this.f6363p = obj;
        }
    }

    public final int H0(d1 d1Var, h0 h0Var, k1 k1Var, boolean z10) {
        int i10 = h0Var.f6335c;
        int i11 = h0Var.f6338g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                h0Var.f6338g = i11 + i10;
            }
            c1(d1Var, h0Var);
        }
        int i12 = h0Var.f6335c + h0Var.h;
        while (true) {
            if ((!h0Var.f6342l && i12 <= 0) || !h0Var.b(k1Var)) {
                break;
            }
            g0 g0Var = this.D;
            g0Var.f6324a = 0;
            g0Var.f6325b = false;
            g0Var.f6326c = false;
            g0Var.d = false;
            Z0(d1Var, k1Var, h0Var, g0Var);
            if (!g0Var.f6325b) {
                int i13 = h0Var.f6334b;
                int i14 = g0Var.f6324a;
                h0Var.f6334b = (h0Var.f6337f * i14) + i13;
                if (!g0Var.f6326c || h0Var.f6341k != null || !k1Var.f6397g) {
                    h0Var.f6335c -= i14;
                    i12 -= i14;
                }
                int i15 = h0Var.f6338g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    h0Var.f6338g = i16;
                    int i17 = h0Var.f6335c;
                    if (i17 < 0) {
                        h0Var.f6338g = i16 + i17;
                    }
                    c1(d1Var, h0Var);
                }
                if (z10 && g0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - h0Var.f6335c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
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
            if (this.f6364q.d(q(i10)) < this.f6364q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f6362o == 0) {
                return this.f6498c.F(i10, i11, i12, i13);
            }
            return this.d.F(i10, i11, i12, i13);
        }
        return q(i10);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        G0();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.f6362o == 0) {
            return this.f6498c.F(i10, i11, i12, i13);
        }
        return this.d.F(i10, i11, i12, i13);
    }

    public View Q0(d1 d1Var, k1 k1Var, int i10, int i11, int i12) {
        int j10;
        int i13;
        G0();
        if (this.f6365r) {
            j10 = 0;
        } else {
            j10 = this.f6364q.j();
        }
        int f9 = this.f6364q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = w0.H(q6);
            if (H >= 0 && H < i12) {
                if (((x0) q6.getLayoutParams()).f6508a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else if (this.f6364q.d(q6) < f9 && this.f6364q.a(q6) >= j10) {
                    return q6;
                } else {
                    if (view == null) {
                        view = q6;
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
    public View R(View view, int i10, d1 d1Var, k1 k1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f6364q.k() * 0.33333334f), false, k1Var);
            h0 h0Var = this.f6363p;
            h0Var.f6338g = Integer.MIN_VALUE;
            h0Var.f6333a = false;
            H0(d1Var, h0Var, k1Var, true);
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

    public final int S0(int i10, d1 d1Var, k1 k1Var, boolean z10) {
        int f9;
        int f10;
        if (this.G && this.H && (f9 = this.f6364q.f() - i10) > 0) {
            int i11 = -g1(-f9, d1Var, k1Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = this.f6364q.f() - i12) > 0) {
                this.f6364q.n(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, d1 d1Var, k1 k1Var, boolean z10) {
        int X0;
        int j10;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, d1Var, k1Var);
            int i12 = i10 + i11;
            if (z10 && (j10 = i12 - this.f6364q.j()) > 0) {
                this.f6364q.n(-j10);
                return i11 - j10;
            }
            return i11;
        }
        return 0;
    }

    public final View U0() {
        int r6;
        if (this.v) {
            r6 = 0;
        } else {
            r6 = r() - 1;
        }
        return q(r6);
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

    public int W0(k1 k1Var) {
        if (k1Var.f6392a != -1) {
            return this.f6364q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f6364q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f6497b;
        WeakHashMap weakHashMap = r0.j0.f46829a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(d1 d1Var, k1 k1Var, h0 h0Var, g0 g0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View c3 = h0Var.c(d1Var);
        if (c3 == null) {
            g0Var.f6325b = true;
            return;
        }
        x0 x0Var = (x0) c3.getLayoutParams();
        if (h0Var.f6341k == null) {
            boolean z12 = this.v;
            if (h0Var.f6337f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                a(c3, -1, false);
            } else {
                a(c3, 0, false);
            }
        } else {
            boolean z13 = this.v;
            if (h0Var.f6337f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                a(c3, -1, true);
            } else {
                a(c3, 0, true);
            }
        }
        P(c3);
        g0Var.f6324a = this.f6364q.b(c3);
        if (this.f6362o == 1) {
            if (Y0()) {
                i13 = this.f6506m - E();
                i10 = i13 - this.f6364q.c(c3);
            } else {
                i10 = D();
                i13 = this.f6364q.c(c3) + i10;
            }
            if (h0Var.f6337f == -1) {
                i11 = h0Var.f6334b;
                i12 = i11 - g0Var.f6324a;
            } else {
                i12 = h0Var.f6334b;
                i11 = g0Var.f6324a + i12;
            }
        } else {
            int F = F();
            int c6 = this.f6364q.c(c3) + F;
            if (h0Var.f6337f == -1) {
                int i14 = h0Var.f6334b;
                int i15 = i14 - g0Var.f6324a;
                i13 = i14;
                i11 = c6;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = h0Var.f6334b;
                int i17 = g0Var.f6324a + i16;
                i10 = i16;
                i11 = c6;
                i12 = F;
                i13 = i17;
            }
        }
        w0.O(c3, i10, i12, i13, i11);
        if (x0Var.f6508a.j() || x0Var.f6508a.m()) {
            g0Var.f6326c = true;
        }
        g0Var.d = c3.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f6497b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(f2.d1 r18, f2.k1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: f2.j0.b0(f2.d1, f2.k1):void");
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
                h1(H2, this.f6364q.f() - (this.f6364q.b(view) + this.f6364q.d(view2)));
                return;
            }
            h1(H2, this.f6364q.f() - this.f6364q.a(view2));
        } else if (c3 == 65535) {
            h1(H2, this.f6364q.d(view2));
        } else {
            h1(H2, this.f6364q.a(view2) - this.f6364q.b(view));
        }
    }

    @Override
    public void c0(k1 k1Var) {
        this.B = null;
        this.f6371y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.f();
    }

    public final void c1(d1 d1Var, h0 h0Var) {
        n1 T;
        n1 T2;
        if (h0Var.f6333a && !h0Var.f6342l) {
            int i10 = h0Var.f6338g;
            int i11 = h0Var.f6339i;
            if (h0Var.f6337f == -1) {
                int r6 = r();
                if (i10 >= 0) {
                    int e10 = (this.f6364q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r6; i12++) {
                            View q6 = q(i12);
                            if (q6 != null && (T2 = this.f6497b.T(q6)) != null && !T2.r() && (this.f6364q.d(q6) < e10 || this.f6364q.m(q6) < e10)) {
                                d1(d1Var, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r6 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q9 = q(i14);
                        if (q9 != null && (T = this.f6497b.T(q9)) != null && !T.r() && (this.f6364q.d(q9) < e10 || this.f6364q.m(q9) < e10)) {
                            d1(d1Var, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(d1Var, i10, i11);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f6368u && this.f6362o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(d1 d1Var, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    i0(i12, d1Var);
                }
                return;
            }
            while (i10 > i11) {
                i0(i10, d1Var);
                i10--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f6368u && this.f6362o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final i0 e0() {
        i0 i0Var = this.B;
        if (i0Var != null) {
            ?? obj = new Object();
            obj.f6348a = i0Var.f6348a;
            obj.f6349b = i0Var.f6349b;
            obj.f6350c = i0Var.f6350c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z10 = this.f6366s ^ this.v;
            obj2.f6350c = z10;
            if (z10) {
                View U0 = U0();
                obj2.f6349b = this.f6364q.f() - this.f6364q.a(U0);
                obj2.f6348a = ((x0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f6348a = w0.H(V0);
            obj2.f6349b = this.f6364q.d(V0) - this.f6364q.j();
            return obj2;
        }
        obj2.f6348a = -1;
        return obj2;
    }

    public void e1(d1 d1Var, int i10, int i11) {
        n1 T;
        n1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r6 = r();
            if (this.v) {
                int i13 = r6 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q6 = q(i14);
                    if (q6 != null && (T2 = this.f6497b.T(q6)) != null && !T2.r() && (this.f6364q.a(q6) > i12 || this.f6364q.l(q6) > i12)) {
                        d1(d1Var, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r6; i15++) {
                View q9 = q(i15);
                if (q9 != null && (T = this.f6497b.T(q9)) != null && !T.r() && (this.f6364q.a(q9) > i12 || this.f6364q.l(q9) > i12)) {
                    d1(d1Var, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f6362o != 1 && Y0()) {
            this.v = !this.f6367t;
        } else {
            this.v = this.f6367t;
        }
    }

    public final int g1(int i10, d1 d1Var, k1 k1Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f6363p.f6333a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, k1Var);
        h0 h0Var = this.f6363p;
        int H0 = H0(d1Var, h0Var, k1Var, false) + h0Var.f6338g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f6364q.n(-i10);
        this.f6363p.f6340j = i10;
        return i10;
    }

    @Override
    public int h(k1 k1Var) {
        return C0(k1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(k1 k1Var) {
        return D0(k1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.f6371y == i10 && this.A == i11 && this.f6372z == z10) {
            return;
        }
        this.f6371y = i10;
        this.A = i11;
        this.f6372z = z10;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.f6348a = -1;
        }
        l0();
    }

    @Override
    public int j(k1 k1Var) {
        return B0(k1Var);
    }

    public final void j1(int i10) {
        m0 m0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(j7.l1.k(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f6362o && this.f6364q != null) {
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
        this.f6364q = m0Var;
        this.C.f6317f = m0Var;
        this.f6362o = i10;
        l0();
    }

    @Override
    public int k(k1 k1Var) {
        return C0(k1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.f6367t) {
            return;
        }
        this.f6367t = z10;
        l0();
    }

    @Override
    public int l(k1 k1Var) {
        return D0(k1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.f6369w == z10) {
            return;
        }
        this.f6369w = z10;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r6 = r();
        if (r6 != 0) {
            int H = i10 - w0.H(q(0));
            if (H >= 0 && H < r6) {
                View q6 = q(H);
                if (w0.H(q6) == i10) {
                    return q6;
                }
            }
            int r9 = r();
            for (int i11 = 0; i11 < r9; i11++) {
                View q9 = q(i11);
                n1 U = RecyclerView.U(q9);
                if (U != null && U.c() == i10 && !U.r() && (this.f6497b.f1847p0.f6397g || !U.j())) {
                    return q9;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, d1 d1Var, k1 k1Var) {
        if (this.f6362o == 1) {
            return 0;
        }
        return g1(i10, d1Var, k1Var);
    }

    public final void m1(int i10, int i11, boolean z10, k1 k1Var) {
        boolean z11;
        int i12;
        int j10;
        h0 h0Var = this.f6363p;
        boolean z12 = false;
        int i13 = 1;
        if (this.f6364q.h() == 0 && this.f6364q.e() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0Var.f6342l = z11;
        this.f6363p.f6337f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(k1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z12 = true;
        }
        h0 h0Var2 = this.f6363p;
        if (z12) {
            i12 = max2;
        } else {
            i12 = max;
        }
        h0Var2.h = i12;
        if (!z12) {
            max = max2;
        }
        h0Var2.f6339i = max;
        if (z12) {
            h0Var2.h = this.f6364q.g() + i12;
            View U0 = U0();
            h0 h0Var3 = this.f6363p;
            if (this.v) {
                i13 = -1;
            }
            h0Var3.f6336e = i13;
            int H = w0.H(U0);
            h0 h0Var4 = this.f6363p;
            h0Var3.d = H + h0Var4.f6336e;
            h0Var4.f6334b = this.f6364q.a(U0);
            j10 = this.f6364q.a(U0) - this.f6364q.f();
        } else {
            View V0 = V0();
            h0 h0Var5 = this.f6363p;
            h0Var5.h = this.f6364q.j() + h0Var5.h;
            h0 h0Var6 = this.f6363p;
            if (!this.v) {
                i13 = -1;
            }
            h0Var6.f6336e = i13;
            int H2 = w0.H(V0);
            h0 h0Var7 = this.f6363p;
            h0Var6.d = H2 + h0Var7.f6336e;
            h0Var7.f6334b = this.f6364q.d(V0);
            j10 = (-this.f6364q.d(V0)) + this.f6364q.j();
        }
        h0 h0Var8 = this.f6363p;
        h0Var8.f6335c = i11;
        if (z10) {
            h0Var8.f6335c = i11 - j10;
        }
        h0Var8.f6338g = j10;
    }

    @Override
    public x0 n() {
        return new x0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f6371y = i10;
        this.A = Integer.MIN_VALUE;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.f6348a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f6363p.f6335c = this.f6364q.f() - i11;
        h0 h0Var = this.f6363p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        h0Var.f6336e = i12;
        h0Var.d = i10;
        h0Var.f6337f = 1;
        h0Var.f6334b = i11;
        h0Var.f6338g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, d1 d1Var, k1 k1Var) {
        if (this.f6362o == 0) {
            return 0;
        }
        return g1(i10, d1Var, k1Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f6363p.f6335c = i11 - this.f6364q.j();
        h0 h0Var = this.f6363p;
        h0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        h0Var.f6336e = i12;
        h0Var.f6337f = -1;
        h0Var.f6334b = i11;
        h0Var.f6338g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, k1 k1Var, int i10) {
        k0 k0Var = new k0(recyclerView.getContext());
        k0Var.f6373a = i10;
        w0(k0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f6366s == this.f6369w) {
            return true;
        }
        return false;
    }

    public void z0(k1 k1Var, int[] iArr) {
        int i10;
        int W0 = W0(k1Var);
        if (this.f6363p.f6337f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public j0(int i10, boolean z10) {
        this.f6362o = 1;
        this.f6365r = false;
        this.f6367t = false;
        this.f6368u = false;
        this.v = false;
        this.f6369w = false;
        this.f6370x = true;
        this.f6371y = -1;
        this.f6372z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        f0 f0Var = new f0();
        f0Var.f();
        this.C = f0Var;
        this.D = new Object();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(d1 d1Var, k1 k1Var, f0 f0Var, int i10) {
    }
}
