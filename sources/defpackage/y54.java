package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
public final class y54 implements oc8 {
    public final gn5 A;
    public final short B;
    public final ko C;
    public final o90 D;
    public final x54 E;
    public final tg2 F;
    public final tg2 G;
    public int H;
    public boolean I;
    public int J;
    public byte K;
    public boolean L;
    public final mr9 M;
    public gv9 N;
    public wga O;
    public kc8 P;
    public jr6 Q;
    public jr6 R;
    public fm4 S;
    public Surface T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final boolean Y;
    public wia Z;
    public final znb a;
    public nz a0;
    public final cyb b;
    public float b0;
    public final kc8 c;
    public float c0;
    public final vq2 d;
    public boolean d0;
    public final Context e;
    public v33 e0;
    public final y54 f;
    public final boolean f0;
    public final ug0[] g;
    public boolean g0;
    public final ug0[] h;
    public final int h0;
    public final sc3 i;
    public boolean i0;
    public final cdb j;
    public final de3 j0;
    public final o54 k;
    public icc k0;
    public final i64 l;
    public final short l0;
    public final a66 m;
    public final short m0;
    public final CopyOnWriteArraySet n;
    public final short n0;
    public final xnb o;
    public jr6 o0;
    public final ArrayList p;
    public yb8 p0;
    public final boolean q;
    public int q0;
    public final qx6 r;
    public long r0;
    public final l93 s;
    public ge2 s0;
    public final Looper t;
    public final ArrayList t0;
    public final s93 u;
    public final adb v;
    public final t54 w;
    public final u54 x;
    public final xf4 y;
    public final ekc z;

    static {
        cr6.a("media3.exoplayer");
    }

    public y54(k54 k54Var) {
        boolean z;
        int i;
        byte b;
        y54 y54Var;
        boolean z2;
        x54 x54Var;
        y54 obj = new Object();
        obj.a = new znb();
        obj.t0 = new ArrayList();
        obj.d = new vq2();
        try {
            lad.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(obj)) + " [AndroidXMedia3/1.11.1] [" + g8c.a + "]");
            Context context = k54Var.a;
            adb adbVar = k54Var.b;
            obj.e = context.getApplicationContext();
            k54Var.h.getClass();
            obj.s = new l93(adbVar);
            obj.h0 = k54Var.j;
            obj.a0 = k54Var.k;
            obj.Y = k54Var.l;
            obj.d0 = false;
            obj.B = k54Var.u;
            t54 t54Var = new t54(obj);
            obj.w = t54Var;
            obj.x = new Object();
            ug0[] d = ((vb3) k54Var.c.get()).d(new Handler(k54Var.i), t54Var, t54Var, t54Var, t54Var);
            obj.g = d;
            if (d.length > 0) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            obj.h = new ug0[d.length];
            int i2 = 0;
            while (true) {
                ug0[] ug0VarArr = obj.h;
                if (i2 >= ug0VarArr.length) {
                    break;
                }
                byte b2 = obj.g[i2].b;
                ug0VarArr[i2] = null;
                i2++;
            }
            sc3 sc3Var = (sc3) k54Var.e.get();
            obj.i = sc3Var;
            obj.r = (qx6) k54Var.d.get();
            s93 d2 = s93.d(k54Var.g.b);
            obj.u = d2;
            obj.q = k54Var.m;
            obj.N = k54Var.n;
            obj.l0 = k54Var.p;
            obj.m0 = k54Var.q;
            obj.n0 = k54Var.r;
            obj.M = k54Var.o;
            Looper looper = k54Var.i;
            obj.t = looper;
            obj.v = adbVar;
            obj.f = obj;
            obj.m = new a66(new CopyOnWriteArraySet(), looper, looper.getThread(), adbVar, new w44((y54) obj), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            obj.n = copyOnWriteArraySet;
            obj.p = new ArrayList();
            obj.O = new wga();
            ug0[] ug0VarArr2 = obj.g;
            cyb cybVar = new cyb(new d79[ug0VarArr2.length], new k64[ug0VarArr2.length], eyb.b, null);
            obj.b = cybVar;
            obj.o = new xnb();
            jc8 jc8Var = new jc8();
            jc8Var.a.d(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            sc3Var.getClass();
            jc8Var.a(29, true);
            kc8 b3 = jc8Var.b();
            obj.c = b3;
            jc8 jc8Var2 = new jc8();
            e31 e31Var = jc8Var2.a;
            e31Var.c(b3.a);
            e31Var.b(4);
            e31Var.b(10);
            obj.P = jc8Var2.b();
            obj.j = adbVar.a(looper, null);
            o54 o54Var = new o54(obj, (byte) 0);
            obj.k = o54Var;
            obj.p0 = yb8.k(cybVar);
            obj.s.W(obj, looper);
            uc8 uc8Var = new uc8(k54Var.B);
            i64 i64Var = new i64(obj.e, obj.g, obj.h, sc3Var, cybVar, (lb3) k54Var.f.get(), d2, obj.H, obj.I, obj.s, obj.N, k54Var.s, k54Var.t, k54Var.C, looper, adbVar, o54Var, uc8Var, obj.x, k54Var.D);
            cdb cdbVar = i64Var.h;
            obj.l = i64Var;
            Looper looper2 = i64Var.r;
            obj.b0 = 1.0f;
            obj.H = 0;
            jr6 jr6Var = jr6.M;
            obj.Q = jr6Var;
            obj.R = jr6Var;
            obj.o0 = jr6Var;
            obj.q0 = -1;
            obj.e0 = v33.d;
            obj.f0 = true;
            obj.y(obj.s);
            d2.a(new Handler(looper), obj.s);
            copyOnWriteArraySet.add(obj.w);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                try {
                    Context context2 = obj.e;
                    boolean z3 = k54Var.z;
                    cdb a = adbVar.a(i64Var.r, null);
                    i = i3;
                    b = 1;
                    qg qgVar = new qg(context2, z3, (Object) obj, uc8Var, (byte) 17);
                    y54Var = obj;
                    a.e(qgVar);
                } catch (Throwable th) {
                    th = th;
                    obj = obj;
                    obj.d.e();
                    throw th;
                }
            } else {
                i = i3;
                b = 1;
                y54Var = obj;
            }
            y54 y54Var2 = y54Var;
            try {
                ko koVar = new ko((Object) 0, looper2, looper, adbVar, new o54(y54Var, b));
                y54Var2.C = koVar;
                koVar.j(new li3(y54Var2, (byte) 29));
                Context context3 = k54Var.a;
                Looper looper3 = k54Var.i;
                t54 t54Var2 = y54Var2.w;
                ?? obj2 = new Object();
                obj2.b = context3.getApplicationContext();
                obj2.d = adbVar.a(looper2, null);
                obj2.c = new pz(obj2, adbVar.a(looper3, null), t54Var2);
                y54Var2.y = obj2;
                obj2.G();
                if (k54Var.v != Integer.MAX_VALUE && k54Var.w != Integer.MAX_VALUE && k54Var.x != Integer.MAX_VALUE && k54Var.y != Integer.MAX_VALUE) {
                    z2 = b;
                } else {
                    z2 = false;
                }
                ekc ekcVar = new ekc(context, looper2, adbVar);
                y54Var2.z = ekcVar;
                if (ekcVar.a != z2) {
                    ekcVar.a = z2;
                    ekcVar.a(z2, ekcVar.b);
                }
                y54Var2.A = new gn5(context, looper2, adbVar);
                y54Var2.j0 = de3.c;
                y54Var2.k0 = icc.d;
                y54Var2.Z = wia.c;
                if (i >= 34) {
                    x54Var = new x54(y54Var2, context);
                } else {
                    x54Var = null;
                }
                y54Var2.E = x54Var;
                y54Var2.F = new tg2((byte) 26);
                y54Var2.G = new tg2((byte) 26);
                obj = y54Var2;
                obj.D = new o90(obj, y54Var2.w, y54Var2.v, k54Var.v, k54Var.w, k54Var.x, k54Var.y);
                cdbVar.c(38, obj.M).b();
                nz nzVar = obj.a0;
                cdbVar.getClass();
                bdb d3 = cdb.d();
                d3.a = cdbVar.a.obtainMessage(31, 0, 0, nzVar);
                d3.b();
                obj.m1(b, 3, obj.a0);
                obj.m1(2, 4, Integer.valueOf(obj.Y ? 1 : 0));
                obj.m1(2, 5, 0);
                obj.m1(b, 9, Boolean.valueOf(obj.d0));
                obj.m1(6, 8, obj.x);
                obj.m1(-1, 16, Integer.valueOf(obj.h0));
                obj.d.e();
            } catch (Throwable th2) {
                th = th2;
                obj = y54Var2;
                obj.d.e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long Z0(yb8 yb8Var) {
        znb znbVar = new znb();
        xnb xnbVar = new xnb();
        yb8Var.a.g(yb8Var.b.a, xnbVar);
        long j = yb8Var.c;
        if (j == -9223372036854775807L) {
            return yb8Var.a.m(xnbVar.c, znbVar, 0L).k;
        }
        return xnbVar.e + j;
    }

    public static yb8 c1(yb8 yb8Var, int i) {
        yb8 h = yb8Var.h(i);
        if (i != 1 && i != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final int A() {
        y1();
        if (this.p0.a.p()) {
            int i = this.q0;
            if (i == -1) {
                return 0;
            }
            return i;
        }
        yb8 yb8Var = this.p0;
        return yb8Var.a.b(yb8Var.b.a);
    }

    @Override
    public final void A0(int i, br6 br6Var) {
        r0(mm5.u(br6Var), i, i + 1);
    }

    @Override
    public final icc B() {
        y1();
        return this.k0;
    }

    @Override
    public final Looper B0() {
        return this.t;
    }

    @Override
    public final void C() {
        l1();
    }

    @Override
    public final void C0() {
        y1();
        if (this.b0 != 0.0f) {
            R(0.0f);
        }
    }

    @Override
    public final float D() {
        y1();
        return this.b0;
    }

    @Override
    public final void D0(br6 br6Var) {
        N0(mm5.u(br6Var));
    }

    @Override
    public final void E() {
        j1(l0(), -9223372036854775807L, false);
    }

    @Override
    public final void E0() {
        y1();
    }

    @Override
    public final nz F() {
        y1();
        return this.a0;
    }

    @Override
    public final boolean F0() {
        y1();
        return this.I;
    }

    @Override
    public final void G(int i, boolean z) {
        y1();
    }

    @Override
    public final byb G0() {
        y1();
        return this.i.f;
    }

    @Override
    public final de3 H() {
        y1();
        return this.j0;
    }

    @Override
    public final long H0() {
        y1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        yb8 yb8Var = this.p0;
        long j = 0;
        if (yb8Var.k.d != yb8Var.b.d) {
            return g8c.i0(yb8Var.a.m(l0(), this.a, 0L).l);
        }
        long j2 = yb8Var.q;
        if (this.p0.k.c()) {
            yb8 yb8Var2 = this.p0;
            yb8Var2.a.g(yb8Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j = j2;
        }
        yb8 yb8Var3 = this.p0;
        aob aobVar = yb8Var3.a;
        Object obj = yb8Var3.k.a;
        xnb xnbVar = this.o;
        aobVar.g(obj, xnbVar);
        return g8c.i0(j + xnbVar.e);
    }

    @Override
    public final void I() {
        y1();
    }

    @Override
    public final void I0(int i) {
        y1();
    }

    @Override
    public final void J(int i, int i2) {
        y1();
    }

    @Override
    public final void J0() {
        int e;
        if (!y0().p() && !l()) {
            if (a1()) {
                aob y0 = y0();
                if (y0.p()) {
                    e = -1;
                } else {
                    int l0 = l0();
                    y1();
                    int i = this.H;
                    if (i == 1) {
                        i = 0;
                    }
                    y1();
                    e = y0.e(l0, i, this.I);
                }
                if (e == -1) {
                    y1();
                    return;
                } else if (e == l0()) {
                    j1(l0(), -9223372036854775807L, true);
                    return;
                } else {
                    j1(e, -9223372036854775807L, false);
                    return;
                }
            } else if (P0() && u0()) {
                j1(l0(), -9223372036854775807L, false);
                return;
            } else {
                y1();
                return;
            }
        }
        y1();
    }

    @Override
    public final void K(int i) {
        y1();
    }

    @Override
    public final void K0() {
        y1();
        long m = m() + this.m0;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            m = Math.min(m, duration);
        }
        k1(Math.max(m, 0L));
    }

    @Override
    public final int L() {
        y1();
        if (l()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override
    public final void L0() {
        y1();
        long m = m() + (-this.l0);
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            m = Math.min(m, duration);
        }
        k1(Math.max(m, 0L));
    }

    @Override
    public final void M(byb bybVar) {
        y1();
        sc3 sc3Var = this.i;
        sc3Var.getClass();
        byb G0 = G0();
        if (!bybVar.equals(sc3Var.f)) {
            sc3Var.m(bybVar);
        }
        if (!G0.equals(bybVar)) {
            this.m.e(19, new kx3(bybVar, (byte) 7));
        }
    }

    @Override
    public final jr6 M0() {
        y1();
        return this.Q;
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void N0(List list) {
        y1();
        ArrayList T0 = T0(list);
        y1();
        o1(-1, -9223372036854775807L, T0, true);
    }

    @Override
    public final void O(int i) {
        P(i, i + 1);
    }

    @Override
    public final long O0() {
        y1();
        return this.l0;
    }

    @Override
    public final void P(int i, int i2) {
        boolean z;
        y1();
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            yb8 h1 = h1(this.p0, i, min);
            w1(h1, 0, !h1.b.a.equals(this.p0.b.a), 4, W0(h1), -1, false);
        }
    }

    @Override
    public final boolean P0() {
        aob y0 = y0();
        if (!y0.p() && y0.m(l0(), this.a, 0L).a()) {
            return true;
        }
        return false;
    }

    @Override
    public final void Q(SurfaceHolder surfaceHolder) {
        y1();
        if (surfaceHolder == null) {
            y1();
            i1();
            q1(null);
            f1(0, 0);
            return;
        }
        i1();
        this.W = true;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            q1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            f1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        q1(null);
        f1(0, 0);
    }

    public final void Q0(int i, List list) {
        boolean z;
        boolean z2;
        y1();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        int min = Math.min(i, this.p.size());
        if (this.p0.a.p()) {
            if (this.q0 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            y1();
            o1(-1, -9223372036854775807L, list, z2);
            return;
        }
        w1(R0(this.p0, min, list), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void R(float f) {
        y1();
        float h = g8c.h(f, 0.0f, 1.0f);
        float f2 = this.b0;
        if (f2 == h) {
            return;
        }
        if (h != 0.0f) {
            f2 = h;
        }
        this.c0 = f2;
        this.b0 = h;
        this.l.h.c(32, Float.valueOf(h)).b();
        this.m.e(22, new n54(h, (byte) 0));
    }

    public final yb8 R0(yb8 yb8Var, int i, List list) {
        aob aobVar = yb8Var.a;
        this.J++;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = list.size();
            ArrayList arrayList2 = this.p;
            if (i2 < size) {
                dy6 dy6Var = new dy6((qg0) list.get(i2), this.q);
                arrayList.add(dy6Var);
                arrayList2.add(i2 + i, new v54(dy6Var.b, dy6Var.a));
                i2++;
            } else {
                this.O = this.O.b(i, arrayList.size());
                dd8 dd8Var = new dd8(arrayList2, this.O);
                yb8 d1 = d1(yb8Var, dd8Var, Y0(aobVar, dd8Var, X0(yb8Var), V0(yb8Var)));
                wga wgaVar = this.O;
                cdb cdbVar = this.l.h;
                d64 d64Var = new d64(arrayList, wgaVar, -1, -9223372036854775807L);
                cdbVar.getClass();
                bdb d = cdb.d();
                d.a = cdbVar.a.obtainMessage(18, i, 0, d64Var);
                d.b();
                return d1;
            }
        }
    }

    @Override
    public final void S() {
        if (!y0().p() && !l()) {
            boolean b1 = b1();
            if (P0() && !c0()) {
                if (b1) {
                    l1();
                    return;
                } else {
                    y1();
                    return;
                }
            }
            if (b1) {
                long m = m();
                y1();
                if (m <= this.n0) {
                    l1();
                    return;
                }
            }
            k1(0L);
            return;
        }
        y1();
    }

    public final jr6 S0() {
        boolean z;
        aob y0 = y0();
        if (y0.p()) {
            return this.o0;
        }
        br6 br6Var = y0.m(l0(), this.a, 0L).b;
        hr6 a = this.o0.a();
        jr6 jr6Var = br6Var.d;
        if (jr6Var != null) {
            mm5 mm5Var = jr6Var.L;
            byte[] bArr = jr6Var.k;
            CharSequence charSequence = jr6Var.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = jr6Var.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = jr6Var.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = jr6Var.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = jr6Var.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = jr6Var.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = jr6Var.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = jr6Var.h;
            if (l != null) {
                if (l.longValue() >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                gre.f(z);
                a.h = l;
            }
            fz8 fz8Var = jr6Var.i;
            if (fz8Var != null) {
                a.i = fz8Var;
            }
            fz8 fz8Var2 = jr6Var.j;
            if (fz8Var2 != null) {
                a.j = fz8Var2;
            }
            Uri uri = jr6Var.n;
            if (uri != null || bArr != null) {
                a.n = uri;
                a.b(bArr, jr6Var.m);
                a.l = jr6Var.l;
            }
            Integer num = jr6Var.o;
            if (num != null) {
                a.o = num;
            }
            Integer num2 = jr6Var.p;
            if (num2 != null) {
                a.p = num2;
            }
            Integer num3 = jr6Var.q;
            if (num3 != null) {
                a.q = num3;
            }
            Boolean bool = jr6Var.r;
            if (bool != null) {
                a.r = bool;
            }
            Boolean bool2 = jr6Var.s;
            if (bool2 != null) {
                a.s = bool2;
            }
            Integer num4 = jr6Var.t;
            if (num4 != null) {
                a.t = num4;
            }
            Integer num5 = jr6Var.u;
            if (num5 != null) {
                a.t = num5;
            }
            Integer num6 = jr6Var.v;
            if (num6 != null) {
                a.u = num6;
            }
            Integer num7 = jr6Var.w;
            if (num7 != null) {
                a.v = num7;
            }
            Integer num8 = jr6Var.x;
            if (num8 != null) {
                a.w = num8;
            }
            Integer num9 = jr6Var.y;
            if (num9 != null) {
                a.x = num9;
            }
            Integer num10 = jr6Var.z;
            if (num10 != null) {
                a.y = num10;
            }
            CharSequence charSequence8 = jr6Var.A;
            if (charSequence8 != null) {
                a.z = charSequence8;
            }
            CharSequence charSequence9 = jr6Var.B;
            if (charSequence9 != null) {
                a.A = charSequence9;
            }
            CharSequence charSequence10 = jr6Var.C;
            if (charSequence10 != null) {
                a.B = charSequence10;
            }
            CharSequence charSequence11 = jr6Var.D;
            if (charSequence11 != null) {
                a.C = charSequence11;
            }
            Integer num11 = jr6Var.E;
            if (num11 != null) {
                a.D = num11;
            }
            Integer num12 = jr6Var.F;
            if (num12 != null) {
                a.E = num12;
            }
            CharSequence charSequence12 = jr6Var.G;
            if (charSequence12 != null) {
                a.F = charSequence12;
            }
            CharSequence charSequence13 = jr6Var.H;
            if (charSequence13 != null) {
                a.G = charSequence13;
            }
            CharSequence charSequence14 = jr6Var.I;
            if (charSequence14 != null) {
                a.H = charSequence14;
            }
            Integer num13 = jr6Var.J;
            if (num13 != null) {
                a.I = num13;
            }
            Bundle bundle = jr6Var.K;
            if (bundle != null) {
                a.J = bundle;
            }
            if (!mm5Var.isEmpty()) {
                a.K = mm5.q(mm5Var);
            }
        }
        return new jr6(a);
    }

    @Override
    public final void T(List list, int i, long j) {
        y1();
        ArrayList T0 = T0(list);
        y1();
        o1(i, j, T0, false);
    }

    public final ArrayList T0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.d((br6) list.get(i)));
        }
        return arrayList;
    }

    @Override
    public final j54 U() {
        y1();
        return this.p0.f;
    }

    public final yc8 U0(xc8 xc8Var) {
        int X0 = X0(this.p0);
        aob aobVar = this.p0.a;
        if (X0 == -1) {
            X0 = 0;
        }
        i64 i64Var = this.l;
        return new yc8(i64Var, xc8Var, aobVar, X0, i64Var.r);
    }

    @Override
    public final void V(boolean z) {
        y1();
        v1(1, z);
    }

    public final long V0(yb8 yb8Var) {
        rx6 rx6Var = yb8Var.b;
        long j = yb8Var.c;
        aob aobVar = yb8Var.a;
        if (rx6Var.c()) {
            Object obj = yb8Var.b.a;
            xnb xnbVar = this.o;
            aobVar.g(obj, xnbVar);
            if (j == -9223372036854775807L) {
                return g8c.i0(aobVar.m(X0(yb8Var), this.a, 0L).k);
            }
            return g8c.i0(j) + g8c.i0(xnbVar.e);
        }
        return g8c.i0(W0(yb8Var));
    }

    @Override
    public final void W(int i) {
        j1(i, -9223372036854775807L, false);
    }

    public final long W0(yb8 yb8Var) {
        long j;
        if (yb8Var.a.p()) {
            return g8c.T(this.r0);
        }
        if (yb8Var.p) {
            j = yb8Var.l();
        } else {
            j = yb8Var.s;
        }
        if (yb8Var.b.c()) {
            return j;
        }
        aob aobVar = yb8Var.a;
        Object obj = yb8Var.b.a;
        xnb xnbVar = this.o;
        aobVar.g(obj, xnbVar);
        return j + xnbVar.e;
    }

    @Override
    public final long X() {
        y1();
        return this.m0;
    }

    public final int X0(yb8 yb8Var) {
        if (yb8Var.a.p()) {
            return this.q0;
        }
        return yb8Var.a.g(yb8Var.b.a, this.o).c;
    }

    @Override
    public final long Y() {
        y1();
        return V0(this.p0);
    }

    public final Pair Y0(aob aobVar, dd8 dd8Var, int i, long j) {
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (!aobVar.p() && !dd8Var.p()) {
            Pair i3 = aobVar.i(this.a, this.o, i, g8c.T(j));
            Object obj = i3.first;
            if (dd8Var.b(obj) != -1) {
                return i3;
            }
            int T = i64.T(this.a, this.o, this.H, this.I, obj, aobVar, dd8Var);
            if (T != -1) {
                znb znbVar = this.a;
                dd8Var.m(T, znbVar, 0L);
                return e1(dd8Var, T, g8c.i0(znbVar.k));
            }
            return e1(dd8Var, -1, -9223372036854775807L);
        }
        if (aobVar.p() || !dd8Var.p()) {
            i2 = i;
            j2 = j;
        }
        return e1(dd8Var, i2, j2);
    }

    @Override
    public final void Z(int i, List list) {
        y1();
        Q0(i, T0(list));
    }

    @Override
    public final void a() {
        int i;
        y1();
        yb8 yb8Var = this.p0;
        if (yb8Var.e != 1) {
            return;
        }
        yb8 f = yb8Var.f(null);
        if (f.a.p()) {
            i = 4;
        } else {
            i = 2;
        }
        yb8 c1 = c1(f, i);
        this.J++;
        this.l.h.a(29).b();
        w1(c1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void a0() {
        y1();
        if (this.b0 == 0.0f) {
            float f = this.c0;
            if (f != 0.0f) {
                R(f);
            }
        }
    }

    public final boolean a1() {
        int e;
        aob y0 = y0();
        if (y0.p()) {
            e = -1;
        } else {
            int l0 = l0();
            y1();
            int i = this.H;
            if (i == 1) {
                i = 0;
            }
            y1();
            e = y0.e(l0, i, this.I);
        }
        if (e == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final void b(zb8 zb8Var) {
        y1();
        if (this.p0.o.equals(zb8Var)) {
            return;
        }
        yb8 g = this.p0.g(zb8Var);
        this.J++;
        this.l.h.c(4, zb8Var).b();
        w1(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long b0() {
        y1();
        if (l()) {
            yb8 yb8Var = this.p0;
            if (yb8Var.k.equals(yb8Var.b)) {
                return g8c.i0(this.p0.q);
            }
            return getDuration();
        }
        return H0();
    }

    public final boolean b1() {
        int k;
        aob y0 = y0();
        if (y0.p()) {
            k = -1;
        } else {
            int l0 = l0();
            y1();
            int i = this.H;
            if (i == 1) {
                i = 0;
            }
            y1();
            k = y0.k(l0, i, this.I);
        }
        if (k == -1) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(float f) {
        b(new zb8(f, g().b));
    }

    @Override
    public final boolean c0() {
        aob y0 = y0();
        if (!y0.p() && y0.m(l0(), this.a, 0L).g) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d() {
        y1();
        return this.p0.g;
    }

    @Override
    public final void d0() {
        int e;
        aob y0 = y0();
        if (y0.p()) {
            e = -1;
        } else {
            int l0 = l0();
            y1();
            int i = this.H;
            if (i == 1) {
                i = 0;
            }
            y1();
            e = y0.e(l0, i, this.I);
        }
        if (e == -1) {
            y1();
        } else if (e == l0()) {
            j1(l0(), -9223372036854775807L, true);
        } else {
            j1(e, -9223372036854775807L, false);
        }
    }

    public final yb8 d1(yb8 yb8Var, aob aobVar, Pair pair) {
        boolean z;
        rx6 rx6Var;
        txb txbVar;
        cyb cybVar;
        List list;
        int i;
        long j;
        if (!aobVar.p() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        gre.f(z);
        aob aobVar2 = yb8Var.a;
        long V0 = V0(yb8Var);
        yb8 j2 = yb8Var.j(aobVar);
        if (aobVar.p()) {
            rx6 rx6Var2 = yb8.u;
            long T = g8c.T(this.r0);
            txb txbVar2 = txb.d;
            cyb cybVar2 = this.b;
            km5 km5Var = mm5.b;
            yb8 c = j2.d(rx6Var2, T, T, T, 0L, txbVar2, cybVar2, w59.e).c(rx6Var2);
            c.q = c.s;
            return c;
        }
        Object obj = j2.b.a;
        String str = g8c.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            rx6Var = new rx6(pair.first);
        } else {
            rx6Var = j2.b;
        }
        long longValue = ((Long) pair.second).longValue();
        long T2 = g8c.T(V0);
        if (!aobVar2.p()) {
            T2 -= aobVar2.g(obj, this.o).e;
            if (equals && T2 - longValue == 1 && T2 == aobVar2.g(obj, this.o).d) {
                T2--;
            }
        }
        if (equals && longValue >= T2) {
            if (i == 0) {
                int b = aobVar.b(j2.k.a);
                if (b != -1 && aobVar.f(b, this.o, false).c == aobVar.g(rx6Var.a, this.o).c) {
                    return j2;
                }
                aobVar.g(rx6Var.a, this.o);
                boolean c2 = rx6Var.c();
                xnb xnbVar = this.o;
                if (c2) {
                    j = xnbVar.a(rx6Var.b, rx6Var.c);
                } else {
                    j = xnbVar.d;
                }
                rx6 rx6Var3 = rx6Var;
                yb8 c3 = j2.d(rx6Var3, j2.s, j2.s, j2.d, j - j2.s, j2.h, j2.i, j2.j).c(rx6Var3);
                c3.q = j;
                return c3;
            }
            rx6 rx6Var4 = rx6Var;
            gre.p(!rx6Var4.c());
            long max = Math.max(0L, j2.r - (longValue - T2));
            long j3 = j2.q;
            if (j2.k.equals(j2.b)) {
                j3 = longValue + max;
            }
            yb8 d = j2.d(rx6Var4, longValue, longValue, longValue, max, j2.h, j2.i, j2.j);
            d.q = j3;
            return d;
        }
        rx6 rx6Var5 = rx6Var;
        gre.p(!rx6Var5.c());
        if (!equals) {
            txbVar = txb.d;
            cybVar = this.b;
            km5 km5Var2 = mm5.b;
            list = w59.e;
        } else {
            txbVar = j2.h;
            cybVar = j2.i;
            list = j2.j;
        }
        yb8 c4 = j2.d(rx6Var5, longValue, longValue, longValue, 0L, txbVar, cybVar, list).c(rx6Var5);
        c4.q = longValue;
        return c4;
    }

    @Override
    public final void e() {
        V(false);
    }

    @Override
    public final void e0(int i) {
        y1();
    }

    public final Pair e1(aob aobVar, int i, long j) {
        if (aobVar.p()) {
            this.q0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.r0 = j;
            return null;
        }
        if (i == -1 || i >= aobVar.o()) {
            i = aobVar.a(this.I);
            j = g8c.i0(aobVar.m(i, this.a, 0L).k);
        }
        return aobVar.i(this.a, this.o, i, g8c.T(j));
    }

    @Override
    public final void f(long j) {
        k1(j);
    }

    @Override
    public final eyb f0() {
        y1();
        return (eyb) this.p0.i.e;
    }

    public final void f1(int i, int i2) {
        wia wiaVar = this.Z;
        if (i == wiaVar.a && i2 == wiaVar.b) {
            return;
        }
        this.Z = new wia(i, i2);
        ge2 ge2Var = this.s0;
        if (ge2Var != null) {
            ge2Var.execute(new bt(this, i, i2, (byte) 7));
            return;
        }
        this.m.e(24, new ll0(i, i2, (byte) 1));
        m1(2, 14, new wia(i, i2));
    }

    @Override
    public final zb8 g() {
        y1();
        return this.p0.o;
    }

    @Override
    public final jr6 g0() {
        y1();
        return this.R;
    }

    public final void g1() {
        boolean z;
        boolean z2;
        lad.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + g8c.a + "] [" + cr6.b() + "]");
        y1();
        this.y.G();
        this.z.b(false);
        this.A.a(false);
        x54 x54Var = this.E;
        if (x54Var != null && Build.VERSION.SDK_INT >= 34) {
            x54Var.a();
        }
        o90 o90Var = this.D;
        ((cdb) o90Var.f).f();
        ((y54) o90Var.a).p0((b30) o90Var.b);
        i64 i64Var = this.l;
        if (!i64Var.a0 && i64Var.r.getThread().isAlive()) {
            i64Var.a0 = true;
            vq2 vq2Var = new vq2(i64Var.F);
            i64Var.h.c(7, vq2Var).b();
            z = vq2Var.c(i64Var.K);
        } else {
            z = true;
        }
        if (!z) {
            this.m.e(10, new w44((byte) 4));
        }
        this.m.d();
        this.j.f();
        s93 s93Var = this.u;
        l93 l93Var = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) s93Var.c.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            he0 he0Var = (he0) it.next();
            if (he0Var.b == l93Var) {
                he0Var.c = true;
                copyOnWriteArrayList.remove(he0Var);
            }
        }
        yb8 yb8Var = this.p0;
        if (yb8Var.p) {
            yb8Var = yb8Var.a();
            this.p0 = yb8Var;
        }
        yb8 c1 = c1(yb8Var, 1);
        this.p0 = c1;
        yb8 c = c1.c(c1.b);
        this.p0 = c;
        c.q = c.s;
        this.p0.r = 0L;
        l93 l93Var2 = this.s;
        cdb cdbVar = l93Var2.n;
        cdbVar.getClass();
        cdbVar.e(new mk2(l93Var2, (byte) 18));
        i1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = v33.d;
        this.i0 = true;
        if (!this.p0.a.p()) {
            yb8 yb8Var2 = this.p0;
            if (yb8Var2.a.b(yb8Var2.b.a) != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Locale locale = Locale.US;
            yb8 yb8Var3 = this.p0;
            gre.o(String.format(locale, "periodUid %s not found in timeline %s with size %d", yb8Var3.b.a, yb8Var3.a.getClass().getName(), Integer.valueOf(this.p0.a.o())), z2);
        }
    }

    @Override
    public final long getDuration() {
        y1();
        if (l()) {
            yb8 yb8Var = this.p0;
            rx6 rx6Var = yb8Var.b;
            aob aobVar = yb8Var.a;
            Object obj = rx6Var.a;
            xnb xnbVar = this.o;
            aobVar.g(obj, xnbVar);
            return g8c.i0(xnbVar.a(rx6Var.b, rx6Var.c));
        }
        return z();
    }

    @Override
    public final int h() {
        y1();
        return this.p0.e;
    }

    @Override
    public final v33 h0() {
        y1();
        return this.e0;
    }

    public final yb8 h1(yb8 yb8Var, int i, int i2) {
        ArrayList arrayList;
        int X0 = X0(yb8Var);
        long V0 = V0(yb8Var);
        aob aobVar = yb8Var.a;
        this.J++;
        int i3 = i2 - 1;
        while (true) {
            arrayList = this.p;
            if (i3 < i) {
                break;
            }
            arrayList.remove(i3);
            i3--;
        }
        wga wgaVar = this.O;
        int i4 = i2 - i;
        int[] iArr = wgaVar.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 >= i && i7 < i2) {
                i5++;
            } else {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            }
        }
        this.O = new wga(iArr2, new Random(wgaVar.a.nextLong()));
        dd8 dd8Var = new dd8(arrayList, this.O);
        yb8 d1 = d1(yb8Var, dd8Var, Y0(aobVar, dd8Var, X0, V0));
        int i9 = d1.e;
        if (i9 != 1 && i9 != 4 && X0 >= i && X0 < i2) {
            if (i64.T(this.a, this.o, this.H, this.I, yb8Var.b.a, aobVar, dd8Var) == -1) {
                d1 = c1(d1, 4);
            }
        }
        wga wgaVar2 = this.O;
        cdb cdbVar = this.l.h;
        cdbVar.getClass();
        bdb d = cdb.d();
        d.a = cdbVar.a.obtainMessage(20, i, i2, wgaVar2);
        d.b();
        return d1;
    }

    @Override
    public final int i() {
        y1();
        return 0;
    }

    @Override
    public final void i0(nz nzVar, boolean z) {
        y1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, nzVar);
        a66 a66Var = this.m;
        if (!equals) {
            this.a0 = nzVar;
            m1(1, 3, nzVar);
            a66Var.c(20, new kx3(nzVar, (byte) 6));
        }
        nz nzVar2 = this.a0;
        cdb cdbVar = this.l.h;
        cdbVar.getClass();
        bdb d = cdb.d();
        d.a = cdbVar.a.obtainMessage(31, z ? 1 : 0, 0, nzVar2);
        d.b();
        a66Var.b();
    }

    public final void i1() {
        TextureView textureView = this.X;
        t54 t54Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != t54Var) {
                lad.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(t54Var);
            this.V = null;
        }
    }

    @Override
    public final boolean j() {
        if (h() == 3 && s() && v0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void j0(jr6 jr6Var) {
        y1();
        jr6Var.getClass();
        if (jr6Var.equals(this.R)) {
            return;
        }
        this.R = jr6Var;
        this.m.e(15, new o54(this, (byte) 3));
    }

    public final void j1(int i, long j, boolean z) {
        boolean z2;
        y1();
        if (i != -1) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            gre.f(z2);
            aob aobVar = this.p0.a;
            if (!aobVar.p() && i >= aobVar.o()) {
                return;
            }
            l93 l93Var = this.s;
            if (!l93Var.r) {
                tj Q = l93Var.Q();
                l93Var.r = true;
                l93Var.V(Q, -1, new vu2(Q, (byte) 14));
            }
            this.J++;
            if (l()) {
                lad.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                f64 f64Var = new f64(this.p0);
                f64Var.a(1);
                y54 y54Var = this.k.b;
                y54Var.j.e(new eu3(y54Var, f64Var, (byte) 12));
                return;
            }
            yb8 yb8Var = this.p0;
            int i2 = yb8Var.e;
            if (i2 == 3 || (i2 == 4 && !aobVar.p())) {
                yb8Var = this.p0.h(2);
            }
            int l0 = l0();
            yb8 d1 = d1(yb8Var, aobVar, e1(aobVar, i, j));
            this.l.h.c(3, new h64(aobVar, i, g8c.T(j))).b();
            w1(d1, 0, true, 1, W0(d1), l0, z);
        }
    }

    @Override
    public final void k() {
        V(true);
    }

    @Override
    public final int k0() {
        y1();
        if (l()) {
            return this.p0.b.b;
        }
        return -1;
    }

    public final void k1(long j) {
        j1(l0(), j, false);
    }

    @Override
    public final boolean l() {
        y1();
        return this.p0.b.c();
    }

    @Override
    public final int l0() {
        y1();
        int X0 = X0(this.p0);
        if (X0 == -1) {
            return 0;
        }
        return X0;
    }

    public final void l1() {
        int k;
        aob y0 = y0();
        if (y0.p()) {
            k = -1;
        } else {
            int l0 = l0();
            y1();
            int i = this.H;
            if (i == 1) {
                i = 0;
            }
            y1();
            k = y0.k(l0, i, this.I);
        }
        if (k == -1) {
            y1();
        } else if (k == l0()) {
            j1(l0(), -9223372036854775807L, true);
        } else {
            j1(k, -9223372036854775807L, false);
        }
    }

    @Override
    public final long m() {
        y1();
        return g8c.i0(W0(this.p0));
    }

    @Override
    public final boolean m0(int i) {
        y1();
        return this.P.a(i);
    }

    public final void m1(int i, int i2, Object obj) {
        ug0[] ug0VarArr;
        ug0[] ug0VarArr2;
        for (ug0 ug0Var : this.g) {
            if (i == -1 || ug0Var.b == i) {
                yc8 U0 = U0(ug0Var);
                gre.p(!U0.f);
                U0.c = i2;
                gre.p(!U0.f);
                U0.d = obj;
                U0.b();
            }
        }
        for (ug0 ug0Var2 : this.h) {
            if (ug0Var2 != null && (i == -1 || ug0Var2.b == i)) {
                yc8 U02 = U0(ug0Var2);
                gre.p(!U02.f);
                U02.c = i2;
                gre.p(!U02.f);
                U02.d = obj;
                U02.b();
            }
        }
    }

    @Override
    public final long n() {
        aob y0 = y0();
        if (y0.p()) {
            return -9223372036854775807L;
        }
        int l0 = l0();
        znb znbVar = this.a;
        if (y0.m(l0, znbVar, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (g8c.E(znbVar.f) - znbVar.e) - Y();
    }

    @Override
    public final void n0(int i) {
        y1();
        if (this.H != i) {
            this.H = i;
            this.l.h.b(11, i, 0).b();
            qf qfVar = new qf(i, (byte) 3);
            a66 a66Var = this.m;
            a66Var.c(8, qfVar);
            u1();
            a66Var.b();
        }
    }

    public final void n1(qg0 qg0Var, boolean z) {
        y1();
        List singletonList = Collections.singletonList(qg0Var);
        y1();
        o1(-1, -9223372036854775807L, singletonList, z);
    }

    @Override
    public final long o() {
        y1();
        return g8c.i0(this.p0.r);
    }

    @Override
    public final void o0(boolean z) {
        y1();
    }

    public final void o1(int i, long j, List list, boolean z) {
        int i2;
        long j2;
        boolean z2;
        int X0 = X0(this.p0);
        long m = m();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            dy6 dy6Var = new dy6((qg0) list.get(i3), this.q);
            arrayList2.add(dy6Var);
            arrayList.add(i3, new v54(dy6Var.b, dy6Var.a));
        }
        this.O = this.O.a().b(0, arrayList2.size());
        dd8 dd8Var = new dd8(arrayList, this.O);
        boolean p = dd8Var.p();
        int i4 = dd8Var.g;
        if (!p && i >= i4) {
            throw new IllegalStateException();
        }
        if (z) {
            j2 = -9223372036854775807L;
            i2 = dd8Var.a(this.I);
        } else if (i == -1) {
            i2 = X0;
            j2 = m;
        } else {
            i2 = i;
            j2 = j;
        }
        yb8 d1 = d1(this.p0, dd8Var, e1(dd8Var, i2, j2));
        int i5 = d1.e;
        if (i5 == 1) {
            i5 = 1;
        } else {
            if (!dd8Var.p()) {
                if (i2 != -1) {
                    if (i2 < i4) {
                        i5 = 2;
                    }
                }
            }
            i5 = 4;
        }
        yb8 c1 = c1(d1, i5);
        this.l.h.c(17, new d64(arrayList2, this.O, i2, g8c.T(j2))).b();
        if (!this.p0.b.a.equals(c1.b.a) && !this.p0.a.p()) {
            z2 = true;
        } else {
            z2 = false;
        }
        w1(c1, 0, z2, 4, W0(c1), -1, false);
    }

    @Override
    public final void p(int i, long j) {
        j1(i, j, false);
    }

    @Override
    public final void p0(mc8 mc8Var) {
        boolean z;
        y1();
        mc8Var.getClass();
        a66 a66Var = this.m;
        if (a66Var.i) {
            if (Thread.currentThread() == a66Var.a) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = a66Var.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            z56 z56Var = (z56) it.next();
            if (z56Var.a.equals(mc8Var)) {
                y56 y56Var = a66Var.c;
                z56Var.d = true;
                if (y56Var != null && z56Var.c) {
                    z56Var.c = false;
                    y56Var.c(z56Var.a, z56Var.b.f());
                }
                copyOnWriteArraySet.remove(z56Var);
            }
        }
    }

    public final void p1(gv9 gv9Var) {
        y1();
        if (gv9Var == null) {
            gv9Var = gv9.f;
        }
        if (!this.N.equals(gv9Var)) {
            this.N = gv9Var;
            this.l.h.c(5, gv9Var).b();
        }
    }

    @Override
    public final kc8 q() {
        y1();
        return this.P;
    }

    @Override
    public final void q0(br6 br6Var) {
        N0(mm5.u(br6Var));
    }

    public final void q1(Surface surface) {
        boolean z;
        long j;
        Surface surface2 = this.T;
        boolean z2 = true;
        if (surface2 != null && surface2 != surface) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = this.B;
        } else {
            j = -9223372036854775807L;
        }
        i64 i64Var = this.l;
        if (!i64Var.a0 && i64Var.r.getThread().isAlive()) {
            vq2 vq2Var = new vq2(i64Var.F);
            i64Var.h.c(30, new Pair(surface, vq2Var)).b();
            if (j != -9223372036854775807L) {
                z2 = vq2Var.c(j);
            }
        }
        if (z) {
            Surface surface3 = this.T;
            Surface surface4 = this.U;
            if (surface3 == surface4) {
                try {
                    surface4.release();
                } catch (Throwable unused) {
                }
                this.U = null;
            }
        }
        this.T = surface;
        if (!z2) {
            t1(new j54(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final void r(br6 br6Var, long j) {
        T(mm5.u(br6Var), 0, j);
    }

    @Override
    public final void r0(List list, int i, int i2) {
        boolean z;
        lob lobVar;
        y1();
        boolean z2 = true;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (min - i == list.size()) {
            for (int i3 = i; i3 < min; i3++) {
                if (((v54) arrayList.get(i3)).b.k.a((br6) list.get(i3 - i))) {
                }
            }
            this.J++;
            cdb cdbVar = this.l.h;
            cdbVar.getClass();
            bdb d = cdb.d();
            d.a = cdbVar.a.obtainMessage(27, i, min, list);
            d.b();
            for (int i4 = i; i4 < min; i4++) {
                v54 v54Var = (v54) arrayList.get(i4);
                aob aobVar = v54Var.c;
                br6 br6Var = (br6) list.get(i4 - i);
                if (aobVar instanceof lob) {
                    lobVar = new lob(((lob) aobVar).e, br6Var);
                } else {
                    lobVar = new lob(aobVar, br6Var);
                }
                v54Var.c = lobVar;
            }
            w1(this.p0.j(new dd8(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList T0 = T0(list);
        if (this.p0.a.p()) {
            if (this.q0 != -1) {
                z2 = false;
            }
            y1();
            o1(-1, -9223372036854775807L, T0, z2);
            return;
        }
        yb8 h1 = h1(R0(this.p0, min, T0), i, min);
        w1(h1, 0, !h1.b.a.equals(this.p0.b.a), 4, W0(h1), -1, false);
    }

    public final void r1(Surface surface) {
        int i;
        y1();
        i1();
        q1(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        f1(i, i);
    }

    @Override
    public final boolean s() {
        y1();
        return this.p0.l;
    }

    @Override
    public final void s0(int i, int i2) {
        if (i != i2) {
            t0(i, i + 1, i2);
        }
    }

    public final void s1(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        y1();
        if (textureView == null) {
            y1();
            i1();
            q1(null);
            f1(0, 0);
            return;
        }
        i1();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            lad.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            q1(null);
            f1(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        q1(surface);
        this.U = surface;
        f1(textureView.getWidth(), textureView.getHeight());
    }

    @Override
    public final void stop() {
        y1();
        t1(null);
        km5 km5Var = mm5.b;
        this.e0 = new v33(this.p0.s, w59.e);
    }

    @Override
    public final void t() {
        P(0, Integer.MAX_VALUE);
    }

    @Override
    public final void t0(int i, int i2, int i3) {
        boolean z;
        y1();
        if (i >= 0 && i <= i2 && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            aob y0 = y0();
            this.J++;
            g8c.S(i, min, min2, arrayList);
            wga wgaVar = this.O;
            wgaVar.getClass();
            this.O = wgaVar;
            dd8 dd8Var = new dd8(arrayList, this.O);
            yb8 yb8Var = this.p0;
            yb8 d1 = d1(yb8Var, dd8Var, Y0(y0, dd8Var, X0(yb8Var), V0(this.p0)));
            wga wgaVar2 = this.O;
            i64 i64Var = this.l;
            i64Var.getClass();
            i64Var.h.c(19, new e64(i, min, min2, wgaVar2)).b();
            w1(d1, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(j54 j54Var) {
        yb8 yb8Var = this.p0;
        yb8 c = yb8Var.c(yb8Var.b);
        c.q = c.s;
        c.r = 0L;
        yb8 c1 = c1(c, 1);
        if (j54Var != null) {
            c1 = c1.f(j54Var);
        }
        this.J++;
        this.l.h.a(6).b();
        w1(c1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final br6 u() {
        aob y0 = y0();
        if (y0.p()) {
            return null;
        }
        return y0.m(l0(), this.a, 0L).b;
    }

    @Override
    public final boolean u0() {
        aob y0 = y0();
        if (!y0.p() && y0.m(l0(), this.a, 0L).h) {
            return true;
        }
        return false;
    }

    public final void u1() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kc8 kc8Var = this.P;
        String str = g8c.a;
        y54 y54Var = this.f;
        boolean l = y54Var.l();
        boolean c0 = y54Var.c0();
        boolean b1 = y54Var.b1();
        boolean a1 = y54Var.a1();
        boolean P0 = y54Var.P0();
        boolean u0 = y54Var.u0();
        boolean p = y54Var.y0().p();
        jc8 jc8Var = new jc8();
        jc8Var.a.c(this.c.a);
        boolean z7 = !l;
        jc8Var.a(4, z7);
        boolean z8 = false;
        if (c0 && !l) {
            z = true;
        } else {
            z = false;
        }
        jc8Var.a(5, z);
        if (b1 && !l) {
            z2 = true;
        } else {
            z2 = false;
        }
        jc8Var.a(6, z2);
        if (!p && ((b1 || !P0 || c0) && !l)) {
            z3 = true;
        } else {
            z3 = false;
        }
        jc8Var.a(7, z3);
        if (a1 && !l) {
            z4 = true;
        } else {
            z4 = false;
        }
        jc8Var.a(8, z4);
        if (!p && ((a1 || (P0 && u0)) && !l)) {
            z5 = true;
        } else {
            z5 = false;
        }
        jc8Var.a(9, z5);
        jc8Var.a(10, z7);
        if (c0 && !l) {
            z6 = true;
        } else {
            z6 = false;
        }
        jc8Var.a(11, z6);
        if (c0 && !l) {
            z8 = true;
        }
        jc8Var.a(12, z8);
        kc8 b = jc8Var.b();
        this.P = b;
        if (!b.equals(kc8Var)) {
            this.m.c(13, new o54(this, (byte) 2));
        }
    }

    @Override
    public final void v(boolean z) {
        y1();
        if (this.I != z) {
            this.I = z;
            this.l.h.b(12, z ? 1 : 0, 0).b();
            p54 p54Var = new p54((byte) 0, z);
            a66 a66Var = this.m;
            a66Var.c(9, p54Var);
            u1();
            a66Var.b();
        }
    }

    @Override
    public final int v0() {
        y1();
        return this.p0.n;
    }

    public final void v1(int i, boolean z) {
        int i2;
        yb8 yb8Var = this.p0;
        int i3 = yb8Var.n;
        if (i3 == 1 && !z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (yb8Var.l == z && i3 == i2 && yb8Var.m == i) {
            return;
        }
        this.J++;
        if (yb8Var.p) {
            yb8Var = yb8Var.a();
        }
        yb8 e = yb8Var.e(i, i2, z);
        this.l.h.b(1, z ? 1 : 0, (i2 << 4) | i).b();
        w1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int w() {
        long j;
        if (!m0(16)) {
            return 0;
        }
        long b0 = b0();
        long duration = getDuration();
        if (b0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = g8c.a;
        long d = yne.d(b0, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j = d / duration;
        } else {
            j = b0 / (duration / 100);
        }
        return g8c.i(gle.d(j), 0, 100);
    }

    @Override
    public final void w0(List list) {
        Z(Integer.MAX_VALUE, list);
    }

    public final void w1(final yb8 yb8Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        Pair pair;
        int i5;
        br6 br6Var;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int i10;
        int i11;
        Object obj;
        br6 br6Var2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long Z0;
        Object obj3;
        br6 br6Var3;
        Object obj4;
        long j5;
        boolean z5;
        yb8 yb8Var2 = this.p0;
        this.p0 = yb8Var;
        if (!yb8Var.a.p()) {
            if (yb8Var.a.b(yb8Var.b.a) != -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            gre.o(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", yb8Var.b.a, yb8Var.a.getClass().getName(), Integer.valueOf(yb8Var.a.o())), z5);
        }
        boolean equals = yb8Var2.a.equals(yb8Var.a);
        znb znbVar = this.a;
        xnb xnbVar = this.o;
        aob aobVar = yb8Var2.a;
        rx6 rx6Var = yb8Var2.b;
        aob aobVar2 = yb8Var.a;
        rx6 rx6Var2 = yb8Var.b;
        if (aobVar2.p() && aobVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
            i4 = 0;
        } else {
            i4 = 0;
            if (aobVar2.p() != aobVar.p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!aobVar.m(aobVar.g(rx6Var.a, xnbVar).c, znbVar, 0L).a.equals(aobVar2.m(aobVar2.g(rx6Var2.a, xnbVar).c, znbVar, 0L).a)) {
                if (z) {
                    i5 = 1;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            i5 = 2;
                        }
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
                }
                if (!equals) {
                    i5 = 3;
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
                } else {
                    sdb.a();
                    return;
                }
            } else if (z && i2 == 0 && rx6Var.d < rx6Var2.d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else if (z && i2 == 1 && z2) {
                pair = new Pair(Boolean.TRUE, 2);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!yb8Var.a.p()) {
                br6Var = yb8Var.a.m(yb8Var.a.g(yb8Var.b.a, this.o).c, this.a, 0L).b;
            } else {
                br6Var = null;
            }
            this.o0 = jr6.M;
        } else {
            br6Var = null;
        }
        if (booleanValue || !yb8Var2.j.equals(yb8Var.j)) {
            hr6 a = this.o0.a();
            List list = yb8Var.j;
            for (int i12 = i4; i12 < list.size(); i12++) {
                ld7 ld7Var = (ld7) list.get(i12);
                int i13 = i4;
                while (true) {
                    jd7[] jd7VarArr = ld7Var.a;
                    if (i13 < jd7VarArr.length) {
                        jd7VarArr[i13].b(a);
                        i13++;
                    }
                }
            }
            this.o0 = new jr6(a);
        }
        jr6 S0 = S0();
        boolean equals2 = S0.equals(this.Q);
        this.Q = S0;
        if (yb8Var2.l != yb8Var.l) {
            i6 = 1;
        } else {
            i6 = i4;
        }
        if (yb8Var2.e != yb8Var.e) {
            i7 = 1;
        } else {
            i7 = i4;
        }
        if (i7 != 0 || i6 != 0) {
            x1();
        }
        if (yb8Var2.g != yb8Var.g) {
            i8 = 1;
        } else {
            i8 = i4;
        }
        if (!equals) {
            this.m.c(i4, new l41(yb8Var, i));
        }
        if (z) {
            xnb xnbVar2 = new xnb();
            if (!yb8Var2.a.p()) {
                Object obj5 = yb8Var2.b.a;
                yb8Var2.a.g(obj5, xnbVar2);
                int i14 = xnbVar2.c;
                int b = yb8Var2.a.b(obj5);
                i9 = i6;
                z3 = equals2;
                z4 = booleanValue;
                obj = yb8Var2.a.m(i14, this.a, 0L).a;
                br6Var2 = this.a.b;
                obj2 = obj5;
                i10 = i14;
                i11 = b;
            } else {
                i9 = i6;
                z3 = equals2;
                z4 = booleanValue;
                i10 = i3;
                i11 = i10;
                obj = null;
                br6Var2 = null;
                obj2 = null;
            }
            rx6 rx6Var3 = yb8Var2.b;
            if (i2 == 0) {
                boolean c = rx6Var3.c();
                rx6 rx6Var4 = yb8Var2.b;
                if (c) {
                    j4 = xnbVar2.a(rx6Var4.b, rx6Var4.c);
                    Z0 = Z0(yb8Var2);
                } else if (rx6Var4.e != -1) {
                    j4 = Z0(this.p0);
                    Z0 = j4;
                } else {
                    j2 = xnbVar2.e;
                    j3 = xnbVar2.d;
                    j4 = j2 + j3;
                    Z0 = j4;
                }
            } else if (rx6Var3.c()) {
                j4 = yb8Var2.s;
                Z0 = Z0(yb8Var2);
            } else {
                j2 = xnbVar2.e;
                j3 = yb8Var2.s;
                j4 = j2 + j3;
                Z0 = j4;
            }
            long i0 = g8c.i0(j4);
            long i02 = g8c.i0(Z0);
            rx6 rx6Var5 = yb8Var2.b;
            nc8 nc8Var = new nc8(obj, i10, br6Var2, obj2, i11, i0, i02, rx6Var5.b, rx6Var5.c);
            znb znbVar2 = this.a;
            int l0 = l0();
            int A = A();
            if (!this.p0.a.p()) {
                yb8 yb8Var3 = this.p0;
                Object obj6 = yb8Var3.b.a;
                yb8Var3.a.g(obj6, this.o);
                A = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(l0, znbVar2, 0L).a;
                br6Var3 = znbVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                br6Var3 = null;
                obj4 = null;
            }
            int i15 = A;
            long i03 = g8c.i0(j);
            if (this.p0.b.c()) {
                j5 = g8c.i0(Z0(this.p0));
            } else {
                j5 = i03;
            }
            rx6 rx6Var6 = this.p0.b;
            this.m.c(11, new q54(i2, nc8Var, new nc8(obj3, l0, br6Var3, obj4, i15, i03, j5, rx6Var6.b, rx6Var6.c)));
        } else {
            i9 = i6;
            z3 = equals2;
            z4 = booleanValue;
        }
        if (z4) {
            this.m.c(1, new jh(br6Var, intValue, (byte) 8));
        }
        if (yb8Var2.f != yb8Var.f) {
            this.m.c(10, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
            if (yb8Var.f != null) {
                this.m.c(10, new x56() {
                    @Override
                    public final void invoke(Object obj8) {
                        byte b2 = r2;
                        yb8 yb8Var4 = yb8Var;
                        mc8 mc8Var = (mc8) obj8;
                        switch (b2) {
                            case 0:
                                mc8Var.e(yb8Var4.g);
                                mc8Var.o(yb8Var4.g);
                                return;
                            case 1:
                                mc8Var.H(yb8Var4.e, yb8Var4.l);
                                return;
                            case 2:
                                mc8Var.t(yb8Var4.e);
                                return;
                            case 3:
                                mc8Var.p(yb8Var4.m, yb8Var4.l);
                                return;
                            case 4:
                                mc8Var.b(yb8Var4.n);
                                return;
                            case 5:
                                mc8Var.P(yb8Var4.m());
                                return;
                            case 6:
                                mc8Var.J(yb8Var4.o);
                                return;
                            case 7:
                                mc8Var.E(yb8Var4.f);
                                return;
                            case 8:
                                mc8Var.F(yb8Var4.f);
                                return;
                            default:
                                mc8Var.z((eyb) yb8Var4.i.e);
                                return;
                        }
                    }
                });
            }
        }
        cyb cybVar = yb8Var2.i;
        cyb cybVar2 = yb8Var.i;
        if (cybVar != cybVar2) {
            sc3 sc3Var = this.i;
            sc3Var.getClass();
            sc3Var.c = (ko) cybVar2.f;
            this.m.c(2, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (!z3) {
            this.m.c(14, new kx3(this.Q, (byte) 5));
        }
        if (i8 != 0) {
            this.m.c(3, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i7 != 0 || i9 != 0) {
            this.m.c(-1, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i7 != 0) {
            this.m.c(4, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i9 != 0 || yb8Var2.m != yb8Var.m) {
            this.m.c(5, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (yb8Var2.n != yb8Var.n) {
            this.m.c(6, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (yb8Var2.m() != yb8Var.m()) {
            this.m.c(7, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (!yb8Var2.o.equals(yb8Var.o)) {
            this.m.c(12, new x56() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    yb8 yb8Var4 = yb8Var;
                    mc8 mc8Var = (mc8) obj8;
                    switch (b2) {
                        case 0:
                            mc8Var.e(yb8Var4.g);
                            mc8Var.o(yb8Var4.g);
                            return;
                        case 1:
                            mc8Var.H(yb8Var4.e, yb8Var4.l);
                            return;
                        case 2:
                            mc8Var.t(yb8Var4.e);
                            return;
                        case 3:
                            mc8Var.p(yb8Var4.m, yb8Var4.l);
                            return;
                        case 4:
                            mc8Var.b(yb8Var4.n);
                            return;
                        case 5:
                            mc8Var.P(yb8Var4.m());
                            return;
                        case 6:
                            mc8Var.J(yb8Var4.o);
                            return;
                        case 7:
                            mc8Var.E(yb8Var4.f);
                            return;
                        case 8:
                            mc8Var.F(yb8Var4.f);
                            return;
                        default:
                            mc8Var.z((eyb) yb8Var4.i.e);
                            return;
                    }
                }
            });
        }
        u1();
        this.m.b();
        if (yb8Var2.p != yb8Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((t54) it.next()).a.x1();
            }
        }
    }

    @Override
    public final long x() {
        y1();
        return this.n0;
    }

    @Override
    public final int x0() {
        y1();
        return this.H;
    }

    public final void x1() {
        int h = h();
        gn5 gn5Var = this.A;
        ekc ekcVar = this.z;
        boolean z = false;
        if (h != 1) {
            if (h != 2 && h != 3) {
                if (h != 4) {
                    sdb.a();
                    return;
                }
            } else {
                y1();
                boolean z2 = this.p0.p;
                if (s() && !z2) {
                    z = true;
                }
                ekcVar.b(z);
                gn5Var.a(s());
                return;
            }
        }
        ekcVar.b(false);
        gn5Var.a(false);
    }

    @Override
    public final void y(mc8 mc8Var) {
        mc8Var.getClass();
        this.m.a(mc8Var);
    }

    @Override
    public final aob y0() {
        y1();
        return this.p0.a;
    }

    public final void y1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = g8c.a;
            Locale locale = Locale.US;
            String i = b00.i("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f0) {
                if (this.g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                lad.g("ExoPlayerImpl", i, illegalStateException);
                this.g0 = true;
                return;
            }
            sc8.j(i);
        }
    }

    @Override
    public final long z() {
        aob y0 = y0();
        if (y0.p()) {
            return -9223372036854775807L;
        }
        return g8c.i0(y0.m(l0(), this.a, 0L).l);
    }

    @Override
    public final boolean z0() {
        y1();
        return false;
    }
}
