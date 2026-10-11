package i2;

import ai.t4;
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
import ci.rc;
import ei.c5;
import gg.c2;
import gg.w1;
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
    public final c3.j0 B;
    public final c3.j0 C;
    public final long D;
    public final e2.c E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public final p1 K;
    public q1 L;
    public u2.f1 M;
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
    public boolean f11654a0;
    public final x2.v f11655b;
    public d2.d f11656b0;
    public final b2.x0 f11657c;
    public final boolean f11658c0;
    public final e2.g d;
    public boolean f11659d0;
    public final Context f11660e;
    public final int f11661e0;
    public final f0 f11662f;
    public boolean f11663f0;
    public final f[] f11664g;
    public final b2.l f11665g0;
    public final f[] h;
    public x1 f11666h0;
    public final x2.u f11667i;
    public b2.n0 f11668i0;
    public final e2.z f11669j;
    public h1 f11670j0;
    public final x f11671k;
    public int f11672k0;
    public final p0 f11673l;
    public long f11674l0;
    public final e2.p f11675m;
    public org.telegram.messenger.d1 m0;
    public final CopyOnWriteArraySet f11676n;
    public final ArrayList f11677n0;
    public final b2.h1 f11678o;
    public final ArrayList f11679p;
    public final boolean f11680q;
    public final u2.e0 f11681r;
    public final j2.f f11682s;
    public final Looper f11683t;
    public final y2.c f11684u;
    public final long v;
    public final long f11685w;
    public final long f11686x;
    public final c0 f11687y;
    public final d0 f11688z;

    static {
        b2.l0.a("media3.exoplayer");
    }

    public f0(p pVar) {
        super(0);
        f0 f0Var;
        boolean z10;
        int[] iArr;
        f0 f0Var2;
        e2.z a2;
        t4 t4Var;
        Handler.Callback callback;
        this.f11677n0 = new ArrayList();
        this.d = new e2.g();
        try {
            e2.a.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8531a + "]");
            Context context = pVar.f11814a;
            e2.x xVar = pVar.f11815b;
            this.f11660e = context.getApplicationContext();
            this.f11682s = new j2.f(xVar);
            this.f11661e0 = pVar.f11820i;
            this.Y = pVar.f11821j;
            this.W = pVar.f11822k;
            this.f11654a0 = false;
            this.D = pVar.f11831t;
            c0 c0Var = new c0(this);
            this.f11687y = c0Var;
            this.f11688z = new Object();
            f[] b10 = ((l) pVar.f11816c.get()).b(new Handler(pVar.h), c0Var, c0Var, c0Var, c0Var);
            this.f11664g = b10;
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
                int i11 = this.f11664g[i10].f11644b;
                fVarArr[i10] = null;
                i10++;
            }
            x2.u uVar = (x2.u) pVar.f11817e.get();
            this.f11667i = uVar;
            this.f11681r = (u2.e0) pVar.d.get();
            y2.f b11 = y2.f.b(pVar.f11819g.f11626b);
            this.f11684u = b11;
            this.f11680q = pVar.f11823l;
            this.L = pVar.f11824m;
            this.v = pVar.f11826o;
            this.f11685w = pVar.f11827p;
            this.f11686x = pVar.f11828q;
            this.K = pVar.f11825n;
            Looper looper = pVar.h;
            this.f11683t = looper;
            this.f11662f = this;
            this.f11675m = new e2.p(looper, xVar, new x(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f11676n = copyOnWriteArraySet;
            this.f11679p = new ArrayList();
            this.M = new u2.d1();
            f[] fVarArr2 = this.f11664g;
            x2.v vVar = new x2.v(new n1[fVarArr2.length], new x2.r[fVarArr2.length], s1.f3653b, null);
            this.f11655b = vVar;
            this.f11678o = new b2.h1();
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
            this.f11657c = new b2.x0(qVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < qVar.f3532a.size(); i13++) {
                int a10 = qVar.a(i13);
                e2.d.g(!false);
                sparseBooleanArray2.append(a10, true);
            }
            e2.d.g(!false);
            sparseBooleanArray2.append(4, true);
            e2.d.g(!false);
            sparseBooleanArray2.append(10, true);
            e2.d.g(!false);
            this.N = new b2.x0(new b2.q(sparseBooleanArray2));
            this.f11669j = xVar.a(looper, null);
            x xVar2 = new x(this, 1);
            this.f11671k = xVar2;
            this.f11670j0 = h1.k(vVar);
            this.f11682s.r(this, looper);
            j2.k kVar = new j2.k(pVar.f11833w);
            p0 p0Var = new p0(this.f11660e, this.f11664g, this.h, uVar, vVar, (k) pVar.f11818f.get(), b11, this.F, this.G, this.f11682s, this.L, pVar.f11829r, pVar.f11830s, looper, xVar, xVar2, kVar, this.f11688z);
            e2.z zVar = p0Var.f11852n;
            this.f11673l = p0Var;
            Looper looper2 = p0Var.f11859s;
            this.Z = 1.0f;
            this.F = 0;
            b2.n0 n0Var = b2.n0.K;
            this.O = n0Var;
            this.P = n0Var;
            this.f11668i0 = n0Var;
            this.f11672k0 = -1;
            this.f11656b0 = d2.d.d;
            this.f11658c0 = true;
            n0(this.f11682s);
            Handler handler = new Handler(looper);
            j2.f fVar = this.f11682s;
            b11.getClass();
            fVar.getClass();
            m2.t tVar = b11.f51762c;
            tVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) tVar.f15997b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.f51746b == fVar) {
                    bVar.f51747c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, fVar));
            copyOnWriteArraySet.add(this.f11687y);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.f11660e;
                    boolean z11 = pVar.f11832u;
                    a2 = xVar.a(p0Var.f11859s, null);
                    callback = null;
                    t4Var = new t4(context2, z11, this, kVar, 4);
                    f0Var2 = this;
                } catch (Throwable th2) {
                    th = th2;
                    f0Var2 = this;
                    f0Var = f0Var2;
                    f0Var.d.e();
                    throw th;
                }
                try {
                    a2.c(t4Var);
                } catch (Throwable th3) {
                    th = th3;
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
                cVar.i(new rc(f0Var, 28));
                Context context3 = pVar.f11814a;
                Looper looper3 = pVar.h;
                c0 c0Var2 = f0Var.f11687y;
                ?? obj = new Object();
                obj.f7951b = context3.getApplicationContext();
                obj.d = xVar.a(looper2, callback);
                obj.f7952c = new b(obj, xVar.a(looper3, callback), c0Var2);
                f0Var.A = obj;
                obj.w();
                f0Var.B = new c3.j0(context, looper2, xVar, 2);
                f0Var.C = new c3.j0(context, looper2, xVar, 3);
                f0Var.f11665g0 = b2.l.f3407c;
                f0Var.f11666h0 = x1.d;
                f0Var.X = e2.w.f8586c;
                zVar.a(38, f0Var.K).b();
                b2.e eVar = f0Var.Y;
                e2.y b12 = e2.z.b();
                b12.f8590a = zVar.f8592a.obtainMessage(31, 0, 0, eVar);
                b12.b();
                f0Var.r1(1, 3, f0Var.Y);
                f0Var.r1(2, 4, Integer.valueOf(f0Var.W));
                f0Var.r1(2, 5, 0);
                f0Var.r1(1, 9, Boolean.valueOf(f0Var.f11654a0));
                f0Var.r1(6, 8, f0Var.f11688z);
                f0Var.r1(-1, 16, Integer.valueOf(f0Var.f11661e0));
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

    public static long k1(h1 h1Var) {
        b2.j1 j1Var = new b2.j1();
        b2.h1 h1Var2 = new b2.h1();
        h1Var.f11723a.g(h1Var.f11724b.f48640a, h1Var2);
        long j3 = h1Var.f11725c;
        if (j3 == -9223372036854775807L) {
            return h1Var.f11723a.m(h1Var2.f3329c, j1Var, 0L).f3388l;
        }
        return h1Var2.f3330e + j3;
    }

    public static h1 l1(h1 h1Var, int i10) {
        h1 h = h1Var.h(i10);
        if (i10 != 1 && i10 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final boolean A0() {
        D1();
        return this.G;
    }

    public final void A1(int i10, boolean z10) {
        int i11;
        h1 h1Var = this.f11670j0;
        int i12 = h1Var.f11734n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (h1Var.f11732l == z10 && i12 == i11 && h1Var.f11733m == i10) {
            return;
        }
        this.H++;
        if (h1Var.f11736p) {
            h1Var = h1Var.a();
        }
        h1 e7 = h1Var.e(i10, i11, z10);
        e2.z zVar = this.f11673l.f11852n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8590a = zVar.f8592a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        b10.b();
        B1(e7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int B() {
        D1();
        if (this.f11670j0.f11723a.p()) {
            return 0;
        }
        h1 h1Var = this.f11670j0;
        return h1Var.f11723a.b(h1Var.f11724b.f48640a);
    }

    @Override
    public final b2.q1 B0() {
        D1();
        return ((x2.p) this.f11667i).e();
    }

    public final void B1(final h1 h1Var, int i10, boolean z10, int i11, long j3, int i12, boolean z11) {
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
        long k12;
        Object obj3;
        b2.k0 k0Var3;
        Object obj4;
        int i16;
        long j13;
        h1 h1Var2 = this.f11670j0;
        this.f11670j0 = h1Var;
        boolean equals = h1Var2.f11723a.equals(h1Var.f11723a);
        b2.j1 j1Var = (b2.j1) this.f3314a;
        b2.h1 h1Var3 = this.f11678o;
        b2.k1 k1Var = h1Var2.f11723a;
        u2.f0 f0Var = h1Var2.f11724b;
        b2.k1 k1Var2 = h1Var.f11723a;
        u2.f0 f0Var2 = h1Var.f11724b;
        if (k1Var2.p() && k1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k1Var2.p() != k1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!k1Var.m(k1Var.g(f0Var.f48640a, h1Var3).f3329c, j1Var, 0L).f3379a.equals(k1Var2.m(k1Var2.g(f0Var2.f48640a, h1Var3).f3329c, j1Var, 0L).f3379a)) {
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
            if (!h1Var.f11723a.p()) {
                k0Var = h1Var.f11723a.m(h1Var.f11723a.g(h1Var.f11724b.f48640a, this.f11678o).f3329c, (b2.j1) this.f3314a, 0L).f3381c;
            } else {
                k0Var = null;
            }
            this.f11668i0 = b2.n0.K;
        } else {
            k0Var = null;
        }
        if (booleanValue || !h1Var2.f11730j.equals(h1Var.f11730j)) {
            b2.m0 a2 = this.f11668i0.a();
            List list = h1Var.f11730j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                b2.p0 p0Var = (b2.p0) list.get(i17);
                int i18 = 0;
                while (true) {
                    b2.o0[] o0VarArr = p0Var.f3507a;
                    if (i18 < o0VarArr.length) {
                        o0VarArr[i18].b(a2);
                        i18++;
                    }
                }
            }
            this.f11668i0 = new b2.n0(a2);
        }
        b2.n0 d12 = d1();
        boolean equals2 = d12.equals(this.O);
        this.O = d12;
        if (h1Var2.f11732l != h1Var.f11732l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (h1Var2.f11726e != h1Var.f11726e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            C1();
        }
        if (h1Var2.f11728g != h1Var.f11728g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f11675m.c(0, new s(h1Var, i10, 0));
        }
        if (z10) {
            b2.h1 h1Var4 = new b2.h1();
            if (!h1Var2.f11723a.p()) {
                Object obj5 = h1Var2.f11724b.f48640a;
                h1Var2.f11723a.g(obj5, h1Var4);
                int i19 = h1Var4.f3329c;
                int b10 = h1Var2.f11723a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = h1Var2.f11723a.m(i19, (b2.j1) this.f3314a, 0L).f3379a;
                k0Var2 = ((b2.j1) this.f3314a).f3381c;
                obj2 = obj5;
                i14 = i19;
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
                if (h1Var2.f11724b.b()) {
                    u2.f0 f0Var3 = h1Var2.f11724b;
                    j12 = h1Var4.a(f0Var3.f48641b, f0Var3.f48642c);
                    k12 = k1(h1Var2);
                } else if (h1Var2.f11724b.f48643e != -1) {
                    j12 = k1(this.f11670j0);
                    k12 = j12;
                } else {
                    j10 = h1Var4.f3330e;
                    j11 = h1Var4.d;
                    j12 = j10 + j11;
                    k12 = j12;
                }
            } else if (h1Var2.f11724b.b()) {
                j12 = h1Var2.f11739s;
                k12 = k1(h1Var2);
            } else {
                j10 = h1Var4.f3330e;
                j11 = h1Var2.f11739s;
                j12 = j10 + j11;
                k12 = j12;
            }
            long d02 = e2.d0.d0(j12);
            long d03 = e2.d0.d0(k12);
            u2.f0 f0Var4 = h1Var2.f11724b;
            b2.a1 a1Var = new b2.a1(obj, i14, k0Var2, obj2, i15, d02, d03, f0Var4.f48641b, f0Var4.f48642c);
            b2.j1 j1Var2 = (b2.j1) this.f3314a;
            int l02 = l0();
            if (!this.f11670j0.f11723a.p()) {
                h1 h1Var5 = this.f11670j0;
                Object obj6 = h1Var5.f11724b.f48640a;
                h1Var5.f11723a.g(obj6, this.f11678o);
                int b11 = this.f11670j0.f11723a.b(obj6);
                Object obj7 = this.f11670j0.f11723a.m(l02, j1Var2, 0L).f3379a;
                k0Var3 = j1Var2.f3381c;
                i16 = b11;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                k0Var3 = null;
                obj4 = null;
                i16 = -1;
            }
            long d04 = e2.d0.d0(j3);
            if (this.f11670j0.f11724b.b()) {
                j13 = e2.d0.d0(k1(this.f11670j0));
            } else {
                j13 = d04;
            }
            u2.f0 f0Var5 = this.f11670j0.f11724b;
            this.f11675m.c(11, new c2(i11, a1Var, new b2.a1(obj3, l02, k0Var3, obj4, i16, d04, j13, f0Var5.f48641b, f0Var5.f48642c), 2));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f11675m.c(1, new s(k0Var, intValue, 1));
        }
        if (h1Var2.f11727f != h1Var.f11727f) {
            this.f11675m.c(10, new e2.m() {
                @Override
                public final void invoke(Object obj8) {
                    b2.z0 z0Var = (b2.z0) obj8;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
            if (h1Var.f11727f != null) {
                this.f11675m.c(10, new e2.m() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.z0 z0Var = (b2.z0) obj8;
                        switch (r2) {
                            case 0:
                                h1 h1Var6 = h1Var;
                                z0Var.onLoadingChanged(h1Var6.f11728g);
                                z0Var.onIsLoadingChanged(h1Var6.f11728g);
                                return;
                            case 1:
                                h1 h1Var7 = h1Var;
                                z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                                return;
                            case 2:
                                z0Var.onPlaybackStateChanged(h1Var.f11726e);
                                return;
                            case 3:
                                h1 h1Var8 = h1Var;
                                z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                                return;
                            case 4:
                                z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                                return;
                            case 5:
                                z0Var.onIsPlayingChanged(h1Var.m());
                                return;
                            case 6:
                                z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                                return;
                            case 7:
                                z0Var.onPlayerErrorChanged(h1Var.f11727f);
                                return;
                            case 8:
                                z0Var.onPlayerError(h1Var.f11727f);
                                return;
                            default:
                                z0Var.onTracksChanged(h1Var.f11729i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.v vVar = h1Var2.f11729i;
        x2.v vVar2 = h1Var.f11729i;
        if (vVar != vVar2) {
            x2.u uVar = this.f11667i;
            Object obj8 = vVar2.f50635e;
            uVar.getClass();
            uVar.f50631c = (x2.t) obj8;
            this.f11675m.c(2, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f11675m.c(14, new t(this.O));
        }
        if (z14) {
            this.f11675m.c(3, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f11675m.c(-1, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f11675m.c(4, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || h1Var2.f11733m != h1Var.f11733m) {
            this.f11675m.c(5, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (h1Var2.f11734n != h1Var.f11734n) {
            this.f11675m.c(6, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (h1Var2.m() != h1Var.m()) {
            this.f11675m.c(7, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        if (!h1Var2.f11735o.equals(h1Var.f11735o)) {
            this.f11675m.c(12, new e2.m() {
                @Override
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var6 = h1Var;
                            z0Var.onLoadingChanged(h1Var6.f11728g);
                            z0Var.onIsLoadingChanged(h1Var6.f11728g);
                            return;
                        case 1:
                            h1 h1Var7 = h1Var;
                            z0Var.onPlayerStateChanged(h1Var7.f11732l, h1Var7.f11726e);
                            return;
                        case 2:
                            z0Var.onPlaybackStateChanged(h1Var.f11726e);
                            return;
                        case 3:
                            h1 h1Var8 = h1Var;
                            z0Var.onPlayWhenReadyChanged(h1Var8.f11732l, h1Var8.f11733m);
                            return;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(h1Var.f11734n);
                            return;
                        case 5:
                            z0Var.onIsPlayingChanged(h1Var.m());
                            return;
                        case 6:
                            z0Var.onPlaybackParametersChanged(h1Var.f11735o);
                            return;
                        case 7:
                            z0Var.onPlayerErrorChanged(h1Var.f11727f);
                            return;
                        case 8:
                            z0Var.onPlayerError(h1Var.f11727f);
                            return;
                        default:
                            z0Var.onTracksChanged(h1Var.f11729i.d);
                            return;
                    }
                }
            });
        }
        z1();
        this.f11675m.b();
        if (h1Var2.f11736p != h1Var.f11736p) {
            Iterator it = this.f11676n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f11619a.C1();
            }
        }
    }

    @Override
    public final void C(b2.n0 n0Var) {
        D1();
        if (n0Var.equals(this.P)) {
            return;
        }
        this.P = n0Var;
        this.f11675m.e(15, new x(this, 4));
    }

    @Override
    public final long C0() {
        D1();
        if (this.f11670j0.f11723a.p()) {
            return this.f11674l0;
        }
        h1 h1Var = this.f11670j0;
        long j3 = 0;
        if (h1Var.f11731k.d != h1Var.f11724b.d) {
            return e2.d0.d0(h1Var.f11723a.m(l0(), (b2.j1) this.f3314a, 0L).f3389m);
        }
        long j10 = h1Var.f11737q;
        if (this.f11670j0.f11731k.b()) {
            h1 h1Var2 = this.f11670j0;
            h1Var2.f11723a.g(h1Var2.f11731k.f48640a, this.f11678o).d(this.f11670j0.f11731k.f48641b);
        } else {
            j3 = j10;
        }
        h1 h1Var3 = this.f11670j0;
        b2.k1 k1Var = h1Var3.f11723a;
        Object obj = h1Var3.f11731k.f48640a;
        b2.h1 h1Var4 = this.f11678o;
        k1Var.g(obj, h1Var4);
        return e2.d0.d0(j3 + h1Var4.f3330e);
    }

    public final void C1() {
        int d = d();
        c3.j0 j0Var = this.C;
        c3.j0 j0Var2 = this.B;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                D1();
                boolean z11 = this.f11670j0.f11736p;
                if (u() && !z11) {
                    z10 = true;
                }
                j0Var2.a(z10);
                j0Var.a(u());
                return;
            }
        }
        j0Var2.a(false);
        j0Var.a(false);
    }

    @Override
    public final void D(b2.z0 z0Var) {
        D1();
        z0Var.getClass();
        e2.p pVar = this.f11675m;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.o oVar = (e2.o) it.next();
            if (oVar.f8558a.equals(z0Var)) {
                e2.n nVar = pVar.f8563c;
                oVar.d = true;
                if (oVar.f8560c) {
                    oVar.f8560c = false;
                    nVar.e(oVar.f8558a, oVar.f8559b.d());
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    @Override
    public final void D0(int i10) {
        D1();
    }

    public final void D1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f11683t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.d0.f8531a;
            Locale locale = Locale.US;
            String i10 = org.telegram.ui.Cells.c1.i("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f11658c0) {
                if (this.f11659d0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.o("ExoPlayerImpl", i10, illegalStateException);
                this.f11659d0 = true;
                return;
            }
            throw new IllegalStateException(i10);
        }
    }

    @Override
    public final x1 E() {
        D1();
        return this.f11666h0;
    }

    @Override
    public final float G() {
        D1();
        return this.Z;
    }

    @Override
    public final b2.n0 H0() {
        D1();
        return this.O;
    }

    @Override
    public final b2.e I() {
        D1();
        return this.Y;
    }

    @Override
    public final void I0(List list) {
        D1();
        ArrayList e12 = e1(list);
        D1();
        t1(-9223372036854775807L, e12, true, -1);
    }

    @Override
    public final void J(int i10, boolean z10) {
        D1();
    }

    @Override
    public final long J0() {
        D1();
        return e2.d0.d0(h1(this.f11670j0));
    }

    @Override
    public final b2.l K() {
        D1();
        return this.f11665g0;
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        D1();
        if (this.f11663f0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, eVar);
        e2.p pVar = this.f11675m;
        if (!equals) {
            this.Y = eVar;
            r1(1, 3, eVar);
            pVar.c(20, new c5(eVar, 7));
        }
        b2.e eVar2 = this.Y;
        e2.z zVar = this.f11673l.f11852n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8590a = zVar.f8592a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
        b10.b();
        pVar.b();
    }

    @Override
    public final void L() {
        D1();
    }

    @Override
    public final long L0() {
        D1();
        return this.v;
    }

    @Override
    public final void M(int i10, int i11) {
        D1();
    }

    @Override
    public final void N(int i10) {
        D1();
    }

    @Override
    public final int O() {
        D1();
        if (o()) {
            return this.f11670j0.f11724b.f48642c;
        }
        return -1;
    }

    @Override
    public final void P(int i10, int i11, List list) {
        boolean z10;
        D1();
        boolean z11 = false;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ArrayList arrayList = this.f11679p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((e0) arrayList.get(i12)).f11638b.f48746k.a((b2.k0) list.get(i12 - i10))) {
                }
            }
            this.H++;
            e2.z zVar = this.f11673l.f11852n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8590a = zVar.f8592a.obtainMessage(27, i10, min, list);
            b10.b();
            for (int i13 = i10; i13 < min; i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                e0Var.f11639c = new l1(e0Var.f11639c, (b2.k0) list.get(i13 - i10));
            }
            B1(this.f11670j0.j(new m1(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList e12 = e1(list);
        if (arrayList.isEmpty()) {
            if (this.f11672k0 == -1) {
                z11 = true;
            }
            D1();
            t1(-9223372036854775807L, e12, z11, -1);
            return;
        }
        h1 p12 = p1(c1(this.f11670j0, min, e12), i10, min);
        B1(p12, 0, !p12.f11724b.f48640a.equals(this.f11670j0.f11724b.f48640a), 4, h1(p12), -1, false);
    }

    @Override
    public final void S(int i10, int i11) {
        boolean z10;
        D1();
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int size = this.f11679p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            h1 p12 = p1(this.f11670j0, i10, min);
            B1(p12, 0, !p12.f11724b.f48640a.equals(this.f11670j0.f11724b.f48640a), 4, h1(p12), -1, false);
        }
    }

    @Override
    public final void T(long j3, int i10, List list) {
        D1();
        ArrayList e12 = e1(list);
        D1();
        t1(j3, e12, false, i10);
    }

    @Override
    public final void U(float f7) {
        D1();
        float g10 = e2.d0.g(f7, 0.0f, 1.0f);
        if (this.Z == g10) {
            return;
        }
        this.Z = g10;
        this.f11673l.f11852n.a(32, Float.valueOf(g10)).b();
        this.f11675m.e(22, new v(g10, 0));
    }

    @Override
    public final void U0() {
        boolean z10;
        e2.a.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.f8531a + "] [" + b2.l0.b() + "]");
        D1();
        this.A.w();
        this.B.a(false);
        this.C.a(false);
        p0 p0Var = this.f11673l;
        if (!p0Var.X && p0Var.f11859s.getThread().isAlive()) {
            p0Var.X = true;
            e2.g gVar = new e2.g(p0Var.F);
            p0Var.f11852n.a(7, gVar).b();
            z10 = gVar.c(p0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f11675m.e(10, new hg.o1(9));
        }
        this.f11675m.d();
        this.f11669j.f8592a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f11684u;
        j2.f fVar = this.f11682s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f51762c.f15997b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f51746b == fVar) {
                bVar.f51747c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        h1 h1Var = this.f11670j0;
        if (h1Var.f11736p) {
            this.f11670j0 = h1Var.a();
        }
        h1 l1 = l1(this.f11670j0, 1);
        this.f11670j0 = l1;
        h1 c10 = l1.c(l1.f11724b);
        this.f11670j0 = c10;
        c10.f11737q = c10.f11739s;
        this.f11670j0.f11738r = 0L;
        j2.f fVar2 = this.f11682s;
        e2.z zVar = fVar2.f13694n;
        e2.d.h(zVar);
        zVar.c(new h0(fVar2, 7));
        q1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.f11656b0 = d2.d.d;
        this.f11663f0 = true;
    }

    @Override
    public final void V0(int i10, long j3, boolean z10) {
        boolean z11;
        D1();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            e2.d.b(z11);
            b2.k1 k1Var = this.f11670j0.f11723a;
            if (!k1Var.p() && i10 >= k1Var.o()) {
                return;
            }
            j2.f fVar = this.f11682s;
            if (!fVar.f13695r) {
                j2.a l4 = fVar.l();
                fVar.f13695r = true;
                fVar.q(l4, -1, new c5(l4, 23));
            }
            this.H++;
            if (o()) {
                e2.a.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                m0 m0Var = new m0(this.f11670j0);
                m0Var.f(1);
                f0 f0Var = this.f11671k.f11933b;
                f0Var.f11669j.c(new w1(9, f0Var, m0Var));
                return;
            }
            h1 h1Var = this.f11670j0;
            int i11 = h1Var.f11726e;
            if (i11 == 3 || (i11 == 4 && !k1Var.p())) {
                h1Var = this.f11670j0.h(2);
            }
            int l02 = l0();
            h1 m12 = m1(h1Var, k1Var, n1(k1Var, i10, j3));
            this.f11673l.f11852n.a(3, new o0(k1Var, i10, e2.d0.P(j3))).b();
            B1(m12, 0, true, 1, h1(m12), l02, z10);
        }
    }

    @Override
    public final b2.u0 W() {
        D1();
        return this.f11670j0.f11727f;
    }

    @Override
    public final void X(boolean z10) {
        D1();
        A1(1, z10);
    }

    @Override
    public final long Z() {
        D1();
        return this.f11685w;
    }

    @Override
    public final long a0() {
        D1();
        return g1(this.f11670j0);
    }

    @Override
    public final void b() {
        int i10;
        D1();
        h1 h1Var = this.f11670j0;
        if (h1Var.f11726e != 1) {
            return;
        }
        h1 f7 = h1Var.f(null);
        if (f7.f11723a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        h1 l1 = l1(f7, i10);
        this.H++;
        e2.z zVar = this.f11673l.f11852n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8590a = zVar.f8592a.obtainMessage(29);
        b10.b();
        B1(l1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void b0(int i10, List list) {
        boolean z10;
        D1();
        ArrayList e12 = e1(list);
        D1();
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ArrayList arrayList = this.f11679p;
        int min = Math.min(i10, arrayList.size());
        if (arrayList.isEmpty()) {
            if (this.f11672k0 != -1) {
                z11 = false;
            }
            D1();
            t1(-9223372036854775807L, e12, z11, -1);
            return;
        }
        B1(c1(this.f11670j0, min, e12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final ArrayList b1(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f1 f1Var = new f1((u2.a) list.get(i11), this.f11680q);
            arrayList.add(f1Var);
            e0 e0Var = new e0(f1Var.f11690b, f1Var.f11689a);
            this.f11679p.add(i11 + i10, e0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    @Override
    public final boolean c() {
        D1();
        return this.f11670j0.f11728g;
    }

    @Override
    public final long c0() {
        D1();
        if (o()) {
            h1 h1Var = this.f11670j0;
            if (h1Var.f11731k.equals(h1Var.f11724b)) {
                return e2.d0.d0(this.f11670j0.f11737q);
            }
            return getDuration();
        }
        return C0();
    }

    public final h1 c1(h1 h1Var, int i10, ArrayList arrayList) {
        b2.k1 k1Var = h1Var.f11723a;
        this.H++;
        ArrayList b12 = b1(i10, arrayList);
        m1 m1Var = new m1(this.f11679p, this.M);
        h1 m12 = m1(h1Var, m1Var, j1(k1Var, m1Var, i1(h1Var), g1(h1Var)));
        u2.f1 f1Var = this.M;
        e2.z zVar = this.f11673l.f11852n;
        k0 k0Var = new k0(b12, f1Var, -1, -9223372036854775807L);
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8590a = zVar.f8592a.obtainMessage(18, i10, 0, k0Var);
        b10.b();
        return m12;
    }

    @Override
    public final int d() {
        D1();
        return this.f11670j0.f11726e;
    }

    public final b2.n0 d1() {
        byte[] bArr;
        boolean z10;
        b2.k1 w02 = w0();
        if (w02.p()) {
            return this.f11668i0;
        }
        b2.k0 k0Var = w02.m(l0(), (b2.j1) this.f3314a, 0L).f3381c;
        b2.m0 a2 = this.f11668i0.a();
        b2.n0 n0Var = k0Var.d;
        if (n0Var != null) {
            e9.i0 i0Var = n0Var.J;
            byte[] bArr2 = n0Var.f3477k;
            CharSequence charSequence = n0Var.f3469a;
            if (charSequence != null) {
                a2.f3420a = charSequence;
            }
            CharSequence charSequence2 = n0Var.f3470b;
            if (charSequence2 != null) {
                a2.f3421b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.f3471c;
            if (charSequence3 != null) {
                a2.f3422c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.f3472e;
            if (charSequence5 != null) {
                a2.f3423e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f3473f;
            if (charSequence6 != null) {
                a2.f3424f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.f3474g;
            if (charSequence7 != null) {
                a2.f3425g = charSequence7;
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
            b2.c1 c1Var = n0Var.f3475i;
            if (c1Var != null) {
                a2.f3426i = c1Var;
            }
            b2.c1 c1Var2 = n0Var.f3476j;
            if (c1Var2 != null) {
                a2.f3427j = c1Var2;
            }
            Uri uri = n0Var.f3479m;
            if (uri != null || bArr2 != null) {
                a2.f3430m = uri;
                Integer num = n0Var.f3478l;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a2.f3428k = bArr;
                a2.f3429l = num;
            }
            Integer num2 = n0Var.f3480n;
            if (num2 != null) {
                a2.f3431n = num2;
            }
            Integer num3 = n0Var.f3481o;
            if (num3 != null) {
                a2.f3432o = num3;
            }
            Integer num4 = n0Var.f3482p;
            if (num4 != null) {
                a2.f3433p = num4;
            }
            Boolean bool = n0Var.f3483q;
            if (bool != null) {
                a2.f3434q = bool;
            }
            Boolean bool2 = n0Var.f3484r;
            if (bool2 != null) {
                a2.f3435r = bool2;
            }
            Integer num5 = n0Var.f3485s;
            if (num5 != null) {
                a2.f3436s = num5;
            }
            Integer num6 = n0Var.f3486t;
            if (num6 != null) {
                a2.f3436s = num6;
            }
            Integer num7 = n0Var.f3487u;
            if (num7 != null) {
                a2.f3437t = num7;
            }
            Integer num8 = n0Var.v;
            if (num8 != null) {
                a2.f3438u = num8;
            }
            Integer num9 = n0Var.f3488w;
            if (num9 != null) {
                a2.v = num9;
            }
            Integer num10 = n0Var.f3489x;
            if (num10 != null) {
                a2.f3439w = num10;
            }
            Integer num11 = n0Var.f3490y;
            if (num11 != null) {
                a2.f3440x = num11;
            }
            CharSequence charSequence8 = n0Var.f3491z;
            if (charSequence8 != null) {
                a2.f3441y = charSequence8;
            }
            CharSequence charSequence9 = n0Var.A;
            if (charSequence9 != null) {
                a2.f3442z = charSequence9;
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

    public final ArrayList e1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f11681r.a((b2.k0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final void f(b2.v0 v0Var) {
        D1();
        if (this.f11670j0.f11735o.equals(v0Var)) {
            return;
        }
        h1 g10 = this.f11670j0.g(v0Var);
        this.H++;
        this.f11673l.f11852n.a(4, v0Var).b();
        B1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void f0(int i10) {
        D1();
    }

    public final k1 f1(j1 j1Var) {
        int i12 = i1(this.f11670j0);
        b2.k1 k1Var = this.f11670j0.f11723a;
        if (i12 == -1) {
            i12 = 0;
        }
        p0 p0Var = this.f11673l;
        return new k1(p0Var, j1Var, k1Var, i12, p0Var.f11859s);
    }

    @Override
    public final s1 g0() {
        D1();
        return this.f11670j0.f11729i.d;
    }

    public final long g1(h1 h1Var) {
        u2.f0 f0Var = h1Var.f11724b;
        long j3 = h1Var.f11725c;
        b2.k1 k1Var = h1Var.f11723a;
        if (f0Var.b()) {
            Object obj = h1Var.f11724b.f48640a;
            b2.h1 h1Var2 = this.f11678o;
            k1Var.g(obj, h1Var2);
            if (j3 == -9223372036854775807L) {
                return e2.d0.d0(k1Var.m(i1(h1Var), (b2.j1) this.f3314a, 0L).f3388l);
            }
            return e2.d0.d0(j3) + e2.d0.d0(h1Var2.f3330e);
        }
        return e2.d0.d0(h1(h1Var));
    }

    @Override
    public final long getDuration() {
        D1();
        if (o()) {
            h1 h1Var = this.f11670j0;
            u2.f0 f0Var = h1Var.f11724b;
            b2.k1 k1Var = h1Var.f11723a;
            Object obj = f0Var.f48640a;
            b2.h1 h1Var2 = this.f11678o;
            k1Var.g(obj, h1Var2);
            return e2.d0.d0(h1Var2.a(f0Var.f48641b, f0Var.f48642c));
        }
        return A();
    }

    @Override
    public final b2.v0 h() {
        D1();
        return this.f11670j0.f11735o;
    }

    @Override
    public final b2.n0 h0() {
        D1();
        return this.P;
    }

    public final long h1(h1 h1Var) {
        long j3;
        if (h1Var.f11723a.p()) {
            return e2.d0.P(this.f11674l0);
        }
        if (h1Var.f11736p) {
            j3 = h1Var.l();
        } else {
            j3 = h1Var.f11739s;
        }
        if (h1Var.f11724b.b()) {
            return j3;
        }
        b2.k1 k1Var = h1Var.f11723a;
        Object obj = h1Var.f11724b.f48640a;
        b2.h1 h1Var2 = this.f11678o;
        k1Var.g(obj, h1Var2);
        return j3 + h1Var2.f3330e;
    }

    public final int i1(h1 h1Var) {
        if (h1Var.f11723a.p()) {
            return this.f11672k0;
        }
        return h1Var.f11723a.g(h1Var.f11724b.f48640a, this.f11678o).f3329c;
    }

    @Override
    public final void j(int i10) {
        D1();
        if (this.F != i10) {
            this.F = i10;
            e2.z zVar = this.f11673l.f11852n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8590a = zVar.f8592a.obtainMessage(11, i10, 0);
            b10.b();
            w wVar = new w(i10, 0);
            e2.p pVar = this.f11675m;
            pVar.c(8, wVar);
            z1();
            pVar.b();
        }
    }

    @Override
    public final d2.d j0() {
        D1();
        return this.f11656b0;
    }

    public final Pair j1(b2.k1 k1Var, m1 m1Var, int i10, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        if (!k1Var.p() && !m1Var.p()) {
            Pair i12 = k1Var.i((b2.j1) this.f3314a, this.f11678o, i10, e2.d0.P(j3));
            Object obj = i12.first;
            if (m1Var.b(obj) != -1) {
                return i12;
            }
            int U = p0.U((b2.j1) this.f3314a, this.f11678o, this.F, this.G, obj, k1Var, m1Var);
            if (U != -1) {
                b2.j1 j1Var = (b2.j1) this.f3314a;
                m1Var.m(U, j1Var, 0L);
                return n1(m1Var, U, e2.d0.d0(j1Var.f3388l));
            }
            return n1(m1Var, -1, -9223372036854775807L);
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
        return n1(m1Var, i11, j10);
    }

    @Override
    public final int k0() {
        D1();
        if (o()) {
            return this.f11670j0.f11724b.f48641b;
        }
        return -1;
    }

    @Override
    public final int l() {
        D1();
        return this.F;
    }

    @Override
    public final int l0() {
        D1();
        int i12 = i1(this.f11670j0);
        if (i12 == -1) {
            return 0;
        }
        return i12;
    }

    @Override
    public final int m() {
        D1();
        return 0;
    }

    public final h1 m1(h1 h1Var, b2.k1 k1Var, Pair pair) {
        boolean z10;
        u2.f0 f0Var;
        u2.n1 n1Var;
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
        b2.k1 k1Var2 = h1Var.f11723a;
        long g12 = g1(h1Var);
        h1 j10 = h1Var.j(k1Var);
        if (k1Var.p()) {
            u2.f0 f0Var2 = h1.f11722u;
            long P = e2.d0.P(this.f11674l0);
            h1 c10 = j10.d(f0Var2, P, P, P, 0L, u2.n1.d, this.f11655b, e9.a1.f8714e).c(f0Var2);
            c10.f11737q = c10.f11739s;
            return c10;
        }
        Object obj = j10.f11724b.f48640a;
        String str = e2.d0.f8531a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            f0Var = new u2.f0(pair.first);
        } else {
            f0Var = j10.f11724b;
        }
        long longValue = ((Long) pair.second).longValue();
        long P2 = e2.d0.P(g12);
        if (!k1Var2.p()) {
            P2 -= k1Var2.g(obj, this.f11678o).f3330e;
        }
        if (!equals || longValue < P2) {
            u2.f0 f0Var3 = f0Var;
            e2.d.g(!f0Var3.b());
            if (!equals) {
                n1Var = u2.n1.d;
            } else {
                n1Var = j10.h;
            }
            u2.n1 n1Var2 = n1Var;
            if (!equals) {
                vVar = this.f11655b;
            } else {
                vVar = j10.f11729i;
            }
            x2.v vVar2 = vVar;
            if (!equals) {
                e9.g0 g0Var = e9.i0.f8751b;
                list = e9.a1.f8714e;
            } else {
                list = j10.f11730j;
            }
            h1 c11 = j10.d(f0Var3, longValue, longValue, longValue, 0L, n1Var2, vVar2, list).c(f0Var3);
            c11.f11737q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = k1Var.b(j10.f11731k.f48640a);
            if (b10 != -1 && k1Var.f(b10, this.f11678o, false).f3329c == k1Var.g(f0Var.f48640a, this.f11678o).f3329c) {
                return j10;
            }
            k1Var.g(f0Var.f48640a, this.f11678o);
            if (f0Var.b()) {
                j3 = this.f11678o.a(f0Var.f48641b, f0Var.f48642c);
            } else {
                j3 = this.f11678o.d;
            }
            u2.f0 f0Var4 = f0Var;
            h1 c12 = j10.d(f0Var4, j10.f11739s, j10.f11739s, j10.d, j3 - j10.f11739s, j10.h, j10.f11729i, j10.f11730j).c(f0Var4);
            c12.f11737q = j3;
            return c12;
        } else {
            u2.f0 f0Var5 = f0Var;
            e2.d.g(!f0Var5.b());
            long max = Math.max(0L, j10.f11738r - (longValue - P2));
            long j11 = j10.f11737q;
            if (j10.f11731k.equals(j10.f11724b)) {
                j11 = longValue + max;
            }
            h1 d = j10.d(f0Var5, longValue, longValue, longValue, max, j10.h, j10.f11729i, j10.f11730j);
            d.f11737q = j11;
            return d;
        }
    }

    @Override
    public final void n(Surface surface) {
        int i10;
        D1();
        q1();
        v1(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        o1(i10, i10);
    }

    @Override
    public final void n0(b2.z0 z0Var) {
        z0Var.getClass();
        this.f11675m.a(z0Var);
    }

    public final Pair n1(b2.k1 k1Var, int i10, long j3) {
        if (k1Var.p()) {
            this.f11672k0 = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f11674l0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= k1Var.o()) {
            i10 = k1Var.a(this.G);
            j3 = e2.d0.d0(k1Var.m(i10, (b2.j1) this.f3314a, 0L).f3388l);
        }
        return k1Var.i((b2.j1) this.f3314a, this.f11678o, i10, e2.d0.P(j3));
    }

    @Override
    public final boolean o() {
        D1();
        return this.f11670j0.f11724b.b();
    }

    @Override
    public final void o0(boolean z10) {
        D1();
    }

    public final void o1(int i10, int i11) {
        e2.w wVar = this.X;
        if (i10 == wVar.f8587a && i11 == wVar.f8588b) {
            return;
        }
        this.X = new e2.w(i10, i11);
        org.telegram.messenger.d1 d1Var = this.m0;
        if (d1Var != null) {
            d1Var.execute(new gg.n(this, i10, i11, 1));
            return;
        }
        this.f11675m.e(24, new dh.c(i10, i11, 1));
        r1(2, 14, new e2.w(i10, i11));
    }

    public final h1 p1(h1 h1Var, int i10, int i11) {
        int i12 = i1(h1Var);
        long g12 = g1(h1Var);
        b2.k1 k1Var = h1Var.f11723a;
        ArrayList arrayList = this.f11679p;
        int size = arrayList.size();
        this.H++;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            arrayList.remove(i13);
        }
        this.M = this.M.a(i10, i11);
        m1 m1Var = new m1(arrayList, this.M);
        h1 m12 = m1(h1Var, m1Var, j1(k1Var, m1Var, i12, g12));
        int i14 = m12.f11726e;
        if (i14 != 1 && i14 != 4 && i10 < i11 && i11 == size && i12 >= m12.f11723a.o()) {
            m12 = l1(m12, 4);
        }
        u2.f1 f1Var = this.M;
        e2.z zVar = this.f11673l.f11852n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8590a = zVar.f8592a.obtainMessage(20, i10, i11, f1Var);
        b10.b();
        return m12;
    }

    @Override
    public final void q(b2.q1 q1Var) {
        D1();
        x2.u uVar = this.f11667i;
        uVar.getClass();
        b2.q1 B0 = B0();
        if (!q1Var.equals(((x2.p) uVar).e())) {
            uVar.b(q1Var);
        }
        if (!B0.equals(q1Var)) {
            this.f11675m.e(19, new c5(q1Var, 8));
        }
    }

    public final void q1() {
        TextureView textureView = this.V;
        c0 c0Var = this.f11687y;
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

    @Override
    public final long r() {
        D1();
        return e2.d0.d0(this.f11670j0.f11738r);
    }

    @Override
    public final void r0(int i10, int i11, int i12) {
        boolean z10;
        D1();
        if (i10 >= 0 && i10 <= i11 && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        ArrayList arrayList = this.f11679p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.k1 w02 = w0();
            this.H++;
            e2.d0.O(i10, min, min2, arrayList);
            this.M = this.M.f();
            m1 m1Var = new m1(arrayList, this.M);
            h1 h1Var = this.f11670j0;
            h1 m12 = m1(h1Var, m1Var, j1(w02, m1Var, i1(h1Var), g1(this.f11670j0)));
            u2.f1 f1Var = this.M;
            p0 p0Var = this.f11673l;
            p0Var.getClass();
            p0Var.f11852n.a(19, new l0(i10, min, min2, f1Var)).b();
            B1(m12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void r1(int i10, int i11, Object obj) {
        f[] fVarArr;
        f[] fVarArr2;
        for (f fVar : this.f11664g) {
            if (i10 == -1 || fVar.f11644b == i10) {
                k1 f12 = f1(fVar);
                e2.d.g(!f12.f11772f);
                f12.f11770c = i11;
                e2.d.g(!f12.f11772f);
                f12.d = obj;
                f12.b();
            }
        }
        for (f fVar2 : this.h) {
            if (fVar2 != null && (i10 == -1 || fVar2.f11644b == i10)) {
                k1 f13 = f1(fVar2);
                e2.d.g(!f13.f11772f);
                f13.f11770c = i11;
                e2.d.g(!f13.f11772f);
                f13.d = obj;
                f13.b();
            }
        }
    }

    public final void s1(u2.a aVar, boolean z10) {
        D1();
        List singletonList = Collections.singletonList(aVar);
        D1();
        t1(-9223372036854775807L, singletonList, z10, -1);
    }

    @Override
    public final void stop() {
        D1();
        y1(null);
        this.f11656b0 = new d2.d(this.f11670j0.f11739s, e9.a1.f8714e);
    }

    @Override
    public final b2.x0 t() {
        D1();
        return this.N;
    }

    public final void t1(long j3, List list, boolean z10, int i10) {
        long j10;
        int i11;
        int i12;
        h1 l1;
        boolean z11;
        int i13 = i10;
        int i14 = i1(this.f11670j0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.f11679p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i15 = size - 1; i15 >= 0; i15--) {
                arrayList.remove(i15);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList b12 = b1(0, list);
        m1 m1Var = new m1(arrayList, this.M);
        boolean p5 = m1Var.p();
        int i16 = m1Var.h;
        if (!p5 && i13 >= i16) {
            throw new IllegalStateException();
        }
        if (z10) {
            i13 = m1Var.a(this.G);
            j10 = -9223372036854775807L;
        } else if (i13 == -1) {
            i11 = i14;
            j10 = J0;
            h1 m12 = m1(this.f11670j0, m1Var, n1(m1Var, i11, j10));
            i12 = m12.f11726e;
            if (i11 != -1 && i12 != 1) {
                i12 = (!m1Var.p() || i11 >= i16) ? 4 : 2;
            }
            l1 = l1(m12, i12);
            this.f11673l.f11852n.a(17, new k0(b12, this.M, i11, e2.d0.P(j10))).b();
            if (this.f11670j0.f11724b.f48640a.equals(l1.f11724b.f48640a) && !this.f11670j0.f11723a.p()) {
                z11 = true;
            } else {
                z11 = false;
            }
            B1(l1, 0, z11, 4, h1(l1), -1, false);
        } else {
            j10 = j3;
        }
        i11 = i13;
        h1 m122 = m1(this.f11670j0, m1Var, n1(m1Var, i11, j10));
        i12 = m122.f11726e;
        if (i11 != -1) {
            if (m1Var.p()) {
            }
        }
        l1 = l1(m122, i12);
        this.f11673l.f11852n.a(17, new k0(b12, this.M, i11, e2.d0.P(j10))).b();
        if (this.f11670j0.f11724b.f48640a.equals(l1.f11724b.f48640a)) {
        }
        z11 = false;
        B1(l1, 0, z11, 4, h1(l1), -1, false);
    }

    @Override
    public final boolean u() {
        D1();
        return this.f11670j0.f11732l;
    }

    @Override
    public final int u0() {
        D1();
        return this.f11670j0.f11734n;
    }

    public final void u1(q1 q1Var) {
        D1();
        if (q1Var == null) {
            q1Var = q1.f11872e;
        }
        if (!this.L.equals(q1Var)) {
            this.L = q1Var;
            this.f11673l.f11852n.a(5, q1Var).b();
        }
    }

    public final void v1(Surface surface) {
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
        p0 p0Var = this.f11673l;
        if (!p0Var.X && p0Var.f11859s.getThread().isAlive()) {
            e2.g gVar = new e2.g(p0Var.F);
            p0Var.f11852n.a(30, new Pair(surface, gVar)).b();
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
            y1(new n(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final b2.k1 w0() {
        D1();
        return this.f11670j0.f11723a;
    }

    public final void w1(SurfaceView surfaceView) {
        SurfaceHolder holder;
        D1();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        D1();
        if (holder == null) {
            D1();
            q1();
            v1(null);
            o1(0, 0);
            return;
        }
        q1();
        this.U = true;
        this.T = holder;
        holder.addCallback(this.f11687y);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            v1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            o1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        v1(null);
        o1(0, 0);
    }

    @Override
    public final void x(boolean z10) {
        D1();
        if (this.G != z10) {
            this.G = z10;
            e2.z zVar = this.f11673l.f11852n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8590a = zVar.f8592a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            y yVar = new y(0, z10);
            e2.p pVar = this.f11675m;
            pVar.c(9, yVar);
            z1();
            pVar.b();
        }
    }

    @Override
    public final boolean x0() {
        D1();
        return false;
    }

    public final void x1(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        D1();
        if (textureView == null) {
            D1();
            q1();
            v1(null);
            o1(0, 0);
            return;
        }
        q1();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            e2.a.n("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f11687y);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            v1(null);
            o1(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        v1(surface);
        this.S = surface;
        o1(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public final Looper y0() {
        return this.f11683t;
    }

    public final void y1(n nVar) {
        h1 h1Var = this.f11670j0;
        h1 c10 = h1Var.c(h1Var.f11724b);
        c10.f11737q = c10.f11739s;
        c10.f11738r = 0L;
        h1 l1 = l1(c10, 1);
        if (nVar != null) {
            l1 = l1.f(nVar);
        }
        h1 h1Var2 = l1;
        this.H++;
        e2.z zVar = this.f11673l.f11852n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.f8590a = zVar.f8592a.obtainMessage(6);
        b10.b();
        B1(h1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long z() {
        D1();
        return this.f11686x;
    }

    @Override
    public final void z0() {
        D1();
    }

    public final void z1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        b2.x0 x0Var = this.N;
        String str = e2.d0.f8531a;
        f0 f0Var = this.f11662f;
        boolean o9 = f0Var.o();
        boolean d02 = f0Var.d0();
        boolean Q0 = f0Var.Q0();
        boolean P0 = f0Var.P0();
        boolean M0 = f0Var.M0();
        boolean t02 = f0Var.t0();
        boolean p5 = f0Var.w0().p();
        ?? obj = new Object();
        obj.f3681a = new b2.p();
        b2.p pVar = (b2.p) obj.f3681a;
        pVar.c(this.f11657c.f3686a);
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
            this.f11675m.c(13, new x(this, 3));
        }
    }
}
