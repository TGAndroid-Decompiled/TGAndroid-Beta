package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class wh2 implements at9, i8a, la6, pa6 {
    public final ys9[] E;
    public final lh2 F;
    public rh2 G;
    public ko4 H;
    public d63 I;
    public long J;
    public long K;
    public int L;
    public pg0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public final int a;
    public final int[] b;
    public final ko4[] c;
    public final boolean[] d;
    public final pa3 e;
    public final d63 f;
    public final lp h;
    public final z6f n;
    public final rx6 r;
    public final n31 s;
    public final ArrayList w;
    public final List x;
    public final ys9 y;

    public wh2(int i, int[] iArr, ko4[] ko4VarArr, pa3 pa3Var, d63 d63Var, rx6 rx6Var, long j, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, boolean z, long j2, r99 r99Var) {
        rx6 rx6Var2;
        this.a = i;
        this.b = iArr;
        this.c = ko4VarArr;
        this.e = pa3Var;
        this.f = d63Var;
        this.h = lpVar;
        this.n = z6fVar;
        if (r99Var != null) {
            rx6Var2 = new rx6(r99Var, (byte) 5);
        } else {
            rx6Var2 = new rx6("ChunkSampleStream");
        }
        this.r = rx6Var2;
        this.s = new n31((byte) 2);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new ys9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        ys9[] ys9VarArr = new ys9[i2];
        pr3Var.getClass();
        ys9 ys9Var = new ys9(rx6Var, pr3Var, mr3Var);
        this.y = ys9Var;
        iArr2[0] = i;
        ys9VarArr[0] = ys9Var;
        int i3 = 0;
        while (i3 < length) {
            ys9 ys9Var2 = new ys9(rx6Var, null, null);
            this.E[i3] = ys9Var2;
            int i4 = i3 + 1;
            ys9VarArr[i4] = ys9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.F = new lh2(iArr2, ys9VarArr, (byte) 8);
        this.J = j;
        this.K = j;
        this.R = Long.MIN_VALUE;
        this.N = z;
        if (z && j2 != -9223372036854775807L) {
            this.N = false;
            this.O = j2 < j;
        }
    }

    public final void A() {
        int B = B(this.y.v(), this.L - 1);
        while (true) {
            int i = this.L;
            if (i <= B) {
                this.L = i + 1;
                pg0 pg0Var = (pg0) this.w.get(i);
                ko4 ko4Var = pg0Var.d;
                if (!ko4Var.equals(this.H)) {
                    this.h.i(this.a, ko4Var, pg0Var.e, pg0Var.f, pg0Var.h);
                }
                this.H = ko4Var;
            } else {
                return;
            }
        }
    }

    public final int B(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.w;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((pg0) arrayList.get(i2)).e(0) <= i);
        return i2 - 1;
    }

    public final void C(d63 d63Var) {
        ys9[] ys9VarArr;
        this.I = d63Var;
        ys9 ys9Var = this.y;
        ys9Var.l();
        jr3 jr3Var = ys9Var.h;
        if (jr3Var != null) {
            jr3Var.c(ys9Var.e);
            ys9Var.h = null;
            ys9Var.g = null;
        }
        for (ys9 ys9Var2 : this.E) {
            ys9Var2.l();
            jr3 jr3Var2 = ys9Var2.h;
            if (jr3Var2 != null) {
                jr3Var2.c(ys9Var2.e);
                ys9Var2.h = null;
                ys9Var2.g = null;
            }
        }
        this.r.g0(this);
    }

    @Override
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        rh2 rh2Var = (rh2) oa6Var;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        if (i != 0) {
            b2b b2bVar = rh2Var.r;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        this.h.v(new ja6(ia6Var), rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, i);
    }

    @Override
    public final int a() {
        if (this.N) {
            return 2;
        }
        if (this.O) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void b() {
        ys9[] ys9VarArr;
        ys9 ys9Var = this.y;
        ys9Var.G(true);
        jr3 jr3Var = ys9Var.h;
        if (jr3Var != null) {
            jr3Var.c(ys9Var.e);
            ys9Var.h = null;
            ys9Var.g = null;
        }
        for (ys9 ys9Var2 : this.E) {
            ys9Var2.G(true);
            jr3 jr3Var2 = ys9Var2.h;
            if (jr3Var2 != null) {
                jr3Var2.c(ys9Var2.e);
                ys9Var2.h = null;
                ys9Var2.g = null;
            }
        }
        for (na3 na3Var : this.e.h) {
            o31 o31Var = na3Var.a;
            if (o31Var != null) {
                o31Var.a.release();
            }
        }
        d63 d63Var = this.I;
        if (d63Var != null) {
            synchronized (d63Var) {
                fg8 fg8Var = (fg8) d63Var.E.remove(this);
                if (fg8Var != null) {
                    ys9 ys9Var3 = fg8Var.a;
                    ys9Var3.G(true);
                    jr3 jr3Var3 = ys9Var3.h;
                    if (jr3Var3 != null) {
                        jr3Var3.c(null);
                        ys9Var3.h = null;
                        ys9Var3.g = null;
                    }
                }
            }
        }
    }

    @Override
    public final defpackage.ma6 c2(defpackage.oa6 r28, long r29, long r31, java.io.IOException r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh2.c2(oa6, long, long, java.io.IOException, int):ma6");
    }

    @Override
    public final boolean e() {
        return this.r.Z();
    }

    @Override
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        rh2 rh2Var = (rh2) oa6Var;
        this.G = null;
        this.M = null;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.n.getClass();
        this.h.o(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        if (!z) {
            if (y()) {
                this.y.G(false);
                for (ys9 ys9Var : this.E) {
                    ys9Var.G(false);
                }
            } else if (rh2Var instanceof pg0) {
                ArrayList arrayList = this.w;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f.f(this);
        }
    }

    @Override
    public final void f0(oa6 oa6Var, long j, long j2) {
        rh2 rh2Var = (rh2) oa6Var;
        this.G = null;
        pa3 pa3Var = this.e;
        na3[] na3VarArr = pa3Var.h;
        if (rh2Var instanceof rp5) {
            int e = pa3Var.i.e(((rp5) rh2Var).d);
            na3 na3Var = na3VarArr[e];
            if (na3Var.d == null) {
                o31 o31Var = na3Var.a;
                o31Var.getClass();
                sh2 a = o31Var.a();
                if (a != null) {
                    ub9 ub9Var = na3Var.b;
                    na3VarArr[e] = new na3(na3Var.e, ub9Var, na3Var.c, na3Var.a, na3Var.f, new zg2(a, ub9Var.c, (byte) 1));
                }
            }
        }
        fg8 fg8Var = pa3Var.g;
        if (fg8Var != null) {
            long j3 = fg8Var.d;
            if (j3 == -9223372036854775807L || rh2Var.n > j3) {
                fg8Var.d = rh2Var.n;
            }
            fg8Var.e.h = true;
        }
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.n.getClass();
        this.h.q(ja6Var, rh2Var.c, this.a, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        this.f.f(this);
    }

    @Override
    public final void g() {
        rx6 rx6Var = this.r;
        rx6Var.g();
        this.y.C();
        if (!rx6Var.Z()) {
            pa3 pa3Var = this.e;
            kh0 kh0Var = pa3Var.l;
            if (kh0Var == null) {
                pa3Var.a.g();
                return;
            }
            throw kh0Var;
        }
    }

    @Override
    public final long h() {
        if (y()) {
            return this.J;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        boolean z;
        if (!this.P && z()) {
            z = true;
        } else {
            z = false;
        }
        if (!y() && !z && !this.Q) {
            pg0 pg0Var = this.M;
            ys9 ys9Var = this.y;
            if (pg0Var == null || pg0Var.e(0) > ys9Var.v()) {
                A();
                return ys9Var.F(ym4Var, s93Var, i, this.S);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final boolean k() {
        if (!y() && this.y.A(this.S)) {
            return true;
        }
        return false;
    }

    @Override
    public final int o(long j) {
        boolean z;
        if (!this.P && z()) {
            z = true;
        } else {
            z = false;
        }
        if (y() || z || this.Q) {
            return 0;
        }
        boolean z2 = this.S;
        ys9 ys9Var = this.y;
        int x = ys9Var.x(j, z2);
        pg0 pg0Var = this.M;
        if (pg0Var != null) {
            x = Math.min(x, pg0Var.e(0) - ys9Var.v());
        }
        ys9Var.L(x);
        A();
        return x;
    }

    @Override
    public final boolean s(defpackage.xa6 r60) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh2.s(xa6):boolean");
    }

    @Override
    public final long t() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j = this.K;
        pg0 w = w();
        if (!w.d()) {
            ArrayList arrayList = this.w;
            if (arrayList.size() > 1) {
                w = (pg0) c00.g(2, arrayList);
            } else {
                w = null;
            }
        }
        if (w != null) {
            j = Math.max(j, w.n);
        }
        return Math.max(j, this.y.s());
    }

    @Override
    public final void u(long j) {
        int size;
        boolean z;
        rx6 rx6Var = this.r;
        if (!rx6Var.U() && !y()) {
            boolean Z = rx6Var.Z();
            List list = this.x;
            pa3 pa3Var = this.e;
            boolean z2 = false;
            ArrayList arrayList = this.w;
            if (Z) {
                rh2 rh2Var = this.G;
                rh2Var.getClass();
                boolean z3 = rh2Var instanceof pg0;
                if (!z3 || !x(arrayList.size() - 1)) {
                    long j2 = this.R;
                    if (j2 == Long.MIN_VALUE || rh2Var.h < j2) {
                        if (pa3Var.l == null) {
                            z2 = pa3Var.i.g(j, rh2Var, list);
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    rx6Var.u();
                    if (z3) {
                        this.M = (pg0) rh2Var;
                        return;
                    }
                    return;
                }
                return;
            }
            int size2 = arrayList.size();
            if (pa3Var.l == null && pa3Var.i.length() >= 2) {
                size = pa3Var.i.k(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size2, size);
            if (this.R != Long.MIN_VALUE) {
                z = false;
                while (min > 0 && ((pg0) arrayList.get(min - 1)).h >= this.R) {
                    min--;
                    z = true;
                }
            } else {
                z = false;
            }
            if (min < arrayList.size()) {
                yve.p(!rx6Var.Z());
                int size3 = arrayList.size();
                while (true) {
                    if (min < size3) {
                        if (!x(min)) {
                            break;
                        }
                        min++;
                    } else {
                        min = -1;
                        break;
                    }
                }
                if (min != -1) {
                    long j3 = w().n;
                    pg0 v = v(min);
                    if (arrayList.isEmpty()) {
                        this.J = this.K;
                    }
                    this.S = false;
                    this.h.B(v.h, this.a, j3);
                }
            }
            if (z) {
                this.J = -9223372036854775807L;
                this.S = true;
            }
        }
    }

    public final pg0 v(int i) {
        ArrayList arrayList = this.w;
        pg0 pg0Var = (pg0) arrayList.get(i);
        gcc.Y(i, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i2 = 0;
        this.y.o(pg0Var.e(0));
        while (true) {
            ys9[] ys9VarArr = this.E;
            if (i2 < ys9VarArr.length) {
                ys9 ys9Var = ys9VarArr[i2];
                i2++;
                ys9Var.o(pg0Var.e(i2));
            } else {
                return pg0Var;
            }
        }
    }

    public final pg0 w() {
        return (pg0) c00.g(1, this.w);
    }

    public final boolean x(int i) {
        int v;
        pg0 pg0Var = (pg0) this.w.get(i);
        if (this.y.v() <= pg0Var.e(0)) {
            int i2 = 0;
            do {
                ys9[] ys9VarArr = this.E;
                if (i2 >= ys9VarArr.length) {
                    return false;
                }
                v = ys9VarArr[i2].v();
                i2++;
            } while (v <= pg0Var.e(i2));
            return true;
        }
        return true;
    }

    public final boolean y() {
        if (this.J != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.N || this.O) && !this.S && !this.r.U()) {
            return true;
        }
        return false;
    }
}
