package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
public class i0 extends v0 {
    public int A;
    public h0 B;
    public final b4.v C;
    public final f0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int f5720o;
    public g0 f5721p;
    public androidx.emoji2.text.g f5722q;
    public boolean f5723r;
    public boolean f5724s;
    public boolean f5725t;
    public boolean f5726u;
    public boolean v;
    public boolean f5727w;
    public final boolean f5728x;
    public int f5729y;
    public boolean f5730z;

    public i0() {
        this(1, false);
    }

    public void A0(i1 i1Var, g0 g0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = g0Var.d;
        if (i10 >= 0 && i10 < i1Var.b()) {
            iVar.a(i10, Math.max(0, g0Var.f5695g));
        }
    }

    public final int B0(i1 i1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5722q;
            boolean z4 = this.f5728x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            if (r() != 0 && i1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z4) {
                    return Math.abs(((w0) K0.getLayoutParams()).b() - ((w0) J0.getLayoutParams()).b()) + 1;
                }
                return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
            }
            return 0;
        }
        return 0;
    }

    public final int C0(i1 i1Var) {
        int max;
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5722q;
            boolean z4 = this.f5728x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            boolean z11 = this.v;
            if (r() != 0 && i1Var.b() != 0 && K0 != null && J0 != null) {
                int min = Math.min(((w0) K0.getLayoutParams()).b(), ((w0) J0.getLayoutParams()).b());
                int max2 = Math.max(((w0) K0.getLayoutParams()).b(), ((w0) J0.getLayoutParams()).b());
                if (z11) {
                    max = Math.max(0, (i1Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z4) {
                    return max;
                }
                return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((w0) K0.getLayoutParams()).b() - ((w0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
            }
        }
        return 0;
    }

    public final int D0(i1 i1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.f5722q;
            boolean z4 = this.f5728x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            if (r() != 0 && i1Var.b() != 0 && K0 != null && J0 != null) {
                if (!z4) {
                    return i1Var.b();
                }
                return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((w0) K0.getLayoutParams()).b() - ((w0) J0.getLayoutParams()).b()) + 1)) * i1Var.b());
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
        if (i10 < v0.H(q(0))) {
            z4 = true;
        }
        if (z4 != this.v) {
            i11 = -1;
        }
        if (this.f5720o == 0) {
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
                            if (i10 == 130 && this.f5720o == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f5720o == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f5720o == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5720o == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5720o != 1 && Y0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f5720o == 1 || !Y0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final void G0() {
        if (this.f5721p == null) {
            ?? obj = new Object();
            obj.f5691a = true;
            obj.h = 0;
            obj.f5696i = 0;
            obj.f5698k = null;
            this.f5721p = obj;
        }
    }

    public final int H0(af.h hVar, g0 g0Var, i1 i1Var, boolean z4) {
        int i10 = g0Var.f5693c;
        int i11 = g0Var.f5695g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                g0Var.f5695g = i11 + i10;
            }
            c1(hVar, g0Var);
        }
        int i12 = g0Var.f5693c + g0Var.h;
        while (true) {
            if ((!g0Var.f5699l && i12 <= 0) || !g0Var.b(i1Var)) {
                break;
            }
            f0 f0Var = this.D;
            f0Var.f5684a = 0;
            f0Var.f5685b = false;
            f0Var.f5686c = false;
            f0Var.d = false;
            Z0(hVar, i1Var, g0Var, f0Var);
            if (!f0Var.f5685b) {
                int i13 = g0Var.f5692b;
                int i14 = f0Var.f5684a;
                g0Var.f5692b = (g0Var.f5694f * i14) + i13;
                if (!f0Var.f5686c || g0Var.f5698k != null || !i1Var.f5735g) {
                    g0Var.f5693c -= i14;
                    i12 -= i14;
                }
                int i15 = g0Var.f5695g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    g0Var.f5695g = i16;
                    int i17 = g0Var.f5693c;
                    if (i17 < 0) {
                        g0Var.f5695g = i16 + i17;
                    }
                    c1(hVar, g0Var);
                }
                if (z4 && f0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - g0Var.f5693c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
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
        return ((w0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 > i10 || i11 < i10) {
            if (this.f5722q.d(q(i10)) < this.f5722q.j()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f5720o == 0) {
                return this.f5838c.M(i10, i11, i12, i13);
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
        if (this.f5720o == 0) {
            return this.f5838c.M(i10, i11, i12, i13);
        }
        return this.d.M(i10, i11, i12, i13);
    }

    public View Q0(af.h hVar, i1 i1Var, int i10, int i11, int i12) {
        int j10;
        int i13;
        G0();
        if (this.f5723r) {
            j10 = 0;
        } else {
            j10 = this.f5722q.j();
        }
        int f10 = this.f5722q.f();
        if (i11 > i10) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q10 = q(i10);
            int H = v0.H(q10);
            if (H >= 0 && H < i12) {
                if (((w0) q10.getLayoutParams()).f5847a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else if (this.f5722q.d(q10) < f10 && this.f5722q.a(q10) >= j10) {
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
    public View R(View view, int i10, af.h hVar, i1 i1Var) {
        int F0;
        View O0;
        View U0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.f5722q.k() * 0.33333334f), false, i1Var);
            g0 g0Var = this.f5721p;
            g0Var.f5695g = Integer.MIN_VALUE;
            g0Var.f5691a = false;
            H0(hVar, g0Var, i1Var, true);
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

    public final int S0(int i10, af.h hVar, i1 i1Var, boolean z4) {
        int f10;
        int f11;
        if (this.G && this.H && (f10 = this.f5722q.f() - i10) > 0) {
            int i11 = -g1(-f10, hVar, i1Var);
            int i12 = i10 + i11;
            if (z4 && (f11 = this.f5722q.f() - i12) > 0) {
                this.f5722q.n(f11);
                return f11 + i11;
            }
            return i11;
        }
        return 0;
    }

    public final int T0(int i10, af.h hVar, i1 i1Var, boolean z4) {
        int X0;
        int j10;
        if (this.G && (X0 = i10 - X0()) > 0) {
            int i11 = -g1(X0, hVar, i1Var);
            int i12 = i10 + i11;
            if (z4 && (j10 = i12 - this.f5722q.j()) > 0) {
                this.f5722q.n(-j10);
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

    public int W0(i1 i1Var) {
        if (i1Var.f5731a != -1) {
            return this.f5722q.k();
        }
        return 0;
    }

    public int X0() {
        return this.f5722q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.f5837b;
        WeakHashMap weakHashMap = r0.j0.f43142a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Z0(af.h hVar, i1 i1Var, g0 g0Var, f0 f0Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        View c3 = g0Var.c(hVar);
        if (c3 == null) {
            f0Var.f5685b = true;
            return;
        }
        w0 w0Var = (w0) c3.getLayoutParams();
        if (g0Var.f5698k == null) {
            boolean z11 = this.v;
            if (g0Var.f5694f == -1) {
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
            if (g0Var.f5694f == -1) {
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
        f0Var.f5684a = this.f5722q.b(c3);
        if (this.f5720o == 1) {
            if (Y0()) {
                i13 = this.f5845m - E();
                i10 = i13 - this.f5722q.c(c3);
            } else {
                i10 = D();
                i13 = this.f5722q.c(c3) + i10;
            }
            if (g0Var.f5694f == -1) {
                i11 = g0Var.f5692b;
                i12 = i11 - f0Var.f5684a;
            } else {
                i12 = g0Var.f5692b;
                i11 = f0Var.f5684a + i12;
            }
        } else {
            int F = F();
            int c10 = this.f5722q.c(c3) + F;
            if (g0Var.f5694f == -1) {
                int i14 = g0Var.f5692b;
                int i15 = i14 - f0Var.f5684a;
                i13 = i14;
                i11 = c10;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = g0Var.f5692b;
                int i17 = f0Var.f5684a + i16;
                i10 = i16;
                i11 = c10;
                i12 = F;
                i13 = i17;
            }
        }
        v0.O(c3, i10, i12, i13, i11);
        if (w0Var.f5847a.j() || w0Var.f5847a.m()) {
            f0Var.f5686c = true;
        }
        f0Var.d = c3.hasFocusable();
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f5837b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(af.h r18, f2.i1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: f2.i0.b0(af.h, f2.i1):void");
    }

    public void b1(View view, View view2, int i10, int i11) {
        char c3;
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = v0.H(view);
        int H2 = v0.H(view2);
        if (H < H2) {
            c3 = 1;
        } else {
            c3 = 65535;
        }
        if (this.v) {
            if (c3 == 1) {
                h1(H2, this.f5722q.f() - (this.f5722q.b(view) + this.f5722q.d(view2)));
                return;
            }
            h1(H2, this.f5722q.f() - this.f5722q.a(view2));
        } else if (c3 == 65535) {
            h1(H2, this.f5722q.d(view2));
        } else {
            h1(H2, this.f5722q.a(view2) - this.f5722q.b(view));
        }
    }

    @Override
    public void c0(i1 i1Var) {
        this.B = null;
        this.f5729y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.f();
    }

    public final void c1(af.h hVar, g0 g0Var) {
        l1 T;
        l1 T2;
        if (g0Var.f5691a && !g0Var.f5699l) {
            int i10 = g0Var.f5695g;
            int i11 = g0Var.f5696i;
            if (g0Var.f5694f == -1) {
                int r10 = r();
                if (i10 >= 0) {
                    int e = (this.f5722q.e() - i10) + i11;
                    if (this.v) {
                        for (int i12 = 0; i12 < r10; i12++) {
                            View q10 = q(i12);
                            if (q10 != null && (T2 = this.f5837b.T(q10)) != null && !T2.r() && (this.f5722q.d(q10) < e || this.f5722q.m(q10) < e)) {
                                d1(hVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = r10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View q11 = q(i14);
                        if (q11 != null && (T = this.f5837b.T(q11)) != null && !T.r() && (this.f5722q.d(q11) < e || this.f5722q.m(q11) < e)) {
                            d1(hVar, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            e1(hVar, i10, i11);
        }
    }

    @Override
    public final boolean d() {
        if (!this.f5726u && this.f5720o == 0) {
            return true;
        }
        return false;
    }

    public final void d1(af.h hVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    i0(i12, hVar);
                }
                return;
            }
            while (i10 > i11) {
                i0(i10, hVar);
                i10--;
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.f5726u && this.f5720o == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final h0 e0() {
        h0 h0Var = this.B;
        if (h0Var != null) {
            ?? obj = new Object();
            obj.f5709a = h0Var.f5709a;
            obj.f5710b = h0Var.f5710b;
            obj.f5711c = h0Var.f5711c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            G0();
            boolean z4 = this.f5724s ^ this.v;
            obj2.f5711c = z4;
            if (z4) {
                View U0 = U0();
                obj2.f5710b = this.f5722q.f() - this.f5722q.a(U0);
                obj2.f5709a = ((w0) U0.getLayoutParams()).b();
                return obj2;
            }
            View V0 = V0();
            obj2.f5709a = v0.H(V0);
            obj2.f5710b = this.f5722q.d(V0) - this.f5722q.j();
            return obj2;
        }
        obj2.f5709a = -1;
        return obj2;
    }

    public void e1(af.h hVar, int i10, int i11) {
        l1 T;
        l1 T2;
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int r10 = r();
            if (this.v) {
                int i13 = r10 - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View q10 = q(i14);
                    if (q10 != null && (T2 = this.f5837b.T(q10)) != null && !T2.r() && (this.f5722q.a(q10) > i12 || this.f5722q.l(q10) > i12)) {
                        d1(hVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < r10; i15++) {
                View q11 = q(i15);
                if (q11 != null && (T = this.f5837b.T(q11)) != null && !T.r() && (this.f5722q.a(q11) > i12 || this.f5722q.l(q11) > i12)) {
                    d1(hVar, 0, i15);
                    return;
                }
            }
        }
    }

    public final void f1() {
        if (this.f5720o != 1 && Y0()) {
            this.v = !this.f5725t;
        } else {
            this.v = this.f5725t;
        }
    }

    public final int g1(int i10, af.h hVar, i1 i1Var) {
        int i11;
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.f5721p.f5691a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        m1(i11, abs, true, i1Var);
        g0 g0Var = this.f5721p;
        int H0 = H0(hVar, g0Var, i1Var, false) + g0Var.f5695g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.f5722q.n(-i10);
        this.f5721p.f5697j = i10;
        return i10;
    }

    @Override
    public int h(i1 i1Var) {
        return C0(i1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override
    public int i(i1 i1Var) {
        return D0(i1Var);
    }

    public void i1(int i10, int i11, boolean z4) {
        if (this.f5729y == i10 && this.A == i11 && this.f5730z == z4) {
            return;
        }
        this.f5729y = i10;
        this.A = i11;
        this.f5730z = z4;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.f5709a = -1;
        }
        l0();
    }

    @Override
    public int j(i1 i1Var) {
        return B0(i1Var);
    }

    public final void j1(int i10) {
        l0 l0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(kf.k0.j(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 == this.f5720o && this.f5722q != null) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                l0Var = new l0(this, 1);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            l0Var = new l0(this, 0);
        }
        this.f5722q = l0Var;
        this.C.f1541f = l0Var;
        this.f5720o = i10;
        l0();
    }

    @Override
    public int k(i1 i1Var) {
        return C0(i1Var);
    }

    public void k1(boolean z4) {
        b(null);
        if (z4 == this.f5725t) {
            return;
        }
        this.f5725t = z4;
        l0();
    }

    @Override
    public int l(i1 i1Var) {
        return D0(i1Var);
    }

    public void l1(boolean z4) {
        b(null);
        if (this.f5727w == z4) {
            return;
        }
        this.f5727w = z4;
        l0();
    }

    @Override
    public final View m(int i10) {
        int r10 = r();
        if (r10 != 0) {
            int H = i10 - v0.H(q(0));
            if (H >= 0 && H < r10) {
                View q10 = q(H);
                if (v0.H(q10) == i10) {
                    return q10;
                }
            }
            int r11 = r();
            for (int i11 = 0; i11 < r11; i11++) {
                View q11 = q(i11);
                l1 U = RecyclerView.U(q11);
                if (U != null && U.c() == i10 && !U.r() && (this.f5837b.f1251q0.f5735g || !U.j())) {
                    return q11;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public int m0(int i10, af.h hVar, i1 i1Var) {
        if (this.f5720o == 1) {
            return 0;
        }
        return g1(i10, hVar, i1Var);
    }

    public final void m1(int i10, int i11, boolean z4, i1 i1Var) {
        boolean z10;
        int i12;
        int j10;
        g0 g0Var = this.f5721p;
        boolean z11 = false;
        int i13 = 1;
        if (this.f5722q.h() == 0 && this.f5722q.e() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f5699l = z10;
        this.f5721p.f5694f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(i1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z11 = true;
        }
        g0 g0Var2 = this.f5721p;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        g0Var2.h = i12;
        if (!z11) {
            max = max2;
        }
        g0Var2.f5696i = max;
        if (z11) {
            g0Var2.h = this.f5722q.g() + i12;
            View U0 = U0();
            g0 g0Var3 = this.f5721p;
            if (this.v) {
                i13 = -1;
            }
            g0Var3.e = i13;
            int H = v0.H(U0);
            g0 g0Var4 = this.f5721p;
            g0Var3.d = H + g0Var4.e;
            g0Var4.f5692b = this.f5722q.a(U0);
            j10 = this.f5722q.a(U0) - this.f5722q.f();
        } else {
            View V0 = V0();
            g0 g0Var5 = this.f5721p;
            g0Var5.h = this.f5722q.j() + g0Var5.h;
            g0 g0Var6 = this.f5721p;
            if (!this.v) {
                i13 = -1;
            }
            g0Var6.e = i13;
            int H2 = v0.H(V0);
            g0 g0Var7 = this.f5721p;
            g0Var6.d = H2 + g0Var7.e;
            g0Var7.f5692b = this.f5722q.d(V0);
            j10 = (-this.f5722q.d(V0)) + this.f5722q.j();
        }
        g0 g0Var8 = this.f5721p;
        g0Var8.f5693c = i11;
        if (z4) {
            g0Var8.f5693c = i11 - j10;
        }
        g0Var8.f5695g = j10;
    }

    @Override
    public w0 n() {
        return new w0(-2, -2);
    }

    @Override
    public void n0(int i10) {
        this.f5729y = i10;
        this.A = Integer.MIN_VALUE;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.f5709a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        int i12;
        this.f5721p.f5693c = this.f5722q.f() - i11;
        g0 g0Var = this.f5721p;
        if (this.v) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        g0Var.e = i12;
        g0Var.d = i10;
        g0Var.f5694f = 1;
        g0Var.f5692b = i11;
        g0Var.f5695g = Integer.MIN_VALUE;
    }

    @Override
    public int o0(int i10, af.h hVar, i1 i1Var) {
        if (this.f5720o == 0) {
            return 0;
        }
        return g1(i10, hVar, i1Var);
    }

    public final void o1(int i10, int i11) {
        int i12;
        this.f5721p.f5693c = i11 - this.f5722q.j();
        g0 g0Var = this.f5721p;
        g0Var.d = i10;
        if (this.v) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        g0Var.e = i12;
        g0Var.f5694f = -1;
        g0Var.f5692b = i11;
        g0Var.f5695g = Integer.MIN_VALUE;
    }

    @Override
    public void v0(RecyclerView recyclerView, i1 i1Var, int i10) {
        j0 j0Var = new j0(recyclerView.getContext());
        j0Var.f5712a = i10;
        w0(j0Var);
    }

    @Override
    public boolean y0() {
        if (this.B == null && this.f5724s == this.f5727w) {
            return true;
        }
        return false;
    }

    public void z0(i1 i1Var, int[] iArr) {
        int i10;
        int W0 = W0(i1Var);
        if (this.f5721p.f5694f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public i0(int i10, boolean z4) {
        this.f5720o = 1;
        this.f5723r = false;
        this.f5725t = false;
        this.f5726u = false;
        this.v = false;
        this.f5727w = false;
        this.f5728x = true;
        this.f5729y = -1;
        this.f5730z = true;
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

    public void a1(af.h hVar, i1 i1Var, b4.v vVar, int i10) {
    }
}
