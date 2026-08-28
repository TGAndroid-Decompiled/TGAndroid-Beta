package j4;

import android.net.Uri;
import android.os.Handler;
import h3.j2;
import h3.t1;
import ih.j7;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public final class s0 implements a0, m3.m, com.google.android.exoplayer2.upstream.l0, com.google.android.exoplayer2.upstream.o0, z0 {
    public static final Map Y;
    public static final h3.t0 Z;
    public z C;
    public d4.b D;
    public boolean G;
    public boolean H;
    public boolean I;
    public com.google.firebase.messaging.t J;
    public m3.t K;
    public boolean M;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public long S;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public final Uri f13552a;
    public final com.google.android.exoplayer2.upstream.m f13553b;
    public final l3.i f13554c;
    public final v9.d d;
    public final h0 f13555e;
    public final a6.a f13556f;
    public final u0 h;
    public final com.google.android.exoplayer2.upstream.r f13557n;
    public final String f13558r;
    public final long f13559s;
    public final c f13560w;
    public final com.google.android.exoplayer2.upstream.q0 v = new com.google.android.exoplayer2.upstream.q0("ProgressiveMediaPeriod");
    public final d5.c f13561x = new Object();
    public final o0 f13562y = new o0(this, 0);
    public final o0 A = new o0(this, 1);
    public final Handler B = d5.f0.k(null);
    public r0[] F = new r0[0];
    public a1[] E = new a1[0];
    public long T = -9223372036854775807L;
    public long L = -9223372036854775807L;
    public int N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Y = DesugarCollections.unmodifiableMap(hashMap);
        h3.s0 s0Var = new h3.s0();
        s0Var.f9693a = "icy";
        s0Var.f9705o = "application/x-icy";
        Z = new h3.t0(s0Var);
    }

    public s0(Uri uri, com.google.android.exoplayer2.upstream.m mVar, c cVar, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var, u0 u0Var, com.google.android.exoplayer2.upstream.r rVar, String str, int i9) {
        this.f13552a = uri;
        this.f13553b = mVar;
        this.f13554c = iVar;
        this.f13556f = aVar;
        this.d = dVar;
        this.f13555e = h0Var;
        this.h = u0Var;
        this.f13557n = rVar;
        this.f13558r = str;
        this.f13559s = i9;
        this.f13560w = cVar;
    }

    public final a1 A(r0 r0Var) {
        int length = this.E.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (r0Var.equals(this.F[i9])) {
                return this.E[i9];
            }
        }
        l3.i iVar = this.f13554c;
        iVar.getClass();
        a1 a1Var = new a1(this.f13557n, iVar, this.f13556f);
        a1Var.f13407f = this;
        int i10 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.F, i10);
        r0VarArr[length] = r0Var;
        this.F = r0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.E, i10);
        a1VarArr[length] = a1Var;
        this.E = a1VarArr;
        return a1Var;
    }

    @Override
    public final void B() {
        this.G = true;
        this.B.post(this.f13562y);
    }

    public final void C() {
        p0 p0Var = new p0(this, this.f13552a, this.f13553b, this.f13560w, this, this.f13561x);
        if (this.H) {
            d5.a.i(p());
            long j10 = this.L;
            if (j10 != -9223372036854775807L && this.T > j10) {
                this.W = true;
                this.T = -9223372036854775807L;
                return;
            }
            m3.t tVar = this.K;
            tVar.getClass();
            long j11 = tVar.h(this.T).f17256a.f17260b;
            long j12 = this.T;
            p0Var.f13537f.f17244a = j11;
            p0Var.f13539r = j12;
            p0Var.f13538n = true;
            p0Var.f13541w = false;
            for (a1 a1Var : this.E) {
                a1Var.f13420t = this.T;
            }
            this.T = -9223372036854775807L;
        }
        this.V = j();
        this.v.f(p0Var, this, this.d.l3(this.N));
        this.f13555e.k(new q(p0Var.f13540s), 1, -1, null, 0, null, p0Var.f13539r, this.L);
    }

    public final boolean D() {
        if (!this.P && !p()) {
            return false;
        }
        return true;
    }

    @Override
    public final m3.w I(int i9, int i10) {
        return A(new r0(i9, false));
    }

    @Override
    public final void a() {
        this.B.post(this.f13562y);
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.v.d()) {
            d5.c cVar = this.f13561x;
            synchronized (cVar) {
                z10 = cVar.f4335a;
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c() {
        a1[] a1VarArr;
        for (a1 a1Var : this.E) {
            a1Var.A(true);
            l3.e eVar = a1Var.h;
            if (eVar != null) {
                eVar.k(a1Var.f13406e);
                a1Var.h = null;
                a1Var.f13408g = null;
            }
        }
        c cVar = this.f13560w;
        m3.k kVar = (m3.k) cVar.f13432c;
        if (kVar != null) {
            kVar.release();
            cVar.f13432c = null;
        }
        cVar.d = null;
    }

    @Override
    public final long d() {
        return v();
    }

    @Override
    public final void e(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        p0 p0Var = (p0) n0Var;
        Uri uri = p0Var.f13534b.f2653c;
        ?? obj = new Object();
        this.d.getClass();
        this.f13555e.d(obj, 1, -1, null, 0, null, p0Var.f13539r, this.L);
        if (!z10) {
            for (a1 a1Var : this.E) {
                a1Var.A(false);
            }
            if (this.Q > 0) {
                z zVar = this.C;
                zVar.getClass();
                zVar.c(this);
            }
        }
    }

    public final void f() {
        d5.a.i(this.H);
        this.J.getClass();
        this.K.getClass();
    }

    @Override
    public final void g() {
        int l32 = this.d.l3(this.N);
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        IOException iOException = q0Var.f2595c;
        if (iOException == null) {
            com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.f2594b;
            if (m0Var != null) {
                if (l32 == Integer.MIN_VALUE) {
                    l32 = m0Var.f2564a;
                }
                IOException iOException2 = m0Var.f2567e;
                if (iOException2 != null && m0Var.f2568f > l32) {
                    throw iOException2;
                }
            }
            if (this.W && !this.H) {
                throw t1.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 r15, java.io.IOException r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: j4.s0.h(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    @Override
    public final long i(long j10) {
        f();
        boolean[] zArr = (boolean[]) this.J.f4178c;
        if (!this.K.e()) {
            j10 = 0;
        }
        this.P = false;
        this.S = j10;
        if (p()) {
            this.T = j10;
            return j10;
        }
        if (this.N != 7) {
            int length = this.E.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.E[i9].D(j10, false) || (!zArr[i9] && this.I)) {
                }
            }
            return j10;
        }
        this.U = false;
        this.T = j10;
        this.W = false;
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        if (q0Var.d()) {
            for (a1 a1Var : this.E) {
                a1Var.i();
            }
            q0Var.b();
            return j10;
        }
        q0Var.f2595c = null;
        for (a1 a1Var2 : this.E) {
            a1Var2.A(false);
        }
        return j10;
    }

    public final int j() {
        a1[] a1VarArr;
        int i9 = 0;
        for (a1 a1Var : this.E) {
            i9 += a1Var.f13417q + a1Var.f13416p;
        }
        return i9;
    }

    @Override
    public final void k(long j10) {
        f();
        if (!p()) {
            boolean[] zArr = (boolean[]) this.J.d;
            int length = this.E.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.E[i9].h(j10, zArr[i9]);
            }
        }
    }

    public final long l(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i9 = 0; i9 < this.E.length; i9++) {
            if (!z10) {
                com.google.firebase.messaging.t tVar = this.J;
                tVar.getClass();
                if (!((boolean[]) tVar.d)[i9]) {
                }
            }
            j10 = Math.max(j10, this.E[i9].n());
        }
        return j10;
    }

    @Override
    public final void m(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        m3.t tVar;
        long j12;
        p0 p0Var = (p0) n0Var;
        if (this.L == -9223372036854775807L && (tVar = this.K) != null) {
            boolean e10 = tVar.e();
            long l10 = l(true);
            if (l10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = l10 + 10000;
            }
            this.L = j12;
            this.h.t(j12, e10, this.M);
        }
        Uri uri = p0Var.f13534b.f2653c;
        ?? obj = new Object();
        this.d.getClass();
        this.f13555e.f(obj, 1, -1, null, 0, null, p0Var.f13539r, this.L);
        this.W = true;
        z zVar = this.C;
        zVar.getClass();
        zVar.c(this);
    }

    @Override
    public final boolean n(long j10) {
        if (!this.W) {
            com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
            if (!q0Var.c() && !this.U) {
                if (!this.H || this.Q != 0) {
                    boolean c10 = this.f13561x.c();
                    if (!q0Var.d()) {
                        C();
                        return true;
                    }
                    return c10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long o() {
        if (this.P) {
            if (this.W || j() > this.V) {
                this.P = false;
                return this.S;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final boolean p() {
        if (this.T != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final j1 q() {
        f();
        return (j1) this.J.f4177b;
    }

    public final void r() {
        boolean z10;
        z3.c cVar;
        if (!this.X && !this.H && this.G && this.K != null) {
            for (a1 a1Var : this.E) {
                if (a1Var.t() == null) {
                    return;
                }
            }
            this.f13561x.b();
            int length = this.E.length;
            i1[] i1VarArr = new i1[length];
            boolean[] zArr = new boolean[length];
            for (int i9 = 0; i9 < length; i9++) {
                h3.t0 t10 = this.E[i9].t();
                t10.getClass();
                String str = t10.B;
                boolean h = d5.q.h(str);
                if (!h && !d5.q.j(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i9] = z10;
                this.I = z10 | this.I;
                d4.b bVar = this.D;
                if (bVar != null) {
                    int i10 = bVar.f4313a;
                    if (h || this.F[i9].f13548b) {
                        z3.c cVar2 = t10.f9767s;
                        if (cVar2 == null) {
                            cVar = new z3.c(bVar);
                        } else {
                            long j10 = cVar2.f50289b;
                            z3.b[] bVarArr = cVar2.f50288a;
                            int i11 = d5.f0.f4349a;
                            Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                            System.arraycopy(new z3.b[]{bVar}, 0, copyOf, bVarArr.length, 1);
                            cVar = new z3.c(j10, (z3.b[]) copyOf);
                        }
                        h3.s0 a2 = t10.a();
                        a2.f9699i = cVar;
                        t10 = new h3.t0(a2);
                    }
                    if (h && t10.f9764f == -1 && t10.h == -1 && i10 != -1) {
                        h3.s0 a3 = t10.a();
                        a3.f9697f = i10;
                        t10 = new h3.t0(a3);
                    }
                }
                int G = this.f13554c.G(t10);
                h3.s0 a10 = t10.a();
                a10.J = G;
                i1VarArr[i9] = new i1(Integer.toString(i9), new h3.t0(a10));
            }
            this.J = new com.google.firebase.messaging.t(new j1(i1VarArr), zArr);
            this.H = true;
            z zVar = this.C;
            zVar.getClass();
            zVar.f(this);
        }
    }

    public final void s(int i9) {
        f();
        com.google.firebase.messaging.t tVar = this.J;
        boolean[] zArr = (boolean[]) tVar.f4179e;
        if (!zArr[i9]) {
            h3.t0 t0Var = ((j1) tVar.f4177b).a(i9).d[0];
            this.f13555e.b(d5.q.g(t0Var.B), t0Var, 0, null, this.S);
            zArr[i9] = true;
        }
    }

    public final void t(int i9) {
        f();
        boolean[] zArr = (boolean[]) this.J.f4178c;
        if (this.U && zArr[i9] && !this.E[i9].u(false)) {
            this.T = 0L;
            this.U = false;
            this.P = true;
            this.S = 0L;
            this.V = 0;
            for (a1 a1Var : this.E) {
                a1Var.A(false);
            }
            z zVar = this.C;
            zVar.getClass();
            zVar.c(this);
        }
    }

    @Override
    public final long u(long j10, j2 j2Var) {
        f();
        if (!this.K.e()) {
            return 0L;
        }
        m3.s h = this.K.h(j10);
        return j2Var.a(j10, h.f17256a.f17259a, h.f17257b.f17259a);
    }

    @Override
    public final long v() {
        long j10;
        boolean z10;
        f();
        if (this.W || this.Q == 0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.T;
        }
        if (this.I) {
            int length = this.E.length;
            j10 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                com.google.firebase.messaging.t tVar = this.J;
                if (((boolean[]) tVar.f4178c)[i9] && ((boolean[]) tVar.d)[i9]) {
                    a1 a1Var = this.E[i9];
                    synchronized (a1Var) {
                        z10 = a1Var.f13422w;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.E[i9].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = l(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.S;
        }
        return j10;
    }

    @Override
    public final void w(z zVar, long j10) {
        this.C = zVar;
        this.f13561x.c();
        C();
    }

    @Override
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        b5.t tVar;
        boolean z11;
        boolean z12;
        f();
        com.google.firebase.messaging.t tVar2 = this.J;
        j1 j1Var = (j1) tVar2.f4177b;
        boolean[] zArr3 = (boolean[]) tVar2.d;
        int i9 = this.Q;
        int i10 = 0;
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            if (b1Var != null && (tVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((q0) b1Var).f13544a;
                d5.a.i(zArr3[i12]);
                this.Q--;
                zArr3[i12] = false;
                b1VarArr[i11] = null;
            }
        }
        if (!this.O ? j10 != 0 : i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            if (b1VarArr[i13] == null && (tVar = tVarArr[i13]) != null) {
                if (tVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d5.a.i(z11);
                if (tVar.j(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d5.a.i(z12);
                int b10 = j1Var.b(tVar.b());
                d5.a.i(!zArr3[b10]);
                this.Q++;
                zArr3[b10] = true;
                b1VarArr[i13] = new q0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    a1 a1Var = this.E[b10];
                    if (!a1Var.D(j10, true) && a1Var.q() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.Q == 0) {
            this.U = false;
            this.P = false;
            com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
            if (q0Var.d()) {
                a1[] a1VarArr = this.E;
                int length = a1VarArr.length;
                while (i10 < length) {
                    a1VarArr[i10].i();
                    i10++;
                }
                q0Var.b();
            } else {
                for (a1 a1Var2 : this.E) {
                    a1Var2.A(false);
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i10 < b1VarArr.length) {
                if (b1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.O = true;
        return j10;
    }

    @Override
    public final void y(m3.t tVar) {
        this.B.post(new j7(8, this, tVar));
    }

    @Override
    public final void z(long j10) {
    }
}
