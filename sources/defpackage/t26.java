package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
public class t26 extends d49 {
    public int A;
    public s26 B;
    public final p26 C;
    public final q26 D;
    public byte E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public boolean o;
    public r26 p;
    public cr2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public t26(int i, boolean z) {
        this.o = true;
        this.r = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = true;
        this.y = -1;
        this.z = true;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        ?? obj = new Object();
        obj.c();
        this.C = obj;
        this.D = new Object();
        this.E = (byte) 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        i1(i);
        j1(z);
    }

    public final int A0(p49 p49Var) {
        if (r() != 0) {
            F0();
            cr2 cr2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            if (r() != 0 && p49Var.b() != 0 && J0 != null && I0 != null) {
                if (!z) {
                    return Math.abs(((e49) J0.getLayoutParams()).b() - ((e49) I0.getLayoutParams()).b()) + 1;
                }
                return Math.min(cr2Var.k(), cr2Var.a(I0) - cr2Var.d(J0));
            }
            return 0;
        }
        return 0;
    }

    public final int B0(p49 p49Var) {
        int max;
        if (r() != 0) {
            F0();
            cr2 cr2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            boolean z3 = this.v;
            if (r() != 0 && p49Var.b() != 0 && J0 != null && I0 != null) {
                int min = Math.min(((e49) J0.getLayoutParams()).b(), ((e49) I0.getLayoutParams()).b());
                int max2 = Math.max(((e49) J0.getLayoutParams()).b(), ((e49) I0.getLayoutParams()).b());
                if (z3) {
                    max = Math.max(0, (p49Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z) {
                    return max;
                }
                return Math.round((max * (Math.abs(cr2Var.a(I0) - cr2Var.d(J0)) / (Math.abs(((e49) J0.getLayoutParams()).b() - ((e49) I0.getLayoutParams()).b()) + 1))) + (cr2Var.j() - cr2Var.d(J0)));
            }
        }
        return 0;
    }

    public final int C0(p49 p49Var) {
        if (r() != 0) {
            F0();
            cr2 cr2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            if (r() != 0 && p49Var.b() != 0 && J0 != null && I0 != null) {
                if (!z) {
                    return p49Var.b();
                }
                return (int) (((cr2Var.a(I0) - cr2Var.d(J0)) / (Math.abs(((e49) J0.getLayoutParams()).b() - ((e49) I0.getLayoutParams()).b()) + 1)) * p49Var.b());
            }
            return 0;
        }
        return 0;
    }

    public final PointF D0(int i) {
        if (r() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < d49.G(q(0))) {
            z = true;
        }
        if (z != this.v) {
            i2 = -1;
        }
        if (!this.o) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    public final int E0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130 || !this.o) {
                                return Integer.MIN_VALUE;
                            }
                        } else if (this.o) {
                            return Integer.MIN_VALUE;
                        }
                    } else if (!this.o) {
                        return Integer.MIN_VALUE;
                    } else {
                        return -1;
                    }
                } else if (this.o) {
                    return Integer.MIN_VALUE;
                } else {
                    return -1;
                }
            } else if (!this.o && X0()) {
                return -1;
            }
        } else if (this.o || !X0()) {
            return -1;
        }
        return 1;
    }

    public final void F0() {
        if (this.p == null) {
            ?? obj = new Object();
            obj.a = true;
            obj.h = 0;
            obj.i = 0;
            obj.k = null;
            this.p = obj;
        }
    }

    public final int G0(wg2 wg2Var, r26 r26Var, p49 p49Var, boolean z) {
        int i = r26Var.c;
        int i2 = r26Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                r26Var.g = i2 + i;
            }
            b1(wg2Var, r26Var);
        }
        int i3 = r26Var.c + r26Var.h;
        while (true) {
            if ((!r26Var.l && i3 <= 0) || !r26Var.b(p49Var)) {
                break;
            }
            q26 q26Var = this.D;
            q26Var.a = 0;
            q26Var.b = false;
            q26Var.c = false;
            q26Var.d = false;
            Y0(wg2Var, p49Var, r26Var, q26Var);
            if (!q26Var.b) {
                int i4 = r26Var.b;
                int i5 = q26Var.a;
                r26Var.b = (r26Var.f * i5) + i4;
                if (!q26Var.c || r26Var.k != null || !p49Var.g) {
                    r26Var.c -= i5;
                    i3 -= i5;
                }
                int i6 = r26Var.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    r26Var.g = i7;
                    int i8 = r26Var.c;
                    if (i8 < 0) {
                        r26Var.g = i7 + i8;
                    }
                    b1(wg2Var, r26Var);
                }
                if (z && q26Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - r26Var.c;
    }

    public final int H0() {
        View O0 = O0(0, r(), true, false);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final View I0(boolean z) {
        if (this.v) {
            return O0(0, r(), z, true);
        }
        return O0(r() - 1, -1, z, true);
    }

    public final View J0(boolean z) {
        if (this.v) {
            return O0(r() - 1, -1, z, true);
        }
        return O0(0, r(), z, true);
    }

    public final int K0() {
        View O0 = O0(0, r(), false, true);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final int L0() {
        View O0 = O0(r() - 1, -1, true, false);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final int M0() {
        View O0 = O0(r() - 1, -1, false, true);
        if (O0 == null) {
            return -1;
        }
        return ((e49) O0.getLayoutParams()).b();
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        F0();
        if (i2 > i || i2 < i) {
            if (this.q.d(q(i)) < this.q.j()) {
                i3 = 16644;
                i4 = 16388;
            } else {
                i3 = 4161;
                i4 = 4097;
            }
            if (!this.o) {
                return this.c.r(i, i2, i3, i4);
            }
            return this.d.r(i, i2, i3, i4);
        }
        return q(i);
    }

    public final View O0(int i, int i2, boolean z, boolean z2) {
        int i3;
        F0();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (!this.o) {
            return this.c.r(i, i2, i3, i4);
        }
        return this.d.r(i, i2, i3, i4);
    }

    public View P0(wg2 wg2Var, p49 p49Var, int i, int i2, int i3) {
        int j;
        int i4;
        F0();
        if (this.r) {
            j = 0;
        } else {
            j = this.q.j();
        }
        int f = this.q.f();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View q = q(i);
            int G = d49.G(q);
            if (G >= 0 && G < i3) {
                if (((e49) q.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q;
                    }
                } else if (this.q.d(q) < f && this.q.a(q) >= j) {
                    return q;
                } else {
                    if (view == null) {
                        view = q;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public View Q(View view, int i, wg2 wg2Var, p49 p49Var) {
        int E0;
        View N0;
        View T0;
        e1();
        if (r() != 0 && (E0 = E0(i)) != Integer.MIN_VALUE) {
            F0();
            l1(E0, (int) (this.q.k() * 0.33333334f), false, p49Var);
            r26 r26Var = this.p;
            r26Var.g = Integer.MIN_VALUE;
            r26Var.a = false;
            G0(wg2Var, r26Var, p49Var, true);
            boolean z = this.v;
            if (E0 == -1) {
                if (z) {
                    N0 = N0(r() - 1, -1);
                } else {
                    N0 = N0(0, r());
                }
            } else if (z) {
                N0 = N0(0, r());
            } else {
                N0 = N0(r() - 1, -1);
            }
            if (E0 == -1) {
                T0 = U0();
            } else {
                T0 = T0();
            }
            if (T0.hasFocusable()) {
                if (N0 != null) {
                    return T0;
                }
            } else {
                return N0;
            }
        }
        return null;
    }

    public int Q0() {
        return 0;
    }

    public final int R0(int i, wg2 wg2Var, p49 p49Var, boolean z) {
        int f;
        int f2;
        if (this.G && this.H && (f = this.q.f() - i) > 0) {
            int i2 = -f1(-f, wg2Var, p49Var);
            int i3 = i + i2;
            if (z && (f2 = this.q.f() - i3) > 0) {
                this.q.p(f2);
                return f2 + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int S0(int i, wg2 wg2Var, p49 p49Var, boolean z) {
        int W0;
        int j;
        if (this.G && (W0 = i - W0()) > 0) {
            int i2 = -f1(W0, wg2Var, p49Var);
            int i3 = i + i2;
            if (z && (j = i3 - this.q.j()) > 0) {
                this.q.p(-j);
                return i2 - j;
            }
            return i2;
        }
        return 0;
    }

    public final View T0() {
        int r;
        if (this.v) {
            r = 0;
        } else {
            r = r() - 1;
        }
        return q(r);
    }

    public final View U0() {
        int i;
        if (this.v) {
            i = r() - 1;
        } else {
            i = 0;
        }
        return q(i);
    }

    public int V0(p49 p49Var) {
        if (p49Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int W0() {
        return this.q.j();
    }

    public boolean X0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = jdc.a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Y0(wg2 wg2Var, p49 p49Var, r26 r26Var, q26 q26Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View c = r26Var.c(wg2Var);
        if (c == null) {
            q26Var.b = true;
            return;
        }
        e49 e49Var = (e49) c.getLayoutParams();
        List list = r26Var.k;
        boolean z3 = this.v;
        int i5 = r26Var.f;
        if (list == null) {
            if (i5 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                a(-1, c, false);
            } else {
                a(0, c, false);
            }
        } else {
            if (i5 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                a(-1, c, true);
            } else {
                a(0, c, true);
            }
        }
        O(c);
        q26Var.a = this.q.b(c);
        if (this.o) {
            if (X0()) {
                i4 = this.m - D();
                i2 = i4 - this.q.c(c);
            } else {
                int C = C();
                i4 = this.q.c(c) + C;
                i2 = C;
            }
            int i6 = r26Var.f;
            i3 = r26Var.b;
            int i7 = q26Var.a;
            if (i6 == -1) {
                int i8 = i3 - i7;
                i = i3;
                i3 = i8;
            } else {
                i = i7 + i3;
            }
        } else {
            int E = E();
            int c2 = this.q.c(c) + E;
            int i9 = r26Var.f;
            int i10 = r26Var.b;
            int i11 = q26Var.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                i4 = i10;
                i3 = E;
                i = c2;
                i2 = i12;
            } else {
                int i13 = i10 + i11;
                i = c2;
                i2 = i10;
                i3 = E;
                i4 = i13;
            }
        }
        d49.N(c, i2, i3, i4, i);
        if (e49Var.a.j() || e49Var.a.m()) {
            q26Var.c = true;
        }
        q26Var.d = c.hasFocusable();
    }

    @Override
    public void a0(defpackage.wg2 r18, defpackage.p49 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t26.a0(wg2, p49):void");
    }

    public void a1(View view, View view2, int i, int i2) {
        boolean z;
        b("Cannot drop a view during a scroll or layout calculation");
        F0();
        e1();
        int G = d49.G(view);
        int G2 = d49.G(view2);
        if (G < G2) {
            z = true;
        } else {
            z = true;
        }
        boolean z2 = this.v;
        cr2 cr2Var = this.q;
        if (z2) {
            if (z) {
                g1(G2, cr2Var.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            }
            g1(G2, cr2Var.f() - this.q.a(view2));
        } else if (z) {
            g1(G2, cr2Var.d(view2));
        } else {
            g1(G2, cr2Var.a(view2) - this.q.b(view));
        }
    }

    @Override
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.b) != null) {
            recyclerView.l(str);
        }
    }

    @Override
    public void b0(p49 p49Var) {
        this.B = null;
        this.y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.c();
    }

    public final void b1(wg2 wg2Var, r26 r26Var) {
        s49 T;
        s49 T2;
        if (r26Var.a && !r26Var.l) {
            int i = r26Var.g;
            int i2 = r26Var.i;
            if (r26Var.f == -1) {
                int r = r();
                if (i >= 0) {
                    int e = (this.q.e() - i) + i2;
                    if (this.v) {
                        for (int i3 = 0; i3 < r; i3++) {
                            View q = q(i3);
                            if (q != null && (T2 = this.b.T(q)) != null && !T2.r() && (this.q.d(q) < e || this.q.m(q) < e)) {
                                c1(wg2Var, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = r - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View q2 = q(i5);
                        if (q2 != null && (T = this.b.T(q2)) != null && !T.r() && (this.q.d(q2) < e || this.q.m(q2) < e)) {
                            c1(wg2Var, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            d1(wg2Var, i, i2);
        }
    }

    public final void c1(wg2 wg2Var, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    h0(i3, wg2Var);
                }
                return;
            }
            while (i > i2) {
                h0(i, wg2Var);
                i--;
            }
        }
    }

    @Override
    public final boolean d() {
        if (!this.u && !this.o) {
            return true;
        }
        return false;
    }

    @Override
    public final s26 d0() {
        s26 s26Var = this.B;
        if (s26Var != null) {
            ?? obj = new Object();
            obj.a = s26Var.a;
            obj.b = s26Var.b;
            obj.c = s26Var.c;
            return obj;
        }
        ?? obj2 = new Object();
        if (r() > 0) {
            F0();
            boolean z = this.s ^ this.v;
            obj2.c = z;
            if (z) {
                View T0 = T0();
                obj2.b = this.q.f() - this.q.a(T0);
                obj2.a = ((e49) T0.getLayoutParams()).b();
                return obj2;
            }
            View U0 = U0();
            obj2.a = d49.G(U0);
            obj2.b = this.q.d(U0) - this.q.j();
            return obj2;
        }
        obj2.a = -1;
        return obj2;
    }

    public void d1(wg2 wg2Var, int i, int i2) {
        s49 T;
        s49 T2;
        if (i >= 0) {
            int i3 = i - i2;
            int r = r();
            if (this.v) {
                int i4 = r - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View q = q(i5);
                    if (q != null && (T2 = this.b.T(q)) != null && !T2.r() && (this.q.a(q) > i3 || this.q.l(q) > i3)) {
                        c1(wg2Var, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < r; i6++) {
                View q2 = q(i6);
                if (q2 != null && (T = this.b.T(q2)) != null && !T.r() && (this.q.a(q2) > i3 || this.q.l(q2) > i3)) {
                    c1(wg2Var, 0, i6);
                    return;
                }
            }
        }
    }

    @Override
    public boolean e() {
        if (!this.u && this.o) {
            return true;
        }
        return false;
    }

    public final void e1() {
        if (!this.o && X0()) {
            this.v = !this.t;
        } else {
            this.v = this.t;
        }
    }

    public final int f1(int i, wg2 wg2Var, p49 p49Var) {
        int i2;
        if (r() == 0 || i == 0) {
            return 0;
        }
        F0();
        this.p.a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        l1(i2, abs, true, p49Var);
        r26 r26Var = this.p;
        int G0 = G0(wg2Var, r26Var, p49Var, false) + r26Var.g;
        if (G0 < 0) {
            return 0;
        }
        if (abs > G0) {
            i = i2 * G0;
        }
        this.q.p(-i);
        this.p.j = i;
        return i;
    }

    public void g1(int i, int i2) {
        h1(i, i2, this.v);
    }

    @Override
    public int h(p49 p49Var) {
        return B0(p49Var);
    }

    public void h1(int i, int i2, boolean z) {
        if (this.y == i && this.A == i2 && this.z == z) {
            return;
        }
        this.y = i;
        this.A = i2;
        this.z = z;
        s26 s26Var = this.B;
        if (s26Var != null) {
            s26Var.a = -1;
        }
        k0();
    }

    @Override
    public int i(p49 p49Var) {
        return C0(p49Var);
    }

    public final void i1(int i) {
        ar7 ar7Var;
        if (i != 0 && i != 1) {
            w26.j(de9.k(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i == this.o && this.q != null) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                ar7Var = new ar7(this, (byte) 1);
            } else {
                w26.j("invalid orientation");
                return;
            }
        } else {
            ar7Var = new ar7(this, (byte) 0);
        }
        this.q = ar7Var;
        this.C.a = ar7Var;
        this.o = i;
        k0();
    }

    @Override
    public int j(p49 p49Var) {
        return A0(p49Var);
    }

    public void j1(boolean z) {
        b(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        k0();
    }

    @Override
    public int k(p49 p49Var) {
        return B0(p49Var);
    }

    public void k1(boolean z) {
        b(null);
        if (this.w == z) {
            return;
        }
        this.w = z;
        k0();
    }

    @Override
    public int l(p49 p49Var) {
        return C0(p49Var);
    }

    @Override
    public int l0(int i, wg2 wg2Var, p49 p49Var) {
        if (this.o) {
            return 0;
        }
        return f1(i, wg2Var, p49Var);
    }

    public final void l1(int i, int i2, boolean z, p49 p49Var) {
        boolean z2;
        int i3;
        int j;
        r26 r26Var = this.p;
        boolean z3 = false;
        int i4 = 1;
        if (this.q.h() == 0 && this.q.e() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r26Var.l = z2;
        this.p.f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(p49Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        r26 r26Var2 = this.p;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        r26Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        r26Var2.i = max;
        if (z3) {
            r26Var2.h = this.q.g() + i3;
            View T0 = T0();
            r26 r26Var3 = this.p;
            if (this.v) {
                i4 = -1;
            }
            r26Var3.e = i4;
            int G = d49.G(T0);
            r26 r26Var4 = this.p;
            r26Var3.d = G + r26Var4.e;
            r26Var4.b = this.q.a(T0);
            j = this.q.a(T0) - this.q.f();
        } else {
            View U0 = U0();
            r26 r26Var5 = this.p;
            r26Var5.h = this.q.j() + r26Var5.h;
            r26 r26Var6 = this.p;
            if (!this.v) {
                i4 = -1;
            }
            r26Var6.e = i4;
            int G2 = d49.G(U0);
            r26 r26Var7 = this.p;
            r26Var6.d = G2 + r26Var7.e;
            r26Var7.b = this.q.d(U0);
            j = (-this.q.d(U0)) + this.q.j();
        }
        r26 r26Var8 = this.p;
        r26Var8.c = i2;
        if (z) {
            r26Var8.c = i2 - j;
        }
        r26Var8.g = j;
    }

    @Override
    public final void m0(int i) {
        this.y = i;
        this.A = Integer.MIN_VALUE;
        s26 s26Var = this.B;
        if (s26Var != null) {
            s26Var.a = -1;
        }
        k0();
    }

    public final void m1(int i, int i2) {
        int i3;
        this.p.c = this.q.f() - i2;
        r26 r26Var = this.p;
        if (this.v) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        r26Var.e = i3;
        r26Var.d = i;
        r26Var.f = 1;
        r26Var.b = i2;
        r26Var.g = Integer.MIN_VALUE;
    }

    @Override
    public int n0(int i, wg2 wg2Var, p49 p49Var) {
        if (!this.o) {
            return 0;
        }
        return f1(i, wg2Var, p49Var);
    }

    public final void n1(int i, int i2) {
        int i3;
        this.p.c = i2 - this.q.j();
        r26 r26Var = this.p;
        r26Var.d = i;
        if (this.v) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        r26Var.e = i3;
        r26Var.f = -1;
        r26Var.b = i2;
        r26Var.g = Integer.MIN_VALUE;
    }

    @Override
    public boolean x0() {
        if (this.B == null && this.s == this.w) {
            return true;
        }
        return false;
    }

    public void y0(p49 p49Var, int[] iArr) {
        int i;
        int V0 = V0(p49Var);
        if (this.p.f == -1) {
            i = 0;
        } else {
            i = V0;
            V0 = 0;
        }
        iArr[0] = V0;
        iArr[1] = i;
    }

    public void z0(p49 p49Var, r26 r26Var, on onVar) {
        int i = r26Var.d;
        if (i >= 0 && i < p49Var.b()) {
            onVar.b(i, Math.max(0, r26Var.g));
        }
    }

    public t26() {
        this(1, false);
    }

    public void Z0(wg2 wg2Var, p49 p49Var, p26 p26Var, int i) {
    }
}
