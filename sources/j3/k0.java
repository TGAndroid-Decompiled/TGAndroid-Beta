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
public final class k0 implements Handler.Callback, o4.s {
    public final ArrayList B;
    public final h5.y C;
    public final u D;
    public final h1 E;
    public final q1 F;
    public final i G;
    public final long H;
    public h2 I;
    public u1 J;
    public ye.f K;
    public boolean L;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public j0 W;
    public long X;
    public int Y;
    public boolean Z;
    public final e[] f8645a;
    public n f8646a0;
    public final Set f8647b;
    public final e[] f8649c;
    public final f5.t d;
    public final f5.x e;
    public final j f8650f;
    public final g5.f h;
    public final h5.a0 f8651n;
    public final HandlerThread f8652r;
    public final Looper f8653s;
    public final n2 v;
    public final m2 f8654w;
    public final long f8655x;
    public final k f8656y;
    public boolean M = false;
    public long f8648b0 = -9223372036854775807L;

    public k0(e[] eVarArr, f5.t tVar, f5.x xVar, j jVar, g5.f fVar, int i10, boolean z4, k3.f fVar2, h2 h2Var, i iVar, long j10, Looper looper, h5.y yVar, u uVar, k3.k kVar) {
        this.D = uVar;
        this.f8645a = eVarArr;
        this.d = tVar;
        this.e = xVar;
        this.f8650f = jVar;
        this.h = fVar;
        this.Q = i10;
        this.R = z4;
        this.I = h2Var;
        this.G = iVar;
        this.H = j10;
        this.C = yVar;
        this.f8655x = jVar.f8633g;
        jVar.getClass();
        u1 i11 = u1.i(xVar);
        this.J = i11;
        this.K = new ye.f(i11);
        this.f8649c = new e[eVarArr.length];
        f5.p pVar = (f5.p) tVar;
        pVar.getClass();
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            e eVar = eVarArr[i12];
            eVar.e = i12;
            eVar.f8491f = kVar;
            this.f8649c[i12] = eVar;
            synchronized (eVar.f8488a) {
                eVar.f8497y = pVar;
            }
        }
        this.f8656y = new k(this, yVar);
        this.B = new ArrayList();
        this.f8647b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new n2();
        this.f8654w = new m2();
        tVar.f5962a = this;
        tVar.f5963b = fVar;
        this.Z = true;
        h5.a0 a2 = yVar.a(looper, null);
        this.E = new h1(fVar2, a2);
        this.F = new q1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f8652r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f8653s = looper2;
        this.f8651n = yVar.a(looper2, this);
    }

    public static Pair G(o2 o2Var, j0 j0Var, boolean z4, int i10, boolean z10, n2 n2Var, m2 m2Var) {
        o2 o2Var2;
        Object H;
        o2 o2Var3 = j0Var.f8635a;
        if (!o2Var.p()) {
            if (o2Var3.p()) {
                o2Var2 = o2Var;
            } else {
                o2Var2 = o2Var3;
            }
            try {
                Pair i11 = o2Var2.i(n2Var, m2Var, j0Var.f8636b, j0Var.f8637c);
                if (!o2Var.equals(o2Var2)) {
                    if (o2Var.b(i11.first) != -1) {
                        if (o2Var2.g(i11.first, m2Var).f8705f && o2Var2.m(m2Var.f8704c, n2Var, 0L).B == o2Var2.b(i11.first)) {
                            return o2Var.i(n2Var, m2Var, o2Var.g(i11.first, m2Var).f8704c, j0Var.f8637c);
                        }
                    } else if (z4 && (H = H(n2Var, m2Var, i10, z10, i11.first, o2Var2, o2Var)) != null) {
                        return o2Var.i(n2Var, m2Var, o2Var.g(H, m2Var).f8704c, -9223372036854775807L);
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

    public static Object H(n2 n2Var, m2 m2Var, int i10, boolean z4, Object obj, o2 o2Var, o2 o2Var2) {
        int b10 = o2Var.b(obj);
        int h = o2Var.h();
        int i11 = 0;
        int i12 = b10;
        int i13 = -1;
        while (i11 < h && i13 == -1) {
            n2 n2Var2 = n2Var;
            m2 m2Var2 = m2Var;
            int i14 = i10;
            boolean z10 = z4;
            o2 o2Var3 = o2Var;
            i12 = o2Var3.d(i12, m2Var2, n2Var2, i14, z10);
            if (i12 == -1) {
                break;
            }
            i13 = o2Var2.b(o2Var3.l(i12));
            i11++;
            o2Var = o2Var3;
            m2Var = m2Var2;
            n2Var = n2Var2;
            i10 = i14;
            z4 = z10;
        }
        if (i13 == -1) {
            return null;
        }
        return o2Var2.l(i13);
    }

    public static void N(e eVar, long j10) {
        eVar.f8495w = true;
        if (eVar instanceof v4.l) {
            v4.l lVar = (v4.l) eVar;
            h5.a.i(lVar.f8495w);
            lVar.P = j10;
        }
    }

    public static void b(c2 c2Var) {
        try {
            synchronized (c2Var) {
                synchronized (c2Var) {
                }
                c2Var.f8452a.b(c2Var.d, c2Var.e);
                return;
            }
            c2Var.f8452a.b(c2Var.d, c2Var.e);
            return;
        } finally {
            c2Var.b(true);
        }
    }

    public static boolean q(e eVar) {
        if (eVar.h != 0) {
            return true;
        }
        return false;
    }

    public final void A(int i10, int i11, o4.q0 q0Var) {
        boolean z4 = true;
        this.K.a(1);
        q1 q1Var = this.F;
        q1Var.getClass();
        h5.a.f((i10 < 0 || i10 > i11 || i11 > q1Var.f8794b.size()) ? false : false);
        q1Var.f8799j = q0Var;
        q1Var.g(i10, i11);
        k(q1Var.b(), false);
    }

    public final void B() {
        int i10;
        float f10 = this.f8656y.d().f8856a;
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = h1Var.f8604i;
        boolean z4 = true;
        for (f1 f1Var3 = f1Var; f1Var3 != null && f1Var3.d; f1Var3 = f1Var3.f8578l) {
            f5.x g10 = f1Var3.g(f10, this.J.f8832a);
            f5.x xVar = f1Var3.f8580n;
            f5.c[] cVarArr = g10.f6002c;
            boolean z10 = false;
            if (xVar != null && xVar.f6002c.length == cVarArr.length) {
                for (int i11 = 0; i11 < cVarArr.length; i11++) {
                    if (g10.a(xVar, i11)) {
                    }
                }
                if (f1Var3 == f1Var2) {
                    z4 = false;
                }
            }
            if (z4) {
                h1 h1Var2 = this.E;
                f1 f1Var4 = h1Var2.h;
                boolean l10 = h1Var2.l(f1Var4);
                boolean[] zArr = new boolean[this.f8645a.length];
                long a2 = f1Var4.a(g10, this.J.f8846r, l10, zArr);
                u1 u1Var = this.J;
                if (u1Var.e != 4 && a2 != u1Var.f8846r) {
                    z10 = true;
                }
                u1 u1Var2 = this.J;
                i10 = 4;
                this.J = o(u1Var2.f8833b, a2, u1Var2.f8834c, u1Var2.d, z10, 5);
                if (z10) {
                    E(a2);
                }
                boolean[] zArr2 = new boolean[this.f8645a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f8645a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean q10 = q(eVar);
                    zArr2[i12] = q10;
                    o4.l0 l0Var = f1Var4.f8572c[i12];
                    if (q10) {
                        if (l0Var != eVar.f8492n) {
                            c(eVar);
                        } else if (zArr[i12]) {
                            long j10 = this.X;
                            eVar.f8495w = false;
                            eVar.v = j10;
                            eVar.m(j10, false);
                        }
                    }
                    i12++;
                }
                e(zArr2);
            } else {
                i10 = 4;
                this.E.l(f1Var3);
                if (f1Var3.d) {
                    f1Var3.a(g10, Math.max(f1Var3.f8573f.f8586b, this.X - f1Var3.f8581o), false, new boolean[f1Var3.f8575i.length]);
                }
            }
            j(true);
            if (this.J.e != i10) {
                s();
                g0();
                this.f8651n.d(2);
                return;
            }
            return;
        }
    }

    public final void C(boolean r32, boolean r33, boolean r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.C(boolean, boolean, boolean, boolean):void");
    }

    public final void D() {
        boolean z4;
        f1 f1Var = this.E.h;
        if (f1Var != null && f1Var.f8573f.h && this.M) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N = z4;
    }

    public final void E(long j10) {
        h1 h1Var;
        long j11;
        e[] eVarArr;
        f5.c[] cVarArr;
        f1 f1Var = this.E.h;
        if (f1Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = f1Var.f8581o;
        }
        long j12 = j10 + j11;
        this.X = j12;
        this.f8656y.f8641a.a(j12);
        for (e eVar : this.f8645a) {
            if (q(eVar)) {
                long j13 = this.X;
                eVar.f8495w = false;
                eVar.v = j13;
                eVar.m(j13, false);
            }
        }
        for (f1 f1Var2 = h1Var.h; f1Var2 != null; f1Var2 = f1Var2.f8578l) {
            for (f5.c cVar : f1Var2.f8580n.f6002c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
    }

    public final void F(o2 o2Var, o2 o2Var2) {
        if (o2Var.p() && o2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            android.support.v4.media.a.v(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z4) {
        o4.v vVar = this.E.h.f8573f.f8585a;
        long K = K(vVar, this.J.f8846r, true, false);
        if (K != this.J.f8846r) {
            u1 u1Var = this.J;
            this.J = o(vVar, K, u1Var.f8834c, u1Var.d, z4, 5);
        }
    }

    public final void J(j3.j0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.J(j3.j0):void");
    }

    public final long K(o4.v vVar, long j10, boolean z4, boolean z10) {
        d0();
        this.O = false;
        if (z10 || this.J.e == 3) {
            X(2);
        }
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = f1Var;
        while (f1Var2 != null && !vVar.equals(f1Var2.f8573f.f8585a)) {
            f1Var2 = f1Var2.f8578l;
        }
        if (z4 || f1Var != f1Var2 || (f1Var2 != null && f1Var2.f8581o + j10 < 0)) {
            e[] eVarArr = this.f8645a;
            for (e eVar : eVarArr) {
                c(eVar);
            }
            if (f1Var2 != null) {
                while (h1Var.h != f1Var2) {
                    h1Var.a();
                }
                h1Var.l(f1Var2);
                f1Var2.f8581o = 1000000000000L;
                e(new boolean[eVarArr.length]);
            }
        }
        if (f1Var2 != null) {
            ?? r92 = f1Var2.f8570a;
            h1Var.l(f1Var2);
            if (!f1Var2.d) {
                f1Var2.f8573f = f1Var2.f8573f.b(j10);
            } else if (f1Var2.e) {
                j10 = r92.z(j10);
                r92.B(j10 - this.f8655x);
            }
            E(j10);
            s();
        } else {
            h1Var.b();
            E(j10);
        }
        j(false);
        this.f8651n.d(2);
        return j10;
    }

    public final void L(c2 c2Var) {
        Looper looper = c2Var.f8455f;
        Looper looper2 = this.f8653s;
        h5.a0 a0Var = this.f8651n;
        if (looper == looper2) {
            b(c2Var);
            int i10 = this.J.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            a0Var.d(2);
            return;
        }
        a0Var.a(15, c2Var).b();
    }

    public final void M(c2 c2Var) {
        Looper looper = c2Var.f8455f;
        if (!looper.getThread().isAlive()) {
            h5.a.K("TAG", "Trying to send message on a dead thread.");
            c2Var.b(false);
            return;
        }
        this.C.a(looper, null).c(new ef.e(this, c2Var));
    }

    public final void O(boolean z4, AtomicBoolean atomicBoolean) {
        e[] eVarArr;
        if (this.S != z4) {
            this.S = z4;
            if (!z4) {
                for (e eVar : this.f8645a) {
                    if (!q(eVar) && this.f8647b.remove(eVar)) {
                        eVar.v();
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

    public final void P(h0 h0Var) {
        this.K.a(1);
        int i10 = h0Var.f8598c;
        o4.q0 q0Var = h0Var.f8597b;
        ArrayList arrayList = h0Var.f8596a;
        if (i10 != -1) {
            this.W = new j0(new e2(arrayList, q0Var), h0Var.f8598c, h0Var.d);
        }
        q1 q1Var = this.F;
        ArrayList arrayList2 = q1Var.f8794b;
        q1Var.g(0, arrayList2.size());
        k(q1Var.a(arrayList2.size(), arrayList, q0Var), false);
    }

    public final void Q(boolean z4) {
        if (z4 != this.U) {
            this.U = z4;
            if (!z4 && this.J.f8843o) {
                this.f8651n.d(2);
            }
        }
    }

    public final void R(boolean z4) {
        this.M = z4;
        D();
        if (this.N) {
            h1 h1Var = this.E;
            if (h1Var.f8604i != h1Var.h) {
                I(true);
                j(false);
            }
        }
    }

    public final void S(int i10, int i11, boolean z4, boolean z10) {
        f5.c[] cVarArr;
        this.K.a(z10 ? 1 : 0);
        ye.f fVar = this.K;
        fVar.f47170b = true;
        fVar.f47172f = true;
        fVar.f47173g = i11;
        this.J = this.J.d(i10, z4);
        this.O = false;
        for (f1 f1Var = this.E.h; f1Var != null; f1Var = f1Var.f8578l) {
            for (f5.c cVar : f1Var.f8580n.f6002c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
        if (!Y()) {
            d0();
            g0();
            return;
        }
        int i12 = this.J.e;
        h5.a0 a0Var = this.f8651n;
        if (i12 == 3) {
            b0();
            a0Var.d(2);
        } else if (i12 == 2) {
            a0Var.d(2);
        }
    }

    public final void T(v1 v1Var) {
        this.f8651n.f6926a.removeMessages(16);
        k kVar = this.f8656y;
        kVar.c(v1Var);
        v1 d = kVar.d();
        m(d, d.f8856a, true, true);
    }

    public final void U(int i10) {
        this.Q = i10;
        o2 o2Var = this.J.f8832a;
        h1 h1Var = this.E;
        h1Var.f8602f = i10;
        if (!h1Var.o(o2Var)) {
            I(true);
        }
        j(false);
    }

    public final void V(boolean z4) {
        this.R = z4;
        o2 o2Var = this.J.f8832a;
        h1 h1Var = this.E;
        h1Var.f8603g = z4;
        if (!h1Var.o(o2Var)) {
            I(true);
        }
        j(false);
    }

    public final void W(o4.q0 q0Var) {
        this.K.a(1);
        q1 q1Var = this.F;
        int size = q1Var.f8794b.size();
        if (q0Var.getLength() != size) {
            q0Var = q0Var.g().e(size);
        }
        q1Var.f8799j = q0Var;
        k(q1Var.b(), false);
    }

    public final void X(int i10) {
        u1 u1Var = this.J;
        if (u1Var.e != i10) {
            if (i10 != 2) {
                this.f8648b0 = -9223372036854775807L;
            }
            this.J = u1Var.g(i10);
        }
    }

    public final boolean Y() {
        u1 u1Var = this.J;
        if (u1Var.f8840l && u1Var.f8841m == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void Z(o4.n0 n0Var) {
        this.f8651n.a(9, (o4.t) n0Var).b();
    }

    public final void a(h0 h0Var, int i10) {
        this.K.a(1);
        q1 q1Var = this.F;
        if (i10 == -1) {
            i10 = q1Var.f8794b.size();
        }
        k(q1Var.a(i10, h0Var.f8596a, h0Var.f8597b), false);
    }

    public final boolean a0(o2 o2Var, o4.v vVar) {
        if (!vVar.a() && !o2Var.p()) {
            int i10 = o2Var.g(vVar.f16424a, this.f8654w).f8704c;
            n2 n2Var = this.v;
            o2Var.n(i10, n2Var);
            if (n2Var.a() && n2Var.f8754r && n2Var.f8752f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b0() {
        e[] eVarArr;
        boolean z4;
        this.O = false;
        k kVar = this.f8656y;
        kVar.f8644f = true;
        kVar.f8641a.b();
        for (e eVar : this.f8645a) {
            if (q(eVar)) {
                if (eVar.h == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                eVar.h = 2;
                eVar.p();
            }
        }
    }

    public final void c(e eVar) {
        boolean z4;
        boolean z10;
        if (!q(eVar)) {
            return;
        }
        k kVar = this.f8656y;
        if (eVar == kVar.f8643c) {
            kVar.d = null;
            kVar.f8643c = null;
            kVar.e = true;
        }
        int i10 = eVar.h;
        if (i10 == 2) {
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h5.a.i(z10);
            eVar.h = 1;
            eVar.q();
        }
        if (eVar.h == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        eVar.f8490c.l();
        eVar.h = 0;
        eVar.f8492n = null;
        eVar.f8493r = null;
        eVar.f8495w = false;
        eVar.k();
        this.V--;
    }

    public final void c0(boolean z4, boolean z10) {
        boolean z11;
        if (!z4 && this.S) {
            z11 = false;
        } else {
            z11 = true;
        }
        C(z11, false, true, false);
        this.K.a(z10 ? 1 : 0);
        this.f8650f.b(true);
        X(1);
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.d():void");
    }

    public final void d0() {
        e[] eVarArr;
        int i10;
        boolean z4;
        k kVar = this.f8656y;
        kVar.f8644f = false;
        c2.d0 d0Var = kVar.f8641a;
        if (d0Var.f1908a) {
            d0Var.a(d0Var.e());
            d0Var.f1908a = false;
        }
        for (e eVar : this.f8645a) {
            if (q(eVar) && (i10 = eVar.h) == 2) {
                if (i10 == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                eVar.h = 1;
                eVar.q();
            }
        }
    }

    public final void e(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        f5.x xVar;
        int i10;
        e[] eVarArr2;
        boolean z4;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h5.n nVar;
        h1 h1Var = this.E;
        f1 f1Var = h1Var.f8604i;
        f5.x xVar2 = f1Var.f8580n;
        int i12 = 0;
        while (true) {
            eVarArr = this.f8645a;
            int length = eVarArr.length;
            set = this.f8647b;
            if (i12 >= length) {
                break;
            }
            if (!xVar2.b(i12) && set.remove(eVarArr[i12])) {
                eVarArr[i12].v();
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < eVarArr.length) {
            if (xVar2.b(i13)) {
                boolean z14 = zArr[i13];
                e eVar = eVarArr[i13];
                if (!q(eVar)) {
                    f1 f1Var2 = h1Var.f8604i;
                    if (f1Var2 == h1Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f5.x xVar3 = f1Var2.f8580n;
                    g2 g2Var = xVar3.f6001b[i13];
                    f5.c cVar = xVar3.f6002c[i13];
                    if (cVar != null) {
                        i11 = cVar.p();
                    } else {
                        i11 = 0;
                    }
                    n0[] n0VarArr = new n0[i11];
                    for (int i14 = 0; i14 < i11; i14++) {
                        n0VarArr[i14] = cVar.e(i14);
                    }
                    if (Y() && this.J.e == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z14 && z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.V++;
                    set.add(eVar);
                    o4.l0 l0Var = f1Var2.f8572c[i13];
                    xVar = xVar2;
                    long j10 = this.X;
                    long e = f1Var2.e();
                    i10 = i13;
                    eVarArr2 = eVarArr;
                    long j11 = f1Var2.f8581o;
                    if (eVar.h == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h5.a.i(z12);
                    eVar.d = g2Var;
                    eVar.h = 1;
                    eVar.l(z11, z4);
                    eVar.u(n0VarArr, l0Var, e, j11);
                    eVar.f8495w = false;
                    eVar.v = j10;
                    eVar.m(j10, z11);
                    eVar.b(11, new g0(this));
                    k kVar = this.f8656y;
                    kVar.getClass();
                    h5.n f10 = eVar.f();
                    if (f10 != null && f10 != (nVar = kVar.d)) {
                        if (nVar == null) {
                            kVar.d = f10;
                            kVar.f8643c = eVar;
                            f10.c((v1) kVar.f8641a.e);
                        } else {
                            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z10) {
                        if (eVar.h == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        h5.a.i(z13);
                        eVar.h = 2;
                        eVar.p();
                    }
                    i13 = i10 + 1;
                    xVar2 = xVar;
                    eVarArr = eVarArr2;
                }
            }
            xVar = xVar2;
            i10 = i13;
            eVarArr2 = eVarArr;
            i13 = i10 + 1;
            xVar2 = xVar;
            eVarArr = eVarArr2;
        }
        f1Var.f8574g = true;
    }

    public final void e0() {
        boolean z4;
        f1 f1Var = this.E.f8605j;
        if (!this.P && (f1Var == null || !f1Var.f8570a.b())) {
            z4 = false;
        } else {
            z4 = true;
        }
        u1 u1Var = this.J;
        if (z4 != u1Var.f8836g) {
            this.J = new u1(u1Var.f8832a, u1Var.f8833b, u1Var.f8834c, u1Var.d, u1Var.e, u1Var.f8835f, z4, u1Var.h, u1Var.f8837i, u1Var.f8838j, u1Var.f8839k, u1Var.f8840l, u1Var.f8841m, u1Var.f8842n, u1Var.f8844p, u1Var.f8845q, u1Var.f8846r, u1Var.f8847s, u1Var.f8843o);
        }
    }

    public final long f(o2 o2Var, Object obj, long j10) {
        m2 m2Var = this.f8654w;
        int i10 = o2Var.g(obj, m2Var).f8704c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        if (n2Var.f8752f == -9223372036854775807L || !n2Var.a() || !n2Var.f8754r) {
            return -9223372036854775807L;
        }
        return h5.d0.G(h5.d0.u(n2Var.h) - n2Var.f8752f) - (j10 + m2Var.e);
    }

    public final void f0(f5.x xVar) {
        o2 o2Var = this.J.f8832a;
        f5.c[] cVarArr = xVar.f6002c;
        j jVar = this.f8650f;
        int i10 = jVar.f8632f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.f8645a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (cVarArr[i11] != null) {
                        switch (eVarArr[i11].f8489b) {
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
                            default:
                                throw new IllegalArgumentException();
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
        jVar.f8629a.a(i10);
    }

    public final Pair g(o2 o2Var) {
        long j10 = 0;
        if (o2Var.p()) {
            return Pair.create(u1.f8831t, 0L);
        }
        int a2 = o2Var.a(this.R);
        Pair i10 = o2Var.i(this.v, this.f8654w, a2, -9223372036854775807L);
        o4.v n10 = this.E.n(o2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (n10.a()) {
            Object obj = n10.f16424a;
            m2 m2Var = this.f8654w;
            o2Var.g(obj, m2Var);
            if (n10.f16426c == m2Var.f(n10.f16425b)) {
                j10 = m2Var.h.f41049b;
            }
            longValue = j10;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    public final void g0() {
        long j10;
        boolean z4;
        long j11;
        long max;
        char c3;
        char c10;
        long max2;
        long j12;
        f1 f1Var = this.E.h;
        if (f1Var != null) {
            if (f1Var.d) {
                j10 = f1Var.f8570a.K();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                E(j10);
                if (j10 != this.J.f8846r) {
                    u1 u1Var = this.J;
                    this.J = o(u1Var.f8833b, j10, u1Var.f8834c, j10, true, 5);
                }
            } else {
                k kVar = this.f8656y;
                if (f1Var != this.E.f8604i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c2.d0 d0Var = kVar.f8641a;
                e eVar = kVar.f8643c;
                if (eVar != null && !eVar.i() && (kVar.f8643c.j() || (!z4 && !kVar.f8643c.h()))) {
                    h5.n nVar = kVar.d;
                    nVar.getClass();
                    long e = nVar.e();
                    if (kVar.e) {
                        if (e < d0Var.e()) {
                            if (d0Var.f1908a) {
                                d0Var.a(d0Var.e());
                                d0Var.f1908a = false;
                            }
                        } else {
                            kVar.e = false;
                            if (kVar.f8644f) {
                                d0Var.b();
                            }
                        }
                    }
                    d0Var.a(e);
                    v1 d = nVar.d();
                    if (!d.equals((v1) d0Var.e)) {
                        d0Var.c(d);
                        kVar.f8642b.f8651n.a(16, d).b();
                    }
                } else {
                    kVar.e = true;
                    if (kVar.f8644f) {
                        d0Var.b();
                    }
                }
                long e6 = kVar.e();
                this.X = e6;
                long j13 = e6 - f1Var.f8581o;
                long j14 = this.J.f8846r;
                ArrayList arrayList = this.B;
                if (!arrayList.isEmpty() && !this.J.f8833b.a()) {
                    if (this.Z) {
                        this.Z = false;
                    }
                    u1 u1Var2 = this.J;
                    u1Var2.f8832a.b(u1Var2.f8833b.f16424a);
                    int min = Math.min(this.Y, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.Y = min;
                }
                u1 u1Var3 = this.J;
                u1Var3.f8846r = j13;
                u1Var3.f8847s = SystemClock.elapsedRealtime();
            }
            this.J.f8844p = this.E.f8605j.d();
            u1 u1Var4 = this.J;
            long j15 = u1Var4.f8844p;
            f1 f1Var2 = this.E.f8605j;
            if (f1Var2 == null) {
                max = 0;
                j11 = -9223372036854775807L;
            } else {
                j11 = -9223372036854775807L;
                max = Math.max(0L, j15 - (this.X - f1Var2.f8581o));
            }
            u1Var4.f8845q = max;
            u1 u1Var5 = this.J;
            if (u1Var5.f8840l && u1Var5.e == 3 && a0(u1Var5.f8832a, u1Var5.f8833b)) {
                u1 u1Var6 = this.J;
                float f10 = 1.0f;
                if (u1Var6.f8842n.f8856a == 1.0f) {
                    i iVar = this.G;
                    long f11 = f(u1Var6.f8832a, u1Var6.f8833b.f16424a, u1Var6.f8846r);
                    long j16 = this.J.f8844p;
                    f1 f1Var3 = this.E.f8605j;
                    if (f1Var3 == null) {
                        max2 = 0;
                        c3 = 0;
                        c10 = 1;
                    } else {
                        c3 = 0;
                        c10 = 1;
                        max2 = Math.max(0L, j16 - (this.X - f1Var3.f8581o));
                    }
                    if (iVar.f8614c != j11) {
                        long j17 = f11 - max2;
                        if (iVar.f8621m == j11) {
                            iVar.f8621m = j17;
                            iVar.f8622n = 0L;
                        } else {
                            long max3 = Math.max(j17, (((float) j17) * 9.999871E-4f) + (((float) j12) * 0.999f));
                            iVar.f8621m = max3;
                            long abs = Math.abs(j17 - max3);
                            iVar.f8622n = (9.999871E-4f * ((float) abs)) + (0.999f * ((float) iVar.f8622n));
                        }
                        if (iVar.f8620l != j11 && SystemClock.elapsedRealtime() - iVar.f8620l < 1000) {
                            f10 = iVar.f8619k;
                        } else {
                            iVar.f8620l = SystemClock.elapsedRealtime();
                            long j18 = (iVar.f8622n * 3) + iVar.f8621m;
                            if (iVar.h > j18) {
                                float G = (float) h5.d0.G(1000L);
                                long j19 = ((iVar.f8619k - 1.0f) * G) + ((iVar.f8617i - 1.0f) * G);
                                long j20 = iVar.e;
                                long j21 = iVar.h - j19;
                                long[] jArr = new long[3];
                                jArr[c3] = j18;
                                jArr[c10] = j20;
                                jArr[2] = j21;
                                long j22 = jArr[c3];
                                for (int i10 = 1; i10 < 3; i10++) {
                                    long j23 = jArr[i10];
                                    if (j23 > j22) {
                                        j22 = j23;
                                    }
                                }
                                iVar.h = j22;
                            } else {
                                long i11 = h5.d0.i(f11 - (Math.max(0.0f, iVar.f8619k - 1.0f) / 1.0E-7f), iVar.h, j18);
                                iVar.h = i11;
                                long j24 = iVar.f8616g;
                                if (j24 != j11 && i11 > j24) {
                                    iVar.h = j24;
                                }
                            }
                            long j25 = f11 - iVar.h;
                            if (Math.abs(j25) < iVar.f8612a) {
                                iVar.f8619k = 1.0f;
                            } else {
                                iVar.f8619k = h5.d0.g((1.0E-7f * ((float) j25)) + 1.0f, iVar.f8618j, iVar.f8617i);
                            }
                            f10 = iVar.f8619k;
                        }
                    }
                    if (this.f8656y.d().f8856a != f10) {
                        v1 v1Var = new v1(f10, this.J.f8842n.f8857b);
                        this.f8651n.f6926a.removeMessages(16);
                        this.f8656y.c(v1Var);
                        m(this.J.f8842n, this.f8656y.d().f8856a, false, false);
                    }
                }
            }
        }
    }

    public final void h(o4.t tVar) {
        boolean z4;
        f1 f1Var = this.E.f8605j;
        if (f1Var != null && f1Var.f8570a == tVar) {
            long j10 = this.X;
            if (f1Var != null) {
                if (f1Var.f8578l == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (f1Var.d) {
                    f1Var.f8570a.f0(j10 - f1Var.f8581o);
                }
            }
            s();
        }
    }

    public final void h0(o2 o2Var, o4.v vVar, o2 o2Var2, o4.v vVar2, long j10, boolean z4) {
        Object obj;
        v1 v1Var;
        boolean a02 = a0(o2Var, vVar);
        Object obj2 = vVar.f16424a;
        if (!a02) {
            if (vVar.a()) {
                v1Var = v1.d;
            } else {
                v1Var = this.J.f8842n;
            }
            k kVar = this.f8656y;
            if (!kVar.d().equals(v1Var)) {
                this.f8651n.f6926a.removeMessages(16);
                kVar.c(v1Var);
                m(this.J.f8842n, v1Var.f8856a, false, false);
                return;
            }
            return;
        }
        m2 m2Var = this.f8654w;
        int i10 = o2Var.g(obj2, m2Var).f8704c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        x0 x0Var = n2Var.v;
        int i11 = h5.d0.f6937a;
        i iVar = this.G;
        iVar.getClass();
        iVar.f8614c = h5.d0.G(x0Var.f8880a);
        iVar.f8615f = h5.d0.G(x0Var.f8881b);
        iVar.f8616g = h5.d0.G(x0Var.f8882c);
        float f10 = x0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.f8618j = f10;
        float f11 = x0Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.f8617i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.f8614c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = f(o2Var, obj2, j10);
            iVar.a();
            return;
        }
        Object obj3 = n2Var.f8749a;
        if (!o2Var2.p()) {
            obj = o2Var2.m(o2Var2.g(vVar2.f16424a, m2Var).f8704c, n2Var, 0L).f8749a;
        } else {
            obj = null;
        }
        if (h5.d0.a(obj, obj3) && !z4) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    @Override
    public final boolean handleMessage(Message message) {
        f1 f1Var;
        f1 f1Var2;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    w();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    S(message.arg2, 1, z4, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((j0) message.obj);
                    break;
                case 4:
                    T((v1) message.obj);
                    break;
                case 5:
                    this.I = (h2) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    l((o4.t) message.obj);
                    break;
                case 9:
                    h((o4.t) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    U(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    V(z10);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    O(z11, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    c2 c2Var = (c2) message.obj;
                    c2Var.getClass();
                    L(c2Var);
                    break;
                case 15:
                    M((c2) message.obj);
                    break;
                case 16:
                    v1 v1Var = (v1) message.obj;
                    m(v1Var, v1Var.f8856a, true, false);
                    break;
                case 17:
                    P((h0) message.obj);
                    break;
                case 18:
                    a((h0) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.a.v(message.obj);
                    v();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (o4.q0) message.obj);
                    break;
                case 21:
                    W((o4.q0) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    R(z12);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Q(z13);
                    break;
                case 25:
                    B();
                    I(true);
                    break;
                case 26:
                    B();
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (g5.n e) {
            i(e, e.f6396a);
        } catch (n e6) {
            e = e6;
            int i11 = e.f8706c;
            h1 h1Var = this.E;
            if (i11 == 1 && (f1Var2 = h1Var.f8604i) != null) {
                e = e.a(f1Var2.f8573f.f8585a);
            }
            if (e.f8709r && this.f8646a0 == null) {
                h5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f8646a0 = e;
                h5.a0 a0Var = this.f8651n;
                h5.z a2 = a0Var.a(25, e);
                Handler handler = a0Var.f6926a;
                Message message2 = a2.f7007a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.f8646a0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f8646a0;
                }
                h5.a.p("ExoPlayerImplInternal", "Playback error", e);
                if (e.f8706c == 1 && h1Var.h != h1Var.f8604i) {
                    while (true) {
                        f1Var = h1Var.h;
                        if (f1Var == h1Var.f8604i) {
                            break;
                        }
                        h1Var.a();
                    }
                    f1Var.getClass();
                    g1 g1Var = f1Var.f8573f;
                    o4.v vVar = g1Var.f8585a;
                    long j10 = g1Var.f8586b;
                    this.J = o(vVar, j10, g1Var.f8587c, j10, true, 0);
                }
                c0(true, false);
                this.J = this.J.e(e);
            }
        } catch (r1 e10) {
            boolean z14 = e10.f8810a;
            int i12 = e10.f8811b;
            if (i12 == 1) {
                if (z14) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else if (i12 == 4) {
                if (z14) {
                    i10 = 3002;
                } else {
                    i10 = 3004;
                }
            }
            i(e10, i10);
        } catch (RuntimeException e11) {
            n nVar2 = new n(2, e11, ((e11 instanceof IllegalStateException) || (e11 instanceof IllegalArgumentException)) ? 1004 : 1004);
            h5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            c0(true, false);
            this.J = this.J.e(nVar2);
        } catch (o3.h e12) {
            i(e12, e12.f16263a);
        } catch (o4.b e13) {
            i(e13, 1002);
        } catch (IOException e14) {
            i(e14, 2000);
        }
        t();
        return true;
    }

    public final void i(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        f1 f1Var = this.E.h;
        if (f1Var != null) {
            nVar = nVar.a(f1Var.f8573f.f8585a);
        }
        h5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        c0(false, false);
        this.J = this.J.e(nVar);
    }

    public final synchronized void i0(gg.f fVar, long j10) {
        this.C.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z4 = false;
        while (!((Boolean) fVar.get()).booleanValue() && j10 > 0) {
            try {
                this.C.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.C.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final void j(boolean z4) {
        o4.v vVar;
        long d;
        f1 f1Var = this.E.f8605j;
        if (f1Var == null) {
            vVar = this.J.f8833b;
        } else {
            vVar = f1Var.f8573f.f8585a;
        }
        boolean equals = this.J.f8839k.equals(vVar);
        if (!equals) {
            this.J = this.J.b(vVar);
        }
        u1 u1Var = this.J;
        if (f1Var == null) {
            d = u1Var.f8846r;
        } else {
            d = f1Var.d();
        }
        u1Var.f8844p = d;
        u1 u1Var2 = this.J;
        long j10 = u1Var2.f8844p;
        f1 f1Var2 = this.E.f8605j;
        long j11 = 0;
        if (f1Var2 != null) {
            j11 = Math.max(0L, j10 - (this.X - f1Var2.f8581o));
        }
        u1Var2.f8845q = j11;
        if ((!equals || z4) && f1Var != null && f1Var.d) {
            f0(f1Var.f8580n);
        }
    }

    public final void k(j3.o2 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.k(j3.o2, boolean):void");
    }

    public final void l(o4.t tVar) {
        h1 h1Var = this.E;
        f1 f1Var = h1Var.f8605j;
        if (f1Var != null && f1Var.f8570a == tVar) {
            float f10 = this.f8656y.d().f8856a;
            o2 o2Var = this.J.f8832a;
            f1Var.d = true;
            f1Var.f8579m = f1Var.f8570a.V();
            f5.x g10 = f1Var.g(f10, o2Var);
            g1 g1Var = f1Var.f8573f;
            long j10 = g1Var.f8586b;
            long j11 = g1Var.e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a2 = f1Var.a(g10, j10, false, new boolean[f1Var.f8575i.length]);
            long j12 = f1Var.f8581o;
            g1 g1Var2 = f1Var.f8573f;
            f1Var.f8581o = (g1Var2.f8586b - a2) + j12;
            f1Var.f8573f = g1Var2.b(a2);
            f0(f1Var.f8580n);
            if (f1Var == h1Var.h) {
                E(f1Var.f8573f.f8586b);
                e(new boolean[this.f8645a.length]);
                u1 u1Var = this.J;
                o4.v vVar = u1Var.f8833b;
                long j13 = f1Var.f8573f.f8586b;
                this.J = o(vVar, j13, u1Var.f8834c, j13, false, 5);
            }
            s();
        }
    }

    public final void m(v1 v1Var, float f10, boolean z4, boolean z10) {
        int i10;
        if (z4) {
            if (z10) {
                this.K.a(1);
            }
            this.J = this.J.f(v1Var);
        }
        float f11 = v1Var.f8856a;
        f1 f1Var = this.E.h;
        while (true) {
            i10 = 0;
            if (f1Var == null) {
                break;
            }
            f5.c[] cVarArr = f1Var.f8580n.f6002c;
            int length = cVarArr.length;
            while (i10 < length) {
                f5.c cVar = cVarArr[i10];
                if (cVar != null) {
                    cVar.s(f11);
                }
                i10++;
            }
            f1Var = f1Var.f8578l;
        }
        e[] eVarArr = this.f8645a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.w(f10, v1Var.f8856a);
            }
            i10++;
        }
    }

    @Override
    public final void n(o4.t tVar) {
        this.f8651n.a(8, tVar).b();
    }

    public final u1 o(o4.v vVar, long j10, long j11, long j12, boolean z4, int i10) {
        boolean z10;
        long max;
        boolean z11;
        s8.i0 i0Var;
        if (!this.Z && j10 == this.J.f8846r && vVar.equals(this.J.f8833b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.Z = z10;
        D();
        u1 u1Var = this.J;
        o4.t0 t0Var = u1Var.h;
        f5.x xVar = u1Var.f8837i;
        List list = u1Var.f8838j;
        if (this.F.f8800k) {
            f1 f1Var = this.E.h;
            if (f1Var == null) {
                t0Var = o4.t0.d;
            } else {
                t0Var = f1Var.f8579m;
            }
            if (f1Var == null) {
                xVar = this.e;
            } else {
                xVar = f1Var.f8580n;
            }
            f5.c[] cVarArr = xVar.f6002c;
            ?? wVar = new com.google.android.gms.common.api.internal.w();
            boolean z12 = false;
            for (f5.c cVar : cVarArr) {
                if (cVar != null) {
                    e4.c cVar2 = cVar.e(0).f8741s;
                    if (cVar2 == null) {
                        wVar.b(new e4.c(new e4.b[0]));
                    } else {
                        wVar.b(cVar2);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                i0Var = wVar.i();
            } else {
                s8.t tVar = s8.v.f44157b;
                i0Var = s8.i0.e;
            }
            list = i0Var;
            if (f1Var != null) {
                g1 g1Var = f1Var.f8573f;
                if (g1Var.f8587c != j11) {
                    f1Var.f8573f = g1Var.a(j11);
                }
            }
        } else if (!vVar.equals(u1Var.f8833b)) {
            t0Var = o4.t0.d;
            xVar = this.e;
            list = s8.i0.e;
        }
        o4.t0 t0Var2 = t0Var;
        f5.x xVar2 = xVar;
        List list2 = list;
        if (z4) {
            ye.f fVar = this.K;
            if (fVar.d && fVar.e != 5) {
                if (i10 == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h5.a.f(z11);
            } else {
                fVar.f47170b = true;
                fVar.d = true;
                fVar.e = i10;
            }
        }
        u1 u1Var2 = this.J;
        long j13 = u1Var2.f8844p;
        f1 f1Var2 = this.E.f8605j;
        if (f1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.X - f1Var2.f8581o));
        }
        return u1Var2.c(vVar, j10, j11, j12, max, t0Var2, xVar2, list2);
    }

    public final boolean p() {
        long l10;
        f1 f1Var = this.E.f8605j;
        if (f1Var != null) {
            if (!f1Var.d) {
                l10 = 0;
            } else {
                l10 = f1Var.f8570a.l();
            }
            if (l10 == Long.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean r() {
        f1 f1Var = this.E.h;
        long j10 = f1Var.f8573f.e;
        if (f1Var.d) {
            if (j10 == -9223372036854775807L || this.J.f8846r < j10 || !Y()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s() {
        long l10;
        long max;
        boolean c3;
        boolean z4 = false;
        if (!p()) {
            c3 = false;
        } else {
            f1 f1Var = this.E.f8605j;
            if (!f1Var.d) {
                l10 = 0;
            } else {
                l10 = f1Var.f8570a.l();
            }
            f1 f1Var2 = this.E.f8605j;
            if (f1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, l10 - (this.X - f1Var2.f8581o));
            }
            f1 f1Var3 = this.E.h;
            c3 = this.f8650f.c(max, this.f8656y.d().f8856a);
            if (!c3 && max < 500000 && this.f8655x > 0) {
                this.E.h.f8570a.B(this.J.f8846r);
                c3 = this.f8650f.c(max, this.f8656y.d().f8856a);
            }
        }
        this.P = c3;
        if (c3) {
            f1 f1Var4 = this.E.f8605j;
            long j10 = this.X;
            if (f1Var4.f8578l == null) {
                z4 = true;
            }
            h5.a.i(z4);
            f1Var4.f8570a.C(j10 - f1Var4.f8581o);
        }
        e0();
    }

    public final void t() {
        boolean z4;
        ye.f fVar = this.K;
        u1 u1Var = this.J;
        boolean z10 = fVar.f47170b;
        if (((u1) fVar.h) != u1Var) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z11 = z10 | z4;
        fVar.f47170b = z11;
        fVar.h = u1Var;
        if (z11) {
            f0 f0Var = this.D.f8829a;
            f0Var.f8551i.c(new gf.c(17, f0Var, fVar));
            this.K = new ye.f(this.J);
        }
    }

    public final void u() {
        k(this.F.b(), true);
    }

    public final void v() {
        this.K.a(1);
        throw null;
    }

    public final void w() {
        int i10;
        this.K.a(1);
        C(false, false, false, true);
        this.f8650f.b(false);
        if (this.J.f8832a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        X(i10);
        g5.s sVar = (g5.s) this.h;
        sVar.getClass();
        q1 q1Var = this.F;
        ArrayList arrayList = q1Var.f8794b;
        h5.a.i(!q1Var.f8800k);
        q1Var.f8801l = sVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            p1 p1Var = (p1) arrayList.get(i11);
            q1Var.e(p1Var);
            q1Var.f8797g.add(p1Var);
        }
        q1Var.f8800k = true;
        this.f8651n.d(2);
    }

    public final synchronized boolean x() {
        if (!this.L && this.f8653s.getThread().isAlive()) {
            this.f8651n.d(7);
            i0(new gg.f(this, 14), this.H);
            return this.L;
        }
        return true;
    }

    public final void y() {
        C(true, false, true, false);
        z();
        this.f8650f.b(true);
        X(1);
        HandlerThread handlerThread = this.f8652r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.L = true;
            notifyAll();
        }
    }

    public final void z() {
        boolean z4;
        for (int i10 = 0; i10 < this.f8645a.length; i10++) {
            e eVar = this.f8649c[i10];
            synchronized (eVar.f8488a) {
                eVar.f8497y = null;
            }
            e eVar2 = this.f8645a[i10];
            if (eVar2.h == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            eVar2.n();
        }
    }
}
