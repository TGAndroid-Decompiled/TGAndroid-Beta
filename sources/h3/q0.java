package h3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class q0 implements Handler.Callback, j4.y {
    public final ArrayList A;
    public final d5.b0 B;
    public final w C;
    public final k1 D;
    public final s1 E;
    public final i F;
    public final long G;
    public j2 H;
    public w1 I;
    public ue.f J;
    public boolean K;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public p0 V;
    public long W;
    public int X;
    public boolean Y;
    public n Z;

    public final e[] f8073a;

    public final Set f8075b;

    public final h2[] f8076c;
    public final b5.v d;

    public final b5.z f8077e;

    public final j f8078f;
    public final com.google.android.exoplayer2.upstream.f h;

    public final d5.d0 f8079n;

    public final HandlerThread f8080r;

    public final Looper f8081s;
    public final r2 v;

    public final p2 f8082w;

    public final long f8083x;

    public final k f8084y;
    public boolean L = false;

    public long f8074a0 = -9223372036854775807L;

    public q0(e[] eVarArr, b5.v vVar, b5.z zVar, j jVar, com.google.android.exoplayer2.upstream.f fVar, int i10, boolean z10, i3.f fVar2, j2 j2Var, i iVar, long j10, Looper looper, d5.b0 b0Var, w wVar, i3.k kVar) {
        this.C = wVar;
        this.f8073a = eVarArr;
        this.d = vVar;
        this.f8077e = zVar;
        this.f8078f = jVar;
        this.h = fVar;
        this.P = i10;
        this.Q = z10;
        this.H = j2Var;
        this.F = iVar;
        this.G = j10;
        this.B = b0Var;
        this.f8083x = jVar.f7941g;
        w1 w1VarH = w1.h(zVar);
        this.I = w1VarH;
        this.J = new ue.f(w1VarH);
        this.f8076c = new h2[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            eVarArr[i11].init(i11, kVar);
            this.f8076c[i11] = eVarArr[i11].getCapabilities();
        }
        this.f8084y = new k(this, b0Var);
        this.A = new ArrayList();
        this.f8075b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new r2();
        this.f8082w = new p2();
        vVar.f1988a = this;
        vVar.f1989b = fVar;
        this.Y = true;
        d5.d0 d0VarA = b0Var.a(looper, null);
        this.D = new k1(fVar2, d0VarA);
        this.E = new s1(this, fVar2, d0VarA, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f8080r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f8081s = looper2;
        this.f8079n = b0Var.a(looper2, this);
    }

    public static Pair G(s2 s2Var, p0 p0Var, boolean z10, int i10, boolean z11, r2 r2Var, p2 p2Var) {
        Object objH;
        s2 s2Var2 = p0Var.f8055a;
        if (s2Var.p()) {
            return null;
        }
        s2 s2Var3 = s2Var2.p() ? s2Var : s2Var2;
        try {
            Pair pairI = s2Var3.i(r2Var, p2Var, p0Var.f8056b, p0Var.f8057c);
            if (!s2Var.equals(s2Var3)) {
                if (s2Var.b(pairI.first) == -1) {
                    if (!z10 || (objH = H(r2Var, p2Var, i10, z11, pairI.first, s2Var3, s2Var)) == null) {
                        return null;
                    }
                    return s2Var.i(r2Var, p2Var, s2Var.g(objH, p2Var).f8069c, -9223372036854775807L);
                }
                if (s2Var3.g(pairI.first, p2Var).f8071f && s2Var3.m(p2Var.f8069c, r2Var, 0L).A == s2Var3.b(pairI.first)) {
                    return s2Var.i(r2Var, p2Var, s2Var.g(pairI.first, p2Var).f8069c, p0Var.f8057c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object H(r2 r2Var, p2 p2Var, int i10, boolean z10, Object obj, s2 s2Var, s2 s2Var2) {
        int iB = s2Var.b(obj);
        int iH = s2Var.h();
        int i11 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i11 < iH && iB2 == -1) {
            r2 r2Var2 = r2Var;
            p2 p2Var2 = p2Var;
            int i12 = i10;
            boolean z11 = z10;
            s2 s2Var3 = s2Var;
            iD = s2Var3.d(iD, p2Var2, r2Var2, i12, z11);
            if (iD == -1) {
                break;
            }
            iB2 = s2Var2.b(s2Var3.l(iD));
            i11++;
            s2Var = s2Var3;
            p2Var = p2Var2;
            r2Var = r2Var2;
            i10 = i12;
            z10 = z11;
        }
        if (iB2 == -1) {
            return null;
        }
        return s2Var2.l(iB2);
    }

    public static void N(e eVar, long j10) {
        eVar.setCurrentStreamFinal();
        if (eVar instanceof r4.m) {
            r4.m mVar = (r4.m) eVar;
            d5.a.i(mVar.isCurrentStreamFinal());
            mVar.A = j10;
        }
    }

    public static boolean r(e eVar) {
        return eVar.getState() != 0;
    }

    public final void A(int i10, int i11, j4.g1 g1Var) throws Throwable {
        this.J.a(1);
        s1 s1Var = this.E;
        s1Var.getClass();
        d5.a.f(i10 >= 0 && i10 <= i11 && i11 <= s1Var.f8147b.size());
        s1Var.f8153j = g1Var;
        s1Var.g(i10, i11);
        m(s1Var.b(), false);
    }

    public final void B() throws n {
        int i10;
        float f10 = this.f8084y.getPlaybackParameters().f8242a;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = k1Var.f8001i;
        boolean z10 = true;
        for (i1 i1Var3 = i1Var; i1Var3 != null && i1Var3.d; i1Var3 = i1Var3.f7930l) {
            b5.z zVarG = i1Var3.g(f10, this.I.f8220a);
            b5.z zVar = i1Var3.f7932n;
            b5.s[] sVarArr = zVarG.f2030c;
            if (zVar != null && zVar.f2030c.length == sVarArr.length) {
                int i11 = 0;
                while (true) {
                    if (i11 >= sVarArr.length) {
                        if (i1Var3 == i1Var2) {
                            z10 = false;
                        }
                    } else if (zVarG.a(zVar, i11)) {
                        i11++;
                    }
                }
            }
            if (z10) {
                k1 k1Var2 = this.D;
                i1 i1Var4 = k1Var2.h;
                boolean zK = k1Var2.k(i1Var4);
                boolean[] zArr = new boolean[this.f8073a.length];
                long jA = i1Var4.a(zVarG, this.I.f8235r, zK, zArr);
                w1 w1Var = this.I;
                boolean z11 = (w1Var.f8223e == 4 || jA == w1Var.f8235r) ? false : true;
                w1 w1Var2 = this.I;
                i10 = 4;
                this.I = p(w1Var2.f8221b, jA, w1Var2.f8222c, w1Var2.d, z11, 5);
                if (z11) {
                    E(jA);
                }
                boolean[] zArr2 = new boolean[this.f8073a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f8073a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean zR = r(eVar);
                    zArr2[i12] = zR;
                    j4.b1 b1Var = i1Var4.f7923c[i12];
                    if (zR) {
                        if (b1Var != eVar.getStream()) {
                            c(eVar);
                        } else if (zArr[i12]) {
                            eVar.resetPosition(this.W);
                        }
                    }
                    i12++;
                }
                f(zArr2);
            } else {
                i10 = 4;
                this.D.k(i1Var3);
                if (i1Var3.d) {
                    i1Var3.a(zVarG, Math.max(i1Var3.f7925f.f7946b, this.W - i1Var3.f7933o), false, new boolean[i1Var3.f7927i.length]);
                }
            }
            l(true);
            if (this.I.f8223e != i10) {
                t();
                f0();
                this.f8079n.d(2);
                return;
            }
            return;
        }
    }

    public final void C(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        long j11;
        boolean z14;
        List list;
        this.f8079n.f4782a.removeMessages(2);
        this.Z = null;
        this.N = false;
        k kVar = this.f8084y;
        kVar.f7960f = false;
        c2.c0 c0Var = kVar.f7956a;
        if (c0Var.f2243a) {
            c0Var.a(c0Var.getPositionUs());
            c0Var.f2243a = false;
        }
        this.W = 1000000000000L;
        for (e eVar : this.f8073a) {
            try {
                c(eVar);
            } catch (n | RuntimeException e9) {
                d5.a.p("ExoPlayerImplInternal", "Disable failed.", e9);
            }
        }
        if (z10) {
            for (e eVar2 : this.f8073a) {
                if (this.f8075b.remove(eVar2)) {
                    try {
                        eVar2.reset();
                    } catch (RuntimeException e10) {
                        d5.a.p("ExoPlayerImplInternal", "Reset failed.", e10);
                    }
                }
            }
        }
        this.U = 0;
        w1 w1Var = this.I;
        j4.c0 c0Var2 = w1Var.f8221b;
        long jLongValue = w1Var.f8235r;
        if (this.I.f8221b.a()) {
            j10 = this.I.f8222c;
        } else {
            w1 w1Var2 = this.I;
            p2 p2Var = this.f8082w;
            j4.c0 c0Var3 = w1Var2.f8221b;
            s2 s2Var = w1Var2.f8220a;
            if (s2Var.p() || s2Var.g(c0Var3.f12503a, p2Var).f8071f) {
                j10 = this.I.f8222c;
            } else {
                j10 = this.I.f8235r;
            }
        }
        if (z11) {
            this.V = null;
            Pair pairI = i(this.I.f8220a);
            c0Var2 = (j4.c0) pairI.first;
            jLongValue = ((Long) pairI.second).longValue();
            j10 = -9223372036854775807L;
            if (c0Var2.equals(this.I.f8221b)) {
                j11 = jLongValue;
                z14 = false;
            } else {
                z14 = true;
                j11 = jLongValue;
            }
        } else {
            j11 = jLongValue;
            z14 = false;
        }
        j4.c0 c0Var4 = c0Var2;
        this.D.b();
        this.O = false;
        w1 w1Var3 = this.I;
        s2 s2Var2 = w1Var3.f8220a;
        int i10 = w1Var3.f8223e;
        n nVar = z13 ? null : w1Var3.f8224f;
        j4.j1 j1Var = z14 ? j4.j1.d : w1Var3.h;
        b5.z zVar = z14 ? this.f8077e : w1Var3.f8226i;
        if (z14) {
            p8.x xVar = p8.z.f45604b;
            list = p8.l0.f45555e;
        } else {
            list = w1Var3.f8227j;
        }
        this.I = new w1(s2Var2, c0Var4, j10, j11, i10, nVar, false, j1Var, zVar, list, c0Var4, w1Var3.f8229l, w1Var3.f8230m, w1Var3.f8231n, j11, 0L, j11, false);
        if (z12) {
            s1 s1Var = this.E;
            HashMap map = s1Var.f8150f;
            for (q1 q1Var : map.values()) {
                try {
                    q1Var.f8085a.o(q1Var.f8086b);
                } catch (RuntimeException e11) {
                    d5.a.p("MediaSourceList", "Failed to release child source.", e11);
                }
                j4.a aVar = q1Var.f8085a;
                g5.b bVar = q1Var.f8087c;
                aVar.r(bVar);
                q1Var.f8085a.q(bVar);
            }
            map.clear();
            s1Var.f8151g.clear();
            s1Var.f8154k = false;
        }
    }

    public final void D() {
        i1 i1Var = this.D.h;
        this.M = i1Var != null && i1Var.f7925f.h && this.L;
    }

    public final void E(long j10) {
        i1 i1Var = this.D.h;
        long j11 = j10 + (i1Var == null ? 1000000000000L : i1Var.f7933o);
        this.W = j11;
        this.f8084y.f7956a.a(j11);
        for (e eVar : this.f8073a) {
            if (r(eVar)) {
                eVar.resetPosition(this.W);
            }
        }
        for (i1 i1Var2 = r0.h; i1Var2 != null; i1Var2 = i1Var2.f7930l) {
            for (b5.s sVar : i1Var2.f7932n.f2030c) {
                if (sVar != null) {
                    sVar.s();
                }
            }
        }
    }

    public final void F(s2 s2Var, s2 s2Var2) {
        if (s2Var.p() && s2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a9.p.t(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z10) throws n {
        j4.c0 c0Var = this.D.h.f7925f.f7945a;
        long jK = K(c0Var, this.I.f8235r, true, false);
        if (jK != this.I.f8235r) {
            w1 w1Var = this.I;
            this.I = p(c0Var, jK, w1Var.f8222c, w1Var.d, z10, 5);
        }
    }

    public final void J(p0 p0Var) throws Throwable {
        long jLongValue;
        j4.c0 c0VarM;
        long j10;
        boolean z10;
        long j11;
        long j12;
        i1 i1Var;
        long jB;
        w1 w1Var;
        int i10;
        long j13;
        boolean z11;
        j4.c0 c0Var;
        int i11;
        long j14;
        boolean z12;
        k1 k1Var;
        boolean z13;
        long jK;
        boolean z14;
        boolean z15;
        j4.c0 c0Var2;
        long j15;
        q0 q0Var = this;
        q0Var.J.a(1);
        Pair pairG = G(q0Var.I.f8220a, p0Var, true, q0Var.P, q0Var.Q, q0Var.v, q0Var.f8082w);
        try {
            if (pairG != null) {
                Object obj = pairG.first;
                jLongValue = ((Long) pairG.second).longValue();
                long j16 = p0Var.f8057c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                c0VarM = q0Var.D.m(q0Var.I.f8220a, obj, jLongValue);
                if (c0VarM.a()) {
                    q0Var.I.f8220a.g(c0VarM.f12503a, q0Var.f8082w);
                    jLongValue = q0Var.f8082w.f(c0VarM.f12504b) == c0VarM.f12505c ? q0Var.f8082w.h.f14454b : 0L;
                    j11 = j16;
                    z10 = true;
                } else {
                    j10 = 0;
                    z10 = p0Var.f8057c == -9223372036854775807L;
                    j11 = j16;
                }
                if (q0Var.I.f8220a.p()) {
                    if (pairG == null) {
                        if (q0Var.I.f8223e != 1) {
                            q0Var.X(4);
                        }
                        q0Var.C(false, true, false, true);
                    } else {
                        if (c0VarM.equals(q0Var.I.f8221b)) {
                            try {
                                i1Var = q0Var.D.h;
                                if (i1Var == null && i1Var.d && jLongValue != j10) {
                                    jB = i1Var.f7921a.B(jLongValue, q0Var.H);
                                } else {
                                    jB = jLongValue;
                                }
                                if (d5.g0.S(jB) != d5.g0.S(q0Var.I.f8235r) && ((i10 = (w1Var = q0Var.I).f8223e) == 2 || i10 == 3)) {
                                    j13 = w1Var.f8235r;
                                    z11 = z10;
                                    c0Var = c0VarM;
                                    i11 = 2;
                                    j14 = j13;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0VarM = c0VarM;
                                j12 = jLongValue;
                                q0Var.I = q0Var.p(c0VarM, j12, j11, j12, z10, 2);
                                throw th;
                            }
                        } else {
                            jB = jLongValue;
                        }
                        try {
                            if (q0Var.I.f8223e == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            k1Var = q0Var.D;
                            if (k1Var.h != k1Var.f8001i) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            jK = q0Var.K(c0VarM, jB, z13, z12);
                            if (jLongValue != jK) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z10 | z14;
                            try {
                                w1 w1Var2 = q0Var.I;
                                c0Var2 = c0VarM;
                                try {
                                    s2 s2Var = w1Var2.f8220a;
                                    j15 = j11;
                                    try {
                                        q0Var.g0(s2Var, c0Var2, s2Var, w1Var2.f8221b, j15);
                                        c0Var = c0Var2;
                                        j11 = j15;
                                        z11 = z15;
                                        j13 = jK;
                                        i11 = 2;
                                        j14 = j13;
                                        q0Var = this;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c0VarM = c0Var2;
                                        j11 = j15;
                                        z10 = z15;
                                        j12 = jK;
                                        q0Var.I = q0Var.p(c0VarM, j12, j11, j12, z10, 2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0VarM = c0Var2;
                                    j11 = j11;
                                    z10 = z15;
                                    j12 = jK;
                                    q0Var.I = q0Var.p(c0VarM, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j11 = j11;
                            j12 = jLongValue;
                            q0Var.I = q0Var.p(c0VarM, j12, j11, j12, z10, 2);
                            throw th;
                        }
                    }
                    q0Var.I = q0Var.p(c0Var, j13, j11, j14, z11, i11);
                    return;
                }
                q0Var.V = p0Var;
                z11 = z10;
                c0Var = c0VarM;
                j13 = jLongValue;
                i11 = 2;
                j14 = j13;
                q0Var = this;
                q0Var.I = q0Var.p(c0Var, j13, j11, j14, z11, i11);
                return;
            }
            Pair pairI = q0Var.i(q0Var.I.f8220a);
            c0VarM = (j4.c0) pairI.first;
            jLongValue = ((Long) pairI.second).longValue();
            z10 = !q0Var.I.f8220a.p();
            j11 = -9223372036854775807L;
            if (q0Var.I.f8220a.p()) {
                if (pairG == null) {
                    if (q0Var.I.f8223e != 1) {
                        q0Var.X(4);
                    }
                    q0Var.C(false, true, false, true);
                } else {
                    if (c0VarM.equals(q0Var.I.f8221b)) {
                        i1Var = q0Var.D.h;
                        if (i1Var == null) {
                            jB = jLongValue;
                        } else {
                            jB = jLongValue;
                        }
                        if (d5.g0.S(jB) != d5.g0.S(q0Var.I.f8235r)) {
                        }
                    } else {
                        jB = jLongValue;
                    }
                    if (q0Var.I.f8223e == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k1Var = q0Var.D;
                    if (k1Var.h != k1Var.f8001i) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    jK = q0Var.K(c0VarM, jB, z13, z12);
                    if (jLongValue != jK) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z10 | z14;
                    w1 w1Var3 = q0Var.I;
                    c0Var2 = c0VarM;
                    s2 s2Var2 = w1Var3.f8220a;
                    j15 = j11;
                    q0Var.g0(s2Var2, c0Var2, s2Var2, w1Var3.f8221b, j15);
                    c0Var = c0Var2;
                    j11 = j15;
                    z11 = z15;
                    j13 = jK;
                    i11 = 2;
                    j14 = j13;
                    q0Var = this;
                }
                q0Var.I = q0Var.p(c0Var, j13, j11, j14, z11, i11);
                return;
            }
            q0Var.V = p0Var;
            z11 = z10;
            c0Var = c0VarM;
            j13 = jLongValue;
            i11 = 2;
            j14 = j13;
            q0Var = this;
            q0Var.I = q0Var.p(c0Var, j13, j11, j14, z11, i11);
            return;
        } catch (Throwable th6) {
            th = th6;
        }
        j10 = 0;
    }

    public final long K(j4.c0 c0Var, long j10, boolean z10, boolean z11) throws n {
        c0();
        this.N = false;
        if (z11 || this.I.f8223e == 3) {
            X(2);
        }
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = i1Var;
        while (i1Var2 != null && !c0Var.equals(i1Var2.f7925f.f7945a)) {
            i1Var2 = i1Var2.f7930l;
        }
        if (z10 || i1Var != i1Var2 || (i1Var2 != null && i1Var2.f7933o + j10 < 0)) {
            e[] eVarArr = this.f8073a;
            for (e eVar : eVarArr) {
                c(eVar);
            }
            if (i1Var2 != null) {
                while (k1Var.h != i1Var2) {
                    k1Var.a();
                }
                k1Var.k(i1Var2);
                i1Var2.f7933o = 1000000000000L;
                f(new boolean[eVarArr.length]);
            }
        }
        if (i1Var2 != null) {
            ?? r10 = i1Var2.f7921a;
            k1Var.k(i1Var2);
            if (!i1Var2.d) {
                i1Var2.f7925f = i1Var2.f7925f.b(j10);
            } else if (i1Var2.f7924e) {
                j10 = r10.o(j10);
                r10.p(j10 - this.f8083x);
            }
            E(j10);
            t();
        } else {
            k1Var.b();
            E(j10);
        }
        l(false);
        this.f8079n.d(2);
        return j10;
    }

    public final void L(e2 e2Var) {
        d5.d0 d0Var = this.f8079n;
        if (e2Var.f7817f != this.f8081s) {
            d0Var.a(15, e2Var).b();
            return;
        }
        synchronized (e2Var) {
        }
        try {
            e2Var.f7813a.handleMessage(e2Var.d, e2Var.f7816e);
            e2Var.b(true);
            int i10 = this.I.f8223e;
            if (i10 == 3 || i10 == 2) {
                d0Var.d(2);
            }
        } catch (Throwable th) {
            e2Var.b(true);
            throw th;
        }
    }

    public final void M(e2 e2Var) {
        Looper looper = e2Var.f7817f;
        if (looper.getThread().isAlive()) {
            this.B.a(looper, null).c(new f2.r(this, e2Var));
        } else {
            d5.a.K("TAG", "Trying to send message on a dead thread.");
            e2Var.b(false);
        }
    }

    public final void O(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (e eVar : this.f8073a) {
                    if (!r(eVar) && this.f8075b.remove(eVar)) {
                        eVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void P(m0 m0Var) throws Throwable {
        this.J.a(1);
        int i10 = m0Var.f8020c;
        j4.g1 g1Var = m0Var.f8019b;
        ArrayList arrayList = m0Var.f8018a;
        if (i10 != -1) {
            this.V = new p0(new f2(arrayList, g1Var), m0Var.f8020c, m0Var.d);
        }
        s1 s1Var = this.E;
        ArrayList arrayList2 = s1Var.f8147b;
        s1Var.g(0, arrayList2.size());
        m(s1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final void Q(boolean z10) {
        if (z10 == this.T) {
            return;
        }
        this.T = z10;
        if (z10 || !this.I.f8232o) {
            return;
        }
        this.f8079n.d(2);
    }

    public final void R(boolean z10) throws n {
        this.L = z10;
        D();
        if (this.M) {
            k1 k1Var = this.D;
            if (k1Var.f8001i != k1Var.h) {
                I(true);
                l(false);
            }
        }
    }

    public final void S(int i10, int i11, boolean z10, boolean z11) {
        this.J.a(z11 ? 1 : 0);
        ue.f fVar = this.J;
        fVar.f48540b = true;
        fVar.f48543f = true;
        fVar.f48544g = i11;
        this.I = this.I.c(i10, z10);
        this.N = false;
        for (i1 i1Var = this.D.h; i1Var != null; i1Var = i1Var.f7930l) {
            for (b5.s sVar : i1Var.f7932n.f2030c) {
                if (sVar != null) {
                    sVar.g(z10);
                }
            }
        }
        if (!Y()) {
            c0();
            f0();
            return;
        }
        int i12 = this.I.f8223e;
        d5.d0 d0Var = this.f8079n;
        if (i12 == 3) {
            a0();
            d0Var.d(2);
        } else if (i12 == 2) {
            d0Var.d(2);
        }
    }

    public final void T(x1 x1Var) {
        k kVar = this.f8084y;
        kVar.setPlaybackParameters(x1Var);
        x1 playbackParameters = kVar.getPlaybackParameters();
        o(playbackParameters, playbackParameters.f8242a, true, true);
    }

    public final void U(int i10) throws n {
        this.P = i10;
        s2 s2Var = this.I.f8220a;
        k1 k1Var = this.D;
        k1Var.f7999f = i10;
        if (!k1Var.n(s2Var)) {
            I(true);
        }
        l(false);
    }

    public final void V(boolean z10) throws n {
        this.Q = z10;
        s2 s2Var = this.I.f8220a;
        k1 k1Var = this.D;
        k1Var.f8000g = z10;
        if (!k1Var.n(s2Var)) {
            I(true);
        }
        l(false);
    }

    public final void W(j4.g1 g1Var) throws Throwable {
        this.J.a(1);
        s1 s1Var = this.E;
        int size = s1Var.f8147b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.g().e(0, size);
        }
        s1Var.f8153j = g1Var;
        m(s1Var.b(), false);
    }

    public final void X(int i10) {
        w1 w1Var = this.I;
        if (w1Var.f8223e != i10) {
            if (i10 != 2) {
                this.f8074a0 = -9223372036854775807L;
            }
            this.I = w1Var.f(i10);
        }
    }

    public final boolean Y() {
        w1 w1Var = this.I;
        return w1Var.f8229l && w1Var.f8230m == 0;
    }

    public final boolean Z(s2 s2Var, j4.c0 c0Var) {
        if (c0Var.a() || s2Var.p()) {
            return false;
        }
        int i10 = s2Var.g(c0Var.f12503a, this.f8082w).f8069c;
        r2 r2Var = this.v;
        s2Var.n(i10, r2Var);
        return r2Var.a() && r2Var.f8118r && r2Var.f8116f != -9223372036854775807L;
    }

    @Override
    public final void a(j4.d1 d1Var) {
        this.f8079n.a(9, (j4.z) d1Var).b();
    }

    public final void a0() {
        this.N = false;
        k kVar = this.f8084y;
        kVar.f7960f = true;
        kVar.f7956a.b();
        for (e eVar : this.f8073a) {
            if (r(eVar)) {
                eVar.start();
            }
        }
    }

    public final void b(m0 m0Var, int i10) throws Throwable {
        this.J.a(1);
        s1 s1Var = this.E;
        if (i10 == -1) {
            i10 = s1Var.f8147b.size();
        }
        m(s1Var.a(i10, m0Var.f8018a, m0Var.f8019b), false);
    }

    public final void b0(boolean z10, boolean z11) {
        C(z10 || !this.R, false, true, false);
        this.J.a(z11 ? 1 : 0);
        this.f8078f.b(true);
        X(1);
    }

    public final void c(e eVar) {
        if (r(eVar)) {
            k kVar = this.f8084y;
            if (eVar == kVar.f7958c) {
                kVar.d = null;
                kVar.f7958c = null;
                kVar.f7959e = true;
            }
            if (eVar.getState() == 2) {
                eVar.stop();
            }
            eVar.disable();
            this.U--;
        }
    }

    public final void c0() {
        k kVar = this.f8084y;
        kVar.f7960f = false;
        c2.c0 c0Var = kVar.f7956a;
        if (c0Var.f2243a) {
            c0Var.a(c0Var.getPositionUs());
            c0Var.f2243a = false;
        }
        for (e eVar : this.f8073a) {
            if (r(eVar) && eVar.getState() == 2) {
                eVar.stop();
            }
        }
    }

    public final void d() throws n {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        w1 w1Var;
        long j11;
        i1 i1Var;
        i iVar;
        long j12;
        long j13;
        int i11;
        k1 k1Var;
        long j14;
        i1 i1Var2;
        boolean z14;
        boolean z15;
        int i12;
        boolean zS;
        boolean z16;
        boolean z17;
        boolean z18;
        w1 w1Var2;
        boolean z19;
        int i13;
        int i14;
        e[] eVarArr;
        w1 w1Var3;
        e[] eVarArr2;
        i1 i1Var3;
        int i15;
        j4.b1 b1Var;
        i1 i1Var4;
        k1 k1Var2;
        boolean z20;
        i1 i1Var5;
        i1 i1Var6;
        i1 i1VarA;
        boolean z21;
        j4.c0 c0Var;
        j4.c0 c0Var2;
        b5.z zVar;
        j4.b1[] b1VarArr;
        int i16;
        boolean z22;
        e[] eVarArr3;
        e eVar;
        boolean z23;
        b5.s sVar;
        int length;
        t0[] t0VarArr;
        int i17;
        this.B.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f8079n.f4782a.removeMessages(2);
        long j15 = Long.MIN_VALUE;
        long j16 = -9223372036854775807L;
        if (this.I.f8220a.p() || !this.E.f8154k) {
            j15 = Long.MIN_VALUE;
            z10 = false;
            i10 = 1;
        } else {
            k1 k1Var3 = this.D;
            long j17 = this.W;
            i1 i1Var7 = k1Var3.f8002j;
            if (i1Var7 != null) {
                d5.a.i(i1Var7.f7930l == null);
                if (i1Var7.d) {
                    i1Var7.f7921a.I(j17 - i1Var7.f7933o);
                }
            }
            k1 k1Var4 = this.D;
            i1 i1Var8 = k1Var4.f8002j;
            if (i1Var8 == null || (!i1Var8.f7925f.f7951i && i1Var8.d && ((!i1Var8.f7924e || i1Var8.f7921a.D() == Long.MIN_VALUE) && k1Var4.f8002j.f7925f.f7948e != -9223372036854775807L && k1Var4.f8003k < 100))) {
                k1 k1Var5 = this.D;
                long j18 = this.W;
                w1 w1Var4 = this.I;
                i1 i1Var9 = k1Var5.f8002j;
                j1 j1VarD = i1Var9 == null ? k1Var5.d(w1Var4.f8220a, w1Var4.f8221b, w1Var4.f8222c, w1Var4.f8235r) : k1Var5.c(w1Var4.f8220a, i1Var9, j18);
                if (j1VarD != null) {
                    k1 k1Var6 = this.D;
                    h2[] h2VarArr = this.f8076c;
                    b5.v vVar = this.d;
                    com.google.android.exoplayer2.upstream.r rVar = this.f8078f.f7936a;
                    s1 s1Var = this.E;
                    b5.z zVar2 = this.f8077e;
                    i1 i1Var10 = k1Var6.f8002j;
                    i1 i1Var11 = new i1(h2VarArr, i1Var10 == null ? 1000000000000L : (i1Var10.f7933o + i1Var10.f7925f.f7948e) - j1VarD.f7946b, vVar, rVar, s1Var, j1VarD, zVar2);
                    i1 i1Var12 = k1Var6.f8002j;
                    if (i1Var12 == null) {
                        k1Var6.h = i1Var11;
                        k1Var6.f8001i = i1Var11;
                    } else if (i1Var11 != i1Var12.f7930l) {
                        i1Var12.b();
                        i1Var12.f7930l = i1Var11;
                        i1Var12.c();
                    }
                    k1Var6.f8004l = null;
                    k1Var6.f8002j = i1Var11;
                    k1Var6.f8003k++;
                    k1Var6.j();
                    i1Var11.f7921a.E(this, j1VarD.f7946b);
                    if (this.D.h == i1Var11) {
                        E(j1VarD.f7946b);
                    }
                    l(false);
                }
                if (this.O) {
                    this.O = q();
                    d0();
                } else {
                    t();
                }
                eVarArr2 = this.f8073a;
                k1 k1Var7 = this.D;
                i1Var3 = k1Var7.f8001i;
                if (i1Var3 != null) {
                    z10 = false;
                    i10 = 1;
                    break;
                }
                if (i1Var3.f7930l == null && !this.M) {
                    if (!i1Var3.d) {
                        z10 = false;
                        i10 = 1;
                        break;
                    }
                    int i18 = 0;
                    while (true) {
                        if (i18 >= eVarArr2.length) {
                            i1 i1Var13 = i1Var3.f7930l;
                            if (i1Var13.d || this.W >= i1Var13.e()) {
                                b5.z zVar3 = i1Var3.f7932n;
                                i1 i1Var14 = k1Var7.f8001i;
                                d5.a.i((i1Var14 == null || i1Var14.f7930l == null) ? false : true);
                                k1Var7.f8001i = k1Var7.f8001i.f7930l;
                                k1Var7.j();
                                i1 i1Var15 = k1Var7.f8001i;
                                b5.z zVar4 = i1Var15.f7932n;
                                s2 s2Var = this.I.f8220a;
                                z10 = false;
                                i10 = 1;
                                g0(s2Var, i1Var15.f7925f.f7945a, s2Var, i1Var3.f7925f.f7945a, -9223372036854775807L);
                                if (i1Var15.d && i1Var15.f7921a.w() != j16) {
                                    long jE = i1Var15.e();
                                    for (e eVar2 : eVarArr2) {
                                        if (eVar2.getStream() != null) {
                                            N(eVar2, jE);
                                        }
                                    }
                                    break;
                                }
                                for (int i19 = 0; i19 < eVarArr2.length; i19++) {
                                    boolean zB = zVar3.b(i19);
                                    boolean zB2 = zVar4.b(i19);
                                    if (zB && !eVarArr2[i19].isCurrentStreamFinal()) {
                                        boolean z24 = this.f8076c[i19].getTrackType() == -2;
                                        i2 i2Var = zVar3.f2029b[i19];
                                        i2 i2Var2 = zVar4.f2029b[i19];
                                        if (!zB2 || !i2Var2.equals(i2Var) || z24) {
                                            N(eVarArr2[i19], i1Var15.e());
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            e eVar3 = eVarArr2[i18];
                            j4.b1 b1Var2 = i1Var3.f7923c[i18];
                            if (eVar3.getStream() == b1Var2) {
                                if (b1Var2 != null && !eVar3.hasReadStreamToEnd()) {
                                    i1 i1Var16 = i1Var3.f7930l;
                                    if (!i1Var3.f7925f.f7949f || !i1Var16.d || (!(eVar3 instanceof r4.m) && !(eVar3 instanceof z3.f) && eVar3.getReadingPositionUs() < i1Var16.e())) {
                                    }
                                }
                                i18++;
                            }
                        }
                        z10 = false;
                        i10 = 1;
                        break;
                    }
                }
                z10 = false;
                i10 = 1;
                if (i1Var3.f7925f.f7951i || this.M) {
                    for (i15 = 0; i15 < eVarArr2.length; i15++) {
                        e eVar4 = eVarArr2[i15];
                        b1Var = i1Var3.f7923c[i15];
                        if (b1Var == null && eVar4.getStream() == b1Var && eVar4.hasReadStreamToEnd()) {
                            long j19 = i1Var3.f7925f.f7948e;
                            N(eVar4, (j19 == j16 || j19 == j15) ? j16 : i1Var3.f7933o + j19);
                        }
                    }
                }
                k1 k1Var8 = this.D;
                i1Var4 = k1Var8.f8001i;
                if (i1Var4 != null && k1Var8.h != i1Var4 && !i1Var4.f7926g) {
                    zVar = i1Var4.f7932n;
                    b1VarArr = i1Var4.f7923c;
                    i16 = 0;
                    z22 = false;
                    while (true) {
                        eVarArr3 = this.f8073a;
                        if (i16 < eVarArr3.length) {
                            break;
                        }
                        eVar = eVarArr3[i16];
                        if (r(eVar)) {
                            if (eVar.getStream() != b1VarArr[i16]) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if (zVar.b(i16) || z23) {
                                if (!eVar.isCurrentStreamFinal()) {
                                    sVar = zVar.f2030c[i16];
                                    if (sVar != null) {
                                        length = sVar.length();
                                    } else {
                                        length = 0;
                                    }
                                    t0VarArr = new t0[length];
                                    for (i17 = 0; i17 < length; i17++) {
                                        t0VarArr[i17] = sVar.h(i17);
                                    }
                                    eVar.replaceStream(t0VarArr, b1VarArr[i16], i1Var4.e(), i1Var4.f7933o);
                                } else if (eVar.isEnded()) {
                                    c(eVar);
                                } else {
                                    z22 = true;
                                }
                            }
                        }
                        i16++;
                    }
                    if (!z22) {
                        f(new boolean[eVarArr3.length]);
                    }
                }
                k1Var2 = this.D;
                z20 = false;
                while (Y() && !this.M && (i1Var5 = k1Var2.h) != null && (i1Var6 = i1Var5.f7930l) != null && this.W >= i1Var6.e() && i1Var6.f7926g) {
                    if (z20) {
                        u();
                    }
                    i1VarA = k1Var2.a();
                    i1VarA.getClass();
                    if (this.I.f8221b.f12503a.equals(i1VarA.f7925f.f7945a.f12503a)) {
                        c0Var = this.I.f8221b;
                        if (c0Var.f12504b == -1) {
                            c0Var2 = i1VarA.f7925f.f7945a;
                            if (c0Var2.f12504b == -1 || c0Var.f12506e == c0Var2.f12506e) {
                                z21 = false;
                            } else {
                                z21 = true;
                            }
                        } else {
                            z21 = false;
                        }
                    } else {
                        z21 = false;
                    }
                    j1 j1Var = i1VarA.f7925f;
                    j4.c0 c0Var3 = j1Var.f7945a;
                    boolean z25 = z21;
                    long j20 = j1Var.f7946b;
                    this.I = p(c0Var3, j20, j1Var.f7947c, j20, !z25, 0);
                    D();
                    f0();
                    z20 = true;
                }
            } else {
                j16 = -9223372036854775807L;
            }
            j15 = Long.MIN_VALUE;
            if (this.O) {
                this.O = q();
                d0();
            } else {
                t();
            }
            eVarArr2 = this.f8073a;
            k1 k1Var9 = this.D;
            i1Var3 = k1Var9.f8001i;
            if (i1Var3 != null) {
                z10 = false;
                i10 = 1;
                break;
            }
            if (i1Var3.f7930l == null) {
                z10 = false;
                i10 = 1;
                if (i1Var3.f7925f.f7951i) {
                    while (i15 < eVarArr2.length) {
                        e eVar5 = eVarArr2[i15];
                        b1Var = i1Var3.f7923c[i15];
                        if (b1Var == null) {
                        }
                    }
                } else {
                    while (i15 < eVarArr2.length) {
                        e eVar6 = eVarArr2[i15];
                        b1Var = i1Var3.f7923c[i15];
                        if (b1Var == null) {
                        }
                    }
                }
            } else {
                z10 = false;
                i10 = 1;
                if (i1Var3.f7925f.f7951i) {
                    while (i15 < eVarArr2.length) {
                        e eVar7 = eVarArr2[i15];
                        b1Var = i1Var3.f7923c[i15];
                        if (b1Var == null) {
                        }
                    }
                } else {
                    while (i15 < eVarArr2.length) {
                        e eVar8 = eVarArr2[i15];
                        b1Var = i1Var3.f7923c[i15];
                        if (b1Var == null) {
                        }
                    }
                }
            }
            k1 k1Var10 = this.D;
            i1Var4 = k1Var10.f8001i;
            if (i1Var4 != null) {
                zVar = i1Var4.f7932n;
                b1VarArr = i1Var4.f7923c;
                i16 = 0;
                z22 = false;
                while (true) {
                    eVarArr3 = this.f8073a;
                    if (i16 < eVarArr3.length) {
                        break;
                        break;
                    }
                    eVar = eVarArr3[i16];
                    if (r(eVar)) {
                        if (eVar.getStream() != b1VarArr[i16]) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (zVar.b(i16)) {
                            if (!eVar.isCurrentStreamFinal()) {
                                sVar = zVar.f2030c[i16];
                                if (sVar != null) {
                                    length = sVar.length();
                                } else {
                                    length = 0;
                                }
                                t0VarArr = new t0[length];
                                while (i17 < length) {
                                    t0VarArr[i17] = sVar.h(i17);
                                }
                                eVar.replaceStream(t0VarArr, b1VarArr[i16], i1Var4.e(), i1Var4.f7933o);
                            } else if (eVar.isEnded()) {
                                c(eVar);
                            } else {
                                z22 = true;
                            }
                        } else if (!eVar.isCurrentStreamFinal()) {
                            sVar = zVar.f2030c[i16];
                            if (sVar != null) {
                                length = sVar.length();
                            } else {
                                length = 0;
                            }
                            t0VarArr = new t0[length];
                            while (i17 < length) {
                                t0VarArr[i17] = sVar.h(i17);
                            }
                            eVar.replaceStream(t0VarArr, b1VarArr[i16], i1Var4.e(), i1Var4.f7933o);
                        } else if (eVar.isEnded()) {
                            c(eVar);
                        } else {
                            z22 = true;
                        }
                    }
                    i16++;
                }
                if (!z22) {
                    f(new boolean[eVarArr3.length]);
                }
            }
            k1Var2 = this.D;
            z20 = false;
            while (Y()) {
                if (z20) {
                    u();
                }
                i1VarA = k1Var2.a();
                i1VarA.getClass();
                if (this.I.f8221b.f12503a.equals(i1VarA.f7925f.f7945a.f12503a)) {
                    c0Var = this.I.f8221b;
                    if (c0Var.f12504b == -1) {
                        c0Var2 = i1VarA.f7925f.f7945a;
                        if (c0Var2.f12504b == -1) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                    } else {
                        z21 = false;
                    }
                } else {
                    z21 = false;
                }
                j1 j1Var2 = i1VarA.f7925f;
                j4.c0 c0Var4 = j1Var2.f7945a;
                boolean z26 = z21;
                long j21 = j1Var2.f7946b;
                this.I = p(c0Var4, j21, j1Var2.f7947c, j21, !z26, 0);
                D();
                f0();
                z20 = true;
            }
        }
        int i20 = this.I.f8223e;
        if (i20 == i10 || i20 == 4) {
            return;
        }
        i1 i1Var17 = this.D.h;
        if (i1Var17 == null) {
            this.f8079n.f4782a.sendEmptyMessageAtTime(2, jUptimeMillis + 10);
            return;
        }
        d5.a.c("doSomeWork");
        f0();
        if (i1Var17.d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            i1Var17.f7921a.p(this.I.f8235r - this.f8083x);
            int i21 = 0;
            boolean z27 = true;
            z12 = true;
            while (true) {
                e[] eVarArr4 = this.f8073a;
                if (i21 >= eVarArr4.length) {
                    break;
                }
                e eVar9 = eVarArr4[i21];
                if (r(eVar9)) {
                    eVar9.render(this.W, jElapsedRealtime);
                    z27 = z27 && eVar9.isEnded();
                    boolean z28 = i1Var17.f7923c[i21] != eVar9.getStream();
                    boolean z29 = z28 || (!z28 && eVar9.hasReadStreamToEnd()) || eVar9.isReady() || eVar9.isEnded();
                    z12 = z12 && z29;
                    if (!z29) {
                        eVar9.maybeThrowStreamError();
                    }
                }
                i21++;
            }
            z11 = z27;
        } else {
            i1Var17.f7921a.m();
            z11 = true;
            z12 = true;
        }
        long j22 = i1Var17.f7925f.f7948e;
        if (z11 && i1Var17.d) {
            j10 = -9223372036854775807L;
            z13 = j22 == -9223372036854775807L || j22 <= this.I.f8235r;
            if (z13 && this.M) {
                this.M = z10;
                S(this.I.f8230m, 5, z10, z10);
            }
            if (z13 || !i1Var17.f7925f.f7951i) {
                w1Var = this.I;
                if (w1Var.f8223e == 2) {
                    k1Var = this.D;
                    if (this.U == 0) {
                        zS = s();
                        j11 = jUptimeMillis;
                    } else {
                        if (z12) {
                            if (w1Var.f8225g) {
                                if (Z(w1Var.f8220a, k1Var.h.f7925f.f7945a)) {
                                    j14 = this.F.h;
                                } else {
                                    j14 = j10;
                                }
                                i1Var2 = k1Var.f8002j;
                                if (i1Var2.d || ((i1Var2.f7924e && i1Var2.f7921a.D() != j15) || !i1Var2.f7925f.f7951i)) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                if (i1Var2.f7925f.f7945a.a() || i1Var2.d) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                if (!z14 || z15) {
                                    j11 = jUptimeMillis;
                                } else {
                                    j jVar = this.f8078f;
                                    j11 = jUptimeMillis;
                                    long j23 = this.I.f8233p;
                                    i1 i1Var18 = this.D.f8002j;
                                    long jMax = i1Var18 == null ? 0L : Math.max(0L, j23 - (this.W - i1Var18.f7933o));
                                    float f10 = this.f8084y.getPlaybackParameters().f8242a;
                                    boolean z30 = this.N;
                                    jVar.getClass();
                                    long jX = d5.g0.x(jMax, f10);
                                    long jMin = z30 ? jVar.f7939e : jVar.d;
                                    if (j14 != j10) {
                                        jMin = Math.min(j14 / 2, jMin);
                                    }
                                    if (jMin > 0 && jX < jMin) {
                                        com.google.android.exoplayer2.upstream.r rVar2 = jVar.f7936a;
                                        synchronized (rVar2) {
                                            i12 = rVar2.d * rVar2.f3034b;
                                        }
                                        if (i12 >= jVar.h) {
                                        }
                                    }
                                }
                            } else {
                                j11 = jUptimeMillis;
                            }
                            zS = true;
                        } else {
                            j11 = jUptimeMillis;
                        }
                        zS = false;
                    }
                    if (zS) {
                        X(3);
                        this.Z = null;
                        if (Y()) {
                            a0();
                        }
                    }
                } else {
                    j11 = jUptimeMillis;
                }
                if (this.I.f8223e == 3 && (this.U != 0 ? !z12 : !s())) {
                    this.N = Y();
                    X(2);
                    if (this.N) {
                        for (i1Var = this.D.h; i1Var != null; i1Var = i1Var.f7930l) {
                            for (b5.s sVar2 : i1Var.f7932n.f2030c) {
                                if (sVar2 != null) {
                                    sVar2.t();
                                }
                            }
                        }
                        iVar = this.F;
                        j12 = iVar.h;
                        if (j12 != j10) {
                            long j24 = j12 + iVar.f7908b;
                            iVar.h = j24;
                            j13 = iVar.f7912g;
                            if (j13 != j10 && j24 > j13) {
                                iVar.h = j13;
                            }
                            iVar.f7916l = j10;
                        }
                    }
                    c0();
                }
            } else {
                X(4);
                c0();
                j11 = jUptimeMillis;
            }
            if (this.I.f8223e == 2) {
                i14 = 0;
                while (true) {
                    eVarArr = this.f8073a;
                    if (i14 < eVarArr.length) {
                        break;
                    }
                    if (!r(eVarArr[i14]) && this.f8073a[i14].getStream() == i1Var17.f7923c[i14]) {
                        this.f8073a[i14].maybeThrowStreamError();
                    }
                    i14++;
                }
                w1Var3 = this.I;
                if (w1Var3.f8225g && w1Var3.f8234q < 500000 && q()) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                z16 = false;
            }
            if (!z16) {
                this.f8074a0 = j10;
            } else if (this.f8074a0 == j10) {
                this.B.getClass();
                this.f8074a0 = SystemClock.elapsedRealtime();
            } else {
                this.B.getClass();
                if (SystemClock.elapsedRealtime() - this.f8074a0 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            if (Y() || this.I.f8223e != 3) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!this.T && this.S && z17) {
                z18 = true;
            } else {
                z18 = false;
            }
            w1Var2 = this.I;
            if (w1Var2.f8232o != z18) {
                z19 = z18;
                this.I = new w1(w1Var2.f8220a, w1Var2.f8221b, w1Var2.f8222c, w1Var2.d, w1Var2.f8223e, w1Var2.f8224f, w1Var2.f8225g, w1Var2.h, w1Var2.f8226i, w1Var2.f8227j, w1Var2.f8228k, w1Var2.f8229l, w1Var2.f8230m, w1Var2.f8231n, w1Var2.f8233p, w1Var2.f8234q, w1Var2.f8235r, z19);
            } else {
                z19 = z18;
            }
            this.S = false;
            if (!z19 && (i13 = this.I.f8223e) != 4) {
                if (!z17 || i13 == 2) {
                    this.f8079n.f4782a.sendEmptyMessageAtTime(2, j11 + 10);
                } else if (i13 == 3 && this.U != 0) {
                    this.f8079n.f4782a.sendEmptyMessageAtTime(2, j11 + 1000);
                }
            }
            d5.a.q();
        }
        j10 = -9223372036854775807L;
        if (z13) {
            this.M = z10;
            S(this.I.f8230m, 5, z10, z10);
        }
        if (z13) {
            w1Var = this.I;
            if (w1Var.f8223e == 2) {
                k1Var = this.D;
                if (this.U == 0) {
                    zS = s();
                    j11 = jUptimeMillis;
                } else {
                    if (z12) {
                        j11 = jUptimeMillis;
                    } else {
                        if (w1Var.f8225g) {
                            if (Z(w1Var.f8220a, k1Var.h.f7925f.f7945a)) {
                                j14 = this.F.h;
                            } else {
                                j14 = j10;
                            }
                            i1Var2 = k1Var.f8002j;
                            if (i1Var2.d) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (i1Var2.f7925f.f7945a.a()) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                j11 = jUptimeMillis;
                            } else {
                                j11 = jUptimeMillis;
                            }
                        } else {
                            j11 = jUptimeMillis;
                        }
                        zS = true;
                    }
                    zS = false;
                }
                if (zS) {
                    X(3);
                    this.Z = null;
                    if (Y()) {
                        a0();
                    }
                }
            } else {
                j11 = jUptimeMillis;
            }
            if (this.I.f8223e == 3) {
                this.N = Y();
                X(2);
                if (this.N) {
                    while (i1Var != null) {
                        while (i11 < r7) {
                            if (sVar2 != null) {
                                sVar2.t();
                            }
                        }
                    }
                    iVar = this.F;
                    j12 = iVar.h;
                    if (j12 != j10) {
                        long j25 = j12 + iVar.f7908b;
                        iVar.h = j25;
                        j13 = iVar.f7912g;
                        if (j13 != j10) {
                            iVar.h = j13;
                        }
                        iVar.f7916l = j10;
                    }
                }
                c0();
            }
        } else {
            w1Var = this.I;
            if (w1Var.f8223e == 2) {
                k1Var = this.D;
                if (this.U == 0) {
                    zS = s();
                    j11 = jUptimeMillis;
                } else {
                    if (z12) {
                        j11 = jUptimeMillis;
                    } else {
                        if (w1Var.f8225g) {
                            if (Z(w1Var.f8220a, k1Var.h.f7925f.f7945a)) {
                                j14 = this.F.h;
                            } else {
                                j14 = j10;
                            }
                            i1Var2 = k1Var.f8002j;
                            if (i1Var2.d) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (i1Var2.f7925f.f7945a.a()) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                j11 = jUptimeMillis;
                            } else {
                                j11 = jUptimeMillis;
                            }
                        } else {
                            j11 = jUptimeMillis;
                        }
                        zS = true;
                    }
                    zS = false;
                }
                if (zS) {
                    X(3);
                    this.Z = null;
                    if (Y()) {
                        a0();
                    }
                }
            } else {
                j11 = jUptimeMillis;
            }
            if (this.I.f8223e == 3) {
                this.N = Y();
                X(2);
                if (this.N) {
                    while (i1Var != null) {
                        while (i11 < r7) {
                            if (sVar2 != null) {
                                sVar2.t();
                            }
                        }
                    }
                    iVar = this.F;
                    j12 = iVar.h;
                    if (j12 != j10) {
                        long j26 = j12 + iVar.f7908b;
                        iVar.h = j26;
                        j13 = iVar.f7912g;
                        if (j13 != j10) {
                            iVar.h = j13;
                        }
                        iVar.f7916l = j10;
                    }
                }
                c0();
            }
        }
        if (this.I.f8223e == 2) {
            i14 = 0;
            while (true) {
                eVarArr = this.f8073a;
                if (i14 < eVarArr.length) {
                    break;
                    break;
                } else {
                    if (!r(eVarArr[i14])) {
                    }
                    i14++;
                }
            }
            w1Var3 = this.I;
            if (w1Var3.f8225g) {
                z16 = false;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        if (!z16) {
            this.f8074a0 = j10;
        } else if (this.f8074a0 == j10) {
            this.B.getClass();
            this.f8074a0 = SystemClock.elapsedRealtime();
        } else {
            this.B.getClass();
            if (SystemClock.elapsedRealtime() - this.f8074a0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (Y()) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (!this.T) {
            z18 = false;
        } else {
            z18 = false;
        }
        w1Var2 = this.I;
        if (w1Var2.f8232o != z18) {
            z19 = z18;
            this.I = new w1(w1Var2.f8220a, w1Var2.f8221b, w1Var2.f8222c, w1Var2.d, w1Var2.f8223e, w1Var2.f8224f, w1Var2.f8225g, w1Var2.h, w1Var2.f8226i, w1Var2.f8227j, w1Var2.f8228k, w1Var2.f8229l, w1Var2.f8230m, w1Var2.f8231n, w1Var2.f8233p, w1Var2.f8234q, w1Var2.f8235r, z19);
        } else {
            z19 = z18;
        }
        this.S = false;
        if (!z19) {
            if (z17) {
                this.f8079n.f4782a.sendEmptyMessageAtTime(2, j11 + 10);
            } else {
                this.f8079n.f4782a.sendEmptyMessageAtTime(2, j11 + 10);
            }
        }
        d5.a.q();
    }

    public final void d0() {
        i1 i1Var = this.D.f8002j;
        boolean z10 = this.O || (i1Var != null && i1Var.f7921a.b());
        w1 w1Var = this.I;
        if (z10 != w1Var.f8225g) {
            this.I = new w1(w1Var.f8220a, w1Var.f8221b, w1Var.f8222c, w1Var.d, w1Var.f8223e, w1Var.f8224f, z10, w1Var.h, w1Var.f8226i, w1Var.f8227j, w1Var.f8228k, w1Var.f8229l, w1Var.f8230m, w1Var.f8231n, w1Var.f8233p, w1Var.f8234q, w1Var.f8235r, w1Var.f8232o);
        }
    }

    @Override
    public final void e(j4.z zVar) {
        this.f8079n.a(8, zVar).b();
    }

    public final void e0(b5.z zVar) {
        b5.s[] sVarArr = zVar.f2030c;
        j jVar = this.f8078f;
        int iMax = jVar.f7940f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                e[] eVarArr = this.f8073a;
                int i12 = 13107200;
                if (i10 < eVarArr.length) {
                    if (sVarArr[i10] != null) {
                        switch (eVarArr[i10].getTrackType()) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        jVar.h = iMax;
        jVar.f7936a.a(iMax);
    }

    public final void f(boolean[] zArr) throws n {
        e[] eVarArr;
        Set set;
        b5.z zVar;
        d5.o oVar;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.f8001i;
        b5.z zVar2 = i1Var.f7932n;
        int i10 = 0;
        while (true) {
            eVarArr = this.f8073a;
            int length = eVarArr.length;
            set = this.f8075b;
            if (i10 >= length) {
                break;
            }
            if (!zVar2.b(i10) && set.remove(eVarArr[i10])) {
                eVarArr[i10].reset();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < eVarArr.length) {
            if (zVar2.b(i11)) {
                boolean z10 = zArr[i11];
                e eVar = eVarArr[i11];
                if (r(eVar)) {
                    zVar = zVar2;
                } else {
                    i1 i1Var2 = k1Var.f8001i;
                    boolean z11 = i1Var2 == k1Var.h;
                    b5.z zVar3 = i1Var2.f7932n;
                    i2 i2Var = zVar3.f2029b[i11];
                    b5.s sVar = zVar3.f2030c[i11];
                    int length2 = sVar != null ? sVar.length() : 0;
                    t0[] t0VarArr = new t0[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        t0VarArr[i12] = sVar.h(i12);
                    }
                    boolean z12 = Y() && this.I.f8223e == 3;
                    boolean z13 = !z10 && z12;
                    this.U++;
                    set.add(eVar);
                    zVar = zVar2;
                    boolean z14 = z12;
                    eVar.enable(i2Var, t0VarArr, i1Var2.f7923c[i11], this.W, z13, z11, i1Var2.e(), i1Var2.f7933o);
                    eVar.handleMessage(11, new l0(this));
                    k kVar = this.f8084y;
                    kVar.getClass();
                    d5.o mediaClock = eVar.getMediaClock();
                    if (mediaClock != null && mediaClock != (oVar = kVar.d)) {
                        if (oVar != null) {
                            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        kVar.d = mediaClock;
                        kVar.f7958c = eVar;
                        mediaClock.setPlaybackParameters((x1) kVar.f7956a.f2246e);
                    }
                    if (z14) {
                        eVar.start();
                    }
                }
            } else {
                zVar = zVar2;
            }
            i11++;
            zVar2 = zVar;
        }
        i1Var.f7926g = true;
    }

    public final void f0() {
        x1 playbackParameters;
        char c10;
        char c11;
        long jMax;
        i1 i1Var = this.D.h;
        if (i1Var == null) {
            return;
        }
        long jW = i1Var.d ? i1Var.f7921a.w() : -9223372036854775807L;
        if (jW != -9223372036854775807L) {
            E(jW);
            if (jW != this.I.f8235r) {
                w1 w1Var = this.I;
                this.I = p(w1Var.f8221b, jW, w1Var.f8222c, jW, true, 5);
            }
        } else {
            k kVar = this.f8084y;
            boolean z10 = i1Var != this.D.f8001i;
            c2.c0 c0Var = kVar.f7956a;
            e eVar = kVar.f7958c;
            if (eVar == null || eVar.isEnded() || (!kVar.f7958c.isReady() && (z10 || kVar.f7958c.hasReadStreamToEnd()))) {
                kVar.f7959e = true;
                if (kVar.f7960f) {
                    c0Var.b();
                }
            } else {
                d5.o oVar = kVar.d;
                oVar.getClass();
                long positionUs = oVar.getPositionUs();
                if (!kVar.f7959e) {
                    c0Var.a(positionUs);
                    playbackParameters = oVar.getPlaybackParameters();
                    if (!playbackParameters.equals((x1) c0Var.f2246e)) {
                        c0Var.setPlaybackParameters(playbackParameters);
                        kVar.f7957b.f8079n.a(16, playbackParameters).b();
                    }
                } else if (positionUs >= c0Var.getPositionUs()) {
                    kVar.f7959e = false;
                    if (kVar.f7960f) {
                        c0Var.b();
                    }
                    c0Var.a(positionUs);
                    playbackParameters = oVar.getPlaybackParameters();
                    if (!playbackParameters.equals((x1) c0Var.f2246e)) {
                        c0Var.setPlaybackParameters(playbackParameters);
                        kVar.f7957b.f8079n.a(16, playbackParameters).b();
                    }
                } else if (c0Var.f2243a) {
                    c0Var.a(c0Var.getPositionUs());
                    c0Var.f2243a = false;
                }
            }
            long positionUs2 = kVar.getPositionUs();
            this.W = positionUs2;
            long j10 = positionUs2 - i1Var.f7933o;
            long j11 = this.I.f8235r;
            if (!this.A.isEmpty() && !this.I.f8221b.a()) {
                if (this.Y) {
                    this.Y = false;
                }
                w1 w1Var2 = this.I;
                w1Var2.f8220a.b(w1Var2.f8221b.f12503a);
                int iMin = Math.min(this.X, this.A.size());
                if (iMin > 0 && this.A.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.A.size() && this.A.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.X = iMin;
            }
            this.I.f8235r = j10;
        }
        this.I.f8233p = this.D.f8002j.d();
        w1 w1Var3 = this.I;
        long j12 = w1Var3.f8233p;
        i1 i1Var2 = this.D.f8002j;
        w1Var3.f8234q = i1Var2 == null ? 0L : Math.max(0L, j12 - (this.W - i1Var2.f7933o));
        w1 w1Var4 = this.I;
        if (w1Var4.f8229l && w1Var4.f8223e == 3 && Z(w1Var4.f8220a, w1Var4.f8221b)) {
            w1 w1Var5 = this.I;
            float f10 = 1.0f;
            if (w1Var5.f8231n.f8242a == 1.0f) {
                i iVar = this.F;
                long jG = g(w1Var5.f8220a, w1Var5.f8221b.f12503a, w1Var5.f8235r);
                long j13 = this.I.f8233p;
                i1 i1Var3 = this.D.f8002j;
                if (i1Var3 == null) {
                    c10 = 1;
                    c11 = 0;
                    jMax = 0;
                } else {
                    c10 = 1;
                    c11 = 0;
                    jMax = Math.max(0L, j13 - (this.W - i1Var3.f7933o));
                }
                if (iVar.f7909c != r10) {
                    long j14 = jG - jMax;
                    long j15 = iVar.f7917m;
                    if (j15 == r10) {
                        iVar.f7917m = j14;
                        iVar.f7918n = 0L;
                    } else {
                        long jMax2 = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        iVar.f7917m = jMax2;
                        iVar.f7918n = (long) ((9.999871E-4f * Math.abs(j14 - jMax2)) + (0.999f * iVar.f7918n));
                    }
                    if (iVar.f7916l == r10 || SystemClock.elapsedRealtime() - iVar.f7916l >= 1000) {
                        iVar.f7916l = SystemClock.elapsedRealtime();
                        long j16 = (iVar.f7918n * 3) + iVar.f7917m;
                        if (iVar.h > j16) {
                            float fH = d5.g0.H(1000L);
                            long j17 = ((long) ((iVar.f7915k - 1.0f) * fH)) + ((long) ((iVar.f7913i - 1.0f) * fH));
                            long j18 = iVar.f7910e;
                            long j19 = iVar.h - j17;
                            long[] jArr = new long[3];
                            jArr[c11] = j16;
                            jArr[c10] = j18;
                            jArr[2] = j19;
                            long j20 = jArr[c11];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j21 = jArr[i10];
                                if (j21 > j20) {
                                    j20 = j21;
                                }
                            }
                            iVar.h = j20;
                        } else {
                            long jI = d5.g0.i(jG - ((long) (Math.max(0.0f, iVar.f7915k - 1.0f) / 1.0E-7f)), iVar.h, j16);
                            iVar.h = jI;
                            long j22 = iVar.f7912g;
                            if (j22 != -9223372036854775807 && jI > j22) {
                                iVar.h = j22;
                            }
                        }
                        long j23 = jG - iVar.h;
                        if (Math.abs(j23) < iVar.f7907a) {
                            iVar.f7915k = 1.0f;
                        } else {
                            iVar.f7915k = d5.g0.g((1.0E-7f * j23) + 1.0f, iVar.f7914j, iVar.f7913i);
                        }
                        f10 = iVar.f7915k;
                    } else {
                        f10 = iVar.f7915k;
                    }
                }
                if (this.f8084y.getPlaybackParameters().f8242a != f10) {
                    this.f8084y.setPlaybackParameters(new x1(f10, this.I.f8231n.f8243b));
                    o(this.I.f8231n, this.f8084y.getPlaybackParameters().f8242a, false, false);
                }
            }
        }
    }

    public final long g(s2 s2Var, Object obj, long j10) {
        p2 p2Var = this.f8082w;
        int i10 = s2Var.g(obj, p2Var).f8069c;
        r2 r2Var = this.v;
        s2Var.n(i10, r2Var);
        if (r2Var.f8116f != -9223372036854775807L && r2Var.a() && r2Var.f8118r) {
            return d5.g0.H(d5.g0.t(r2Var.h) - r2Var.f8116f) - (j10 + p2Var.f8070e);
        }
        return -9223372036854775807L;
    }

    public final void g0(s2 s2Var, j4.c0 c0Var, s2 s2Var2, j4.c0 c0Var2, long j10) {
        boolean Z = Z(s2Var, c0Var);
        Object obj = c0Var.f12503a;
        if (!Z) {
            x1 x1Var = c0Var.a() ? x1.d : this.I.f8231n;
            k kVar = this.f8084y;
            if (kVar.getPlaybackParameters().equals(x1Var)) {
                return;
            }
            kVar.setPlaybackParameters(x1Var);
            return;
        }
        p2 p2Var = this.f8082w;
        int i10 = s2Var.g(obj, p2Var).f8069c;
        r2 r2Var = this.v;
        s2Var.n(i10, r2Var);
        b1 b1Var = r2Var.v;
        int i11 = d5.g0.f4795a;
        i iVar = this.F;
        iVar.getClass();
        iVar.f7909c = d5.g0.H(b1Var.f7782a);
        iVar.f7911f = d5.g0.H(b1Var.f7783b);
        iVar.f7912g = d5.g0.H(b1Var.f7784c);
        float f10 = b1Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.f7914j = f10;
        float f11 = b1Var.f7785e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.f7913i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.f7909c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = g(s2Var, obj, j10);
            iVar.a();
            return;
        }
        if (d5.g0.a(!s2Var2.p() ? s2Var2.m(s2Var2.g(c0Var2.f12503a, p2Var).f8069c, r2Var, 0L).f8112a : null, r2Var.f8112a)) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    public final long h() {
        i1 i1Var = this.D.f8001i;
        if (i1Var == null) {
            return 0L;
        }
        long jMax = i1Var.f7933o;
        if (!i1Var.d) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            e[] eVarArr = this.f8073a;
            if (i10 >= eVarArr.length) {
                return jMax;
            }
            if (r(eVarArr[i10]) && eVarArr[i10].getStream() == i1Var.f7923c[i10]) {
                long readingPositionUs = eVarArr[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(readingPositionUs, jMax);
            }
            i10++;
        }
    }

    public final synchronized void h0(o oVar, long j10) {
        this.B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j10 > 0) {
            try {
                this.B.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            this.B.getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public final boolean handleMessage(Message message) throws Throwable {
        i1 i1Var;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    S(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((p0) message.obj);
                    break;
                case 4:
                    T((x1) message.obj);
                    break;
                case 5:
                    this.H = (j2) message.obj;
                    break;
                case 6:
                    b0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    n((j4.z) message.obj);
                    break;
                case 9:
                    j((j4.z) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    e2 e2Var = (e2) message.obj;
                    e2Var.getClass();
                    L(e2Var);
                    break;
                case 15:
                    M((e2) message.obj);
                    break;
                case 16:
                    x1 x1Var = (x1) message.obj;
                    o(x1Var, x1Var.f8242a, true, false);
                    break;
                case 17:
                    P((m0) message.obj);
                    break;
                case 18:
                    b((m0) message.obj, message.arg1);
                    break;
                case 19:
                    w((n0) message.obj);
                    break;
                case 20:
                    A(message.arg1, message.arg2, (j4.g1) message.obj);
                    break;
                case 21:
                    W((j4.g1) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                    Q(message.arg1 == 1);
                    break;
                case 25:
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (com.google.android.exoplayer2.upstream.n e9) {
            k(e9, e9.f3010a);
        } catch (n e10) {
            e = e10;
            if (e.f8028c == 1 && (i1Var = this.D.f8001i) != null) {
                e = e.a(i1Var.f7925f.f7945a);
            }
            if (e.f8032r && this.Z == null) {
                d5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Z = e;
                d5.d0 d0Var = this.f8079n;
                d5.c0 c0VarA = d0Var.a(25, e);
                Handler handler = d0Var.f4782a;
                Message message2 = c0VarA.f4780a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                c0VarA.a();
            } else {
                n nVar = this.Z;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.Z;
                }
                d5.a.p("ExoPlayerImplInternal", "Playback error", e);
                b0(true, false);
                this.I = this.I.d(e);
            }
        } catch (t1 e11) {
            boolean z10 = e11.f8195a;
            int i11 = e11.f8196b;
            if (i11 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else if (i11 == 4) {
                i10 = z10 ? 3002 : 3004;
            }
            k(e11, i10);
        } catch (j4.b e12) {
            k(e12, 1002);
        } catch (RuntimeException e13) {
            n nVar2 = new n(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            d5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            b0(true, false);
            this.I = this.I.d(nVar2);
        } catch (l3.e e14) {
            k(e14, e14.f15393a);
        } catch (IOException e15) {
            k(e15, 2000);
        }
        u();
        return true;
    }

    public final Pair i(s2 s2Var) {
        if (s2Var.p()) {
            return Pair.create(w1.f8219s, 0L);
        }
        Pair pairI = s2Var.i(this.v, this.f8082w, s2Var.a(this.Q), -9223372036854775807L);
        j4.c0 c0VarM = this.D.m(s2Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (c0VarM.a()) {
            Object obj = c0VarM.f12503a;
            p2 p2Var = this.f8082w;
            s2Var.g(obj, p2Var);
            jLongValue = c0VarM.f12505c == p2Var.f(c0VarM.f12504b) ? p2Var.h.f14454b : 0L;
        }
        return Pair.create(c0VarM, Long.valueOf(jLongValue));
    }

    public final void j(j4.z zVar) {
        i1 i1Var = this.D.f8002j;
        if (i1Var == null || i1Var.f7921a != zVar) {
            return;
        }
        long j10 = this.W;
        if (i1Var != null) {
            d5.a.i(i1Var.f7930l == null);
            if (i1Var.d) {
                i1Var.f7921a.I(j10 - i1Var.f7933o);
            }
        }
        t();
    }

    public final void k(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            nVar = nVar.a(i1Var.f7925f.f7945a);
        }
        d5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        b0(false, false);
        this.I = this.I.d(nVar);
    }

    public final void l(boolean z10) {
        i1 i1Var = this.D.f8002j;
        j4.c0 c0Var = i1Var == null ? this.I.f8221b : i1Var.f7925f.f7945a;
        boolean zEquals = this.I.f8228k.equals(c0Var);
        if (!zEquals) {
            this.I = this.I.a(c0Var);
        }
        w1 w1Var = this.I;
        w1Var.f8233p = i1Var == null ? w1Var.f8235r : i1Var.d();
        w1 w1Var2 = this.I;
        long j10 = w1Var2.f8233p;
        i1 i1Var2 = this.D.f8002j;
        w1Var2.f8234q = i1Var2 != null ? Math.max(0L, j10 - (this.W - i1Var2.f7933o)) : 0L;
        if ((!zEquals || z10) && i1Var != null && i1Var.d) {
            e0(i1Var.f7932n);
        }
    }

    public final void m(s2 s2Var, boolean z10) throws Throwable {
        Object obj;
        r2 r2Var;
        int iA;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        p2 p2Var;
        s2 s2Var2;
        long j10;
        boolean z15;
        long j11;
        o0 o0Var;
        int i11;
        long jLongValue;
        boolean z16;
        int i12;
        boolean z17;
        boolean z18;
        long j12;
        int iA3;
        boolean z19;
        long j13;
        boolean z20;
        long j14;
        j4.c0 c0Var;
        s2 s2Var3;
        Object obj2;
        boolean z21;
        int i13;
        boolean z22;
        long jK;
        j4.c0 c0Var2;
        long j15;
        j4.c0 c0Var3;
        s2 s2Var4;
        Object obj3;
        boolean z23;
        int i14;
        w1 w1Var = this.I;
        p0 p0Var = this.V;
        k1 k1Var = this.D;
        int i15 = this.P;
        boolean z24 = this.Q;
        r2 r2Var2 = this.v;
        p2 p2Var2 = this.f8082w;
        if (s2Var.p()) {
            s2Var2 = s2Var;
            o0Var = new o0(w1.f8219s, 0L, -9223372036854775807L, false, true, false);
        } else {
            j4.c0 c0Var4 = w1Var.f8221b;
            Object obj4 = c0Var4.f12503a;
            s2 s2Var5 = w1Var.f8220a;
            boolean z25 = s2Var5.p() || s2Var5.g(c0Var4.f12503a, p2Var2).f8071f;
            long jLongValue2 = (w1Var.f8221b.a() || z25) ? w1Var.f8222c : w1Var.f8235r;
            if (p0Var != null) {
                Pair pairG = G(s2Var, p0Var, true, i15, z24, r2Var2, p2Var2);
                if (pairG == null) {
                    iA3 = s2Var.a(z24);
                    j12 = jLongValue2;
                    obj = obj4;
                    z18 = false;
                    z19 = true;
                    z17 = false;
                } else {
                    if (p0Var.f8057c == -9223372036854775807L) {
                        jLongValue = jLongValue2;
                        obj = obj4;
                        z16 = false;
                        i12 = s2Var.g(pairG.first, p2Var2).f8069c;
                    } else {
                        obj = pairG.first;
                        jLongValue = ((Long) pairG.second).longValue();
                        z16 = true;
                        i12 = -1;
                    }
                    z17 = z16;
                    z18 = w1Var.f8223e == 4;
                    j12 = jLongValue;
                    iA3 = i12;
                    z19 = false;
                }
                z11 = z18;
                z12 = z19;
                z13 = z17;
                iA = iA3;
                i10 = -1;
                jLongValue2 = j12;
                r2Var = r2Var2;
            } else {
                obj = obj4;
                if (w1Var.f8220a.p()) {
                    iA = s2Var.a(z24);
                    r2Var = r2Var2;
                } else if (s2Var.b(obj) == -1) {
                    Object objH = H(r2Var2, p2Var2, i15, z24, obj, w1Var.f8220a, s2Var);
                    r2Var = r2Var2;
                    if (objH == null) {
                        p2Var2 = p2Var2;
                        iA2 = s2Var.a(z24);
                        z14 = true;
                    } else {
                        p2Var2 = p2Var2;
                        iA2 = s2Var.g(objH, p2Var2).f8069c;
                        z14 = false;
                    }
                    iA = iA2;
                    z12 = z14;
                    jLongValue2 = jLongValue2;
                    obj = obj;
                    i10 = -1;
                    z11 = false;
                    z13 = false;
                } else {
                    r2Var = r2Var2;
                    if (jLongValue2 == -9223372036854775807L) {
                        iA = s2Var.g(obj, p2Var2).f8069c;
                    } else if (z25) {
                        w1Var.f8220a.g(c0Var4.f12503a, p2Var2);
                        if (w1Var.f8220a.m(p2Var2.f8069c, r2Var, 0L).A == w1Var.f8220a.b(c0Var4.f12503a)) {
                            Pair pairI = s2Var.i(r2Var, p2Var2, s2Var.g(obj, p2Var2).f8069c, jLongValue2 + p2Var2.f8070e);
                            obj = pairI.first;
                            jLongValue2 = ((Long) pairI.second).longValue();
                        } else {
                            jLongValue2 = jLongValue2;
                            obj = obj;
                        }
                        iA = -1;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        iA = -1;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                i10 = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (iA != i10) {
                p2 p2Var3 = p2Var2;
                Pair pairI2 = s2Var.i(r2Var, p2Var3, iA, -9223372036854775807L);
                s2Var2 = s2Var;
                p2Var = p2Var3;
                obj = pairI2.first;
                jLongValue2 = ((Long) pairI2.second).longValue();
                j10 = -9223372036854775807L;
            } else {
                p2Var = p2Var2;
                s2Var2 = s2Var;
                j10 = jLongValue2;
            }
            j4.c0 c0VarM = k1Var.m(s2Var2, obj, jLongValue2);
            int i16 = c0VarM.f12506e;
            boolean z26 = c0Var4.f12503a.equals(obj) && !c0Var4.a() && !c0VarM.a() && (i16 == i10 || ((i11 = c0Var4.f12506e) != i10 && i16 >= i11));
            p2 p2VarG = s2Var2.g(obj, p2Var);
            if (z25 || jLongValue2 != j10) {
                z15 = false;
            } else {
                Object obj5 = c0Var4.f12503a;
                int i17 = c0Var4.f12505c;
                int i18 = c0Var4.f12504b;
                if (obj5.equals(c0VarM.f12503a) && (!(c0Var4.a() && p2VarG.g(i18)) ? !(c0VarM.a() && p2VarG.g(c0VarM.f12504b)) : p2VarG.e(i18, i17) == 4 || p2VarG.e(i18, i17) == 2)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (z26 || z15) {
                c0VarM = c0Var4;
            }
            if (!c0VarM.a()) {
                j11 = jLongValue2;
            } else if (c0VarM.equals(c0Var4)) {
                jLongValue2 = w1Var.f8235r;
                j11 = jLongValue2;
            } else {
                s2Var2.g(c0VarM.f12503a, p2Var);
                j11 = c0VarM.f12505c == p2Var.f(c0VarM.f12504b) ? p2Var.h.f14454b : 0L;
            }
            o0Var = new o0(c0VarM, j11, j10, z11, z12, z13);
        }
        j4.c0 c0Var5 = o0Var.f8045a;
        long j16 = o0Var.f8047c;
        boolean z27 = o0Var.d;
        long j17 = o0Var.f8046b;
        boolean z28 = (this.I.f8221b.equals(c0Var5) && j17 == this.I.f8235r) ? false : true;
        try {
            if (o0Var.f8048e) {
                try {
                    if (this.I.f8223e != 1) {
                        X(4);
                    }
                    z22 = false;
                    C(false, false, false, true);
                } catch (Throwable th) {
                    th = th;
                    j13 = j17;
                    z20 = false;
                    w1 w1Var2 = this.I;
                    s2 s2Var6 = w1Var2.f8220a;
                    j4.c0 c0Var6 = w1Var2.f8221b;
                    if (o0Var.f8049f) {
                        j14 = j13;
                    } else {
                        j14 = -9223372036854775807L;
                    }
                    c0Var = c0Var5;
                    s2Var3 = s2Var2;
                    g0(s2Var3, c0Var, s2Var6, c0Var6, j14);
                    if (z28) {
                        w1 w1Var3 = this.I;
                        obj2 = w1Var3.f8221b.f12503a;
                        s2 s2Var7 = w1Var3.f8220a;
                        if (z28) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        long j18 = this.I.d;
                        if (s2Var3.b(obj2) == -1) {
                            i13 = 4;
                        } else {
                            i13 = 3;
                        }
                        this.I = p(c0Var, j13, j16, j18, z21, i13);
                    } else {
                        w1 w1Var4 = this.I;
                        obj2 = w1Var4.f8221b.f12503a;
                        s2 s2Var8 = w1Var4.f8220a;
                        if (z28) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        long j19 = this.I.d;
                        if (s2Var3.b(obj2) == -1) {
                            i13 = 4;
                        } else {
                            i13 = 3;
                        }
                        this.I = p(c0Var, j13, j16, j19, z21, i13);
                    }
                    D();
                    F(s2Var3, this.I.f8220a);
                    this.I = this.I.g(s2Var3);
                    if (!s2Var3.p()) {
                        this.V = null;
                    }
                    l(z20);
                    throw th;
                }
            } else {
                z22 = false;
            }
            if (z28) {
                if (!s2Var2.p()) {
                    try {
                        i1 i1Var = this.D.h;
                        while (i1Var != null) {
                            try {
                                if (i1Var.f7925f.f7945a.equals(c0Var5)) {
                                    j1 j1VarG = this.D.g(s2Var2, i1Var.f7925f);
                                    i1Var.f7925f = j1VarG;
                                    try {
                                        Object obj6 = i1Var.f7921a;
                                        if (obj6 instanceof j4.d) {
                                            long j20 = j1VarG.d;
                                            if (j20 == -9223372036854775807L) {
                                                j20 = Long.MIN_VALUE;
                                            }
                                            j4.d dVar = (j4.d) obj6;
                                            c0Var2 = c0Var5;
                                            j13 = j17;
                                            try {
                                                dVar.f12536e = 0L;
                                                dVar.f12537f = j20;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                c0Var5 = c0Var2;
                                                z20 = false;
                                                w1 w1Var5 = this.I;
                                                s2 s2Var9 = w1Var5.f8220a;
                                                j4.c0 c0Var7 = w1Var5.f8221b;
                                                if (o0Var.f8049f) {
                                                    j14 = j13;
                                                } else {
                                                    j14 = -9223372036854775807L;
                                                }
                                                c0Var = c0Var5;
                                                s2Var3 = s2Var2;
                                                g0(s2Var3, c0Var, s2Var9, c0Var7, j14);
                                                if (z28) {
                                                    w1 w1Var6 = this.I;
                                                    obj2 = w1Var6.f8221b.f12503a;
                                                    s2 s2Var10 = w1Var6.f8220a;
                                                    if (z28) {
                                                        z21 = false;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    long j110 = this.I.d;
                                                    if (s2Var3.b(obj2) == -1) {
                                                        i13 = 4;
                                                    } else {
                                                        i13 = 3;
                                                    }
                                                    this.I = p(c0Var, j13, j16, j110, z21, i13);
                                                } else {
                                                    w1 w1Var7 = this.I;
                                                    obj2 = w1Var7.f8221b.f12503a;
                                                    s2 s2Var11 = w1Var7.f8220a;
                                                    if (z28) {
                                                        z21 = false;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    long j111 = this.I.d;
                                                    if (s2Var3.b(obj2) == -1) {
                                                        i13 = 4;
                                                    } else {
                                                        i13 = 3;
                                                    }
                                                    this.I = p(c0Var, j13, j16, j111, z21, i13);
                                                }
                                                D();
                                                F(s2Var3, this.I.f8220a);
                                                this.I = this.I.g(s2Var3);
                                                if (!s2Var3.p()) {
                                                    this.V = null;
                                                }
                                                l(z20);
                                                throw th;
                                            }
                                        } else {
                                            c0Var2 = c0Var5;
                                            j13 = j17;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c0Var2 = c0Var5;
                                        j13 = j17;
                                    }
                                } else {
                                    c0Var2 = c0Var5;
                                    j13 = j17;
                                }
                                i1Var = i1Var.f7930l;
                                c0Var5 = c0Var2;
                                j17 = j13;
                            } catch (Throwable th4) {
                                th = th4;
                                j13 = j17;
                                z20 = false;
                                w1 w1Var8 = this.I;
                                s2 s2Var12 = w1Var8.f8220a;
                                j4.c0 c0Var8 = w1Var8.f8221b;
                                if (o0Var.f8049f) {
                                    j14 = j13;
                                } else {
                                    j14 = -9223372036854775807L;
                                }
                                c0Var = c0Var5;
                                s2Var3 = s2Var2;
                                g0(s2Var3, c0Var, s2Var12, c0Var8, j14);
                                if (z28) {
                                    w1 w1Var9 = this.I;
                                    obj2 = w1Var9.f8221b.f12503a;
                                    s2 s2Var13 = w1Var9.f8220a;
                                    if (z28) {
                                        z21 = false;
                                    } else {
                                        z21 = false;
                                    }
                                    long j112 = this.I.d;
                                    if (s2Var3.b(obj2) == -1) {
                                        i13 = 4;
                                    } else {
                                        i13 = 3;
                                    }
                                    this.I = p(c0Var, j13, j16, j112, z21, i13);
                                } else {
                                    w1 w1Var10 = this.I;
                                    obj2 = w1Var10.f8221b.f12503a;
                                    s2 s2Var14 = w1Var10.f8220a;
                                    if (z28) {
                                        z21 = false;
                                    } else {
                                        z21 = false;
                                    }
                                    long j113 = this.I.d;
                                    if (s2Var3.b(obj2) == -1) {
                                        i13 = 4;
                                    } else {
                                        i13 = 3;
                                    }
                                    this.I = p(c0Var, j13, j16, j113, z21, i13);
                                }
                                D();
                                F(s2Var3, this.I.f8220a);
                                this.I = this.I.g(s2Var3);
                                if (!s2Var3.p()) {
                                    this.V = null;
                                }
                                l(z20);
                                throw th;
                            }
                        }
                        c0Var5 = c0Var5;
                        j13 = j17;
                        try {
                            k1 k1Var2 = this.D;
                            z20 = false;
                            try {
                                jK = K(c0Var5, j13, k1Var2.h != k1Var2.f8001i, z27);
                            } catch (Throwable th5) {
                                th = th5;
                                j13 = j13;
                                w1 w1Var11 = this.I;
                                s2 s2Var15 = w1Var11.f8220a;
                                j4.c0 c0Var9 = w1Var11.f8221b;
                                if (o0Var.f8049f) {
                                    j14 = j13;
                                } else {
                                    j14 = -9223372036854775807L;
                                }
                                c0Var = c0Var5;
                                s2Var3 = s2Var2;
                                g0(s2Var3, c0Var, s2Var15, c0Var9, j14);
                                if (z28 || j16 != this.I.f8222c) {
                                    w1 w1Var12 = this.I;
                                    obj2 = w1Var12.f8221b.f12503a;
                                    s2 s2Var16 = w1Var12.f8220a;
                                    if (z28 || !z10 || s2Var16.p() || s2Var16.g(obj2, this.f8082w).f8071f) {
                                        z21 = false;
                                    } else {
                                        z21 = true;
                                    }
                                    long j114 = this.I.d;
                                    if (s2Var3.b(obj2) == -1) {
                                        i13 = 4;
                                    } else {
                                        i13 = 3;
                                    }
                                    this.I = p(c0Var, j13, j16, j114, z21, i13);
                                }
                                D();
                                F(s2Var3, this.I.f8220a);
                                this.I = this.I.g(s2Var3);
                                if (!s2Var3.p()) {
                                    this.V = null;
                                }
                                l(z20);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c0Var5 = c0Var5;
                            z20 = false;
                            w1 w1Var13 = this.I;
                            s2 s2Var17 = w1Var13.f8220a;
                            j4.c0 c0Var10 = w1Var13.f8221b;
                            if (o0Var.f8049f) {
                                j14 = j13;
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            c0Var = c0Var5;
                            s2Var3 = s2Var2;
                            g0(s2Var3, c0Var, s2Var17, c0Var10, j14);
                            if (z28) {
                                w1 w1Var14 = this.I;
                                obj2 = w1Var14.f8221b.f12503a;
                                s2 s2Var18 = w1Var14.f8220a;
                                if (z28) {
                                    z21 = false;
                                } else {
                                    z21 = false;
                                }
                                long j115 = this.I.d;
                                if (s2Var3.b(obj2) == -1) {
                                    i13 = 4;
                                } else {
                                    i13 = 3;
                                }
                                this.I = p(c0Var, j13, j16, j115, z21, i13);
                            } else {
                                w1 w1Var15 = this.I;
                                obj2 = w1Var15.f8221b.f12503a;
                                s2 s2Var19 = w1Var15.f8220a;
                                if (z28) {
                                    z21 = false;
                                } else {
                                    z21 = false;
                                }
                                long j116 = this.I.d;
                                if (s2Var3.b(obj2) == -1) {
                                    i13 = 4;
                                } else {
                                    i13 = 3;
                                }
                                this.I = p(c0Var, j13, j16, j116, z21, i13);
                            }
                            D();
                            F(s2Var3, this.I.f8220a);
                            this.I = this.I.g(s2Var3);
                            if (!s2Var3.p()) {
                                this.V = null;
                            }
                            l(z20);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j13 = j17;
                    }
                }
                w1 w1Var16 = this.I;
                s2 s2Var20 = w1Var16.f8220a;
                j4.c0 c0Var11 = w1Var16.f8221b;
                if (o0Var.f8049f) {
                    j15 = jK;
                } else {
                    j15 = -9223372036854775807L;
                }
                c0Var3 = c0Var5;
                s2Var4 = s2Var2;
                g0(s2Var4, c0Var3, s2Var20, c0Var11, j15);
                if (z28 || j16 != this.I.f8222c) {
                    w1 w1Var17 = this.I;
                    obj3 = w1Var17.f8221b.f12503a;
                    s2 s2Var21 = w1Var17.f8220a;
                    if (z28 || !z10 || s2Var21.p() || s2Var21.g(obj3, this.f8082w).f8071f) {
                        z23 = false;
                    } else {
                        z23 = true;
                    }
                    long j21 = this.I.d;
                    if (s2Var4.b(obj3) == -1) {
                        i14 = 4;
                    } else {
                        i14 = 3;
                    }
                    this.I = p(c0Var3, jK, j16, j21, z23, i14);
                }
                D();
                F(s2Var4, this.I.f8220a);
                this.I = this.I.g(s2Var4);
                if (!s2Var4.p()) {
                    this.V = null;
                }
                l(z20);
            }
            k1 k1Var3 = this.D;
            long j22 = this.W;
            h();
            if (!k1Var3.o(s2Var2, j22)) {
                I(z22);
            }
            jK = j17;
            z20 = false;
            w1 w1Var18 = this.I;
            s2 s2Var22 = w1Var18.f8220a;
            j4.c0 c0Var12 = w1Var18.f8221b;
            if (o0Var.f8049f) {
                j15 = jK;
            } else {
                j15 = -9223372036854775807L;
            }
            c0Var3 = c0Var5;
            s2Var4 = s2Var2;
            g0(s2Var4, c0Var3, s2Var22, c0Var12, j15);
            if (z28) {
                w1 w1Var19 = this.I;
                obj3 = w1Var19.f8221b.f12503a;
                s2 s2Var23 = w1Var19.f8220a;
                if (z28) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                long j23 = this.I.d;
                if (s2Var4.b(obj3) == -1) {
                    i14 = 4;
                } else {
                    i14 = 3;
                }
                this.I = p(c0Var3, jK, j16, j23, z23, i14);
            } else {
                w1 w1Var110 = this.I;
                obj3 = w1Var110.f8221b.f12503a;
                s2 s2Var24 = w1Var110.f8220a;
                if (z28) {
                    z23 = false;
                } else {
                    z23 = false;
                }
                long j24 = this.I.d;
                if (s2Var4.b(obj3) == -1) {
                    i14 = 4;
                } else {
                    i14 = 3;
                }
                this.I = p(c0Var3, jK, j16, j24, z23, i14);
            }
            D();
            F(s2Var4, this.I.f8220a);
            this.I = this.I.g(s2Var4);
            if (!s2Var4.p()) {
                this.V = null;
            }
            l(z20);
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final void n(j4.z zVar) throws n {
        k1 k1Var = this.D;
        i1 i1Var = k1Var.f8002j;
        if (i1Var == null || i1Var.f7921a != zVar) {
            return;
        }
        float f10 = this.f8084y.getPlaybackParameters().f8242a;
        s2 s2Var = this.I.f8220a;
        i1Var.d = true;
        i1Var.f7931m = i1Var.f7921a.z();
        b5.z zVarG = i1Var.g(f10, s2Var);
        j1 j1Var = i1Var.f7925f;
        long jMax = j1Var.f7946b;
        long j10 = j1Var.f7948e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = i1Var.a(zVarG, jMax, false, new boolean[i1Var.f7927i.length]);
        long j11 = i1Var.f7933o;
        j1 j1Var2 = i1Var.f7925f;
        i1Var.f7933o = (j1Var2.f7946b - jA) + j11;
        i1Var.f7925f = j1Var2.b(jA);
        e0(i1Var.f7932n);
        if (i1Var == k1Var.h) {
            E(i1Var.f7925f.f7946b);
            f(new boolean[this.f8073a.length]);
            w1 w1Var = this.I;
            j4.c0 c0Var = w1Var.f8221b;
            long j12 = i1Var.f7925f.f7946b;
            this.I = p(c0Var, j12, w1Var.f8222c, j12, false, 5);
        }
        t();
    }

    public final void o(x1 x1Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.J.a(1);
            }
            this.I = this.I.e(x1Var);
        }
        float f11 = x1Var.f8242a;
        i1 i1Var = this.D.h;
        while (true) {
            i10 = 0;
            if (i1Var == null) {
                break;
            }
            b5.s[] sVarArr = i1Var.f7932n.f2030c;
            int length = sVarArr.length;
            while (i10 < length) {
                b5.s sVar = sVarArr[i10];
                if (sVar != null) {
                    sVar.q(f11);
                }
                i10++;
            }
            i1Var = i1Var.f7930l;
        }
        e[] eVarArr = this.f8073a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.setPlaybackSpeed(f10, x1Var.f8242a);
            }
            i10++;
        }
    }

    public final w1 p(j4.c0 c0Var, long j10, long j11, long j12, boolean z10, int i10) {
        p8.l0 l0VarC;
        this.Y = (!this.Y && j10 == this.I.f8235r && c0Var.equals(this.I.f8221b)) ? false : true;
        D();
        w1 w1Var = this.I;
        j4.j1 j1Var = w1Var.h;
        b5.z zVar = w1Var.f8226i;
        List list = w1Var.f8227j;
        if (this.E.f8154k) {
            i1 i1Var = this.D.h;
            j1Var = i1Var == null ? j4.j1.d : i1Var.f7931m;
            zVar = i1Var == null ? this.f8077e : i1Var.f7932n;
            b5.s[] sVarArr = zVar.f2030c;
            p8.w wVar = new p8.w();
            boolean z11 = false;
            for (b5.s sVar : sVarArr) {
                if (sVar != null) {
                    z3.c cVar = sVar.h(0).f8191s;
                    if (cVar == null) {
                        wVar.a(new z3.c(new z3.b[0]));
                    } else {
                        wVar.a(cVar);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                l0VarC = wVar.c();
            } else {
                p8.x xVar = p8.z.f45604b;
                l0VarC = p8.l0.f45555e;
            }
            list = l0VarC;
            if (i1Var != null) {
                j1 j1Var2 = i1Var.f7925f;
                if (j1Var2.f7947c != j11) {
                    i1Var.f7925f = j1Var2.a(j11);
                }
            }
        } else if (!c0Var.equals(w1Var.f8221b)) {
            j1Var = j4.j1.d;
            zVar = this.f8077e;
            list = p8.l0.f45555e;
        }
        j4.j1 j1Var3 = j1Var;
        b5.z zVar2 = zVar;
        List list2 = list;
        if (z10) {
            ue.f fVar = this.J;
            if (!fVar.d || fVar.f48542e == 5) {
                fVar.f48540b = true;
                fVar.d = true;
                fVar.f48542e = i10;
            } else {
                d5.a.f(i10 == 5);
            }
        }
        w1 w1Var2 = this.I;
        long j13 = w1Var2.f8233p;
        i1 i1Var2 = this.D.f8002j;
        return w1Var2.b(c0Var, j10, j11, j12, i1Var2 == null ? 0L : Math.max(0L, j13 - (this.W - i1Var2.f7933o)), j1Var3, zVar2, list2);
    }

    public final boolean q() {
        i1 i1Var = this.D.f8002j;
        if (i1Var == null) {
            return false;
        }
        return (!i1Var.d ? 0L : i1Var.f7921a.g()) != Long.MIN_VALUE;
    }

    public final boolean s() {
        i1 i1Var = this.D.h;
        long j10 = i1Var.f7925f.f7948e;
        if (i1Var.d) {
            return j10 == -9223372036854775807L || this.I.f8235r < j10 || !Y();
        }
        return false;
    }

    public final void t() {
        boolean zC;
        if (q()) {
            i1 i1Var = this.D.f8002j;
            long jG = !i1Var.d ? 0L : i1Var.f7921a.g();
            i1 i1Var2 = this.D.f8002j;
            long jMax = i1Var2 == null ? 0L : Math.max(0L, jG - (this.W - i1Var2.f7933o));
            i1 i1Var3 = this.D.h;
            zC = this.f8078f.c(jMax, this.f8084y.getPlaybackParameters().f8242a);
            if (!zC && jMax < 500000 && this.f8083x > 0) {
                this.D.h.f7921a.p(this.I.f8235r);
                zC = this.f8078f.c(jMax, this.f8084y.getPlaybackParameters().f8242a);
            }
        } else {
            zC = false;
        }
        this.O = zC;
        if (zC) {
            i1 i1Var4 = this.D.f8002j;
            long j10 = this.W;
            d5.a.i(i1Var4.f7930l == null);
            i1Var4.f7921a.q(j10 - i1Var4.f7933o);
        }
        d0();
    }

    public final void u() {
        ue.f fVar = this.J;
        w1 w1Var = this.I;
        boolean z10 = fVar.f48540b | (((w1) fVar.h) != w1Var);
        fVar.f48540b = z10;
        fVar.h = w1Var;
        if (z10) {
            k0 k0Var = this.C.f8218a;
            k0Var.f7974i.c(new d5.u(16, k0Var, fVar));
            this.J = new ue.f(this.I);
        }
    }

    public final void v() throws Throwable {
        m(this.E.b(), true);
    }

    public final void w(n0 n0Var) throws Throwable {
        s2 s2VarB;
        this.J.a(1);
        int i10 = n0Var.f8033a;
        int i11 = n0Var.f8034b;
        int i12 = n0Var.f8035c;
        j4.g1 g1Var = n0Var.d;
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.f8147b;
        d5.a.f(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        s1Var.f8153j = g1Var;
        if (i10 == i11 || i10 == i12) {
            s2VarB = s1Var.b();
        } else {
            int iMin = Math.min(i10, i12);
            int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int iO = ((r1) arrayList.get(iMin)).d;
            d5.g0.G(i10, i11, i12, arrayList);
            while (iMin <= iMax) {
                r1 r1Var = (r1) arrayList.get(iMin);
                r1Var.d = iO;
                iO += r1Var.f8108a.f12698o.f12623b.o();
                iMin++;
            }
            s2VarB = s1Var.b();
        }
        m(s2VarB, false);
    }

    public final void x() {
        this.J.a(1);
        C(false, false, false, true);
        this.f8078f.b(false);
        X(this.I.f8220a.p() ? 4 : 2);
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.h;
        uVar.getClass();
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.f8147b;
        d5.a.i(!s1Var.f8154k);
        s1Var.f8155l = uVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            s1Var.e(r1Var);
            s1Var.f8151g.add(r1Var);
        }
        s1Var.f8154k = true;
        this.f8079n.d(2);
    }

    public final synchronized boolean y() {
        if (!this.K && this.f8081s.getThread().isAlive()) {
            this.f8079n.d(7);
            h0(new o(this, 3), this.G);
            return this.K;
        }
        return true;
    }

    public final void z() {
        C(true, false, true, false);
        this.f8078f.b(true);
        X(1);
        HandlerThread handlerThread = this.f8080r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }
}
