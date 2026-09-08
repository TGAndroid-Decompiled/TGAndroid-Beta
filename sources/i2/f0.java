package i2;

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
import bi.e4;
import di.nb;
import fi.j4;
import hg.c2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import ji.u4;
import org.telegram.ui.Cells.p6;
public final class f0 extends b2.g implements s {
    public final com.google.firebase.messaging.m A;
    public final ai.a B;
    public final ai.a C;
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
    public boolean f11531a0;
    public final x2.v f11532b;
    public d2.c f11533b0;
    public final b2.x0 f11534c;
    public final boolean f11535c0;
    public final e2.g d;
    public boolean f11536d0;
    public final Context f11537e;
    public final int f11538e0;
    public final f0 f11539f;
    public boolean f11540f0;
    public final f[] f11541g;
    public final b2.l f11542g0;
    public final f[] h;
    public x1 f11543h0;
    public final x2.u f11544i;
    public b2.n0 f11545i0;
    public final e2.z f11546j;
    public g1 f11547j0;
    public final x f11548k;
    public int f11549k0;
    public final o0 f11550l;
    public long f11551l0;
    public final e2.p f11552m;
    public org.telegram.messenger.b1 m0;
    public final CopyOnWriteArraySet f11553n;
    public final ArrayList f11554n0;
    public final b2.h1 f11555o;
    public final ArrayList f11556p;
    public final boolean f11557q;
    public final u2.e0 f11558r;
    public final j2.f f11559s;
    public final Looper f11560t;
    public final y2.c f11561u;
    public final long v;
    public final long f11562w;
    public final long f11563x;
    public final c0 f11564y;
    public final d0 f11565z;

    static {
        b2.l0.a("media3.exoplayer");
    }

    public f0(q qVar) {
        super(0);
        f0 f0Var;
        boolean z10;
        int[] iArr;
        f0 f0Var2;
        Handler.Callback callback;
        this.f11554n0 = new ArrayList();
        this.d = new e2.g();
        try {
            e2.a.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8765a + "]");
            Context context = qVar.f11725a;
            e2.x xVar = qVar.f11726b;
            this.f11537e = context.getApplicationContext();
            this.f11559s = new j2.f(xVar);
            this.f11538e0 = qVar.f11731i;
            this.Y = qVar.f11732j;
            this.W = qVar.f11733k;
            this.f11531a0 = false;
            this.D = qVar.f11742t;
            c0 c0Var = new c0(this);
            this.f11564y = c0Var;
            this.f11565z = new Object();
            f[] b10 = ((m) qVar.f11727c.get()).b(new Handler(qVar.h), c0Var, c0Var, c0Var, c0Var);
            this.f11541g = b10;
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
                int i11 = this.f11541g[i10].f11521b;
                fVarArr[i10] = null;
                i10++;
            }
            x2.u uVar = (x2.u) qVar.f11728e.get();
            this.f11544i = uVar;
            this.f11558r = (u2.e0) qVar.d.get();
            y2.f b11 = y2.f.b(qVar.f11730g.f11501b);
            this.f11561u = b11;
            this.f11557q = qVar.f11734l;
            this.L = qVar.f11735m;
            this.v = qVar.f11737o;
            this.f11562w = qVar.f11738p;
            this.f11563x = qVar.f11739q;
            this.K = qVar.f11736n;
            Looper looper = qVar.h;
            this.f11560t = looper;
            this.f11539f = this;
            this.f11552m = new e2.p(looper, xVar, new x(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f11553n = copyOnWriteArraySet;
            this.f11556p = new ArrayList();
            this.M = new u2.e1();
            f[] fVarArr2 = this.f11541g;
            x2.v vVar = new x2.v(new m1[fVarArr2.length], new x2.r[fVarArr2.length], s1.f2407b, null);
            this.f11532b = vVar;
            this.f11555o = new b2.h1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i12 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                e2.d.g(!false);
                sparseBooleanArray.append(i12, true);
            }
            uVar.getClass();
            e2.d.g(!false);
            sparseBooleanArray.append(29, true);
            e2.d.g(!false);
            b2.q qVar2 = new b2.q(sparseBooleanArray);
            this.f11534c = new b2.x0(qVar2);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < qVar2.f2286a.size(); i13++) {
                int a2 = qVar2.a(i13);
                e2.d.g(!false);
                sparseBooleanArray2.append(a2, true);
            }
            e2.d.g(!false);
            sparseBooleanArray2.append(4, true);
            e2.d.g(!false);
            sparseBooleanArray2.append(10, true);
            e2.d.g(!false);
            this.N = new b2.x0(new b2.q(sparseBooleanArray2));
            this.f11546j = xVar.a(looper, null);
            x xVar2 = new x(this, 1);
            this.f11548k = xVar2;
            this.f11547j0 = g1.k(vVar);
            this.f11559s.r(this, looper);
            j2.k kVar = new j2.k(qVar.f11744w);
            o0 o0Var = new o0(this.f11537e, this.f11541g, this.h, uVar, vVar, (l) qVar.f11729f.get(), b11, this.F, this.G, this.f11559s, this.L, qVar.f11740r, qVar.f11741s, looper, xVar, xVar2, kVar, this.f11565z);
            e2.z zVar = o0Var.f11701n;
            this.f11550l = o0Var;
            Looper looper2 = o0Var.f11708s;
            this.Z = 1.0f;
            this.F = 0;
            b2.n0 n0Var = b2.n0.K;
            this.O = n0Var;
            this.P = n0Var;
            this.f11545i0 = n0Var;
            this.f11549k0 = -1;
            this.f11533b0 = d2.c.d;
            this.f11535c0 = true;
            n0(this.f11559s);
            Handler handler = new Handler(looper);
            j2.f fVar = this.f11559s;
            b11.getClass();
            fVar.getClass();
            u4 u4Var = b11.f49523c;
            u4Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) u4Var.f14247b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.f49507b == fVar) {
                    bVar.f49508c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, fVar));
            copyOnWriteArraySet.add(this.f11564y);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.f11537e;
                    boolean z11 = qVar.f11743u;
                    e2.z a10 = xVar.a(o0Var.f11708s, null);
                    callback = null;
                    e4 e4Var = new e4(context2, z11, this, kVar, 4);
                    f0Var2 = this;
                    try {
                        a10.c(e4Var);
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
                e2.c cVar = new e2.c(0, looper2, looper, xVar, new x(f0Var2, 2));
                f0Var.E = cVar;
                cVar.i(new nb(f0Var, 24));
                Context context3 = qVar.f11725a;
                Looper looper3 = qVar.h;
                c0 c0Var2 = f0Var.f11564y;
                ?? obj = new Object();
                obj.f6399b = context3.getApplicationContext();
                obj.d = xVar.a(looper2, callback);
                obj.f6400c = new b(obj, xVar.a(looper3, callback), c0Var2);
                f0Var.A = obj;
                obj.t();
                f0Var.B = new ai.a(context, looper2, xVar, 3);
                f0Var.C = new ai.a(context, looper2, xVar, 4);
                f0Var.f11542g0 = b2.l.f2161c;
                f0Var.f11543h0 = x1.d;
                f0Var.X = e2.w.f8820c;
                zVar.a(38, f0Var.K).b();
                b2.e eVar = f0Var.Y;
                e2.y b12 = e2.z.b();
                b12.f8824a = zVar.f8826a.obtainMessage(31, 0, 0, eVar);
                b12.b();
                f0Var.p1(1, 3, f0Var.Y);
                f0Var.p1(2, 4, Integer.valueOf(f0Var.W));
                f0Var.p1(2, 5, 0);
                f0Var.p1(1, 9, Boolean.valueOf(f0Var.f11531a0));
                f0Var.p1(6, 8, f0Var.f11565z);
                f0Var.p1(-1, 16, Integer.valueOf(f0Var.f11538e0));
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

    public static long i1(g1 g1Var) {
        b2.j1 j1Var = new b2.j1();
        b2.h1 h1Var = new b2.h1();
        g1Var.f11580a.g(g1Var.f11581b.f46695a, h1Var);
        long j3 = g1Var.f11582c;
        if (j3 == -9223372036854775807L) {
            return g1Var.f11580a.m(h1Var.f2083c, j1Var, 0L).f2142l;
        }
        return h1Var.f2084e + j3;
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
        ai.a aVar = this.C;
        ai.a aVar2 = this.B;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                B1();
                boolean z11 = this.f11547j0.f11593p;
                if (u() && !z11) {
                    z10 = true;
                }
                aVar2.a(z10);
                aVar.a(u());
                return;
            }
        }
        aVar2.a(false);
        aVar.a(false);
    }

    @Override
    public final int B() {
        B1();
        if (this.f11547j0.f11580a.p()) {
            return 0;
        }
        g1 g1Var = this.f11547j0;
        return g1Var.f11580a.b(g1Var.f11581b.f46695a);
    }

    @Override
    public final b2.q1 B0() {
        B1();
        return ((x2.p) this.f11544i).e();
    }

    public final void B1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f11560t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.d0.f8765a;
            Locale locale = Locale.US;
            String j3 = p6.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f11535c0) {
                if (this.f11536d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.o("ExoPlayerImpl", j3, illegalStateException);
                this.f11536d0 = true;
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
        this.f11552m.e(15, new x(this, 4));
    }

    @Override
    public final long C0() {
        B1();
        if (this.f11547j0.f11580a.p()) {
            return this.f11551l0;
        }
        g1 g1Var = this.f11547j0;
        long j3 = 0;
        if (g1Var.f11588k.d != g1Var.f11581b.d) {
            return e2.d0.e0(g1Var.f11580a.m(l0(), (b2.j1) this.f2068a, 0L).f2143m);
        }
        long j10 = g1Var.f11594q;
        if (this.f11547j0.f11588k.b()) {
            g1 g1Var2 = this.f11547j0;
            g1Var2.f11580a.g(g1Var2.f11588k.f46695a, this.f11555o).d(this.f11547j0.f11588k.f46696b);
        } else {
            j3 = j10;
        }
        g1 g1Var3 = this.f11547j0;
        b2.k1 k1Var = g1Var3.f11580a;
        Object obj = g1Var3.f11588k.f46695a;
        b2.h1 h1Var = this.f11555o;
        k1Var.g(obj, h1Var);
        return e2.d0.e0(j3 + h1Var.f2084e);
    }

    @Override
    public final void D(b2.z0 z0Var) {
        B1();
        e2.p pVar = this.f11552m;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.o oVar = (e2.o) it.next();
            if (oVar.f8792a.equals(z0Var)) {
                e2.n nVar = pVar.f8797c;
                oVar.d = true;
                if (oVar.f8794c) {
                    oVar.f8794c = false;
                    nVar.c(oVar.f8792a, oVar.f8793b.d());
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
        return this.f11543h0;
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
        return e2.d0.e0(f1(this.f11547j0));
    }

    @Override
    public final b2.l K() {
        B1();
        return this.f11542g0;
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        B1();
        if (this.f11540f0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, eVar);
        e2.p pVar = this.f11552m;
        if (!equals) {
            this.Y = eVar;
            p1(1, 3, eVar);
            pVar.c(20, new fi.f(eVar, 5));
        }
        b2.e eVar2 = this.Y;
        e2.z zVar = this.f11550l.f11701n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8824a = zVar.f8826a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
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
            return this.f11547j0.f11581b.f46697c;
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
        ArrayList arrayList = this.f11556p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((e0) arrayList.get(i12)).f11514b.f46813k.a((b2.k0) list.get(i12 - i10))) {
                }
            }
            this.H++;
            e2.z zVar = this.f11550l.f11701n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8824a = zVar.f8826a.obtainMessage(27, i10, min, list);
            b10.b();
            for (int i13 = i10; i13 < min; i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                e0Var.f11515c = new k1(e0Var.f11515c, (b2.k0) list.get(i13 - i10));
            }
            z1(this.f11547j0.j(new l1(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList c12 = c1(list);
        if (arrayList.isEmpty()) {
            if (this.f11549k0 == -1) {
                z11 = true;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        g1 n12 = n1(a1(this.f11547j0, min, c12), i10, min);
        z1(n12, 0, !n12.f11581b.f46695a.equals(this.f11547j0.f11581b.f46695a), 4, f1(n12), -1, false);
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
        int size = this.f11556p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            g1 n12 = n1(this.f11547j0, i10, min);
            z1(n12, 0, !n12.f11581b.f46695a.equals(this.f11547j0.f11581b.f46695a), 4, f1(n12), -1, false);
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
        this.f11550l.f11701n.a(32, Float.valueOf(g10)).b();
        this.f11552m.e(22, new e2.m() {
            @Override
            public final void invoke(Object obj) {
                ((b2.z0) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override
    public final void U0() {
        boolean z10;
        e2.a.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8765a + "] [" + b2.l0.b() + "]");
        B1();
        this.A.t();
        this.B.a(false);
        this.C.a(false);
        o0 o0Var = this.f11550l;
        if (!o0Var.X && o0Var.f11708s.getThread().isAlive()) {
            o0Var.X = true;
            e2.g gVar = new e2.g(o0Var.F);
            o0Var.f11701n.a(7, gVar).b();
            z10 = gVar.c(o0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f11552m.e(10, new i0.b(5));
        }
        this.f11552m.d();
        this.f11546j.f8826a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f11561u;
        j2.f fVar = this.f11559s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f49523c.f14247b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f49507b == fVar) {
                bVar.f49508c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        g1 g1Var = this.f11547j0;
        if (g1Var.f11593p) {
            this.f11547j0 = g1Var.a();
        }
        g1 j12 = j1(this.f11547j0, 1);
        this.f11547j0 = j12;
        g1 c10 = j12.c(j12.f11581b);
        this.f11547j0 = c10;
        c10.f11594q = c10.f11596s;
        this.f11547j0.f11595r = 0L;
        j2.f fVar2 = this.f11559s;
        e2.z zVar = fVar2.f13207n;
        e2.d.h(zVar);
        zVar.c(new ig.t0(fVar2, 5));
        o1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.f11533b0 = d2.c.d;
        this.f11540f0 = true;
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
            b2.k1 k1Var = this.f11547j0.f11580a;
            if (!k1Var.p() && i10 >= k1Var.o()) {
                return;
            }
            j2.f fVar = this.f11559s;
            if (!fVar.f13208r) {
                j2.a l4 = fVar.l();
                fVar.f13208r = true;
                fVar.q(l4, -1, new fi.f(l4, 16));
            }
            this.H++;
            if (o()) {
                e2.a.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                l0 l0Var = new l0(this.f11547j0);
                l0Var.f(1);
                f0 f0Var = this.f11548k.f11802b;
                f0Var.f11546j.c(new j4(10, f0Var, l0Var));
                return;
            }
            g1 g1Var = this.f11547j0;
            int i11 = g1Var.f11583e;
            if (i11 == 3 || (i11 == 4 && !k1Var.p())) {
                g1Var = this.f11547j0.h(2);
            }
            int l02 = l0();
            g1 k12 = k1(g1Var, k1Var, l1(k1Var, i10, j3));
            this.f11550l.f11701n.a(3, new n0(k1Var, i10, e2.d0.Q(j3))).b();
            z1(k12, 0, true, 1, f1(k12), l02, z10);
        }
    }

    @Override
    public final b2.u0 W() {
        B1();
        return this.f11547j0.f11584f;
    }

    @Override
    public final void X(boolean z10) {
        B1();
        y1(1, z10);
    }

    @Override
    public final long Z() {
        B1();
        return this.f11562w;
    }

    public final ArrayList Z0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e1 e1Var = new e1((u2.a) list.get(i11), this.f11557q);
            arrayList.add(e1Var);
            e0 e0Var = new e0(e1Var.f11517b, e1Var.f11516a);
            this.f11556p.add(i11 + i10, e0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    @Override
    public final long a0() {
        B1();
        return e1(this.f11547j0);
    }

    public final g1 a1(g1 g1Var, int i10, ArrayList arrayList) {
        b2.k1 k1Var = g1Var.f11580a;
        this.H++;
        ArrayList Z0 = Z0(i10, arrayList);
        l1 l1Var = new l1(this.f11556p, this.M);
        g1 k12 = k1(g1Var, l1Var, h1(k1Var, l1Var, g1(g1Var), e1(g1Var)));
        u2.g1 g1Var2 = this.M;
        e2.z zVar = this.f11550l.f11701n;
        j0 j0Var = new j0(Z0, g1Var2, -1, -9223372036854775807L);
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8824a = zVar.f8826a.obtainMessage(18, i10, 0, j0Var);
        b10.b();
        return k12;
    }

    @Override
    public final void b() {
        int i10;
        B1();
        g1 g1Var = this.f11547j0;
        if (g1Var.f11583e != 1) {
            return;
        }
        g1 f7 = g1Var.f(null);
        if (f7.f11580a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        g1 j12 = j1(f7, i10);
        this.H++;
        e2.z zVar = this.f11550l.f11701n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8824a = zVar.f8826a.obtainMessage(29);
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
        ArrayList arrayList = this.f11556p;
        int min = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.f11549k0 != -1) {
                z11 = false;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        z1(a1(this.f11547j0, min, c12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.n0 b1() {
        byte[] bArr;
        boolean z10;
        b2.k1 w02 = w0();
        if (w02.p()) {
            return this.f11545i0;
        }
        b2.k0 k0Var = w02.m(l0(), (b2.j1) this.f2068a, 0L).f2135c;
        b2.m0 a2 = this.f11545i0.a();
        b2.n0 n0Var = k0Var.d;
        if (n0Var != null) {
            e9.i0 i0Var = n0Var.J;
            byte[] bArr2 = n0Var.f2231k;
            CharSequence charSequence = n0Var.f2223a;
            if (charSequence != null) {
                a2.f2174a = charSequence;
            }
            CharSequence charSequence2 = n0Var.f2224b;
            if (charSequence2 != null) {
                a2.f2175b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.f2225c;
            if (charSequence3 != null) {
                a2.f2176c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.f2226e;
            if (charSequence5 != null) {
                a2.f2177e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f2227f;
            if (charSequence6 != null) {
                a2.f2178f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.f2228g;
            if (charSequence7 != null) {
                a2.f2179g = charSequence7;
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
            b2.c1 c1Var = n0Var.f2229i;
            if (c1Var != null) {
                a2.f2180i = c1Var;
            }
            b2.c1 c1Var2 = n0Var.f2230j;
            if (c1Var2 != null) {
                a2.f2181j = c1Var2;
            }
            Uri uri = n0Var.f2233m;
            if (uri != null || bArr2 != null) {
                a2.f2184m = uri;
                Integer num = n0Var.f2232l;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a2.f2182k = bArr;
                a2.f2183l = num;
            }
            Integer num2 = n0Var.f2234n;
            if (num2 != null) {
                a2.f2185n = num2;
            }
            Integer num3 = n0Var.f2235o;
            if (num3 != null) {
                a2.f2186o = num3;
            }
            Integer num4 = n0Var.f2236p;
            if (num4 != null) {
                a2.f2187p = num4;
            }
            Boolean bool = n0Var.f2237q;
            if (bool != null) {
                a2.f2188q = bool;
            }
            Boolean bool2 = n0Var.f2238r;
            if (bool2 != null) {
                a2.f2189r = bool2;
            }
            Integer num5 = n0Var.f2239s;
            if (num5 != null) {
                a2.f2190s = num5;
            }
            Integer num6 = n0Var.f2240t;
            if (num6 != null) {
                a2.f2190s = num6;
            }
            Integer num7 = n0Var.f2241u;
            if (num7 != null) {
                a2.f2191t = num7;
            }
            Integer num8 = n0Var.v;
            if (num8 != null) {
                a2.f2192u = num8;
            }
            Integer num9 = n0Var.f2242w;
            if (num9 != null) {
                a2.v = num9;
            }
            Integer num10 = n0Var.f2243x;
            if (num10 != null) {
                a2.f2193w = num10;
            }
            Integer num11 = n0Var.f2244y;
            if (num11 != null) {
                a2.f2194x = num11;
            }
            CharSequence charSequence8 = n0Var.f2245z;
            if (charSequence8 != null) {
                a2.f2195y = charSequence8;
            }
            CharSequence charSequence9 = n0Var.A;
            if (charSequence9 != null) {
                a2.f2196z = charSequence9;
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
        return this.f11547j0.f11585g;
    }

    @Override
    public final long c0() {
        B1();
        if (o()) {
            g1 g1Var = this.f11547j0;
            if (g1Var.f11588k.equals(g1Var.f11581b)) {
                return e2.d0.e0(this.f11547j0.f11594q);
            }
            return getDuration();
        }
        return C0();
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f11558r.a((b2.k0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final int d() {
        B1();
        return this.f11547j0.f11583e;
    }

    public final j1 d1(i1 i1Var) {
        int i10;
        int g12 = g1(this.f11547j0);
        b2.k1 k1Var = this.f11547j0.f11580a;
        if (g12 == -1) {
            i10 = 0;
        } else {
            i10 = g12;
        }
        o0 o0Var = this.f11550l;
        return new j1(o0Var, i1Var, k1Var, i10, o0Var.f11708s);
    }

    public final long e1(g1 g1Var) {
        u2.f0 f0Var = g1Var.f11581b;
        long j3 = g1Var.f11582c;
        b2.k1 k1Var = g1Var.f11580a;
        if (f0Var.b()) {
            Object obj = g1Var.f11581b.f46695a;
            b2.h1 h1Var = this.f11555o;
            k1Var.g(obj, h1Var);
            if (j3 == -9223372036854775807L) {
                return e2.d0.e0(k1Var.m(g1(g1Var), (b2.j1) this.f2068a, 0L).f2142l);
            }
            return e2.d0.e0(j3) + e2.d0.e0(h1Var.f2084e);
        }
        return e2.d0.e0(f1(g1Var));
    }

    @Override
    public final void f(b2.v0 v0Var) {
        B1();
        if (this.f11547j0.f11592o.equals(v0Var)) {
            return;
        }
        g1 g10 = this.f11547j0.g(v0Var);
        this.H++;
        this.f11550l.f11701n.a(4, v0Var).b();
        z1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void f0(int i10) {
        B1();
    }

    public final long f1(g1 g1Var) {
        long j3;
        if (g1Var.f11580a.p()) {
            return e2.d0.Q(this.f11551l0);
        }
        if (g1Var.f11593p) {
            j3 = g1Var.l();
        } else {
            j3 = g1Var.f11596s;
        }
        if (g1Var.f11581b.b()) {
            return j3;
        }
        b2.k1 k1Var = g1Var.f11580a;
        Object obj = g1Var.f11581b.f46695a;
        b2.h1 h1Var = this.f11555o;
        k1Var.g(obj, h1Var);
        return j3 + h1Var.f2084e;
    }

    @Override
    public final s1 g0() {
        B1();
        return this.f11547j0.f11586i.d;
    }

    public final int g1(g1 g1Var) {
        if (g1Var.f11580a.p()) {
            return this.f11549k0;
        }
        return g1Var.f11580a.g(g1Var.f11581b.f46695a, this.f11555o).f2083c;
    }

    @Override
    public final long getDuration() {
        B1();
        if (o()) {
            g1 g1Var = this.f11547j0;
            u2.f0 f0Var = g1Var.f11581b;
            b2.k1 k1Var = g1Var.f11580a;
            Object obj = f0Var.f46695a;
            b2.h1 h1Var = this.f11555o;
            k1Var.g(obj, h1Var);
            return e2.d0.e0(h1Var.a(f0Var.f46696b, f0Var.f46697c));
        }
        return A();
    }

    @Override
    public final b2.v0 h() {
        B1();
        return this.f11547j0.f11592o;
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
            Pair i12 = k1Var.i((b2.j1) this.f2068a, this.f11555o, i10, e2.d0.Q(j3));
            Object obj = i12.first;
            if (l1Var.b(obj) != -1) {
                return i12;
            }
            int U = o0.U((b2.j1) this.f2068a, this.f11555o, this.F, this.G, obj, k1Var, l1Var);
            if (U != -1) {
                b2.j1 j1Var = (b2.j1) this.f2068a;
                l1Var.m(U, j1Var, 0L);
                return l1(l1Var, U, e2.d0.e0(j1Var.f2142l));
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
            e2.z zVar = this.f11550l.f11701n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8824a = zVar.f8826a.obtainMessage(11, i10, 0);
            b10.b();
            w wVar = new w(i10, 0);
            e2.p pVar = this.f11552m;
            pVar.c(8, wVar);
            x1();
            pVar.b();
        }
    }

    @Override
    public final d2.c j0() {
        B1();
        return this.f11533b0;
    }

    @Override
    public final int k0() {
        B1();
        if (o()) {
            return this.f11547j0.f11581b.f46696b;
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
        b2.k1 k1Var2 = g1Var.f11580a;
        long e12 = e1(g1Var);
        g1 j10 = g1Var.j(k1Var);
        if (k1Var.p()) {
            u2.f0 f0Var2 = g1.f11579u;
            long Q = e2.d0.Q(this.f11551l0);
            g1 c10 = j10.d(f0Var2, Q, Q, Q, 0L, u2.o1.d, this.f11532b, e9.a1.f8948e).c(f0Var2);
            c10.f11594q = c10.f11596s;
            return c10;
        }
        Object obj = j10.f11581b.f46695a;
        String str = e2.d0.f8765a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            f0Var = new u2.f0(pair.first);
        } else {
            f0Var = j10.f11581b;
        }
        long longValue = ((Long) pair.second).longValue();
        long Q2 = e2.d0.Q(e12);
        if (!k1Var2.p()) {
            Q2 -= k1Var2.g(obj, this.f11555o).f2084e;
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
                vVar = this.f11532b;
            } else {
                vVar = j10.f11586i;
            }
            x2.v vVar2 = vVar;
            if (!equals) {
                e9.g0 g0Var = e9.i0.f8985b;
                list = e9.a1.f8948e;
            } else {
                list = j10.f11587j;
            }
            g1 c11 = j10.d(f0Var3, longValue, longValue, longValue, 0L, o1Var2, vVar2, list).c(f0Var3);
            c11.f11594q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = k1Var.b(j10.f11588k.f46695a);
            if (b10 != -1 && k1Var.f(b10, this.f11555o, false).f2083c == k1Var.g(f0Var.f46695a, this.f11555o).f2083c) {
                return j10;
            }
            k1Var.g(f0Var.f46695a, this.f11555o);
            if (f0Var.b()) {
                j3 = this.f11555o.a(f0Var.f46696b, f0Var.f46697c);
            } else {
                j3 = this.f11555o.d;
            }
            u2.f0 f0Var4 = f0Var;
            g1 c12 = j10.d(f0Var4, j10.f11596s, j10.f11596s, j10.d, j3 - j10.f11596s, j10.h, j10.f11586i, j10.f11587j).c(f0Var4);
            c12.f11594q = j3;
            return c12;
        } else {
            u2.f0 f0Var5 = f0Var;
            e2.d.g(!f0Var5.b());
            long max = Math.max(0L, j10.f11595r - (longValue - Q2));
            long j11 = j10.f11594q;
            if (j10.f11588k.equals(j10.f11581b)) {
                j11 = longValue + max;
            }
            g1 d = j10.d(f0Var5, longValue, longValue, longValue, max, j10.h, j10.f11586i, j10.f11587j);
            d.f11594q = j11;
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
        int g12 = g1(this.f11547j0);
        if (g12 == -1) {
            return 0;
        }
        return g12;
    }

    public final Pair l1(b2.k1 k1Var, int i10, long j3) {
        if (k1Var.p()) {
            this.f11549k0 = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f11551l0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= k1Var.o()) {
            i10 = k1Var.a(this.G);
            j3 = e2.d0.e0(k1Var.m(i10, (b2.j1) this.f2068a, 0L).f2142l);
        }
        return k1Var.i((b2.j1) this.f2068a, this.f11555o, i10, e2.d0.Q(j3));
    }

    @Override
    public final int m() {
        B1();
        return 0;
    }

    public final void m1(int i10, int i11) {
        e2.w wVar = this.X;
        if (i10 == wVar.f8821a && i11 == wVar.f8822b) {
            return;
        }
        this.X = new e2.w(i10, i11);
        org.telegram.messenger.b1 b1Var = this.m0;
        if (b1Var != null) {
            b1Var.execute(new hg.n(this, i10, i11, 1));
            return;
        }
        this.f11552m.e(24, new eh.c(i10, i11, 1));
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
        this.f11552m.a(z0Var);
    }

    public final g1 n1(g1 g1Var, int i10, int i11) {
        int g12 = g1(g1Var);
        long e12 = e1(g1Var);
        b2.k1 k1Var = g1Var.f11580a;
        ArrayList arrayList = this.f11556p;
        int size = arrayList.size();
        this.H++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, i11);
        l1 l1Var = new l1(arrayList, this.M);
        g1 k12 = k1(g1Var, l1Var, h1(k1Var, l1Var, g12, e12));
        int i13 = k12.f11583e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && g12 >= k12.f11580a.o()) {
            k12 = j1(k12, 4);
        }
        u2.g1 g1Var2 = this.M;
        e2.z zVar = this.f11550l.f11701n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8824a = zVar.f8826a.obtainMessage(20, i10, i11, g1Var2);
        b10.b();
        return k12;
    }

    @Override
    public final boolean o() {
        B1();
        return this.f11547j0.f11581b.b();
    }

    @Override
    public final void o0(boolean z10) {
        B1();
    }

    public final void o1() {
        TextureView textureView = this.V;
        c0 c0Var = this.f11564y;
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
        for (f fVar : this.f11541g) {
            if (i10 == -1 || fVar.f11521b == i10) {
                j1 d12 = d1(fVar);
                e2.d.g(!d12.f11634f);
                d12.f11632c = i11;
                e2.d.g(!d12.f11634f);
                d12.d = obj;
                d12.b();
            }
        }
        for (f fVar2 : this.h) {
            if (fVar2 != null && (i10 == -1 || fVar2.f11521b == i10)) {
                j1 d13 = d1(fVar2);
                e2.d.g(!d13.f11634f);
                d13.f11632c = i11;
                e2.d.g(!d13.f11634f);
                d13.d = obj;
                d13.b();
            }
        }
    }

    @Override
    public final void q(b2.q1 q1Var) {
        B1();
        x2.u uVar = this.f11544i;
        uVar.getClass();
        b2.q1 B0 = B0();
        if (!q1Var.equals(((x2.p) uVar).e())) {
            uVar.b(q1Var);
        }
        if (!B0.equals(q1Var)) {
            this.f11552m.e(19, new fi.f(q1Var, 6));
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
        return e2.d0.e0(this.f11547j0.f11595r);
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
        ArrayList arrayList = this.f11556p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.k1 w02 = w0();
            this.H++;
            e2.d0.P(i10, min, min2, arrayList);
            this.M = this.M.f();
            l1 l1Var = new l1(arrayList, this.M);
            g1 g1Var = this.f11547j0;
            g1 k12 = k1(g1Var, l1Var, h1(w02, l1Var, g1(g1Var), e1(this.f11547j0)));
            u2.g1 g1Var2 = this.M;
            o0 o0Var = this.f11550l;
            o0Var.getClass();
            o0Var.f11701n.a(19, new k0(i10, min, min2, g1Var2)).b();
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
        int g12 = g1(this.f11547j0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.f11556p;
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
            g1 k12 = k1(this.f11547j0, l1Var, l1(l1Var, i11, j10));
            i12 = k12.f11583e;
            if (i11 != -1 && i12 != 1) {
                i12 = (!l1Var.p() || i11 >= i15) ? 4 : 2;
            }
            j12 = j1(k12, i12);
            this.f11550l.f11701n.a(17, new j0(Z0, this.M, i11, e2.d0.Q(j10))).b();
            if (this.f11547j0.f11581b.f46695a.equals(j12.f11581b.f46695a) && !this.f11547j0.f11580a.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            z1(j12, 0, z11, 4, f1(j12), -1, false);
        } else {
            j10 = j3;
        }
        i11 = i13;
        g1 k122 = k1(this.f11547j0, l1Var, l1(l1Var, i11, j10));
        i12 = k122.f11583e;
        if (i11 != -1) {
            if (l1Var.p()) {
            }
        }
        j12 = j1(k122, i12);
        this.f11550l.f11701n.a(17, new j0(Z0, this.M, i11, e2.d0.Q(j10))).b();
        if (this.f11547j0.f11581b.f46695a.equals(j12.f11581b.f46695a)) {
        }
        z11 = false;
        z1(j12, 0, z11, 4, f1(j12), -1, false);
    }

    public final void s1(p1 p1Var) {
        B1();
        if (p1Var == null) {
            p1Var = p1.f11722e;
        }
        if (!this.L.equals(p1Var)) {
            this.L = p1Var;
            this.f11550l.f11701n.a(5, p1Var).b();
        }
    }

    @Override
    public final void stop() {
        B1();
        w1(null);
        this.f11533b0 = new d2.c(this.f11547j0.f11596s, e9.a1.f8948e);
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
        o0 o0Var = this.f11550l;
        if (!o0Var.X && o0Var.f11708s.getThread().isAlive()) {
            e2.g gVar = new e2.g(o0Var.F);
            o0Var.f11701n.a(30, new Pair(surface, gVar)).b();
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
            w1(new o(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final boolean u() {
        B1();
        return this.f11547j0.f11589l;
    }

    @Override
    public final int u0() {
        B1();
        return this.f11547j0.f11591n;
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
        holder.addCallback(this.f11564y);
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
        textureView.setSurfaceTextureListener(this.f11564y);
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
        return this.f11547j0.f11580a;
    }

    public final void w1(o oVar) {
        g1 g1Var = this.f11547j0;
        g1 c10 = g1Var.c(g1Var.f11581b);
        c10.f11594q = c10.f11596s;
        c10.f11595r = 0L;
        g1 j12 = j1(c10, 1);
        if (oVar != null) {
            j12 = j12.f(oVar);
        }
        g1 g1Var2 = j12;
        this.H++;
        e2.z zVar = this.f11550l.f11701n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8824a = zVar.f8826a.obtainMessage(6);
        b10.b();
        z1(g1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void x(boolean z10) {
        B1();
        if (this.G != z10) {
            this.G = z10;
            e2.z zVar = this.f11550l.f11701n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8824a = zVar.f8826a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            y yVar = new y(0, z10);
            e2.p pVar = this.f11552m;
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
        String str = e2.d0.f8765a;
        f0 f0Var = this.f11539f;
        boolean o9 = f0Var.o();
        boolean d02 = f0Var.d0();
        boolean Q0 = f0Var.Q0();
        boolean P0 = f0Var.P0();
        boolean M0 = f0Var.M0();
        boolean t02 = f0Var.t0();
        boolean p5 = f0Var.w0().p();
        ?? obj = new Object();
        obj.f2435a = new b2.p();
        b2.p pVar = (b2.p) obj.f2435a;
        pVar.c(this.f11534c.f2440a);
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
            this.f11552m.c(13, new x(this, 3));
        }
    }

    @Override
    public final Looper y0() {
        return this.f11560t;
    }

    public final void y1(int i10, boolean z10) {
        int i11;
        g1 g1Var = this.f11547j0;
        int i12 = g1Var.f11591n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (g1Var.f11589l == z10 && i12 == i11 && g1Var.f11590m == i10) {
            return;
        }
        this.H++;
        if (g1Var.f11593p) {
            g1Var = g1Var.a();
        }
        g1 e7 = g1Var.e(i10, i11, z10);
        e2.z zVar = this.f11550l.f11701n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8824a = zVar.f8826a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        b10.b();
        z1(e7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long z() {
        B1();
        return this.f11563x;
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
        g1 g1Var2 = this.f11547j0;
        this.f11547j0 = g1Var;
        boolean equals = g1Var2.f11580a.equals(g1Var.f11580a);
        b2.j1 j1Var = (b2.j1) this.f2068a;
        b2.h1 h1Var = this.f11555o;
        b2.k1 k1Var = g1Var2.f11580a;
        u2.f0 f0Var = g1Var2.f11581b;
        b2.k1 k1Var2 = g1Var.f11580a;
        u2.f0 f0Var2 = g1Var.f11581b;
        if (k1Var2.p() && k1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k1Var2.p() != k1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!k1Var.m(k1Var.g(f0Var.f46695a, h1Var).f2083c, j1Var, 0L).f2133a.equals(k1Var2.m(k1Var2.g(f0Var2.f46695a, h1Var).f2083c, j1Var, 0L).f2133a)) {
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
            if (!g1Var.f11580a.p()) {
                k0Var = g1Var.f11580a.m(g1Var.f11580a.g(g1Var.f11581b.f46695a, this.f11555o).f2083c, (b2.j1) this.f2068a, 0L).f2135c;
            } else {
                k0Var = null;
            }
            this.f11545i0 = b2.n0.K;
        } else {
            k0Var = null;
        }
        if (booleanValue || !g1Var2.f11587j.equals(g1Var.f11587j)) {
            b2.m0 a2 = this.f11545i0.a();
            List list = g1Var.f11587j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                b2.p0 p0Var = (b2.p0) list.get(i18);
                int i19 = 0;
                while (true) {
                    b2.o0[] o0VarArr = p0Var.f2261a;
                    if (i19 < o0VarArr.length) {
                        o0VarArr[i19].b(a2);
                        i19++;
                    }
                }
            }
            this.f11545i0 = new b2.n0(a2);
        }
        b2.n0 b12 = b1();
        boolean equals2 = b12.equals(this.O);
        this.O = b12;
        if (g1Var2.f11589l != g1Var.f11589l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g1Var2.f11583e != g1Var.f11583e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            A1();
        }
        if (g1Var2.f11585g != g1Var.f11585g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f11552m.c(0, new t(g1Var, i10, 0));
        }
        if (z10) {
            b2.h1 h1Var2 = new b2.h1();
            if (!g1Var2.f11580a.p()) {
                Object obj5 = g1Var2.f11581b.f46695a;
                g1Var2.f11580a.g(obj5, h1Var2);
                int i20 = h1Var2.f2083c;
                int b10 = g1Var2.f11580a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = g1Var2.f11580a.m(i20, (b2.j1) this.f2068a, 0L).f2133a;
                k0Var2 = ((b2.j1) this.f2068a).f2135c;
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
                if (g1Var2.f11581b.b()) {
                    u2.f0 f0Var3 = g1Var2.f11581b;
                    j12 = h1Var2.a(f0Var3.f46696b, f0Var3.f46697c);
                    i16 = i1(g1Var2);
                } else if (g1Var2.f11581b.f46698e != -1) {
                    j12 = i1(this.f11547j0);
                    i16 = j12;
                } else {
                    j10 = h1Var2.f2084e;
                    j11 = h1Var2.d;
                    j12 = j10 + j11;
                    i16 = j12;
                }
            } else if (g1Var2.f11581b.b()) {
                j12 = g1Var2.f11596s;
                i16 = i1(g1Var2);
            } else {
                j10 = h1Var2.f2084e;
                j11 = g1Var2.f11596s;
                j12 = j10 + j11;
                i16 = j12;
            }
            long e02 = e2.d0.e0(j12);
            long e03 = e2.d0.e0(i16);
            u2.f0 f0Var4 = g1Var2.f11581b;
            b2.a1 a1Var = new b2.a1(obj, i14, k0Var2, obj2, i15, e02, e03, f0Var4.f46696b, f0Var4.f46697c);
            b2.j1 j1Var2 = (b2.j1) this.f2068a;
            int l02 = l0();
            if (!this.f11547j0.f11580a.p()) {
                g1 g1Var3 = this.f11547j0;
                Object obj6 = g1Var3.f11581b.f46695a;
                g1Var3.f11580a.g(obj6, this.f11555o);
                int b11 = this.f11547j0.f11580a.b(obj6);
                Object obj7 = this.f11547j0.f11580a.m(l02, j1Var2, 0L).f2133a;
                k0Var3 = j1Var2.f2135c;
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
            if (this.f11547j0.f11581b.b()) {
                j13 = e2.d0.e0(i1(this.f11547j0));
            } else {
                j13 = e04;
            }
            u2.f0 f0Var5 = this.f11547j0.f11581b;
            this.f11552m.c(11, new c2(i11, a1Var, new b2.a1(obj3, l02, k0Var3, obj4, i17, e04, j13, f0Var5.f46696b, f0Var5.f46697c), 1));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f11552m.c(1, new t(k0Var, intValue, 1));
        }
        if (g1Var2.f11584f != g1Var.f11584f) {
            this.f11552m.c(10, new e2.m() {
                @Override
                public final void invoke(Object obj8) {
                    b2.z0 z0Var = (b2.z0) obj8;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
            if (g1Var.f11584f != null) {
                this.f11552m.c(10, new e2.m() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.z0 z0Var = (b2.z0) obj8;
                        switch (r2) {
                            case 0:
                                g1 g1Var4 = g1Var;
                                z0Var.onLoadingChanged(g1Var4.f11585g);
                                z0Var.onIsLoadingChanged(g1Var4.f11585g);
                                return;
                            case 1:
                                g1 g1Var5 = g1Var;
                                z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                                return;
                            case 2:
                                z0Var.onPlaybackStateChanged(g1Var.f11583e);
                                return;
                            case 3:
                                g1 g1Var6 = g1Var;
                                z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                                return;
                            case 4:
                                z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                                return;
                            case 5:
                                z0Var.onIsPlayingChanged(g1Var.m());
                                return;
                            case 6:
                                z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                                return;
                            case 7:
                                z0Var.onPlayerErrorChanged(g1Var.f11584f);
                                return;
                            case 8:
                                z0Var.onPlayerError(g1Var.f11584f);
                                return;
                            default:
                                z0Var.onTracksChanged(g1Var.f11586i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.v vVar = g1Var2.f11586i;
        x2.v vVar2 = g1Var.f11586i;
        if (vVar != vVar2) {
            x2.u uVar = this.f11544i;
            Object obj8 = vVar2.f48801e;
            uVar.getClass();
            uVar.f48797c = (x2.t) obj8;
            this.f11552m.c(2, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f11552m.c(14, new fi.f(this.O, 4));
        }
        if (z14) {
            this.f11552m.c(3, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f11552m.c(-1, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f11552m.c(4, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || g1Var2.f11590m != g1Var.f11590m) {
            this.f11552m.c(5, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.f11591n != g1Var.f11591n) {
            this.f11552m.c(6, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.m() != g1Var.m()) {
            this.f11552m.c(7, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        if (!g1Var2.f11592o.equals(g1Var.f11592o)) {
            this.f11552m.c(12, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            z0Var.onLoadingChanged(g1Var4.f11585g);
                            z0Var.onIsLoadingChanged(g1Var4.f11585g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            z0Var.onPlayerStateChanged(g1Var5.f11589l, g1Var5.f11583e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(g1Var.f11583e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            z0Var.onPlayWhenReadyChanged(g1Var6.f11589l, g1Var6.f11590m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(g1Var.f11591n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(g1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(g1Var.f11592o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(g1Var.f11584f);
                            return;
                        case 8:
                            z0Var.onPlayerError(g1Var.f11584f);
                            return;
                        default:
                            z0Var.onTracksChanged(g1Var.f11586i.d);
                            return;
                    }
                }
            });
        }
        x1();
        this.f11552m.b();
        if (g1Var2.f11593p != g1Var.f11593p) {
            Iterator it = this.f11553n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f11497a.A1();
            }
        }
    }
}
