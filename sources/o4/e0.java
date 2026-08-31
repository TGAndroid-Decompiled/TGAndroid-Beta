package o4;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import j3.h2;
import j3.r1;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l7.w0;
import mh.m2;
public final class e0 implements t, r3.m, g5.h0, g5.k0, j0 {
    public static final Map Z;
    public static final j3.n0 f16460a0;
    public s D;
    public i4.b E;
    public boolean H;
    public boolean I;
    public boolean J;
    public com.google.firebase.messaging.s K;
    public r3.s L;
    public boolean N;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public long T;
    public boolean V;
    public int W;
    public boolean X;
    public boolean Y;
    public final Uri f16461a;
    public final g5.m f16462b;
    public final o3.o f16463c;
    public final ab.a d;
    public final b4.e0 f16464e;
    public final o3.l f16465f;
    public final f0 h;
    public final g5.q f16466n;
    public final String f16467r;
    public final long f16468s;
    public final w0 f16469w;
    public final g5.m0 v = new g5.m0("ProgressiveMediaPeriod");
    public final h5.c f16470x = new Object();
    public final a0 f16471y = new a0(this, 0);
    public final a0 B = new a0(this, 1);
    public final Handler C = h5.d0.l(null);
    public d0[] G = new d0[0];
    public k0[] F = new k0[0];
    public long U = -9223372036854775807L;
    public long M = -9223372036854775807L;
    public int O = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Z = DesugarCollections.unmodifiableMap(hashMap);
        j3.m0 m0Var = new j3.m0();
        m0Var.f9253a = "icy";
        m0Var.f9265o = "application/x-icy";
        f16460a0 = new j3.n0(m0Var);
    }

    public e0(Uri uri, g5.m mVar, w0 w0Var, o3.o oVar, o3.l lVar, ab.a aVar, b4.e0 e0Var, f0 f0Var, g5.q qVar, String str, int i10) {
        this.f16461a = uri;
        this.f16462b = mVar;
        this.f16463c = oVar;
        this.f16465f = lVar;
        this.d = aVar;
        this.f16464e = e0Var;
        this.h = f0Var;
        this.f16466n = qVar;
        this.f16467r = str;
        this.f16468s = i10;
        this.f16469w = w0Var;
    }

    public final void A() {
        b0 b0Var = new b0(this, this.f16461a, this.f16462b, this.f16469w, this, this.f16470x);
        if (this.I) {
            h5.a.i(s());
            long j10 = this.M;
            if (j10 != -9223372036854775807L && this.U > j10) {
                this.X = true;
                this.U = -9223372036854775807L;
                return;
            }
            r3.s sVar = this.L;
            sVar.getClass();
            long j11 = sVar.f(this.U).f46582a.f46586b;
            long j12 = this.U;
            b0Var.f16440f.f28091a = j11;
            b0Var.f16442r = j12;
            b0Var.f16441n = true;
            b0Var.f16444w = false;
            for (k0 k0Var : this.F) {
                k0Var.f16521t = this.U;
            }
            this.U = -9223372036854775807L;
        }
        this.W = l();
        this.v.f(b0Var, this, this.d.n3(this.O));
        this.f16464e.u(new j(b0Var.f16443s), 1, -1, null, 0, null, b0Var.f16442r, this.M);
    }

    public final boolean B() {
        if (!this.Q && !s()) {
            return false;
        }
        return true;
    }

    @Override
    public final void a() {
        this.C.post(this.f16471y);
    }

    @Override
    public final boolean b() {
        boolean z4;
        if (this.v.d()) {
            h5.c cVar = this.f16470x;
            synchronized (cVar) {
                z4 = cVar.f7233a;
            }
            if (z4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c() {
        k0[] k0VarArr;
        for (k0 k0Var : this.F) {
            k0Var.A(true);
            o3.i iVar = k0Var.h;
            if (iVar != null) {
                iVar.c(k0Var.f16507e);
                k0Var.h = null;
                k0Var.f16509g = null;
            }
        }
        w0 w0Var = this.f16469w;
        r3.k kVar = (r3.k) w0Var.f12081c;
        if (kVar != null) {
            kVar.release();
            w0Var.f12081c = null;
        }
        w0Var.d = null;
    }

    @Override
    public final long d(long j10, h2 h2Var) {
        h();
        if (!this.L.c()) {
            return 0L;
        }
        r3.r f10 = this.L.f(j10);
        return h2Var.a(j10, f10.f46582a.f46585a, f10.f46583b.f46585a);
    }

    @Override
    public final long e() {
        return r();
    }

    @Override
    public final void f(s sVar, long j10) {
        this.D = sVar;
        this.f16470x.c();
        A();
    }

    @Override
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        boolean z4;
        f5.c cVar;
        boolean z10;
        boolean z11;
        h();
        com.google.firebase.messaging.s sVar = this.K;
        t0 t0Var = (t0) sVar.f4080a;
        boolean[] zArr3 = (boolean[]) sVar.f4082c;
        int i10 = this.R;
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            l0 l0Var = l0VarArr[i12];
            if (l0Var != null && (cVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c0) l0Var).f16449a;
                h5.a.i(zArr3[i13]);
                this.R--;
                zArr3[i13] = false;
                l0VarArr[i12] = null;
            }
        }
        if (!this.P ? j10 != 0 : i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (l0VarArr[i14] == null && (cVar = cVarArr[i14]) != null) {
                if (cVar.p() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h5.a.i(z10);
                if (cVar.f(0) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h5.a.i(z11);
                int b10 = t0Var.b(cVar.l());
                h5.a.i(!zArr3[b10]);
                this.R++;
                zArr3[b10] = true;
                l0VarArr[i14] = new c0(this, b10);
                zArr2[i14] = true;
                if (!z4) {
                    k0 k0Var = this.F[b10];
                    if (!k0Var.D(j10, true) && k0Var.q() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
        }
        if (this.R == 0) {
            this.V = false;
            this.Q = false;
            g5.m0 m0Var = this.v;
            if (m0Var.d()) {
                k0[] k0VarArr = this.F;
                int length = k0VarArr.length;
                while (i11 < length) {
                    k0VarArr[i11].i();
                    i11++;
                }
                m0Var.b();
            } else {
                for (k0 k0Var2 : this.F) {
                    k0Var2.A(false);
                }
            }
        } else if (z4) {
            j10 = j(j10);
            while (i11 < l0VarArr.length) {
                if (l0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.P = true;
        return j10;
    }

    public final void h() {
        h5.a.i(this.I);
        this.K.getClass();
        this.L.getClass();
    }

    @Override
    public final void i() {
        int n32 = this.d.n3(this.O);
        g5.m0 m0Var = this.v;
        IOException iOException = m0Var.f6877c;
        if (iOException == null) {
            g5.i0 i0Var = m0Var.f6876b;
            if (i0Var != null) {
                if (n32 == Integer.MIN_VALUE) {
                    n32 = i0Var.f6862a;
                }
                IOException iOException2 = i0Var.f6865e;
                if (iOException2 != null && i0Var.f6866f > n32) {
                    throw iOException2;
                }
            }
            if (this.X && !this.I) {
                throw r1.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final void i1() {
        this.H = true;
        this.C.post(this.f16471y);
    }

    @Override
    public final r3.v i2(int i10, int i11) {
        return z(new d0(i10, false));
    }

    @Override
    public final long j(long j10) {
        h();
        boolean[] zArr = (boolean[]) this.K.f4081b;
        if (!this.L.c()) {
            j10 = 0;
        }
        this.Q = false;
        this.T = j10;
        if (s()) {
            this.U = j10;
            return j10;
        }
        if (this.O != 7) {
            int length = this.F.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.F[i10].D(j10, false) || (!zArr[i10] && this.J)) {
                }
            }
            return j10;
        }
        this.V = false;
        this.U = j10;
        this.X = false;
        g5.m0 m0Var = this.v;
        if (m0Var.d()) {
            for (k0 k0Var : this.F) {
                k0Var.i();
            }
            m0Var.b();
            return j10;
        }
        m0Var.f6877c = null;
        for (k0 k0Var2 : this.F) {
            k0Var2.A(false);
        }
        return j10;
    }

    @Override
    public final void k(long j10) {
        h();
        if (!s()) {
            boolean[] zArr = (boolean[]) this.K.f4082c;
            int length = this.F.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.F[i10].h(j10, zArr[i10]);
            }
        }
    }

    public final int l() {
        k0[] k0VarArr;
        int i10 = 0;
        for (k0 k0Var : this.F) {
            i10 += k0Var.f16518q + k0Var.f16517p;
        }
        return i10;
    }

    @Override
    public final boolean m(long j10) {
        if (!this.X) {
            g5.m0 m0Var = this.v;
            if (!m0Var.c() && !this.V) {
                if (!this.I || this.R != 0) {
                    boolean c3 = this.f16470x.c();
                    if (!m0Var.d()) {
                        A();
                        return true;
                    }
                    return c3;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void m2(r3.s sVar) {
        this.C.post(new m2(23, this, sVar));
    }

    @Override
    public final long n() {
        if (this.Q) {
            if (this.X || l() > this.W) {
                this.Q = false;
                return this.T;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final t0 o() {
        h();
        return (t0) this.K.f4080a;
    }

    public final long p(boolean z4) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.F.length; i10++) {
            if (!z4) {
                com.google.firebase.messaging.s sVar = this.K;
                sVar.getClass();
                if (!((boolean[]) sVar.f4082c)[i10]) {
                }
            }
            j10 = Math.max(j10, this.F[i10].n());
        }
        return j10;
    }

    @Override
    public final c4.e q(g5.j0 r15, java.io.IOException r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: o4.e0.q(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public final long r() {
        long j10;
        boolean z4;
        h();
        if (this.X || this.R == 0) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.U;
        }
        if (this.J) {
            int length = this.F.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.K;
                if (((boolean[]) sVar.f4081b)[i10] && ((boolean[]) sVar.f4082c)[i10]) {
                    k0 k0Var = this.F[i10];
                    synchronized (k0Var) {
                        z4 = k0Var.f16523w;
                    }
                    if (!z4) {
                        j10 = Math.min(j10, this.F[i10].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = p(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.T;
        }
        return j10;
    }

    public final boolean s() {
        if (this.U != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
        b0 b0Var = (b0) j0Var;
        Uri uri = b0Var.f16437b.f6950c;
        ?? obj = new Object();
        this.d.getClass();
        this.f16464e.m(obj, 1, -1, null, 0, null, b0Var.f16442r, this.M);
        if (!z4) {
            for (k0 k0Var : this.F) {
                k0Var.A(false);
            }
            if (this.R > 0) {
                s sVar = this.D;
                sVar.getClass();
                sVar.s(this);
            }
        }
    }

    public final void v() {
        boolean z4;
        e4.c a2;
        if (!this.Y && !this.I && this.H && this.L != null) {
            for (k0 k0Var : this.F) {
                if (k0Var.t() == null) {
                    return;
                }
            }
            this.f16470x.b();
            int length = this.F.length;
            s0[] s0VarArr = new s0[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                j3.n0 t6 = this.F[i10].t();
                t6.getClass();
                String str = t6.C;
                boolean h = h5.o.h(str);
                if (!h && !h5.o.j(str)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                zArr[i10] = z4;
                this.J = z4 | this.J;
                i4.b bVar = this.E;
                if (bVar != null) {
                    int i11 = bVar.f7789a;
                    if (h || this.G[i10].f16457b) {
                        e4.c cVar = t6.f9325s;
                        if (cVar == null) {
                            a2 = new e4.c(bVar);
                        } else {
                            a2 = cVar.a(bVar);
                        }
                        j3.m0 a10 = t6.a();
                        a10.f9259i = a2;
                        t6 = new j3.n0(a10);
                    }
                    if (h && t6.f9322f == -1 && t6.h == -1 && i11 != -1) {
                        j3.m0 a11 = t6.a();
                        a11.f9257f = i11;
                        t6 = new j3.n0(a11);
                    }
                }
                int b10 = this.f16463c.b(t6);
                j3.m0 a12 = t6.a();
                a12.J = b10;
                s0VarArr[i10] = new s0(Integer.toString(i10), new j3.n0(a12));
            }
            t0 t0Var = new t0(s0VarArr);
            ?? obj = new Object();
            obj.f4080a = t0Var;
            obj.f4081b = zArr;
            int i12 = t0Var.f16576a;
            obj.f4082c = new boolean[i12];
            obj.d = new boolean[i12];
            this.K = obj;
            this.I = true;
            s sVar = this.D;
            sVar.getClass();
            sVar.a(this);
        }
    }

    public final void w(int i10) {
        h();
        com.google.firebase.messaging.s sVar = this.K;
        boolean[] zArr = (boolean[]) sVar.d;
        if (!zArr[i10]) {
            j3.n0 n0Var = ((t0) sVar.f4080a).a(i10).d[0];
            this.f16464e.h(h5.o.g(n0Var.C), n0Var, 0, null, this.T);
            zArr[i10] = true;
        }
    }

    @Override
    public final void x(g5.j0 j0Var, long j10, long j11) {
        r3.s sVar;
        long j12;
        b0 b0Var = (b0) j0Var;
        if (this.M == -9223372036854775807L && (sVar = this.L) != null) {
            boolean c3 = sVar.c();
            long p10 = p(true);
            if (p10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = p10 + 10000;
            }
            this.M = j12;
            this.h.t(j12, c3, this.N);
        }
        Uri uri = b0Var.f16437b.f6950c;
        ?? obj = new Object();
        this.d.getClass();
        this.f16464e.p(obj, 1, -1, null, 0, null, b0Var.f16442r, this.M);
        this.X = true;
        s sVar2 = this.D;
        sVar2.getClass();
        sVar2.s(this);
    }

    public final void y(int i10) {
        h();
        boolean[] zArr = (boolean[]) this.K.f4081b;
        if (this.V && zArr[i10] && !this.F[i10].u(false)) {
            this.U = 0L;
            this.V = false;
            this.Q = true;
            this.T = 0L;
            this.W = 0;
            for (k0 k0Var : this.F) {
                k0Var.A(false);
            }
            s sVar = this.D;
            sVar.getClass();
            sVar.s(this);
        }
    }

    public final k0 z(d0 d0Var) {
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d0Var.equals(this.G[i10])) {
                return this.F[i10];
            }
        }
        o3.o oVar = this.f16463c;
        oVar.getClass();
        k0 k0Var = new k0(this.f16466n, oVar, this.f16465f);
        k0Var.f16508f = this;
        int i11 = length + 1;
        d0[] d0VarArr = (d0[]) Arrays.copyOf(this.G, i11);
        d0VarArr[length] = d0Var;
        this.G = d0VarArr;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.F, i11);
        k0VarArr[length] = k0Var;
        this.F = k0VarArr;
        return k0Var;
    }

    @Override
    public final void t(long j10) {
    }
}
