package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class eh2 implements ip9, q4a, h86, l86 {
    public final gp9[] E;
    public final tg2 F;
    public zg2 G;
    public fm4 H;
    public l53 I;
    public long J;
    public long K;
    public int L;
    public og0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public final int a;
    public final int[] b;
    public final fm4[] c;
    public final boolean[] d;
    public final w93 e;
    public final l53 f;
    public final kp h;
    public final i2f n;
    public final mv6 r;
    public final e31 s;
    public final ArrayList w;
    public final List x;
    public final gp9 y;

    public eh2(int i, int[] iArr, fm4[] fm4VarArr, w93 w93Var, l53 l53Var, mv6 mv6Var, long j, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, boolean z, long j2, e69 e69Var) {
        mv6 mv6Var2;
        this.a = i;
        this.b = iArr;
        this.c = fm4VarArr;
        this.e = w93Var;
        this.f = l53Var;
        this.h = kpVar;
        this.n = i2fVar;
        if (e69Var != null) {
            mv6Var2 = new mv6(e69Var, (byte) 5);
        } else {
            mv6Var2 = new mv6("ChunkSampleStream");
        }
        this.r = mv6Var2;
        this.s = new e31((byte) 2);
        ArrayList arrayList = new ArrayList();
        this.w = arrayList;
        this.x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new gp9[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        gp9[] gp9VarArr = new gp9[i2];
        yq3Var.getClass();
        gp9 gp9Var = new gp9(mv6Var, yq3Var, vq3Var);
        this.y = gp9Var;
        iArr2[0] = i;
        gp9VarArr[0] = gp9Var;
        int i3 = 0;
        while (i3 < length) {
            gp9 gp9Var2 = new gp9(mv6Var, null, null);
            this.E[i3] = gp9Var2;
            int i4 = i3 + 1;
            gp9VarArr[i4] = gp9Var2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.F = new tg2(iArr2, gp9VarArr, (byte) 8);
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
                og0 og0Var = (og0) this.w.get(i);
                fm4 fm4Var = og0Var.d;
                if (!fm4Var.equals(this.H)) {
                    this.h.i(this.a, fm4Var, og0Var.e, og0Var.f, og0Var.h);
                }
                this.H = fm4Var;
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
        } while (((og0) arrayList.get(i2)).e(0) <= i);
        return i2 - 1;
    }

    public final void C(l53 l53Var) {
        gp9[] gp9VarArr;
        this.I = l53Var;
        gp9 gp9Var = this.y;
        gp9Var.l();
        sq3 sq3Var = gp9Var.h;
        if (sq3Var != null) {
            sq3Var.c(gp9Var.e);
            gp9Var.h = null;
            gp9Var.g = null;
        }
        for (gp9 gp9Var2 : this.E) {
            gp9Var2.l();
            sq3 sq3Var2 = gp9Var2.h;
            if (sq3Var2 != null) {
                sq3Var2.c(gp9Var2.e);
                gp9Var2.h = null;
                gp9Var2.g = null;
            }
        }
        this.r.b0(this);
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
        zg2 zg2Var = (zg2) k86Var;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        if (i != 0) {
            zxa zxaVar = zg2Var.r;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.h.u(new f86(e86Var), zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, i);
    }

    @Override
    public final void U(k86 k86Var, long j, long j2) {
        zg2 zg2Var = (zg2) k86Var;
        this.G = null;
        w93 w93Var = this.e;
        u93[] u93VarArr = w93Var.h;
        if (zg2Var instanceof on5) {
            int e = w93Var.i.e(((on5) zg2Var).d);
            u93 u93Var = u93VarArr[e];
            if (u93Var.d == null) {
                f31 f31Var = u93Var.a;
                f31Var.getClass();
                ah2 a = f31Var.a();
                if (a != null) {
                    i89 i89Var = u93Var.b;
                    u93VarArr[e] = new u93(u93Var.e, i89Var, u93Var.c, u93Var.a, u93Var.f, new hg2(a, i89Var.c, (byte) 1));
                }
            }
        }
        qc8 qc8Var = w93Var.g;
        if (qc8Var != null) {
            long j3 = qc8Var.d;
            if (j3 == -9223372036854775807L || zg2Var.n > j3) {
                qc8Var.d = zg2Var.n;
            }
            qc8Var.e.h = true;
        }
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.n.getClass();
        this.h.q(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        this.f.b(this);
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
        mv6 mv6Var = this.r;
        mv6Var.b();
        this.y.C();
        if (!mv6Var.W()) {
            w93 w93Var = this.e;
            jh0 jh0Var = w93Var.l;
            if (jh0Var == null) {
                w93Var.a.b();
                return;
            }
            throw jh0Var;
        }
    }

    @Override
    public final void c() {
        gp9[] gp9VarArr;
        gp9 gp9Var = this.y;
        gp9Var.G(true);
        sq3 sq3Var = gp9Var.h;
        if (sq3Var != null) {
            sq3Var.c(gp9Var.e);
            gp9Var.h = null;
            gp9Var.g = null;
        }
        for (gp9 gp9Var2 : this.E) {
            gp9Var2.G(true);
            sq3 sq3Var2 = gp9Var2.h;
            if (sq3Var2 != null) {
                sq3Var2.c(gp9Var2.e);
                gp9Var2.h = null;
                gp9Var2.g = null;
            }
        }
        for (u93 u93Var : this.e.h) {
            f31 f31Var = u93Var.a;
            if (f31Var != null) {
                f31Var.a.release();
            }
        }
        l53 l53Var = this.I;
        if (l53Var != null) {
            synchronized (l53Var) {
                qc8 qc8Var = (qc8) l53Var.E.remove(this);
                if (qc8Var != null) {
                    gp9 gp9Var3 = qc8Var.a;
                    gp9Var3.G(true);
                    sq3 sq3Var3 = gp9Var3.h;
                    if (sq3Var3 != null) {
                        sq3Var3.c(null);
                        gp9Var3.h = null;
                        gp9Var3.g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean d() {
        return this.r.W();
    }

    @Override
    public final long g() {
        if (y()) {
            return this.J;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return w().n;
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        boolean z;
        if (!this.P && z()) {
            z = true;
        } else {
            z = false;
        }
        if (!y() && !z && !this.Q) {
            og0 og0Var = this.M;
            gp9 gp9Var = this.y;
            if (og0Var == null || og0Var.e(0) > gp9Var.v()) {
                A();
                return gp9Var.F(sk4Var, z83Var, i, this.S);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final boolean j() {
        if (!y() && this.y.A(this.S)) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j) {
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
        gp9 gp9Var = this.y;
        int x = gp9Var.x(j, z2);
        og0 og0Var = this.M;
        if (og0Var != null) {
            x = Math.min(x, og0Var.e(0) - gp9Var.v());
        }
        gp9Var.L(x);
        A();
        return x;
    }

    @Override
    public final boolean r(defpackage.t86 r60) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh2.r(t86):boolean");
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
        og0 w = w();
        if (!w.c()) {
            ArrayList arrayList = this.w;
            if (arrayList.size() > 1) {
                w = (og0) b00.f(2, arrayList);
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
    public final void t(long j) {
        int size;
        boolean z;
        mv6 mv6Var = this.r;
        if (!mv6Var.S() && !y()) {
            boolean W = mv6Var.W();
            List list = this.x;
            w93 w93Var = this.e;
            boolean z2 = false;
            ArrayList arrayList = this.w;
            if (W) {
                zg2 zg2Var = this.G;
                zg2Var.getClass();
                boolean z3 = zg2Var instanceof og0;
                if (!z3 || !x(arrayList.size() - 1)) {
                    long j2 = this.R;
                    if (j2 == Long.MIN_VALUE || zg2Var.h < j2) {
                        if (w93Var.l == null) {
                            z2 = w93Var.i.g(j, zg2Var, list);
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    mv6Var.p();
                    if (z3) {
                        this.M = (og0) zg2Var;
                        return;
                    }
                    return;
                }
                return;
            }
            int size2 = arrayList.size();
            if (w93Var.l == null && w93Var.i.length() >= 2) {
                size = w93Var.i.l(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size2, size);
            if (this.R != Long.MIN_VALUE) {
                z = false;
                while (min > 0 && ((og0) arrayList.get(min - 1)).h >= this.R) {
                    min--;
                    z = true;
                }
            } else {
                z = false;
            }
            if (min < arrayList.size()) {
                gre.p(!mv6Var.W());
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
                    og0 u = u(min);
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

    public final og0 u(int i) {
        ArrayList arrayList = this.w;
        og0 og0Var = (og0) arrayList.get(i);
        g8c.Y(i, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i2 = 0;
        this.y.o(og0Var.e(0));
        while (true) {
            gp9[] gp9VarArr = this.E;
            if (i2 < gp9VarArr.length) {
                gp9 gp9Var = gp9VarArr[i2];
                i2++;
                gp9Var.o(og0Var.e(i2));
            } else {
                return og0Var;
            }
        }
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        zg2 zg2Var = (zg2) k86Var;
        this.G = null;
        this.M = null;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.n.getClass();
        this.h.o(f86Var, zg2Var.c, this.a, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        if (!z) {
            if (y()) {
                this.y.G(false);
                for (gp9 gp9Var : this.E) {
                    gp9Var.G(false);
                }
            } else if (zg2Var instanceof og0) {
                ArrayList arrayList = this.w;
                u(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f.b(this);
        }
    }

    public final og0 w() {
        return (og0) b00.f(1, this.w);
    }

    @Override
    public final defpackage.i86 w1(defpackage.k86 r28, long r29, long r31, java.io.IOException r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh2.w1(k86, long, long, java.io.IOException, int):i86");
    }

    public final boolean x(int i) {
        int v;
        og0 og0Var = (og0) this.w.get(i);
        if (this.y.v() <= og0Var.e(0)) {
            int i2 = 0;
            do {
                gp9[] gp9VarArr = this.E;
                if (i2 >= gp9VarArr.length) {
                    return false;
                }
                v = gp9VarArr[i2].v();
                i2++;
            } while (v <= og0Var.e(i2));
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
        if ((this.N || this.O) && !this.S && !this.r.S()) {
            return true;
        }
        return false;
    }
}
