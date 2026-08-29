package j3;

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
public final class q0 implements Handler.Callback, l4.y {
    public final ArrayList A;
    public final f5.y B;
    public final w C;
    public final k1 D;
    public final s1 E;
    public final i F;
    public final long G;
    public j2 H;
    public w1 I;
    public we.f J;
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
    public final e[] f10680a;
    public final Set f10682b;
    public final h2[] f10683c;
    public final d5.u d;
    public final d5.y f10684e;
    public final j f10685f;
    public final com.google.android.exoplayer2.upstream.f h;
    public final f5.a0 f10686n;
    public final HandlerThread f10687r;
    public final Looper f10688s;
    public final q2 v;
    public final p2 f10689w;
    public final long f10690x;
    public final k f10691y;
    public boolean L = false;
    public long f10681a0 = -9223372036854775807L;

    public q0(e[] eVarArr, d5.u uVar, d5.y yVar, j jVar, com.google.android.exoplayer2.upstream.f fVar, int i10, boolean z10, k3.f fVar2, j2 j2Var, i iVar, long j10, Looper looper, f5.y yVar2, w wVar, k3.k kVar) {
        this.C = wVar;
        this.f10680a = eVarArr;
        this.d = uVar;
        this.f10684e = yVar;
        this.f10685f = jVar;
        this.h = fVar;
        this.P = i10;
        this.Q = z10;
        this.H = j2Var;
        this.F = iVar;
        this.G = j10;
        this.B = yVar2;
        this.f10690x = jVar.f10548g;
        w1 h = w1.h(yVar);
        this.I = h;
        this.J = new we.f(h);
        this.f10683c = new h2[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            eVarArr[i11].init(i11, kVar);
            this.f10683c[i11] = eVarArr[i11].getCapabilities();
        }
        this.f10691y = new k(this, yVar2);
        this.A = new ArrayList();
        this.f10682b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new q2();
        this.f10689w = new p2();
        uVar.f5377a = this;
        uVar.f5378b = fVar;
        this.Y = true;
        f5.a0 a2 = yVar2.a(looper, null);
        this.D = new k1(fVar2, a2);
        this.E = new s1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f10687r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f10688s = looper2;
        this.f10686n = yVar2.a(looper2, this);
    }

    public static Pair H(r2 r2Var, p0 p0Var, boolean z10, int i10, boolean z11, q2 q2Var, p2 p2Var) {
        r2 r2Var2;
        Object I;
        r2 r2Var3 = p0Var.f10662a;
        if (!r2Var.p()) {
            if (r2Var3.p()) {
                r2Var2 = r2Var;
            } else {
                r2Var2 = r2Var3;
            }
            try {
                Pair i11 = r2Var2.i(q2Var, p2Var, p0Var.f10663b, p0Var.f10664c);
                if (!r2Var.equals(r2Var2)) {
                    if (r2Var.b(i11.first) != -1) {
                        if (r2Var2.g(i11.first, p2Var).f10678f && r2Var2.m(p2Var.f10676c, q2Var, 0L).A == r2Var2.b(i11.first)) {
                            return r2Var.i(q2Var, p2Var, r2Var.g(i11.first, p2Var).f10676c, p0Var.f10664c);
                        }
                    } else if (z10 && (I = I(q2Var, p2Var, i10, z11, i11.first, r2Var2, r2Var)) != null) {
                        return r2Var.i(q2Var, p2Var, r2Var.g(I, p2Var).f10676c, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i11;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static Object I(q2 q2Var, p2 p2Var, int i10, boolean z10, Object obj, r2 r2Var, r2 r2Var2) {
        int b10 = r2Var.b(obj);
        int h = r2Var.h();
        int i11 = 0;
        int i12 = b10;
        int i13 = -1;
        while (i11 < h && i13 == -1) {
            q2 q2Var2 = q2Var;
            p2 p2Var2 = p2Var;
            int i14 = i10;
            boolean z11 = z10;
            r2 r2Var3 = r2Var;
            i12 = r2Var3.d(i12, p2Var2, q2Var2, i14, z11);
            if (i12 == -1) {
                break;
            }
            i13 = r2Var2.b(r2Var3.l(i12));
            i11++;
            r2Var = r2Var3;
            p2Var = p2Var2;
            q2Var = q2Var2;
            i10 = i14;
            z10 = z11;
        }
        if (i13 == -1) {
            return null;
        }
        return r2Var2.l(i13);
    }

    public static void O(e eVar, long j10) {
        eVar.setCurrentStreamFinal();
        if (eVar instanceof t4.l) {
            t4.l lVar = (t4.l) eVar;
            f5.a.i(lVar.isCurrentStreamFinal());
            lVar.A = j10;
        }
    }

    public static void d(e2 e2Var) {
        try {
            synchronized (e2Var) {
                synchronized (e2Var) {
                }
                e2Var.f10420a.handleMessage(e2Var.d, e2Var.f10423e);
                return;
            }
            e2Var.f10420a.handleMessage(e2Var.d, e2Var.f10423e);
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
        this.f10685f.b(true);
        Y(1);
        HandlerThread handlerThread = this.f10687r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }

    public final void B(int i10, int i11, l4.h1 h1Var) {
        boolean z10 = true;
        this.J.a(1);
        s1 s1Var = this.E;
        s1Var.getClass();
        f5.a.f((i10 < 0 || i10 > i11 || i11 > s1Var.f10754b.size()) ? false : false);
        s1Var.f10760j = h1Var;
        s1Var.g(i10, i11);
        n(s1Var.b(), false);
    }

    public final void C() {
        int i10;
        boolean z10;
        float f9 = this.f10691y.getPlaybackParameters().f10848a;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = k1Var.f10608i;
        boolean z11 = true;
        for (i1 i1Var3 = i1Var; i1Var3 != null && i1Var3.d; i1Var3 = i1Var3.f10537l) {
            d5.y g10 = i1Var3.g(f9, this.I.f10826a);
            d5.y yVar = i1Var3.f10539n;
            d5.r[] rVarArr = g10.f5419c;
            if (yVar != null && yVar.f5419c.length == rVarArr.length) {
                for (int i11 = 0; i11 < rVarArr.length; i11++) {
                    if (g10.a(yVar, i11)) {
                    }
                }
                if (i1Var3 == i1Var2) {
                    z11 = false;
                }
            }
            if (z11) {
                k1 k1Var2 = this.D;
                i1 i1Var4 = k1Var2.h;
                boolean k9 = k1Var2.k(i1Var4);
                boolean[] zArr = new boolean[this.f10680a.length];
                long a2 = i1Var4.a(g10, this.I.f10841r, k9, zArr);
                w1 w1Var = this.I;
                if (w1Var.f10829e != 4 && a2 != w1Var.f10841r) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w1 w1Var2 = this.I;
                i10 = 4;
                this.I = q(w1Var2.f10827b, a2, w1Var2.f10828c, w1Var2.d, z10, 5);
                if (z10) {
                    F(a2);
                }
                boolean[] zArr2 = new boolean[this.f10680a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f10680a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean s10 = s(eVar);
                    zArr2[i12] = s10;
                    l4.c1 c1Var = i1Var4.f10530c[i12];
                    if (s10) {
                        if (c1Var != eVar.getStream()) {
                            e(eVar);
                        } else if (zArr[i12]) {
                            eVar.resetPosition(this.W);
                        }
                    }
                    i12++;
                }
                g(zArr2);
            } else {
                i10 = 4;
                this.D.k(i1Var3);
                if (i1Var3.d) {
                    i1Var3.a(g10, Math.max(i1Var3.f10532f.f10553b, this.W - i1Var3.f10540o), false, new boolean[i1Var3.f10534i.length]);
                }
            }
            m(true);
            if (this.I.f10829e != i10) {
                u();
                g0();
                this.f10686n.d(2);
                return;
            }
            return;
        }
    }

    public final void D(boolean r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: j3.q0.D(boolean, boolean, boolean, boolean):void");
    }

    public final void E() {
        boolean z10;
        i1 i1Var = this.D.h;
        if (i1Var != null && i1Var.f10532f.h && this.L) {
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
        d5.r[] rVarArr;
        i1 i1Var = this.D.h;
        if (i1Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = i1Var.f10540o;
        }
        long j12 = j10 + j11;
        this.W = j12;
        this.f10691y.f10563a.a(j12);
        for (e eVar : this.f10680a) {
            if (s(eVar)) {
                eVar.resetPosition(this.W);
            }
        }
        for (i1 i1Var2 = k1Var.h; i1Var2 != null; i1Var2 = i1Var2.f10537l) {
            for (d5.r rVar : i1Var2.f10539n.f5419c) {
                if (rVar != null) {
                    rVar.s();
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
            a4.w.u(arrayList.get(size));
            throw null;
        }
    }

    public final void J(boolean z10) {
        l4.c0 c0Var = this.D.h.f10532f.f10552a;
        long L = L(c0Var, this.I.f10841r, true, false);
        if (L != this.I.f10841r) {
            w1 w1Var = this.I;
            this.I = q(c0Var, L, w1Var.f10828c, w1Var.d, z10, 5);
        }
    }

    public final void K(j3.p0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: j3.q0.K(j3.p0):void");
    }

    public final long L(l4.c0 c0Var, long j10, boolean z10, boolean z11) {
        d0();
        this.N = false;
        if (z11 || this.I.f10829e == 3) {
            Y(2);
        }
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = i1Var;
        while (i1Var2 != null && !c0Var.equals(i1Var2.f10532f.f10552a)) {
            i1Var2 = i1Var2.f10537l;
        }
        if (z10 || i1Var != i1Var2 || (i1Var2 != null && i1Var2.f10540o + j10 < 0)) {
            e[] eVarArr = this.f10680a;
            for (e eVar : eVarArr) {
                e(eVar);
            }
            if (i1Var2 != null) {
                while (k1Var.h != i1Var2) {
                    k1Var.a();
                }
                k1Var.k(i1Var2);
                i1Var2.f10540o = 1000000000000L;
                g(new boolean[eVarArr.length]);
            }
        }
        if (i1Var2 != null) {
            ?? r9 = i1Var2.f10528a;
            k1Var.k(i1Var2);
            if (!i1Var2.d) {
                i1Var2.f10532f = i1Var2.f10532f.b(j10);
            } else if (i1Var2.f10531e) {
                j10 = r9.p(j10);
                r9.r(j10 - this.f10690x);
            }
            F(j10);
            u();
        } else {
            k1Var.b();
            F(j10);
        }
        m(false);
        this.f10686n.d(2);
        return j10;
    }

    public final void M(e2 e2Var) {
        Looper looper = e2Var.f10424f;
        Looper looper2 = this.f10688s;
        f5.a0 a0Var = this.f10686n;
        if (looper == looper2) {
            d(e2Var);
            int i10 = this.I.f10829e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            a0Var.d(2);
            return;
        }
        a0Var.a(15, e2Var).b();
    }

    public final void N(e2 e2Var) {
        Looper looper = e2Var.f10424f;
        if (!looper.getThread().isAlive()) {
            f5.a.K("TAG", "Trying to send message on a dead thread.");
            e2Var.b(false);
            return;
        }
        this.B.a(looper, null).c(new cg.m2(25, this, e2Var));
    }

    public final void P(boolean z10, AtomicBoolean atomicBoolean) {
        e[] eVarArr;
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (e eVar : this.f10680a) {
                    if (!s(eVar) && this.f10682b.remove(eVar)) {
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
        int i10 = m0Var.f10627c;
        l4.h1 h1Var = m0Var.f10626b;
        ArrayList arrayList = m0Var.f10625a;
        if (i10 != -1) {
            this.V = new p0(new f2(arrayList, h1Var), m0Var.f10627c, m0Var.d);
        }
        s1 s1Var = this.E;
        ArrayList arrayList2 = s1Var.f10754b;
        s1Var.g(0, arrayList2.size());
        n(s1Var.a(arrayList2.size(), arrayList, h1Var), false);
    }

    public final void R(boolean z10) {
        if (z10 != this.T) {
            this.T = z10;
            if (!z10 && this.I.f10838o) {
                this.f10686n.d(2);
            }
        }
    }

    public final void S(boolean z10) {
        this.L = z10;
        E();
        if (this.M) {
            k1 k1Var = this.D;
            if (k1Var.f10608i != k1Var.h) {
                J(true);
                m(false);
            }
        }
    }

    public final void T(int i10, int i11, boolean z10, boolean z11) {
        d5.r[] rVarArr;
        this.J.a(z11 ? 1 : 0);
        we.f fVar = this.J;
        fVar.f49867b = true;
        fVar.f49870f = true;
        fVar.f49871g = i11;
        this.I = this.I.c(i10, z10);
        this.N = false;
        for (i1 i1Var = this.D.h; i1Var != null; i1Var = i1Var.f10537l) {
            for (d5.r rVar : i1Var.f10539n.f5419c) {
                if (rVar != null) {
                    rVar.f(z10);
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i12 = this.I.f10829e;
        f5.a0 a0Var = this.f10686n;
        if (i12 == 3) {
            b0();
            a0Var.d(2);
        } else if (i12 == 2) {
            a0Var.d(2);
        }
    }

    public final void U(x1 x1Var) {
        k kVar = this.f10691y;
        kVar.setPlaybackParameters(x1Var);
        x1 playbackParameters = kVar.getPlaybackParameters();
        p(playbackParameters, playbackParameters.f10848a, true, true);
    }

    public final void V(int i10) {
        this.P = i10;
        r2 r2Var = this.I.f10826a;
        k1 k1Var = this.D;
        k1Var.f10606f = i10;
        if (!k1Var.n(r2Var)) {
            J(true);
        }
        m(false);
    }

    public final void W(boolean z10) {
        this.Q = z10;
        r2 r2Var = this.I.f10826a;
        k1 k1Var = this.D;
        k1Var.f10607g = z10;
        if (!k1Var.n(r2Var)) {
            J(true);
        }
        m(false);
    }

    public final void X(l4.h1 h1Var) {
        this.J.a(1);
        s1 s1Var = this.E;
        int size = s1Var.f10754b.size();
        if (h1Var.getLength() != size) {
            h1Var = h1Var.g().e(0, size);
        }
        s1Var.f10760j = h1Var;
        n(s1Var.b(), false);
    }

    public final void Y(int i10) {
        w1 w1Var = this.I;
        if (w1Var.f10829e != i10) {
            if (i10 != 2) {
                this.f10681a0 = -9223372036854775807L;
            }
            this.I = w1Var.f(i10);
        }
    }

    public final boolean Z() {
        w1 w1Var = this.I;
        if (w1Var.f10835l && w1Var.f10836m == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(l4.e1 e1Var) {
        this.f10686n.a(9, (l4.z) e1Var).b();
    }

    public final boolean a0(r2 r2Var, l4.c0 c0Var) {
        if (!c0Var.a() && !r2Var.p()) {
            int i10 = r2Var.g(c0Var.f14262a, this.f10689w).f10676c;
            q2 q2Var = this.v;
            r2Var.n(i10, q2Var);
            if (q2Var.a() && q2Var.f10701r && q2Var.f10699f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(m0 m0Var, int i10) {
        this.J.a(1);
        s1 s1Var = this.E;
        if (i10 == -1) {
            i10 = s1Var.f10754b.size();
        }
        n(s1Var.a(i10, m0Var.f10625a, m0Var.f10626b), false);
    }

    public final void b0() {
        e[] eVarArr;
        this.N = false;
        k kVar = this.f10691y;
        kVar.f10567f = true;
        kVar.f10563a.b();
        for (e eVar : this.f10680a) {
            if (s(eVar)) {
                eVar.start();
            }
        }
    }

    @Override
    public final void c(l4.z zVar) {
        this.f10686n.a(8, zVar).b();
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
        this.f10685f.b(true);
        Y(1);
    }

    public final void d0() {
        e[] eVarArr;
        k kVar = this.f10691y;
        kVar.f10567f = false;
        c2.e0 e0Var = kVar.f10563a;
        if (e0Var.f2827a) {
            e0Var.a(e0Var.getPositionUs());
            e0Var.f2827a = false;
        }
        for (e eVar : this.f10680a) {
            if (s(eVar) && eVar.getState() == 2) {
                eVar.stop();
            }
        }
    }

    public final void e(e eVar) {
        if (!s(eVar)) {
            return;
        }
        k kVar = this.f10691y;
        if (eVar == kVar.f10565c) {
            kVar.d = null;
            kVar.f10565c = null;
            kVar.f10566e = true;
        }
        if (eVar.getState() == 2) {
            eVar.stop();
        }
        eVar.disable();
        this.U--;
    }

    public final void e0() {
        boolean z10;
        i1 i1Var = this.D.f10609j;
        if (!this.O && (i1Var == null || !i1Var.f10528a.b())) {
            z10 = false;
        } else {
            z10 = true;
        }
        w1 w1Var = this.I;
        if (z10 != w1Var.f10831g) {
            this.I = new w1(w1Var.f10826a, w1Var.f10827b, w1Var.f10828c, w1Var.d, w1Var.f10829e, w1Var.f10830f, z10, w1Var.h, w1Var.f10832i, w1Var.f10833j, w1Var.f10834k, w1Var.f10835l, w1Var.f10836m, w1Var.f10837n, w1Var.f10839p, w1Var.f10840q, w1Var.f10841r, w1Var.f10838o);
        }
    }

    public final void f() {
        throw new UnsupportedOperationException("Method not decompiled: j3.q0.f():void");
    }

    public final void f0(d5.y yVar) {
        d5.r[] rVarArr = yVar.f5419c;
        j jVar = this.f10685f;
        int i10 = jVar.f10547f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.f10680a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (rVarArr[i11] != null) {
                        switch (eVarArr[i11].getTrackType()) {
                            case -2:
                                i13 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i13 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                break;
                        }
                        i12 += i13;
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        jVar.h = i10;
        jVar.f10543a.a(i10);
    }

    public final void g(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        d5.y yVar;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        f5.n nVar;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.f10608i;
        d5.y yVar2 = i1Var.f10539n;
        int i11 = 0;
        while (true) {
            eVarArr = this.f10680a;
            int length = eVarArr.length;
            set = this.f10682b;
            if (i11 >= length) {
                break;
            }
            if (!yVar2.b(i11) && set.remove(eVarArr[i11])) {
                eVarArr[i11].reset();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < eVarArr.length) {
            if (yVar2.b(i12)) {
                boolean z13 = zArr[i12];
                e eVar = eVarArr[i12];
                if (!s(eVar)) {
                    i1 i1Var2 = k1Var.f10608i;
                    if (i1Var2 == k1Var.h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d5.y yVar3 = i1Var2.f10539n;
                    i2 i2Var = yVar3.f5418b[i12];
                    d5.r rVar = yVar3.f5419c[i12];
                    if (rVar != null) {
                        i10 = rVar.length();
                    } else {
                        i10 = 0;
                    }
                    t0[] t0VarArr = new t0[i10];
                    for (int i13 = 0; i13 < i10; i13++) {
                        t0VarArr[i13] = rVar.g(i13);
                    }
                    if (Z() && this.I.f10829e == 3) {
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
                    yVar = yVar2;
                    boolean z14 = z11;
                    eVar.enable(i2Var, t0VarArr, i1Var2.f10530c[i12], this.W, z12, z10, i1Var2.e(), i1Var2.f10540o);
                    eVar.handleMessage(11, new l0(this));
                    k kVar = this.f10691y;
                    kVar.getClass();
                    f5.n mediaClock = eVar.getMediaClock();
                    if (mediaClock != null && mediaClock != (nVar = kVar.d)) {
                        if (nVar == null) {
                            kVar.d = mediaClock;
                            kVar.f10565c = eVar;
                            mediaClock.setPlaybackParameters((x1) kVar.f10563a.f2830e);
                        } else {
                            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z14) {
                        eVar.start();
                    }
                    i12++;
                    yVar2 = yVar;
                }
            }
            yVar = yVar2;
            i12++;
            yVar2 = yVar;
        }
        i1Var.f10533g = true;
    }

    public final void g0() {
        long j10;
        boolean z10;
        long max;
        long j11;
        char c3;
        char c6;
        long max2;
        long j12;
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            if (i1Var.d) {
                j10 = i1Var.f10528a.E();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                F(j10);
                if (j10 != this.I.f10841r) {
                    w1 w1Var = this.I;
                    this.I = q(w1Var.f10827b, j10, w1Var.f10828c, j10, true, 5);
                }
            } else {
                k kVar = this.f10691y;
                if (i1Var != this.D.f10608i) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c2.e0 e0Var = kVar.f10563a;
                e eVar = kVar.f10565c;
                if (eVar != null && !eVar.isEnded() && (kVar.f10565c.isReady() || (!z10 && !kVar.f10565c.hasReadStreamToEnd()))) {
                    f5.n nVar = kVar.d;
                    nVar.getClass();
                    long positionUs = nVar.getPositionUs();
                    if (kVar.f10566e) {
                        if (positionUs < e0Var.getPositionUs()) {
                            if (e0Var.f2827a) {
                                e0Var.a(e0Var.getPositionUs());
                                e0Var.f2827a = false;
                            }
                        } else {
                            kVar.f10566e = false;
                            if (kVar.f10567f) {
                                e0Var.b();
                            }
                        }
                    }
                    e0Var.a(positionUs);
                    x1 playbackParameters = nVar.getPlaybackParameters();
                    if (!playbackParameters.equals((x1) e0Var.f2830e)) {
                        e0Var.setPlaybackParameters(playbackParameters);
                        kVar.f10564b.f10686n.a(16, playbackParameters).b();
                    }
                } else {
                    kVar.f10566e = true;
                    if (kVar.f10567f) {
                        e0Var.b();
                    }
                }
                long positionUs2 = kVar.getPositionUs();
                this.W = positionUs2;
                long j13 = positionUs2 - i1Var.f10540o;
                long j14 = this.I.f10841r;
                ArrayList arrayList = this.A;
                if (!arrayList.isEmpty() && !this.I.f10827b.a()) {
                    if (this.Y) {
                        this.Y = false;
                    }
                    w1 w1Var2 = this.I;
                    w1Var2.f10826a.b(w1Var2.f10827b.f14262a);
                    int min = Math.min(this.X, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.X = min;
                }
                this.I.f10841r = j13;
            }
            this.I.f10839p = this.D.f10609j.d();
            w1 w1Var3 = this.I;
            long j15 = w1Var3.f10839p;
            i1 i1Var2 = this.D.f10609j;
            if (i1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, j15 - (this.W - i1Var2.f10540o));
            }
            w1Var3.f10840q = max;
            w1 w1Var4 = this.I;
            if (w1Var4.f10835l && w1Var4.f10829e == 3 && a0(w1Var4.f10826a, w1Var4.f10827b)) {
                w1 w1Var5 = this.I;
                float f9 = 1.0f;
                if (w1Var5.f10837n.f10848a == 1.0f) {
                    i iVar = this.F;
                    long h = h(w1Var5.f10826a, w1Var5.f10827b.f14262a, w1Var5.f10841r);
                    long j16 = this.I.f10839p;
                    i1 i1Var3 = this.D.f10609j;
                    if (i1Var3 == null) {
                        j11 = -9223372036854775807L;
                        c3 = 1;
                        c6 = 0;
                        max2 = 0;
                    } else {
                        j11 = -9223372036854775807L;
                        c3 = 1;
                        c6 = 0;
                        max2 = Math.max(0L, j16 - (this.W - i1Var3.f10540o));
                    }
                    if (iVar.f10516c != j11) {
                        long j17 = h - max2;
                        if (iVar.f10524m == j11) {
                            iVar.f10524m = j17;
                            iVar.f10525n = 0L;
                        } else {
                            long max3 = Math.max(j17, (((float) j17) * 9.999871E-4f) + (((float) j12) * 0.999f));
                            iVar.f10524m = max3;
                            long abs = Math.abs(j17 - max3);
                            iVar.f10525n = (9.999871E-4f * ((float) abs)) + (0.999f * ((float) iVar.f10525n));
                        }
                        if (iVar.f10523l != j11 && SystemClock.elapsedRealtime() - iVar.f10523l < 1000) {
                            f9 = iVar.f10522k;
                        } else {
                            iVar.f10523l = SystemClock.elapsedRealtime();
                            long j18 = (iVar.f10525n * 3) + iVar.f10524m;
                            if (iVar.h > j18) {
                                float H = (float) f5.d0.H(1000L);
                                long j19 = ((iVar.f10522k - 1.0f) * H) + ((iVar.f10520i - 1.0f) * H);
                                long j20 = iVar.f10517e;
                                long j21 = iVar.h - j19;
                                long[] jArr = new long[3];
                                jArr[c6] = j18;
                                jArr[c3] = j20;
                                jArr[2] = j21;
                                long j22 = jArr[c6];
                                for (int i10 = 1; i10 < 3; i10++) {
                                    long j23 = jArr[i10];
                                    if (j23 > j22) {
                                        j22 = j23;
                                    }
                                }
                                iVar.h = j22;
                            } else {
                                long i11 = f5.d0.i(h - (Math.max(0.0f, iVar.f10522k - 1.0f) / 1.0E-7f), iVar.h, j18);
                                iVar.h = i11;
                                long j24 = iVar.f10519g;
                                if (j24 != j11 && i11 > j24) {
                                    iVar.h = j24;
                                }
                            }
                            long j25 = h - iVar.h;
                            if (Math.abs(j25) < iVar.f10514a) {
                                iVar.f10522k = 1.0f;
                            } else {
                                iVar.f10522k = f5.d0.g((1.0E-7f * ((float) j25)) + 1.0f, iVar.f10521j, iVar.f10520i);
                            }
                            f9 = iVar.f10522k;
                        }
                    }
                    if (this.f10691y.getPlaybackParameters().f10848a != f9) {
                        this.f10691y.setPlaybackParameters(new x1(f9, this.I.f10837n.f10849b));
                        p(this.I.f10837n, this.f10691y.getPlaybackParameters().f10848a, false, false);
                    }
                }
            }
        }
    }

    public final long h(r2 r2Var, Object obj, long j10) {
        p2 p2Var = this.f10689w;
        int i10 = r2Var.g(obj, p2Var).f10676c;
        q2 q2Var = this.v;
        r2Var.n(i10, q2Var);
        if (q2Var.f10699f == -9223372036854775807L || !q2Var.a() || !q2Var.f10701r) {
            return -9223372036854775807L;
        }
        return f5.d0.H(f5.d0.t(q2Var.h) - q2Var.f10699f) - (j10 + p2Var.f10677e);
    }

    public final void h0(r2 r2Var, l4.c0 c0Var, r2 r2Var2, l4.c0 c0Var2, long j10) {
        Object obj;
        x1 x1Var;
        boolean a02 = a0(r2Var, c0Var);
        Object obj2 = c0Var.f14262a;
        if (!a02) {
            if (c0Var.a()) {
                x1Var = x1.d;
            } else {
                x1Var = this.I.f10837n;
            }
            k kVar = this.f10691y;
            if (!kVar.getPlaybackParameters().equals(x1Var)) {
                kVar.setPlaybackParameters(x1Var);
                return;
            }
            return;
        }
        p2 p2Var = this.f10689w;
        int i10 = r2Var.g(obj2, p2Var).f10676c;
        q2 q2Var = this.v;
        r2Var.n(i10, q2Var);
        b1 b1Var = q2Var.v;
        int i11 = f5.d0.f6579a;
        i iVar = this.F;
        iVar.getClass();
        iVar.f10516c = f5.d0.H(b1Var.f10386a);
        iVar.f10518f = f5.d0.H(b1Var.f10387b);
        iVar.f10519g = f5.d0.H(b1Var.f10388c);
        float f9 = b1Var.d;
        if (f9 == -3.4028235E38f) {
            f9 = 0.97f;
        }
        iVar.f10521j = f9;
        float f10 = b1Var.f10389e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.f10520i = f10;
        if (f9 == 1.0f && f10 == 1.0f) {
            iVar.f10516c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = h(r2Var, obj2, j10);
            iVar.a();
            return;
        }
        Object obj3 = q2Var.f10695a;
        if (!r2Var2.p()) {
            obj = r2Var2.m(r2Var2.g(c0Var2.f14262a, p2Var).f10676c, q2Var, 0L).f10695a;
        } else {
            obj = null;
        }
        if (!f5.d0.a(obj, obj3)) {
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
        int i10 = 1000;
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
                    f();
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
                    o((l4.z) message.obj);
                    break;
                case 9:
                    k((l4.z) message.obj);
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
                    p(x1Var, x1Var.f10848a, true, false);
                    break;
                case 17:
                    Q((m0) message.obj);
                    break;
                case 18:
                    b((m0) message.obj, message.arg1);
                    break;
                case 19:
                    x((n0) message.obj);
                    break;
                case 20:
                    B(message.arg1, message.arg2, (l4.h1) message.obj);
                    break;
                case 21:
                    X((l4.h1) message.obj);
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
            l(e10, e10.f3587a);
        } catch (n e11) {
            e = e11;
            if (e.f10635c == 1 && (i1Var = this.D.f10608i) != null) {
                e = e.a(i1Var.f10532f.f10552a);
            }
            if (e.f10639r && this.Z == null) {
                f5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Z = e;
                f5.a0 a0Var = this.f10686n;
                f5.z a2 = a0Var.a(25, e);
                Handler handler = a0Var.f6568a;
                Message message2 = a2.f6647a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.Z;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.Z;
                }
                f5.a.p("ExoPlayerImplInternal", "Playback error", e);
                c0(true, false);
                this.I = this.I.d(e);
            }
        } catch (t1 e12) {
            boolean z15 = e12.f10808a;
            int i11 = e12.f10809b;
            if (i11 == 1) {
                if (z15) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else if (i11 == 4) {
                if (z15) {
                    i10 = 3002;
                } else {
                    i10 = 3004;
                }
            }
            l(e12, i10);
        } catch (RuntimeException e13) {
            n nVar2 = new n(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            f5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            c0(true, false);
            this.I = this.I.d(nVar2);
        } catch (l4.b e14) {
            l(e14, 1002);
        } catch (n3.d e15) {
            l(e15, e15.f17103a);
        } catch (IOException e16) {
            l(e16, 2000);
        }
        v();
        return true;
    }

    public final long i() {
        i1 i1Var = this.D.f10608i;
        if (i1Var == null) {
            return 0L;
        }
        long j10 = i1Var.f10540o;
        if (!i1Var.d) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            e[] eVarArr = this.f10680a;
            if (i10 < eVarArr.length) {
                if (s(eVarArr[i10]) && eVarArr[i10].getStream() == i1Var.f10530c[i10]) {
                    long readingPositionUs = eVarArr[i10].getReadingPositionUs();
                    if (readingPositionUs == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(readingPositionUs, j10);
                }
                i10++;
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
            return Pair.create(w1.f10825s, 0L);
        }
        int a2 = r2Var.a(this.Q);
        Pair i10 = r2Var.i(this.v, this.f10689w, a2, -9223372036854775807L);
        l4.c0 m10 = this.D.m(r2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (m10.a()) {
            Object obj = m10.f14262a;
            p2 p2Var = this.f10689w;
            r2Var.g(obj, p2Var);
            if (m10.f14264c == p2Var.f(m10.f14263b)) {
                j10 = p2Var.h.f16854b;
            }
            longValue = j10;
        }
        return Pair.create(m10, Long.valueOf(longValue));
    }

    public final void k(l4.z zVar) {
        boolean z10;
        i1 i1Var = this.D.f10609j;
        if (i1Var != null && i1Var.f10528a == zVar) {
            long j10 = this.W;
            if (i1Var != null) {
                if (i1Var.f10537l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                if (i1Var.d) {
                    i1Var.f10528a.U(j10 - i1Var.f10540o);
                }
            }
            u();
        }
    }

    public final void l(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            nVar = nVar.a(i1Var.f10532f.f10552a);
        }
        f5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        c0(false, false);
        this.I = this.I.d(nVar);
    }

    public final void m(boolean z10) {
        l4.c0 c0Var;
        long d;
        i1 i1Var = this.D.f10609j;
        if (i1Var == null) {
            c0Var = this.I.f10827b;
        } else {
            c0Var = i1Var.f10532f.f10552a;
        }
        boolean equals = this.I.f10834k.equals(c0Var);
        if (!equals) {
            this.I = this.I.a(c0Var);
        }
        w1 w1Var = this.I;
        if (i1Var == null) {
            d = w1Var.f10841r;
        } else {
            d = i1Var.d();
        }
        w1Var.f10839p = d;
        w1 w1Var2 = this.I;
        long j10 = w1Var2.f10839p;
        i1 i1Var2 = this.D.f10609j;
        long j11 = 0;
        if (i1Var2 != null) {
            j11 = Math.max(0L, j10 - (this.W - i1Var2.f10540o));
        }
        w1Var2.f10840q = j11;
        if ((!equals || z10) && i1Var != null && i1Var.d) {
            f0(i1Var.f10539n);
        }
    }

    public final void n(j3.r2 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: j3.q0.n(j3.r2, boolean):void");
    }

    public final void o(l4.z zVar) {
        k1 k1Var = this.D;
        i1 i1Var = k1Var.f10609j;
        if (i1Var != null && i1Var.f10528a == zVar) {
            float f9 = this.f10691y.getPlaybackParameters().f10848a;
            r2 r2Var = this.I.f10826a;
            i1Var.d = true;
            i1Var.f10538m = i1Var.f10528a.J();
            d5.y g10 = i1Var.g(f9, r2Var);
            j1 j1Var = i1Var.f10532f;
            long j10 = j1Var.f10553b;
            long j11 = j1Var.f10555e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a2 = i1Var.a(g10, j10, false, new boolean[i1Var.f10534i.length]);
            long j12 = i1Var.f10540o;
            j1 j1Var2 = i1Var.f10532f;
            i1Var.f10540o = (j1Var2.f10553b - a2) + j12;
            i1Var.f10532f = j1Var2.b(a2);
            f0(i1Var.f10539n);
            if (i1Var == k1Var.h) {
                F(i1Var.f10532f.f10553b);
                g(new boolean[this.f10680a.length]);
                w1 w1Var = this.I;
                l4.c0 c0Var = w1Var.f10827b;
                long j13 = i1Var.f10532f.f10553b;
                this.I = q(c0Var, j13, w1Var.f10828c, j13, false, 5);
            }
            u();
        }
    }

    public final void p(x1 x1Var, float f9, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.J.a(1);
            }
            this.I = this.I.e(x1Var);
        }
        float f10 = x1Var.f10848a;
        i1 i1Var = this.D.h;
        while (true) {
            i10 = 0;
            if (i1Var == null) {
                break;
            }
            d5.r[] rVarArr = i1Var.f10539n.f5419c;
            int length = rVarArr.length;
            while (i10 < length) {
                d5.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.q(f10);
                }
                i10++;
            }
            i1Var = i1Var.f10537l;
        }
        e[] eVarArr = this.f10680a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.setPlaybackSpeed(f9, x1Var.f10848a);
            }
            i10++;
        }
    }

    public final w1 q(l4.c0 c0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        long max;
        boolean z12;
        q8.l0 l0Var;
        if (!this.Y && j10 == this.I.f10841r && c0Var.equals(this.I.f10827b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.Y = z11;
        E();
        w1 w1Var = this.I;
        l4.k1 k1Var = w1Var.h;
        d5.y yVar = w1Var.f10832i;
        List list = w1Var.f10833j;
        if (this.E.f10761k) {
            i1 i1Var = this.D.h;
            if (i1Var == null) {
                k1Var = l4.k1.d;
            } else {
                k1Var = i1Var.f10538m;
            }
            if (i1Var == null) {
                yVar = this.f10684e;
            } else {
                yVar = i1Var.f10539n;
            }
            d5.r[] rVarArr = yVar.f5419c;
            q8.w wVar = new q8.w();
            boolean z13 = false;
            for (d5.r rVar : rVarArr) {
                if (rVar != null) {
                    b4.c cVar = rVar.g(0).f10804s;
                    if (cVar == null) {
                        wVar.a(new b4.c(new b4.b[0]));
                    } else {
                        wVar.a(cVar);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                l0Var = wVar.c();
            } else {
                q8.x xVar = q8.z.f46511b;
                l0Var = q8.l0.f46462e;
            }
            list = l0Var;
            if (i1Var != null) {
                j1 j1Var = i1Var.f10532f;
                if (j1Var.f10554c != j11) {
                    i1Var.f10532f = j1Var.a(j11);
                }
            }
        } else if (!c0Var.equals(w1Var.f10827b)) {
            k1Var = l4.k1.d;
            yVar = this.f10684e;
            list = q8.l0.f46462e;
        }
        l4.k1 k1Var2 = k1Var;
        d5.y yVar2 = yVar;
        List list2 = list;
        if (z10) {
            we.f fVar = this.J;
            if (fVar.d && fVar.f49869e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f5.a.f(z12);
            } else {
                fVar.f49867b = true;
                fVar.d = true;
                fVar.f49869e = i10;
            }
        }
        w1 w1Var2 = this.I;
        long j13 = w1Var2.f10839p;
        i1 i1Var2 = this.D.f10609j;
        if (i1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.W - i1Var2.f10540o));
        }
        return w1Var2.b(c0Var, j10, j11, j12, max, k1Var2, yVar2, list2);
    }

    public final boolean r() {
        long h;
        i1 i1Var = this.D.f10609j;
        if (i1Var != null) {
            if (!i1Var.d) {
                h = 0;
            } else {
                h = i1Var.f10528a.h();
            }
            if (h == Long.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean t() {
        i1 i1Var = this.D.h;
        long j10 = i1Var.f10532f.f10555e;
        if (i1Var.d) {
            if (j10 == -9223372036854775807L || this.I.f10841r < j10 || !Z()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u() {
        long h;
        long max;
        boolean c3;
        boolean z10 = false;
        if (!r()) {
            c3 = false;
        } else {
            i1 i1Var = this.D.f10609j;
            if (!i1Var.d) {
                h = 0;
            } else {
                h = i1Var.f10528a.h();
            }
            i1 i1Var2 = this.D.f10609j;
            if (i1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, h - (this.W - i1Var2.f10540o));
            }
            i1 i1Var3 = this.D.h;
            c3 = this.f10685f.c(max, this.f10691y.getPlaybackParameters().f10848a);
            if (!c3 && max < 500000 && this.f10690x > 0) {
                this.D.h.f10528a.r(this.I.f10841r);
                c3 = this.f10685f.c(max, this.f10691y.getPlaybackParameters().f10848a);
            }
        }
        this.O = c3;
        if (c3) {
            i1 i1Var4 = this.D.f10609j;
            long j10 = this.W;
            if (i1Var4.f10537l == null) {
                z10 = true;
            }
            f5.a.i(z10);
            i1Var4.f10528a.s(j10 - i1Var4.f10540o);
        }
        e0();
    }

    public final void v() {
        boolean z10;
        we.f fVar = this.J;
        w1 w1Var = this.I;
        boolean z11 = fVar.f49867b;
        if (((w1) fVar.h) != w1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        fVar.f49867b = z12;
        fVar.h = w1Var;
        if (z12) {
            k0 k0Var = this.C.f10824a;
            k0Var.f10581i.c(new ef.c(23, k0Var, fVar));
            this.J = new we.f(this.I);
        }
    }

    public final void w() {
        n(this.E.b(), true);
    }

    public final void x(n0 n0Var) {
        boolean z10;
        r2 b10;
        this.J.a(1);
        int i10 = n0Var.f10640a;
        int i11 = n0Var.f10641b;
        int i12 = n0Var.f10642c;
        l4.h1 h1Var = n0Var.d;
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.f10754b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        s1Var.f10760j = h1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((r1) arrayList.get(min)).d;
            f5.d0.G(i10, i11, i12, arrayList);
            while (min <= max) {
                r1 r1Var = (r1) arrayList.get(min);
                r1Var.d = i13;
                i13 += r1Var.f10725a.f14453o.f14382b.o();
                min++;
            }
            b10 = s1Var.b();
        } else {
            b10 = s1Var.b();
        }
        n(b10, false);
    }

    public final void y() {
        int i10;
        this.J.a(1);
        D(false, false, false, true);
        this.f10685f.b(false);
        if (this.I.f10826a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        Y(i10);
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.h;
        uVar.getClass();
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.f10754b;
        f5.a.i(!s1Var.f10761k);
        s1Var.f10762l = uVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r1 r1Var = (r1) arrayList.get(i11);
            s1Var.e(r1Var);
            s1Var.f10758g.add(r1Var);
        }
        s1Var.f10761k = true;
        this.f10686n.d(2);
    }

    public final synchronized boolean z() {
        if (!this.K && this.f10688s.getThread().isAlive()) {
            this.f10686n.d(7);
            i0(new o(this, 3), this.G);
            return this.K;
        }
        return true;
    }
}
