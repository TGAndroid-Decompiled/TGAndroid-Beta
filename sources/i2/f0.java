package i2;

import ai.s4;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import b2.s1;
import b2.x1;
import ci.qc;
import ei.d5;
import gg.d2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
public final class f0 extends b2.g implements r {
    public final com.google.firebase.messaging.m A;
    public final c3.k0 B;
    public final c3.k0 C;
    public final long D;
    public final e2.c E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public final p1 K;
    public q1 L;
    public u2.g1 M;
    public b2.x0 N;
    public b2.n0 O;
    public b2.n0 P;
    public b2.s Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public boolean U;
    public TextureView V;
    public final int W;
    public e2.w X;
    public b2.e Y;
    public float Z;
    public boolean f10651a0;
    public final x2.v f10652b;
    public d2.d f10653b0;
    public final b2.x0 f10654c;
    public final boolean f10655c0;
    public final e2.g d;
    public boolean f10656d0;
    public final Context e;
    public final int f10657e0;
    public final f0 f10658f;
    public boolean f10659f0;
    public final f[] f10660g;
    public final b2.l f10661g0;
    public final f[] h;
    public x1 f10662h0;
    public final x2.u f10663i;
    public b2.n0 f10664i0;
    public final e2.z f10665j;
    public h1 f10666j0;
    public final x f10667k;
    public int f10668k0;
    public final p0 f10669l;
    public long f10670l0;
    public final e2.p f10671m;
    public org.telegram.messenger.d1 m0;
    public final CopyOnWriteArraySet f10672n;
    public final ArrayList f10673n0;
    public final b2.h1 f10674o;
    public final ArrayList f10675p;
    public final boolean f10676q;
    public final u2.e0 f10677r;
    public final j2.f f10678s;
    public final Looper f10679t;
    public final y2.c f10680u;
    public final long v;
    public final long f10681w;
    public final long f10682x;
    public final c0 f10683y;
    public final d0 f10684z;

    static {
        b2.l0.a("media3.exoplayer");
    }

    public f0(p pVar) {
        super(0);
        f0 f0Var;
        boolean z10;
        int[] iArr;
        f0 f0Var2;
        Handler.Callback callback;
        this.f10673n0 = new ArrayList();
        this.d = new e2.g();
        try {
            e2.a.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7872a + "]");
            Context context = pVar.f10799a;
            e2.x xVar = pVar.f10800b;
            this.e = context.getApplicationContext();
            this.f10678s = new j2.f(xVar);
            this.f10657e0 = pVar.f10804i;
            this.Y = pVar.f10805j;
            this.W = pVar.f10806k;
            this.f10651a0 = false;
            this.D = pVar.f10815t;
            c0 c0Var = new c0(this);
            this.f10683y = c0Var;
            this.f10684z = new Object();
            f[] b10 = ((l) pVar.f10801c.get()).b(new Handler(pVar.h), c0Var, c0Var, c0Var, c0Var);
            this.f10660g = b10;
            if (b10.length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            this.h = new f[b10.length];
            int i10 = 0;
            while (true) {
                f[] fVarArr = this.h;
                if (i10 >= fVarArr.length) {
                    break;
                }
                int i11 = this.f10660g[i10].f10642b;
                fVarArr[i10] = null;
                i10++;
            }
            x2.u uVar = (x2.u) pVar.e.get();
            this.f10663i = uVar;
            this.f10677r = (u2.e0) pVar.d.get();
            y2.f b11 = y2.f.b(pVar.f10803g.f10625b);
            this.f10680u = b11;
            this.f10676q = pVar.f10807l;
            this.L = pVar.f10808m;
            this.v = pVar.f10810o;
            this.f10681w = pVar.f10811p;
            this.f10682x = pVar.f10812q;
            this.K = pVar.f10809n;
            Looper looper = pVar.h;
            this.f10679t = looper;
            this.f10658f = this;
            this.f10671m = new e2.p(looper, xVar, new x(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f10672n = copyOnWriteArraySet;
            this.f10675p = new ArrayList();
            this.M = new u2.e1();
            f[] fVarArr2 = this.f10660g;
            x2.v vVar = new x2.v(new n1[fVarArr2.length], new x2.r[fVarArr2.length], s1.f3313b, null);
            this.f10652b = vVar;
            this.f10674o = new b2.h1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i12 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                e2.d.g(!false);
                sparseBooleanArray.append(i12, true);
            }
            uVar.getClass();
            e2.d.g(!false);
            sparseBooleanArray.append(29, true);
            e2.d.g(!false);
            b2.q qVar = new b2.q(sparseBooleanArray);
            this.f10654c = new b2.x0(qVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < qVar.f3196a.size(); i13++) {
                int a2 = qVar.a(i13);
                e2.d.g(!false);
                sparseBooleanArray2.append(a2, true);
            }
            e2.d.g(!false);
            sparseBooleanArray2.append(4, true);
            e2.d.g(!false);
            sparseBooleanArray2.append(10, true);
            e2.d.g(!false);
            this.N = new b2.x0(new b2.q(sparseBooleanArray2));
            this.f10665j = xVar.a(looper, null);
            x xVar2 = new x(this, 1);
            this.f10667k = xVar2;
            this.f10666j0 = h1.k(vVar);
            this.f10678s.r(this, looper);
            j2.k kVar = new j2.k(pVar.f10817w);
            p0 p0Var = new p0(this.e, this.f10660g, this.h, uVar, vVar, (k) pVar.f10802f.get(), b11, this.F, this.G, this.f10678s, this.L, pVar.f10813r, pVar.f10814s, looper, xVar, xVar2, kVar, this.f10684z);
            e2.z zVar = p0Var.f10835n;
            this.f10669l = p0Var;
            Looper looper2 = p0Var.f10842s;
            this.Z = 1.0f;
            this.F = 0;
            b2.n0 n0Var = b2.n0.K;
            this.O = n0Var;
            this.P = n0Var;
            this.f10664i0 = n0Var;
            this.f10668k0 = -1;
            this.f10653b0 = d2.d.d;
            this.f10655c0 = true;
            n0(this.f10678s);
            Handler handler = new Handler(looper);
            j2.f fVar = this.f10678s;
            b11.getClass();
            fVar.getClass();
            o0.c cVar = b11.f46601c;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f15522b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.f46586b == fVar) {
                    bVar.f46587c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, fVar));
            copyOnWriteArraySet.add(this.f10683y);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.e;
                    boolean z11 = pVar.f10816u;
                    e2.z a10 = xVar.a(p0Var.f10842s, null);
                    callback = null;
                    s4 s4Var = new s4(context2, z11, this, kVar, 4);
                    f0Var2 = this;
                    try {
                        a10.c(s4Var);
                    } catch (Throwable th2) {
                        th = th2;
                        f0Var = f0Var2;
                        f0Var.d.e();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    f0Var2 = this;
                    f0Var = f0Var2;
                    f0Var.d.e();
                    throw th;
                }
            } else {
                callback = null;
                f0Var2 = this;
            }
            f0Var = f0Var2;
            try {
                e2.c cVar2 = new e2.c(0, looper2, looper, xVar, new x(f0Var2, 2));
                f0Var.E = cVar2;
                cVar2.i(new qc(f0Var, 28));
                Context context3 = pVar.f10799a;
                Looper looper3 = pVar.h;
                c0 c0Var2 = f0Var.f10683y;
                ?? obj = new Object();
                obj.f7318b = context3.getApplicationContext();
                obj.d = xVar.a(looper2, callback);
                obj.f7319c = new b(obj, xVar.a(looper3, callback), c0Var2);
                f0Var.A = obj;
                obj.t();
                f0Var.B = new c3.k0(context, looper2, xVar, 2);
                f0Var.C = new c3.k0(context, looper2, xVar, 3);
                f0Var.f10661g0 = b2.l.f3078c;
                f0Var.f10662h0 = x1.d;
                f0Var.X = e2.w.f7921c;
                zVar.a(38, f0Var.K).b();
                b2.e eVar = f0Var.Y;
                e2.y b12 = e2.z.b();
                b12.f7925a = zVar.f7927a.obtainMessage(31, 0, 0, eVar);
                b12.b();
                f0Var.p1(1, 3, f0Var.Y);
                f0Var.p1(2, 4, Integer.valueOf(f0Var.W));
                f0Var.p1(2, 5, 0);
                f0Var.p1(1, 9, Boolean.valueOf(f0Var.f10651a0));
                f0Var.p1(6, 8, f0Var.f10684z);
                f0Var.p1(-1, 16, Integer.valueOf(f0Var.f10657e0));
                f0Var.d.e();
            } catch (Throwable th4) {
                th = th4;
                f0Var.d.e();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            f0Var = this;
        }
    }

    public static long i1(h1 h1Var) {
        b2.j1 j1Var = new b2.j1();
        b2.h1 h1Var2 = new b2.h1();
        h1Var.f10715a.g(h1Var.f10716b.f43687a, h1Var2);
        long j3 = h1Var.f10717c;
        if (j3 == -9223372036854775807L) {
            return h1Var.f10715a.m(h1Var2.f3008c, j1Var, 0L).f3060l;
        }
        return h1Var2.e + j3;
    }

    public static h1 j1(h1 h1Var, int i10) {
        h1 h = h1Var.h(i10);
        if (i10 != 1 && i10 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final boolean A0() {
        B1();
        return this.G;
    }

    public final void A1() {
        int d = d();
        c3.k0 k0Var = this.C;
        c3.k0 k0Var2 = this.B;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                B1();
                boolean z11 = this.f10666j0.f10727p;
                if (u() && !z11) {
                    z10 = true;
                }
                k0Var2.a(z10);
                k0Var.a(u());
                return;
            }
        }
        k0Var2.a(false);
        k0Var.a(false);
    }

    @Override
    public final int B() {
        B1();
        if (this.f10666j0.f10715a.p()) {
            return 0;
        }
        h1 h1Var = this.f10666j0;
        return h1Var.f10715a.b(h1Var.f10716b.f43687a);
    }

    @Override
    public final b2.q1 B0() {
        B1();
        return ((x2.p) this.f10663i).e();
    }

    public final void B1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f10679t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.d0.f7872a;
            Locale locale = Locale.US;
            String k10 = org.telegram.ui.Cells.c1.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f10655c0) {
                if (this.f10656d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.o("ExoPlayerImpl", k10, illegalStateException);
                this.f10656d0 = true;
                return;
            }
            throw new IllegalStateException(k10);
        }
    }

    @Override
    public final void C(b2.n0 n0Var) {
        B1();
        if (n0Var.equals(this.P)) {
            return;
        }
        this.P = n0Var;
        this.f10671m.e(15, new x(this, 4));
    }

    @Override
    public final long C0() {
        B1();
        if (this.f10666j0.f10715a.p()) {
            return this.f10670l0;
        }
        h1 h1Var = this.f10666j0;
        long j3 = 0;
        if (h1Var.f10722k.d != h1Var.f10716b.d) {
            return e2.d0.e0(h1Var.f10715a.m(l0(), (b2.j1) this.f2994a, 0L).f3061m);
        }
        long j10 = h1Var.f10728q;
        if (this.f10666j0.f10722k.b()) {
            h1 h1Var2 = this.f10666j0;
            h1Var2.f10715a.g(h1Var2.f10722k.f43687a, this.f10674o).d(this.f10666j0.f10722k.f43688b);
        } else {
            j3 = j10;
        }
        h1 h1Var3 = this.f10666j0;
        b2.k1 k1Var = h1Var3.f10715a;
        Object obj = h1Var3.f10722k.f43687a;
        b2.h1 h1Var4 = this.f10674o;
        k1Var.g(obj, h1Var4);
        return e2.d0.e0(j3 + h1Var4.e);
    }

    @Override
    public final void D(b2.z0 z0Var) {
        B1();
        z0Var.getClass();
        e2.p pVar = this.f10671m;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.o oVar = (e2.o) it.next();
            if (oVar.f7897a.equals(z0Var)) {
                e2.n nVar = pVar.f7902c;
                oVar.d = true;
                if (oVar.f7899c) {
                    oVar.f7899c = false;
                    nVar.e(oVar.f7897a, oVar.f7898b.d());
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    @Override
    public final void D0(int i10) {
        B1();
    }

    @Override
    public final x1 E() {
        B1();
        return this.f10662h0;
    }

    @Override
    public final float G() {
        B1();
        return this.Z;
    }

    @Override
    public final b2.n0 H0() {
        B1();
        return this.O;
    }

    @Override
    public final b2.e I() {
        B1();
        return this.Y;
    }

    @Override
    public final void I0(List list) {
        B1();
        ArrayList c12 = c1(list);
        B1();
        r1(-9223372036854775807L, c12, true, -1);
    }

    @Override
    public final void J(int i10, boolean z10) {
        B1();
    }

    @Override
    public final long J0() {
        B1();
        return e2.d0.e0(f1(this.f10666j0));
    }

    @Override
    public final b2.l K() {
        B1();
        return this.f10661g0;
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        B1();
        if (this.f10659f0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, eVar);
        e2.p pVar = this.f10671m;
        if (!equals) {
            this.Y = eVar;
            p1(1, 3, eVar);
            pVar.c(20, new d5(eVar, 7));
        }
        b2.e eVar2 = this.Y;
        e2.z zVar = this.f10669l.f10835n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7925a = zVar.f7927a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
        b10.b();
        pVar.b();
    }

    @Override
    public final void L() {
        B1();
    }

    @Override
    public final long L0() {
        B1();
        return this.v;
    }

    @Override
    public final void M(int i10, int i11) {
        B1();
    }

    @Override
    public final void N(int i10) {
        B1();
    }

    @Override
    public final int O() {
        B1();
        if (o()) {
            return this.f10666j0.f10716b.f43689c;
        }
        return -1;
    }

    @Override
    public final void P(int i10, int i11, List list) {
        boolean z10;
        B1();
        boolean z11 = false;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ArrayList arrayList = this.f10675p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((e0) arrayList.get(i12)).f10636b.f43796k.a((b2.k0) list.get(i12 - i10))) {
                }
            }
            this.H++;
            e2.z zVar = this.f10669l.f10835n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7925a = zVar.f7927a.obtainMessage(27, i10, min, list);
            b10.b();
            for (int i13 = i10; i13 < min; i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                e0Var.f10637c = new l1(e0Var.f10637c, (b2.k0) list.get(i13 - i10));
            }
            z1(this.f10666j0.j(new m1(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList c12 = c1(list);
        if (arrayList.isEmpty()) {
            if (this.f10668k0 == -1) {
                z11 = true;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        h1 n12 = n1(a1(this.f10666j0, min, c12), i10, min);
        z1(n12, 0, !n12.f10716b.f43687a.equals(this.f10666j0.f10716b.f43687a), 4, f1(n12), -1, false);
    }

    @Override
    public final void S(int i10, int i11) {
        boolean z10;
        B1();
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int size = this.f10675p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            h1 n12 = n1(this.f10666j0, i10, min);
            z1(n12, 0, !n12.f10716b.f43687a.equals(this.f10666j0.f10716b.f43687a), 4, f1(n12), -1, false);
        }
    }

    @Override
    public final void T(long j3, int i10, List list) {
        B1();
        ArrayList c12 = c1(list);
        B1();
        r1(j3, c12, false, i10);
    }

    @Override
    public final void U(float f7) {
        B1();
        float g10 = e2.d0.g(f7, 0.0f, 1.0f);
        if (this.Z == g10) {
            return;
        }
        this.Z = g10;
        this.f10669l.f10835n.a(32, Float.valueOf(g10)).b();
        this.f10671m.e(22, new v(g10, 0));
    }

    @Override
    public final void U0() {
        boolean z10;
        e2.a.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7872a + "] [" + b2.l0.b() + "]");
        B1();
        this.A.t();
        this.B.a(false);
        this.C.a(false);
        p0 p0Var = this.f10669l;
        if (!p0Var.X && p0Var.f10842s.getThread().isAlive()) {
            p0Var.X = true;
            e2.g gVar = new e2.g(p0Var.F);
            p0Var.f10835n.a(7, gVar).b();
            z10 = gVar.c(p0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f10671m.e(10, new ga.a(11));
        }
        this.f10671m.d();
        this.f10665j.f7927a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f10680u;
        j2.f fVar = this.f10678s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f46601c.f15522b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f46586b == fVar) {
                bVar.f46587c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        h1 h1Var = this.f10666j0;
        if (h1Var.f10727p) {
            this.f10666j0 = h1Var.a();
        }
        h1 j12 = j1(this.f10666j0, 1);
        this.f10666j0 = j12;
        h1 c10 = j12.c(j12.f10716b);
        this.f10666j0 = c10;
        c10.f10728q = c10.f10730s;
        this.f10666j0.f10729r = 0L;
        j2.f fVar2 = this.f10678s;
        e2.z zVar = fVar2.f12571n;
        e2.d.h(zVar);
        zVar.c(new h0(fVar2, 7));
        o1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.f10653b0 = d2.d.d;
        this.f10659f0 = true;
    }

    @Override
    public final void V0(int i10, long j3, boolean z10) {
        boolean z11;
        B1();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            e2.d.b(z11);
            b2.k1 k1Var = this.f10666j0.f10715a;
            if (!k1Var.p() && i10 >= k1Var.o()) {
                return;
            }
            j2.f fVar = this.f10678s;
            if (!fVar.f12572r) {
                j2.a l4 = fVar.l();
                fVar.f12572r = true;
                fVar.q(l4, -1, new d5(l4, 23));
            }
            this.H++;
            if (o()) {
                e2.a.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                m0 m0Var = new m0(this.f10666j0);
                m0Var.f(1);
                f0 f0Var = this.f10667k.f10911b;
                f0Var.f10665j.c(new gg.x1(9, f0Var, m0Var));
                return;
            }
            h1 h1Var = this.f10666j0;
            int i11 = h1Var.e;
            if (i11 == 3 || (i11 == 4 && !k1Var.p())) {
                h1Var = this.f10666j0.h(2);
            }
            int l02 = l0();
            h1 k12 = k1(h1Var, k1Var, l1(k1Var, i10, j3));
            this.f10669l.f10835n.a(3, new o0(k1Var, i10, e2.d0.Q(j3))).b();
            z1(k12, 0, true, 1, f1(k12), l02, z10);
        }
    }

    @Override
    public final b2.u0 W() {
        B1();
        return this.f10666j0.f10718f;
    }

    @Override
    public final void X(boolean z10) {
        B1();
        y1(1, z10);
    }

    @Override
    public final long Z() {
        B1();
        return this.f10681w;
    }

    public final ArrayList Z0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f1 f1Var = new f1((u2.a) list.get(i11), this.f10676q);
            arrayList.add(f1Var);
            e0 e0Var = new e0(f1Var.f10686b, f1Var.f10685a);
            this.f10675p.add(i11 + i10, e0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    @Override
    public final long a0() {
        B1();
        return e1(this.f10666j0);
    }

    public final h1 a1(h1 h1Var, int i10, ArrayList arrayList) {
        b2.k1 k1Var = h1Var.f10715a;
        this.H++;
        ArrayList Z0 = Z0(i10, arrayList);
        m1 m1Var = new m1(this.f10675p, this.M);
        h1 k12 = k1(h1Var, m1Var, h1(k1Var, m1Var, g1(h1Var), e1(h1Var)));
        u2.g1 g1Var = this.M;
        e2.z zVar = this.f10669l.f10835n;
        k0 k0Var = new k0(Z0, g1Var, -1, -9223372036854775807L);
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7925a = zVar.f7927a.obtainMessage(18, i10, 0, k0Var);
        b10.b();
        return k12;
    }

    @Override
    public final void b() {
        int i10;
        B1();
        h1 h1Var = this.f10666j0;
        if (h1Var.e != 1) {
            return;
        }
        h1 f7 = h1Var.f(null);
        if (f7.f10715a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        h1 j12 = j1(f7, i10);
        this.H++;
        e2.z zVar = this.f10669l.f10835n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7925a = zVar.f7927a.obtainMessage(29);
        b10.b();
        z1(j12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void b0(int i10, List list) {
        boolean z10;
        B1();
        ArrayList c12 = c1(list);
        B1();
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ArrayList arrayList = this.f10675p;
        int min = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.f10668k0 != -1) {
                z11 = false;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        z1(a1(this.f10666j0, min, c12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.n0 b1() {
        byte[] bArr;
        boolean z10;
        b2.k1 w02 = w0();
        if (w02.p()) {
            return this.f10664i0;
        }
        b2.k0 k0Var = w02.m(l0(), (b2.j1) this.f2994a, 0L).f3054c;
        b2.m0 a2 = this.f10664i0.a();
        b2.n0 n0Var = k0Var.d;
        if (n0Var != null) {
            e9.i0 i0Var = n0Var.J;
            byte[] bArr2 = n0Var.f3143k;
            CharSequence charSequence = n0Var.f3136a;
            if (charSequence != null) {
                a2.f3089a = charSequence;
            }
            CharSequence charSequence2 = n0Var.f3137b;
            if (charSequence2 != null) {
                a2.f3090b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.f3138c;
            if (charSequence3 != null) {
                a2.f3091c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f3139f;
            if (charSequence6 != null) {
                a2.f3092f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.f3140g;
            if (charSequence7 != null) {
                a2.f3093g = charSequence7;
            }
            Long l4 = n0Var.h;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.b(z10);
                a2.h = l4;
            }
            b2.c1 c1Var = n0Var.f3141i;
            if (c1Var != null) {
                a2.f3094i = c1Var;
            }
            b2.c1 c1Var2 = n0Var.f3142j;
            if (c1Var2 != null) {
                a2.f3095j = c1Var2;
            }
            Uri uri = n0Var.f3145m;
            if (uri != null || bArr2 != null) {
                a2.f3098m = uri;
                Integer num = n0Var.f3144l;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a2.f3096k = bArr;
                a2.f3097l = num;
            }
            Integer num2 = n0Var.f3146n;
            if (num2 != null) {
                a2.f3099n = num2;
            }
            Integer num3 = n0Var.f3147o;
            if (num3 != null) {
                a2.f3100o = num3;
            }
            Integer num4 = n0Var.f3148p;
            if (num4 != null) {
                a2.f3101p = num4;
            }
            Boolean bool = n0Var.f3149q;
            if (bool != null) {
                a2.f3102q = bool;
            }
            Boolean bool2 = n0Var.f3150r;
            if (bool2 != null) {
                a2.f3103r = bool2;
            }
            Integer num5 = n0Var.f3151s;
            if (num5 != null) {
                a2.f3104s = num5;
            }
            Integer num6 = n0Var.f3152t;
            if (num6 != null) {
                a2.f3104s = num6;
            }
            Integer num7 = n0Var.f3153u;
            if (num7 != null) {
                a2.f3105t = num7;
            }
            Integer num8 = n0Var.v;
            if (num8 != null) {
                a2.f3106u = num8;
            }
            Integer num9 = n0Var.f3154w;
            if (num9 != null) {
                a2.v = num9;
            }
            Integer num10 = n0Var.f3155x;
            if (num10 != null) {
                a2.f3107w = num10;
            }
            Integer num11 = n0Var.f3156y;
            if (num11 != null) {
                a2.f3108x = num11;
            }
            CharSequence charSequence8 = n0Var.f3157z;
            if (charSequence8 != null) {
                a2.f3109y = charSequence8;
            }
            CharSequence charSequence9 = n0Var.A;
            if (charSequence9 != null) {
                a2.f3110z = charSequence9;
            }
            CharSequence charSequence10 = n0Var.B;
            if (charSequence10 != null) {
                a2.A = charSequence10;
            }
            Integer num12 = n0Var.C;
            if (num12 != null) {
                a2.B = num12;
            }
            Integer num13 = n0Var.D;
            if (num13 != null) {
                a2.C = num13;
            }
            CharSequence charSequence11 = n0Var.E;
            if (charSequence11 != null) {
                a2.D = charSequence11;
            }
            CharSequence charSequence12 = n0Var.F;
            if (charSequence12 != null) {
                a2.E = charSequence12;
            }
            CharSequence charSequence13 = n0Var.G;
            if (charSequence13 != null) {
                a2.F = charSequence13;
            }
            Integer num14 = n0Var.H;
            if (num14 != null) {
                a2.G = num14;
            }
            Bundle bundle = n0Var.I;
            if (bundle != null) {
                a2.H = bundle;
            }
            if (!i0Var.isEmpty()) {
                a2.I = e9.i0.v(i0Var);
            }
        }
        return new b2.n0(a2);
    }

    @Override
    public final boolean c() {
        B1();
        return this.f10666j0.f10719g;
    }

    @Override
    public final long c0() {
        B1();
        if (o()) {
            h1 h1Var = this.f10666j0;
            if (h1Var.f10722k.equals(h1Var.f10716b)) {
                return e2.d0.e0(this.f10666j0.f10728q);
            }
            return getDuration();
        }
        return C0();
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f10677r.a((b2.k0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final int d() {
        B1();
        return this.f10666j0.e;
    }

    public final k1 d1(j1 j1Var) {
        int i10;
        int g12 = g1(this.f10666j0);
        b2.k1 k1Var = this.f10666j0.f10715a;
        if (g12 == -1) {
            i10 = 0;
        } else {
            i10 = g12;
        }
        p0 p0Var = this.f10669l;
        return new k1(p0Var, j1Var, k1Var, i10, p0Var.f10842s);
    }

    public final long e1(h1 h1Var) {
        u2.f0 f0Var = h1Var.f10716b;
        long j3 = h1Var.f10717c;
        b2.k1 k1Var = h1Var.f10715a;
        if (f0Var.b()) {
            Object obj = h1Var.f10716b.f43687a;
            b2.h1 h1Var2 = this.f10674o;
            k1Var.g(obj, h1Var2);
            if (j3 == -9223372036854775807L) {
                return e2.d0.e0(k1Var.m(g1(h1Var), (b2.j1) this.f2994a, 0L).f3060l);
            }
            return e2.d0.e0(j3) + e2.d0.e0(h1Var2.e);
        }
        return e2.d0.e0(f1(h1Var));
    }

    @Override
    public final void f(b2.v0 v0Var) {
        B1();
        if (this.f10666j0.f10726o.equals(v0Var)) {
            return;
        }
        h1 g10 = this.f10666j0.g(v0Var);
        this.H++;
        this.f10669l.f10835n.a(4, v0Var).b();
        z1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void f0(int i10) {
        B1();
    }

    public final long f1(h1 h1Var) {
        long j3;
        if (h1Var.f10715a.p()) {
            return e2.d0.Q(this.f10670l0);
        }
        if (h1Var.f10727p) {
            j3 = h1Var.l();
        } else {
            j3 = h1Var.f10730s;
        }
        if (h1Var.f10716b.b()) {
            return j3;
        }
        b2.k1 k1Var = h1Var.f10715a;
        Object obj = h1Var.f10716b.f43687a;
        b2.h1 h1Var2 = this.f10674o;
        k1Var.g(obj, h1Var2);
        return j3 + h1Var2.e;
    }

    @Override
    public final s1 g0() {
        B1();
        return this.f10666j0.f10720i.d;
    }

    public final int g1(h1 h1Var) {
        if (h1Var.f10715a.p()) {
            return this.f10668k0;
        }
        return h1Var.f10715a.g(h1Var.f10716b.f43687a, this.f10674o).f3008c;
    }

    @Override
    public final long getDuration() {
        B1();
        if (o()) {
            h1 h1Var = this.f10666j0;
            u2.f0 f0Var = h1Var.f10716b;
            b2.k1 k1Var = h1Var.f10715a;
            Object obj = f0Var.f43687a;
            b2.h1 h1Var2 = this.f10674o;
            k1Var.g(obj, h1Var2);
            return e2.d0.e0(h1Var2.a(f0Var.f43688b, f0Var.f43689c));
        }
        return A();
    }

    @Override
    public final b2.v0 h() {
        B1();
        return this.f10666j0.f10726o;
    }

    @Override
    public final b2.n0 h0() {
        B1();
        return this.P;
    }

    public final Pair h1(b2.k1 k1Var, m1 m1Var, int i10, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        if (!k1Var.p() && !m1Var.p()) {
            Pair i12 = k1Var.i((b2.j1) this.f2994a, this.f10674o, i10, e2.d0.Q(j3));
            Object obj = i12.first;
            if (m1Var.b(obj) != -1) {
                return i12;
            }
            int U = p0.U((b2.j1) this.f2994a, this.f10674o, this.F, this.G, obj, k1Var, m1Var);
            if (U != -1) {
                b2.j1 j1Var = (b2.j1) this.f2994a;
                m1Var.m(U, j1Var, 0L);
                return l1(m1Var, U, e2.d0.e0(j1Var.f3060l));
            }
            return l1(m1Var, -1, -9223372036854775807L);
        }
        if (!k1Var.p() && m1Var.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = i10;
        }
        if (!z10) {
            j10 = j3;
        }
        return l1(m1Var, i11, j10);
    }

    @Override
    public final void j(int i10) {
        B1();
        if (this.F != i10) {
            this.F = i10;
            e2.z zVar = this.f10669l.f10835n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7925a = zVar.f7927a.obtainMessage(11, i10, 0);
            b10.b();
            w wVar = new w(i10, 0);
            e2.p pVar = this.f10671m;
            pVar.c(8, wVar);
            x1();
            pVar.b();
        }
    }

    @Override
    public final d2.d j0() {
        B1();
        return this.f10653b0;
    }

    @Override
    public final int k0() {
        B1();
        if (o()) {
            return this.f10666j0.f10716b.f43688b;
        }
        return -1;
    }

    public final h1 k1(h1 h1Var, b2.k1 k1Var, Pair pair) {
        boolean z10;
        u2.f0 f0Var;
        u2.o1 o1Var;
        x2.v vVar;
        List list;
        int i10;
        long j3;
        if (!k1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.b(z10);
        b2.k1 k1Var2 = h1Var.f10715a;
        long e12 = e1(h1Var);
        h1 j10 = h1Var.j(k1Var);
        if (k1Var.p()) {
            u2.f0 f0Var2 = h1.f10714u;
            long Q = e2.d0.Q(this.f10670l0);
            h1 c10 = j10.d(f0Var2, Q, Q, Q, 0L, u2.o1.d, this.f10652b, e9.a1.e).c(f0Var2);
            c10.f10728q = c10.f10730s;
            return c10;
        }
        Object obj = j10.f10716b.f43687a;
        String str = e2.d0.f7872a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            f0Var = new u2.f0(pair.first);
        } else {
            f0Var = j10.f10716b;
        }
        long longValue = ((Long) pair.second).longValue();
        long Q2 = e2.d0.Q(e12);
        if (!k1Var2.p()) {
            Q2 -= k1Var2.g(obj, this.f10674o).e;
        }
        if (!equals || longValue < Q2) {
            u2.f0 f0Var3 = f0Var;
            e2.d.g(!f0Var3.b());
            if (!equals) {
                o1Var = u2.o1.d;
            } else {
                o1Var = j10.h;
            }
            u2.o1 o1Var2 = o1Var;
            if (!equals) {
                vVar = this.f10652b;
            } else {
                vVar = j10.f10720i;
            }
            x2.v vVar2 = vVar;
            if (!equals) {
                e9.g0 g0Var = e9.i0.f8068b;
                list = e9.a1.e;
            } else {
                list = j10.f10721j;
            }
            h1 c11 = j10.d(f0Var3, longValue, longValue, longValue, 0L, o1Var2, vVar2, list).c(f0Var3);
            c11.f10728q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = k1Var.b(j10.f10722k.f43687a);
            if (b10 != -1 && k1Var.f(b10, this.f10674o, false).f3008c == k1Var.g(f0Var.f43687a, this.f10674o).f3008c) {
                return j10;
            }
            k1Var.g(f0Var.f43687a, this.f10674o);
            if (f0Var.b()) {
                j3 = this.f10674o.a(f0Var.f43688b, f0Var.f43689c);
            } else {
                j3 = this.f10674o.d;
            }
            u2.f0 f0Var4 = f0Var;
            h1 c12 = j10.d(f0Var4, j10.f10730s, j10.f10730s, j10.d, j3 - j10.f10730s, j10.h, j10.f10720i, j10.f10721j).c(f0Var4);
            c12.f10728q = j3;
            return c12;
        } else {
            u2.f0 f0Var5 = f0Var;
            e2.d.g(!f0Var5.b());
            long max = Math.max(0L, j10.f10729r - (longValue - Q2));
            long j11 = j10.f10728q;
            if (j10.f10722k.equals(j10.f10716b)) {
                j11 = longValue + max;
            }
            h1 d = j10.d(f0Var5, longValue, longValue, longValue, max, j10.h, j10.f10720i, j10.f10721j);
            d.f10728q = j11;
            return d;
        }
    }

    @Override
    public final int l() {
        B1();
        return this.F;
    }

    @Override
    public final int l0() {
        B1();
        int g12 = g1(this.f10666j0);
        if (g12 == -1) {
            return 0;
        }
        return g12;
    }

    public final Pair l1(b2.k1 k1Var, int i10, long j3) {
        if (k1Var.p()) {
            this.f10668k0 = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f10670l0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= k1Var.o()) {
            i10 = k1Var.a(this.G);
            j3 = e2.d0.e0(k1Var.m(i10, (b2.j1) this.f2994a, 0L).f3060l);
        }
        return k1Var.i((b2.j1) this.f2994a, this.f10674o, i10, e2.d0.Q(j3));
    }

    @Override
    public final int m() {
        B1();
        return 0;
    }

    public final void m1(int i10, int i11) {
        e2.w wVar = this.X;
        if (i10 == wVar.f7922a && i11 == wVar.f7923b) {
            return;
        }
        this.X = new e2.w(i10, i11);
        org.telegram.messenger.d1 d1Var = this.m0;
        if (d1Var != null) {
            d1Var.execute(new gg.n(this, i10, i11, 1));
            return;
        }
        this.f10671m.e(24, new dh.c(i10, i11, 1));
        p1(2, 14, new e2.w(i10, i11));
    }

    @Override
    public final void n(Surface surface) {
        int i10;
        B1();
        o1();
        t1(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        m1(i10, i10);
    }

    @Override
    public final void n0(b2.z0 z0Var) {
        z0Var.getClass();
        this.f10671m.a(z0Var);
    }

    public final h1 n1(h1 h1Var, int i10, int i11) {
        int g12 = g1(h1Var);
        long e12 = e1(h1Var);
        b2.k1 k1Var = h1Var.f10715a;
        ArrayList arrayList = this.f10675p;
        int size = arrayList.size();
        this.H++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, i11);
        m1 m1Var = new m1(arrayList, this.M);
        h1 k12 = k1(h1Var, m1Var, h1(k1Var, m1Var, g12, e12));
        int i13 = k12.e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && g12 >= k12.f10715a.o()) {
            k12 = j1(k12, 4);
        }
        u2.g1 g1Var = this.M;
        e2.z zVar = this.f10669l.f10835n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7925a = zVar.f7927a.obtainMessage(20, i10, i11, g1Var);
        b10.b();
        return k12;
    }

    @Override
    public final boolean o() {
        B1();
        return this.f10666j0.f10716b.b();
    }

    @Override
    public final void o0(boolean z10) {
        B1();
    }

    public final void o1() {
        TextureView textureView = this.V;
        c0 c0Var = this.f10683y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                e2.a.n("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c0Var);
            this.T = null;
        }
    }

    public final void p1(int i10, int i11, Object obj) {
        f[] fVarArr;
        f[] fVarArr2;
        for (f fVar : this.f10660g) {
            if (i10 == -1 || fVar.f10642b == i10) {
                k1 d12 = d1(fVar);
                e2.d.g(!d12.f10760f);
                d12.f10759c = i11;
                e2.d.g(!d12.f10760f);
                d12.d = obj;
                d12.b();
            }
        }
        for (f fVar2 : this.h) {
            if (fVar2 != null && (i10 == -1 || fVar2.f10642b == i10)) {
                k1 d13 = d1(fVar2);
                e2.d.g(!d13.f10760f);
                d13.f10759c = i11;
                e2.d.g(!d13.f10760f);
                d13.d = obj;
                d13.b();
            }
        }
    }

    @Override
    public final void q(b2.q1 q1Var) {
        B1();
        x2.u uVar = this.f10663i;
        uVar.getClass();
        b2.q1 B0 = B0();
        if (!q1Var.equals(((x2.p) uVar).e())) {
            uVar.b(q1Var);
        }
        if (!B0.equals(q1Var)) {
            this.f10671m.e(19, new d5(q1Var, 8));
        }
    }

    public final void q1(u2.a aVar, boolean z10) {
        B1();
        List singletonList = Collections.singletonList(aVar);
        B1();
        r1(-9223372036854775807L, singletonList, z10, -1);
    }

    @Override
    public final long r() {
        B1();
        return e2.d0.e0(this.f10666j0.f10729r);
    }

    @Override
    public final void r0(int i10, int i11, int i12) {
        boolean z10;
        B1();
        if (i10 >= 0 && i10 <= i11 && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ArrayList arrayList = this.f10675p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.k1 w02 = w0();
            this.H++;
            e2.d0.P(i10, min, min2, arrayList);
            this.M = this.M.f();
            m1 m1Var = new m1(arrayList, this.M);
            h1 h1Var = this.f10666j0;
            h1 k12 = k1(h1Var, m1Var, h1(w02, m1Var, g1(h1Var), e1(this.f10666j0)));
            u2.g1 g1Var = this.M;
            p0 p0Var = this.f10669l;
            p0Var.getClass();
            p0Var.f10835n.a(19, new l0(i10, min, min2, g1Var)).b();
            z1(k12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void r1(long j3, List list, boolean z10, int i10) {
        long j10;
        int i11;
        int i12;
        h1 j12;
        boolean z11;
        int i13 = i10;
        int g12 = g1(this.f10666j0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.f10675p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i14 = size - 1; i14 >= 0; i14--) {
                arrayList.remove(i14);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Z0 = Z0(0, list);
        m1 m1Var = new m1(arrayList, this.M);
        boolean p5 = m1Var.p();
        int i15 = m1Var.h;
        if (!p5 && i13 >= i15) {
            throw new IllegalStateException();
        }
        if (z10) {
            i13 = m1Var.a(this.G);
            j10 = -9223372036854775807L;
        } else if (i13 == -1) {
            i11 = g12;
            j10 = J0;
            h1 k12 = k1(this.f10666j0, m1Var, l1(m1Var, i11, j10));
            i12 = k12.e;
            if (i11 != -1 && i12 != 1) {
                i12 = (!m1Var.p() || i11 >= i15) ? 4 : 2;
            }
            j12 = j1(k12, i12);
            this.f10669l.f10835n.a(17, new k0(Z0, this.M, i11, e2.d0.Q(j10))).b();
            if (this.f10666j0.f10716b.f43687a.equals(j12.f10716b.f43687a) && !this.f10666j0.f10715a.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            z1(j12, 0, z11, 4, f1(j12), -1, false);
        } else {
            j10 = j3;
        }
        i11 = i13;
        h1 k122 = k1(this.f10666j0, m1Var, l1(m1Var, i11, j10));
        i12 = k122.e;
        if (i11 != -1) {
            if (m1Var.p()) {
            }
        }
        j12 = j1(k122, i12);
        this.f10669l.f10835n.a(17, new k0(Z0, this.M, i11, e2.d0.Q(j10))).b();
        if (this.f10666j0.f10716b.f43687a.equals(j12.f10716b.f43687a)) {
        }
        z11 = false;
        z1(j12, 0, z11, 4, f1(j12), -1, false);
    }

    public final void s1(q1 q1Var) {
        B1();
        if (q1Var == null) {
            q1Var = q1.e;
        }
        if (!this.L.equals(q1Var)) {
            this.L = q1Var;
            this.f10669l.f10835n.a(5, q1Var).b();
        }
    }

    @Override
    public final void stop() {
        B1();
        w1(null);
        this.f10653b0 = new d2.d(this.f10666j0.f10730s, e9.a1.e);
    }

    @Override
    public final b2.x0 t() {
        B1();
        return this.N;
    }

    public final void t1(Surface surface) {
        boolean z10;
        long j3;
        Object obj = this.R;
        boolean z11 = true;
        if (obj != null && obj != surface) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j3 = this.D;
        } else {
            j3 = -9223372036854775807L;
        }
        p0 p0Var = this.f10669l;
        if (!p0Var.X && p0Var.f10842s.getThread().isAlive()) {
            e2.g gVar = new e2.g(p0Var.F);
            p0Var.f10835n.a(30, new Pair(surface, gVar)).b();
            if (j3 != -9223372036854775807L) {
                z11 = gVar.c(j3);
            }
        }
        if (z10) {
            Object obj2 = this.R;
            Surface surface2 = this.S;
            if (obj2 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused) {
                }
                this.S = null;
            }
        }
        this.R = surface;
        if (!z11) {
            w1(new n(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final boolean u() {
        B1();
        return this.f10666j0.f10723l;
    }

    @Override
    public final int u0() {
        B1();
        return this.f10666j0.f10725n;
    }

    public final void u1(SurfaceView surfaceView) {
        SurfaceHolder holder;
        B1();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        B1();
        if (holder == null) {
            B1();
            o1();
            t1(null);
            m1(0, 0);
            return;
        }
        o1();
        this.U = true;
        this.T = holder;
        holder.addCallback(this.f10683y);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            t1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        t1(null);
        m1(0, 0);
    }

    public final void v1(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        B1();
        if (textureView == null) {
            B1();
            o1();
            t1(null);
            m1(0, 0);
            return;
        }
        o1();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            e2.a.n("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f10683y);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            t1(null);
            m1(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        t1(surface);
        this.S = surface;
        m1(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public final b2.k1 w0() {
        B1();
        return this.f10666j0.f10715a;
    }

    public final void w1(n nVar) {
        h1 h1Var = this.f10666j0;
        h1 c10 = h1Var.c(h1Var.f10716b);
        c10.f10728q = c10.f10730s;
        c10.f10729r = 0L;
        h1 j12 = j1(c10, 1);
        if (nVar != null) {
            j12 = j12.f(nVar);
        }
        h1 h1Var2 = j12;
        this.H++;
        e2.z zVar = this.f10669l.f10835n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7925a = zVar.f7927a.obtainMessage(6);
        b10.b();
        z1(h1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void x(boolean z10) {
        B1();
        if (this.G != z10) {
            this.G = z10;
            e2.z zVar = this.f10669l.f10835n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7925a = zVar.f7927a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            y yVar = new y(0, z10);
            e2.p pVar = this.f10671m;
            pVar.c(9, yVar);
            x1();
            pVar.b();
        }
    }

    @Override
    public final boolean x0() {
        B1();
        return false;
    }

    public final void x1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        b2.x0 x0Var = this.N;
        String str = e2.d0.f7872a;
        f0 f0Var = this.f10658f;
        boolean o9 = f0Var.o();
        boolean d02 = f0Var.d0();
        boolean Q0 = f0Var.Q0();
        boolean P0 = f0Var.P0();
        boolean M0 = f0Var.M0();
        boolean t02 = f0Var.t0();
        boolean p5 = f0Var.w0().p();
        ?? obj = new Object();
        obj.f3338a = new b2.p();
        b2.p pVar = (b2.p) obj.f3338a;
        pVar.c(this.f10654c.f3343a);
        boolean z16 = !o9;
        obj.a(4, z16);
        boolean z17 = false;
        if (d02 && !o9) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(5, z10);
        if (Q0 && !o9) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(6, z11);
        if (!p5 && ((Q0 || !M0 || d02) && !o9)) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(7, z12);
        if (P0 && !o9) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(8, z13);
        if (!p5 && ((P0 || (M0 && t02)) && !o9)) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(9, z14);
        obj.a(10, z16);
        if (d02 && !o9) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (d02 && !o9) {
            z17 = true;
        }
        obj.a(12, z17);
        b2.x0 x0Var2 = new b2.x0(pVar.d());
        this.N = x0Var2;
        if (!x0Var2.equals(x0Var)) {
            this.f10671m.c(13, new x(this, 3));
        }
    }

    @Override
    public final Looper y0() {
        return this.f10679t;
    }

    public final void y1(int i10, boolean z10) {
        int i11;
        h1 h1Var = this.f10666j0;
        int i12 = h1Var.f10725n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (h1Var.f10723l == z10 && i12 == i11 && h1Var.f10724m == i10) {
            return;
        }
        this.H++;
        if (h1Var.f10727p) {
            h1Var = h1Var.a();
        }
        h1 e = h1Var.e(i10, i11, z10);
        e2.z zVar = this.f10669l.f10835n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7925a = zVar.f7927a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        b10.b();
        z1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long z() {
        B1();
        return this.f10682x;
    }

    @Override
    public final void z0() {
        B1();
    }

    public final void z1(final h1 h1Var, int i10, boolean z10, int i11, long j3, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.k0 k0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        Object obj;
        b2.k0 k0Var2;
        Object obj2;
        int i15;
        long j10;
        long j11;
        long j12;
        long i16;
        Object obj3;
        b2.k0 k0Var3;
        Object obj4;
        int i17;
        long j13;
        h1 h1Var2 = this.f10666j0;
        this.f10666j0 = h1Var;
        boolean equals = h1Var2.f10715a.equals(h1Var.f10715a);
        b2.j1 j1Var = (b2.j1) this.f2994a;
        b2.h1 h1Var3 = this.f10674o;
        b2.k1 k1Var = h1Var2.f10715a;
        u2.f0 f0Var = h1Var2.f10716b;
        b2.k1 k1Var2 = h1Var.f10715a;
        u2.f0 f0Var2 = h1Var.f10716b;
        if (k1Var2.p() && k1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k1Var2.p() != k1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!k1Var.m(k1Var.g(f0Var.f43687a, h1Var3).f3008c, j1Var, 0L).f3052a.equals(k1Var2.m(k1Var2.g(f0Var2.f43687a, h1Var3).f3008c, j1Var, 0L).f3052a)) {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else if (!equals) {
                i13 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        } else if (z10 && i11 == 0 && f0Var.d < f0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i11 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!h1Var.f10715a.p()) {
                k0Var = h1Var.f10715a.m(h1Var.f10715a.g(h1Var.f10716b.f43687a, this.f10674o).f3008c, (b2.j1) this.f2994a, 0L).f3054c;
            } else {
                k0Var = null;
            }
            this.f10664i0 = b2.n0.K;
        } else {
            k0Var = null;
        }
        if (booleanValue || !h1Var2.f10721j.equals(h1Var.f10721j)) {
            b2.m0 a2 = this.f10664i0.a();
            List list = h1Var.f10721j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                b2.p0 p0Var = (b2.p0) list.get(i18);
                int i19 = 0;
                while (true) {
                    b2.o0[] o0VarArr = p0Var.f3172a;
                    if (i19 < o0VarArr.length) {
                        o0VarArr[i19].b(a2);
                        i19++;
                    }
                }
            }
            this.f10664i0 = new b2.n0(a2);
        }
        b2.n0 b12 = b1();
        boolean equals2 = b12.equals(this.O);
        this.O = b12;
        if (h1Var2.f10723l != h1Var.f10723l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (h1Var2.e != h1Var.e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            A1();
        }
        if (h1Var2.f10719g != h1Var.f10719g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f10671m.c(0, new s(h1Var, i10, 0));
        }
        if (z10) {
            b2.h1 h1Var4 = new b2.h1();
            if (!h1Var2.f10715a.p()) {
                Object obj5 = h1Var2.f10716b.f43687a;
                h1Var2.f10715a.g(obj5, h1Var4);
                int i20 = h1Var4.f3008c;
                int b10 = h1Var2.f10715a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = h1Var2.f10715a.m(i20, (b2.j1) this.f2994a, 0L).f3052a;
                k0Var2 = ((b2.j1) this.f2994a).f3054c;
                obj2 = obj5;
                i14 = i20;
                i15 = b10;
            } else {
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                i14 = i12;
                obj = null;
                k0Var2 = null;
                obj2 = null;
                i15 = -1;
            }
            if (i11 == 0) {
                if (h1Var2.f10716b.b()) {
                    u2.f0 f0Var3 = h1Var2.f10716b;
                    j12 = h1Var4.a(f0Var3.f43688b, f0Var3.f43689c);
                    i16 = i1(h1Var2);
                } else if (h1Var2.f10716b.e != -1) {
                    j12 = i1(this.f10666j0);
                    i16 = j12;
                } else {
                    j10 = h1Var4.e;
                    j11 = h1Var4.d;
                    j12 = j10 + j11;
                    i16 = j12;
                }
            } else if (h1Var2.f10716b.b()) {
                j12 = h1Var2.f10730s;
                i16 = i1(h1Var2);
            } else {
                j10 = h1Var4.e;
                j11 = h1Var2.f10730s;
                j12 = j10 + j11;
                i16 = j12;
            }
            long e02 = e2.d0.e0(j12);
            long e03 = e2.d0.e0(i16);
            u2.f0 f0Var4 = h1Var2.f10716b;
            b2.a1 a1Var = new b2.a1(obj, i14, k0Var2, obj2, i15, e02, e03, f0Var4.f43688b, f0Var4.f43689c);
            b2.j1 j1Var2 = (b2.j1) this.f2994a;
            int l02 = l0();
            if (!this.f10666j0.f10715a.p()) {
                h1 h1Var5 = this.f10666j0;
                Object obj6 = h1Var5.f10716b.f43687a;
                h1Var5.f10715a.g(obj6, this.f10674o);
                int b11 = this.f10666j0.f10715a.b(obj6);
                Object obj7 = this.f10666j0.f10715a.m(l02, j1Var2, 0L).f3052a;
                k0Var3 = j1Var2.f3054c;
                i17 = b11;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                k0Var3 = null;
                obj4 = null;
                i17 = -1;
            }
            long e04 = e2.d0.e0(j3);
            if (this.f10666j0.f10716b.b()) {
                j13 = e2.d0.e0(i1(this.f10666j0));
            } else {
                j13 = e04;
            }
            u2.f0 f0Var5 = this.f10666j0.f10716b;
            this.f10671m.c(11, new d2(i11, a1Var, new b2.a1(obj3, l02, k0Var3, obj4, i17, e04, j13, f0Var5.f43688b, f0Var5.f43689c), 2));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f10671m.c(1, new s(k0Var, intValue, 1));
        }
        if (h1Var2.f10718f != h1Var.f10718f) {
            this.f10671m.c(10, new e2.m() {
                @Override
                public final void invoke(Object obj8) {
                    b2.z0 z0Var = (b2.z0) obj8;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
            if (h1Var.f10718f != null) {
                this.f10671m.c(10, new e2.m() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.z0 z0Var = (b2.z0) obj8;
                        switch (r2) {
                            case 0:
                                h1 h1Var6 = h1Var;
                                z0Var.onLoadingChanged(h1Var6.f10719g);
                                z0Var.onIsLoadingChanged(h1Var6.f10719g);
                                return;
                            case 1:
                                h1 h1Var7 = h1Var;
                                z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                                return;
                            case 2:
                                z0Var.onPlaybackStateChanged(h1Var.e);
                                return;
                            case 3:
                                h1 h1Var8 = h1Var;
                                z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                                return;
                            case 4:
                                z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                                return;
                            case 5:
                                z0Var.onIsPlayingChanged(h1Var.m());
                                return;
                            case 6:
                                z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                                return;
                            case 7:
                                z0Var.onPlayerErrorChanged(h1Var.f10718f);
                                return;
                            case 8:
                                z0Var.onPlayerError(h1Var.f10718f);
                                return;
                            default:
                                z0Var.onTracksChanged(h1Var.f10720i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.v vVar = h1Var2.f10720i;
        x2.v vVar2 = h1Var.f10720i;
        if (vVar != vVar2) {
            x2.u uVar = this.f10663i;
            Object obj8 = vVar2.e;
            uVar.getClass();
            uVar.f45541c = (x2.t) obj8;
            this.f10671m.c(2, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f10671m.c(14, new t(this.O));
        }
        if (z14) {
            this.f10671m.c(3, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f10671m.c(-1, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f10671m.c(4, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || h1Var2.f10724m != h1Var.f10724m) {
            this.f10671m.c(5, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (h1Var2.f10725n != h1Var.f10725n) {
            this.f10671m.c(6, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (h1Var2.m() != h1Var.m()) {
            this.f10671m.c(7, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (!h1Var2.f10726o.equals(h1Var.f10726o)) {
            this.f10671m.c(12, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f10719g);
                            z0Var.onIsLoadingChanged(h1Var6.f10719g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f10723l, h1Var7.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f10723l, h1Var8.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        x1();
        this.f10671m.b();
        if (h1Var2.f10727p != h1Var.f10727p) {
            Iterator it = this.f10672n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f10619a.A1();
            }
        }
    }
}
