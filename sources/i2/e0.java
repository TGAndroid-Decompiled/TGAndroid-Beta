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
import b2.q1;
import b2.s1;
import b2.x1;
import bi.g2;
import fg.e2;
import gg.v1;
import hi.y1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import m.g3;
import org.telegram.ui.Cells.r6;
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
    public final n1 K;
    public o1 L;
    public u2.i1 M;
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
    public boolean f10130a0;
    public final x2.v f10131b;
    public d2.c f10132b0;
    public final b2.x0 f10133c;
    public final boolean f10134c0;
    public final e2.g d;
    public boolean f10135d0;
    public final Context e;
    public final int f10136e0;
    public final e0 f10137f;
    public boolean f10138f0;
    public final f[] f10139g;
    public final b2.l f10140g0;
    public final f[] h;
    public x1 f10141h0;
    public final x2.u f10142i;
    public b2.n0 f10143i0;
    public final e2.z f10144j;
    public f1 f10145j0;
    public final w f10146k;
    public int f10147k0;
    public final n0 f10148l;
    public long f10149l0;
    public final e2.p f10150m;
    public org.telegram.messenger.e1 m0;
    public final CopyOnWriteArraySet f10151n;
    public final ArrayList f10152n0;
    public final b2.h1 f10153o;
    public final ArrayList f10154p;
    public final boolean f10155q;
    public final u2.f0 f10156r;
    public final j2.e f10157s;
    public final Looper f10158t;
    public final y2.c f10159u;
    public final long v;
    public final long f10160w;
    public final long f10161x;
    public final b0 f10162y;
    public final c0 f10163z;

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
        this.f10152n0 = new ArrayList();
        this.d = new e2.g();
        try {
            e2.a.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7188a + "]");
            Context context = pVar.f10321a;
            e2.x xVar = pVar.f10322b;
            this.e = context.getApplicationContext();
            this.f10157s = new j2.e(xVar);
            this.f10136e0 = pVar.f10326i;
            this.Y = pVar.f10327j;
            this.W = pVar.f10328k;
            this.f10130a0 = false;
            this.D = pVar.f10337t;
            b0 b0Var = new b0(this);
            this.f10162y = b0Var;
            this.f10163z = new Object();
            f[] b10 = ((l) pVar.f10323c.get()).b(new Handler(pVar.h), b0Var, b0Var, b0Var, b0Var);
            this.f10139g = b10;
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
                int i11 = this.f10139g[i10].f10174b;
                fVarArr[i10] = null;
                i10++;
            }
            x2.u uVar = (x2.u) pVar.e.get();
            this.f10142i = uVar;
            this.f10156r = (u2.f0) pVar.d.get();
            y2.f b11 = y2.f.b(pVar.f10325g.f10118b);
            this.f10159u = b11;
            this.f10155q = pVar.f10329l;
            this.L = pVar.f10330m;
            this.v = pVar.f10332o;
            this.f10160w = pVar.f10333p;
            this.f10161x = pVar.f10334q;
            this.K = pVar.f10331n;
            Looper looper = pVar.h;
            this.f10158t = looper;
            this.f10137f = this;
            this.f10150m = new e2.p(looper, xVar, new w(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f10151n = copyOnWriteArraySet;
            this.f10154p = new ArrayList();
            this.M = new u2.g1();
            f[] fVarArr2 = this.f10139g;
            x2.v vVar = new x2.v(new l1[fVarArr2.length], new x2.r[fVarArr2.length], s1.f2012b, null);
            this.f10131b = vVar;
            this.f10153o = new b2.h1();
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
            this.f10133c = new b2.x0(qVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < qVar.f1895a.size(); i13++) {
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
            this.f10144j = xVar.a(looper, null);
            w wVar = new w(this, 1);
            this.f10146k = wVar;
            this.f10145j0 = f1.k(vVar);
            this.f10157s.r(this, looper);
            j2.k kVar = new j2.k(pVar.f10339w);
            n0 n0Var = new n0(this.e, this.f10139g, this.h, uVar, vVar, (k) pVar.f10324f.get(), b11, this.F, this.G, this.f10157s, this.L, pVar.f10335r, pVar.f10336s, looper, xVar, wVar, kVar, this.f10163z);
            e2.z zVar = n0Var.f10298n;
            this.f10148l = n0Var;
            Looper looper2 = n0Var.f10305s;
            this.Z = 1.0f;
            this.F = 0;
            b2.n0 n0Var2 = b2.n0.K;
            this.O = n0Var2;
            this.P = n0Var2;
            this.f10143i0 = n0Var2;
            this.f10147k0 = -1;
            this.f10132b0 = d2.c.d;
            this.f10134c0 = true;
            n0(this.f10157s);
            Handler handler = new Handler(looper);
            j2.e eVar = this.f10157s;
            b11.getClass();
            eVar.getClass();
            g3 g3Var = b11.f46423c;
            g3Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) g3Var.f13018b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.f46408b == eVar) {
                    bVar.f46409c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, eVar));
            copyOnWriteArraySet.add(this.f10162y);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.e;
                    boolean z11 = pVar.f10338u;
                    e2.z a10 = xVar.a(n0Var.f10305s, null);
                    callback = null;
                    g2 g2Var = new g2(context2, z11, this, kVar, 4);
                    e0Var2 = this;
                    try {
                        a10.c(g2Var);
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
                cVar.i(new v1(e0Var, 11));
                Context context3 = pVar.f10321a;
                Looper looper3 = pVar.h;
                b0 b0Var2 = e0Var.f10162y;
                ?? obj = new Object();
                obj.f6101b = context3.getApplicationContext();
                obj.d = xVar.a(looper2, callback);
                obj.f6102c = new b(obj, xVar.a(looper3, callback), b0Var2);
                e0Var.A = obj;
                obj.t();
                e0Var.B = new c3.k0(context, looper2, xVar, 2);
                e0Var.C = new c3.k0(context, looper2, xVar, 3);
                e0Var.f10140g0 = b2.l.f1777c;
                e0Var.f10141h0 = x1.d;
                e0Var.X = e2.w.f7237c;
                zVar.a(38, e0Var.K).b();
                b2.e eVar2 = e0Var.Y;
                e2.y b12 = e2.z.b();
                b12.f7241a = zVar.f7243a.obtainMessage(31, 0, 0, eVar2);
                b12.b();
                e0Var.p1(1, 3, e0Var.Y);
                e0Var.p1(2, 4, Integer.valueOf(e0Var.W));
                e0Var.p1(2, 5, 0);
                e0Var.p1(1, 9, Boolean.valueOf(e0Var.f10130a0));
                e0Var.p1(6, 8, e0Var.f10163z);
                e0Var.p1(-1, 16, Integer.valueOf(e0Var.f10136e0));
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

    public static long i1(f1 f1Var) {
        b2.j1 j1Var = new b2.j1();
        b2.h1 h1Var = new b2.h1();
        f1Var.f10187a.g(f1Var.f10188b.f42324a, h1Var);
        long j3 = f1Var.f10189c;
        if (j3 == -9223372036854775807L) {
            return f1Var.f10187a.m(h1Var.f1707c, j1Var, 0L).f1759l;
        }
        return h1Var.e + j3;
    }

    public static f1 j1(f1 f1Var, int i10) {
        f1 h = f1Var.h(i10);
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
                boolean z11 = this.f10145j0.f10199p;
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
        if (this.f10145j0.f10187a.p()) {
            return 0;
        }
        f1 f1Var = this.f10145j0;
        return f1Var.f10187a.b(f1Var.f10188b.f42324a);
    }

    @Override
    public final q1 B0() {
        B1();
        return ((x2.p) this.f10142i).e();
    }

    public final void B1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f10158t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.d0.f7188a;
            Locale locale = Locale.US;
            String j3 = r6.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f10134c0) {
                if (this.f10135d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.o("ExoPlayerImpl", j3, illegalStateException);
                this.f10135d0 = true;
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
        this.f10150m.e(15, new w(this, 4));
    }

    @Override
    public final long C0() {
        B1();
        if (this.f10145j0.f10187a.p()) {
            return this.f10149l0;
        }
        f1 f1Var = this.f10145j0;
        long j3 = 0;
        if (f1Var.f10194k.d != f1Var.f10188b.d) {
            return e2.d0.e0(f1Var.f10187a.m(l0(), (b2.j1) this.f1693a, 0L).f1760m);
        }
        long j10 = f1Var.f10200q;
        if (this.f10145j0.f10194k.b()) {
            f1 f1Var2 = this.f10145j0;
            f1Var2.f10187a.g(f1Var2.f10194k.f42324a, this.f10153o).d(this.f10145j0.f10194k.f42325b);
        } else {
            j3 = j10;
        }
        f1 f1Var3 = this.f10145j0;
        b2.k1 k1Var = f1Var3.f10187a;
        Object obj = f1Var3.f10194k.f42324a;
        b2.h1 h1Var = this.f10153o;
        k1Var.g(obj, h1Var);
        return e2.d0.e0(j3 + h1Var.e);
    }

    @Override
    public final void D(b2.z0 z0Var) {
        B1();
        e2.p pVar = this.f10150m;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.o oVar = (e2.o) it.next();
            if (oVar.f7213a.equals(z0Var)) {
                e2.n nVar = pVar.f7218c;
                oVar.d = true;
                if (oVar.f7215c) {
                    oVar.f7215c = false;
                    nVar.a(oVar.f7213a, oVar.f7214b.d());
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
        return this.f10141h0;
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
        return e2.d0.e0(f1(this.f10145j0));
    }

    @Override
    public final b2.l K() {
        B1();
        return this.f10140g0;
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        B1();
        if (this.f10138f0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, eVar);
        e2.p pVar = this.f10150m;
        if (!equals) {
            this.Y = eVar;
            p1(1, 3, eVar);
            pVar.c(20, new y1(eVar, 8));
        }
        b2.e eVar2 = this.Y;
        e2.z zVar = this.f10148l.f10298n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7241a = zVar.f7243a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
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
            return this.f10145j0.f10188b.f42326c;
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
        ArrayList arrayList = this.f10154p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((d0) arrayList.get(i12)).f10120b.f42441k.a((b2.k0) list.get(i12 - i10))) {
                }
            }
            this.H++;
            e2.z zVar = this.f10148l.f10298n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7241a = zVar.f7243a.obtainMessage(27, i10, min, list);
            b10.b();
            for (int i13 = i10; i13 < min; i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                d0Var.f10121c = new j1(d0Var.f10121c, (b2.k0) list.get(i13 - i10));
            }
            z1(this.f10145j0.j(new k1(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList c12 = c1(list);
        if (arrayList.isEmpty()) {
            if (this.f10147k0 == -1) {
                z11 = true;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        f1 n12 = n1(a1(this.f10145j0, min, c12), i10, min);
        z1(n12, 0, !n12.f10188b.f42324a.equals(this.f10145j0.f10188b.f42324a), 4, f1(n12), -1, false);
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
        int size = this.f10154p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            f1 n12 = n1(this.f10145j0, i10, min);
            z1(n12, 0, !n12.f10188b.f42324a.equals(this.f10145j0.f10188b.f42324a), 4, f1(n12), -1, false);
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
        this.f10148l.f10298n.a(32, Float.valueOf(g10)).b();
        this.f10150m.e(22, new e2.m() {
            @Override
            public final void invoke(Object obj) {
                ((b2.z0) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override
    public final void U0() {
        boolean z10;
        e2.a.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f7188a + "] [" + b2.l0.b() + "]");
        B1();
        this.A.t();
        this.B.a(false);
        this.C.a(false);
        n0 n0Var = this.f10148l;
        if (!n0Var.X && n0Var.f10305s.getThread().isAlive()) {
            n0Var.X = true;
            e2.g gVar = new e2.g(n0Var.F);
            n0Var.f10298n.a(7, gVar).b();
            z10 = gVar.c(n0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f10150m.e(10, new i0.b(4));
        }
        this.f10150m.d();
        this.f10144j.f7243a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f10159u;
        j2.e eVar = this.f10157s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f46423c.f13018b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f46408b == eVar) {
                bVar.f46409c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        f1 f1Var = this.f10145j0;
        if (f1Var.f10199p) {
            this.f10145j0 = f1Var.a();
        }
        f1 j12 = j1(this.f10145j0, 1);
        this.f10145j0 = j12;
        f1 c10 = j12.c(j12.f10188b);
        this.f10145j0 = c10;
        c10.f10200q = c10.f10202s;
        this.f10145j0.f10201r = 0L;
        j2.e eVar2 = this.f10157s;
        e2.z zVar = eVar2.f11466n;
        e2.d.h(zVar);
        zVar.c(new v1(eVar2, 14));
        o1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.f10132b0 = d2.c.d;
        this.f10138f0 = true;
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
            b2.k1 k1Var = this.f10145j0.f10187a;
            if (!k1Var.p() && i10 >= k1Var.o()) {
                return;
            }
            j2.e eVar = this.f10157s;
            if (!eVar.f11467r) {
                j2.a l4 = eVar.l();
                eVar.f11467r = true;
                eVar.q(l4, -1, new y1(l4, 15));
            }
            this.H++;
            if (o()) {
                e2.a.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                k0 k0Var = new k0(this.f10145j0);
                k0Var.f(1);
                e0 e0Var = this.f10146k.f10393b;
                e0Var.f10144j.c(new fg.s1(19, e0Var, k0Var));
                return;
            }
            f1 f1Var = this.f10145j0;
            int i11 = f1Var.e;
            if (i11 == 3 || (i11 == 4 && !k1Var.p())) {
                f1Var = this.f10145j0.h(2);
            }
            int l02 = l0();
            f1 k12 = k1(f1Var, k1Var, l1(k1Var, i10, j3));
            this.f10148l.f10298n.a(3, new m0(k1Var, i10, e2.d0.Q(j3))).b();
            z1(k12, 0, true, 1, f1(k12), l02, z10);
        }
    }

    @Override
    public final b2.u0 W() {
        B1();
        return this.f10145j0.f10190f;
    }

    @Override
    public final void X(boolean z10) {
        B1();
        y1(1, z10);
    }

    @Override
    public final long Z() {
        B1();
        return this.f10160w;
    }

    public final ArrayList Z0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            d1 d1Var = new d1((u2.a) list.get(i11), this.f10155q);
            arrayList.add(d1Var);
            d0 d0Var = new d0(d1Var.f10123b, d1Var.f10122a);
            this.f10154p.add(i11 + i10, d0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    @Override
    public final long a0() {
        B1();
        return e1(this.f10145j0);
    }

    public final f1 a1(f1 f1Var, int i10, ArrayList arrayList) {
        b2.k1 k1Var = f1Var.f10187a;
        this.H++;
        ArrayList Z0 = Z0(i10, arrayList);
        k1 k1Var2 = new k1(this.f10154p, this.M);
        f1 k12 = k1(f1Var, k1Var2, h1(k1Var, k1Var2, g1(f1Var), e1(f1Var)));
        u2.i1 i1Var = this.M;
        e2.z zVar = this.f10148l.f10298n;
        i0 i0Var = new i0(Z0, i1Var, -1, -9223372036854775807L);
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7241a = zVar.f7243a.obtainMessage(18, i10, 0, i0Var);
        b10.b();
        return k12;
    }

    @Override
    public final void b() {
        int i10;
        B1();
        f1 f1Var = this.f10145j0;
        if (f1Var.e != 1) {
            return;
        }
        f1 f7 = f1Var.f(null);
        if (f7.f10187a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        f1 j12 = j1(f7, i10);
        this.H++;
        e2.z zVar = this.f10148l.f10298n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7241a = zVar.f7243a.obtainMessage(29);
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
        ArrayList arrayList = this.f10154p;
        int min = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.f10147k0 != -1) {
                z11 = false;
            }
            B1();
            r1(-9223372036854775807L, c12, z11, -1);
            return;
        }
        z1(a1(this.f10145j0, min, c12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.n0 b1() {
        byte[] bArr;
        boolean z10;
        b2.k1 w02 = w0();
        if (w02.p()) {
            return this.f10143i0;
        }
        b2.k0 k0Var = w02.m(l0(), (b2.j1) this.f1693a, 0L).f1753c;
        b2.m0 a2 = this.f10143i0.a();
        b2.n0 n0Var = k0Var.d;
        if (n0Var != null) {
            e9.i0 i0Var = n0Var.J;
            byte[] bArr2 = n0Var.f1842k;
            CharSequence charSequence = n0Var.f1835a;
            if (charSequence != null) {
                a2.f1788a = charSequence;
            }
            CharSequence charSequence2 = n0Var.f1836b;
            if (charSequence2 != null) {
                a2.f1789b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.f1837c;
            if (charSequence3 != null) {
                a2.f1790c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f1838f;
            if (charSequence6 != null) {
                a2.f1791f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.f1839g;
            if (charSequence7 != null) {
                a2.f1792g = charSequence7;
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
            b2.c1 c1Var = n0Var.f1840i;
            if (c1Var != null) {
                a2.f1793i = c1Var;
            }
            b2.c1 c1Var2 = n0Var.f1841j;
            if (c1Var2 != null) {
                a2.f1794j = c1Var2;
            }
            Uri uri = n0Var.f1844m;
            if (uri != null || bArr2 != null) {
                a2.f1797m = uri;
                Integer num = n0Var.f1843l;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a2.f1795k = bArr;
                a2.f1796l = num;
            }
            Integer num2 = n0Var.f1845n;
            if (num2 != null) {
                a2.f1798n = num2;
            }
            Integer num3 = n0Var.f1846o;
            if (num3 != null) {
                a2.f1799o = num3;
            }
            Integer num4 = n0Var.f1847p;
            if (num4 != null) {
                a2.f1800p = num4;
            }
            Boolean bool = n0Var.f1848q;
            if (bool != null) {
                a2.f1801q = bool;
            }
            Boolean bool2 = n0Var.f1849r;
            if (bool2 != null) {
                a2.f1802r = bool2;
            }
            Integer num5 = n0Var.f1850s;
            if (num5 != null) {
                a2.f1803s = num5;
            }
            Integer num6 = n0Var.f1851t;
            if (num6 != null) {
                a2.f1803s = num6;
            }
            Integer num7 = n0Var.f1852u;
            if (num7 != null) {
                a2.f1804t = num7;
            }
            Integer num8 = n0Var.v;
            if (num8 != null) {
                a2.f1805u = num8;
            }
            Integer num9 = n0Var.f1853w;
            if (num9 != null) {
                a2.v = num9;
            }
            Integer num10 = n0Var.f1854x;
            if (num10 != null) {
                a2.f1806w = num10;
            }
            Integer num11 = n0Var.f1855y;
            if (num11 != null) {
                a2.f1807x = num11;
            }
            CharSequence charSequence8 = n0Var.f1856z;
            if (charSequence8 != null) {
                a2.f1808y = charSequence8;
            }
            CharSequence charSequence9 = n0Var.A;
            if (charSequence9 != null) {
                a2.f1809z = charSequence9;
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
        return this.f10145j0.f10191g;
    }

    @Override
    public final long c0() {
        B1();
        if (o()) {
            f1 f1Var = this.f10145j0;
            if (f1Var.f10194k.equals(f1Var.f10188b)) {
                return e2.d0.e0(this.f10145j0.f10200q);
            }
            return getDuration();
        }
        return C0();
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f10156r.a((b2.k0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final int d() {
        B1();
        return this.f10145j0.e;
    }

    public final i1 d1(h1 h1Var) {
        int i10;
        int g12 = g1(this.f10145j0);
        b2.k1 k1Var = this.f10145j0.f10187a;
        if (g12 == -1) {
            i10 = 0;
        } else {
            i10 = g12;
        }
        n0 n0Var = this.f10148l;
        return new i1(n0Var, h1Var, k1Var, i10, n0Var.f10305s);
    }

    public final long e1(f1 f1Var) {
        u2.g0 g0Var = f1Var.f10188b;
        long j3 = f1Var.f10189c;
        b2.k1 k1Var = f1Var.f10187a;
        if (g0Var.b()) {
            Object obj = f1Var.f10188b.f42324a;
            b2.h1 h1Var = this.f10153o;
            k1Var.g(obj, h1Var);
            if (j3 == -9223372036854775807L) {
                return e2.d0.e0(k1Var.m(g1(f1Var), (b2.j1) this.f1693a, 0L).f1759l);
            }
            return e2.d0.e0(j3) + e2.d0.e0(h1Var.e);
        }
        return e2.d0.e0(f1(f1Var));
    }

    @Override
    public final void f(b2.v0 v0Var) {
        B1();
        if (this.f10145j0.f10198o.equals(v0Var)) {
            return;
        }
        f1 g10 = this.f10145j0.g(v0Var);
        this.H++;
        this.f10148l.f10298n.a(4, v0Var).b();
        z1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void f0(int i10) {
        B1();
    }

    public final long f1(f1 f1Var) {
        long j3;
        if (f1Var.f10187a.p()) {
            return e2.d0.Q(this.f10149l0);
        }
        if (f1Var.f10199p) {
            j3 = f1Var.l();
        } else {
            j3 = f1Var.f10202s;
        }
        if (f1Var.f10188b.b()) {
            return j3;
        }
        b2.k1 k1Var = f1Var.f10187a;
        Object obj = f1Var.f10188b.f42324a;
        b2.h1 h1Var = this.f10153o;
        k1Var.g(obj, h1Var);
        return j3 + h1Var.e;
    }

    @Override
    public final s1 g0() {
        B1();
        return this.f10145j0.f10192i.d;
    }

    public final int g1(f1 f1Var) {
        if (f1Var.f10187a.p()) {
            return this.f10147k0;
        }
        return f1Var.f10187a.g(f1Var.f10188b.f42324a, this.f10153o).f1707c;
    }

    @Override
    public final long getDuration() {
        B1();
        if (o()) {
            f1 f1Var = this.f10145j0;
            u2.g0 g0Var = f1Var.f10188b;
            b2.k1 k1Var = f1Var.f10187a;
            Object obj = g0Var.f42324a;
            b2.h1 h1Var = this.f10153o;
            k1Var.g(obj, h1Var);
            return e2.d0.e0(h1Var.a(g0Var.f42325b, g0Var.f42326c));
        }
        return A();
    }

    @Override
    public final b2.v0 h() {
        B1();
        return this.f10145j0.f10198o;
    }

    @Override
    public final b2.n0 h0() {
        B1();
        return this.P;
    }

    public final Pair h1(b2.k1 k1Var, k1 k1Var2, int i10, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        if (!k1Var.p() && !k1Var2.p()) {
            Pair i12 = k1Var.i((b2.j1) this.f1693a, this.f10153o, i10, e2.d0.Q(j3));
            Object obj = i12.first;
            if (k1Var2.b(obj) != -1) {
                return i12;
            }
            int U = n0.U((b2.j1) this.f1693a, this.f10153o, this.F, this.G, obj, k1Var, k1Var2);
            if (U != -1) {
                b2.j1 j1Var = (b2.j1) this.f1693a;
                k1Var2.m(U, j1Var, 0L);
                return l1(k1Var2, U, e2.d0.e0(j1Var.f1759l));
            }
            return l1(k1Var2, -1, -9223372036854775807L);
        }
        if (!k1Var.p() && k1Var2.p()) {
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
        return l1(k1Var2, i11, j10);
    }

    @Override
    public final void j(int i10) {
        B1();
        if (this.F != i10) {
            this.F = i10;
            e2.z zVar = this.f10148l.f10298n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7241a = zVar.f7243a.obtainMessage(11, i10, 0);
            b10.b();
            v vVar = new v(i10, 0);
            e2.p pVar = this.f10150m;
            pVar.c(8, vVar);
            x1();
            pVar.b();
        }
    }

    @Override
    public final d2.c j0() {
        B1();
        return this.f10132b0;
    }

    @Override
    public final int k0() {
        B1();
        if (o()) {
            return this.f10145j0.f10188b.f42325b;
        }
        return -1;
    }

    public final f1 k1(f1 f1Var, b2.k1 k1Var, Pair pair) {
        boolean z10;
        u2.g0 g0Var;
        u2.q1 q1Var;
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
        b2.k1 k1Var2 = f1Var.f10187a;
        long e12 = e1(f1Var);
        f1 j10 = f1Var.j(k1Var);
        if (k1Var.p()) {
            u2.g0 g0Var2 = f1.f10186u;
            long Q = e2.d0.Q(this.f10149l0);
            f1 c10 = j10.d(g0Var2, Q, Q, Q, 0L, u2.q1.d, this.f10131b, e9.a1.e).c(g0Var2);
            c10.f10200q = c10.f10202s;
            return c10;
        }
        Object obj = j10.f10188b.f42324a;
        String str = e2.d0.f7188a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new u2.g0(pair.first);
        } else {
            g0Var = j10.f10188b;
        }
        long longValue = ((Long) pair.second).longValue();
        long Q2 = e2.d0.Q(e12);
        if (!k1Var2.p()) {
            Q2 -= k1Var2.g(obj, this.f10153o).e;
        }
        if (!equals || longValue < Q2) {
            u2.g0 g0Var3 = g0Var;
            e2.d.g(!g0Var3.b());
            if (!equals) {
                q1Var = u2.q1.d;
            } else {
                q1Var = j10.h;
            }
            u2.q1 q1Var2 = q1Var;
            if (!equals) {
                vVar = this.f10131b;
            } else {
                vVar = j10.f10192i;
            }
            x2.v vVar2 = vVar;
            if (!equals) {
                e9.g0 g0Var4 = e9.i0.f7384b;
                list = e9.a1.e;
            } else {
                list = j10.f10193j;
            }
            f1 c11 = j10.d(g0Var3, longValue, longValue, longValue, 0L, q1Var2, vVar2, list).c(g0Var3);
            c11.f10200q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = k1Var.b(j10.f10194k.f42324a);
            if (b10 != -1 && k1Var.f(b10, this.f10153o, false).f1707c == k1Var.g(g0Var.f42324a, this.f10153o).f1707c) {
                return j10;
            }
            k1Var.g(g0Var.f42324a, this.f10153o);
            if (g0Var.b()) {
                j3 = this.f10153o.a(g0Var.f42325b, g0Var.f42326c);
            } else {
                j3 = this.f10153o.d;
            }
            u2.g0 g0Var5 = g0Var;
            f1 c12 = j10.d(g0Var5, j10.f10202s, j10.f10202s, j10.d, j3 - j10.f10202s, j10.h, j10.f10192i, j10.f10193j).c(g0Var5);
            c12.f10200q = j3;
            return c12;
        } else {
            u2.g0 g0Var6 = g0Var;
            e2.d.g(!g0Var6.b());
            long max = Math.max(0L, j10.f10201r - (longValue - Q2));
            long j11 = j10.f10200q;
            if (j10.f10194k.equals(j10.f10188b)) {
                j11 = longValue + max;
            }
            f1 d = j10.d(g0Var6, longValue, longValue, longValue, max, j10.h, j10.f10192i, j10.f10193j);
            d.f10200q = j11;
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
        int g12 = g1(this.f10145j0);
        if (g12 == -1) {
            return 0;
        }
        return g12;
    }

    public final Pair l1(b2.k1 k1Var, int i10, long j3) {
        if (k1Var.p()) {
            this.f10147k0 = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f10149l0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= k1Var.o()) {
            i10 = k1Var.a(this.G);
            j3 = e2.d0.e0(k1Var.m(i10, (b2.j1) this.f1693a, 0L).f1759l);
        }
        return k1Var.i((b2.j1) this.f1693a, this.f10153o, i10, e2.d0.Q(j3));
    }

    @Override
    public final int m() {
        B1();
        return 0;
    }

    public final void m1(int i10, int i11) {
        e2.w wVar = this.X;
        if (i10 == wVar.f7238a && i11 == wVar.f7239b) {
            return;
        }
        this.X = new e2.w(i10, i11);
        org.telegram.messenger.e1 e1Var = this.m0;
        if (e1Var != null) {
            e1Var.execute(new fg.n(this, i10, i11, 1));
            return;
        }
        this.f10150m.e(24, new ch.c(i10, i11, 1));
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
        this.f10150m.a(z0Var);
    }

    public final f1 n1(f1 f1Var, int i10, int i11) {
        int g12 = g1(f1Var);
        long e12 = e1(f1Var);
        b2.k1 k1Var = f1Var.f10187a;
        ArrayList arrayList = this.f10154p;
        int size = arrayList.size();
        this.H++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, i11);
        k1 k1Var2 = new k1(arrayList, this.M);
        f1 k12 = k1(f1Var, k1Var2, h1(k1Var, k1Var2, g12, e12));
        int i13 = k12.e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && g12 >= k12.f10187a.o()) {
            k12 = j1(k12, 4);
        }
        u2.i1 i1Var = this.M;
        e2.z zVar = this.f10148l.f10298n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7241a = zVar.f7243a.obtainMessage(20, i10, i11, i1Var);
        b10.b();
        return k12;
    }

    @Override
    public final boolean o() {
        B1();
        return this.f10145j0.f10188b.b();
    }

    @Override
    public final void o0(boolean z10) {
        B1();
    }

    public final void o1() {
        TextureView textureView = this.V;
        b0 b0Var = this.f10162y;
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
        for (f fVar : this.f10139g) {
            if (i10 == -1 || fVar.f10174b == i10) {
                i1 d12 = d1(fVar);
                e2.d.g(!d12.f10236f);
                d12.f10235c = i11;
                e2.d.g(!d12.f10236f);
                d12.d = obj;
                d12.b();
            }
        }
        for (f fVar2 : this.h) {
            if (fVar2 != null && (i10 == -1 || fVar2.f10174b == i10)) {
                i1 d13 = d1(fVar2);
                e2.d.g(!d13.f10236f);
                d13.f10235c = i11;
                e2.d.g(!d13.f10236f);
                d13.d = obj;
                d13.b();
            }
        }
    }

    @Override
    public final void q(q1 q1Var) {
        B1();
        x2.u uVar = this.f10142i;
        uVar.getClass();
        q1 B0 = B0();
        if (!q1Var.equals(((x2.p) uVar).e())) {
            uVar.b(q1Var);
        }
        if (!B0.equals(q1Var)) {
            this.f10150m.e(19, new y1(q1Var, 9));
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
        return e2.d0.e0(this.f10145j0.f10201r);
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
        ArrayList arrayList = this.f10154p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.k1 w02 = w0();
            this.H++;
            e2.d0.P(i10, min, min2, arrayList);
            this.M = this.M.f();
            k1 k1Var = new k1(arrayList, this.M);
            f1 f1Var = this.f10145j0;
            f1 k12 = k1(f1Var, k1Var, h1(w02, k1Var, g1(f1Var), e1(this.f10145j0)));
            u2.i1 i1Var = this.M;
            n0 n0Var = this.f10148l;
            n0Var.getClass();
            n0Var.f10298n.a(19, new j0(i10, min, min2, i1Var)).b();
            z1(k12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void r1(long j3, List list, boolean z10, int i10) {
        long j10;
        int i11;
        int i12;
        f1 j12;
        boolean z11;
        int i13 = i10;
        int g12 = g1(this.f10145j0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.f10154p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i14 = size - 1; i14 >= 0; i14--) {
                arrayList.remove(i14);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Z0 = Z0(0, list);
        k1 k1Var = new k1(arrayList, this.M);
        boolean p5 = k1Var.p();
        int i15 = k1Var.h;
        if (!p5 && i13 >= i15) {
            throw new IllegalStateException();
        }
        if (z10) {
            i13 = k1Var.a(this.G);
            j10 = -9223372036854775807L;
        } else if (i13 == -1) {
            i11 = g12;
            j10 = J0;
            f1 k12 = k1(this.f10145j0, k1Var, l1(k1Var, i11, j10));
            i12 = k12.e;
            if (i11 != -1 && i12 != 1) {
                i12 = (!k1Var.p() || i11 >= i15) ? 4 : 2;
            }
            j12 = j1(k12, i12);
            this.f10148l.f10298n.a(17, new i0(Z0, this.M, i11, e2.d0.Q(j10))).b();
            if (this.f10145j0.f10188b.f42324a.equals(j12.f10188b.f42324a) && !this.f10145j0.f10187a.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            z1(j12, 0, z11, 4, f1(j12), -1, false);
        } else {
            j10 = j3;
        }
        i11 = i13;
        f1 k122 = k1(this.f10145j0, k1Var, l1(k1Var, i11, j10));
        i12 = k122.e;
        if (i11 != -1) {
            if (k1Var.p()) {
            }
        }
        j12 = j1(k122, i12);
        this.f10148l.f10298n.a(17, new i0(Z0, this.M, i11, e2.d0.Q(j10))).b();
        if (this.f10145j0.f10188b.f42324a.equals(j12.f10188b.f42324a)) {
        }
        z11 = false;
        z1(j12, 0, z11, 4, f1(j12), -1, false);
    }

    public final void s1(o1 o1Var) {
        B1();
        if (o1Var == null) {
            o1Var = o1.e;
        }
        if (!this.L.equals(o1Var)) {
            this.L = o1Var;
            this.f10148l.f10298n.a(5, o1Var).b();
        }
    }

    @Override
    public final void stop() {
        B1();
        w1(null);
        this.f10132b0 = new d2.c(this.f10145j0.f10202s, e9.a1.e);
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
        n0 n0Var = this.f10148l;
        if (!n0Var.X && n0Var.f10305s.getThread().isAlive()) {
            e2.g gVar = new e2.g(n0Var.F);
            n0Var.f10298n.a(30, new Pair(surface, gVar)).b();
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
        return this.f10145j0.f10195l;
    }

    @Override
    public final int u0() {
        B1();
        return this.f10145j0.f10197n;
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
        holder.addCallback(this.f10162y);
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
        textureView.setSurfaceTextureListener(this.f10162y);
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
        return this.f10145j0.f10187a;
    }

    public final void w1(n nVar) {
        f1 f1Var = this.f10145j0;
        f1 c10 = f1Var.c(f1Var.f10188b);
        c10.f10200q = c10.f10202s;
        c10.f10201r = 0L;
        f1 j12 = j1(c10, 1);
        if (nVar != null) {
            j12 = j12.f(nVar);
        }
        f1 f1Var2 = j12;
        this.H++;
        e2.z zVar = this.f10148l.f10298n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7241a = zVar.f7243a.obtainMessage(6);
        b10.b();
        z1(f1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void x(boolean z10) {
        B1();
        if (this.G != z10) {
            this.G = z10;
            e2.z zVar = this.f10148l.f10298n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7241a = zVar.f7243a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            x xVar = new x(0, z10);
            e2.p pVar = this.f10150m;
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
        String str = e2.d0.f7188a;
        e0 e0Var = this.f10137f;
        boolean o9 = e0Var.o();
        boolean d02 = e0Var.d0();
        boolean Q0 = e0Var.Q0();
        boolean P0 = e0Var.P0();
        boolean M0 = e0Var.M0();
        boolean t02 = e0Var.t0();
        boolean p5 = e0Var.w0().p();
        ?? obj = new Object();
        obj.f2037a = new b2.p();
        b2.p pVar = (b2.p) obj.f2037a;
        pVar.c(this.f10133c.f2042a);
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
            this.f10150m.c(13, new w(this, 3));
        }
    }

    @Override
    public final Looper y0() {
        return this.f10158t;
    }

    public final void y1(int i10, boolean z10) {
        int i11;
        f1 f1Var = this.f10145j0;
        int i12 = f1Var.f10197n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (f1Var.f10195l == z10 && i12 == i11 && f1Var.f10196m == i10) {
            return;
        }
        this.H++;
        if (f1Var.f10199p) {
            f1Var = f1Var.a();
        }
        f1 e = f1Var.e(i10, i11, z10);
        e2.z zVar = this.f10148l.f10298n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f7241a = zVar.f7243a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        b10.b();
        z1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long z() {
        B1();
        return this.f10161x;
    }

    @Override
    public final void z0() {
        B1();
    }

    public final void z1(final f1 f1Var, int i10, boolean z10, int i11, long j3, int i12, boolean z11) {
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
        f1 f1Var2 = this.f10145j0;
        this.f10145j0 = f1Var;
        boolean equals = f1Var2.f10187a.equals(f1Var.f10187a);
        b2.j1 j1Var = (b2.j1) this.f1693a;
        b2.h1 h1Var = this.f10153o;
        b2.k1 k1Var = f1Var2.f10187a;
        u2.g0 g0Var = f1Var2.f10188b;
        b2.k1 k1Var2 = f1Var.f10187a;
        u2.g0 g0Var2 = f1Var.f10188b;
        if (k1Var2.p() && k1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k1Var2.p() != k1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!k1Var.m(k1Var.g(g0Var.f42324a, h1Var).f1707c, j1Var, 0L).f1751a.equals(k1Var2.m(k1Var2.g(g0Var2.f42324a, h1Var).f1707c, j1Var, 0L).f1751a)) {
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
        } else if (z10 && i11 == 0 && g0Var.d < g0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i11 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!f1Var.f10187a.p()) {
                k0Var = f1Var.f10187a.m(f1Var.f10187a.g(f1Var.f10188b.f42324a, this.f10153o).f1707c, (b2.j1) this.f1693a, 0L).f1753c;
            } else {
                k0Var = null;
            }
            this.f10143i0 = b2.n0.K;
        } else {
            k0Var = null;
        }
        if (booleanValue || !f1Var2.f10193j.equals(f1Var.f10193j)) {
            b2.m0 a2 = this.f10143i0.a();
            List list = f1Var.f10193j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                b2.p0 p0Var = (b2.p0) list.get(i18);
                int i19 = 0;
                while (true) {
                    b2.o0[] o0VarArr = p0Var.f1871a;
                    if (i19 < o0VarArr.length) {
                        o0VarArr[i19].b(a2);
                        i19++;
                    }
                }
            }
            this.f10143i0 = new b2.n0(a2);
        }
        b2.n0 b12 = b1();
        boolean equals2 = b12.equals(this.O);
        this.O = b12;
        if (f1Var2.f10195l != f1Var.f10195l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (f1Var2.e != f1Var.e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            A1();
        }
        if (f1Var2.f10191g != f1Var.f10191g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f10150m.c(0, new s(f1Var, i10, 0));
        }
        if (z10) {
            b2.h1 h1Var2 = new b2.h1();
            if (!f1Var2.f10187a.p()) {
                Object obj5 = f1Var2.f10188b.f42324a;
                f1Var2.f10187a.g(obj5, h1Var2);
                int i20 = h1Var2.f1707c;
                int b10 = f1Var2.f10187a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = f1Var2.f10187a.m(i20, (b2.j1) this.f1693a, 0L).f1751a;
                k0Var2 = ((b2.j1) this.f1693a).f1753c;
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
                if (f1Var2.f10188b.b()) {
                    u2.g0 g0Var3 = f1Var2.f10188b;
                    j12 = h1Var2.a(g0Var3.f42325b, g0Var3.f42326c);
                    i16 = i1(f1Var2);
                } else if (f1Var2.f10188b.e != -1) {
                    j12 = i1(this.f10145j0);
                    i16 = j12;
                } else {
                    j10 = h1Var2.e;
                    j11 = h1Var2.d;
                    j12 = j10 + j11;
                    i16 = j12;
                }
            } else if (f1Var2.f10188b.b()) {
                j12 = f1Var2.f10202s;
                i16 = i1(f1Var2);
            } else {
                j10 = h1Var2.e;
                j11 = f1Var2.f10202s;
                j12 = j10 + j11;
                i16 = j12;
            }
            long e02 = e2.d0.e0(j12);
            long e03 = e2.d0.e0(i16);
            u2.g0 g0Var4 = f1Var2.f10188b;
            b2.a1 a1Var = new b2.a1(obj, i14, k0Var2, obj2, i15, e02, e03, g0Var4.f42325b, g0Var4.f42326c);
            b2.j1 j1Var2 = (b2.j1) this.f1693a;
            int l02 = l0();
            if (!this.f10145j0.f10187a.p()) {
                f1 f1Var3 = this.f10145j0;
                Object obj6 = f1Var3.f10188b.f42324a;
                f1Var3.f10187a.g(obj6, this.f10153o);
                int b11 = this.f10145j0.f10187a.b(obj6);
                Object obj7 = this.f10145j0.f10187a.m(l02, j1Var2, 0L).f1751a;
                k0Var3 = j1Var2.f1753c;
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
            if (this.f10145j0.f10188b.b()) {
                j13 = e2.d0.e0(i1(this.f10145j0));
            } else {
                j13 = e04;
            }
            u2.g0 g0Var5 = this.f10145j0.f10188b;
            this.f10150m.c(11, new e2(i11, a1Var, new b2.a1(obj3, l02, k0Var3, obj4, i17, e04, j13, g0Var5.f42325b, g0Var5.f42326c), 2));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f10150m.c(1, new s(k0Var, intValue, 1));
        }
        if (f1Var2.f10190f != f1Var.f10190f) {
            this.f10150m.c(10, new e2.m() {
                @Override
                public final void invoke(Object obj8) {
                    b2.z0 z0Var = (b2.z0) obj8;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
            if (f1Var.f10190f != null) {
                this.f10150m.c(10, new e2.m() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.z0 z0Var = (b2.z0) obj8;
                        switch (r2) {
                            case 0:
                                f1 f1Var4 = f1Var;
                                z0Var.onLoadingChanged(f1Var4.f10191g);
                                z0Var.onIsLoadingChanged(f1Var4.f10191g);
                                return;
                            case 1:
                                f1 f1Var5 = f1Var;
                                z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                                return;
                            case 2:
                                z0Var.onPlaybackStateChanged(f1Var.e);
                                return;
                            case 3:
                                f1 f1Var6 = f1Var;
                                z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                                return;
                            case 4:
                                z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                                return;
                            case 5:
                                z0Var.onIsPlayingChanged(f1Var.m());
                                return;
                            case 6:
                                z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                                return;
                            case 7:
                                z0Var.onPlayerErrorChanged(f1Var.f10190f);
                                return;
                            case 8:
                                z0Var.onPlayerError(f1Var.f10190f);
                                return;
                            default:
                                z0Var.onTracksChanged(f1Var.f10192i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.v vVar = f1Var2.f10192i;
        x2.v vVar2 = f1Var.f10192i;
        if (vVar != vVar2) {
            x2.u uVar = this.f10142i;
            Object obj8 = vVar2.e;
            uVar.getClass();
            uVar.f44557c = (x2.t) obj8;
            this.f10150m.c(2, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f10150m.c(14, new y1(this.O, 7));
        }
        if (z14) {
            this.f10150m.c(3, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f10150m.c(-1, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f10150m.c(4, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || f1Var2.f10196m != f1Var.f10196m) {
            this.f10150m.c(5, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (f1Var2.f10197n != f1Var.f10197n) {
            this.f10150m.c(6, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (f1Var2.m() != f1Var.m()) {
            this.f10150m.c(7, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        if (!f1Var2.f10198o.equals(f1Var.f10198o)) {
            this.f10150m.c(12, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.f10191g);
                            z0Var.onIsLoadingChanged(f1Var4.f10191g);
                            return;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.f10195l, f1Var5.e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            return;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.f10195l, f1Var6.f10196m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.f10197n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.f10198o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f10190f);
                            return;
                        case 8:
                            z0Var.onPlayerError(f1Var.f10190f);
                            return;
                        default:
                            z0Var.onTracksChanged(f1Var.f10192i.d);
                            return;
                    }
                }
            });
        }
        x1();
        this.f10150m.b();
        if (f1Var2.f10199p != f1Var.f10199p) {
            Iterator it = this.f10151n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).f10108a.A1();
            }
        }
    }
}
