package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
public class u46 extends f69 {
    public int A;
    public t46 B;
    public final q46 C;
    public final r46 D;
    public byte E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public boolean o;
    public s46 p;
    public ns2 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public u46(int i, boolean z) {
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

    public final int A0(r69 r69Var) {
        if (r() != 0) {
            F0();
            ns2 ns2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            if (r() != 0 && r69Var.b() != 0 && J0 != null && I0 != null) {
                if (!z) {
                    return Math.abs(((g69) J0.getLayoutParams()).b() - ((g69) I0.getLayoutParams()).b()) + 1;
                }
                return Math.min(ns2Var.k(), ns2Var.a(I0) - ns2Var.d(J0));
            }
            return 0;
        }
        return 0;
    }

    public final int B0(r69 r69Var) {
        int max;
        if (r() != 0) {
            F0();
            ns2 ns2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            boolean z3 = this.v;
            if (r() != 0 && r69Var.b() != 0 && J0 != null && I0 != null) {
                int min = Math.min(((g69) J0.getLayoutParams()).b(), ((g69) I0.getLayoutParams()).b());
                int max2 = Math.max(((g69) J0.getLayoutParams()).b(), ((g69) I0.getLayoutParams()).b());
                if (z3) {
                    max = Math.max(0, (r69Var.b() - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z) {
                    return max;
                }
                return Math.round((max * (Math.abs(ns2Var.a(I0) - ns2Var.d(J0)) / (Math.abs(((g69) J0.getLayoutParams()).b() - ((g69) I0.getLayoutParams()).b()) + 1))) + (ns2Var.j() - ns2Var.d(J0)));
            }
        }
        return 0;
    }

    public final int C0(r69 r69Var) {
        if (r() != 0) {
            F0();
            ns2 ns2Var = this.q;
            boolean z = this.x;
            boolean z2 = !z;
            View J0 = J0(z2);
            View I0 = I0(z2);
            if (r() != 0 && r69Var.b() != 0 && J0 != null && I0 != null) {
                if (!z) {
                    return r69Var.b();
                }
                return (int) (((ns2Var.a(I0) - ns2Var.d(J0)) / (Math.abs(((g69) J0.getLayoutParams()).b() - ((g69) I0.getLayoutParams()).b()) + 1)) * r69Var.b());
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
        if (i < f69.G(q(0))) {
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

    public final int G0(ki2 ki2Var, s46 s46Var, r69 r69Var, boolean z) {
        int i = s46Var.c;
        int i2 = s46Var.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                s46Var.g = i2 + i;
            }
            b1(ki2Var, s46Var);
        }
        int i3 = s46Var.c + s46Var.h;
        while (true) {
            if ((!s46Var.l && i3 <= 0) || !s46Var.b(r69Var)) {
                break;
            }
            r46 r46Var = this.D;
            r46Var.a = 0;
            r46Var.b = false;
            r46Var.c = false;
            r46Var.d = false;
            Y0(ki2Var, r69Var, s46Var, r46Var);
            if (!r46Var.b) {
                int i4 = s46Var.b;
                int i5 = r46Var.a;
                s46Var.b = (s46Var.f * i5) + i4;
                if (!r46Var.c || s46Var.k != null || !r69Var.g) {
                    s46Var.c -= i5;
                    i3 -= i5;
                }
                int i6 = s46Var.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    s46Var.g = i7;
                    int i8 = s46Var.c;
                    if (i8 < 0) {
                        s46Var.g = i7 + i8;
                    }
                    b1(ki2Var, s46Var);
                }
                if (z && r46Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - s46Var.c;
    }

    public final int H0() {
        View O0 = O0(0, r(), true, false);
        if (O0 == null) {
            return -1;
        }
        return ((g69) O0.getLayoutParams()).b();
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
        return ((g69) O0.getLayoutParams()).b();
    }

    public final int L0() {
        View O0 = O0(r() - 1, -1, true, false);
        if (O0 == null) {
            return -1;
        }
        return ((g69) O0.getLayoutParams()).b();
    }

    public final int M0() {
        View O0 = O0(r() - 1, -1, false, true);
        if (O0 == null) {
            return -1;
        }
        return ((g69) O0.getLayoutParams()).b();
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
                return this.c.h(i, i2, i3, i4);
            }
            return this.d.h(i, i2, i3, i4);
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
            return this.c.h(i, i2, i3, i4);
        }
        return this.d.h(i, i2, i3, i4);
    }

    public View P0(ki2 ki2Var, r69 r69Var, int i, int i2, int i3) {
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
            int G = f69.G(q);
            if (G >= 0 && G < i3) {
                if (((g69) q.getLayoutParams()).a.j()) {
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
    public View Q(View view, int i, ki2 ki2Var, r69 r69Var) {
        int E0;
        View N0;
        View T0;
        e1();
        if (r() != 0 && (E0 = E0(i)) != Integer.MIN_VALUE) {
            F0();
            l1(E0, (int) (this.q.k() * 0.33333334f), false, r69Var);
            s46 s46Var = this.p;
            s46Var.g = Integer.MIN_VALUE;
            s46Var.a = false;
            G0(ki2Var, s46Var, r69Var, true);
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

    public final int R0(int i, ki2 ki2Var, r69 r69Var, boolean z) {
        int f;
        int f2;
        if (this.G && this.H && (f = this.q.f() - i) > 0) {
            int i2 = -f1(-f, ki2Var, r69Var);
            int i3 = i + i2;
            if (z && (f2 = this.q.f() - i3) > 0) {
                this.q.p(f2);
                return f2 + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int S0(int i, ki2 ki2Var, r69 r69Var, boolean z) {
        int W0;
        int j;
        if (this.G && (W0 = i - W0()) > 0) {
            int i2 = -f1(W0, ki2Var, r69Var);
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

    public int V0(r69 r69Var) {
        if (r69Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int W0() {
        return this.q.j();
    }

    public boolean X0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = kfc.a;
        if (recyclerView.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void Y0(ki2 ki2Var, r69 r69Var, s46 s46Var, r46 r46Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View c = s46Var.c(ki2Var);
        if (c == null) {
            r46Var.b = true;
            return;
        }
        g69 g69Var = (g69) c.getLayoutParams();
        List list = s46Var.k;
        boolean z3 = this.v;
        int i5 = s46Var.f;
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
        r46Var.a = this.q.b(c);
        if (this.o) {
            if (X0()) {
                i4 = this.m - D();
                i2 = i4 - this.q.c(c);
            } else {
                int C = C();
                i4 = this.q.c(c) + C;
                i2 = C;
            }
            int i6 = s46Var.f;
            i3 = s46Var.b;
            int i7 = r46Var.a;
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
            int i9 = s46Var.f;
            int i10 = s46Var.b;
            int i11 = r46Var.a;
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
        f69.N(c, i2, i3, i4, i);
        if (g69Var.a.j() || g69Var.a.m()) {
            r46Var.c = true;
        }
        r46Var.d = c.hasFocusable();
    }

    @Override
    public void a0(defpackage.ki2 r18, defpackage.r69 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u46.a0(ki2, r69):void");
    }

    public void a1(View view, View view2, int i, int i2) {
        boolean z;
        b("Cannot drop a view during a scroll or layout calculation");
        F0();
        e1();
        int G = f69.G(view);
        int G2 = f69.G(view2);
        if (G < G2) {
            z = true;
        } else {
            z = true;
        }
        boolean z2 = this.v;
        ns2 ns2Var = this.q;
        if (z2) {
            if (z) {
                g1(G2, ns2Var.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            }
            g1(G2, ns2Var.f() - this.q.a(view2));
        } else if (z) {
            g1(G2, ns2Var.d(view2));
        } else {
            g1(G2, ns2Var.a(view2) - this.q.b(view));
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
    public void b0(r69 r69Var) {
        this.B = null;
        this.y = -1;
        this.A = Integer.MIN_VALUE;
        this.C.c();
    }

    public final void b1(ki2 ki2Var, s46 s46Var) {
        u69 T;
        u69 T2;
        if (s46Var.a && !s46Var.l) {
            int i = s46Var.g;
            int i2 = s46Var.i;
            if (s46Var.f == -1) {
                int r = r();
                if (i >= 0) {
                    int e = (this.q.e() - i) + i2;
                    if (this.v) {
                        for (int i3 = 0; i3 < r; i3++) {
                            View q = q(i3);
                            if (q != null && (T2 = this.b.T(q)) != null && !T2.r() && (this.q.d(q) < e || this.q.m(q) < e)) {
                                c1(ki2Var, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = r - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View q2 = q(i5);
                        if (q2 != null && (T = this.b.T(q2)) != null && !T.r() && (this.q.d(q2) < e || this.q.m(q2) < e)) {
                            c1(ki2Var, i4, i5);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            d1(ki2Var, i, i2);
        }
    }

    public final void c1(ki2 ki2Var, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    h0(i3, ki2Var);
                }
                return;
            }
            while (i > i2) {
                h0(i, ki2Var);
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
    public final t46 d0() {
        t46 t46Var = this.B;
        if (t46Var != null) {
            ?? obj = new Object();
            obj.a = t46Var.a;
            obj.b = t46Var.b;
            obj.c = t46Var.c;
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
                obj2.a = ((g69) T0.getLayoutParams()).b();
                return obj2;
            }
            View U0 = U0();
            obj2.a = f69.G(U0);
            obj2.b = this.q.d(U0) - this.q.j();
            return obj2;
        }
        obj2.a = -1;
        return obj2;
    }

    public void d1(ki2 ki2Var, int i, int i2) {
        u69 T;
        u69 T2;
        if (i >= 0) {
            int i3 = i - i2;
            int r = r();
            if (this.v) {
                int i4 = r - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View q = q(i5);
                    if (q != null && (T2 = this.b.T(q)) != null && !T2.r() && (this.q.a(q) > i3 || this.q.l(q) > i3)) {
                        c1(ki2Var, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < r; i6++) {
                View q2 = q(i6);
                if (q2 != null && (T = this.b.T(q2)) != null && !T.r() && (this.q.a(q2) > i3 || this.q.l(q2) > i3)) {
                    c1(ki2Var, 0, i6);
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

    public final int f1(int i, ki2 ki2Var, r69 r69Var) {
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
        l1(i2, abs, true, r69Var);
        s46 s46Var = this.p;
        int G0 = G0(ki2Var, s46Var, r69Var, false) + s46Var.g;
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
    public int h(r69 r69Var) {
        return B0(r69Var);
    }

    public void h1(int i, int i2, boolean z) {
        if (this.y == i && this.A == i2 && this.z == z) {
            return;
        }
        this.y = i;
        this.A = i2;
        this.z = z;
        t46 t46Var = this.B;
        if (t46Var != null) {
            t46Var.a = -1;
        }
        k0();
    }

    @Override
    public int i(r69 r69Var) {
        return C0(r69Var);
    }

    public final void i1(int i) {
        ct7 ct7Var;
        if (i != 0 && i != 1) {
            u36.j(hg9.j(i, "invalid orientation:"));
            return;
        }
        b(null);
        if (i == this.o && this.q != null) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                ct7Var = new ct7(this, (byte) 1);
            } else {
                u36.j("invalid orientation");
                return;
            }
        } else {
            ct7Var = new ct7(this, (byte) 0);
        }
        this.q = ct7Var;
        this.C.a = ct7Var;
        this.o = i;
        k0();
    }

    @Override
    public int j(r69 r69Var) {
        return A0(r69Var);
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
    public int k(r69 r69Var) {
        return B0(r69Var);
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
    public int l(r69 r69Var) {
        return C0(r69Var);
    }

    @Override
    public int l0(int i, ki2 ki2Var, r69 r69Var) {
        if (this.o) {
            return 0;
        }
        return f1(i, ki2Var, r69Var);
    }

    public final void l1(int i, int i2, boolean z, r69 r69Var) {
        boolean z2;
        int i3;
        int j;
        s46 s46Var = this.p;
        boolean z3 = false;
        int i4 = 1;
        if (this.q.h() == 0 && this.q.e() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        s46Var.l = z2;
        this.p.f = i;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        y0(r69Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        s46 s46Var2 = this.p;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        s46Var2.h = i3;
        if (!z3) {
            max = max2;
        }
        s46Var2.i = max;
        if (z3) {
            s46Var2.h = this.q.g() + i3;
            View T0 = T0();
            s46 s46Var3 = this.p;
            if (this.v) {
                i4 = -1;
            }
            s46Var3.e = i4;
            int G = f69.G(T0);
            s46 s46Var4 = this.p;
            s46Var3.d = G + s46Var4.e;
            s46Var4.b = this.q.a(T0);
            j = this.q.a(T0) - this.q.f();
        } else {
            View U0 = U0();
            s46 s46Var5 = this.p;
            s46Var5.h = this.q.j() + s46Var5.h;
            s46 s46Var6 = this.p;
            if (!this.v) {
                i4 = -1;
            }
            s46Var6.e = i4;
            int G2 = f69.G(U0);
            s46 s46Var7 = this.p;
            s46Var6.d = G2 + s46Var7.e;
            s46Var7.b = this.q.d(U0);
            j = (-this.q.d(U0)) + this.q.j();
        }
        s46 s46Var8 = this.p;
        s46Var8.c = i2;
        if (z) {
            s46Var8.c = i2 - j;
        }
        s46Var8.g = j;
    }

    @Override
    public final void m0(int i) {
        this.y = i;
        this.A = Integer.MIN_VALUE;
        t46 t46Var = this.B;
        if (t46Var != null) {
            t46Var.a = -1;
        }
        k0();
    }

    public final void m1(int i, int i2) {
        int i3;
        this.p.c = this.q.f() - i2;
        s46 s46Var = this.p;
        if (this.v) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        s46Var.e = i3;
        s46Var.d = i;
        s46Var.f = 1;
        s46Var.b = i2;
        s46Var.g = Integer.MIN_VALUE;
    }

    @Override
    public int n0(int i, ki2 ki2Var, r69 r69Var) {
        if (!this.o) {
            return 0;
        }
        return f1(i, ki2Var, r69Var);
    }

    public final void n1(int i, int i2) {
        int i3;
        this.p.c = i2 - this.q.j();
        s46 s46Var = this.p;
        s46Var.d = i;
        if (this.v) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        s46Var.e = i3;
        s46Var.f = -1;
        s46Var.b = i2;
        s46Var.g = Integer.MIN_VALUE;
    }

    @Override
    public boolean x0() {
        if (this.B == null && this.s == this.w) {
            return true;
        }
        return false;
    }

    public void y0(r69 r69Var, int[] iArr) {
        int i;
        int V0 = V0(r69Var);
        if (this.p.f == -1) {
            i = 0;
        } else {
            i = V0;
            V0 = 0;
        }
        iArr[0] = V0;
        iArr[1] = i;
    }

    public void z0(r69 r69Var, s46 s46Var, po poVar) {
        int i = s46Var.d;
        if (i >= 0 && i < r69Var.b()) {
            poVar.b(i, Math.max(0, s46Var.g));
        }
    }

    public u46() {
        this(1, false);
    }

    public void Z0(ki2 ki2Var, r69 r69Var, q46 q46Var, int i) {
    }
}
