package j4;

import android.net.Uri;
import android.os.Handler;
import h3.j2;
import h3.t1;
import hh.m5;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class r0 implements z, m3.m, com.google.android.exoplayer2.upstream.l0, com.google.android.exoplayer2.upstream.o0, z0 {
    public static final Map X;
    public static final h3.t0 Y;
    public y B;
    public d4.b C;
    public boolean F;
    public boolean G;
    public boolean H;
    public com.google.firebase.messaging.t I;
    public m3.t J;
    public boolean L;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public long R;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;

    public final Uri f12649a;

    public final com.google.android.exoplayer2.upstream.m f12650b;

    public final l3.j f12651c;
    public final ab.a d;

    public final g0 f12652e;

    public final b6.a f12653f;
    public final t0 h;

    public final com.google.android.exoplayer2.upstream.r f12654n;

    public final long f12655r;
    public final a5.n v;

    public final com.google.android.exoplayer2.upstream.q0 f12656s = new com.google.android.exoplayer2.upstream.q0("ProgressiveMediaPeriod");

    public final d5.c f12657w = new d5.c();

    public final n0 f12658x = new n0(this, 0);

    public final n0 f12659y = new n0(this, 1);
    public final Handler A = d5.g0.k(null);
    public q0[] E = new q0[0];
    public a1[] D = new a1[0];
    public long S = -9223372036854775807L;
    public long K = -9223372036854775807L;
    public int M = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        X = DesugarCollections.unmodifiableMap(map);
        h3.s0 s0Var = new h3.s0();
        s0Var.f8123a = "icy";
        s0Var.f8135o = "application/x-icy";
        Y = new h3.t0(s0Var);
    }

    public r0(Uri uri, com.google.android.exoplayer2.upstream.m mVar, a5.n nVar, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var, t0 t0Var, com.google.android.exoplayer2.upstream.r rVar, int i10) {
        this.f12649a = uri;
        this.f12650b = mVar;
        this.f12651c = jVar;
        this.f12653f = aVar;
        this.d = aVar2;
        this.f12652e = g0Var;
        this.h = t0Var;
        this.f12654n = rVar;
        this.f12655r = i10;
        this.v = nVar;
    }

    @Override
    public final void A() {
        this.F = true;
        this.A.post(this.f12658x);
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        e();
        if (!this.J.e()) {
            return 0L;
        }
        m3.s sVarH = this.J.h(j10);
        return j2Var.a(j10, sVarH.f17632a.f17635a, sVarH.f17633b.f17635a);
    }

    @Override
    public final m3.w C(int i10, int i11) {
        return t(new q0(i10, false));
    }

    @Override
    public final long D() {
        long jI;
        boolean z10;
        e();
        if (this.V || this.P == 0) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.S;
        }
        if (this.H) {
            int length = this.D.length;
            jI = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.t tVar = this.I;
                if (((boolean[]) tVar.f4620c)[i10] && ((boolean[]) tVar.d)[i10]) {
                    a1 a1Var = this.D[i10];
                    synchronized (a1Var) {
                        z10 = a1Var.f12526w;
                    }
                    if (!z10) {
                        jI = Math.min(jI, this.D[i10].n());
                    }
                }
            }
        } else {
            jI = Long.MAX_VALUE;
        }
        if (jI == Long.MAX_VALUE) {
            jI = i(false);
        }
        return jI == Long.MIN_VALUE ? this.R : jI;
    }

    @Override
    public final void E(y yVar, long j10) {
        this.B = yVar;
        this.f12657w.c();
        u();
    }

    @Override
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b5.s sVar;
        e();
        com.google.firebase.messaging.t tVar = this.I;
        j1 j1Var = (j1) tVar.f4619b;
        boolean[] zArr3 = (boolean[]) tVar.d;
        int i10 = this.P;
        int i11 = 0;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (sVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((p0) b1Var).f12641a;
                d5.a.i(zArr3[i13]);
                this.P--;
                zArr3[i13] = false;
                b1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.N ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < sVarArr.length; i14++) {
            if (b1VarArr[i14] == null && (sVar = sVarArr[i14]) != null) {
                d5.a.i(sVar.length() == 1);
                d5.a.i(sVar.j(0) == 0);
                int iB = j1Var.b(sVar.b());
                d5.a.i(!zArr3[iB]);
                this.P++;
                zArr3[iB] = true;
                b1VarArr[i14] = new p0(this, iB);
                zArr2[i14] = true;
                if (!z10) {
                    a1 a1Var = this.D[iB];
                    z10 = (a1Var.D(j10, true) || a1Var.q() == 0) ? false : true;
                }
            }
        }
        if (this.P == 0) {
            this.T = false;
            this.O = false;
            com.google.android.exoplayer2.upstream.q0 q0Var = this.f12656s;
            if (q0Var.d()) {
                a1[] a1VarArr = this.D;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].i();
                    i11++;
                }
                q0Var.b();
            } else {
                for (a1 a1Var2 : this.D) {
                    a1Var2.A(false);
                }
            }
        } else if (z10) {
            j10 = o(j10);
            while (i11 < b1VarArr.length) {
                if (b1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.N = true;
        return j10;
    }

    @Override
    public final void a() {
        this.A.post(this.f12658x);
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (!this.f12656s.d()) {
            return false;
        }
        d5.c cVar = this.f12657w;
        synchronized (cVar) {
            z10 = cVar.f4779a;
        }
        return z10;
    }

    @Override
    public final void c() {
        for (a1 a1Var : this.D) {
            a1Var.A(true);
            l3.f fVar = a1Var.h;
            if (fVar != null) {
                fVar.h(a1Var.f12510e);
                a1Var.h = null;
                a1Var.f12512g = null;
            }
        }
        a5.n nVar = this.v;
        m3.k kVar = (m3.k) nVar.f101c;
        if (kVar != null) {
            kVar.release();
            nVar.f101c = null;
        }
        nVar.d = null;
    }

    @Override
    public final void d(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        o0 o0Var = (o0) n0Var;
        Uri uri = o0Var.f12631b.f3090c;
        p pVar = new p();
        this.d.getClass();
        this.f12652e.d(pVar, 1, -1, null, 0, null, o0Var.f12636r, this.K);
        if (z10) {
            return;
        }
        for (a1 a1Var : this.D) {
            a1Var.A(false);
        }
        if (this.P > 0) {
            y yVar = this.B;
            yVar.getClass();
            yVar.a(this);
        }
    }

    public final void e() {
        d5.a.i(this.G);
        this.I.getClass();
        this.J.getClass();
    }

    public final int f() {
        int i10 = 0;
        for (a1 a1Var : this.D) {
            i10 += a1Var.f12521q + a1Var.f12520p;
        }
        return i10;
    }

    @Override
    public final long g() {
        return D();
    }

    @Override
    public final com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 n0Var, IOException iOException, int i10) {
        long jMin;
        com.google.android.exoplayer2.upstream.k0 k0Var;
        m3.t tVar;
        o0 o0Var = (o0) n0Var;
        Uri uri = o0Var.f12631b.f3090c;
        p pVar = new p();
        int i11 = d5.g0.f4795a;
        this.d.getClass();
        if ((iOException instanceof t1) || (iOException instanceof FileNotFoundException) || (iOException instanceof com.google.android.exoplayer2.upstream.e0) || (iOException instanceof com.google.android.exoplayer2.upstream.p0)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = com.google.android.exoplayer2.upstream.n.f3009b;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof com.google.android.exoplayer2.upstream.n) && ((com.google.android.exoplayer2.upstream.n) cause).f3010a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            k0Var = com.google.android.exoplayer2.upstream.q0.f3029f;
        } else {
            int iF = f();
            int i13 = iF > this.U ? 1 : 0;
            if (this.Q || !((tVar = this.J) == null || tVar.i() == -9223372036854775807L)) {
                this.U = iF;
            } else if (!this.G || v()) {
                this.O = this.G;
                this.R = 0L;
                this.U = 0;
                for (a1 a1Var : this.D) {
                    a1Var.A(false);
                }
                o0Var.f12634f.f17620a = 0L;
                o0Var.f12636r = 0L;
                o0Var.f12635n = true;
                o0Var.f12638w = false;
            } else {
                this.T = true;
                k0Var = com.google.android.exoplayer2.upstream.q0.f3028e;
            }
            k0Var = new com.google.android.exoplayer2.upstream.k0(i13, jMin, false);
        }
        com.google.android.exoplayer2.upstream.k0 k0Var2 = k0Var;
        this.f12652e.h(pVar, 1, -1, null, 0, null, o0Var.f12636r, this.K, iOException, !k0Var2.a());
        return k0Var2;
    }

    public final long i(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.D.length; i10++) {
            if (z10) {
                jMax = Math.max(jMax, this.D[i10].n());
            } else {
                com.google.firebase.messaging.t tVar = this.I;
                tVar.getClass();
                if (((boolean[]) tVar.d)[i10]) {
                    jMax = Math.max(jMax, this.D[i10].n());
                }
            }
        }
        return jMax;
    }

    public final boolean j() {
        return this.S != -9223372036854775807L;
    }

    public final void k() {
        z3.c cVar;
        if (this.W || this.G || !this.F || this.J == null) {
            return;
        }
        for (a1 a1Var : this.D) {
            if (a1Var.t() == null) {
                return;
            }
        }
        this.f12657w.b();
        int length = this.D.length;
        i1[] i1VarArr = new i1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            h3.t0 t0VarT = this.D[i10].t();
            t0VarT.getClass();
            String str = t0VarT.B;
            boolean zH = d5.q.h(str);
            boolean z10 = zH || d5.q.j(str);
            zArr[i10] = z10;
            this.H = z10 | this.H;
            d4.b bVar = this.C;
            if (bVar != null) {
                int i11 = bVar.f4755a;
                if (zH || this.E[i10].f12645b) {
                    z3.c cVar2 = t0VarT.f8191s;
                    if (cVar2 == null) {
                        cVar = new z3.c(bVar);
                    } else {
                        long j10 = cVar2.f50189b;
                        z3.b[] bVarArr = cVar2.f50188a;
                        int i12 = d5.g0.f4795a;
                        Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        System.arraycopy(new z3.b[]{bVar}, 0, objArrCopyOf, bVarArr.length, 1);
                        cVar = new z3.c(j10, (z3.b[]) objArrCopyOf);
                    }
                    h3.s0 s0VarA = t0VarT.a();
                    s0VarA.f8129i = cVar;
                    t0VarT = new h3.t0(s0VarA);
                }
                if (zH && t0VarT.f8188f == -1 && t0VarT.h == -1 && i11 != -1) {
                    h3.s0 s0VarA2 = t0VarT.a();
                    s0VarA2.f8127f = i11;
                    t0VarT = new h3.t0(s0VarA2);
                }
            }
            int iM = this.f12651c.m(t0VarT);
            h3.s0 s0VarA3 = t0VarT.a();
            s0VarA3.J = iM;
            i1VarArr[i10] = new i1(Integer.toString(i10), new h3.t0(s0VarA3));
        }
        this.I = new com.google.firebase.messaging.t(new j1(i1VarArr), zArr);
        this.G = true;
        y yVar = this.B;
        yVar.getClass();
        yVar.e(this);
    }

    @Override
    public final void l(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        m3.t tVar;
        o0 o0Var = (o0) n0Var;
        if (this.K == -9223372036854775807L && (tVar = this.J) != null) {
            boolean zE = tVar.e();
            long jI = i(true);
            long j12 = jI == Long.MIN_VALUE ? 0L : jI + 10000;
            this.K = j12;
            this.h.t(j12, zE, this.L);
        }
        Uri uri = o0Var.f12631b.f3090c;
        p pVar = new p();
        this.d.getClass();
        this.f12652e.f(pVar, 1, -1, null, 0, null, o0Var.f12636r, this.K);
        this.V = true;
        y yVar = this.B;
        yVar.getClass();
        yVar.a(this);
    }

    @Override
    public final void m() throws IOException {
        int iZ3 = this.d.z3(this.M);
        com.google.android.exoplayer2.upstream.q0 q0Var = this.f12656s;
        IOException iOException = q0Var.f3032c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.f3031b;
        if (m0Var != null) {
            if (iZ3 == Integer.MIN_VALUE) {
                iZ3 = m0Var.f3001a;
            }
            IOException iOException2 = m0Var.f3004e;
            if (iOException2 != null && m0Var.f3005f > iZ3) {
                throw iOException2;
            }
        }
        if (this.V && !this.G) {
            throw t1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override
    public final void n(m3.t tVar) {
        this.A.post(new m5(15, this, tVar));
    }

    @Override
    public final long o(long j10) {
        com.google.android.exoplayer2.upstream.q0 q0Var;
        int i10;
        e();
        boolean[] zArr = (boolean[]) this.I.f4620c;
        if (!this.J.e()) {
            j10 = 0;
        }
        this.O = false;
        this.R = j10;
        if (j()) {
            this.S = j10;
            return j10;
        }
        if (this.M == 7) {
            this.T = false;
            this.S = j10;
            this.V = false;
            q0Var = this.f12656s;
            if (q0Var.d()) {
                q0Var.f3032c = null;
                for (a1 a1Var : this.D) {
                    a1Var.A(false);
                }
                break;
                break;
            }
            for (a1 a1Var2 : this.D) {
                a1Var2.i();
            }
            q0Var.b();
            return j10;
        }
        int length = this.D.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.D[i11].D(j10, false) && (zArr[i11] || !this.H)) {
                this.T = false;
                this.S = j10;
                this.V = false;
                q0Var = this.f12656s;
                if (q0Var.d()) {
                    q0Var.f3032c = null;
                    while (i10 < r2) {
                        a1Var.A(false);
                    }
                    break;
                }
                while (i < r3) {
                    a1Var2.i();
                }
                q0Var.b();
                return j10;
            }
        }
        return j10;
    }

    @Override
    public final void p(long j10) {
        e();
        if (j()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.I.d;
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.D[i10].h(j10, zArr[i10]);
        }
    }

    @Override
    public final boolean q(long j10) {
        if (this.V) {
            return false;
        }
        com.google.android.exoplayer2.upstream.q0 q0Var = this.f12656s;
        if (q0Var.c() || this.T) {
            return false;
        }
        if (this.G && this.P == 0) {
            return false;
        }
        boolean zC = this.f12657w.c();
        if (q0Var.d()) {
            return zC;
        }
        u();
        return true;
    }

    public final void r(int i10) {
        e();
        com.google.firebase.messaging.t tVar = this.I;
        boolean[] zArr = (boolean[]) tVar.f4621e;
        if (zArr[i10]) {
            return;
        }
        h3.t0 t0Var = ((j1) tVar.f4619b).a(i10).d[0];
        this.f12652e.b(d5.q.g(t0Var.B), t0Var, 0, null, this.R);
        zArr[i10] = true;
    }

    public final void s(int i10) {
        e();
        boolean[] zArr = (boolean[]) this.I.f4620c;
        if (this.T && zArr[i10] && !this.D[i10].u(false)) {
            this.S = 0L;
            this.T = false;
            this.O = true;
            this.R = 0L;
            this.U = 0;
            for (a1 a1Var : this.D) {
                a1Var.A(false);
            }
            y yVar = this.B;
            yVar.getClass();
            yVar.a(this);
        }
    }

    public final a1 t(q0 q0Var) {
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (q0Var.equals(this.E[i10])) {
                return this.D[i10];
            }
        }
        l3.j jVar = this.f12651c;
        jVar.getClass();
        a1 a1Var = new a1(this.f12654n, jVar, this.f12653f);
        a1Var.f12511f = this;
        int i11 = length + 1;
        q0[] q0VarArr = (q0[]) Arrays.copyOf(this.E, i11);
        q0VarArr[length] = q0Var;
        this.E = q0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.D, i11);
        a1VarArr[length] = a1Var;
        this.D = a1VarArr;
        return a1Var;
    }

    public final void u() {
        o0 o0Var = new o0(this, this.f12649a, this.f12650b, this.v, this, this.f12657w);
        if (this.G) {
            d5.a.i(j());
            long j10 = this.K;
            if (j10 != -9223372036854775807L && this.S > j10) {
                this.V = true;
                this.S = -9223372036854775807L;
                return;
            }
            m3.t tVar = this.J;
            tVar.getClass();
            long j11 = tVar.h(this.S).f17632a.f17636b;
            long j12 = this.S;
            o0Var.f12634f.f17620a = j11;
            o0Var.f12636r = j12;
            o0Var.f12635n = true;
            o0Var.f12638w = false;
            for (a1 a1Var : this.D) {
                a1Var.f12524t = this.S;
            }
            this.S = -9223372036854775807L;
        }
        this.U = f();
        this.f12656s.f(o0Var, this, this.d.z3(this.M));
        this.f12652e.k(new p(o0Var.f12637s), 1, -1, null, 0, null, o0Var.f12636r, this.K);
    }

    public final boolean v() {
        return this.O || j();
    }

    @Override
    public final long w() {
        if (!this.O) {
            return -9223372036854775807L;
        }
        if (!this.V && f() <= this.U) {
            return -9223372036854775807L;
        }
        this.O = false;
        return this.R;
    }

    @Override
    public final j1 z() {
        e();
        return (j1) this.I.f4619b;
    }

    @Override
    public final void I(long j10) {
    }
}
