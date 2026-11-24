package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class ts8 implements sr6, l74, h86, l86, fp9 {
    public static final Map l0;
    public static final fm4 m0;
    public final mv6 E;
    public final vq2 F;
    public final ns8 G;
    public final ns8 H;
    public final Handler I;
    public rr6 J;
    public pj5 K;
    public ps8[] L;
    public gp9[] M;
    public ss8[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public wtc S;
    public fv9 T;
    public long U;
    public boolean V;
    public byte W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public boolean a0;
    public final o63 b;
    public boolean b0;
    public final yq3 c;
    public int c0;
    public final i2f d;
    public final ArrayList d0;
    public final kp e;
    public boolean e0;
    public final vq3 f;
    public long f0;
    public long g0;
    public final vs8 h;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final mv6 n;
    public final String r;
    public final long s;
    public final fm4 w;
    public final long x;
    public final mv6 y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        l0 = DesugarCollections.unmodifiableMap(hashMap);
        em4 em4Var = new em4();
        em4Var.a = "icy";
        em4Var.s = ud7.n("application/x-icy");
        m0 = new fm4(em4Var);
    }

    public ts8(Uri uri, o63 o63Var, mv6 mv6Var, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, vs8 vs8Var, mv6 mv6Var2, String str, int i, fm4 fm4Var, long j, e69 e69Var) {
        mv6 mv6Var3;
        this.a = uri;
        this.b = o63Var;
        this.c = yq3Var;
        this.f = vq3Var;
        this.d = i2fVar;
        this.e = kpVar;
        this.h = vs8Var;
        this.n = mv6Var2;
        this.r = str;
        this.s = i;
        this.w = fm4Var;
        if (e69Var != null) {
            mv6Var3 = new mv6(e69Var, (byte) 5);
        } else {
            mv6Var3 = new mv6("ProgressiveMediaPeriod");
        }
        this.y = mv6Var3;
        this.E = mv6Var;
        this.x = j;
        this.F = new vq2();
        this.G = new ns8(this, (byte) 1);
        this.H = new ns8(this, (byte) 2);
        this.I = g8c.q(null);
        this.N = new ss8[0];
        this.M = new gp9[0];
        this.L = new ps8[0];
        this.d0 = new ArrayList();
        this.g0 = -9223372036854775807L;
        this.W = (byte) 1;
    }

    public final void A() {
        qs8 qs8Var = new qs8(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            gre.p(n());
            long j = this.X;
            if (j == Long.MIN_VALUE) {
                j = this.U;
            }
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            fv9 fv9Var = this.T;
            fv9Var.getClass();
            long j2 = fv9Var.f(this.g0).a.b;
            long j3 = this.g0;
            qs8Var.h.a = j2;
            qs8Var.s = j3;
            qs8Var.r = true;
            qs8Var.y = false;
            for (gp9 gp9Var : this.M) {
                gp9Var.t = this.g0;
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = h();
        this.y.r0(qs8Var, this, this.d.v3(this.W));
    }

    @Override
    public final void B() {
        this.O = true;
        this.I.post(this.G);
    }

    public final boolean C() {
        if (!this.Z && !n()) {
            return false;
        }
        return true;
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
        qs8 qs8Var = (qs8) k86Var;
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        if (i != 0) {
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.e.u(new f86(e86Var), 1, -1, null, 0, null, qs8Var.s, this.U, i);
    }

    @Override
    public final wxb T(int i, int i2) {
        return y(new ss8(i, false));
    }

    @Override
    public final void Z(k86 k86Var, long j, long j2) {
        long j3;
        qs8 qs8Var = (qs8) k86Var;
        if (this.U == -9223372036854775807L && this.T != null) {
            long j4 = j(true);
            if (j4 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = j4 + 10000;
            }
            this.U = j3;
            this.h.v(j3, this.T, this.V);
        }
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.d.getClass();
        this.e.q(f86Var, 1, -1, null, 0, null, qs8Var.s, this.U);
        this.j0 = true;
        rr6 rr6Var = this.J;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    public final void b() {
        gre.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override
    public final void c() {
        gp9[] gp9VarArr;
        for (gp9 gp9Var : this.M) {
            gp9Var.G(true);
            sq3 sq3Var = gp9Var.h;
            if (sq3Var != null) {
                sq3Var.c(gp9Var.e);
                gp9Var.h = null;
                gp9Var.g = null;
            }
        }
        mv6 mv6Var = this.E;
        j74 j74Var = (j74) mv6Var.c;
        if (j74Var != null) {
            j74Var.release();
            mv6Var.c = null;
        }
        mv6Var.d = null;
    }

    @Override
    public final boolean d() {
        boolean z;
        if (!this.j0 && this.y.W()) {
            vq2 vq2Var = this.F;
            synchronized (vq2Var) {
                z = vq2Var.b;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        boolean[] zArr3;
        txb txbVar;
        k64 k64Var;
        boolean z4;
        boolean z5;
        boolean z6;
        k64[] k64VarArr2 = k64VarArr;
        long j2 = j;
        b();
        wtc wtcVar = this.S;
        txb txbVar2 = (txb) wtcVar.a;
        boolean[] zArr4 = (boolean[]) wtcVar.c;
        int i = this.c0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 < k64VarArr2.length) {
                k64 k64Var2 = k64VarArr2[i3];
                if (k64Var2 != null && Objects.equals(txbVar2.a(txbVar2.b(k64Var2.c())).d[0].t, "application/x-itut-t35")) {
                    z2 = true;
                    break;
                }
                i3++;
            } else {
                z2 = false;
                break;
            }
        }
        int i4 = 0;
        while (true) {
            int length = k64VarArr2.length;
            arrayList = this.d0;
            if (i4 >= length) {
                break;
            }
            ip9 ip9Var = ip9VarArr[i4];
            if (ip9Var != null && (k64VarArr2[i4] == null || !zArr[i4] || (z2 && (ip9Var instanceof c17)))) {
                if (ip9Var instanceof c17) {
                    c17 c17Var = (c17) ip9Var;
                    arrayList.remove(c17Var);
                    int i5 = c17Var.a.a;
                    gre.p(zArr4[i5]);
                    this.c0--;
                    zArr4[i5] = false;
                    int i6 = c17Var.b.a;
                    gre.p(zArr4[i6]);
                    this.c0--;
                    zArr4[i6] = false;
                } else {
                    int i7 = ((rs8) ip9Var).a;
                    gre.p(zArr4[i7]);
                    this.c0--;
                    zArr4[i7] = false;
                }
                ip9VarArr[i4] = null;
            }
            i4++;
        }
        if (!this.Y ? !(j2 == 0 || this.R) : i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i8 = 0;
        boolean z7 = false;
        while (i8 < k64VarArr2.length) {
            if (ip9VarArr[i8] == null && (k64Var = k64VarArr2[i8]) != null) {
                if (k64Var.length() == z) {
                    z4 = z;
                } else {
                    z4 = i2;
                }
                gre.p(z4);
                if (k64Var.k(i2) == 0) {
                    z5 = z;
                } else {
                    z5 = i2;
                }
                gre.p(z5);
                int b = txbVar2.b(k64Var.c());
                gre.p(!zArr4[b]);
                boolean z8 = z;
                this.c0++;
                zArr4[b] = z8;
                z7 |= k64Var.o().z;
                int i9 = i2;
                rs8 rs8Var = new rs8(this, b, k64Var.o().z);
                if (Build.VERSION.SDK_INT >= 37 && !z2 && ud7.m(k64Var.o().t)) {
                    int i10 = i9;
                    while (i10 < txbVar2.a) {
                        if (wj2.e(txbVar2.a(i10).d[i9])) {
                            gre.p(!zArr4[i10]);
                            this.c0++;
                            zArr4[i10] = z8;
                            zArr3 = zArr4;
                            txbVar = txbVar2;
                            ?? c17Var2 = new c17(rs8Var, new rs8(this, i10, i9), k64Var.o());
                            arrayList.add(c17Var2);
                            rs8Var = c17Var2;
                            break;
                        }
                        i10++;
                        i9 = 0;
                    }
                }
                zArr3 = zArr4;
                txbVar = txbVar2;
                ip9VarArr[i8] = rs8Var;
                zArr2[i8] = z8;
                if (!z3) {
                    gp9 gp9Var = this.M[b];
                    if (gp9Var.v() != 0 && !gp9Var.J(j2, z8)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z3 = z6;
                }
            } else {
                zArr3 = zArr4;
                txbVar = txbVar2;
            }
            i8++;
            k64VarArr2 = k64VarArr;
            zArr4 = zArr3;
            txbVar2 = txbVar;
            i2 = 0;
            z = true;
        }
        if (this.a0 || !this.Y) {
            this.a0 = z7;
        }
        if (this.c0 == 0) {
            this.h0 = false;
            this.Z = false;
            this.a0 = false;
            mv6 mv6Var = this.y;
            if (mv6Var.W()) {
                for (gp9 gp9Var2 : this.M) {
                    gp9Var2.l();
                }
                mv6Var.p();
            } else {
                boolean z9 = false;
                this.j0 = false;
                gp9[] gp9VarArr = this.M;
                int length2 = gp9VarArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    gp9VarArr[i11].G(z9);
                    i11++;
                    z9 = false;
                }
            }
        } else if (z3) {
            j2 = l(j2);
            for (int i12 = 0; i12 < ip9VarArr.length; i12++) {
                ip9 ip9Var2 = ip9VarArr[i12];
                if (ip9Var2 != null) {
                    zArr2[i12] = true;
                    if (ip9Var2 instanceof c17) {
                        c17 c17Var3 = (c17) ip9Var2;
                        c17Var3.e.clear();
                        c17Var3.h = null;
                        c17Var3.n = -9223372036854775807L;
                        c17Var3.r = false;
                        c17Var3.s = false;
                        c17Var3.d.clear();
                    }
                }
            }
        }
        this.Y = true;
        return j2;
    }

    @Override
    public final void f() {
        this.b0 = true;
    }

    @Override
    public final void f0(fv9 fv9Var) {
        this.I.post(new ll8(this, fv9Var, (byte) 19));
    }

    @Override
    public final long g() {
        return s();
    }

    public final int h() {
        int i = 0;
        for (gp9 gp9Var : this.M) {
            i += gp9Var.z();
        }
        return i;
    }

    @Override
    public final long i(long j, gv9 gv9Var) {
        b();
        if (!this.T.c()) {
            return 0L;
        }
        ev9 f = this.T.f(j);
        return gv9Var.a(j, f.a.a, f.b.a);
    }

    public final long j(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.M.length; i++) {
            if (!z) {
                wtc wtcVar = this.S;
                wtcVar.getClass();
                if (!((boolean[]) wtcVar.c)[i]) {
                }
            }
            j = Math.max(j, this.M[i].s());
        }
        return j;
    }

    @Override
    public final void k() {
        int v3 = this.d.v3(this.W);
        mv6 mv6Var = this.y;
        IOException iOException = (IOException) mv6Var.d;
        if (iOException == null) {
            j86 j86Var = (j86) mv6Var.c;
            if (j86Var != null) {
                if (v3 == Integer.MIN_VALUE) {
                    v3 = j86Var.a;
                }
                IOException iOException2 = j86Var.e;
                if (iOException2 != null && j86Var.f > v3) {
                    throw iOException2;
                }
            }
            if (this.j0 && !this.P) {
                throw av7.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long l(long j) {
        boolean z;
        int i;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            c17 c17Var = (c17) obj;
            c17Var.e.clear();
            c17Var.h = null;
            c17Var.n = -9223372036854775807L;
            c17Var.r = false;
            c17Var.s = false;
            c17Var.d.clear();
        }
        b();
        boolean[] zArr = (boolean[]) this.S.b;
        if (!this.T.c()) {
            j = 0;
        }
        this.Z = false;
        if (this.f0 == j) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = j;
        if (n()) {
            this.g0 = j;
            return j;
        }
        byte b = this.W;
        mv6 mv6Var = this.y;
        if (b != 7 && (this.j0 || mv6Var.W())) {
            int length = this.M.length;
            for (int i3 = 0; i3 < length; i3++) {
                gp9 gp9Var = this.M[i3];
                if (!this.L[i3].d.get()) {
                    if (this.R) {
                        gp9Var.I(gp9Var.q);
                    } else {
                        long r = gp9Var.r();
                        if (r != Long.MIN_VALUE && j <= r && (i = gp9Var.q) == 0 && z) {
                            gp9Var.I(i);
                        } else if (gp9Var.J(j, this.j0)) {
                            continue;
                        } else if (!zArr[i3] && this.Q) {
                        }
                    }
                }
            }
            return j;
        }
        this.h0 = false;
        this.g0 = j;
        this.j0 = false;
        this.a0 = false;
        if (mv6Var.W()) {
            for (gp9 gp9Var2 : this.M) {
                gp9Var2.l();
            }
            mv6Var.p();
            return j;
        }
        mv6Var.d = null;
        for (gp9 gp9Var3 : this.M) {
            gp9Var3.G(false);
        }
        return j;
    }

    @Override
    public final void m(long j) {
        if (!this.R) {
            b();
            if (!n()) {
                boolean[] zArr = (boolean[]) this.S.c;
                int length = this.M.length;
                for (int i = 0; i < length; i++) {
                    this.M[i].k(j, zArr[i]);
                }
            }
        }
    }

    public final boolean n() {
        if (this.g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long o() {
        if (!this.b0 && this.a0) {
            this.a0 = false;
            return this.f0;
        } else if (this.Z) {
            if (this.j0 || h() > this.i0) {
                this.Z = false;
                return this.f0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final void p(rr6 rr6Var, long j) {
        this.J = rr6Var;
        fm4 fm4Var = this.w;
        if (fm4Var != null) {
            T(0, 3).g(fm4Var);
            z(new in5(-9223372036854775807L, new long[]{0}, new long[]{0}));
            B();
            this.g0 = j;
            return;
        }
        this.F.e();
        A();
    }

    @Override
    public final txb q() {
        b();
        return (txb) this.S.a;
    }

    @Override
    public final boolean r(t86 t86Var) {
        if (!this.j0) {
            mv6 mv6Var = this.y;
            if (!mv6Var.S() && !this.h0) {
                if ((!this.P && this.w == null) || this.c0 != 0) {
                    boolean e = this.F.e();
                    if (!mv6Var.W()) {
                        A();
                        return true;
                    }
                    return e;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long s() {
        long j;
        boolean z;
        b();
        if (this.j0 || this.c0 == 0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.g0;
        }
        if (this.Q) {
            int length = this.M.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                wtc wtcVar = this.S;
                if (((boolean[]) wtcVar.b)[i] && ((boolean[]) wtcVar.c)[i]) {
                    gp9 gp9Var = this.M[i];
                    synchronized (gp9Var) {
                        z = gp9Var.z;
                    }
                    if (!z) {
                        j = Math.min(j, this.M[i].s());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.f0;
        }
        return j;
    }

    @Override
    public final void t(long j) {
        boolean z;
        if (this.c0 > 0 && !n()) {
            boolean z2 = false;
            if (this.X != Long.MIN_VALUE) {
                b();
                boolean z3 = true;
                int i = 0;
                while (true) {
                    gp9[] gp9VarArr = this.M;
                    if (i >= gp9VarArr.length) {
                        break;
                    }
                    wtc wtcVar = this.S;
                    if (((boolean[]) wtcVar.c)[i] && (((boolean[]) wtcVar.b)[i] || !this.Q)) {
                        gp9 gp9Var = gp9VarArr[i];
                        synchronized (gp9Var) {
                            if (gp9Var.x != -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        z3 &= z;
                    }
                    i++;
                }
                z2 = z3;
            }
            if (z2) {
                this.j0 = true;
            }
        }
    }

    public final void u() {
        boolean z;
        boolean z2;
        ld7 a;
        char c;
        long j = this.x;
        if (!this.k0 && !this.P && this.O && this.T != null) {
            boolean z3 = false;
            for (gp9 gp9Var : this.M) {
                if (gp9Var.y() == null) {
                    return;
                }
            }
            vq2 vq2Var = this.F;
            synchronized (vq2Var) {
                vq2Var.b = false;
            }
            int length = this.M.length;
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                char c2 = 1;
                if (i2 >= length) {
                    break;
                }
                fm4 y = this.M[i2].y();
                y.getClass();
                int h = ud7.h(y.t);
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h != 4) {
                                c = 0;
                            } else {
                                c = 2;
                            }
                        } else {
                            c = 1;
                        }
                    } else {
                        c = 4;
                    }
                } else {
                    c = 3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                c2 = 0;
                            } else {
                                c2 = 2;
                            }
                        }
                    } else {
                        c2 = 4;
                    }
                } else {
                    c2 = 3;
                }
                if (c > c2) {
                    i3 = i2;
                    i = h;
                }
                i2++;
            }
            sxb[] sxbVarArr = new sxb[length];
            boolean[] zArr = new boolean[length];
            int i4 = 0;
            while (i4 < length) {
                fm4 y2 = this.M[i4].y();
                y2.getClass();
                String str = y2.t;
                boolean i5 = ud7.i(str);
                if (!i5 && !ud7.m(str)) {
                    z = z3;
                } else {
                    z = true;
                }
                zArr[i4] = z;
                boolean z4 = z3;
                this.Q |= z;
                boolean k = ud7.k(str);
                if (j != -9223372036854775807L && length == 1 && k) {
                    z2 = true;
                } else {
                    z2 = z4 ? 1 : 0;
                }
                this.R = z2;
                pj5 pj5Var = this.K;
                if (pj5Var != null) {
                    int i6 = pj5Var.a;
                    if (i5 || this.N[i4].b) {
                        ld7 ld7Var = y2.m;
                        if (ld7Var == null) {
                            jd7[] jd7VarArr = new jd7[1];
                            jd7VarArr[z4 ? 1 : 0] = pj5Var;
                            a = new ld7(jd7VarArr);
                        } else {
                            jd7[] jd7VarArr2 = new jd7[1];
                            jd7VarArr2[z4 ? 1 : 0] = pj5Var;
                            a = ld7Var.a(jd7VarArr2);
                        }
                        em4 a2 = y2.a();
                        a2.l = a;
                        y2 = new fm4(a2);
                    }
                    if (i5 && y2.i == -1 && y2.j == -1 && i6 != -1) {
                        em4 a3 = y2.a();
                        a3.i = i6;
                        y2 = new fm4(a3);
                    }
                }
                int w = this.c.w(y2);
                em4 a4 = y2.a();
                a4.W = w;
                fm4 fm4Var = new fm4(a4);
                if (i4 != i3) {
                    em4 a5 = fm4Var.a();
                    a5.m = Integer.toString(i3);
                    fm4Var = new fm4(a5);
                }
                String num = Integer.toString(i4);
                fm4[] fm4VarArr = new fm4[1];
                fm4VarArr[z4 ? 1 : 0] = fm4Var;
                sxbVarArr[i4] = new sxb(num, fm4VarArr);
                this.M[i4].K(this.X);
                i4++;
                z3 = z4 ? 1 : 0;
            }
            txb txbVar = new txb(sxbVarArr);
            ?? obj = new Object();
            obj.a = txbVar;
            obj.b = zArr;
            int i7 = txbVar.a;
            obj.c = new boolean[i7];
            obj.d = new boolean[i7];
            this.S = obj;
            if (this.R && this.U == -9223372036854775807L) {
                this.U = j;
                this.T = new os8(this, this.T);
            }
            this.h.v(this.U, this.T, this.V);
            this.P = true;
            rr6 rr6Var = this.J;
            rr6Var.getClass();
            rr6Var.a(this);
        }
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        qs8 qs8Var = (qs8) k86Var;
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.d.getClass();
        this.e.o(f86Var, 1, -1, null, 0, null, qs8Var.s, this.U);
        if (!z) {
            for (gp9 gp9Var : this.M) {
                gp9Var.G(false);
            }
            if (this.c0 > 0) {
                rr6 rr6Var = this.J;
                rr6Var.getClass();
                rr6Var.b(this);
            }
        }
    }

    public final void w(int i) {
        b();
        wtc wtcVar = this.S;
        boolean[] zArr = (boolean[]) wtcVar.d;
        if (!zArr[i]) {
            fm4 fm4Var = ((txb) wtcVar.a).a(i).d[0];
            this.e.i(ud7.h(fm4Var.t), fm4Var, 0, null, this.f0);
            zArr[i] = true;
        }
    }

    @Override
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        long min;
        int i2;
        i86 i86Var;
        fv9 fv9Var;
        qs8 qs8Var = (qs8) k86Var;
        zxa zxaVar = qs8Var.c;
        e86 e86Var = new e86(qs8Var.a, qs8Var.w, j);
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        String str = g8c.a;
        this.d.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof av7) || (th instanceof FileNotFoundException) || (th instanceof ig5) || (th instanceof m86) || ((th instanceof r63) && ((r63) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            i86Var = mv6.E;
        } else {
            int h = h();
            if (h > this.i0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.e0 && ((fv9Var = this.T) == null || fv9Var.h() == -9223372036854775807L)) {
                if (this.P && !C()) {
                    this.h0 = true;
                    i86Var = mv6.y;
                } else {
                    this.Z = this.P;
                    this.f0 = 0L;
                    this.i0 = 0;
                    for (gp9 gp9Var : this.M) {
                        gp9Var.G(false);
                    }
                    qs8Var.h.a = 0L;
                    qs8Var.s = 0L;
                    qs8Var.r = true;
                    qs8Var.y = false;
                }
            } else {
                this.i0 = h;
            }
            i86Var = new i86(i2, min);
        }
        this.e.r(f86Var, 1, -1, null, 0, null, qs8Var.s, this.U, iOException, !i86Var.a());
        return i86Var;
    }

    public final void x(int i) {
        b();
        if (this.h0) {
            if ((!this.Q || ((boolean[]) this.S.b)[i]) && !this.M[i].A(false)) {
                this.g0 = 0L;
                this.h0 = false;
                this.Z = true;
                this.f0 = 0L;
                this.i0 = 0;
                for (gp9 gp9Var : this.M) {
                    gp9Var.G(false);
                }
                rr6 rr6Var = this.J;
                rr6Var.getClass();
                rr6Var.b(this);
            }
        }
    }

    public final wxb y(ss8 ss8Var) {
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            if (ss8Var.equals(this.N[i])) {
                return this.M[i];
            }
        }
        if (this.O) {
            lad.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + ss8Var.a + ") after finishing tracks.");
            return new yn3();
        }
        gp9 gp9Var = new gp9(this.n, this.c, this.f);
        ps8 ps8Var = new ps8(gp9Var);
        gp9Var.f = this;
        int i2 = length + 1;
        ss8[] ss8VarArr = (ss8[]) Arrays.copyOf(this.N, i2);
        ss8VarArr[length] = ss8Var;
        String str = g8c.a;
        this.N = ss8VarArr;
        gp9[] gp9VarArr = (gp9[]) Arrays.copyOf(this.M, i2);
        gp9VarArr[length] = gp9Var;
        this.M = gp9VarArr;
        ps8[] ps8VarArr = (ps8[]) Arrays.copyOf(this.L, i2);
        ps8VarArr[length] = ps8Var;
        this.L = ps8VarArr;
        return ps8Var;
    }

    public final void z(fv9 fv9Var) {
        fv9 oc0Var;
        boolean z;
        if (this.K == null) {
            oc0Var = fv9Var;
        } else {
            oc0Var = new oc0(-9223372036854775807L);
        }
        this.T = oc0Var;
        this.U = fv9Var.h();
        byte b = 1;
        if (!this.e0 && fv9Var.h() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.V = z;
        if (z) {
            b = 7;
        }
        this.W = b;
        if (this.P) {
            this.h.v(this.U, fv9Var, z);
        } else {
            u();
        }
    }
}
