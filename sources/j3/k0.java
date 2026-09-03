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
    public xe.g K;
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
    public final e[] f8627a;
    public n f8628a0;
    public final Set f8629b;
    public final e[] f8631c;
    public final f5.t d;
    public final f5.x e;
    public final j f8632f;
    public final g5.f h;
    public final h5.a0 f8633n;
    public final HandlerThread f8634r;
    public final Looper f8635s;
    public final n2 v;
    public final m2 f8636w;
    public final long f8637x;
    public final k f8638y;
    public boolean M = false;
    public long f8630b0 = -9223372036854775807L;

    public k0(e[] eVarArr, f5.t tVar, f5.x xVar, j jVar, g5.f fVar, int i10, boolean z4, k3.f fVar2, h2 h2Var, i iVar, long j10, Looper looper, h5.y yVar, u uVar, k3.k kVar) {
        this.D = uVar;
        this.f8627a = eVarArr;
        this.d = tVar;
        this.e = xVar;
        this.f8632f = jVar;
        this.h = fVar;
        this.Q = i10;
        this.R = z4;
        this.I = h2Var;
        this.G = iVar;
        this.H = j10;
        this.C = yVar;
        this.f8637x = jVar.f8615g;
        jVar.getClass();
        u1 i11 = u1.i(xVar);
        this.J = i11;
        this.K = new xe.g(i11);
        this.f8631c = new e[eVarArr.length];
        f5.p pVar = (f5.p) tVar;
        pVar.getClass();
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            e eVar = eVarArr[i12];
            eVar.e = i12;
            eVar.f8473f = kVar;
            this.f8631c[i12] = eVar;
            synchronized (eVar.f8470a) {
                eVar.f8479y = pVar;
            }
        }
        this.f8638y = new k(this, yVar);
        this.B = new ArrayList();
        this.f8629b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new n2();
        this.f8636w = new m2();
        tVar.f5951a = this;
        tVar.f5952b = fVar;
        this.Z = true;
        h5.a0 a2 = yVar.a(looper, null);
        this.E = new h1(fVar2, a2);
        this.F = new q1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f8634r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f8635s = looper2;
        this.f8633n = yVar.a(looper2, this);
    }

    public static Pair F(o2 o2Var, j0 j0Var, boolean z4, int i10, boolean z10, n2 n2Var, m2 m2Var) {
        o2 o2Var2;
        Object G;
        o2 o2Var3 = j0Var.f8617a;
        if (!o2Var.p()) {
            if (o2Var3.p()) {
                o2Var2 = o2Var;
            } else {
                o2Var2 = o2Var3;
            }
            try {
                Pair i11 = o2Var2.i(n2Var, m2Var, j0Var.f8618b, j0Var.f8619c);
                if (!o2Var.equals(o2Var2)) {
                    if (o2Var.b(i11.first) != -1) {
                        if (o2Var2.g(i11.first, m2Var).f8687f && o2Var2.m(m2Var.f8686c, n2Var, 0L).B == o2Var2.b(i11.first)) {
                            return o2Var.i(n2Var, m2Var, o2Var.g(i11.first, m2Var).f8686c, j0Var.f8619c);
                        }
                    } else if (z4 && (G = G(n2Var, m2Var, i10, z10, i11.first, o2Var2, o2Var)) != null) {
                        return o2Var.i(n2Var, m2Var, o2Var.g(G, m2Var).f8686c, -9223372036854775807L);
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

    public static Object G(n2 n2Var, m2 m2Var, int i10, boolean z4, Object obj, o2 o2Var, o2 o2Var2) {
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

    public static void M(e eVar, long j10) {
        eVar.f8477w = true;
        if (eVar instanceof v4.l) {
            v4.l lVar = (v4.l) eVar;
            h5.a.i(lVar.f8477w);
            lVar.P = j10;
        }
    }

    public static void b(c2 c2Var) {
        try {
            synchronized (c2Var) {
                synchronized (c2Var) {
                }
                c2Var.f8434a.b(c2Var.d, c2Var.e);
                return;
            }
            c2Var.f8434a.b(c2Var.d, c2Var.e);
            return;
        } finally {
            c2Var.b(true);
        }
    }

    public static boolean p(e eVar) {
        if (eVar.h != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        int i10;
        float f10 = this.f8638y.d().f8838a;
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = h1Var.f8586i;
        boolean z4 = true;
        for (f1 f1Var3 = f1Var; f1Var3 != null && f1Var3.d; f1Var3 = f1Var3.f8560l) {
            f5.x g10 = f1Var3.g(f10, this.J.f8814a);
            f5.x xVar = f1Var3.f8562n;
            f5.c[] cVarArr = g10.f5991c;
            boolean z10 = false;
            if (xVar != null && xVar.f5991c.length == cVarArr.length) {
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
                boolean[] zArr = new boolean[this.f8627a.length];
                long a2 = f1Var4.a(g10, this.J.f8828r, l10, zArr);
                u1 u1Var = this.J;
                if (u1Var.e != 4 && a2 != u1Var.f8828r) {
                    z10 = true;
                }
                u1 u1Var2 = this.J;
                i10 = 4;
                this.J = n(u1Var2.f8815b, a2, u1Var2.f8816c, u1Var2.d, z10, 5);
                if (z10) {
                    D(a2);
                }
                boolean[] zArr2 = new boolean[this.f8627a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f8627a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean p10 = p(eVar);
                    zArr2[i12] = p10;
                    o4.l0 l0Var = f1Var4.f8554c[i12];
                    if (p10) {
                        if (l0Var != eVar.f8474n) {
                            c(eVar);
                        } else if (zArr[i12]) {
                            long j10 = this.X;
                            eVar.f8477w = false;
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
                    f1Var3.a(g10, Math.max(f1Var3.f8555f.f8568b, this.X - f1Var3.f8563o), false, new boolean[f1Var3.f8557i.length]);
                }
            }
            j(true);
            if (this.J.e != i10) {
                r();
                e0();
                this.f8633n.d(2);
                return;
            }
            return;
        }
    }

    public final void B(boolean r32, boolean r33, boolean r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        boolean z4;
        f1 f1Var = this.E.h;
        if (f1Var != null && f1Var.f8555f.h && this.M) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N = z4;
    }

    public final void D(long j10) {
        h1 h1Var;
        long j11;
        e[] eVarArr;
        f5.c[] cVarArr;
        f1 f1Var = this.E.h;
        if (f1Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = f1Var.f8563o;
        }
        long j12 = j10 + j11;
        this.X = j12;
        this.f8638y.f8623a.b(j12);
        for (e eVar : this.f8627a) {
            if (p(eVar)) {
                long j13 = this.X;
                eVar.f8477w = false;
                eVar.v = j13;
                eVar.m(j13, false);
            }
        }
        for (f1 f1Var2 = h1Var.h; f1Var2 != null; f1Var2 = f1Var2.f8560l) {
            for (f5.c cVar : f1Var2.f8562n.f5991c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
    }

    public final void E(o2 o2Var, o2 o2Var2) {
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

    @Override
    public final void E1(o4.t tVar) {
        this.f8633n.a(8, tVar).b();
    }

    public final void H(boolean z4) {
        o4.v vVar = this.E.h.f8555f.f8567a;
        long J = J(vVar, this.J.f8828r, true, false);
        if (J != this.J.f8828r) {
            u1 u1Var = this.J;
            this.J = n(vVar, J, u1Var.f8816c, u1Var.d, z4, 5);
        }
    }

    public final void I(j3.j0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.I(j3.j0):void");
    }

    public final long J(o4.v vVar, long j10, boolean z4, boolean z10) {
        b0();
        this.O = false;
        if (z10 || this.J.e == 3) {
            W(2);
        }
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = f1Var;
        while (f1Var2 != null && !vVar.equals(f1Var2.f8555f.f8567a)) {
            f1Var2 = f1Var2.f8560l;
        }
        if (z4 || f1Var != f1Var2 || (f1Var2 != null && f1Var2.f8563o + j10 < 0)) {
            e[] eVarArr = this.f8627a;
            for (e eVar : eVarArr) {
                c(eVar);
            }
            if (f1Var2 != null) {
                while (h1Var.h != f1Var2) {
                    h1Var.a();
                }
                h1Var.l(f1Var2);
                f1Var2.f8563o = 1000000000000L;
                e(new boolean[eVarArr.length]);
            }
        }
        if (f1Var2 != null) {
            ?? r92 = f1Var2.f8552a;
            h1Var.l(f1Var2);
            if (!f1Var2.d) {
                f1Var2.f8555f = f1Var2.f8555f.b(j10);
            } else if (f1Var2.e) {
                j10 = r92.j0(j10);
                r92.m0(j10 - this.f8637x);
            }
            D(j10);
            r();
        } else {
            h1Var.b();
            D(j10);
        }
        j(false);
        this.f8633n.d(2);
        return j10;
    }

    public final void K(c2 c2Var) {
        Looper looper = c2Var.f8437f;
        Looper looper2 = this.f8635s;
        h5.a0 a0Var = this.f8633n;
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

    public final void L(c2 c2Var) {
        Looper looper = c2Var.f8437f;
        if (!looper.getThread().isAlive()) {
            h5.a.K("TAG", "Trying to send message on a dead thread.");
            c2Var.b(false);
            return;
        }
        this.C.a(looper, null).c(new e3.h(this, c2Var));
    }

    public final void N(boolean z4, AtomicBoolean atomicBoolean) {
        e[] eVarArr;
        if (this.S != z4) {
            this.S = z4;
            if (!z4) {
                for (e eVar : this.f8627a) {
                    if (!p(eVar) && this.f8629b.remove(eVar)) {
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

    public final void O(h0 h0Var) {
        this.K.a(1);
        int i10 = h0Var.f8580c;
        o4.q0 q0Var = h0Var.f8579b;
        ArrayList arrayList = h0Var.f8578a;
        if (i10 != -1) {
            this.W = new j0(new e2(arrayList, q0Var), h0Var.f8580c, h0Var.d);
        }
        q1 q1Var = this.F;
        ArrayList arrayList2 = q1Var.f8776b;
        q1Var.g(0, arrayList2.size());
        k(q1Var.a(arrayList2.size(), arrayList, q0Var), false);
    }

    public final void P(boolean z4) {
        if (z4 != this.U) {
            this.U = z4;
            if (!z4 && this.J.f8825o) {
                this.f8633n.d(2);
            }
        }
    }

    public final void Q(boolean z4) {
        this.M = z4;
        C();
        if (this.N) {
            h1 h1Var = this.E;
            if (h1Var.f8586i != h1Var.h) {
                H(true);
                j(false);
            }
        }
    }

    public final void R(int i10, int i11, boolean z4, boolean z10) {
        f5.c[] cVarArr;
        this.K.a(z10 ? 1 : 0);
        xe.g gVar = this.K;
        gVar.f46997b = true;
        gVar.f46999f = true;
        gVar.f47000g = i11;
        this.J = this.J.d(i10, z4);
        this.O = false;
        for (f1 f1Var = this.E.h; f1Var != null; f1Var = f1Var.f8560l) {
            for (f5.c cVar : f1Var.f8562n.f5991c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i12 = this.J.e;
        h5.a0 a0Var = this.f8633n;
        if (i12 == 3) {
            Z();
            a0Var.d(2);
        } else if (i12 == 2) {
            a0Var.d(2);
        }
    }

    public final void S(v1 v1Var) {
        this.f8633n.f6913a.removeMessages(16);
        k kVar = this.f8638y;
        kVar.a(v1Var);
        v1 d = kVar.d();
        m(d, d.f8838a, true, true);
    }

    public final void T(int i10) {
        this.Q = i10;
        o2 o2Var = this.J.f8814a;
        h1 h1Var = this.E;
        h1Var.f8584f = i10;
        if (!h1Var.o(o2Var)) {
            H(true);
        }
        j(false);
    }

    public final void U(boolean z4) {
        this.R = z4;
        o2 o2Var = this.J.f8814a;
        h1 h1Var = this.E;
        h1Var.f8585g = z4;
        if (!h1Var.o(o2Var)) {
            H(true);
        }
        j(false);
    }

    public final void V(o4.q0 q0Var) {
        this.K.a(1);
        q1 q1Var = this.F;
        int size = q1Var.f8776b.size();
        if (q0Var.getLength() != size) {
            q0Var = q0Var.g().e(size);
        }
        q1Var.f8781j = q0Var;
        k(q1Var.b(), false);
    }

    public final void W(int i10) {
        u1 u1Var = this.J;
        if (u1Var.e != i10) {
            if (i10 != 2) {
                this.f8630b0 = -9223372036854775807L;
            }
            this.J = u1Var.g(i10);
        }
    }

    public final boolean X() {
        u1 u1Var = this.J;
        if (u1Var.f8822l && u1Var.f8823m == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void X1(o4.n0 n0Var) {
        this.f8633n.a(9, (o4.t) n0Var).b();
    }

    public final boolean Y(o2 o2Var, o4.v vVar) {
        if (!vVar.a() && !o2Var.p()) {
            int i10 = o2Var.g(vVar.f16406a, this.f8636w).f8686c;
            n2 n2Var = this.v;
            o2Var.n(i10, n2Var);
            if (n2Var.a() && n2Var.f8736r && n2Var.f8734f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Z() {
        e[] eVarArr;
        boolean z4;
        this.O = false;
        k kVar = this.f8638y;
        kVar.f8626f = true;
        kVar.f8623a.c();
        for (e eVar : this.f8627a) {
            if (p(eVar)) {
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

    public final void a(h0 h0Var, int i10) {
        this.K.a(1);
        q1 q1Var = this.F;
        if (i10 == -1) {
            i10 = q1Var.f8776b.size();
        }
        k(q1Var.a(i10, h0Var.f8578a, h0Var.f8579b), false);
    }

    public final void a0(boolean z4, boolean z10) {
        boolean z11;
        if (!z4 && this.S) {
            z11 = false;
        } else {
            z11 = true;
        }
        B(z11, false, true, false);
        this.K.a(z10 ? 1 : 0);
        this.f8632f.b(true);
        W(1);
    }

    public final void b0() {
        e[] eVarArr;
        int i10;
        boolean z4;
        k kVar = this.f8638y;
        kVar.f8626f = false;
        c2.e0 e0Var = kVar.f8623a;
        if (e0Var.f1960a) {
            e0Var.b(e0Var.e());
            e0Var.f1960a = false;
        }
        for (e eVar : this.f8627a) {
            if (p(eVar) && (i10 = eVar.h) == 2) {
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

    public final void c(e eVar) {
        boolean z4;
        boolean z10;
        if (!p(eVar)) {
            return;
        }
        k kVar = this.f8638y;
        if (eVar == kVar.f8625c) {
            kVar.d = null;
            kVar.f8625c = null;
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
        eVar.f8472c.m();
        eVar.h = 0;
        eVar.f8474n = null;
        eVar.f8475r = null;
        eVar.f8477w = false;
        eVar.k();
        this.V--;
    }

    public final void c0() {
        boolean z4;
        f1 f1Var = this.E.f8587j;
        if (!this.P && (f1Var == null || !f1Var.f8552a.b())) {
            z4 = false;
        } else {
            z4 = true;
        }
        u1 u1Var = this.J;
        if (z4 != u1Var.f8818g) {
            this.J = new u1(u1Var.f8814a, u1Var.f8815b, u1Var.f8816c, u1Var.d, u1Var.e, u1Var.f8817f, z4, u1Var.h, u1Var.f8819i, u1Var.f8820j, u1Var.f8821k, u1Var.f8822l, u1Var.f8823m, u1Var.f8824n, u1Var.f8826p, u1Var.f8827q, u1Var.f8828r, u1Var.f8829s, u1Var.f8825o);
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.d():void");
    }

    public final void d0(f5.x xVar) {
        o2 o2Var = this.J.f8814a;
        f5.c[] cVarArr = xVar.f5991c;
        j jVar = this.f8632f;
        int i10 = jVar.f8614f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.f8627a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (cVarArr[i11] != null) {
                        switch (eVarArr[i11].f8471b) {
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
        jVar.f8611a.a(i10);
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
        f1 f1Var = h1Var.f8586i;
        f5.x xVar2 = f1Var.f8562n;
        int i12 = 0;
        while (true) {
            eVarArr = this.f8627a;
            int length = eVarArr.length;
            set = this.f8629b;
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
                if (!p(eVar)) {
                    f1 f1Var2 = h1Var.f8586i;
                    if (f1Var2 == h1Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f5.x xVar3 = f1Var2.f8562n;
                    g2 g2Var = xVar3.f5990b[i13];
                    f5.c cVar = xVar3.f5991c[i13];
                    if (cVar != null) {
                        i11 = cVar.p();
                    } else {
                        i11 = 0;
                    }
                    n0[] n0VarArr = new n0[i11];
                    for (int i14 = 0; i14 < i11; i14++) {
                        n0VarArr[i14] = cVar.e(i14);
                    }
                    if (X() && this.J.e == 3) {
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
                    o4.l0 l0Var = f1Var2.f8554c[i13];
                    xVar = xVar2;
                    long j10 = this.X;
                    long e = f1Var2.e();
                    i10 = i13;
                    eVarArr2 = eVarArr;
                    long j11 = f1Var2.f8563o;
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
                    eVar.f8477w = false;
                    eVar.v = j10;
                    eVar.m(j10, z11);
                    eVar.b(11, new g0(this));
                    k kVar = this.f8638y;
                    kVar.getClass();
                    h5.n f10 = eVar.f();
                    if (f10 != null && f10 != (nVar = kVar.d)) {
                        if (nVar == null) {
                            kVar.d = f10;
                            kVar.f8625c = eVar;
                            f10.a((v1) kVar.f8623a.e);
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
        f1Var.f8556g = true;
    }

    public final void e0() {
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
                j10 = f1Var.f8552a.a1();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                D(j10);
                if (j10 != this.J.f8828r) {
                    u1 u1Var = this.J;
                    this.J = n(u1Var.f8815b, j10, u1Var.f8816c, j10, true, 5);
                }
            } else {
                k kVar = this.f8638y;
                if (f1Var != this.E.f8586i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c2.e0 e0Var = kVar.f8623a;
                e eVar = kVar.f8625c;
                if (eVar != null && !eVar.i() && (kVar.f8625c.j() || (!z4 && !kVar.f8625c.h()))) {
                    h5.n nVar = kVar.d;
                    nVar.getClass();
                    long e = nVar.e();
                    if (kVar.e) {
                        if (e < e0Var.e()) {
                            if (e0Var.f1960a) {
                                e0Var.b(e0Var.e());
                                e0Var.f1960a = false;
                            }
                        } else {
                            kVar.e = false;
                            if (kVar.f8626f) {
                                e0Var.c();
                            }
                        }
                    }
                    e0Var.b(e);
                    v1 d = nVar.d();
                    if (!d.equals((v1) e0Var.e)) {
                        e0Var.a(d);
                        kVar.f8624b.f8633n.a(16, d).b();
                    }
                } else {
                    kVar.e = true;
                    if (kVar.f8626f) {
                        e0Var.c();
                    }
                }
                long e6 = kVar.e();
                this.X = e6;
                long j13 = e6 - f1Var.f8563o;
                long j14 = this.J.f8828r;
                ArrayList arrayList = this.B;
                if (!arrayList.isEmpty() && !this.J.f8815b.a()) {
                    if (this.Z) {
                        this.Z = false;
                    }
                    u1 u1Var2 = this.J;
                    u1Var2.f8814a.b(u1Var2.f8815b.f16406a);
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
                u1Var3.f8828r = j13;
                u1Var3.f8829s = SystemClock.elapsedRealtime();
            }
            this.J.f8826p = this.E.f8587j.d();
            u1 u1Var4 = this.J;
            long j15 = u1Var4.f8826p;
            f1 f1Var2 = this.E.f8587j;
            if (f1Var2 == null) {
                max = 0;
                j11 = -9223372036854775807L;
            } else {
                j11 = -9223372036854775807L;
                max = Math.max(0L, j15 - (this.X - f1Var2.f8563o));
            }
            u1Var4.f8827q = max;
            u1 u1Var5 = this.J;
            if (u1Var5.f8822l && u1Var5.e == 3 && Y(u1Var5.f8814a, u1Var5.f8815b)) {
                u1 u1Var6 = this.J;
                float f10 = 1.0f;
                if (u1Var6.f8824n.f8838a == 1.0f) {
                    i iVar = this.G;
                    long f11 = f(u1Var6.f8814a, u1Var6.f8815b.f16406a, u1Var6.f8828r);
                    long j16 = this.J.f8826p;
                    f1 f1Var3 = this.E.f8587j;
                    if (f1Var3 == null) {
                        max2 = 0;
                        c3 = 0;
                        c10 = 1;
                    } else {
                        c3 = 0;
                        c10 = 1;
                        max2 = Math.max(0L, j16 - (this.X - f1Var3.f8563o));
                    }
                    if (iVar.f8596c != j11) {
                        long j17 = f11 - max2;
                        if (iVar.f8603m == j11) {
                            iVar.f8603m = j17;
                            iVar.f8604n = 0L;
                        } else {
                            long max3 = Math.max(j17, (((float) j17) * 9.999871E-4f) + (((float) j12) * 0.999f));
                            iVar.f8603m = max3;
                            long abs = Math.abs(j17 - max3);
                            iVar.f8604n = (9.999871E-4f * ((float) abs)) + (0.999f * ((float) iVar.f8604n));
                        }
                        if (iVar.f8602l != j11 && SystemClock.elapsedRealtime() - iVar.f8602l < 1000) {
                            f10 = iVar.f8601k;
                        } else {
                            iVar.f8602l = SystemClock.elapsedRealtime();
                            long j18 = (iVar.f8604n * 3) + iVar.f8603m;
                            if (iVar.h > j18) {
                                float G = (float) h5.d0.G(1000L);
                                long j19 = ((iVar.f8601k - 1.0f) * G) + ((iVar.f8599i - 1.0f) * G);
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
                                long i11 = h5.d0.i(f11 - (Math.max(0.0f, iVar.f8601k - 1.0f) / 1.0E-7f), iVar.h, j18);
                                iVar.h = i11;
                                long j24 = iVar.f8598g;
                                if (j24 != j11 && i11 > j24) {
                                    iVar.h = j24;
                                }
                            }
                            long j25 = f11 - iVar.h;
                            if (Math.abs(j25) < iVar.f8594a) {
                                iVar.f8601k = 1.0f;
                            } else {
                                iVar.f8601k = h5.d0.g((1.0E-7f * ((float) j25)) + 1.0f, iVar.f8600j, iVar.f8599i);
                            }
                            f10 = iVar.f8601k;
                        }
                    }
                    if (this.f8638y.d().f8838a != f10) {
                        v1 v1Var = new v1(f10, this.J.f8824n.f8839b);
                        this.f8633n.f6913a.removeMessages(16);
                        this.f8638y.a(v1Var);
                        m(this.J.f8824n, this.f8638y.d().f8838a, false, false);
                    }
                }
            }
        }
    }

    public final long f(o2 o2Var, Object obj, long j10) {
        m2 m2Var = this.f8636w;
        int i10 = o2Var.g(obj, m2Var).f8686c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        if (n2Var.f8734f == -9223372036854775807L || !n2Var.a() || !n2Var.f8736r) {
            return -9223372036854775807L;
        }
        return h5.d0.G(h5.d0.u(n2Var.h) - n2Var.f8734f) - (j10 + m2Var.e);
    }

    public final void f0(o2 o2Var, o4.v vVar, o2 o2Var2, o4.v vVar2, long j10, boolean z4) {
        Object obj;
        v1 v1Var;
        boolean Y = Y(o2Var, vVar);
        Object obj2 = vVar.f16406a;
        if (!Y) {
            if (vVar.a()) {
                v1Var = v1.d;
            } else {
                v1Var = this.J.f8824n;
            }
            k kVar = this.f8638y;
            if (!kVar.d().equals(v1Var)) {
                this.f8633n.f6913a.removeMessages(16);
                kVar.a(v1Var);
                m(this.J.f8824n, v1Var.f8838a, false, false);
                return;
            }
            return;
        }
        m2 m2Var = this.f8636w;
        int i10 = o2Var.g(obj2, m2Var).f8686c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        x0 x0Var = n2Var.v;
        int i11 = h5.d0.f6924a;
        i iVar = this.G;
        iVar.getClass();
        iVar.f8596c = h5.d0.G(x0Var.f8862a);
        iVar.f8597f = h5.d0.G(x0Var.f8863b);
        iVar.f8598g = h5.d0.G(x0Var.f8864c);
        float f10 = x0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.f8600j = f10;
        float f11 = x0Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.f8599i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.f8596c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = f(o2Var, obj2, j10);
            iVar.a();
            return;
        }
        Object obj3 = n2Var.f8731a;
        if (!o2Var2.p()) {
            obj = o2Var2.m(o2Var2.g(vVar2.f16406a, m2Var).f8686c, n2Var, 0L).f8731a;
        } else {
            obj = null;
        }
        if (h5.d0.a(obj, obj3) && !z4) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    public final Pair g(o2 o2Var) {
        long j10 = 0;
        if (o2Var.p()) {
            return Pair.create(u1.f8813t, 0L);
        }
        int a2 = o2Var.a(this.R);
        Pair i10 = o2Var.i(this.v, this.f8636w, a2, -9223372036854775807L);
        o4.v n10 = this.E.n(o2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (n10.a()) {
            Object obj = n10.f16406a;
            m2 m2Var = this.f8636w;
            o2Var.g(obj, m2Var);
            if (n10.f16408c == m2Var.f(n10.f16407b)) {
                j10 = m2Var.h.f41071b;
            }
            longValue = j10;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    public final synchronized void g0(gg.f fVar, long j10) {
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

    public final void h(o4.t tVar) {
        boolean z4;
        f1 f1Var = this.E.f8587j;
        if (f1Var != null && f1Var.f8552a == tVar) {
            long j10 = this.X;
            if (f1Var != null) {
                if (f1Var.f8560l == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (f1Var.d) {
                    f1Var.f8552a.k2(j10 - f1Var.f8563o);
                }
            }
            r();
        }
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
                    v();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    R(message.arg2, 1, z4, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    I((j0) message.obj);
                    break;
                case 4:
                    S((v1) message.obj);
                    break;
                case 5:
                    this.I = (h2) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    l((o4.t) message.obj);
                    break;
                case 9:
                    h((o4.t) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    U(z10);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    N(z11, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    c2 c2Var = (c2) message.obj;
                    c2Var.getClass();
                    K(c2Var);
                    break;
                case 15:
                    L((c2) message.obj);
                    break;
                case 16:
                    v1 v1Var = (v1) message.obj;
                    m(v1Var, v1Var.f8838a, true, false);
                    break;
                case 17:
                    O((h0) message.obj);
                    break;
                case 18:
                    a((h0) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.a.v(message.obj);
                    u();
                    throw null;
                case 20:
                    z(message.arg1, message.arg2, (o4.q0) message.obj);
                    break;
                case 21:
                    V((o4.q0) message.obj);
                    break;
                case 22:
                    t();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Q(z12);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    P(z13);
                    break;
                case 25:
                    A();
                    H(true);
                    break;
                case 26:
                    A();
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (g5.n e) {
            i(e, e.f6396a);
        } catch (n e6) {
            e = e6;
            int i11 = e.f8688c;
            h1 h1Var = this.E;
            if (i11 == 1 && (f1Var2 = h1Var.f8586i) != null) {
                e = e.a(f1Var2.f8555f.f8567a);
            }
            if (e.f8691r && this.f8628a0 == null) {
                h5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f8628a0 = e;
                h5.a0 a0Var = this.f8633n;
                h5.z a2 = a0Var.a(25, e);
                Handler handler = a0Var.f6913a;
                Message message2 = a2.f6994a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.f8628a0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f8628a0;
                }
                h5.a.p("ExoPlayerImplInternal", "Playback error", e);
                if (e.f8688c == 1 && h1Var.h != h1Var.f8586i) {
                    while (true) {
                        f1Var = h1Var.h;
                        if (f1Var == h1Var.f8586i) {
                            break;
                        }
                        h1Var.a();
                    }
                    f1Var.getClass();
                    g1 g1Var = f1Var.f8555f;
                    o4.v vVar = g1Var.f8567a;
                    long j10 = g1Var.f8568b;
                    this.J = n(vVar, j10, g1Var.f8569c, j10, true, 0);
                }
                a0(true, false);
                this.J = this.J.e(e);
            }
        } catch (r1 e10) {
            boolean z14 = e10.f8792a;
            int i12 = e10.f8793b;
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
            a0(true, false);
            this.J = this.J.e(nVar2);
        } catch (o3.i e12) {
            i(e12, e12.f16248a);
        } catch (o4.b e13) {
            i(e13, 1002);
        } catch (IOException e14) {
            i(e14, 2000);
        }
        s();
        return true;
    }

    public final void i(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        f1 f1Var = this.E.h;
        if (f1Var != null) {
            nVar = nVar.a(f1Var.f8555f.f8567a);
        }
        h5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        a0(false, false);
        this.J = this.J.e(nVar);
    }

    public final void j(boolean z4) {
        o4.v vVar;
        long d;
        f1 f1Var = this.E.f8587j;
        if (f1Var == null) {
            vVar = this.J.f8815b;
        } else {
            vVar = f1Var.f8555f.f8567a;
        }
        boolean equals = this.J.f8821k.equals(vVar);
        if (!equals) {
            this.J = this.J.b(vVar);
        }
        u1 u1Var = this.J;
        if (f1Var == null) {
            d = u1Var.f8828r;
        } else {
            d = f1Var.d();
        }
        u1Var.f8826p = d;
        u1 u1Var2 = this.J;
        long j10 = u1Var2.f8826p;
        f1 f1Var2 = this.E.f8587j;
        long j11 = 0;
        if (f1Var2 != null) {
            j11 = Math.max(0L, j10 - (this.X - f1Var2.f8563o));
        }
        u1Var2.f8827q = j11;
        if ((!equals || z4) && f1Var != null && f1Var.d) {
            d0(f1Var.f8562n);
        }
    }

    public final void k(j3.o2 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.k(j3.o2, boolean):void");
    }

    public final void l(o4.t tVar) {
        h1 h1Var = this.E;
        f1 f1Var = h1Var.f8587j;
        if (f1Var != null && f1Var.f8552a == tVar) {
            float f10 = this.f8638y.d().f8838a;
            o2 o2Var = this.J.f8814a;
            f1Var.d = true;
            f1Var.f8561m = f1Var.f8552a.o1();
            f5.x g10 = f1Var.g(f10, o2Var);
            g1 g1Var = f1Var.f8555f;
            long j10 = g1Var.f8568b;
            long j11 = g1Var.e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a2 = f1Var.a(g10, j10, false, new boolean[f1Var.f8557i.length]);
            long j12 = f1Var.f8563o;
            g1 g1Var2 = f1Var.f8555f;
            f1Var.f8563o = (g1Var2.f8568b - a2) + j12;
            f1Var.f8555f = g1Var2.b(a2);
            d0(f1Var.f8562n);
            if (f1Var == h1Var.h) {
                D(f1Var.f8555f.f8568b);
                e(new boolean[this.f8627a.length]);
                u1 u1Var = this.J;
                o4.v vVar = u1Var.f8815b;
                long j13 = f1Var.f8555f.f8568b;
                this.J = n(vVar, j13, u1Var.f8816c, j13, false, 5);
            }
            r();
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
        float f11 = v1Var.f8838a;
        f1 f1Var = this.E.h;
        while (true) {
            i10 = 0;
            if (f1Var == null) {
                break;
            }
            f5.c[] cVarArr = f1Var.f8562n.f5991c;
            int length = cVarArr.length;
            while (i10 < length) {
                f5.c cVar = cVarArr[i10];
                if (cVar != null) {
                    cVar.s(f11);
                }
                i10++;
            }
            f1Var = f1Var.f8560l;
        }
        e[] eVarArr = this.f8627a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.w(f10, v1Var.f8838a);
            }
            i10++;
        }
    }

    public final u1 n(o4.v vVar, long j10, long j11, long j12, boolean z4, int i10) {
        boolean z10;
        long max;
        boolean z11;
        s8.i0 i0Var;
        if (!this.Z && j10 == this.J.f8828r && vVar.equals(this.J.f8815b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.Z = z10;
        C();
        u1 u1Var = this.J;
        o4.t0 t0Var = u1Var.h;
        f5.x xVar = u1Var.f8819i;
        List list = u1Var.f8820j;
        if (this.F.f8782k) {
            f1 f1Var = this.E.h;
            if (f1Var == null) {
                t0Var = o4.t0.d;
            } else {
                t0Var = f1Var.f8561m;
            }
            if (f1Var == null) {
                xVar = this.e;
            } else {
                xVar = f1Var.f8562n;
            }
            f5.c[] cVarArr = xVar.f5991c;
            ?? wVar = new com.google.android.gms.common.api.internal.w();
            boolean z12 = false;
            for (f5.c cVar : cVarArr) {
                if (cVar != null) {
                    e4.c cVar2 = cVar.e(0).f8723s;
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
                s8.t tVar = s8.v.f44222b;
                i0Var = s8.i0.e;
            }
            list = i0Var;
            if (f1Var != null) {
                g1 g1Var = f1Var.f8555f;
                if (g1Var.f8569c != j11) {
                    f1Var.f8555f = g1Var.a(j11);
                }
            }
        } else if (!vVar.equals(u1Var.f8815b)) {
            t0Var = o4.t0.d;
            xVar = this.e;
            list = s8.i0.e;
        }
        o4.t0 t0Var2 = t0Var;
        f5.x xVar2 = xVar;
        List list2 = list;
        if (z4) {
            xe.g gVar = this.K;
            if (gVar.d && gVar.e != 5) {
                if (i10 == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h5.a.f(z11);
            } else {
                gVar.f46997b = true;
                gVar.d = true;
                gVar.e = i10;
            }
        }
        u1 u1Var2 = this.J;
        long j13 = u1Var2.f8826p;
        f1 f1Var2 = this.E.f8587j;
        if (f1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.X - f1Var2.f8563o));
        }
        return u1Var2.c(vVar, j10, j11, j12, max, t0Var2, xVar2, list2);
    }

    public final boolean o() {
        long H;
        f1 f1Var = this.E.f8587j;
        if (f1Var != null) {
            if (!f1Var.d) {
                H = 0;
            } else {
                H = f1Var.f8552a.H();
            }
            if (H == Long.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean q() {
        f1 f1Var = this.E.h;
        long j10 = f1Var.f8555f.e;
        if (f1Var.d) {
            if (j10 == -9223372036854775807L || this.J.f8828r < j10 || !X()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        long H;
        long max;
        boolean c3;
        boolean z4 = false;
        if (!o()) {
            c3 = false;
        } else {
            f1 f1Var = this.E.f8587j;
            if (!f1Var.d) {
                H = 0;
            } else {
                H = f1Var.f8552a.H();
            }
            f1 f1Var2 = this.E.f8587j;
            if (f1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, H - (this.X - f1Var2.f8563o));
            }
            f1 f1Var3 = this.E.h;
            c3 = this.f8632f.c(max, this.f8638y.d().f8838a);
            if (!c3 && max < 500000 && this.f8637x > 0) {
                this.E.h.f8552a.m0(this.J.f8828r);
                c3 = this.f8632f.c(max, this.f8638y.d().f8838a);
            }
        }
        this.P = c3;
        if (c3) {
            f1 f1Var4 = this.E.f8587j;
            long j10 = this.X;
            if (f1Var4.f8560l == null) {
                z4 = true;
            }
            h5.a.i(z4);
            f1Var4.f8552a.n0(j10 - f1Var4.f8563o);
        }
        c0();
    }

    public final void s() {
        boolean z4;
        xe.g gVar = this.K;
        u1 u1Var = this.J;
        boolean z10 = gVar.f46997b;
        if (((u1) gVar.h) != u1Var) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z11 = z10 | z4;
        gVar.f46997b = z11;
        gVar.h = u1Var;
        if (z11) {
            f0 f0Var = this.D.f8811a;
            f0Var.f8533i.c(new ff.c(17, f0Var, gVar));
            this.K = new xe.g(this.J);
        }
    }

    public final void t() {
        k(this.F.b(), true);
    }

    public final void u() {
        this.K.a(1);
        throw null;
    }

    public final void v() {
        int i10;
        this.K.a(1);
        B(false, false, false, true);
        this.f8632f.b(false);
        if (this.J.f8814a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        W(i10);
        g5.s sVar = (g5.s) this.h;
        sVar.getClass();
        q1 q1Var = this.F;
        ArrayList arrayList = q1Var.f8776b;
        h5.a.i(!q1Var.f8782k);
        q1Var.f8783l = sVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            p1 p1Var = (p1) arrayList.get(i11);
            q1Var.e(p1Var);
            q1Var.f8779g.add(p1Var);
        }
        q1Var.f8782k = true;
        this.f8633n.d(2);
    }

    public final synchronized boolean w() {
        if (!this.L && this.f8635s.getThread().isAlive()) {
            this.f8633n.d(7);
            g0(new gg.f(this, 14), this.H);
            return this.L;
        }
        return true;
    }

    public final void x() {
        B(true, false, true, false);
        y();
        this.f8632f.b(true);
        W(1);
        HandlerThread handlerThread = this.f8634r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.L = true;
            notifyAll();
        }
    }

    public final void y() {
        boolean z4;
        for (int i10 = 0; i10 < this.f8627a.length; i10++) {
            e eVar = this.f8631c[i10];
            synchronized (eVar.f8470a) {
                eVar.f8479y = null;
            }
            e eVar2 = this.f8627a[i10];
            if (eVar2.h == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            eVar2.n();
        }
    }

    public final void z(int i10, int i11, o4.q0 q0Var) {
        boolean z4 = true;
        this.K.a(1);
        q1 q1Var = this.F;
        q1Var.getClass();
        h5.a.f((i10 < 0 || i10 > i11 || i11 > q1Var.f8776b.size()) ? false : false);
        q1Var.f8781j = q0Var;
        q1Var.g(i10, i11);
        k(q1Var.b(), false);
    }
}
