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
    public final e[] f9222a;
    public n f9223a0;
    public final Set f9224b;
    public final e[] f9226c;
    public final f5.t d;
    public final f5.y f9227e;
    public final j f9228f;
    public final g5.f h;
    public final h5.a0 f9229n;
    public final HandlerThread f9230r;
    public final Looper f9231s;
    public final n2 v;
    public final m2 f9232w;
    public final long f9233x;
    public final k f9234y;
    public boolean M = false;
    public long f9225b0 = -9223372036854775807L;

    public k0(e[] eVarArr, f5.t tVar, f5.y yVar, j jVar, g5.f fVar, int i10, boolean z4, k3.f fVar2, h2 h2Var, i iVar, long j10, Looper looper, h5.y yVar2, u uVar, k3.k kVar) {
        this.D = uVar;
        this.f9222a = eVarArr;
        this.d = tVar;
        this.f9227e = yVar;
        this.f9228f = jVar;
        this.h = fVar;
        this.Q = i10;
        this.R = z4;
        this.I = h2Var;
        this.G = iVar;
        this.H = j10;
        this.C = yVar2;
        this.f9233x = jVar.f9208g;
        jVar.getClass();
        u1 i11 = u1.i(yVar);
        this.J = i11;
        this.K = new ye.f(i11);
        this.f9226c = new e[eVarArr.length];
        f5.p pVar = (f5.p) tVar;
        pVar.getClass();
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            e eVar = eVarArr[i12];
            eVar.f9054e = i12;
            eVar.f9055f = kVar;
            this.f9226c[i12] = eVar;
            synchronized (eVar.f9051a) {
                eVar.f9061y = pVar;
            }
        }
        this.f9234y = new k(this, yVar2);
        this.B = new ArrayList();
        this.f9224b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new n2();
        this.f9232w = new m2();
        tVar.f6066a = this;
        tVar.f6067b = fVar;
        this.Z = true;
        h5.a0 a2 = yVar2.a(looper, null);
        this.E = new h1(fVar2, a2);
        this.F = new q1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9230r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f9231s = looper2;
        this.f9229n = yVar2.a(looper2, this);
    }

    public static Pair H(o2 o2Var, j0 j0Var, boolean z4, int i10, boolean z10, n2 n2Var, m2 m2Var) {
        o2 o2Var2;
        Object I;
        o2 o2Var3 = j0Var.f9210a;
        if (!o2Var.p()) {
            if (o2Var3.p()) {
                o2Var2 = o2Var;
            } else {
                o2Var2 = o2Var3;
            }
            try {
                Pair i11 = o2Var2.i(n2Var, m2Var, j0Var.f9211b, j0Var.f9212c);
                if (!o2Var.equals(o2Var2)) {
                    if (o2Var.b(i11.first) != -1) {
                        if (o2Var2.g(i11.first, m2Var).f9287f && o2Var2.m(m2Var.f9285c, n2Var, 0L).B == o2Var2.b(i11.first)) {
                            return o2Var.i(n2Var, m2Var, o2Var.g(i11.first, m2Var).f9285c, j0Var.f9212c);
                        }
                    } else if (z4 && (I = I(n2Var, m2Var, i10, z10, i11.first, o2Var2, o2Var)) != null) {
                        return o2Var.i(n2Var, m2Var, o2Var.g(I, m2Var).f9285c, -9223372036854775807L);
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

    public static Object I(n2 n2Var, m2 m2Var, int i10, boolean z4, Object obj, o2 o2Var, o2 o2Var2) {
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

    public static void O(e eVar, long j10) {
        eVar.f9059w = true;
        if (eVar instanceof v4.l) {
            v4.l lVar = (v4.l) eVar;
            h5.a.i(lVar.f9059w);
            lVar.P = j10;
        }
    }

    public static void c(c2 c2Var) {
        try {
            synchronized (c2Var) {
                synchronized (c2Var) {
                }
                c2Var.f9012a.b(c2Var.d, c2Var.f9015e);
                return;
            }
            c2Var.f9012a.b(c2Var.d, c2Var.f9015e);
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

    public final void A() {
        boolean z4;
        for (int i10 = 0; i10 < this.f9222a.length; i10++) {
            e eVar = this.f9226c[i10];
            synchronized (eVar.f9051a) {
                eVar.f9061y = null;
            }
            e eVar2 = this.f9222a[i10];
            if (eVar2.h == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            eVar2.n();
        }
    }

    public final void B(int i10, int i11, o4.q0 q0Var) {
        boolean z4 = true;
        this.K.a(1);
        q1 q1Var = this.F;
        q1Var.getClass();
        h5.a.f((i10 < 0 || i10 > i11 || i11 > q1Var.f9384b.size()) ? false : false);
        q1Var.f9390j = q0Var;
        q1Var.g(i10, i11);
        l(q1Var.b(), false);
    }

    public final void C() {
        int i10;
        float f10 = this.f9234y.d().f9452a;
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = h1Var.f9175i;
        boolean z4 = true;
        for (f1 f1Var3 = f1Var; f1Var3 != null && f1Var3.d; f1Var3 = f1Var3.f9146l) {
            f5.y g10 = f1Var3.g(f10, this.J.f9426a);
            f5.y yVar = f1Var3.f9148n;
            f5.c[] cVarArr = g10.f6109c;
            boolean z10 = false;
            if (yVar != null && yVar.f6109c.length == cVarArr.length) {
                for (int i11 = 0; i11 < cVarArr.length; i11++) {
                    if (g10.a(yVar, i11)) {
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
                boolean[] zArr = new boolean[this.f9222a.length];
                long a2 = f1Var4.a(g10, this.J.f9441r, l10, zArr);
                u1 u1Var = this.J;
                if (u1Var.f9429e != 4 && a2 != u1Var.f9441r) {
                    z10 = true;
                }
                u1 u1Var2 = this.J;
                i10 = 4;
                this.J = o(u1Var2.f9427b, a2, u1Var2.f9428c, u1Var2.d, z10, 5);
                if (z10) {
                    F(a2);
                }
                boolean[] zArr2 = new boolean[this.f9222a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f9222a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean q10 = q(eVar);
                    zArr2[i12] = q10;
                    o4.l0 l0Var = f1Var4.f9139c[i12];
                    if (q10) {
                        if (l0Var != eVar.f9056n) {
                            d(eVar);
                        } else if (zArr[i12]) {
                            long j10 = this.X;
                            eVar.f9059w = false;
                            eVar.v = j10;
                            eVar.m(j10, false);
                        }
                    }
                    i12++;
                }
                f(zArr2);
            } else {
                i10 = 4;
                this.E.l(f1Var3);
                if (f1Var3.d) {
                    f1Var3.a(g10, Math.max(f1Var3.f9141f.f9154b, this.X - f1Var3.f9149o), false, new boolean[f1Var3.f9143i.length]);
                }
            }
            k(true);
            if (this.J.f9429e != i10) {
                t();
                g0();
                this.f9229n.d(2);
                return;
            }
            return;
        }
    }

    public final void D(boolean r32, boolean r33, boolean r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.D(boolean, boolean, boolean, boolean):void");
    }

    public final void E() {
        boolean z4;
        f1 f1Var = this.E.h;
        if (f1Var != null && f1Var.f9141f.h && this.M) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N = z4;
    }

    public final void F(long j10) {
        h1 h1Var;
        long j11;
        e[] eVarArr;
        f5.c[] cVarArr;
        f1 f1Var = this.E.h;
        if (f1Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = f1Var.f9149o;
        }
        long j12 = j10 + j11;
        this.X = j12;
        this.f9234y.f9217a.a(j12);
        for (e eVar : this.f9222a) {
            if (q(eVar)) {
                long j13 = this.X;
                eVar.f9059w = false;
                eVar.v = j13;
                eVar.m(j13, false);
            }
        }
        for (f1 f1Var2 = h1Var.h; f1Var2 != null; f1Var2 = f1Var2.f9146l) {
            for (f5.c cVar : f1Var2.f9148n.f6109c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
    }

    public final void G(o2 o2Var, o2 o2Var2) {
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

    public final void J(boolean z4) {
        o4.v vVar = this.E.h.f9141f.f9153a;
        long L = L(vVar, this.J.f9441r, true, false);
        if (L != this.J.f9441r) {
            u1 u1Var = this.J;
            this.J = o(vVar, L, u1Var.f9428c, u1Var.d, z4, 5);
        }
    }

    public final void K(j3.j0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.K(j3.j0):void");
    }

    public final long L(o4.v vVar, long j10, boolean z4, boolean z10) {
        d0();
        this.O = false;
        if (z10 || this.J.f9429e == 3) {
            Y(2);
        }
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = f1Var;
        while (f1Var2 != null && !vVar.equals(f1Var2.f9141f.f9153a)) {
            f1Var2 = f1Var2.f9146l;
        }
        if (z4 || f1Var != f1Var2 || (f1Var2 != null && f1Var2.f9149o + j10 < 0)) {
            e[] eVarArr = this.f9222a;
            for (e eVar : eVarArr) {
                d(eVar);
            }
            if (f1Var2 != null) {
                while (h1Var.h != f1Var2) {
                    h1Var.a();
                }
                h1Var.l(f1Var2);
                f1Var2.f9149o = 1000000000000L;
                f(new boolean[eVarArr.length]);
            }
        }
        if (f1Var2 != null) {
            ?? r92 = f1Var2.f9137a;
            h1Var.l(f1Var2);
            if (!f1Var2.d) {
                f1Var2.f9141f = f1Var2.f9141f.b(j10);
            } else if (f1Var2.f9140e) {
                j10 = r92.j(j10);
                r92.k(j10 - this.f9233x);
            }
            F(j10);
            t();
        } else {
            h1Var.b();
            F(j10);
        }
        k(false);
        this.f9229n.d(2);
        return j10;
    }

    public final void M(c2 c2Var) {
        Looper looper = c2Var.f9016f;
        Looper looper2 = this.f9231s;
        h5.a0 a0Var = this.f9229n;
        if (looper == looper2) {
            c(c2Var);
            int i10 = this.J.f9429e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            a0Var.d(2);
            return;
        }
        a0Var.a(15, c2Var).b();
    }

    public final void N(c2 c2Var) {
        Looper looper = c2Var.f9016f;
        if (!looper.getThread().isAlive()) {
            h5.a.K("TAG", "Trying to send message on a dead thread.");
            c2Var.b(false);
            return;
        }
        this.C.a(looper, null).c(new eh.m(this, c2Var));
    }

    public final void P(boolean z4, AtomicBoolean atomicBoolean) {
        e[] eVarArr;
        if (this.S != z4) {
            this.S = z4;
            if (!z4) {
                for (e eVar : this.f9222a) {
                    if (!q(eVar) && this.f9224b.remove(eVar)) {
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

    public final void Q(h0 h0Var) {
        this.K.a(1);
        int i10 = h0Var.f9168c;
        o4.q0 q0Var = h0Var.f9167b;
        ArrayList arrayList = h0Var.f9166a;
        if (i10 != -1) {
            this.W = new j0(new e2(arrayList, q0Var), h0Var.f9168c, h0Var.d);
        }
        q1 q1Var = this.F;
        ArrayList arrayList2 = q1Var.f9384b;
        q1Var.g(0, arrayList2.size());
        l(q1Var.a(arrayList2.size(), arrayList, q0Var), false);
    }

    public final void R(boolean z4) {
        if (z4 != this.U) {
            this.U = z4;
            if (!z4 && this.J.f9438o) {
                this.f9229n.d(2);
            }
        }
    }

    public final void S(boolean z4) {
        this.M = z4;
        E();
        if (this.N) {
            h1 h1Var = this.E;
            if (h1Var.f9175i != h1Var.h) {
                J(true);
                k(false);
            }
        }
    }

    public final void T(int i10, int i11, boolean z4, boolean z10) {
        f5.c[] cVarArr;
        this.K.a(z10 ? 1 : 0);
        ye.f fVar = this.K;
        fVar.f50867b = true;
        fVar.f50870f = true;
        fVar.f50871g = i11;
        this.J = this.J.d(i10, z4);
        this.O = false;
        for (f1 f1Var = this.E.h; f1Var != null; f1Var = f1Var.f9146l) {
            for (f5.c cVar : f1Var.f9148n.f6109c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i12 = this.J.f9429e;
        h5.a0 a0Var = this.f9229n;
        if (i12 == 3) {
            b0();
            a0Var.d(2);
        } else if (i12 == 2) {
            a0Var.d(2);
        }
    }

    public final void U(v1 v1Var) {
        this.f9229n.f7226a.removeMessages(16);
        k kVar = this.f9234y;
        kVar.c(v1Var);
        v1 d = kVar.d();
        n(d, d.f9452a, true, true);
    }

    public final void V(int i10) {
        this.Q = i10;
        o2 o2Var = this.J.f9426a;
        h1 h1Var = this.E;
        h1Var.f9173f = i10;
        if (!h1Var.o(o2Var)) {
            J(true);
        }
        k(false);
    }

    public final void W(boolean z4) {
        this.R = z4;
        o2 o2Var = this.J.f9426a;
        h1 h1Var = this.E;
        h1Var.f9174g = z4;
        if (!h1Var.o(o2Var)) {
            J(true);
        }
        k(false);
    }

    public final void X(o4.q0 q0Var) {
        this.K.a(1);
        q1 q1Var = this.F;
        int size = q1Var.f9384b.size();
        if (q0Var.getLength() != size) {
            q0Var = q0Var.g().e(size);
        }
        q1Var.f9390j = q0Var;
        l(q1Var.b(), false);
    }

    public final void Y(int i10) {
        u1 u1Var = this.J;
        if (u1Var.f9429e != i10) {
            if (i10 != 2) {
                this.f9225b0 = -9223372036854775807L;
            }
            this.J = u1Var.g(i10);
        }
    }

    public final boolean Z() {
        u1 u1Var = this.J;
        if (u1Var.f9435l && u1Var.f9436m == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void a(o4.t tVar) {
        this.f9229n.a(8, tVar).b();
    }

    public final boolean a0(o2 o2Var, o4.v vVar) {
        if (!vVar.a() && !o2Var.p()) {
            int i10 = o2Var.g(vVar.f16579a, this.f9232w).f9285c;
            n2 n2Var = this.v;
            o2Var.n(i10, n2Var);
            if (n2Var.a() && n2Var.f9340r && n2Var.f9338f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(h0 h0Var, int i10) {
        this.K.a(1);
        q1 q1Var = this.F;
        if (i10 == -1) {
            i10 = q1Var.f9384b.size();
        }
        l(q1Var.a(i10, h0Var.f9166a, h0Var.f9167b), false);
    }

    public final void b0() {
        e[] eVarArr;
        boolean z4;
        this.O = false;
        k kVar = this.f9234y;
        kVar.f9221f = true;
        kVar.f9217a.b();
        for (e eVar : this.f9222a) {
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

    public final void c0(boolean z4, boolean z10) {
        boolean z11;
        if (!z4 && this.S) {
            z11 = false;
        } else {
            z11 = true;
        }
        D(z11, false, true, false);
        this.K.a(z10 ? 1 : 0);
        this.f9228f.b(true);
        Y(1);
    }

    public final void d(e eVar) {
        boolean z4;
        boolean z10;
        if (!q(eVar)) {
            return;
        }
        k kVar = this.f9234y;
        if (eVar == kVar.f9219c) {
            kVar.d = null;
            kVar.f9219c = null;
            kVar.f9220e = true;
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
        eVar.f9053c.l();
        eVar.h = 0;
        eVar.f9056n = null;
        eVar.f9057r = null;
        eVar.f9059w = false;
        eVar.k();
        this.V--;
    }

    public final void d0() {
        e[] eVarArr;
        int i10;
        boolean z4;
        k kVar = this.f9234y;
        kVar.f9221f = false;
        c2.d0 d0Var = kVar.f9217a;
        if (d0Var.f2072a) {
            d0Var.a(d0Var.e());
            d0Var.f2072a = false;
        }
        for (e eVar : this.f9222a) {
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

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.e():void");
    }

    public final void e0() {
        boolean z4;
        f1 f1Var = this.E.f9176j;
        if (!this.P && (f1Var == null || !f1Var.f9137a.b())) {
            z4 = false;
        } else {
            z4 = true;
        }
        u1 u1Var = this.J;
        if (z4 != u1Var.f9431g) {
            this.J = new u1(u1Var.f9426a, u1Var.f9427b, u1Var.f9428c, u1Var.d, u1Var.f9429e, u1Var.f9430f, z4, u1Var.h, u1Var.f9432i, u1Var.f9433j, u1Var.f9434k, u1Var.f9435l, u1Var.f9436m, u1Var.f9437n, u1Var.f9439p, u1Var.f9440q, u1Var.f9441r, u1Var.f9442s, u1Var.f9438o);
        }
    }

    public final void f(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        f5.y yVar;
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
        f1 f1Var = h1Var.f9175i;
        f5.y yVar2 = f1Var.f9148n;
        int i12 = 0;
        while (true) {
            eVarArr = this.f9222a;
            int length = eVarArr.length;
            set = this.f9224b;
            if (i12 >= length) {
                break;
            }
            if (!yVar2.b(i12) && set.remove(eVarArr[i12])) {
                eVarArr[i12].v();
            }
            i12++;
        }
        int i13 = 0;
        while (i13 < eVarArr.length) {
            if (yVar2.b(i13)) {
                boolean z14 = zArr[i13];
                e eVar = eVarArr[i13];
                if (!q(eVar)) {
                    f1 f1Var2 = h1Var.f9175i;
                    if (f1Var2 == h1Var.h) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f5.y yVar3 = f1Var2.f9148n;
                    g2 g2Var = yVar3.f6108b[i13];
                    f5.c cVar = yVar3.f6109c[i13];
                    if (cVar != null) {
                        i11 = cVar.p();
                    } else {
                        i11 = 0;
                    }
                    n0[] n0VarArr = new n0[i11];
                    for (int i14 = 0; i14 < i11; i14++) {
                        n0VarArr[i14] = cVar.e(i14);
                    }
                    if (Z() && this.J.f9429e == 3) {
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
                    o4.l0 l0Var = f1Var2.f9139c[i13];
                    yVar = yVar2;
                    long j10 = this.X;
                    long e6 = f1Var2.e();
                    i10 = i13;
                    eVarArr2 = eVarArr;
                    long j11 = f1Var2.f9149o;
                    if (eVar.h == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h5.a.i(z12);
                    eVar.d = g2Var;
                    eVar.h = 1;
                    eVar.l(z11, z4);
                    eVar.u(n0VarArr, l0Var, e6, j11);
                    eVar.f9059w = false;
                    eVar.v = j10;
                    eVar.m(j10, z11);
                    eVar.b(11, new g0(this));
                    k kVar = this.f9234y;
                    kVar.getClass();
                    h5.n f10 = eVar.f();
                    if (f10 != null && f10 != (nVar = kVar.d)) {
                        if (nVar == null) {
                            kVar.d = f10;
                            kVar.f9219c = eVar;
                            f10.c((v1) kVar.f9217a.f2075e);
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
                    yVar2 = yVar;
                    eVarArr = eVarArr2;
                }
            }
            yVar = yVar2;
            i10 = i13;
            eVarArr2 = eVarArr;
            i13 = i10 + 1;
            yVar2 = yVar;
            eVarArr = eVarArr2;
        }
        f1Var.f9142g = true;
    }

    public final void f0(f5.y yVar) {
        o2 o2Var = this.J.f9426a;
        f5.c[] cVarArr = yVar.f6109c;
        j jVar = this.f9228f;
        int i10 = jVar.f9207f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.f9222a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (cVarArr[i11] != null) {
                        switch (eVarArr[i11].f9052b) {
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
        jVar.f9203a.a(i10);
    }

    public final long g(o2 o2Var, Object obj, long j10) {
        m2 m2Var = this.f9232w;
        int i10 = o2Var.g(obj, m2Var).f9285c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        if (n2Var.f9338f == -9223372036854775807L || !n2Var.a() || !n2Var.f9340r) {
            return -9223372036854775807L;
        }
        return h5.d0.G(h5.d0.u(n2Var.h) - n2Var.f9338f) - (j10 + m2Var.f9286e);
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
                j10 = f1Var.f9137a.n();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                F(j10);
                if (j10 != this.J.f9441r) {
                    u1 u1Var = this.J;
                    this.J = o(u1Var.f9427b, j10, u1Var.f9428c, j10, true, 5);
                }
            } else {
                k kVar = this.f9234y;
                if (f1Var != this.E.f9175i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c2.d0 d0Var = kVar.f9217a;
                e eVar = kVar.f9219c;
                if (eVar != null && !eVar.i() && (kVar.f9219c.j() || (!z4 && !kVar.f9219c.h()))) {
                    h5.n nVar = kVar.d;
                    nVar.getClass();
                    long e6 = nVar.e();
                    if (kVar.f9220e) {
                        if (e6 < d0Var.e()) {
                            if (d0Var.f2072a) {
                                d0Var.a(d0Var.e());
                                d0Var.f2072a = false;
                            }
                        } else {
                            kVar.f9220e = false;
                            if (kVar.f9221f) {
                                d0Var.b();
                            }
                        }
                    }
                    d0Var.a(e6);
                    v1 d = nVar.d();
                    if (!d.equals((v1) d0Var.f2075e)) {
                        d0Var.c(d);
                        kVar.f9218b.f9229n.a(16, d).b();
                    }
                } else {
                    kVar.f9220e = true;
                    if (kVar.f9221f) {
                        d0Var.b();
                    }
                }
                long e10 = kVar.e();
                this.X = e10;
                long j13 = e10 - f1Var.f9149o;
                long j14 = this.J.f9441r;
                ArrayList arrayList = this.B;
                if (!arrayList.isEmpty() && !this.J.f9427b.a()) {
                    if (this.Z) {
                        this.Z = false;
                    }
                    u1 u1Var2 = this.J;
                    u1Var2.f9426a.b(u1Var2.f9427b.f16579a);
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
                u1Var3.f9441r = j13;
                u1Var3.f9442s = SystemClock.elapsedRealtime();
            }
            this.J.f9439p = this.E.f9176j.d();
            u1 u1Var4 = this.J;
            long j15 = u1Var4.f9439p;
            f1 f1Var2 = this.E.f9176j;
            if (f1Var2 == null) {
                max = 0;
                j11 = -9223372036854775807L;
            } else {
                j11 = -9223372036854775807L;
                max = Math.max(0L, j15 - (this.X - f1Var2.f9149o));
            }
            u1Var4.f9440q = max;
            u1 u1Var5 = this.J;
            if (u1Var5.f9435l && u1Var5.f9429e == 3 && a0(u1Var5.f9426a, u1Var5.f9427b)) {
                u1 u1Var6 = this.J;
                float f10 = 1.0f;
                if (u1Var6.f9437n.f9452a == 1.0f) {
                    i iVar = this.G;
                    long g10 = g(u1Var6.f9426a, u1Var6.f9427b.f16579a, u1Var6.f9441r);
                    long j16 = this.J.f9439p;
                    f1 f1Var3 = this.E.f9176j;
                    if (f1Var3 == null) {
                        max2 = 0;
                        c3 = 0;
                        c10 = 1;
                    } else {
                        c3 = 0;
                        c10 = 1;
                        max2 = Math.max(0L, j16 - (this.X - f1Var3.f9149o));
                    }
                    if (iVar.f9186c != j11) {
                        long j17 = g10 - max2;
                        if (iVar.f9194m == j11) {
                            iVar.f9194m = j17;
                            iVar.f9195n = 0L;
                        } else {
                            long max3 = Math.max(j17, (((float) j17) * 9.999871E-4f) + (((float) j12) * 0.999f));
                            iVar.f9194m = max3;
                            long abs = Math.abs(j17 - max3);
                            iVar.f9195n = (9.999871E-4f * ((float) abs)) + (0.999f * ((float) iVar.f9195n));
                        }
                        if (iVar.f9193l != j11 && SystemClock.elapsedRealtime() - iVar.f9193l < 1000) {
                            f10 = iVar.f9192k;
                        } else {
                            iVar.f9193l = SystemClock.elapsedRealtime();
                            long j18 = (iVar.f9195n * 3) + iVar.f9194m;
                            if (iVar.h > j18) {
                                float G = (float) h5.d0.G(1000L);
                                long j19 = ((iVar.f9192k - 1.0f) * G) + ((iVar.f9190i - 1.0f) * G);
                                long j20 = iVar.f9187e;
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
                                long i11 = h5.d0.i(g10 - (Math.max(0.0f, iVar.f9192k - 1.0f) / 1.0E-7f), iVar.h, j18);
                                iVar.h = i11;
                                long j24 = iVar.f9189g;
                                if (j24 != j11 && i11 > j24) {
                                    iVar.h = j24;
                                }
                            }
                            long j25 = g10 - iVar.h;
                            if (Math.abs(j25) < iVar.f9184a) {
                                iVar.f9192k = 1.0f;
                            } else {
                                iVar.f9192k = h5.d0.g((1.0E-7f * ((float) j25)) + 1.0f, iVar.f9191j, iVar.f9190i);
                            }
                            f10 = iVar.f9192k;
                        }
                    }
                    if (this.f9234y.d().f9452a != f10) {
                        v1 v1Var = new v1(f10, this.J.f9437n.f9453b);
                        this.f9229n.f7226a.removeMessages(16);
                        this.f9234y.c(v1Var);
                        n(this.J.f9437n, this.f9234y.d().f9452a, false, false);
                    }
                }
            }
        }
    }

    public final Pair h(o2 o2Var) {
        long j10 = 0;
        if (o2Var.p()) {
            return Pair.create(u1.f9425t, 0L);
        }
        int a2 = o2Var.a(this.R);
        Pair i10 = o2Var.i(this.v, this.f9232w, a2, -9223372036854775807L);
        o4.v n10 = this.E.n(o2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (n10.a()) {
            Object obj = n10.f16579a;
            m2 m2Var = this.f9232w;
            o2Var.g(obj, m2Var);
            if (n10.f16581c == m2Var.f(n10.f16580b)) {
                j10 = m2Var.h.f44204b;
            }
            longValue = j10;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    public final void h0(o2 o2Var, o4.v vVar, o2 o2Var2, o4.v vVar2, long j10, boolean z4) {
        Object obj;
        v1 v1Var;
        boolean a02 = a0(o2Var, vVar);
        Object obj2 = vVar.f16579a;
        if (!a02) {
            if (vVar.a()) {
                v1Var = v1.d;
            } else {
                v1Var = this.J.f9437n;
            }
            k kVar = this.f9234y;
            if (!kVar.d().equals(v1Var)) {
                this.f9229n.f7226a.removeMessages(16);
                kVar.c(v1Var);
                n(this.J.f9437n, v1Var.f9452a, false, false);
                return;
            }
            return;
        }
        m2 m2Var = this.f9232w;
        int i10 = o2Var.g(obj2, m2Var).f9285c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        x0 x0Var = n2Var.v;
        int i11 = h5.d0.f7237a;
        i iVar = this.G;
        iVar.getClass();
        iVar.f9186c = h5.d0.G(x0Var.f9477a);
        iVar.f9188f = h5.d0.G(x0Var.f9478b);
        iVar.f9189g = h5.d0.G(x0Var.f9479c);
        float f10 = x0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.f9191j = f10;
        float f11 = x0Var.f9480e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.f9190i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.f9186c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = g(o2Var, obj2, j10);
            iVar.a();
            return;
        }
        Object obj3 = n2Var.f9334a;
        if (!o2Var2.p()) {
            obj = o2Var2.m(o2Var2.g(vVar2.f16579a, m2Var).f9285c, n2Var, 0L).f9334a;
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
                    x();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    T(message.arg2, 1, z4, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    K((j0) message.obj);
                    break;
                case 4:
                    U((v1) message.obj);
                    break;
                case 5:
                    this.I = (h2) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    m((o4.t) message.obj);
                    break;
                case 9:
                    i((o4.t) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    W(z10);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    P(z11, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    c2 c2Var = (c2) message.obj;
                    c2Var.getClass();
                    M(c2Var);
                    break;
                case 15:
                    N((c2) message.obj);
                    break;
                case 16:
                    v1 v1Var = (v1) message.obj;
                    n(v1Var, v1Var.f9452a, true, false);
                    break;
                case 17:
                    Q((h0) message.obj);
                    break;
                case 18:
                    b((h0) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.a.v(message.obj);
                    w();
                    throw null;
                case 20:
                    B(message.arg1, message.arg2, (o4.q0) message.obj);
                    break;
                case 21:
                    X((o4.q0) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    S(z12);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    R(z13);
                    break;
                case 25:
                    C();
                    J(true);
                    break;
                case 26:
                    C();
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (g5.n e6) {
            j(e6, e6.f6879a);
        } catch (n e10) {
            e = e10;
            int i11 = e.f9288c;
            h1 h1Var = this.E;
            if (i11 == 1 && (f1Var2 = h1Var.f9175i) != null) {
                e = e.a(f1Var2.f9141f.f9153a);
            }
            if (e.f9292r && this.f9223a0 == null) {
                h5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f9223a0 = e;
                h5.a0 a0Var = this.f9229n;
                h5.z a2 = a0Var.a(25, e);
                Handler handler = a0Var.f7226a;
                Message message2 = a2.f7315a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.f9223a0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f9223a0;
                }
                h5.a.p("ExoPlayerImplInternal", "Playback error", e);
                if (e.f9288c == 1 && h1Var.h != h1Var.f9175i) {
                    while (true) {
                        f1Var = h1Var.h;
                        if (f1Var == h1Var.f9175i) {
                            break;
                        }
                        h1Var.a();
                    }
                    f1Var.getClass();
                    g1 g1Var = f1Var.f9141f;
                    o4.v vVar = g1Var.f9153a;
                    long j10 = g1Var.f9154b;
                    this.J = o(vVar, j10, g1Var.f9155c, j10, true, 0);
                }
                c0(true, false);
                this.J = this.J.e(e);
            }
        } catch (r1 e11) {
            boolean z14 = e11.f9401a;
            int i12 = e11.f9402b;
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
            j(e11, i10);
        } catch (RuntimeException e12) {
            n nVar2 = new n(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            h5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            c0(true, false);
            this.J = this.J.e(nVar2);
        } catch (o3.h e13) {
            j(e13, e13.f16404a);
        } catch (o4.b e14) {
            j(e14, 1002);
        } catch (IOException e15) {
            j(e15, 2000);
        }
        u();
        return true;
    }

    public final void i(o4.t tVar) {
        boolean z4;
        f1 f1Var = this.E.f9176j;
        if (f1Var != null && f1Var.f9137a == tVar) {
            long j10 = this.X;
            if (f1Var != null) {
                if (f1Var.f9146l == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (f1Var.d) {
                    f1Var.f9137a.t(j10 - f1Var.f9149o);
                }
            }
            t();
        }
    }

    public final synchronized void i0(hg.f fVar, long j10) {
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

    public final void j(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        f1 f1Var = this.E.h;
        if (f1Var != null) {
            nVar = nVar.a(f1Var.f9141f.f9153a);
        }
        h5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        c0(false, false);
        this.J = this.J.e(nVar);
    }

    public final void k(boolean z4) {
        o4.v vVar;
        long d;
        f1 f1Var = this.E.f9176j;
        if (f1Var == null) {
            vVar = this.J.f9427b;
        } else {
            vVar = f1Var.f9141f.f9153a;
        }
        boolean equals = this.J.f9434k.equals(vVar);
        if (!equals) {
            this.J = this.J.b(vVar);
        }
        u1 u1Var = this.J;
        if (f1Var == null) {
            d = u1Var.f9441r;
        } else {
            d = f1Var.d();
        }
        u1Var.f9439p = d;
        u1 u1Var2 = this.J;
        long j10 = u1Var2.f9439p;
        f1 f1Var2 = this.E.f9176j;
        long j11 = 0;
        if (f1Var2 != null) {
            j11 = Math.max(0L, j10 - (this.X - f1Var2.f9149o));
        }
        u1Var2.f9440q = j11;
        if ((!equals || z4) && f1Var != null && f1Var.d) {
            f0(f1Var.f9148n);
        }
    }

    public final void l(j3.o2 r39, boolean r40) {
        throw new UnsupportedOperationException("Method not decompiled: j3.k0.l(j3.o2, boolean):void");
    }

    public final void m(o4.t tVar) {
        h1 h1Var = this.E;
        f1 f1Var = h1Var.f9176j;
        if (f1Var != null && f1Var.f9137a == tVar) {
            float f10 = this.f9234y.d().f9452a;
            o2 o2Var = this.J.f9426a;
            f1Var.d = true;
            f1Var.f9147m = f1Var.f9137a.o();
            f5.y g10 = f1Var.g(f10, o2Var);
            g1 g1Var = f1Var.f9141f;
            long j10 = g1Var.f9154b;
            long j11 = g1Var.f9156e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a2 = f1Var.a(g10, j10, false, new boolean[f1Var.f9143i.length]);
            long j12 = f1Var.f9149o;
            g1 g1Var2 = f1Var.f9141f;
            f1Var.f9149o = (g1Var2.f9154b - a2) + j12;
            f1Var.f9141f = g1Var2.b(a2);
            f0(f1Var.f9148n);
            if (f1Var == h1Var.h) {
                F(f1Var.f9141f.f9154b);
                f(new boolean[this.f9222a.length]);
                u1 u1Var = this.J;
                o4.v vVar = u1Var.f9427b;
                long j13 = f1Var.f9141f.f9154b;
                this.J = o(vVar, j13, u1Var.f9428c, j13, false, 5);
            }
            t();
        }
    }

    public final void n(v1 v1Var, float f10, boolean z4, boolean z10) {
        int i10;
        if (z4) {
            if (z10) {
                this.K.a(1);
            }
            this.J = this.J.f(v1Var);
        }
        float f11 = v1Var.f9452a;
        f1 f1Var = this.E.h;
        while (true) {
            i10 = 0;
            if (f1Var == null) {
                break;
            }
            f5.c[] cVarArr = f1Var.f9148n.f6109c;
            int length = cVarArr.length;
            while (i10 < length) {
                f5.c cVar = cVarArr[i10];
                if (cVar != null) {
                    cVar.s(f11);
                }
                i10++;
            }
            f1Var = f1Var.f9146l;
        }
        e[] eVarArr = this.f9222a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.w(f10, v1Var.f9452a);
            }
            i10++;
        }
    }

    public final u1 o(o4.v vVar, long j10, long j11, long j12, boolean z4, int i10) {
        boolean z10;
        long max;
        boolean z11;
        s8.i0 i0Var;
        if (!this.Z && j10 == this.J.f9441r && vVar.equals(this.J.f9427b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.Z = z10;
        E();
        u1 u1Var = this.J;
        o4.t0 t0Var = u1Var.h;
        f5.y yVar = u1Var.f9432i;
        List list = u1Var.f9433j;
        if (this.F.f9391k) {
            f1 f1Var = this.E.h;
            if (f1Var == null) {
                t0Var = o4.t0.d;
            } else {
                t0Var = f1Var.f9147m;
            }
            if (f1Var == null) {
                yVar = this.f9227e;
            } else {
                yVar = f1Var.f9148n;
            }
            f5.c[] cVarArr = yVar.f6109c;
            ?? wVar = new com.google.android.gms.common.api.internal.w();
            boolean z12 = false;
            for (f5.c cVar : cVarArr) {
                if (cVar != null) {
                    e4.c cVar2 = cVar.e(0).f9325s;
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
                s8.t tVar = s8.v.f47143b;
                i0Var = s8.i0.f47108e;
            }
            list = i0Var;
            if (f1Var != null) {
                g1 g1Var = f1Var.f9141f;
                if (g1Var.f9155c != j11) {
                    f1Var.f9141f = g1Var.a(j11);
                }
            }
        } else if (!vVar.equals(u1Var.f9427b)) {
            t0Var = o4.t0.d;
            yVar = this.f9227e;
            list = s8.i0.f47108e;
        }
        o4.t0 t0Var2 = t0Var;
        f5.y yVar2 = yVar;
        List list2 = list;
        if (z4) {
            ye.f fVar = this.K;
            if (fVar.d && fVar.f50869e != 5) {
                if (i10 == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h5.a.f(z11);
            } else {
                fVar.f50867b = true;
                fVar.d = true;
                fVar.f50869e = i10;
            }
        }
        u1 u1Var2 = this.J;
        long j13 = u1Var2.f9439p;
        f1 f1Var2 = this.E.f9176j;
        if (f1Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.X - f1Var2.f9149o));
        }
        return u1Var2.c(vVar, j10, j11, j12, max, t0Var2, yVar2, list2);
    }

    public final boolean p() {
        long e6;
        f1 f1Var = this.E.f9176j;
        if (f1Var != null) {
            if (!f1Var.d) {
                e6 = 0;
            } else {
                e6 = f1Var.f9137a.e();
            }
            if (e6 == Long.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean r() {
        f1 f1Var = this.E.h;
        long j10 = f1Var.f9141f.f9156e;
        if (f1Var.d) {
            if (j10 == -9223372036854775807L || this.J.f9441r < j10 || !Z()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void s(o4.n0 n0Var) {
        this.f9229n.a(9, (o4.t) n0Var).b();
    }

    public final void t() {
        long e6;
        long max;
        boolean c3;
        boolean z4 = false;
        if (!p()) {
            c3 = false;
        } else {
            f1 f1Var = this.E.f9176j;
            if (!f1Var.d) {
                e6 = 0;
            } else {
                e6 = f1Var.f9137a.e();
            }
            f1 f1Var2 = this.E.f9176j;
            if (f1Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, e6 - (this.X - f1Var2.f9149o));
            }
            f1 f1Var3 = this.E.h;
            c3 = this.f9228f.c(max, this.f9234y.d().f9452a);
            if (!c3 && max < 500000 && this.f9233x > 0) {
                this.E.h.f9137a.k(this.J.f9441r);
                c3 = this.f9228f.c(max, this.f9234y.d().f9452a);
            }
        }
        this.P = c3;
        if (c3) {
            f1 f1Var4 = this.E.f9176j;
            long j10 = this.X;
            if (f1Var4.f9146l == null) {
                z4 = true;
            }
            h5.a.i(z4);
            f1Var4.f9137a.m(j10 - f1Var4.f9149o);
        }
        e0();
    }

    public final void u() {
        boolean z4;
        ye.f fVar = this.K;
        u1 u1Var = this.J;
        boolean z10 = fVar.f50867b;
        if (((u1) fVar.h) != u1Var) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z11 = z10 | z4;
        fVar.f50867b = z11;
        fVar.h = u1Var;
        if (z11) {
            f0 f0Var = this.D.f9423a;
            f0Var.f9118i.c(new gf.c(16, f0Var, fVar));
            this.K = new ye.f(this.J);
        }
    }

    public final void v() {
        l(this.F.b(), true);
    }

    public final void w() {
        this.K.a(1);
        throw null;
    }

    public final void x() {
        int i10;
        this.K.a(1);
        D(false, false, false, true);
        this.f9228f.b(false);
        if (this.J.f9426a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        Y(i10);
        g5.s sVar = (g5.s) this.h;
        sVar.getClass();
        q1 q1Var = this.F;
        ArrayList arrayList = q1Var.f9384b;
        h5.a.i(!q1Var.f9391k);
        q1Var.f9392l = sVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            p1 p1Var = (p1) arrayList.get(i11);
            q1Var.e(p1Var);
            q1Var.f9388g.add(p1Var);
        }
        q1Var.f9391k = true;
        this.f9229n.d(2);
    }

    public final synchronized boolean y() {
        if (!this.L && this.f9231s.getThread().isAlive()) {
            this.f9229n.d(7);
            i0(new hg.f(this, 14), this.H);
            return this.L;
        }
        return true;
    }

    public final void z() {
        D(true, false, true, false);
        A();
        this.f9228f.b(true);
        Y(1);
        HandlerThread handlerThread = this.f9230r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.L = true;
            notifyAll();
        }
    }
}
