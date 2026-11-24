package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class si2 implements jr9, s6a, ga6, ka6 {
    public final hr9[] E;
    public final lx6 F;
    public ni2 G;
    public go4 H;
    public x63 I;
    public long J;
    public long K;
    public int L;
    public ph0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public final int a;
    public final int[] b;
    public final go4[] c;
    public final boolean[] d;
    public final ib3 e;
    public final x63 f;
    public final kq h;
    public final k4f n;
    public final mx6 r;
    public final m41 s;
    public final ArrayList w;
    public final List x;
    public final hr9 y;

    public si2(int i, int[] iArr, go4[] go4VarArr, ib3 ib3Var, x63 x63Var, mx6 mx6Var, long j, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, boolean z, long j2, g89 g89Var) {
        mx6 mx6Var2;
        this.a = i;
        this.b = iArr;
        this.c = go4VarArr;
        this.e = ib3Var;
        this.f = x63Var;
        this.h = kqVar;
        this.n = k4fVar;
        if (g89Var != null) {
            mx6Var2 = new mx6(g89Var, (byte) 5);
        } else {
            mx6Var2 = new mx6("ChunkSampleStream");
        }
        this.r = mx6Var2;
        this.s = new m41((byte) 2);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new hr9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        hr9[] hr9VarArr = new hr9[i2];
        is3Var.getClass();
        hr9 hr9Var = new hr9(mx6Var, is3Var, fs3Var);
        this.y = hr9Var;
        iArr2[0] = i;
        hr9VarArr[0] = hr9Var;
        int i3 = 0;
        while (i3 < length) {
            hr9 hr9Var2 = new hr9(mx6Var, null, null);
            this.E[i3] = hr9Var2;
            int i4 = i3 + 1;
            hr9VarArr[i4] = hr9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.F = new lx6(iArr2, hr9VarArr, (byte) 7);
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
                ph0 ph0Var = (ph0) this.w.get(i);
                go4 go4Var = ph0Var.d;
                if (!go4Var.equals(this.H)) {
                    this.h.i(this.a, go4Var, ph0Var.e, ph0Var.f, ph0Var.h);
                }
                this.H = go4Var;
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
        } while (((ph0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void C(x63 x63Var) {
        hr9[] hr9VarArr;
        this.I = x63Var;
        hr9 hr9Var = this.y;
        hr9Var.l();
        cs3 cs3Var = hr9Var.h;
        if (cs3Var != null) {
            cs3Var.c(hr9Var.e);
            hr9Var.h = null;
            hr9Var.g = null;
        }
        for (hr9 hr9Var2 : this.E) {
            hr9Var2.l();
            cs3 cs3Var2 = hr9Var2.h;
            if (cs3Var2 != null) {
                cs3Var2.c(hr9Var2.e);
                hr9Var2.h = null;
                hr9Var2.g = null;
            }
        }
        this.r.e0(this);
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        ni2 ni2Var = (ni2) ja6Var;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        if (i != 0) {
            c0b c0bVar = ni2Var.r;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        this.h.u(new ea6(da6Var), ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, i);
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
        hr9[] hr9VarArr;
        hr9 hr9Var = this.y;
        hr9Var.G(true);
        cs3 cs3Var = hr9Var.h;
        if (cs3Var != null) {
            cs3Var.c(hr9Var.e);
            hr9Var.h = null;
            hr9Var.g = null;
        }
        for (hr9 hr9Var2 : this.E) {
            hr9Var2.G(true);
            cs3 cs3Var2 = hr9Var2.h;
            if (cs3Var2 != null) {
                cs3Var2.c(hr9Var2.e);
                hr9Var2.h = null;
                hr9Var2.g = null;
            }
        }
        for (gb3 gb3Var : this.e.h) {
            n41 n41Var = gb3Var.a;
            if (n41Var != null) {
                n41Var.a.release();
            }
        }
        x63 x63Var = this.I;
        if (x63Var != null) {
            synchronized (x63Var) {
                te8 te8Var = (te8) x63Var.E.remove(this);
                if (te8Var != null) {
                    hr9 hr9Var3 = te8Var.a;
                    hr9Var3.G(true);
                    cs3 cs3Var3 = hr9Var3.h;
                    if (cs3Var3 != null) {
                        cs3Var3.c(null);
                        hr9Var3.h = null;
                        hr9Var3.g = null;
                    }
                }
            }
        }
    }

    @Override
    public final void d() {
        mx6 mx6Var = this.r;
        mx6Var.d();
        this.y.C();
        if (!mx6Var.Y()) {
            ib3 ib3Var = this.e;
            ji0 ji0Var = ib3Var.l;
            if (ji0Var == null) {
                ib3Var.a.d();
                return;
            }
            throw ji0Var;
        }
    }

    @Override
    public final boolean f() {
        return this.r.Y();
    }

    @Override
    public final defpackage.ha6 f2(defpackage.ja6 r28, long r29, long r31, java.io.IOException r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.f2(ja6, long, long, java.io.IOException, int):ha6");
    }

    @Override
    public final long g() {
        if (y()) {
            return this.J;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return v().n;
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        ni2 ni2Var = (ni2) ja6Var;
        this.G = null;
        ib3 ib3Var = this.e;
        gb3[] gb3VarArr = ib3Var.h;
        if (ni2Var instanceof op5) {
            int e = ib3Var.i.e(((op5) ni2Var).d);
            gb3 gb3Var = gb3VarArr[e];
            if (gb3Var.d == null) {
                n41 n41Var = gb3Var.a;
                n41Var.getClass();
                oi2 a = n41Var.a();
                if (a != null) {
                    ka9 ka9Var = gb3Var.b;
                    gb3VarArr[e] = new gb3(gb3Var.e, ka9Var, gb3Var.c, gb3Var.a, gb3Var.f, new vh2(a, ka9Var.c, (byte) 1));
                }
            }
        }
        te8 te8Var = ib3Var.g;
        if (te8Var != null) {
            long j3 = te8Var.d;
            if (j3 == -9223372036854775807L || ni2Var.n > j3) {
                te8Var.d = ni2Var.n;
            }
            te8Var.e.h = true;
        }
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.n.getClass();
        this.h.q(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        this.f.b(this);
    }

    @Override
    public final boolean i() {
        if (!y() && this.y.A(this.S)) {
            return true;
        }
        return false;
    }

    @Override
    public final int m(long j) {
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
        hr9 hr9Var = this.y;
        int x = hr9Var.x(j, z2);
        ph0 ph0Var = this.M;
        if (ph0Var != null) {
            x = Math.min(x, ph0Var.d(0) - hr9Var.v());
        }
        hr9Var.L(x);
        A();
        return x;
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        boolean z;
        if (!this.P && z()) {
            z = true;
        } else {
            z = false;
        }
        if (!y() && !z && !this.Q) {
            ph0 ph0Var = this.M;
            hr9 hr9Var = this.y;
            if (ph0Var == null || ph0Var.d(0) > hr9Var.v()) {
                A();
                return hr9Var.F(mj4Var, la3Var, i, this.S);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final boolean r(defpackage.sa6 r60) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.r(sa6):boolean");
    }

    @Override
    public final long s() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j = this.K;
        ph0 v = v();
        if (!v.c()) {
            ArrayList arrayList = this.w;
            if (arrayList.size() > 1) {
                v = (ph0) b10.f(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j = Math.max(j, v.n);
        }
        return Math.max(j, this.y.s());
    }

    @Override
    public final void t(long j) {
        int size;
        boolean z;
        mx6 mx6Var = this.r;
        if (!mx6Var.U() && !y()) {
            boolean Y = mx6Var.Y();
            List list = this.x;
            ib3 ib3Var = this.e;
            boolean z2 = false;
            ArrayList arrayList = this.w;
            if (Y) {
                ni2 ni2Var = this.G;
                ni2Var.getClass();
                boolean z3 = ni2Var instanceof ph0;
                if (!z3 || !x(arrayList.size() - 1)) {
                    long j2 = this.R;
                    if (j2 == Long.MIN_VALUE || ni2Var.h < j2) {
                        if (ib3Var.l == null) {
                            z2 = ib3Var.i.g(j, ni2Var, list);
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    mx6Var.v();
                    if (z3) {
                        this.M = (ph0) ni2Var;
                        return;
                    }
                    return;
                }
                return;
            }
            int size2 = arrayList.size();
            if (ib3Var.l == null && ib3Var.i.length() >= 2) {
                size = ib3Var.i.l(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size2, size);
            if (this.R != Long.MIN_VALUE) {
                z = false;
                while (min > 0 && ((ph0) arrayList.get(min - 1)).h >= this.R) {
                    min--;
                    z = true;
                }
            } else {
                z = false;
            }
            if (min < arrayList.size()) {
                jte.p(!mx6Var.Y());
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
                    long j3 = v().n;
                    ph0 u = u(min);
                    if (arrayList.isEmpty()) {
                        this.J = this.K;
                    }
                    this.S = false;
                    this.h.A(u.h, this.a, j3);
                }
            }
            if (z) {
                this.J = -9223372036854775807L;
                this.S = true;
            }
        }
    }

    public final ph0 u(int i) {
        ArrayList arrayList = this.w;
        ph0 ph0Var = (ph0) arrayList.get(i);
        hac.Y(i, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i2 = 0;
        this.y.o(ph0Var.d(0));
        while (true) {
            hr9[] hr9VarArr = this.E;
            if (i2 < hr9VarArr.length) {
                hr9 hr9Var = hr9VarArr[i2];
                i2++;
                hr9Var.o(ph0Var.d(i2));
            } else {
                return ph0Var;
            }
        }
    }

    public final ph0 v() {
        return (ph0) b10.f(1, this.w);
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        ni2 ni2Var = (ni2) ja6Var;
        this.G = null;
        this.M = null;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.n.getClass();
        this.h.o(ea6Var, ni2Var.c, this.a, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        if (!z) {
            if (y()) {
                this.y.G(false);
                for (hr9 hr9Var : this.E) {
                    hr9Var.G(false);
                }
            } else if (ni2Var instanceof ph0) {
                ArrayList arrayList = this.w;
                u(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f.b(this);
        }
    }

    public final boolean x(int i) {
        int v;
        ph0 ph0Var = (ph0) this.w.get(i);
        if (this.y.v() <= ph0Var.d(0)) {
            int i2 = 0;
            do {
                hr9[] hr9VarArr = this.E;
                if (i2 >= hr9VarArr.length) {
                    return false;
                }
                v = hr9VarArr[i2].v();
                i2++;
            } while (v <= ph0Var.d(i2));
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
