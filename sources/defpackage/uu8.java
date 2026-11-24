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
public final class uu8 implements tt6, u84, ga6, ka6, gr9 {
    public static final Map l0;
    public static final go4 m0;
    public final mx6 E;
    public final gs2 F;
    public final ou8 G;
    public final ou8 H;
    public final Handler I;
    public st6 J;
    public ol5 K;
    public qu8[] L;
    public hr9[] M;
    public tu8[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public e7a S;
    public ix9 T;
    public long U;
    public boolean V;
    public byte W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public boolean a0;
    public final a83 b;
    public boolean b0;
    public final is3 c;
    public int c0;
    public final k4f d;
    public final ArrayList d0;
    public final kq e;
    public boolean e0;
    public final fs3 f;
    public long f0;
    public long g0;
    public final wu8 h;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final mx6 n;
    public final String r;
    public final long s;
    public final go4 w;
    public final long x;
    public final mx6 y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        l0 = DesugarCollections.unmodifiableMap(hashMap);
        fo4 fo4Var = new fo4();
        fo4Var.a = "icy";
        fo4Var.s = wf7.n("application/x-icy");
        m0 = new go4(fo4Var);
    }

    public uu8(Uri uri, a83 a83Var, mx6 mx6Var, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, wu8 wu8Var, mx6 mx6Var2, String str, int i, go4 go4Var, long j, g89 g89Var) {
        mx6 mx6Var3;
        this.a = uri;
        this.b = a83Var;
        this.c = is3Var;
        this.f = fs3Var;
        this.d = k4fVar;
        this.e = kqVar;
        this.h = wu8Var;
        this.n = mx6Var2;
        this.r = str;
        this.s = i;
        this.w = go4Var;
        if (g89Var != null) {
            mx6Var3 = new mx6(g89Var, (byte) 5);
        } else {
            mx6Var3 = new mx6("ProgressiveMediaPeriod");
        }
        this.y = mx6Var3;
        this.E = mx6Var;
        this.x = j;
        this.F = new gs2();
        this.G = new ou8(this, (byte) 1);
        this.H = new ou8(this, (byte) 2);
        this.I = hac.q(null);
        this.N = new tu8[0];
        this.M = new hr9[0];
        this.L = new qu8[0];
        this.d0 = new ArrayList();
        this.g0 = -9223372036854775807L;
        this.W = (byte) 1;
    }

    public final void A() {
        ru8 ru8Var = new ru8(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            jte.p(p());
            long j = this.X;
            if (j == Long.MIN_VALUE) {
                j = this.U;
            }
            if (j != -9223372036854775807L && this.g0 > j) {
                this.j0 = true;
                this.g0 = -9223372036854775807L;
                return;
            }
            ix9 ix9Var = this.T;
            ix9Var.getClass();
            long j2 = ix9Var.f(this.g0).a.b;
            long j3 = this.g0;
            ru8Var.h.a = j2;
            ru8Var.s = j3;
            ru8Var.r = true;
            ru8Var.y = false;
            for (hr9 hr9Var : this.M) {
                hr9Var.t = this.g0;
            }
            this.g0 = -9223372036854775807L;
        }
        this.i0 = i();
        this.y.v0(ru8Var, this, this.d.v3(this.W));
    }

    @Override
    public final void B() {
        this.O = true;
        this.I.post(this.G);
    }

    public final boolean C() {
        if (!this.Z && !p()) {
            return false;
        }
        return true;
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        ru8 ru8Var = (ru8) ja6Var;
        c0b c0bVar = ru8Var.c;
        da6 da6Var = new da6(ru8Var.a, ru8Var.w, j);
        if (i != 0) {
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        this.e.u(new ea6(da6Var), 1, -1, null, 0, null, ru8Var.s, this.U, i);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final void b() {
        hr9[] hr9VarArr;
        for (hr9 hr9Var : this.M) {
            hr9Var.G(true);
            cs3 cs3Var = hr9Var.h;
            if (cs3Var != null) {
                cs3Var.c(hr9Var.e);
                hr9Var.h = null;
                hr9Var.g = null;
            }
        }
        mx6 mx6Var = this.E;
        s84 s84Var = (s84) mx6Var.c;
        if (s84Var != null) {
            s84Var.release();
            mx6Var.c = null;
        }
        mx6Var.d = null;
    }

    @Override
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        boolean[] zArr3;
        vzb vzbVar;
        t74 t74Var;
        boolean z4;
        boolean z5;
        boolean z6;
        t74[] t74VarArr2 = t74VarArr;
        long j2 = j;
        d();
        e7a e7aVar = this.S;
        vzb vzbVar2 = (vzb) e7aVar.a;
        boolean[] zArr4 = (boolean[]) e7aVar.c;
        int i = this.c0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 < t74VarArr2.length) {
                t74 t74Var2 = t74VarArr2[i3];
                if (t74Var2 != null && Objects.equals(vzbVar2.a(vzbVar2.b(t74Var2.c())).d[0].t, "application/x-itut-t35")) {
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
            int length = t74VarArr2.length;
            arrayList = this.d0;
            if (i4 >= length) {
                break;
            }
            jr9 jr9Var = jr9VarArr[i4];
            if (jr9Var != null && (t74VarArr2[i4] == null || !zArr[i4] || (z2 && (jr9Var instanceof c37)))) {
                if (jr9Var instanceof c37) {
                    c37 c37Var = (c37) jr9Var;
                    arrayList.remove(c37Var);
                    int i5 = c37Var.a.a;
                    jte.p(zArr4[i5]);
                    this.c0--;
                    zArr4[i5] = false;
                    int i6 = c37Var.b.a;
                    jte.p(zArr4[i6]);
                    this.c0--;
                    zArr4[i6] = false;
                } else {
                    int i7 = ((su8) jr9Var).a;
                    jte.p(zArr4[i7]);
                    this.c0--;
                    zArr4[i7] = false;
                }
                jr9VarArr[i4] = null;
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
        while (i8 < t74VarArr2.length) {
            if (jr9VarArr[i8] == null && (t74Var = t74VarArr2[i8]) != null) {
                if (t74Var.length() == z) {
                    z4 = z;
                } else {
                    z4 = i2;
                }
                jte.p(z4);
                if (t74Var.k(i2) == 0) {
                    z5 = z;
                } else {
                    z5 = i2;
                }
                jte.p(z5);
                int b = vzbVar2.b(t74Var.c());
                jte.p(!zArr4[b]);
                boolean z8 = z;
                this.c0++;
                zArr4[b] = z8;
                z7 |= t74Var.o().z;
                int i9 = i2;
                su8 su8Var = new su8(this, b, t74Var.o().z);
                if (Build.VERSION.SDK_INT >= 37 && !z2 && wf7.m(t74Var.o().t)) {
                    int i10 = i9;
                    while (i10 < vzbVar2.a) {
                        if (jl2.e(vzbVar2.a(i10).d[i9])) {
                            jte.p(!zArr4[i10]);
                            this.c0++;
                            zArr4[i10] = z8;
                            zArr3 = zArr4;
                            vzbVar = vzbVar2;
                            ?? c37Var2 = new c37(su8Var, new su8(this, i10, i9), t74Var.o());
                            arrayList.add(c37Var2);
                            su8Var = c37Var2;
                            break;
                        }
                        i10++;
                        i9 = 0;
                    }
                }
                zArr3 = zArr4;
                vzbVar = vzbVar2;
                jr9VarArr[i8] = su8Var;
                zArr2[i8] = z8;
                if (!z3) {
                    hr9 hr9Var = this.M[b];
                    if (hr9Var.v() != 0 && !hr9Var.J(j2, z8)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z3 = z6;
                }
            } else {
                zArr3 = zArr4;
                vzbVar = vzbVar2;
            }
            i8++;
            t74VarArr2 = t74VarArr;
            zArr4 = zArr3;
            vzbVar2 = vzbVar;
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
            mx6 mx6Var = this.y;
            if (mx6Var.Y()) {
                for (hr9 hr9Var2 : this.M) {
                    hr9Var2.l();
                }
                mx6Var.v();
            } else {
                boolean z9 = false;
                this.j0 = false;
                hr9[] hr9VarArr = this.M;
                int length2 = hr9VarArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    hr9VarArr[i11].G(z9);
                    i11++;
                    z9 = false;
                }
            }
        } else if (z3) {
            j2 = k(j2);
            for (int i12 = 0; i12 < jr9VarArr.length; i12++) {
                jr9 jr9Var2 = jr9VarArr[i12];
                if (jr9Var2 != null) {
                    zArr2[i12] = true;
                    if (jr9Var2 instanceof c37) {
                        c37 c37Var3 = (c37) jr9Var2;
                        c37Var3.e.clear();
                        c37Var3.h = null;
                        c37Var3.n = -9223372036854775807L;
                        c37Var3.r = false;
                        c37Var3.s = false;
                        c37Var3.d.clear();
                    }
                }
            }
        }
        this.Y = true;
        return j2;
    }

    @Override
    public final yzb c0(int i, int i2) {
        return y(new tu8(i, false));
    }

    public final void d() {
        jte.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override
    public final void e() {
        this.b0 = true;
    }

    @Override
    public final boolean f() {
        boolean z;
        if (!this.j0 && this.y.Y()) {
            gs2 gs2Var = this.F;
            synchronized (gs2Var) {
                z = gs2Var.b;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f0(ix9 ix9Var) {
        this.I.post(new mn8(this, ix9Var, (byte) 21));
    }

    @Override
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        long min;
        int i2;
        ha6 ha6Var;
        ix9 ix9Var;
        ru8 ru8Var = (ru8) ja6Var;
        c0b c0bVar = ru8Var.c;
        da6 da6Var = new da6(ru8Var.a, ru8Var.w, j);
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        String str = hac.a;
        this.d.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof bx7) || (th instanceof FileNotFoundException) || (th instanceof hi5) || (th instanceof la6) || ((th instanceof d83) && ((d83) th).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            ha6Var = mx6.E;
        } else {
            int i3 = i();
            if (i3 > this.i0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.e0 && ((ix9Var = this.T) == null || ix9Var.h() == -9223372036854775807L)) {
                if (this.P && !C()) {
                    this.h0 = true;
                    ha6Var = mx6.y;
                } else {
                    this.Z = this.P;
                    this.f0 = 0L;
                    this.i0 = 0;
                    for (hr9 hr9Var : this.M) {
                        hr9Var.G(false);
                    }
                    ru8Var.h.a = 0L;
                    ru8Var.s = 0L;
                    ru8Var.r = true;
                    ru8Var.y = false;
                }
            } else {
                this.i0 = i3;
            }
            ha6Var = new ha6(i2, min);
        }
        this.e.r(ea6Var, 1, -1, null, 0, null, ru8Var.s, this.U, iOException, !ha6Var.a());
        return ha6Var;
    }

    @Override
    public final long g() {
        return s();
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        long j3;
        ru8 ru8Var = (ru8) ja6Var;
        if (this.U == -9223372036854775807L && this.T != null) {
            long m = m(true);
            if (m == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = m + 10000;
            }
            this.U = j3;
            this.h.v(j3, this.T, this.V);
        }
        c0b c0bVar = ru8Var.c;
        da6 da6Var = new da6(ru8Var.a, ru8Var.w, j);
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.d.getClass();
        this.e.q(ea6Var, 1, -1, null, 0, null, ru8Var.s, this.U);
        this.j0 = true;
        st6 st6Var = this.J;
        st6Var.getClass();
        st6Var.b(this);
    }

    @Override
    public final long h(long j, jx9 jx9Var) {
        d();
        if (!this.T.c()) {
            return 0L;
        }
        hx9 f = this.T.f(j);
        return jx9Var.a(j, f.a.a, f.b.a);
    }

    public final int i() {
        int i = 0;
        for (hr9 hr9Var : this.M) {
            i += hr9Var.z();
        }
        return i;
    }

    @Override
    public final void j() {
        int v3 = this.d.v3(this.W);
        mx6 mx6Var = this.y;
        IOException iOException = (IOException) mx6Var.d;
        if (iOException == null) {
            ia6 ia6Var = (ia6) mx6Var.c;
            if (ia6Var != null) {
                if (v3 == Integer.MIN_VALUE) {
                    v3 = ia6Var.a;
                }
                IOException iOException2 = ia6Var.e;
                if (iOException2 != null && ia6Var.f > v3) {
                    throw iOException2;
                }
            }
            if (this.j0 && !this.P) {
                throw bx7.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final long k(long j) {
        boolean z;
        int i;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            c37 c37Var = (c37) obj;
            c37Var.e.clear();
            c37Var.h = null;
            c37Var.n = -9223372036854775807L;
            c37Var.r = false;
            c37Var.s = false;
            c37Var.d.clear();
        }
        d();
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
        if (p()) {
            this.g0 = j;
            return j;
        }
        byte b = this.W;
        mx6 mx6Var = this.y;
        if (b != 7 && (this.j0 || mx6Var.Y())) {
            int length = this.M.length;
            for (int i3 = 0; i3 < length; i3++) {
                hr9 hr9Var = this.M[i3];
                if (!this.L[i3].d.get()) {
                    if (this.R) {
                        hr9Var.I(hr9Var.q);
                    } else {
                        long r = hr9Var.r();
                        if (r != Long.MIN_VALUE && j <= r && (i = hr9Var.q) == 0 && z) {
                            hr9Var.I(i);
                        } else if (hr9Var.J(j, this.j0)) {
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
        if (mx6Var.Y()) {
            for (hr9 hr9Var2 : this.M) {
                hr9Var2.l();
            }
            mx6Var.v();
            return j;
        }
        mx6Var.d = null;
        for (hr9 hr9Var3 : this.M) {
            hr9Var3.G(false);
        }
        return j;
    }

    @Override
    public final void l(long j) {
        if (!this.R) {
            d();
            if (!p()) {
                boolean[] zArr = (boolean[]) this.S.c;
                int length = this.M.length;
                for (int i = 0; i < length; i++) {
                    this.M[i].k(j, zArr[i]);
                }
            }
        }
    }

    public final long m(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.M.length; i++) {
            if (!z) {
                e7a e7aVar = this.S;
                e7aVar.getClass();
                if (!((boolean[]) e7aVar.c)[i]) {
                }
            }
            j = Math.max(j, this.M[i].s());
        }
        return j;
    }

    @Override
    public final long n() {
        if (!this.b0 && this.a0) {
            this.a0 = false;
            return this.f0;
        } else if (this.Z) {
            if (this.j0 || i() > this.i0) {
                this.Z = false;
                return this.f0;
            }
            return -9223372036854775807L;
        } else {
            return -9223372036854775807L;
        }
    }

    @Override
    public final void o(st6 st6Var, long j) {
        this.J = st6Var;
        go4 go4Var = this.w;
        if (go4Var != null) {
            c0(0, 3).g(go4Var);
            z(new ip5(-9223372036854775807L, new long[]{0}, new long[]{0}));
            B();
            this.g0 = j;
            return;
        }
        this.F.e();
        A();
    }

    public final boolean p() {
        if (this.g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final vzb q() {
        d();
        return (vzb) this.S.a;
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        if (!this.j0) {
            mx6 mx6Var = this.y;
            if (!mx6Var.U() && !this.h0) {
                if ((!this.P && this.w == null) || this.c0 != 0) {
                    boolean e = this.F.e();
                    if (!mx6Var.Y()) {
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
        d();
        if (this.j0 || this.c0 == 0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.g0;
        }
        if (this.Q) {
            int length = this.M.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                e7a e7aVar = this.S;
                if (((boolean[]) e7aVar.b)[i] && ((boolean[]) e7aVar.c)[i]) {
                    hr9 hr9Var = this.M[i];
                    synchronized (hr9Var) {
                        z = hr9Var.z;
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
            j = m(false);
        }
        if (j == Long.MIN_VALUE) {
            return this.f0;
        }
        return j;
    }

    @Override
    public final void t(long j) {
        boolean z;
        if (this.c0 > 0 && !p()) {
            boolean z2 = false;
            if (this.X != Long.MIN_VALUE) {
                d();
                boolean z3 = true;
                int i = 0;
                while (true) {
                    hr9[] hr9VarArr = this.M;
                    if (i >= hr9VarArr.length) {
                        break;
                    }
                    e7a e7aVar = this.S;
                    if (((boolean[]) e7aVar.c)[i] && (((boolean[]) e7aVar.b)[i] || !this.Q)) {
                        hr9 hr9Var = hr9VarArr[i];
                        synchronized (hr9Var) {
                            if (hr9Var.x != -1) {
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
        nf7 a;
        char c;
        long j = this.x;
        if (!this.k0 && !this.P && this.O && this.T != null) {
            boolean z3 = false;
            for (hr9 hr9Var : this.M) {
                if (hr9Var.y() == null) {
                    return;
                }
            }
            gs2 gs2Var = this.F;
            synchronized (gs2Var) {
                gs2Var.b = false;
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
                go4 y = this.M[i2].y();
                y.getClass();
                int h = wf7.h(y.t);
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
            uzb[] uzbVarArr = new uzb[length];
            boolean[] zArr = new boolean[length];
            int i4 = 0;
            while (i4 < length) {
                go4 y2 = this.M[i4].y();
                y2.getClass();
                String str = y2.t;
                boolean i5 = wf7.i(str);
                if (!i5 && !wf7.m(str)) {
                    z = z3;
                } else {
                    z = true;
                }
                zArr[i4] = z;
                boolean z4 = z3;
                this.Q |= z;
                boolean k = wf7.k(str);
                if (j != -9223372036854775807L && length == 1 && k) {
                    z2 = true;
                } else {
                    z2 = z4 ? 1 : 0;
                }
                this.R = z2;
                ol5 ol5Var = this.K;
                if (ol5Var != null) {
                    int i6 = ol5Var.a;
                    if (i5 || this.N[i4].b) {
                        nf7 nf7Var = y2.m;
                        if (nf7Var == null) {
                            lf7[] lf7VarArr = new lf7[1];
                            lf7VarArr[z4 ? 1 : 0] = ol5Var;
                            a = new nf7(lf7VarArr);
                        } else {
                            lf7[] lf7VarArr2 = new lf7[1];
                            lf7VarArr2[z4 ? 1 : 0] = ol5Var;
                            a = nf7Var.a(lf7VarArr2);
                        }
                        fo4 a2 = y2.a();
                        a2.l = a;
                        y2 = new go4(a2);
                    }
                    if (i5 && y2.i == -1 && y2.j == -1 && i6 != -1) {
                        fo4 a3 = y2.a();
                        a3.i = i6;
                        y2 = new go4(a3);
                    }
                }
                int x = this.c.x(y2);
                fo4 a4 = y2.a();
                a4.W = x;
                go4 go4Var = new go4(a4);
                if (i4 != i3) {
                    fo4 a5 = go4Var.a();
                    a5.m = Integer.toString(i3);
                    go4Var = new go4(a5);
                }
                String num = Integer.toString(i4);
                go4[] go4VarArr = new go4[1];
                go4VarArr[z4 ? 1 : 0] = go4Var;
                uzbVarArr[i4] = new uzb(num, go4VarArr);
                this.M[i4].K(this.X);
                i4++;
                z3 = z4 ? 1 : 0;
            }
            vzb vzbVar = new vzb(uzbVarArr);
            ?? obj = new Object();
            obj.a = vzbVar;
            obj.b = zArr;
            int i7 = vzbVar.a;
            obj.c = new boolean[i7];
            obj.d = new boolean[i7];
            this.S = obj;
            if (this.R && this.U == -9223372036854775807L) {
                this.U = j;
                this.T = new pu8(this, this.T);
            }
            this.h.v(this.U, this.T, this.V);
            this.P = true;
            st6 st6Var = this.J;
            st6Var.getClass();
            st6Var.a(this);
        }
    }

    public final void v(int i) {
        d();
        e7a e7aVar = this.S;
        boolean[] zArr = (boolean[]) e7aVar.d;
        if (!zArr[i]) {
            go4 go4Var = ((vzb) e7aVar.a).a(i).d[0];
            this.e.i(wf7.h(go4Var.t), go4Var, 0, null, this.f0);
            zArr[i] = true;
        }
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        ru8 ru8Var = (ru8) ja6Var;
        c0b c0bVar = ru8Var.c;
        da6 da6Var = new da6(ru8Var.a, ru8Var.w, j);
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.d.getClass();
        this.e.o(ea6Var, 1, -1, null, 0, null, ru8Var.s, this.U);
        if (!z) {
            for (hr9 hr9Var : this.M) {
                hr9Var.G(false);
            }
            if (this.c0 > 0) {
                st6 st6Var = this.J;
                st6Var.getClass();
                st6Var.b(this);
            }
        }
    }

    public final void x(int i) {
        d();
        if (this.h0) {
            if ((!this.Q || ((boolean[]) this.S.b)[i]) && !this.M[i].A(false)) {
                this.g0 = 0L;
                this.h0 = false;
                this.Z = true;
                this.f0 = 0L;
                this.i0 = 0;
                for (hr9 hr9Var : this.M) {
                    hr9Var.G(false);
                }
                st6 st6Var = this.J;
                st6Var.getClass();
                st6Var.b(this);
            }
        }
    }

    public final yzb y(tu8 tu8Var) {
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            if (tu8Var.equals(this.N[i])) {
                return this.M[i];
            }
        }
        if (this.O) {
            ncd.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + tu8Var.a + ") after finishing tracks.");
            return new ip3();
        }
        hr9 hr9Var = new hr9(this.n, this.c, this.f);
        qu8 qu8Var = new qu8(hr9Var);
        hr9Var.f = this;
        int i2 = length + 1;
        tu8[] tu8VarArr = (tu8[]) Arrays.copyOf(this.N, i2);
        tu8VarArr[length] = tu8Var;
        String str = hac.a;
        this.N = tu8VarArr;
        hr9[] hr9VarArr = (hr9[]) Arrays.copyOf(this.M, i2);
        hr9VarArr[length] = hr9Var;
        this.M = hr9VarArr;
        qu8[] qu8VarArr = (qu8[]) Arrays.copyOf(this.L, i2);
        qu8VarArr[length] = qu8Var;
        this.L = qu8VarArr;
        return qu8Var;
    }

    public final void z(ix9 ix9Var) {
        ix9 od0Var;
        boolean z;
        if (this.K == null) {
            od0Var = ix9Var;
        } else {
            od0Var = new od0(-9223372036854775807L);
        }
        this.T = od0Var;
        this.U = ix9Var.h();
        byte b = 1;
        if (!this.e0 && ix9Var.h() == -9223372036854775807L) {
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
            this.h.v(this.U, ix9Var, z);
        } else {
            u();
        }
    }
}
