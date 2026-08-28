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
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
public final class q0 implements Handler.Callback, j4.z {
    public final ArrayList A;
    public final d5.a0 B;
    public final w C;
    public final k1 D;
    public final s1 E;
    public final i F;
    public final long G;
    public j2 H;
    public w1 I;
    public te.f J;
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
    public final e[] f9643a;
    public final Set f9645b;
    public final h2[] f9646c;
    public final b5.w d;
    public final b5.a0 f9647e;
    public final j f9648f;
    public final com.google.android.exoplayer2.upstream.f h;
    public final d5.c0 f9649n;
    public final HandlerThread f9650r;
    public final Looper f9651s;
    public final q2 v;
    public final p2 f9652w;
    public final long f9653x;
    public final k f9654y;
    public boolean L = false;
    public long f9644a0 = -9223372036854775807L;

    public q0(e[] eVarArr, b5.w wVar, b5.a0 a0Var, j jVar, com.google.android.exoplayer2.upstream.f fVar, int i9, boolean z10, i3.f fVar2, j2 j2Var, i iVar, long j10, Looper looper, d5.a0 a0Var2, w wVar2, i3.l lVar) {
        this.C = wVar2;
        this.f9643a = eVarArr;
        this.d = wVar;
        this.f9647e = a0Var;
        this.f9648f = jVar;
        this.h = fVar;
        this.P = i9;
        this.Q = z10;
        this.H = j2Var;
        this.F = iVar;
        this.G = j10;
        this.B = a0Var2;
        this.f9653x = jVar.f9511g;
        w1 h = w1.h(a0Var);
        this.I = h;
        this.J = new te.f(h);
        this.f9646c = new h2[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr[i10].init(i10, lVar);
            this.f9646c[i10] = eVarArr[i10].getCapabilities();
        }
        this.f9654y = new k(this, a0Var2);
        this.A = new ArrayList();
        this.f9645b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new q2();
        this.f9652w = new p2();
        wVar.f1503a = this;
        wVar.f1504b = fVar;
        this.Y = true;
        d5.c0 a2 = a0Var2.a(looper, null);
        this.D = new k1(fVar2, a2);
        this.E = new s1(this, fVar2, a2, lVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9650r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f9651s = looper2;
        this.f9649n = a0Var2.a(looper2, this);
    }

    public static Pair H(r2 r2Var, p0 p0Var, boolean z10, int i9, boolean z11, q2 q2Var, p2 p2Var) {
        r2 r2Var2;
        Object I;
        r2 r2Var3 = p0Var.f9625a;
        if (!r2Var.p()) {
            if (r2Var3.p()) {
                r2Var2 = r2Var;
            } else {
                r2Var2 = r2Var3;
            }
            try {
                Pair i10 = r2Var2.i(q2Var, p2Var, p0Var.f9626b, p0Var.f9627c);
                if (!r2Var.equals(r2Var2)) {
                    if (r2Var.b(i10.first) != -1) {
                        if (r2Var2.g(i10.first, p2Var).f9641f && r2Var2.m(p2Var.f9639c, q2Var, 0L).A == r2Var2.b(i10.first)) {
                            return r2Var.i(q2Var, p2Var, r2Var.g(i10.first, p2Var).f9639c, p0Var.f9627c);
                        }
                    } else if (z10 && (I = I(q2Var, p2Var, i9, z11, i10.first, r2Var2, r2Var)) != null) {
                        return r2Var.i(q2Var, p2Var, r2Var.g(I, p2Var).f9639c, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i10;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static Object I(q2 q2Var, p2 p2Var, int i9, boolean z10, Object obj, r2 r2Var, r2 r2Var2) {
        int b10 = r2Var.b(obj);
        int h = r2Var.h();
        int i10 = 0;
        int i11 = b10;
        int i12 = -1;
        while (i10 < h && i12 == -1) {
            q2 q2Var2 = q2Var;
            p2 p2Var2 = p2Var;
            int i13 = i9;
            boolean z11 = z10;
            r2 r2Var3 = r2Var;
            i11 = r2Var3.d(i11, p2Var2, q2Var2, i13, z11);
            if (i11 == -1) {
                break;
            }
            i12 = r2Var2.b(r2Var3.l(i11));
            i10++;
            r2Var = r2Var3;
            p2Var = p2Var2;
            q2Var = q2Var2;
            i9 = i13;
            z10 = z11;
        }
        if (i12 == -1) {
            return null;
        }
        return r2Var2.l(i12);
    }

    public static void O(e eVar, long j10) {
        eVar.setCurrentStreamFinal();
        if (eVar instanceof r4.l) {
            r4.l lVar = (r4.l) eVar;
            d5.a.i(lVar.isCurrentStreamFinal());
            lVar.A = j10;
        }
    }

    public static void b(e2 e2Var) {
        try {
            synchronized (e2Var) {
                synchronized (e2Var) {
                }
                e2Var.f9384a.handleMessage(e2Var.d, e2Var.f9387e);
                return;
            }
            e2Var.f9384a.handleMessage(e2Var.d, e2Var.f9387e);
            return;
        } finally {
            e2Var.b(true);
        }
    }

    public static boolean s(e eVar) {
        if (eVar.getState() != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        D(true, false, true, false);
        this.f9648f.b(true);
        Y(1);
        HandlerThread handlerThread = this.f9650r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }

    public final void B(int i9, int i10, j4.g1 g1Var) {
        boolean z10 = true;
        this.J.a(1);
        s1 s1Var = this.E;
        s1Var.getClass();
        d5.a.f((i9 < 0 || i9 > i10 || i10 > s1Var.f9717b.size()) ? false : false);
        s1Var.f9723j = g1Var;
        s1Var.g(i9, i10);
        n(s1Var.b(), false);
    }

    public final void C() {
        int i9;
        boolean z10;
        float f10 = this.f9654y.getPlaybackParameters().f9811a;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = k1Var.f9571i;
        boolean z11 = true;
        for (i1 i1Var3 = i1Var; i1Var3 != null && i1Var3.d; i1Var3 = i1Var3.f9500l) {
            b5.a0 g10 = i1Var3.g(f10, this.I.f9789a);
            b5.a0 a0Var = i1Var3.f9502n;
            b5.t[] tVarArr = g10.f1427c;
            if (a0Var != null && a0Var.f1427c.length == tVarArr.length) {
                for (int i10 = 0; i10 < tVarArr.length; i10++) {
                    if (g10.a(a0Var, i10)) {
                    }
                }
                if (i1Var3 == i1Var2) {
                    z11 = false;
                }
            }
            if (z11) {
                k1 k1Var2 = this.D;
                i1 i1Var4 = k1Var2.h;
                boolean k10 = k1Var2.k(i1Var4);
                boolean[] zArr = new boolean[this.f9643a.length];
                long a2 = i1Var4.a(g10, this.I.f9804r, k10, zArr);
                w1 w1Var = this.I;
                if (w1Var.f9792e != 4 && a2 != w1Var.f9804r) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w1 w1Var2 = this.I;
                i9 = 4;
                this.I = q(w1Var2.f9790b, a2, w1Var2.f9791c, w1Var2.d, z10, 5);
                if (z10) {
                    F(a2);
                }
                boolean[] zArr2 = new boolean[this.f9643a.length];
                int i11 = 0;
                while (true) {
                    e[] eVarArr = this.f9643a;
                    if (i11 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i11];
                    boolean s10 = s(eVar);
                    zArr2[i11] = s10;
                    j4.b1 b1Var = i1Var4.f9493c[i11];
                    if (s10) {
                        if (b1Var != eVar.getStream()) {
                            d(eVar);
                        } else if (zArr[i11]) {
                            eVar.resetPosition(this.W);
                        }
                    }
                    i11++;
                }
                g(zArr2);
            } else {
                i9 = 4;
                this.D.k(i1Var3);
                if (i1Var3.d) {
                    i1Var3.a(g10, Math.max(i1Var3.f9495f.f9516b, this.W - i1Var3.f9503o), false, new boolean[i1Var3.f9497i.length]);
                }
            }
            m(true);
            if (this.I.f9792e != i9) {
                u();
                g0();
                this.f9649n.d(2);
                return;
            }
            return;
        }
    }

    public final void D(boolean r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: h3.q0.D(boolean, boolean, boolean, boolean):void");
    }

    public final void E() {
        boolean z10;
        i1 i1Var = this.D.h;
        if (i1Var != null && i1Var.f9495f.h && this.L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M = z10;
    }

    public final void F(long j10) {
        k1 k1Var;
        long j11;
        e[] eVarArr;
        b5.t[] tVarArr;
        i1 i1Var = this.D.h;
        if (i1Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = i1Var.f9503o;
        }
        long j12 = j10 + j11;
        this.W = j12;
        this.f9654y.f9526a.a(j12);
        for (e eVar : this.f9643a) {
            if (s(eVar)) {
                eVar.resetPosition(this.W);
            }
        }
        for (i1 i1Var2 = k1Var.h; i1Var2 != null; i1Var2 = i1Var2.f9500l) {
            for (b5.t tVar : i1Var2.f9502n.f1427c) {
                if (tVar != null) {
                    tVar.s();
                }
            }
        }
    }

    public final void G(r2 r2Var, r2 r2Var2) {
        if (r2Var.p() && r2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            aa.d.v(arrayList.get(size));
            throw null;
        }
    }

    public final void J(boolean z10) {
        j4.d0 d0Var = this.D.h.f9495f.f9515a;
        long L = L(d0Var, this.I.f9804r, true, false);
        if (L != this.I.f9804r) {
            w1 w1Var = this.I;
            this.I = q(d0Var, L, w1Var.f9791c, w1Var.d, z10, 5);
        }
    }

    public final void K(h3.p0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: h3.q0.K(h3.p0):void");
    }

    public final long L(j4.d0 d0Var, long j10, boolean z10, boolean z11) {
        d0();
        this.N = false;
        if (z11 || this.I.f9792e == 3) {
            Y(2);
        }
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = i1Var;
        while (i1Var2 != null && !d0Var.equals(i1Var2.f9495f.f9515a)) {
            i1Var2 = i1Var2.f9500l;
        }
        if (z10 || i1Var != i1Var2 || (i1Var2 != null && i1Var2.f9503o + j10 < 0)) {
            e[] eVarArr = this.f9643a;
            for (e eVar : eVarArr) {
                d(eVar);
            }
            if (i1Var2 != null) {
                while (k1Var.h != i1Var2) {
                    k1Var.a();
                }
                k1Var.k(i1Var2);
                i1Var2.f9503o = 1000000000000L;
                g(new boolean[eVarArr.length]);
            }
        }
        if (i1Var2 != null) {
            ?? r92 = i1Var2.f9491a;
            k1Var.k(i1Var2);
            if (!i1Var2.d) {
                i1Var2.f9495f = i1Var2.f9495f.b(j10);
            } else if (i1Var2.f9494e) {
                j10 = r92.i(j10);
                r92.k(j10 - this.f9653x);
            }
            F(j10);
            u();
        } else {
            k1Var.b();
            F(j10);
        }
        m(false);
        this.f9649n.d(2);
        return j10;
    }

    public final void M(e2 e2Var) {
        Looper looper = e2Var.f9388f;
        Looper looper2 = this.f9651s;
        d5.c0 c0Var = this.f9649n;
        if (looper == looper2) {
            b(e2Var);
            int i9 = this.I.f9792e;
            if (i9 != 3 && i9 != 2) {
                return;
            }
            c0Var.d(2);
            return;
        }
        c0Var.a(15, e2Var).b();
    }

    public final void N(e2 e2Var) {
        Looper looper = e2Var.f9388f;
        if (!looper.getThread().isAlive()) {
            d5.a.K("TAG", "Trying to send message on a dead thread.");
            e2Var.b(false);
            return;
        }
        this.B.a(looper, null).c(new fh.o1(this, e2Var));
    }

    public final void P(boolean z10, AtomicBoolean atomicBoolean) {
        e[] eVarArr;
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (e eVar : this.f9643a) {
                    if (!s(eVar) && this.f9645b.remove(eVar)) {
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

    public final void Q(m0 m0Var) {
        this.J.a(1);
        int i9 = m0Var.f9590c;
        j4.g1 g1Var = m0Var.f9589b;
        ArrayList arrayList = m0Var.f9588a;
        if (i9 != -1) {
            this.V = new p0(new f2(arrayList, g1Var), m0Var.f9590c, m0Var.d);
        }
        s1 s1Var = this.E;
        ArrayList arrayList2 = s1Var.f9717b;
        s1Var.g(0, arrayList2.size());
        n(s1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final void R(boolean z10) {
        if (z10 != this.T) {
            this.T = z10;
            if (!z10 && this.I.f9801o) {
                this.f9649n.d(2);
            }
        }
    }

    public final void S(boolean z10) {
        this.L = z10;
        E();
        if (this.M) {
            k1 k1Var = this.D;
            if (k1Var.f9571i != k1Var.h) {
                J(true);
                m(false);
            }
        }
    }

    public final void T(int i9, int i10, boolean z10, boolean z11) {
        b5.t[] tVarArr;
        this.J.a(z11 ? 1 : 0);
        te.f fVar = this.J;
        fVar.f47818b = true;
        fVar.f47821f = true;
        fVar.f47822g = i10;
        this.I = this.I.c(i9, z10);
        this.N = false;
        for (i1 i1Var = this.D.h; i1Var != null; i1Var = i1Var.f9500l) {
            for (b5.t tVar : i1Var.f9502n.f1427c) {
                if (tVar != null) {
                    tVar.g(z10);
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i11 = this.I.f9792e;
        d5.c0 c0Var = this.f9649n;
        if (i11 == 3) {
            b0();
            c0Var.d(2);
        } else if (i11 == 2) {
            c0Var.d(2);
        }
    }

    public final void U(x1 x1Var) {
        k kVar = this.f9654y;
        kVar.setPlaybackParameters(x1Var);
        x1 playbackParameters = kVar.getPlaybackParameters();
        p(playbackParameters, playbackParameters.f9811a, true, true);
    }

    public final void V(int i9) {
        this.P = i9;
        r2 r2Var = this.I.f9789a;
        k1 k1Var = this.D;
        k1Var.f9569f = i9;
        if (!k1Var.n(r2Var)) {
            J(true);
        }
        m(false);
    }

    public final void W(boolean z10) {
        this.Q = z10;
        r2 r2Var = this.I.f9789a;
        k1 k1Var = this.D;
        k1Var.f9570g = z10;
        if (!k1Var.n(r2Var)) {
            J(true);
        }
        m(false);
    }

    public final void X(j4.g1 g1Var) {
        this.J.a(1);
        s1 s1Var = this.E;
        int size = s1Var.f9717b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.g().e(0, size);
        }
        s1Var.f9723j = g1Var;
        n(s1Var.b(), false);
    }

    public final void Y(int i9) {
        w1 w1Var = this.I;
        if (w1Var.f9792e != i9) {
            if (i9 != 2) {
                this.f9644a0 = -9223372036854775807L;
            }
            this.I = w1Var.f(i9);
        }
    }

    public final boolean Z() {
        w1 w1Var = this.I;
        if (w1Var.f9798l && w1Var.f9799m == 0) {
            return true;
        }
        return false;
    }

    public final void a(m0 m0Var, int i9) {
        this.J.a(1);
        s1 s1Var = this.E;
        if (i9 == -1) {
            i9 = s1Var.f9717b.size();
        }
        n(s1Var.a(i9, m0Var.f9588a, m0Var.f9589b), false);
    }

    public final boolean a0(r2 r2Var, j4.d0 d0Var) {
        if (!d0Var.a() && !r2Var.p()) {
            int i9 = r2Var.g(d0Var.f13426a, this.f9652w).f9639c;
            q2 q2Var = this.v;
            r2Var.n(i9, q2Var);
            if (q2Var.a() && q2Var.f9664r && q2Var.f9662f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b0() {
        e[] eVarArr;
        this.N = false;
        k kVar = this.f9654y;
        kVar.f9530f = true;
        kVar.f9526a.b();
        for (e eVar : this.f9643a) {
            if (s(eVar)) {
                eVar.start();
            }
        }
    }

    @Override
    public final void c(j4.d1 d1Var) {
        this.f9649n.a(9, (j4.a0) d1Var).b();
    }

    public final void c0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.R) {
            z12 = false;
        } else {
            z12 = true;
        }
        D(z12, false, true, false);
        this.J.a(z11 ? 1 : 0);
        this.f9648f.b(true);
        Y(1);
    }

    public final void d(e eVar) {
        if (!s(eVar)) {
            return;
        }
        k kVar = this.f9654y;
        if (eVar == kVar.f9528c) {
            kVar.d = null;
            kVar.f9528c = null;
            kVar.f9529e = true;
        }
        if (eVar.getState() == 2) {
            eVar.stop();
        }
        eVar.disable();
        this.U--;
    }

    public final void d0() {
        e[] eVarArr;
        k kVar = this.f9654y;
        kVar.f9530f = false;
        c2.d0 d0Var = kVar.f9526a;
        if (d0Var.f2130a) {
            d0Var.a(d0Var.getPositionUs());
            d0Var.f2130a = false;
        }
        for (e eVar : this.f9643a) {
            if (s(eVar) && eVar.getState() == 2) {
                eVar.stop();
            }
        }
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: h3.q0.e():void");
    }

    public final void e0() {
        boolean z10;
        i1 i1Var = this.D.f9572j;
        if (!this.O && (i1Var == null || !i1Var.f9491a.b())) {
            z10 = false;
        } else {
            z10 = true;
        }
        w1 w1Var = this.I;
        if (z10 != w1Var.f9794g) {
            this.I = new w1(w1Var.f9789a, w1Var.f9790b, w1Var.f9791c, w1Var.d, w1Var.f9792e, w1Var.f9793f, z10, w1Var.h, w1Var.f9795i, w1Var.f9796j, w1Var.f9797k, w1Var.f9798l, w1Var.f9799m, w1Var.f9800n, w1Var.f9802p, w1Var.f9803q, w1Var.f9804r, w1Var.f9801o);
        }
    }

    @Override
    public final void f(j4.a0 a0Var) {
        this.f9649n.a(8, a0Var).b();
    }

    public final void f0(b5.a0 a0Var) {
        b5.t[] tVarArr = a0Var.f1427c;
        j jVar = this.f9648f;
        int i9 = jVar.f9510f;
        if (i9 == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                e[] eVarArr = this.f9643a;
                int i12 = 13107200;
                if (i10 < eVarArr.length) {
                    if (tVarArr[i10] != null) {
                        switch (eVarArr[i10].getTrackType()) {
                            case -2:
                                i12 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i12 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    i9 = Math.max(13107200, i11);
                }
            }
        }
        jVar.h = i9;
        jVar.f9506a.a(i9);
    }

    public final void g(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        b5.a0 a0Var;
        boolean z10;
        int i9;
        boolean z11;
        boolean z12;
        d5.o oVar;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.f9571i;
        b5.a0 a0Var2 = i1Var.f9502n;
        int i10 = 0;
        while (true) {
            eVarArr = this.f9643a;
            int length = eVarArr.length;
            set = this.f9645b;
            if (i10 >= length) {
                break;
            }
            if (!a0Var2.b(i10) && set.remove(eVarArr[i10])) {
                eVarArr[i10].reset();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < eVarArr.length) {
            if (a0Var2.b(i11)) {
                boolean z13 = zArr[i11];
                e eVar = eVarArr[i11];
                if (!s(eVar)) {
                    i1 i1Var2 = k1Var.f9571i;
                    if (i1Var2 == k1Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b5.a0 a0Var3 = i1Var2.f9502n;
                    i2 i2Var = a0Var3.f1426b[i11];
                    b5.t tVar = a0Var3.f1427c[i11];
                    if (tVar != null) {
                        i9 = tVar.length();
                    } else {
                        i9 = 0;
                    }
                    t0[] t0VarArr = new t0[i9];
                    for (int i12 = 0; i12 < i9; i12++) {
                        t0VarArr[i12] = tVar.h(i12);
                    }
                    if (Z() && this.I.f9792e == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z13 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.U++;
                    set.add(eVar);
                    a0Var = a0Var2;
                    boolean z14 = z11;
                    eVar.enable(i2Var, t0VarArr, i1Var2.f9493c[i11], this.W, z12, z10, i1Var2.e(), i1Var2.f9503o);
                    eVar.handleMessage(11, new l0(this));
                    k kVar = this.f9654y;
                    kVar.getClass();
                    d5.o mediaClock = eVar.getMediaClock();
                    if (mediaClock != null && mediaClock != (oVar = kVar.d)) {
                        if (oVar == null) {
                            kVar.d = mediaClock;
                            kVar.f9528c = eVar;
                            mediaClock.setPlaybackParameters((x1) kVar.f9526a.f2133e);
                        } else {
                            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z14) {
                        eVar.start();
                    }
                    i11++;
                    a0Var2 = a0Var;
                }
            }
            a0Var = a0Var2;
            i11++;
            a0Var2 = a0Var;
        }
        i1Var.f9496g = true;
    }

    public final void g0() {
        long j10;
        boolean z10;
        long max;
        long j11;
        char c10;
        char c11;
        long max2;
        long j12;
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            if (i1Var.d) {
                j10 = i1Var.f9491a.o();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                F(j10);
                if (j10 != this.I.f9804r) {
                    w1 w1Var = this.I;
                    this.I = q(w1Var.f9790b, j10, w1Var.f9791c, j10, true, 5);
                }
            } else {
                k kVar = this.f9654y;
                if (i1Var != this.D.f9571i) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c2.d0 d0Var = kVar.f9526a;
                e eVar = kVar.f9528c;
                if (eVar != null && !eVar.isEnded() && (kVar.f9528c.isReady() || (!z10 && !kVar.f9528c.hasReadStreamToEnd()))) {
                    d5.o oVar = kVar.d;
                    oVar.getClass();
                    long positionUs = oVar.getPositionUs();
                    if (kVar.f9529e) {
                        if (positionUs < d0Var.getPositionUs()) {
                            if (d0Var.f2130a) {
                                d0Var.a(d0Var.getPositionUs());
                                d0Var.f2130a = false;
                            }
                        } else {
                            kVar.f9529e = false;
                            if (kVar.f9530f) {
                                d0Var.b();
                            }
                        }
                    }
                    d0Var.a(positionUs);
                    x1 playbackParameters = oVar.getPlaybackParameters();
                    if (!playbackParameters.equals((x1) d0Var.f2133e)) {
                        d0Var.setPlaybackParameters(playbackParameters);
                        kVar.f9527b.f9649n.a(16, playbackParameters).b();
                    }
                } else {
                    kVar.f9529e = true;
                    if (kVar.f9530f) {
                        d0Var.b();
                    }
                }
                long positionUs2 = kVar.getPositionUs();
                this.W = positionUs2;
                long j13 = positionUs2 - i1Var.f9503o;
                long j14 = this.I.f9804r;
                ArrayList arrayList = this.A;
                if (!arrayList.isEmpty() && !this.I.f9790b.a()) {
                    if (this.Y) {
                        this.Y = false;
                    }
                    w1 w1Var2 = this.I;
                    w1Var2.f9789a.b(w1Var2.f9790b.f13426a);
                    int min = Math.min(this.X, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.X = min;
                }
                this.I.f9804r = j13;
            }
            this.I.f9802p = this.D.f9572j.d();
            w1 w1Var3 = this.I;
            long j15 = w1Var3.f9802p;
            i1 i1Var2 = this.D.f9572j;
            if (i1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, j15 - (this.W - i1Var2.f9503o));
            }
            w1Var3.f9803q = max;
            w1 w1Var4 = this.I;
            if (w1Var4.f9798l && w1Var4.f9792e == 3 && a0(w1Var4.f9789a, w1Var4.f9790b)) {
                w1 w1Var5 = this.I;
                float f10 = 1.0f;
                if (w1Var5.f9800n.f9811a == 1.0f) {
                    i iVar = this.F;
                    long h = h(w1Var5.f9789a, w1Var5.f9790b.f13426a, w1Var5.f9804r);
                    long j16 = this.I.f9802p;
                    i1 i1Var3 = this.D.f9572j;
                    if (i1Var3 == null) {
                        j11 = -9223372036854775807L;
                        c10 = 1;
                        c11 = 0;
                        max2 = 0;
                    } else {
                        j11 = -9223372036854775807L;
                        c10 = 1;
                        c11 = 0;
                        max2 = Math.max(0L, j16 - (this.W - i1Var3.f9503o));
                    }
                    if (iVar.f9479c != j11) {
                        long j17 = h - max2;
                        if (iVar.f9487m == j11) {
                            iVar.f9487m = j17;
                            iVar.f9488n = 0L;
                        } else {
                            long max3 = Math.max(j17, (((float) j17) * 9.999871E-4f) + (((float) j12) * 0.999f));
                            iVar.f9487m = max3;
                            long abs = Math.abs(j17 - max3);
                            iVar.f9488n = (9.999871E-4f * ((float) abs)) + (0.999f * ((float) iVar.f9488n));
                        }
                        if (iVar.f9486l != j11 && SystemClock.elapsedRealtime() - iVar.f9486l < 1000) {
                            f10 = iVar.f9485k;
                        } else {
                            iVar.f9486l = SystemClock.elapsedRealtime();
                            long j18 = (iVar.f9488n * 3) + iVar.f9487m;
                            if (iVar.h > j18) {
                                float H = (float) d5.f0.H(1000L);
                                long j19 = ((iVar.f9485k - 1.0f) * H) + ((iVar.f9483i - 1.0f) * H);
                                long j20 = iVar.f9480e;
                                long j21 = iVar.h - j19;
                                long[] jArr = new long[3];
                                jArr[c11] = j18;
                                jArr[c10] = j20;
                                jArr[2] = j21;
                                long j22 = jArr[c11];
                                for (int i9 = 1; i9 < 3; i9++) {
                                    long j23 = jArr[i9];
                                    if (j23 > j22) {
                                        j22 = j23;
                                    }
                                }
                                iVar.h = j22;
                            } else {
                                long i10 = d5.f0.i(h - (Math.max(0.0f, iVar.f9485k - 1.0f) / 1.0E-7f), iVar.h, j18);
                                iVar.h = i10;
                                long j24 = iVar.f9482g;
                                if (j24 != j11 && i10 > j24) {
                                    iVar.h = j24;
                                }
                            }
                            long j25 = h - iVar.h;
                            if (Math.abs(j25) < iVar.f9477a) {
                                iVar.f9485k = 1.0f;
                            } else {
                                iVar.f9485k = d5.f0.g((1.0E-7f * ((float) j25)) + 1.0f, iVar.f9484j, iVar.f9483i);
                            }
                            f10 = iVar.f9485k;
                        }
                    }
                    if (this.f9654y.getPlaybackParameters().f9811a != f10) {
                        this.f9654y.setPlaybackParameters(new x1(f10, this.I.f9800n.f9812b));
                        p(this.I.f9800n, this.f9654y.getPlaybackParameters().f9811a, false, false);
                    }
                }
            }
        }
    }

    public final long h(r2 r2Var, Object obj, long j10) {
        p2 p2Var = this.f9652w;
        int i9 = r2Var.g(obj, p2Var).f9639c;
        q2 q2Var = this.v;
        r2Var.n(i9, q2Var);
        if (q2Var.f9662f == -9223372036854775807L || !q2Var.a() || !q2Var.f9664r) {
            return -9223372036854775807L;
        }
        return d5.f0.H(d5.f0.t(q2Var.h) - q2Var.f9662f) - (j10 + p2Var.f9640e);
    }

    public final void h0(r2 r2Var, j4.d0 d0Var, r2 r2Var2, j4.d0 d0Var2, long j10) {
        Object obj;
        x1 x1Var;
        boolean a02 = a0(r2Var, d0Var);
        Object obj2 = d0Var.f13426a;
        if (!a02) {
            if (d0Var.a()) {
                x1Var = x1.d;
            } else {
                x1Var = this.I.f9800n;
            }
            k kVar = this.f9654y;
            if (!kVar.getPlaybackParameters().equals(x1Var)) {
                kVar.setPlaybackParameters(x1Var);
                return;
            }
            return;
        }
        p2 p2Var = this.f9652w;
        int i9 = r2Var.g(obj2, p2Var).f9639c;
        q2 q2Var = this.v;
        r2Var.n(i9, q2Var);
        b1 b1Var = q2Var.v;
        int i10 = d5.f0.f4349a;
        i iVar = this.F;
        iVar.getClass();
        iVar.f9479c = d5.f0.H(b1Var.f9347a);
        iVar.f9481f = d5.f0.H(b1Var.f9348b);
        iVar.f9482g = d5.f0.H(b1Var.f9349c);
        float f10 = b1Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.f9484j = f10;
        float f11 = b1Var.f9350e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.f9483i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.f9479c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = h(r2Var, obj2, j10);
            iVar.a();
            return;
        }
        Object obj3 = q2Var.f9658a;
        if (!r2Var2.p()) {
            obj = r2Var2.m(r2Var2.g(d0Var2.f13426a, p2Var).f9639c, q2Var, 0L).f9658a;
        } else {
            obj = null;
        }
        if (!d5.f0.a(obj, obj3)) {
            iVar.d = -9223372036854775807L;
            iVar.a();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        i1 i1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9 = 1000;
        try {
            switch (message.what) {
                case 0:
                    y();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    T(message.arg2, 1, z10, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    K((p0) message.obj);
                    break;
                case 4:
                    U((x1) message.obj);
                    break;
                case 5:
                    this.H = (j2) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    A();
                    return true;
                case 8:
                    o((j4.a0) message.obj);
                    break;
                case 9:
                    k((j4.a0) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    W(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    P(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    e2 e2Var = (e2) message.obj;
                    e2Var.getClass();
                    M(e2Var);
                    break;
                case 15:
                    N((e2) message.obj);
                    break;
                case 16:
                    x1 x1Var = (x1) message.obj;
                    p(x1Var, x1Var.f9811a, true, false);
                    break;
                case 17:
                    Q((m0) message.obj);
                    break;
                case 18:
                    a((m0) message.obj, message.arg1);
                    break;
                case 19:
                    x((n0) message.obj);
                    break;
                case 20:
                    B(message.arg1, message.arg2, (j4.g1) message.obj);
                    break;
                case 21:
                    X((j4.g1) message.obj);
                    break;
                case 22:
                    w();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    S(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    R(z14);
                    break;
                case 25:
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (com.google.android.exoplayer2.upstream.n e10) {
            l(e10, e10.f2573a);
        } catch (n e11) {
            e = e11;
            if (e.f9598c == 1 && (i1Var = this.D.f9571i) != null) {
                e = e.a(i1Var.f9495f.f9515a);
            }
            if (e.f9602r && this.Z == null) {
                d5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Z = e;
                d5.c0 c0Var = this.f9649n;
                d5.b0 a2 = c0Var.a(25, e);
                Handler handler = c0Var.f4337a;
                Message message2 = a2.f4334a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.Z;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.Z;
                }
                d5.a.p("ExoPlayerImplInternal", "Playback error", e);
                c0(true, false);
                this.I = this.I.d(e);
            }
        } catch (t1 e12) {
            boolean z15 = e12.f9771a;
            int i10 = e12.f9772b;
            if (i10 == 1) {
                if (z15) {
                    i9 = 3001;
                } else {
                    i9 = 3003;
                }
            } else if (i10 == 4) {
                if (z15) {
                    i9 = 3002;
                } else {
                    i9 = 3004;
                }
            }
            l(e12, i9);
        } catch (j4.b e13) {
            l(e13, 1002);
        } catch (RuntimeException e14) {
            n nVar2 = new n(2, e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? 1004 : 1004);
            d5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            c0(true, false);
            this.I = this.I.d(nVar2);
        } catch (l3.d e15) {
            l(e15, e15.f16636a);
        } catch (IOException e16) {
            l(e16, 2000);
        }
        v();
        return true;
    }

    public final long i() {
        i1 i1Var = this.D.f9571i;
        if (i1Var == null) {
            return 0L;
        }
        long j10 = i1Var.f9503o;
        if (!i1Var.d) {
            return j10;
        }
        int i9 = 0;
        while (true) {
            e[] eVarArr = this.f9643a;
            if (i9 < eVarArr.length) {
                if (s(eVarArr[i9]) && eVarArr[i9].getStream() == i1Var.f9493c[i9]) {
                    long readingPositionUs = eVarArr[i9].getReadingPositionUs();
                    if (readingPositionUs == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(readingPositionUs, j10);
                }
                i9++;
            } else {
                return j10;
            }
        }
    }

    public final synchronized void i0(o oVar, long j10) {
        this.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j10 > 0) {
            try {
                this.B.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            this.B.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair j(r2 r2Var) {
        long j10 = 0;
        if (r2Var.p()) {
            return Pair.create(w1.f9788s, 0L);
        }
        int a2 = r2Var.a(this.Q);
        Pair i9 = r2Var.i(this.v, this.f9652w, a2, -9223372036854775807L);
        j4.d0 m10 = this.D.m(r2Var, i9.first, 0L);
        long longValue = ((Long) i9.second).longValue();
        if (m10.a()) {
            Object obj = m10.f13426a;
            p2 p2Var = this.f9652w;
            r2Var.g(obj, p2Var);
            if (m10.f13428c == p2Var.f(m10.f13427b)) {
                j10 = p2Var.h.f14633b;
            }
            longValue = j10;
        }
        return Pair.create(m10, Long.valueOf(longValue));
    }

    public final void k(j4.a0 a0Var) {
        boolean z10;
        i1 i1Var = this.D.f9572j;
        if (i1Var != null && i1Var.f9491a == a0Var) {
            long j10 = this.W;
            if (i1Var != null) {
                if (i1Var.f9500l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.i(z10);
                if (i1Var.d) {
                    i1Var.f9491a.z(j10 - i1Var.f9503o);
                }
            }
            u();
        }
    }

    public final void l(IOException iOException, int i9) {
        n nVar = new n(0, iOException, i9);
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            nVar = nVar.a(i1Var.f9495f.f9515a);
        }
        d5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        c0(false, false);
        this.I = this.I.d(nVar);
    }

    public final void m(boolean z10) {
        j4.d0 d0Var;
        long d;
        i1 i1Var = this.D.f9572j;
        if (i1Var == null) {
            d0Var = this.I.f9790b;
        } else {
            d0Var = i1Var.f9495f.f9515a;
        }
        boolean equals = this.I.f9797k.equals(d0Var);
        if (!equals) {
            this.I = this.I.a(d0Var);
        }
        w1 w1Var = this.I;
        if (i1Var == null) {
            d = w1Var.f9804r;
        } else {
            d = i1Var.d();
        }
        w1Var.f9802p = d;
        w1 w1Var2 = this.I;
        long j10 = w1Var2.f9802p;
        i1 i1Var2 = this.D.f9572j;
        long j11 = 0;
        if (i1Var2 != null) {
            j11 = Math.max(0L, j10 - (this.W - i1Var2.f9503o));
        }
        w1Var2.f9803q = j11;
        if ((!equals || z10) && i1Var != null && i1Var.d) {
            f0(i1Var.f9502n);
        }
    }

    public final void n(h3.r2 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: h3.q0.n(h3.r2, boolean):void");
    }

    public final void o(j4.a0 a0Var) {
        k1 k1Var = this.D;
        i1 i1Var = k1Var.f9572j;
        if (i1Var != null && i1Var.f9491a == a0Var) {
            float f10 = this.f9654y.getPlaybackParameters().f9811a;
            r2 r2Var = this.I.f9789a;
            i1Var.d = true;
            i1Var.f9501m = i1Var.f9491a.q();
            b5.a0 g10 = i1Var.g(f10, r2Var);
            j1 j1Var = i1Var.f9495f;
            long j10 = j1Var.f9516b;
            long j11 = j1Var.f9518e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a2 = i1Var.a(g10, j10, false, new boolean[i1Var.f9497i.length]);
            long j12 = i1Var.f9503o;
            j1 j1Var2 = i1Var.f9495f;
            i1Var.f9503o = (j1Var2.f9516b - a2) + j12;
            i1Var.f9495f = j1Var2.b(a2);
            f0(i1Var.f9502n);
            if (i1Var == k1Var.h) {
                F(i1Var.f9495f.f9516b);
                g(new boolean[this.f9643a.length]);
                w1 w1Var = this.I;
                j4.d0 d0Var = w1Var.f9790b;
                long j13 = i1Var.f9495f.f9516b;
                this.I = q(d0Var, j13, w1Var.f9791c, j13, false, 5);
            }
            u();
        }
    }

    public final void p(x1 x1Var, float f10, boolean z10, boolean z11) {
        int i9;
        if (z10) {
            if (z11) {
                this.J.a(1);
            }
            this.I = this.I.e(x1Var);
        }
        float f11 = x1Var.f9811a;
        i1 i1Var = this.D.h;
        while (true) {
            i9 = 0;
            if (i1Var == null) {
                break;
            }
            b5.t[] tVarArr = i1Var.f9502n.f1427c;
            int length = tVarArr.length;
            while (i9 < length) {
                b5.t tVar = tVarArr[i9];
                if (tVar != null) {
                    tVar.q(f11);
                }
                i9++;
            }
            i1Var = i1Var.f9500l;
        }
        e[] eVarArr = this.f9643a;
        int length2 = eVarArr.length;
        while (i9 < length2) {
            e eVar = eVarArr[i9];
            if (eVar != null) {
                eVar.setPlaybackSpeed(f10, x1Var.f9811a);
            }
            i9++;
        }
    }

    public final w1 q(j4.d0 d0Var, long j10, long j11, long j12, boolean z10, int i9) {
        boolean z11;
        long max;
        boolean z12;
        o8.l0 l0Var;
        if (!this.Y && j10 == this.I.f9804r && d0Var.equals(this.I.f9790b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.Y = z11;
        E();
        w1 w1Var = this.I;
        j4.j1 j1Var = w1Var.h;
        b5.a0 a0Var = w1Var.f9795i;
        List list = w1Var.f9796j;
        if (this.E.f9724k) {
            i1 i1Var = this.D.h;
            if (i1Var == null) {
                j1Var = j4.j1.d;
            } else {
                j1Var = i1Var.f9501m;
            }
            if (i1Var == null) {
                a0Var = this.f9647e;
            } else {
                a0Var = i1Var.f9502n;
            }
            b5.t[] tVarArr = a0Var.f1427c;
            o8.w wVar = new o8.w();
            boolean z13 = false;
            for (b5.t tVar : tVarArr) {
                if (tVar != null) {
                    z3.c cVar = tVar.h(0).f9767s;
                    if (cVar == null) {
                        wVar.a(new z3.c(new z3.b[0]));
                    } else {
                        wVar.a(cVar);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                l0Var = wVar.c();
            } else {
                o8.x xVar = o8.z.f19105b;
                l0Var = o8.l0.f19056e;
            }
            list = l0Var;
            if (i1Var != null) {
                j1 j1Var2 = i1Var.f9495f;
                if (j1Var2.f9517c != j11) {
                    i1Var.f9495f = j1Var2.a(j11);
                }
            }
        } else if (!d0Var.equals(w1Var.f9790b)) {
            j1Var = j4.j1.d;
            a0Var = this.f9647e;
            list = o8.l0.f19056e;
        }
        j4.j1 j1Var3 = j1Var;
        b5.a0 a0Var2 = a0Var;
        List list2 = list;
        if (z10) {
            te.f fVar = this.J;
            if (fVar.d && fVar.f47820e != 5) {
                if (i9 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d5.a.f(z12);
            } else {
                fVar.f47818b = true;
                fVar.d = true;
                fVar.f47820e = i9;
            }
        }
        w1 w1Var2 = this.I;
        long j13 = w1Var2.f9802p;
        i1 i1Var2 = this.D.f9572j;
        if (i1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.W - i1Var2.f9503o));
        }
        return w1Var2.b(d0Var, j10, j11, j12, max, j1Var3, a0Var2, list2);
    }

    public final boolean r() {
        long d;
        i1 i1Var = this.D.f9572j;
        if (i1Var != null) {
            if (!i1Var.d) {
                d = 0;
            } else {
                d = i1Var.f9491a.d();
            }
            if (d == Long.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean t() {
        i1 i1Var = this.D.h;
        long j10 = i1Var.f9495f.f9518e;
        if (i1Var.d) {
            if (j10 == -9223372036854775807L || this.I.f9804r < j10 || !Z()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u() {
        long d;
        long max;
        boolean c10;
        boolean z10 = false;
        if (!r()) {
            c10 = false;
        } else {
            i1 i1Var = this.D.f9572j;
            if (!i1Var.d) {
                d = 0;
            } else {
                d = i1Var.f9491a.d();
            }
            i1 i1Var2 = this.D.f9572j;
            if (i1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, d - (this.W - i1Var2.f9503o));
            }
            i1 i1Var3 = this.D.h;
            c10 = this.f9648f.c(max, this.f9654y.getPlaybackParameters().f9811a);
            if (!c10 && max < 500000 && this.f9653x > 0) {
                this.D.h.f9491a.k(this.I.f9804r);
                c10 = this.f9648f.c(max, this.f9654y.getPlaybackParameters().f9811a);
            }
        }
        this.O = c10;
        if (c10) {
            i1 i1Var4 = this.D.f9572j;
            long j10 = this.W;
            if (i1Var4.f9500l == null) {
                z10 = true;
            }
            d5.a.i(z10);
            i1Var4.f9491a.n(j10 - i1Var4.f9503o);
        }
        e0();
    }

    public final void v() {
        boolean z10;
        te.f fVar = this.J;
        w1 w1Var = this.I;
        boolean z11 = fVar.f47818b;
        if (((w1) fVar.h) != w1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        fVar.f47818b = z12;
        fVar.h = w1Var;
        if (z12) {
            k0 k0Var = this.C.f9787a;
            k0Var.f9544i.c(new e5.u(29, k0Var, fVar));
            this.J = new te.f(this.I);
        }
    }

    public final void w() {
        n(this.E.b(), true);
    }

    public final void x(n0 n0Var) {
        boolean z10;
        r2 b10;
        this.J.a(1);
        int i9 = n0Var.f9603a;
        int i10 = n0Var.f9604b;
        int i11 = n0Var.f9605c;
        j4.g1 g1Var = n0Var.d;
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.f9717b;
        if (i9 >= 0 && i9 <= i10 && i10 <= arrayList.size() && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        s1Var.f9723j = g1Var;
        if (i9 != i10 && i9 != i11) {
            int min = Math.min(i9, i11);
            int max = Math.max(((i10 - i9) + i11) - 1, i10 - 1);
            int i12 = ((r1) arrayList.get(min)).d;
            d5.f0.G(i9, i10, i11, arrayList);
            while (min <= max) {
                r1 r1Var = (r1) arrayList.get(min);
                r1Var.d = i12;
                i12 += r1Var.f9688a.f13601o.f13526b.o();
                min++;
            }
            b10 = s1Var.b();
        } else {
            b10 = s1Var.b();
        }
        n(b10, false);
    }

    public final void y() {
        int i9;
        this.J.a(1);
        D(false, false, false, true);
        this.f9648f.b(false);
        if (this.I.f9789a.p()) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        Y(i9);
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.h;
        uVar.getClass();
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.f9717b;
        d5.a.i(!s1Var.f9724k);
        s1Var.f9725l = uVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            s1Var.e(r1Var);
            s1Var.f9721g.add(r1Var);
        }
        s1Var.f9724k = true;
        this.f9649n.d(2);
    }

    public final synchronized boolean z() {
        if (!this.K && this.f9651s.getThread().isAlive()) {
            this.f9649n.d(7);
            i0(new o(this, 3), this.G);
            return this.K;
        }
        return true;
    }
}
