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
import ci.uc;
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
import org.telegram.ui.Cells.p6;
public final class e0 extends b2.g implements r {
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
    public final o1 K;
    public p1 L;
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
    public boolean f10644a0;
    public final x2.v f10645b;
    public d2.d f10646b0;
    public final b2.x0 f10647c;
    public final boolean f10648c0;
    public final e2.g d;
    public boolean f10649d0;
    public final Context e;
    public final int f10650e0;
    public final e0 f10651f;
    public boolean f10652f0;
    public final f[] f10653g;
    public final b2.l f10654g0;
    public final f[] h;
    public x1 f10655h0;
    public final x2.u f10656i;
    public b2.n0 f10657i0;
    public final e2.z f10658j;
    public g1 f10659j0;
    public final w f10660k;
    public int f10661k0;
    public final o0 f10662l;
    public long f10663l0;
    public final e2.p f10664m;
    public org.telegram.messenger.b1 m0;
    public final CopyOnWriteArraySet f10665n;
    public final ArrayList f10666n0;
    public final b2.h1 f10667o;
    public final ArrayList f10668p;
    public final boolean f10669q;
    public final u2.e0 f10670r;
    public final j2.f f10671s;
    public final Looper f10672t;
    public final y2.c f10673u;
    public final long v;
    public final long f10674w;
    public final long f10675x;
    public final b0 f10676y;
    public final c0 f10677z;

    static {
        b2.l0.a("media3.exoplayer");
    }

    public e0(p pVar) {
        super(0);
        e0 e0Var;
        boolean z10;
        int[] iArr;
        e0 e0Var2;
        Handler.Callback callback;
        this.f10666n0 = new ArrayList();
        this.d = new e2.g();
        try {
            e2.a.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7883a + "]");
            Context context = pVar.f10834a;
            e2.x xVar = pVar.f10835b;
            this.e = context.getApplicationContext();
            this.f10671s = new j2.f(xVar);
            this.f10650e0 = pVar.f10839i;
            this.Y = pVar.f10840j;
            this.W = pVar.f10841k;
            this.f10644a0 = false;
            this.D = pVar.f10850t;
            b0 b0Var = new b0(this);
            this.f10676y = b0Var;
            this.f10677z = new Object();
            f[] b10 = ((l) pVar.f10836c.get()).b(new Handler(pVar.h), b0Var, b0Var, b0Var, b0Var);
            this.f10653g = b10;
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
                int i11 = this.f10653g[i10].f10682b;
                fVarArr[i10] = null;
                i10++;
            }
            x2.u uVar = (x2.u) pVar.e.get();
            this.f10656i = uVar;
            this.f10670r = (u2.e0) pVar.d.get();
            y2.f b11 = y2.f.b(pVar.f10838g.f10632b);
            this.f10673u = b11;
            this.f10669q = pVar.f10842l;
            this.L = pVar.f10843m;
            this.v = pVar.f10845o;
            this.f10674w = pVar.f10846p;
            this.f10675x = pVar.f10847q;
            this.K = pVar.f10844n;
            Looper looper = pVar.h;
            this.f10672t = looper;
            this.f10651f = this;
            this.f10664m = new e2.p(looper, xVar, new w(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f10665n = copyOnWriteArraySet;
            this.f10668p = new ArrayList();
            this.M = new u2.e1();
            f[] fVarArr2 = this.f10653g;
            x2.v vVar = new x2.v(new m1[fVarArr2.length], new x2.r[fVarArr2.length], s1.f3314b, null);
            this.f10645b = vVar;
            this.f10667o = new b2.h1();
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
            this.f10647c = new b2.x0(qVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < qVar.f3197a.size(); i13++) {
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
            this.f10658j = xVar.a(looper, null);
            w wVar = new w(this, 1);
            this.f10660k = wVar;
            this.f10659j0 = g1.k(vVar);
            this.f10671s.r(this, looper);
            j2.k kVar = new j2.k(pVar.f10852w);
            o0 o0Var = new o0(this.e, this.f10653g, this.h, uVar, vVar, (k) pVar.f10837f.get(), b11, this.F, this.G, this.f10671s, this.L, pVar.f10848r, pVar.f10849s, looper, xVar, wVar, kVar, this.f10677z);
            e2.z zVar = o0Var.f10819n;
            this.f10662l = o0Var;
            Looper looper2 = o0Var.f10826s;
            this.Z = 1.0f;
            this.F = 0;
            b2.n0 n0Var = b2.n0.K;
            this.O = n0Var;
            this.P = n0Var;
            this.f10657i0 = n0Var;
            this.f10661k0 = -1;
            this.f10646b0 = d2.d.d;
            this.f10648c0 = true;
            n0(this.f10671s);
            Handler handler = new Handler(looper);
            j2.f fVar = this.f10671s;
            b11.getClass();
            fVar.getClass();
            k2.u uVar2 = b11.f46274c;
            uVar2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) uVar2.f13382b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.f46259b == fVar) {
                    bVar.f46260c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, fVar));
            copyOnWriteArraySet.add(this.f10676y);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.e;
                    boolean z11 = pVar.f10851u;
                    e2.z a10 = xVar.a(o0Var.f10826s, null);
                    callback = null;
                    s4 s4Var = new s4(context2, z11, this, kVar, 4);
                    e0Var2 = this;
                    try {
                        a10.c(s4Var);
                    } catch (Throwable th2) {
                        th = th2;
                        e0Var = e0Var2;
                        e0Var.d.e();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    e0Var2 = this;
                    e0Var = e0Var2;
                    e0Var.d.e();
                    throw th;
                }
            } else {
                callback = null;
                e0Var2 = this;
            }
            e0Var = e0Var2;
            try {
                e2.c cVar = new e2.c(0, looper2, looper, xVar, new w(e0Var2, 2));
                e0Var.E = cVar;
                cVar.i(new uc(e0Var, 28));
                Context context3 = pVar.f10834a;
                Looper looper3 = pVar.h;
                b0 b0Var2 = e0Var.f10676y;
                ?? obj = new Object();
                obj.f7329b = context3.getApplicationContext();
                obj.d = xVar.a(looper2, callback);
                obj.f7330c = new b(obj, xVar.a(looper3, callback), b0Var2);
                e0Var.A = obj;
                obj.t();
                e0Var.B = new c3.k0(context, looper2, xVar, 2);
                e0Var.C = new c3.k0(context, looper2, xVar, 3);
                e0Var.f10654g0 = b2.l.f3079c;
                e0Var.f10655h0 = x1.d;
                e0Var.X = e2.w.f7932c;
                zVar.a(38, e0Var.K).b();
                b2.e eVar = e0Var.Y;
                e2.y b12 = e2.z.b();
                b12.f7936a = zVar.f7938a.obtainMessage(31, 0, 0, eVar);
                b12.b();
                e0Var.p1(1, 3, e0Var.Y);
                e0Var.p1(2, 4, Integer.valueOf(e0Var.W));
                e0Var.p1(2, 5, 0);
                e0Var.p1(1, 9, Boolean.valueOf(e0Var.f10644a0));
                e0Var.p1(6, 8, e0Var.f10677z);
                e0Var.p1(-1, 16, Integer.valueOf(e0Var.f10650e0));
                e0Var.d.e();
            } catch (Throwable th4) {
                th = th4;
                e0Var.d.e();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            e0Var = this;
        }
    }

    public static long i1(g1 g1Var) {
        b2.j1 j1Var = new b2.j1();
        b2.h1 h1Var = new b2.h1();
        g1Var.f10715a.g(g1Var.f10716b.f43357a, h1Var);
        long j3 = g1Var.f10717c;
        if (j3 == -9223372036854775807L) {
            return g1Var.f10715a.m(h1Var.f3009c, j1Var, 0L).f3061l;
        }
        return h1Var.e + j3;
    }

    public static g1 j1(g1 g1Var, int i10) {
        g1 h = g1Var.h(i10);
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
                boolean z11 = this.f10659j0.f10727p;
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
        if (this.f10659j0.f10715a.p()) {
            return 0;
        }
        g1 g1Var = this.f10659j0;
        return g1Var.f10715a.b(g1Var.f10716b.f43357a);
    }

    @Override
    public final b2.q1 B0() {
        B1();
        return ((x2.p) this.f10656i).e();
    }

    public final void B1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f10672t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.d0.f7883a;
            Locale locale = Locale.US;
            String j3 = p6.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f10648c0) {
                if (this.f10649d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.o("ExoPlayerImpl", j3, illegalStateException);
                this.f10649d0 = true;
                return;
            }
            throw new IllegalStateException(j3);
        }
    }

    @Override
    public final void C(b2.n0 n0Var) {
        B1();
        if (n0Var.equals(this.P)) {
            return;
        }
        this.P = n0Var;
        this.f10664m.e(15, new w(this, 4));
    }

    @Override
    public final long C0() {
        B1();
        if (this.f10659j0.f10715a.p()) {
            return this.f10663l0;
        }
        g1 g1Var = this.f10659j0;
        long j3 = 0;
        if (g1Var.f10722k.d != g1Var.f10716b.d) {
            return e2.d0.e0(g1Var.f10715a.m(l0(), (b2.j1) this.f2995a, 0L).f3062m);
        }
        long j10 = g1Var.f10728q;
        if (this.f10659j0.f10722k.b()) {
            g1 g1Var2 = this.f10659j0;
            g1Var2.f10715a.g(g1Var2.f10722k.f43357a, this.f10667o).d(this.f10659j0.f10722k.f43358b);
        } else {
            j3 = j10;
        }
        g1 g1Var3 = this.f10659j0;
        b2.k1 k1Var = g1Var3.f10715a;
        Object obj = g1Var3.f10722k.f43357a;
        b2.h1 h1Var = this.f10667o;
        k1Var.g(obj, h1Var);
        return e2.d0.e0(j3 + h1Var.e);
    }

    @Override
    public final void D(b2.z0 z0Var) {
        B1();
        e2.p pVar = this.f10664m;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.o oVar = (e2.o) it.next();
            if (oVar.f7908a.equals(z0Var)) {
                e2.n nVar = pVar.f7913c;
                oVar.d = true;
                if (oVar.f7910c) {
                    oVar.f7910c = false;
                    nVar.e(oVar.f7908a, oVar.f7909b.d());
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
        return this.f10655h0;
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
        return e2.d0.e0(f1(this.f10659j0));
    }

    @Override
    public final b2.l K() {
        B1();
        return this.f10654g0;
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        B1();
        if (this.f10652f0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, eVar);
        e2.p pVar = this.f10664m;
        if (!equals) {
            this.Y = eVar;
            p1(1, 3, eVar);
            pVar.c(20, new d5(eVar, 8));
        }
        b2.e eVar2 = this.Y;
        e2.z zVar = this.f10662l.f10819n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7936a = zVar.f7938a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
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
            return this.f10659j0.f10716b.f43359c;
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
        ArrayList arrayList = this.f10668p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((d0) arrayList.get(i12)).f10634b.f43468k.a((b2.k0) list.get(i12 - i10))) {
                }
            }
            this.H++;
            e2.z zVar = this.f10662l.f10819n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7936a = zVar.f7938a.obtainMessage(27, i10, min, list);
            b10.b();
            for (int i13 = i10; i13 < min; i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                d0Var.f10635c = new k1(d0Var.f10635c, (b2.k0) list.get(i13 - i10));
            }
            z1(this.f10659j0.j(new l1(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList c12 = c1(list);
        if (arrayList.isEmpty()) {
            if (this.f10661k0 == -1) {
                z11 = true;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        g1 n12 = n1(a1(this.f10659j0, min, c12), i10, min);
        z1(n12, 0, !n12.f10716b.f43357a.equals(this.f10659j0.f10716b.f43357a), 4, f1(n12), -1, false);
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
        int size = this.f10668p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            g1 n12 = n1(this.f10659j0, i10, min);
            z1(n12, 0, !n12.f10716b.f43357a.equals(this.f10659j0.f10716b.f43357a), 4, f1(n12), -1, false);
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
        final float g10 = e2.d0.g(f7, 0.0f, 1.0f);
        if (this.Z == g10) {
            return;
        }
        this.Z = g10;
        this.f10662l.f10819n.a(32, Float.valueOf(g10)).b();
        this.f10664m.e(22, new e2.m() {
            @Override
            public final void invoke(Object obj) {
                ((b2.z0) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override
    public final void U0() {
        boolean z10;
        e2.a.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7883a + "] [" + b2.l0.b() + "]");
        B1();
        this.A.t();
        this.B.a(false);
        this.C.a(false);
        o0 o0Var = this.f10662l;
        if (!o0Var.X && o0Var.f10826s.getThread().isAlive()) {
            o0Var.X = true;
            e2.g gVar = new e2.g(o0Var.F);
            o0Var.f10819n.a(7, gVar).b();
            z10 = gVar.c(o0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f10664m.e(10, new ga.a(11));
        }
        this.f10664m.d();
        this.f10658j.f7938a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f10673u;
        j2.f fVar = this.f10671s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f46274c.f13382b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f46259b == fVar) {
                bVar.f46260c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        g1 g1Var = this.f10659j0;
        if (g1Var.f10727p) {
            this.f10659j0 = g1Var.a();
        }
        g1 j12 = j1(this.f10659j0, 1);
        this.f10659j0 = j12;
        g1 c10 = j12.c(j12.f10716b);
        this.f10659j0 = c10;
        c10.f10728q = c10.f10730s;
        this.f10659j0.f10729r = 0L;
        j2.f fVar2 = this.f10671s;
        e2.z zVar = fVar2.f12576n;
        e2.d.h(zVar);
        zVar.c(new g0(fVar2, 7));
        o1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.f10646b0 = d2.d.d;
        this.f10652f0 = true;
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
            b2.k1 k1Var = this.f10659j0.f10715a;
            if (!k1Var.p() && i10 >= k1Var.o()) {
                return;
            }
            j2.f fVar = this.f10671s;
            if (!fVar.f12577r) {
                j2.a l4 = fVar.l();
                fVar.f12577r = true;
                fVar.q(l4, -1, new d5(l4, 24));
            }
            this.H++;
            if (o()) {
                e2.a.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                l0 l0Var = new l0(this.f10659j0);
                l0Var.f(1);
                e0 e0Var = this.f10660k.f10912b;
                e0Var.f10658j.c(new gg.x1(9, e0Var, l0Var));
                return;
            }
            g1 g1Var = this.f10659j0;
            int i11 = g1Var.e;
            if (i11 == 3 || (i11 == 4 && !k1Var.p())) {
                g1Var = this.f10659j0.h(2);
            }
            int l02 = l0();
            g1 k12 = k1(g1Var, k1Var, l1(k1Var, i10, j3));
            this.f10662l.f10819n.a(3, new n0(k1Var, i10, e2.d0.Q(j3))).b();
            z1(k12, 0, true, 1, f1(k12), l02, z10);
        }
    }

    @Override
    public final b2.u0 W() {
        B1();
        return this.f10659j0.f10718f;
    }

    @Override
    public final void X(boolean z10) {
        B1();
        y1(1, z10);
    }

    @Override
    public final long Z() {
        B1();
        return this.f10674w;
    }

    public final ArrayList Z0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e1 e1Var = new e1((u2.a) list.get(i11), this.f10669q);
            arrayList.add(e1Var);
            d0 d0Var = new d0(e1Var.f10679b, e1Var.f10678a);
            this.f10668p.add(i11 + i10, d0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    @Override
    public final long a0() {
        B1();
        return e1(this.f10659j0);
    }

    public final g1 a1(g1 g1Var, int i10, ArrayList arrayList) {
        b2.k1 k1Var = g1Var.f10715a;
        this.H++;
        ArrayList Z0 = Z0(i10, arrayList);
        l1 l1Var = new l1(this.f10668p, this.M);
        g1 k12 = k1(g1Var, l1Var, h1(k1Var, l1Var, g1(g1Var), e1(g1Var)));
        u2.g1 g1Var2 = this.M;
        e2.z zVar = this.f10662l.f10819n;
        j0 j0Var = new j0(Z0, g1Var2, -1, -9223372036854775807L);
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7936a = zVar.f7938a.obtainMessage(18, i10, 0, j0Var);
        b10.b();
        return k12;
    }

    @Override
    public final void b() {
        int i10;
        B1();
        g1 g1Var = this.f10659j0;
        if (g1Var.e != 1) {
            return;
        }
        g1 f7 = g1Var.f(null);
        if (f7.f10715a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        g1 j12 = j1(f7, i10);
        this.H++;
        e2.z zVar = this.f10662l.f10819n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7936a = zVar.f7938a.obtainMessage(29);
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
        ArrayList arrayList = this.f10668p;
        int min = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.f10661k0 != -1) {
                z11 = false;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        z1(a1(this.f10659j0, min, c12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.n0 b1() {
        byte[] bArr;
        boolean z10;
        b2.k1 w02 = w0();
        if (w02.p()) {
            return this.f10657i0;
        }
        b2.k0 k0Var = w02.m(l0(), (b2.j1) this.f2995a, 0L).f3055c;
        b2.m0 a2 = this.f10657i0.a();
        b2.n0 n0Var = k0Var.d;
        if (n0Var != null) {
            e9.i0 i0Var = n0Var.J;
            byte[] bArr2 = n0Var.f3144k;
            CharSequence charSequence = n0Var.f3137a;
            if (charSequence != null) {
                a2.f3090a = charSequence;
            }
            CharSequence charSequence2 = n0Var.f3138b;
            if (charSequence2 != null) {
                a2.f3091b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.f3139c;
            if (charSequence3 != null) {
                a2.f3092c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f3140f;
            if (charSequence6 != null) {
                a2.f3093f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.f3141g;
            if (charSequence7 != null) {
                a2.f3094g = charSequence7;
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
            b2.c1 c1Var = n0Var.f3142i;
            if (c1Var != null) {
                a2.f3095i = c1Var;
            }
            b2.c1 c1Var2 = n0Var.f3143j;
            if (c1Var2 != null) {
                a2.f3096j = c1Var2;
            }
            Uri uri = n0Var.f3146m;
            if (uri != null || bArr2 != null) {
                a2.f3099m = uri;
                Integer num = n0Var.f3145l;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a2.f3097k = bArr;
                a2.f3098l = num;
            }
            Integer num2 = n0Var.f3147n;
            if (num2 != null) {
                a2.f3100n = num2;
            }
            Integer num3 = n0Var.f3148o;
            if (num3 != null) {
                a2.f3101o = num3;
            }
            Integer num4 = n0Var.f3149p;
            if (num4 != null) {
                a2.f3102p = num4;
            }
            Boolean bool = n0Var.f3150q;
            if (bool != null) {
                a2.f3103q = bool;
            }
            Boolean bool2 = n0Var.f3151r;
            if (bool2 != null) {
                a2.f3104r = bool2;
            }
            Integer num5 = n0Var.f3152s;
            if (num5 != null) {
                a2.f3105s = num5;
            }
            Integer num6 = n0Var.f3153t;
            if (num6 != null) {
                a2.f3105s = num6;
            }
            Integer num7 = n0Var.f3154u;
            if (num7 != null) {
                a2.f3106t = num7;
            }
            Integer num8 = n0Var.v;
            if (num8 != null) {
                a2.f3107u = num8;
            }
            Integer num9 = n0Var.f3155w;
            if (num9 != null) {
                a2.v = num9;
            }
            Integer num10 = n0Var.f3156x;
            if (num10 != null) {
                a2.f3108w = num10;
            }
            Integer num11 = n0Var.f3157y;
            if (num11 != null) {
                a2.f3109x = num11;
            }
            CharSequence charSequence8 = n0Var.f3158z;
            if (charSequence8 != null) {
                a2.f3110y = charSequence8;
            }
            CharSequence charSequence9 = n0Var.A;
            if (charSequence9 != null) {
                a2.f3111z = charSequence9;
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
        return this.f10659j0.f10719g;
    }

    @Override
    public final long c0() {
        B1();
        if (o()) {
            g1 g1Var = this.f10659j0;
            if (g1Var.f10722k.equals(g1Var.f10716b)) {
                return e2.d0.e0(this.f10659j0.f10728q);
            }
            return getDuration();
        }
        return C0();
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f10670r.a((b2.k0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final int d() {
        B1();
        return this.f10659j0.e;
    }

    public final j1 d1(i1 i1Var) {
        int i10;
        int g12 = g1(this.f10659j0);
        b2.k1 k1Var = this.f10659j0.f10715a;
        if (g12 == -1) {
            i10 = 0;
        } else {
            i10 = g12;
        }
        o0 o0Var = this.f10662l;
        return new j1(o0Var, i1Var, k1Var, i10, o0Var.f10826s);
    }

    public final long e1(g1 g1Var) {
        u2.f0 f0Var = g1Var.f10716b;
        long j3 = g1Var.f10717c;
        b2.k1 k1Var = g1Var.f10715a;
        if (f0Var.b()) {
            Object obj = g1Var.f10716b.f43357a;
            b2.h1 h1Var = this.f10667o;
            k1Var.g(obj, h1Var);
            if (j3 == -9223372036854775807L) {
                return e2.d0.e0(k1Var.m(g1(g1Var), (b2.j1) this.f2995a, 0L).f3061l);
            }
            return e2.d0.e0(j3) + e2.d0.e0(h1Var.e);
        }
        return e2.d0.e0(f1(g1Var));
    }

    @Override
    public final void f(b2.v0 v0Var) {
        B1();
        if (this.f10659j0.f10726o.equals(v0Var)) {
            return;
        }
        g1 g10 = this.f10659j0.g(v0Var);
        this.H++;
        this.f10662l.f10819n.a(4, v0Var).b();
        z1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void f0(int i10) {
        B1();
    }

    public final long f1(g1 g1Var) {
        long j3;
        if (g1Var.f10715a.p()) {
            return e2.d0.Q(this.f10663l0);
        }
        if (g1Var.f10727p) {
            j3 = g1Var.l();
        } else {
            j3 = g1Var.f10730s;
        }
        if (g1Var.f10716b.b()) {
            return j3;
        }
        b2.k1 k1Var = g1Var.f10715a;
        Object obj = g1Var.f10716b.f43357a;
        b2.h1 h1Var = this.f10667o;
        k1Var.g(obj, h1Var);
        return j3 + h1Var.e;
    }

    @Override
    public final s1 g0() {
        B1();
        return this.f10659j0.f10720i.d;
    }

    public final int g1(g1 g1Var) {
        if (g1Var.f10715a.p()) {
            return this.f10661k0;
        }
        return g1Var.f10715a.g(g1Var.f10716b.f43357a, this.f10667o).f3009c;
    }

    @Override
    public final long getDuration() {
        B1();
        if (o()) {
            g1 g1Var = this.f10659j0;
            u2.f0 f0Var = g1Var.f10716b;
            b2.k1 k1Var = g1Var.f10715a;
            Object obj = f0Var.f43357a;
            b2.h1 h1Var = this.f10667o;
            k1Var.g(obj, h1Var);
            return e2.d0.e0(h1Var.a(f0Var.f43358b, f0Var.f43359c));
        }
        return A();
    }

    @Override
    public final b2.v0 h() {
        B1();
        return this.f10659j0.f10726o;
    }

    @Override
    public final b2.n0 h0() {
        B1();
        return this.P;
    }

    public final Pair h1(b2.k1 k1Var, l1 l1Var, int i10, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        if (!k1Var.p() && !l1Var.p()) {
            Pair i12 = k1Var.i((b2.j1) this.f2995a, this.f10667o, i10, e2.d0.Q(j3));
            Object obj = i12.first;
            if (l1Var.b(obj) != -1) {
                return i12;
            }
            int U = o0.U((b2.j1) this.f2995a, this.f10667o, this.F, this.G, obj, k1Var, l1Var);
            if (U != -1) {
                b2.j1 j1Var = (b2.j1) this.f2995a;
                l1Var.m(U, j1Var, 0L);
                return l1(l1Var, U, e2.d0.e0(j1Var.f3061l));
            }
            return l1(l1Var, -1, -9223372036854775807L);
        }
        if (!k1Var.p() && l1Var.p()) {
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
        return l1(l1Var, i11, j10);
    }

    @Override
    public final void j(int i10) {
        B1();
        if (this.F != i10) {
            this.F = i10;
            e2.z zVar = this.f10662l.f10819n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7936a = zVar.f7938a.obtainMessage(11, i10, 0);
            b10.b();
            v vVar = new v(i10, 0);
            e2.p pVar = this.f10664m;
            pVar.c(8, vVar);
            x1();
            pVar.b();
        }
    }

    @Override
    public final d2.d j0() {
        B1();
        return this.f10646b0;
    }

    @Override
    public final int k0() {
        B1();
        if (o()) {
            return this.f10659j0.f10716b.f43358b;
        }
        return -1;
    }

    public final g1 k1(g1 g1Var, b2.k1 k1Var, Pair pair) {
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
        b2.k1 k1Var2 = g1Var.f10715a;
        long e12 = e1(g1Var);
        g1 j10 = g1Var.j(k1Var);
        if (k1Var.p()) {
            u2.f0 f0Var2 = g1.f10714u;
            long Q = e2.d0.Q(this.f10663l0);
            g1 c10 = j10.d(f0Var2, Q, Q, Q, 0L, u2.o1.d, this.f10645b, e9.a1.e).c(f0Var2);
            c10.f10728q = c10.f10730s;
            return c10;
        }
        Object obj = j10.f10716b.f43357a;
        String str = e2.d0.f7883a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            f0Var = new u2.f0(pair.first);
        } else {
            f0Var = j10.f10716b;
        }
        long longValue = ((Long) pair.second).longValue();
        long Q2 = e2.d0.Q(e12);
        if (!k1Var2.p()) {
            Q2 -= k1Var2.g(obj, this.f10667o).e;
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
                vVar = this.f10645b;
            } else {
                vVar = j10.f10720i;
            }
            x2.v vVar2 = vVar;
            if (!equals) {
                e9.g0 g0Var = e9.i0.f8079b;
                list = e9.a1.e;
            } else {
                list = j10.f10721j;
            }
            g1 c11 = j10.d(f0Var3, longValue, longValue, longValue, 0L, o1Var2, vVar2, list).c(f0Var3);
            c11.f10728q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = k1Var.b(j10.f10722k.f43357a);
            if (b10 != -1 && k1Var.f(b10, this.f10667o, false).f3009c == k1Var.g(f0Var.f43357a, this.f10667o).f3009c) {
                return j10;
            }
            k1Var.g(f0Var.f43357a, this.f10667o);
            if (f0Var.b()) {
                j3 = this.f10667o.a(f0Var.f43358b, f0Var.f43359c);
            } else {
                j3 = this.f10667o.d;
            }
            u2.f0 f0Var4 = f0Var;
            g1 c12 = j10.d(f0Var4, j10.f10730s, j10.f10730s, j10.d, j3 - j10.f10730s, j10.h, j10.f10720i, j10.f10721j).c(f0Var4);
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
            g1 d = j10.d(f0Var5, longValue, longValue, longValue, max, j10.h, j10.f10720i, j10.f10721j);
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
        int g12 = g1(this.f10659j0);
        if (g12 == -1) {
            return 0;
        }
        return g12;
    }

    public final Pair l1(b2.k1 k1Var, int i10, long j3) {
        if (k1Var.p()) {
            this.f10661k0 = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f10663l0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= k1Var.o()) {
            i10 = k1Var.a(this.G);
            j3 = e2.d0.e0(k1Var.m(i10, (b2.j1) this.f2995a, 0L).f3061l);
        }
        return k1Var.i((b2.j1) this.f2995a, this.f10667o, i10, e2.d0.Q(j3));
    }

    @Override
    public final int m() {
        B1();
        return 0;
    }

    public final void m1(int i10, int i11) {
        e2.w wVar = this.X;
        if (i10 == wVar.f7933a && i11 == wVar.f7934b) {
            return;
        }
        this.X = new e2.w(i10, i11);
        org.telegram.messenger.b1 b1Var = this.m0;
        if (b1Var != null) {
            b1Var.execute(new gg.n(this, i10, i11, 1));
            return;
        }
        this.f10664m.e(24, new dh.c(i10, i11, 1));
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
        this.f10664m.a(z0Var);
    }

    public final g1 n1(g1 g1Var, int i10, int i11) {
        int g12 = g1(g1Var);
        long e12 = e1(g1Var);
        b2.k1 k1Var = g1Var.f10715a;
        ArrayList arrayList = this.f10668p;
        int size = arrayList.size();
        this.H++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, i11);
        l1 l1Var = new l1(arrayList, this.M);
        g1 k12 = k1(g1Var, l1Var, h1(k1Var, l1Var, g12, e12));
        int i13 = k12.e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && g12 >= k12.f10715a.o()) {
            k12 = j1(k12, 4);
        }
        u2.g1 g1Var2 = this.M;
        e2.z zVar = this.f10662l.f10819n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7936a = zVar.f7938a.obtainMessage(20, i10, i11, g1Var2);
        b10.b();
        return k12;
    }

    @Override
    public final boolean o() {
        B1();
        return this.f10659j0.f10716b.b();
    }

    @Override
    public final void o0(boolean z10) {
        B1();
    }

    public final void o1() {
        TextureView textureView = this.V;
        b0 b0Var = this.f10676y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != b0Var) {
                e2.a.n("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(b0Var);
            this.T = null;
        }
    }

    public final void p1(int i10, int i11, Object obj) {
        f[] fVarArr;
        f[] fVarArr2;
        for (f fVar : this.f10653g) {
            if (i10 == -1 || fVar.f10682b == i10) {
                j1 d12 = d1(fVar);
                e2.d.g(!d12.f10757f);
                d12.f10756c = i11;
                e2.d.g(!d12.f10757f);
                d12.d = obj;
                d12.b();
            }
        }
        for (f fVar2 : this.h) {
            if (fVar2 != null && (i10 == -1 || fVar2.f10682b == i10)) {
                j1 d13 = d1(fVar2);
                e2.d.g(!d13.f10757f);
                d13.f10756c = i11;
                e2.d.g(!d13.f10757f);
                d13.d = obj;
                d13.b();
            }
        }
    }

    @Override
    public final void q(b2.q1 q1Var) {
        B1();
        x2.u uVar = this.f10656i;
        uVar.getClass();
        b2.q1 B0 = B0();
        if (!q1Var.equals(((x2.p) uVar).e())) {
            uVar.b(q1Var);
        }
        if (!B0.equals(q1Var)) {
            this.f10664m.e(19, new d5(q1Var, 9));
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
        return e2.d0.e0(this.f10659j0.f10729r);
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
        ArrayList arrayList = this.f10668p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.k1 w02 = w0();
            this.H++;
            e2.d0.P(i10, min, min2, arrayList);
            this.M = this.M.f();
            l1 l1Var = new l1(arrayList, this.M);
            g1 g1Var = this.f10659j0;
            g1 k12 = k1(g1Var, l1Var, h1(w02, l1Var, g1(g1Var), e1(this.f10659j0)));
            u2.g1 g1Var2 = this.M;
            o0 o0Var = this.f10662l;
            o0Var.getClass();
            o0Var.f10819n.a(19, new k0(i10, min, min2, g1Var2)).b();
            z1(k12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void r1(long j3, List list, boolean z10, int i10) {
        long j10;
        int i11;
        int i12;
        g1 j12;
        boolean z11;
        int i13 = i10;
        int g12 = g1(this.f10659j0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.f10668p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i14 = size - 1; i14 >= 0; i14--) {
                arrayList.remove(i14);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Z0 = Z0(0, list);
        l1 l1Var = new l1(arrayList, this.M);
        boolean p5 = l1Var.p();
        int i15 = l1Var.h;
        if (!p5 && i13 >= i15) {
            throw new IllegalStateException();
        }
        if (z10) {
            i13 = l1Var.a(this.G);
            j10 = -9223372036854775807L;
        } else if (i13 == -1) {
            i11 = g12;
            j10 = J0;
            g1 k12 = k1(this.f10659j0, l1Var, l1(l1Var, i11, j10));
            i12 = k12.e;
            if (i11 != -1 && i12 != 1) {
                i12 = (!l1Var.p() || i11 >= i15) ? 4 : 2;
            }
            j12 = j1(k12, i12);
            this.f10662l.f10819n.a(17, new j0(Z0, this.M, i11, e2.d0.Q(j10))).b();
            if (this.f10659j0.f10716b.f43357a.equals(j12.f10716b.f43357a) && !this.f10659j0.f10715a.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            z1(j12, 0, z11, 4, f1(j12), -1, false);
        } else {
            j10 = j3;
        }
        i11 = i13;
        g1 k122 = k1(this.f10659j0, l1Var, l1(l1Var, i11, j10));
        i12 = k122.e;
        if (i11 != -1) {
            if (l1Var.p()) {
            }
        }
        j12 = j1(k122, i12);
        this.f10662l.f10819n.a(17, new j0(Z0, this.M, i11, e2.d0.Q(j10))).b();
        if (this.f10659j0.f10716b.f43357a.equals(j12.f10716b.f43357a)) {
        }
        z11 = false;
        z1(j12, 0, z11, 4, f1(j12), -1, false);
    }

    public final void s1(p1 p1Var) {
        B1();
        if (p1Var == null) {
            p1Var = p1.e;
        }
        if (!this.L.equals(p1Var)) {
            this.L = p1Var;
            this.f10662l.f10819n.a(5, p1Var).b();
        }
    }

    @Override
    public final void stop() {
        B1();
        w1(null);
        this.f10646b0 = new d2.d(this.f10659j0.f10730s, e9.a1.e);
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
        o0 o0Var = this.f10662l;
        if (!o0Var.X && o0Var.f10826s.getThread().isAlive()) {
            e2.g gVar = new e2.g(o0Var.F);
            o0Var.f10819n.a(30, new Pair(surface, gVar)).b();
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
        return this.f10659j0.f10723l;
    }

    @Override
    public final int u0() {
        B1();
        return this.f10659j0.f10725n;
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
        holder.addCallback(this.f10676y);
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
        textureView.setSurfaceTextureListener(this.f10676y);
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
        return this.f10659j0.f10715a;
    }

    public final void w1(n nVar) {
        g1 g1Var = this.f10659j0;
        g1 c10 = g1Var.c(g1Var.f10716b);
        c10.f10728q = c10.f10730s;
        c10.f10729r = 0L;
        g1 j12 = j1(c10, 1);
        if (nVar != null) {
            j12 = j12.f(nVar);
        }
        g1 g1Var2 = j12;
        this.H++;
        e2.z zVar = this.f10662l.f10819n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7936a = zVar.f7938a.obtainMessage(6);
        b10.b();
        z1(g1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void x(boolean z10) {
        B1();
        if (this.G != z10) {
            this.G = z10;
            e2.z zVar = this.f10662l.f10819n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7936a = zVar.f7938a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            x xVar = new x(0, z10);
            e2.p pVar = this.f10664m;
            pVar.c(9, xVar);
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
        String str = e2.d0.f7883a;
        e0 e0Var = this.f10651f;
        boolean o9 = e0Var.o();
        boolean d02 = e0Var.d0();
        boolean Q0 = e0Var.Q0();
        boolean P0 = e0Var.P0();
        boolean M0 = e0Var.M0();
        boolean t02 = e0Var.t0();
        boolean p5 = e0Var.w0().p();
        ?? obj = new Object();
        obj.f3339a = new b2.p();
        b2.p pVar = (b2.p) obj.f3339a;
        pVar.c(this.f10647c.f3344a);
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
            this.f10664m.c(13, new w(this, 3));
        }
    }

    @Override
    public final Looper y0() {
        return this.f10672t;
    }

    public final void y1(int i10, boolean z10) {
        int i11;
        g1 g1Var = this.f10659j0;
        int i12 = g1Var.f10725n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (g1Var.f10723l == z10 && i12 == i11 && g1Var.f10724m == i10) {
            return;
        }
        this.H++;
        if (g1Var.f10727p) {
            g1Var = g1Var.a();
        }
        g1 e = g1Var.e(i10, i11, z10);
        e2.z zVar = this.f10662l.f10819n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7936a = zVar.f7938a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        b10.b();
        z1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long z() {
        B1();
        return this.f10675x;
    }

    @Override
    public final void z0() {
        B1();
    }

    public final void z1(final g1 g1Var, int i10, boolean z10, int i11, long j3, int i12, boolean z11) {
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
        g1 g1Var2 = this.f10659j0;
        this.f10659j0 = g1Var;
        boolean equals = g1Var2.f10715a.equals(g1Var.f10715a);
        b2.j1 j1Var = (b2.j1) this.f2995a;
        b2.h1 h1Var = this.f10667o;
        b2.k1 k1Var = g1Var2.f10715a;
        u2.f0 f0Var = g1Var2.f10716b;
        b2.k1 k1Var2 = g1Var.f10715a;
        u2.f0 f0Var2 = g1Var.f10716b;
        if (k1Var2.p() && k1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k1Var2.p() != k1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!k1Var.m(k1Var.g(f0Var.f43357a, h1Var).f3009c, j1Var, 0L).f3053a.equals(k1Var2.m(k1Var2.g(f0Var2.f43357a, h1Var).f3009c, j1Var, 0L).f3053a)) {
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
            if (!g1Var.f10715a.p()) {
                k0Var = g1Var.f10715a.m(g1Var.f10715a.g(g1Var.f10716b.f43357a, this.f10667o).f3009c, (b2.j1) this.f2995a, 0L).f3055c;
            } else {
                k0Var = null;
            }
            this.f10657i0 = b2.n0.K;
        } else {
            k0Var = null;
        }
        if (booleanValue || !g1Var2.f10721j.equals(g1Var.f10721j)) {
            b2.m0 a2 = this.f10657i0.a();
            List list = g1Var.f10721j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                b2.p0 p0Var = (b2.p0) list.get(i18);
                int i19 = 0;
                while (true) {
                    b2.o0[] o0VarArr = p0Var.f3173a;
                    if (i19 < o0VarArr.length) {
                        o0VarArr[i19].b(a2);
                        i19++;
                    }
                }
            }
            this.f10657i0 = new b2.n0(a2);
        }
        b2.n0 b12 = b1();
        boolean equals2 = b12.equals(this.O);
        this.O = b12;
        if (g1Var2.f10723l != g1Var.f10723l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g1Var2.e != g1Var.e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            A1();
        }
        if (g1Var2.f10719g != g1Var.f10719g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f10664m.c(0, new s(g1Var, i10, 0));
        }
        if (z10) {
            b2.h1 h1Var2 = new b2.h1();
            if (!g1Var2.f10715a.p()) {
                Object obj5 = g1Var2.f10716b.f43357a;
                g1Var2.f10715a.g(obj5, h1Var2);
                int i20 = h1Var2.f3009c;
                int b10 = g1Var2.f10715a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = g1Var2.f10715a.m(i20, (b2.j1) this.f2995a, 0L).f3053a;
                k0Var2 = ((b2.j1) this.f2995a).f3055c;
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
                if (g1Var2.f10716b.b()) {
                    u2.f0 f0Var3 = g1Var2.f10716b;
                    j12 = h1Var2.a(f0Var3.f43358b, f0Var3.f43359c);
                    i16 = i1(g1Var2);
                } else if (g1Var2.f10716b.e != -1) {
                    j12 = i1(this.f10659j0);
                    i16 = j12;
                } else {
                    j10 = h1Var2.e;
                    j11 = h1Var2.d;
                    j12 = j10 + j11;
                    i16 = j12;
                }
            } else if (g1Var2.f10716b.b()) {
                j12 = g1Var2.f10730s;
                i16 = i1(g1Var2);
            } else {
                j10 = h1Var2.e;
                j11 = g1Var2.f10730s;
                j12 = j10 + j11;
                i16 = j12;
            }
            long e02 = e2.d0.e0(j12);
            long e03 = e2.d0.e0(i16);
            u2.f0 f0Var4 = g1Var2.f10716b;
            b2.a1 a1Var = new b2.a1(obj, i14, k0Var2, obj2, i15, e02, e03, f0Var4.f43358b, f0Var4.f43359c);
            b2.j1 j1Var2 = (b2.j1) this.f2995a;
            int l02 = l0();
            if (!this.f10659j0.f10715a.p()) {
                g1 g1Var3 = this.f10659j0;
                Object obj6 = g1Var3.f10716b.f43357a;
                g1Var3.f10715a.g(obj6, this.f10667o);
                int b11 = this.f10659j0.f10715a.b(obj6);
                Object obj7 = this.f10659j0.f10715a.m(l02, j1Var2, 0L).f3053a;
                k0Var3 = j1Var2.f3055c;
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
            if (this.f10659j0.f10716b.b()) {
                j13 = e2.d0.e0(i1(this.f10659j0));
            } else {
                j13 = e04;
            }
            u2.f0 f0Var5 = this.f10659j0.f10716b;
            this.f10664m.c(11, new d2(i11, a1Var, new b2.a1(obj3, l02, k0Var3, obj4, i17, e04, j13, f0Var5.f43358b, f0Var5.f43359c), 2));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f10664m.c(1, new s(k0Var, intValue, 1));
        }
        if (g1Var2.f10718f != g1Var.f10718f) {
            this.f10664m.c(10, new e2.m() {
                @Override
                public final void invoke(Object obj8) {
                    b2.z0 z0Var = (b2.z0) obj8;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
            if (g1Var.f10718f != null) {
                this.f10664m.c(10, new e2.m() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.z0 z0Var = (b2.z0) obj8;
                        switch (r2) {
                            case 0:
                                g1 g1Var4 = g1Var;
                                z0Var.onLoadingChanged(g1Var4.f10719g);
                                z0Var.onIsLoadingChanged(g1Var4.f10719g);
                                return;
                            case 1:
                                g1 g1Var5 = g1Var;
                                z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                                return;
                            case 2:
                                z0Var.onPlaybackStateChanged(g1Var.e);
                                return;
                            case 3:
                                g1 g1Var6 = g1Var;
                                z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                                return;
                            case 4:
                                z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                                return;
                            case 5:
                                z0Var.onIsPlayingChanged(g1Var.m());
                                return;
                            case 6:
                                z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                                return;
                            case 7:
                                z0Var.onPlayerErrorChanged(g1Var.f10718f);
                                return;
                            case 8:
                                z0Var.onPlayerError(g1Var.f10718f);
                                return;
                            default:
                                z0Var.onTracksChanged(g1Var.f10720i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.v vVar = g1Var2.f10720i;
        x2.v vVar2 = g1Var.f10720i;
        if (vVar != vVar2) {
            x2.u uVar = this.f10656i;
            Object obj8 = vVar2.e;
            uVar.getClass();
            uVar.f45217c = (x2.t) obj8;
            this.f10664m.c(2, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f10664m.c(14, new d5(this.O, 7));
        }
        if (z14) {
            this.f10664m.c(3, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f10664m.c(-1, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f10664m.c(4, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || g1Var2.f10724m != g1Var.f10724m) {
            this.f10664m.c(5, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.f10725n != g1Var.f10725n) {
            this.f10664m.c(6, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.m() != g1Var.m()) {
            this.f10664m.c(7, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        if (!g1Var2.f10726o.equals(g1Var.f10726o)) {
            this.f10664m.c(12, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f10719g);
                            z0Var.onIsLoadingChanged(g1Var4.f10719g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f10723l, g1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f10723l, g1Var6.f10724m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f10725n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f10726o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f10718f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f10718f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f10720i.d);
                            return;
                    }
                }
            });
        }
        x1();
        this.f10664m.b();
        if (g1Var2.f10727p != g1Var.f10727p) {
            Iterator it = this.f10665n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).f10621a.A1();
            }
        }
    }
}
