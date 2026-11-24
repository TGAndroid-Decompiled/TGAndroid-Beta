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
public final class h74 implements re8 {
    public final gp5 A;
    public final short B;
    public final kp C;
    public final oa0 D;
    public final g74 E;
    public final lx6 F;
    public final lx6 G;
    public int H;
    public boolean I;
    public int J;
    public byte K;
    public boolean L;
    public final ot9 M;
    public jx9 N;
    public yia O;
    public ne8 P;
    public jt6 Q;
    public jt6 R;
    public go4 S;
    public Surface T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final boolean Y;
    public yka Z;
    public final aqb a;
    public o00 a0;
    public final e0c b;
    public float b0;
    public final ne8 c;
    public float c0;
    public final gs2 d;
    public boolean d0;
    public final Context e;
    public g53 e0;
    public final h74 f;
    public final boolean f0;
    public final uh0[] g;
    public boolean g0;
    public final uh0[] h;
    public final int h0;
    public final fe3 i;
    public boolean i0;
    public final dfb j;
    public final of3 j0;
    public final y64 k;
    public jec k0;
    public final r74 l;
    public final short l0;
    public final a86 m;
    public final short m0;
    public final CopyOnWriteArraySet n;
    public final short n0;
    public final ypb o;
    public jt6 o0;
    public final ArrayList p;
    public be8 p0;
    public final boolean q;
    public int q0;
    public final qz6 r;
    public long r0;
    public final xa3 s;
    public rf2 s0;
    public final Looper t;
    public final ArrayList t0;
    public final eb3 u;
    public final bfb v;
    public final c74 w;
    public final d74 x;
    public final yh4 y;
    public final dmc z;

    static {
        ct6.a("media3.exoplayer");
    }

    public h74(v64 v64Var) {
        boolean z;
        int i;
        byte b;
        h74 h74Var;
        boolean z2;
        g74 g74Var;
        h74 obj = new Object();
        obj.a = new aqb();
        obj.t0 = new ArrayList();
        obj.d = new gs2();
        try {
            ncd.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(obj)) + " [AndroidXMedia3/1.11.1] [" + hac.a + "]");
            Context context = v64Var.a;
            bfb bfbVar = v64Var.b;
            obj.e = context.getApplicationContext();
            v64Var.h.getClass();
            obj.s = new xa3(bfbVar);
            obj.h0 = v64Var.j;
            obj.a0 = v64Var.k;
            obj.Y = v64Var.l;
            obj.d0 = false;
            obj.B = v64Var.u;
            c74 c74Var = new c74(obj);
            obj.w = c74Var;
            obj.x = new Object();
            uh0[] d = ((hd3) v64Var.c.get()).d(new Handler(v64Var.i), c74Var, c74Var, c74Var, c74Var);
            obj.g = d;
            if (d.length > 0) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            obj.h = new uh0[d.length];
            int i2 = 0;
            while (true) {
                uh0[] uh0VarArr = obj.h;
                if (i2 >= uh0VarArr.length) {
                    break;
                }
                byte b2 = obj.g[i2].b;
                uh0VarArr[i2] = null;
                i2++;
            }
            fe3 fe3Var = (fe3) v64Var.e.get();
            obj.i = fe3Var;
            obj.r = (qz6) v64Var.d.get();
            eb3 d2 = eb3.d(v64Var.g.b);
            obj.u = d2;
            obj.q = v64Var.m;
            obj.N = v64Var.n;
            obj.l0 = v64Var.p;
            obj.m0 = v64Var.q;
            obj.n0 = v64Var.r;
            obj.M = v64Var.o;
            Looper looper = v64Var.i;
            obj.t = looper;
            obj.v = bfbVar;
            obj.f = obj;
            obj.m = new a86(new CopyOnWriteArraySet(), looper, looper.getThread(), bfbVar, new h64((h74) obj), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            obj.n = copyOnWriteArraySet;
            obj.p = new ArrayList();
            obj.O = new yia();
            uh0[] uh0VarArr2 = obj.g;
            e0c e0cVar = new e0c(new f99[uh0VarArr2.length], new t74[uh0VarArr2.length], g0c.b, null);
            obj.b = e0cVar;
            obj.o = new ypb();
            me8 me8Var = new me8();
            me8Var.a.d(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            fe3Var.getClass();
            me8Var.a(29, true);
            ne8 b3 = me8Var.b();
            obj.c = b3;
            me8 me8Var2 = new me8();
            m41 m41Var = me8Var2.a;
            m41Var.c(b3.a);
            m41Var.b(4);
            m41Var.b(10);
            obj.P = me8Var2.b();
            obj.j = bfbVar.a(looper, null);
            y64 y64Var = new y64(obj, (byte) 0);
            obj.k = y64Var;
            obj.p0 = be8.k(e0cVar);
            obj.s.W(obj, looper);
            we8 we8Var = new we8(v64Var.B);
            r74 r74Var = new r74(obj.e, obj.g, obj.h, fe3Var, e0cVar, (xc3) v64Var.f.get(), d2, obj.H, obj.I, obj.s, obj.N, v64Var.s, v64Var.t, v64Var.C, looper, bfbVar, y64Var, we8Var, obj.x, v64Var.D);
            dfb dfbVar = r74Var.h;
            obj.l = r74Var;
            Looper looper2 = r74Var.r;
            obj.b0 = 1.0f;
            obj.H = 0;
            jt6 jt6Var = jt6.M;
            obj.Q = jt6Var;
            obj.R = jt6Var;
            obj.o0 = jt6Var;
            obj.q0 = -1;
            obj.e0 = g53.d;
            obj.f0 = true;
            obj.y(obj.s);
            d2.a(new Handler(looper), obj.s);
            copyOnWriteArraySet.add(obj.w);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                try {
                    Context context2 = obj.e;
                    boolean z3 = v64Var.z;
                    dfb a = bfbVar.a(r74Var.r, null);
                    i = i3;
                    b = 1;
                    rh rhVar = new rh(context2, z3, (Object) obj, we8Var, (byte) 17);
                    h74Var = obj;
                    a.e(rhVar);
                } catch (Throwable th) {
                    th = th;
                    obj = obj;
                    obj.d.e();
                    throw th;
                }
            } else {
                i = i3;
                b = 1;
                h74Var = obj;
            }
            h74 h74Var2 = h74Var;
            try {
                kp kpVar = new kp((Object) 0, looper2, looper, bfbVar, new y64(h74Var, b));
                h74Var2.C = kpVar;
                kpVar.j(new a14(h74Var2, (byte) 4));
                Context context3 = v64Var.a;
                Looper looper3 = v64Var.i;
                c74 c74Var2 = h74Var2.w;
                ?? obj2 = new Object();
                obj2.b = context3.getApplicationContext();
                obj2.d = bfbVar.a(looper2, null);
                obj2.c = new p00(obj2, bfbVar.a(looper3, null), c74Var2);
                h74Var2.y = obj2;
                obj2.G();
                if (v64Var.v != Integer.MAX_VALUE && v64Var.w != Integer.MAX_VALUE && v64Var.x != Integer.MAX_VALUE && v64Var.y != Integer.MAX_VALUE) {
                    z2 = b;
                } else {
                    z2 = false;
                }
                dmc dmcVar = new dmc(context, looper2, bfbVar);
                h74Var2.z = dmcVar;
                if (dmcVar.a != z2) {
                    dmcVar.a = z2;
                    dmcVar.a(z2, dmcVar.b);
                }
                h74Var2.A = new gp5(context, looper2, bfbVar);
                h74Var2.j0 = of3.c;
                h74Var2.k0 = jec.d;
                h74Var2.Z = yka.c;
                if (i >= 34) {
                    g74Var = new g74(h74Var2, context);
                } else {
                    g74Var = null;
                }
                h74Var2.E = g74Var;
                h74Var2.F = new lx6((byte) 25);
                h74Var2.G = new lx6((byte) 25);
                obj = h74Var2;
                obj.D = new oa0(obj, h74Var2.w, h74Var2.v, v64Var.v, v64Var.w, v64Var.x, v64Var.y);
                dfbVar.c(38, obj.M).b();
                o00 o00Var = obj.a0;
                dfbVar.getClass();
                cfb d3 = dfb.d();
                d3.a = dfbVar.a.obtainMessage(31, 0, 0, o00Var);
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
                obj = h74Var2;
                obj.d.e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long Z0(be8 be8Var) {
        aqb aqbVar = new aqb();
        ypb ypbVar = new ypb();
        be8Var.a.g(be8Var.b.a, ypbVar);
        long j = be8Var.c;
        if (j == -9223372036854775807L) {
            return be8Var.a.m(ypbVar.c, aqbVar, 0L).k;
        }
        return ypbVar.e + j;
    }

    public static be8 c1(be8 be8Var, int i) {
        be8 h = be8Var.h(i);
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
        be8 be8Var = this.p0;
        return be8Var.a.b(be8Var.b.a);
    }

    @Override
    public final void A0(int i, bt6 bt6Var) {
        r0(mo5.u(bt6Var), i, i + 1);
    }

    @Override
    public final jec B() {
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
    public final void D0(bt6 bt6Var) {
        N0(mo5.u(bt6Var));
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
    public final o00 F() {
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
    public final d0c G0() {
        y1();
        return this.i.f;
    }

    @Override
    public final of3 H() {
        y1();
        return this.j0;
    }

    @Override
    public final long H0() {
        y1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        be8 be8Var = this.p0;
        long j = 0;
        if (be8Var.k.d != be8Var.b.d) {
            return hac.i0(be8Var.a.m(l0(), this.a, 0L).l);
        }
        long j2 = be8Var.q;
        if (this.p0.k.c()) {
            be8 be8Var2 = this.p0;
            be8Var2.a.g(be8Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j = j2;
        }
        be8 be8Var3 = this.p0;
        bqb bqbVar = be8Var3.a;
        Object obj = be8Var3.k.a;
        ypb ypbVar = this.o;
        bqbVar.g(obj, ypbVar);
        return hac.i0(j + ypbVar.e);
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
        if (!y0().p() && !m()) {
            if (a1()) {
                bqb y0 = y0();
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
        long k = k() + this.m0;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            k = Math.min(k, duration);
        }
        k1(Math.max(k, 0L));
    }

    @Override
    public final int L() {
        y1();
        if (m()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override
    public final void L0() {
        y1();
        long k = k() + (-this.l0);
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            k = Math.min(k, duration);
        }
        k1(Math.max(k, 0L));
    }

    @Override
    public final void M(d0c d0cVar) {
        y1();
        fe3 fe3Var = this.i;
        fe3Var.getClass();
        d0c G0 = G0();
        if (!d0cVar.equals(fe3Var.f)) {
            fe3Var.m(d0cVar);
        }
        if (!G0.equals(d0cVar)) {
            this.m.e(19, new yu3(d0cVar, (byte) 10));
        }
    }

    @Override
    public final jt6 M0() {
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
        jte.f(z);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            be8 h1 = h1(this.p0, i, min);
            w1(h1, 0, !h1.b.a.equals(this.p0.b.a), 4, W0(h1), -1, false);
        }
    }

    @Override
    public final boolean P0() {
        bqb y0 = y0();
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
        jte.f(z);
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
        float h = hac.h(f, 0.0f, 1.0f);
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
        this.m.e(22, new pc(h, (byte) 2));
    }

    public final be8 R0(be8 be8Var, int i, List list) {
        bqb bqbVar = be8Var.a;
        this.J++;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = list.size();
            ArrayList arrayList2 = this.p;
            if (i2 < size) {
                d07 d07Var = new d07((rh0) list.get(i2), this.q);
                arrayList.add(d07Var);
                arrayList2.add(i2 + i, new e74(d07Var.b, d07Var.a));
                i2++;
            } else {
                this.O = this.O.b(i, arrayList.size());
                ff8 ff8Var = new ff8(arrayList2, this.O);
                be8 d1 = d1(be8Var, ff8Var, Y0(bqbVar, ff8Var, X0(be8Var), V0(be8Var)));
                yia yiaVar = this.O;
                dfb dfbVar = this.l.h;
                m74 m74Var = new m74(arrayList, yiaVar, -1, -9223372036854775807L);
                dfbVar.getClass();
                cfb d = dfb.d();
                d.a = dfbVar.a.obtainMessage(18, i, 0, m74Var);
                d.b();
                return d1;
            }
        }
    }

    @Override
    public final void S() {
        if (!y0().p() && !m()) {
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
                long k = k();
                y1();
                if (k <= this.n0) {
                    l1();
                    return;
                }
            }
            k1(0L);
            return;
        }
        y1();
    }

    public final jt6 S0() {
        boolean z;
        bqb y0 = y0();
        if (y0.p()) {
            return this.o0;
        }
        bt6 bt6Var = y0.m(l0(), this.a, 0L).b;
        ht6 a = this.o0.a();
        jt6 jt6Var = bt6Var.d;
        if (jt6Var != null) {
            mo5 mo5Var = jt6Var.L;
            byte[] bArr = jt6Var.k;
            CharSequence charSequence = jt6Var.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = jt6Var.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = jt6Var.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = jt6Var.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = jt6Var.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = jt6Var.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = jt6Var.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = jt6Var.h;
            if (l != null) {
                if (l.longValue() >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                jte.f(z);
                a.h = l;
            }
            g19 g19Var = jt6Var.i;
            if (g19Var != null) {
                a.i = g19Var;
            }
            g19 g19Var2 = jt6Var.j;
            if (g19Var2 != null) {
                a.j = g19Var2;
            }
            Uri uri = jt6Var.n;
            if (uri != null || bArr != null) {
                a.n = uri;
                a.b(bArr, jt6Var.m);
                a.l = jt6Var.l;
            }
            Integer num = jt6Var.o;
            if (num != null) {
                a.o = num;
            }
            Integer num2 = jt6Var.p;
            if (num2 != null) {
                a.p = num2;
            }
            Integer num3 = jt6Var.q;
            if (num3 != null) {
                a.q = num3;
            }
            Boolean bool = jt6Var.r;
            if (bool != null) {
                a.r = bool;
            }
            Boolean bool2 = jt6Var.s;
            if (bool2 != null) {
                a.s = bool2;
            }
            Integer num4 = jt6Var.t;
            if (num4 != null) {
                a.t = num4;
            }
            Integer num5 = jt6Var.u;
            if (num5 != null) {
                a.t = num5;
            }
            Integer num6 = jt6Var.v;
            if (num6 != null) {
                a.u = num6;
            }
            Integer num7 = jt6Var.w;
            if (num7 != null) {
                a.v = num7;
            }
            Integer num8 = jt6Var.x;
            if (num8 != null) {
                a.w = num8;
            }
            Integer num9 = jt6Var.y;
            if (num9 != null) {
                a.x = num9;
            }
            Integer num10 = jt6Var.z;
            if (num10 != null) {
                a.y = num10;
            }
            CharSequence charSequence8 = jt6Var.A;
            if (charSequence8 != null) {
                a.z = charSequence8;
            }
            CharSequence charSequence9 = jt6Var.B;
            if (charSequence9 != null) {
                a.A = charSequence9;
            }
            CharSequence charSequence10 = jt6Var.C;
            if (charSequence10 != null) {
                a.B = charSequence10;
            }
            CharSequence charSequence11 = jt6Var.D;
            if (charSequence11 != null) {
                a.C = charSequence11;
            }
            Integer num11 = jt6Var.E;
            if (num11 != null) {
                a.D = num11;
            }
            Integer num12 = jt6Var.F;
            if (num12 != null) {
                a.E = num12;
            }
            CharSequence charSequence12 = jt6Var.G;
            if (charSequence12 != null) {
                a.F = charSequence12;
            }
            CharSequence charSequence13 = jt6Var.H;
            if (charSequence13 != null) {
                a.G = charSequence13;
            }
            CharSequence charSequence14 = jt6Var.I;
            if (charSequence14 != null) {
                a.H = charSequence14;
            }
            Integer num13 = jt6Var.J;
            if (num13 != null) {
                a.I = num13;
            }
            Bundle bundle = jt6Var.K;
            if (bundle != null) {
                a.J = bundle;
            }
            if (!mo5Var.isEmpty()) {
                a.K = mo5.q(mo5Var);
            }
        }
        return new jt6(a);
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
            arrayList.add(this.r.d((bt6) list.get(i)));
        }
        return arrayList;
    }

    @Override
    public final u64 U() {
        y1();
        return this.p0.f;
    }

    public final af8 U0(ze8 ze8Var) {
        int X0 = X0(this.p0);
        bqb bqbVar = this.p0.a;
        if (X0 == -1) {
            X0 = 0;
        }
        r74 r74Var = this.l;
        return new af8(r74Var, ze8Var, bqbVar, X0, r74Var.r);
    }

    @Override
    public final void V(boolean z) {
        y1();
        v1(1, z);
    }

    public final long V0(be8 be8Var) {
        rz6 rz6Var = be8Var.b;
        long j = be8Var.c;
        bqb bqbVar = be8Var.a;
        if (rz6Var.c()) {
            Object obj = be8Var.b.a;
            ypb ypbVar = this.o;
            bqbVar.g(obj, ypbVar);
            if (j == -9223372036854775807L) {
                return hac.i0(bqbVar.m(X0(be8Var), this.a, 0L).k);
            }
            return hac.i0(j) + hac.i0(ypbVar.e);
        }
        return hac.i0(W0(be8Var));
    }

    @Override
    public final void W(int i) {
        j1(i, -9223372036854775807L, false);
    }

    public final long W0(be8 be8Var) {
        long j;
        if (be8Var.a.p()) {
            return hac.T(this.r0);
        }
        if (be8Var.p) {
            j = be8Var.l();
        } else {
            j = be8Var.s;
        }
        if (be8Var.b.c()) {
            return j;
        }
        bqb bqbVar = be8Var.a;
        Object obj = be8Var.b.a;
        ypb ypbVar = this.o;
        bqbVar.g(obj, ypbVar);
        return j + ypbVar.e;
    }

    @Override
    public final long X() {
        y1();
        return this.m0;
    }

    public final int X0(be8 be8Var) {
        if (be8Var.a.p()) {
            return this.q0;
        }
        return be8Var.a.g(be8Var.b.a, this.o).c;
    }

    @Override
    public final long Y() {
        y1();
        return V0(this.p0);
    }

    public final Pair Y0(bqb bqbVar, ff8 ff8Var, int i, long j) {
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (!bqbVar.p() && !ff8Var.p()) {
            Pair i3 = bqbVar.i(this.a, this.o, i, hac.T(j));
            Object obj = i3.first;
            if (ff8Var.b(obj) != -1) {
                return i3;
            }
            int T = r74.T(this.a, this.o, this.H, this.I, obj, bqbVar, ff8Var);
            if (T != -1) {
                aqb aqbVar = this.a;
                ff8Var.m(T, aqbVar, 0L);
                return e1(ff8Var, T, hac.i0(aqbVar.k));
            }
            return e1(ff8Var, -1, -9223372036854775807L);
        }
        if (bqbVar.p() || !ff8Var.p()) {
            i2 = i;
            j2 = j;
        }
        return e1(ff8Var, i2, j2);
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
        be8 be8Var = this.p0;
        if (be8Var.e != 1) {
            return;
        }
        be8 f = be8Var.f(null);
        if (f.a.p()) {
            i = 4;
        } else {
            i = 2;
        }
        be8 c1 = c1(f, i);
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
        bqb y0 = y0();
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
    public final void b(ce8 ce8Var) {
        y1();
        if (this.p0.o.equals(ce8Var)) {
            return;
        }
        be8 g = this.p0.g(ce8Var);
        this.J++;
        this.l.h.c(4, ce8Var).b();
        w1(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long b0() {
        y1();
        if (m()) {
            be8 be8Var = this.p0;
            if (be8Var.k.equals(be8Var.b)) {
                return hac.i0(this.p0.q);
            }
            return getDuration();
        }
        return H0();
    }

    public final boolean b1() {
        int k;
        bqb y0 = y0();
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
    public final void c() {
        V(false);
    }

    @Override
    public final boolean c0() {
        bqb y0 = y0();
        if (!y0.p() && y0.m(l0(), this.a, 0L).g) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(float f) {
        b(new ce8(f, g().b));
    }

    @Override
    public final void d0() {
        int e;
        bqb y0 = y0();
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

    public final be8 d1(be8 be8Var, bqb bqbVar, Pair pair) {
        boolean z;
        rz6 rz6Var;
        vzb vzbVar;
        e0c e0cVar;
        List list;
        int i;
        long j;
        if (!bqbVar.p() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        jte.f(z);
        bqb bqbVar2 = be8Var.a;
        long V0 = V0(be8Var);
        be8 j2 = be8Var.j(bqbVar);
        if (bqbVar.p()) {
            rz6 rz6Var2 = be8.u;
            long T = hac.T(this.r0);
            vzb vzbVar2 = vzb.d;
            e0c e0cVar2 = this.b;
            ko5 ko5Var = mo5.b;
            be8 c = j2.d(rz6Var2, T, T, T, 0L, vzbVar2, e0cVar2, y79.e).c(rz6Var2);
            c.q = c.s;
            return c;
        }
        Object obj = j2.b.a;
        String str = hac.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            rz6Var = new rz6(pair.first);
        } else {
            rz6Var = j2.b;
        }
        long longValue = ((Long) pair.second).longValue();
        long T2 = hac.T(V0);
        if (!bqbVar2.p()) {
            T2 -= bqbVar2.g(obj, this.o).e;
            if (equals && T2 - longValue == 1 && T2 == bqbVar2.g(obj, this.o).d) {
                T2--;
            }
        }
        if (equals && longValue >= T2) {
            if (i == 0) {
                int b = bqbVar.b(j2.k.a);
                if (b != -1 && bqbVar.f(b, this.o, false).c == bqbVar.g(rz6Var.a, this.o).c) {
                    return j2;
                }
                bqbVar.g(rz6Var.a, this.o);
                boolean c2 = rz6Var.c();
                ypb ypbVar = this.o;
                if (c2) {
                    j = ypbVar.a(rz6Var.b, rz6Var.c);
                } else {
                    j = ypbVar.d;
                }
                rz6 rz6Var3 = rz6Var;
                be8 c3 = j2.d(rz6Var3, j2.s, j2.s, j2.d, j - j2.s, j2.h, j2.i, j2.j).c(rz6Var3);
                c3.q = j;
                return c3;
            }
            rz6 rz6Var4 = rz6Var;
            jte.p(!rz6Var4.c());
            long max = Math.max(0L, j2.r - (longValue - T2));
            long j3 = j2.q;
            if (j2.k.equals(j2.b)) {
                j3 = longValue + max;
            }
            be8 d = j2.d(rz6Var4, longValue, longValue, longValue, max, j2.h, j2.i, j2.j);
            d.q = j3;
            return d;
        }
        rz6 rz6Var5 = rz6Var;
        jte.p(!rz6Var5.c());
        if (!equals) {
            vzbVar = vzb.d;
            e0cVar = this.b;
            ko5 ko5Var2 = mo5.b;
            list = y79.e;
        } else {
            vzbVar = j2.h;
            e0cVar = j2.i;
            list = j2.j;
        }
        be8 c4 = j2.d(rz6Var5, longValue, longValue, longValue, 0L, vzbVar, e0cVar, list).c(rz6Var5);
        c4.q = longValue;
        return c4;
    }

    @Override
    public final void e(long j) {
        k1(j);
    }

    @Override
    public final void e0(int i) {
        y1();
    }

    public final Pair e1(bqb bqbVar, int i, long j) {
        if (bqbVar.p()) {
            this.q0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.r0 = j;
            return null;
        }
        if (i == -1 || i >= bqbVar.o()) {
            i = bqbVar.a(this.I);
            j = hac.i0(bqbVar.m(i, this.a, 0L).k);
        }
        return bqbVar.i(this.a, this.o, i, hac.T(j));
    }

    @Override
    public final boolean f() {
        y1();
        return this.p0.g;
    }

    @Override
    public final g0c f0() {
        y1();
        return (g0c) this.p0.i.e;
    }

    public final void f1(int i, int i2) {
        yka ykaVar = this.Z;
        if (i == ykaVar.a && i2 == ykaVar.b) {
            return;
        }
        this.Z = new yka(i, i2);
        rf2 rf2Var = this.s0;
        if (rf2Var != null) {
            rf2Var.execute(new cu(this, i, i2, (byte) 7));
            return;
        }
        this.m.e(24, new lm0(i, i2, (byte) 1));
        m1(2, 14, new yka(i, i2));
    }

    @Override
    public final ce8 g() {
        y1();
        return this.p0.o;
    }

    @Override
    public final jt6 g0() {
        y1();
        return this.R;
    }

    public final void g1() {
        boolean z;
        boolean z2;
        ncd.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + hac.a + "] [" + ct6.b() + "]");
        y1();
        this.y.G();
        this.z.b(false);
        this.A.a(false);
        g74 g74Var = this.E;
        if (g74Var != null && Build.VERSION.SDK_INT >= 34) {
            g74Var.a();
        }
        oa0 oa0Var = this.D;
        ((dfb) oa0Var.f).f();
        ((h74) oa0Var.a).p0((b40) oa0Var.b);
        r74 r74Var = this.l;
        if (!r74Var.a0 && r74Var.r.getThread().isAlive()) {
            r74Var.a0 = true;
            gs2 gs2Var = new gs2(r74Var.F);
            r74Var.h.c(7, gs2Var).b();
            z = gs2Var.c(r74Var.K);
        } else {
            z = true;
        }
        if (!z) {
            this.m.e(10, new h64((byte) 5));
        }
        this.m.d();
        this.j.f();
        eb3 eb3Var = this.u;
        xa3 xa3Var = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) eb3Var.c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            hf0 hf0Var = (hf0) it.next();
            if (hf0Var.b == xa3Var) {
                hf0Var.c = true;
                copyOnWriteArrayList.remove(hf0Var);
            }
        }
        be8 be8Var = this.p0;
        if (be8Var.p) {
            be8Var = be8Var.a();
            this.p0 = be8Var;
        }
        be8 c1 = c1(be8Var, 1);
        this.p0 = c1;
        be8 c = c1.c(c1.b);
        this.p0 = c;
        c.q = c.s;
        this.p0.r = 0L;
        xa3 xa3Var2 = this.s;
        dfb dfbVar = xa3Var2.n;
        dfbVar.getClass();
        dfbVar.e(new xf2(xa3Var2, (byte) 23));
        i1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = g53.d;
        this.i0 = true;
        if (!this.p0.a.p()) {
            be8 be8Var2 = this.p0;
            if (be8Var2.a.b(be8Var2.b.a) != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Locale locale = Locale.US;
            be8 be8Var3 = this.p0;
            jte.o(String.format(locale, "periodUid %s not found in timeline %s with size %d", be8Var3.b.a, be8Var3.a.getClass().getName(), Integer.valueOf(this.p0.a.o())), z2);
        }
    }

    @Override
    public final long getDuration() {
        y1();
        if (m()) {
            be8 be8Var = this.p0;
            rz6 rz6Var = be8Var.b;
            bqb bqbVar = be8Var.a;
            Object obj = rz6Var.a;
            ypb ypbVar = this.o;
            bqbVar.g(obj, ypbVar);
            return hac.i0(ypbVar.a(rz6Var.b, rz6Var.c));
        }
        return z();
    }

    @Override
    public final int h() {
        y1();
        return this.p0.e;
    }

    @Override
    public final g53 h0() {
        y1();
        return this.e0;
    }

    public final be8 h1(be8 be8Var, int i, int i2) {
        ArrayList arrayList;
        int X0 = X0(be8Var);
        long V0 = V0(be8Var);
        bqb bqbVar = be8Var.a;
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
        yia yiaVar = this.O;
        int i4 = i2 - i;
        int[] iArr = yiaVar.b;
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
        this.O = new yia(iArr2, new Random(yiaVar.a.nextLong()));
        ff8 ff8Var = new ff8(arrayList, this.O);
        be8 d1 = d1(be8Var, ff8Var, Y0(bqbVar, ff8Var, X0, V0));
        int i9 = d1.e;
        if (i9 != 1 && i9 != 4 && X0 >= i && X0 < i2) {
            if (r74.T(this.a, this.o, this.H, this.I, be8Var.b.a, bqbVar, ff8Var) == -1) {
                d1 = c1(d1, 4);
            }
        }
        yia yiaVar2 = this.O;
        dfb dfbVar = this.l.h;
        dfbVar.getClass();
        cfb d = dfb.d();
        d.a = dfbVar.a.obtainMessage(20, i, i2, yiaVar2);
        d.b();
        return d1;
    }

    @Override
    public final boolean i() {
        if (h() == 3 && s() && v0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i0(o00 o00Var, boolean z) {
        y1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, o00Var);
        a86 a86Var = this.m;
        if (!equals) {
            this.a0 = o00Var;
            m1(1, 3, o00Var);
            a86Var.c(20, new yu3(o00Var, (byte) 9));
        }
        o00 o00Var2 = this.a0;
        dfb dfbVar = this.l.h;
        dfbVar.getClass();
        cfb d = dfb.d();
        d.a = dfbVar.a.obtainMessage(31, z ? 1 : 0, 0, o00Var2);
        d.b();
        a86Var.b();
    }

    public final void i1() {
        TextureView textureView = this.X;
        c74 c74Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c74Var) {
                ncd.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c74Var);
            this.V = null;
        }
    }

    @Override
    public final void j() {
        V(true);
    }

    @Override
    public final void j0(jt6 jt6Var) {
        y1();
        jt6Var.getClass();
        if (jt6Var.equals(this.R)) {
            return;
        }
        this.R = jt6Var;
        this.m.e(15, new y64(this, (byte) 3));
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
            jte.f(z2);
            bqb bqbVar = this.p0.a;
            if (!bqbVar.p() && i >= bqbVar.o()) {
                return;
            }
            xa3 xa3Var = this.s;
            if (!xa3Var.r) {
                tk Q = xa3Var.Q();
                xa3Var.r = true;
                xa3Var.V(Q, -1, new wm2(Q, (byte) 17));
            }
            this.J++;
            if (m()) {
                ncd.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o74 o74Var = new o74(this.p0);
                o74Var.a(1);
                h74 h74Var = this.k.b;
                h74Var.j.e(new pv3(h74Var, o74Var, (byte) 13));
                return;
            }
            be8 be8Var = this.p0;
            int i2 = be8Var.e;
            if (i2 == 3 || (i2 == 4 && !bqbVar.p())) {
                be8Var = this.p0.h(2);
            }
            int l0 = l0();
            be8 d1 = d1(be8Var, bqbVar, e1(bqbVar, i, j));
            this.l.h.c(3, new q74(bqbVar, i, hac.T(j))).b();
            w1(d1, 0, true, 1, W0(d1), l0, z);
        }
    }

    @Override
    public final long k() {
        y1();
        return hac.i0(W0(this.p0));
    }

    @Override
    public final int k0() {
        y1();
        if (m()) {
            return this.p0.b.b;
        }
        return -1;
    }

    public final void k1(long j) {
        j1(l0(), j, false);
    }

    @Override
    public final int l() {
        y1();
        return 0;
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
        bqb y0 = y0();
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
    public final boolean m() {
        y1();
        return this.p0.b.c();
    }

    @Override
    public final boolean m0(int i) {
        y1();
        return this.P.a(i);
    }

    public final void m1(int i, int i2, Object obj) {
        uh0[] uh0VarArr;
        uh0[] uh0VarArr2;
        for (uh0 uh0Var : this.g) {
            if (i == -1 || uh0Var.b == i) {
                af8 U0 = U0(uh0Var);
                jte.p(!U0.f);
                U0.c = i2;
                jte.p(!U0.f);
                U0.d = obj;
                U0.b();
            }
        }
        for (uh0 uh0Var2 : this.h) {
            if (uh0Var2 != null && (i == -1 || uh0Var2.b == i)) {
                af8 U02 = U0(uh0Var2);
                jte.p(!U02.f);
                U02.c = i2;
                jte.p(!U02.f);
                U02.d = obj;
                U02.b();
            }
        }
    }

    @Override
    public final long n() {
        bqb y0 = y0();
        if (y0.p()) {
            return -9223372036854775807L;
        }
        int l0 = l0();
        aqb aqbVar = this.a;
        if (y0.m(l0, aqbVar, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (hac.E(aqbVar.f) - aqbVar.e) - Y();
    }

    @Override
    public final void n0(int i) {
        y1();
        if (this.H != i) {
            this.H = i;
            this.l.h.b(11, i, 0).b();
            pg pgVar = new pg(i, (byte) 3);
            a86 a86Var = this.m;
            a86Var.c(8, pgVar);
            u1();
            a86Var.b();
        }
    }

    public final void n1(rh0 rh0Var, boolean z) {
        y1();
        List singletonList = Collections.singletonList(rh0Var);
        y1();
        o1(-1, -9223372036854775807L, singletonList, z);
    }

    @Override
    public final long o() {
        y1();
        return hac.i0(this.p0.r);
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
        long k = k();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            d07 d07Var = new d07((rh0) list.get(i3), this.q);
            arrayList2.add(d07Var);
            arrayList.add(i3, new e74(d07Var.b, d07Var.a));
        }
        this.O = this.O.a().b(0, arrayList2.size());
        ff8 ff8Var = new ff8(arrayList, this.O);
        boolean p = ff8Var.p();
        int i4 = ff8Var.g;
        if (!p && i >= i4) {
            throw new IllegalStateException();
        }
        if (z) {
            j2 = -9223372036854775807L;
            i2 = ff8Var.a(this.I);
        } else if (i == -1) {
            i2 = X0;
            j2 = k;
        } else {
            i2 = i;
            j2 = j;
        }
        be8 d1 = d1(this.p0, ff8Var, e1(ff8Var, i2, j2));
        int i5 = d1.e;
        if (i5 == 1) {
            i5 = 1;
        } else {
            if (!ff8Var.p()) {
                if (i2 != -1) {
                    if (i2 < i4) {
                        i5 = 2;
                    }
                }
            }
            i5 = 4;
        }
        be8 c1 = c1(d1, i5);
        this.l.h.c(17, new m74(arrayList2, this.O, i2, hac.T(j2))).b();
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
    public final void p0(pe8 pe8Var) {
        boolean z;
        y1();
        pe8Var.getClass();
        a86 a86Var = this.m;
        if (a86Var.i) {
            if (Thread.currentThread() == a86Var.a) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = a86Var.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            z76 z76Var = (z76) it.next();
            if (z76Var.a.equals(pe8Var)) {
                y76 y76Var = a86Var.c;
                z76Var.d = true;
                if (y76Var != null && z76Var.c) {
                    z76Var.c = false;
                    y76Var.c(z76Var.a, z76Var.b.f());
                }
                copyOnWriteArraySet.remove(z76Var);
            }
        }
    }

    public final void p1(jx9 jx9Var) {
        y1();
        if (jx9Var == null) {
            jx9Var = jx9.f;
        }
        if (!this.N.equals(jx9Var)) {
            this.N = jx9Var;
            this.l.h.c(5, jx9Var).b();
        }
    }

    @Override
    public final ne8 q() {
        y1();
        return this.P;
    }

    @Override
    public final void q0(bt6 bt6Var) {
        N0(mo5.u(bt6Var));
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
        r74 r74Var = this.l;
        if (!r74Var.a0 && r74Var.r.getThread().isAlive()) {
            gs2 gs2Var = new gs2(r74Var.F);
            r74Var.h.c(30, new Pair(surface, gs2Var)).b();
            if (j != -9223372036854775807L) {
                z2 = gs2Var.c(j);
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
            t1(new u64(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final void r(bt6 bt6Var, long j) {
        T(mo5.u(bt6Var), 0, j);
    }

    @Override
    public final void r0(List list, int i, int i2) {
        boolean z;
        mqb mqbVar;
        y1();
        boolean z2 = true;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (min - i == list.size()) {
            for (int i3 = i; i3 < min; i3++) {
                if (((e74) arrayList.get(i3)).b.k.a((bt6) list.get(i3 - i))) {
                }
            }
            this.J++;
            dfb dfbVar = this.l.h;
            dfbVar.getClass();
            cfb d = dfb.d();
            d.a = dfbVar.a.obtainMessage(27, i, min, list);
            d.b();
            for (int i4 = i; i4 < min; i4++) {
                e74 e74Var = (e74) arrayList.get(i4);
                bqb bqbVar = e74Var.c;
                bt6 bt6Var = (bt6) list.get(i4 - i);
                if (bqbVar instanceof mqb) {
                    mqbVar = new mqb(((mqb) bqbVar).e, bt6Var);
                } else {
                    mqbVar = new mqb(bqbVar, bt6Var);
                }
                e74Var.c = mqbVar;
            }
            w1(this.p0.j(new ff8(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
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
        be8 h1 = h1(R0(this.p0, min, T0), i, min);
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
            ncd.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
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
        ko5 ko5Var = mo5.b;
        this.e0 = new g53(this.p0.s, y79.e);
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
        jte.f(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            bqb y0 = y0();
            this.J++;
            hac.S(i, min, min2, arrayList);
            yia yiaVar = this.O;
            yiaVar.getClass();
            this.O = yiaVar;
            ff8 ff8Var = new ff8(arrayList, this.O);
            be8 be8Var = this.p0;
            be8 d1 = d1(be8Var, ff8Var, Y0(y0, ff8Var, X0(be8Var), V0(this.p0)));
            yia yiaVar2 = this.O;
            r74 r74Var = this.l;
            r74Var.getClass();
            r74Var.h.c(19, new n74(i, min, min2, yiaVar2)).b();
            w1(d1, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(u64 u64Var) {
        be8 be8Var = this.p0;
        be8 c = be8Var.c(be8Var.b);
        c.q = c.s;
        c.r = 0L;
        be8 c1 = c1(c, 1);
        if (u64Var != null) {
            c1 = c1.f(u64Var);
        }
        this.J++;
        this.l.h.a(6).b();
        w1(c1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final bt6 u() {
        bqb y0 = y0();
        if (y0.p()) {
            return null;
        }
        return y0.m(l0(), this.a, 0L).b;
    }

    @Override
    public final boolean u0() {
        bqb y0 = y0();
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
        ne8 ne8Var = this.P;
        String str = hac.a;
        h74 h74Var = this.f;
        boolean m = h74Var.m();
        boolean c0 = h74Var.c0();
        boolean b1 = h74Var.b1();
        boolean a1 = h74Var.a1();
        boolean P0 = h74Var.P0();
        boolean u0 = h74Var.u0();
        boolean p = h74Var.y0().p();
        me8 me8Var = new me8();
        me8Var.a.c(this.c.a);
        boolean z7 = !m;
        me8Var.a(4, z7);
        boolean z8 = false;
        if (c0 && !m) {
            z = true;
        } else {
            z = false;
        }
        me8Var.a(5, z);
        if (b1 && !m) {
            z2 = true;
        } else {
            z2 = false;
        }
        me8Var.a(6, z2);
        if (!p && ((b1 || !P0 || c0) && !m)) {
            z3 = true;
        } else {
            z3 = false;
        }
        me8Var.a(7, z3);
        if (a1 && !m) {
            z4 = true;
        } else {
            z4 = false;
        }
        me8Var.a(8, z4);
        if (!p && ((a1 || (P0 && u0)) && !m)) {
            z5 = true;
        } else {
            z5 = false;
        }
        me8Var.a(9, z5);
        me8Var.a(10, z7);
        if (c0 && !m) {
            z6 = true;
        } else {
            z6 = false;
        }
        me8Var.a(11, z6);
        if (c0 && !m) {
            z8 = true;
        }
        me8Var.a(12, z8);
        ne8 b = me8Var.b();
        this.P = b;
        if (!b.equals(ne8Var)) {
            this.m.c(13, new y64(this, (byte) 2));
        }
    }

    @Override
    public final void v(boolean z) {
        y1();
        if (this.I != z) {
            this.I = z;
            this.l.h.b(12, z ? 1 : 0, 0).b();
            z64 z64Var = new z64((byte) 0, z);
            a86 a86Var = this.m;
            a86Var.c(9, z64Var);
            u1();
            a86Var.b();
        }
    }

    @Override
    public final int v0() {
        y1();
        return this.p0.n;
    }

    public final void v1(int i, boolean z) {
        int i2;
        be8 be8Var = this.p0;
        int i3 = be8Var.n;
        if (i3 == 1 && !z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (be8Var.l == z && i3 == i2 && be8Var.m == i) {
            return;
        }
        this.J++;
        if (be8Var.p) {
            be8Var = be8Var.a();
        }
        be8 e = be8Var.e(i, i2, z);
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
        String str = hac.a;
        long d = bqe.d(b0, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j = d / duration;
        } else {
            j = b0 / (duration / 100);
        }
        return hac.i(ine.d(j), 0, 100);
    }

    @Override
    public final void w0(List list) {
        Z(Integer.MAX_VALUE, list);
    }

    public final void w1(final be8 be8Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        Pair pair;
        int i5;
        bt6 bt6Var;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int i10;
        int i11;
        Object obj;
        bt6 bt6Var2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long Z0;
        Object obj3;
        bt6 bt6Var3;
        Object obj4;
        long j5;
        boolean z5;
        be8 be8Var2 = this.p0;
        this.p0 = be8Var;
        if (!be8Var.a.p()) {
            if (be8Var.a.b(be8Var.b.a) != -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            jte.o(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", be8Var.b.a, be8Var.a.getClass().getName(), Integer.valueOf(be8Var.a.o())), z5);
        }
        boolean equals = be8Var2.a.equals(be8Var.a);
        aqb aqbVar = this.a;
        ypb ypbVar = this.o;
        bqb bqbVar = be8Var2.a;
        rz6 rz6Var = be8Var2.b;
        bqb bqbVar2 = be8Var.a;
        rz6 rz6Var2 = be8Var.b;
        if (bqbVar2.p() && bqbVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
            i4 = 0;
        } else {
            i4 = 0;
            if (bqbVar2.p() != bqbVar.p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!bqbVar.m(bqbVar.g(rz6Var.a, ypbVar).c, aqbVar, 0L).a.equals(bqbVar2.m(bqbVar2.g(rz6Var2.a, ypbVar).c, aqbVar, 0L).a)) {
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
                    rjb.h();
                    return;
                }
            } else if (z && i2 == 0 && rz6Var.d < rz6Var2.d) {
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
            if (!be8Var.a.p()) {
                bt6Var = be8Var.a.m(be8Var.a.g(be8Var.b.a, this.o).c, this.a, 0L).b;
            } else {
                bt6Var = null;
            }
            this.o0 = jt6.M;
        } else {
            bt6Var = null;
        }
        if (booleanValue || !be8Var2.j.equals(be8Var.j)) {
            ht6 a = this.o0.a();
            List list = be8Var.j;
            for (int i12 = i4; i12 < list.size(); i12++) {
                nf7 nf7Var = (nf7) list.get(i12);
                int i13 = i4;
                while (true) {
                    lf7[] lf7VarArr = nf7Var.a;
                    if (i13 < lf7VarArr.length) {
                        lf7VarArr[i13].b(a);
                        i13++;
                    }
                }
            }
            this.o0 = new jt6(a);
        }
        jt6 S0 = S0();
        boolean equals2 = S0.equals(this.Q);
        this.Q = S0;
        if (be8Var2.l != be8Var.l) {
            i6 = 1;
        } else {
            i6 = i4;
        }
        if (be8Var2.e != be8Var.e) {
            i7 = 1;
        } else {
            i7 = i4;
        }
        if (i7 != 0 || i6 != 0) {
            x1();
        }
        if (be8Var2.g != be8Var.g) {
            i8 = 1;
        } else {
            i8 = i4;
        }
        if (!equals) {
            this.m.c(i4, new s51(be8Var, i));
        }
        if (z) {
            ypb ypbVar2 = new ypb();
            if (!be8Var2.a.p()) {
                Object obj5 = be8Var2.b.a;
                be8Var2.a.g(obj5, ypbVar2);
                int i14 = ypbVar2.c;
                int b = be8Var2.a.b(obj5);
                i9 = i6;
                z3 = equals2;
                z4 = booleanValue;
                obj = be8Var2.a.m(i14, this.a, 0L).a;
                bt6Var2 = this.a.b;
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
                bt6Var2 = null;
                obj2 = null;
            }
            rz6 rz6Var3 = be8Var2.b;
            if (i2 == 0) {
                boolean c = rz6Var3.c();
                rz6 rz6Var4 = be8Var2.b;
                if (c) {
                    j4 = ypbVar2.a(rz6Var4.b, rz6Var4.c);
                    Z0 = Z0(be8Var2);
                } else if (rz6Var4.e != -1) {
                    j4 = Z0(this.p0);
                    Z0 = j4;
                } else {
                    j2 = ypbVar2.e;
                    j3 = ypbVar2.d;
                    j4 = j2 + j3;
                    Z0 = j4;
                }
            } else if (rz6Var3.c()) {
                j4 = be8Var2.s;
                Z0 = Z0(be8Var2);
            } else {
                j2 = ypbVar2.e;
                j3 = be8Var2.s;
                j4 = j2 + j3;
                Z0 = j4;
            }
            long i0 = hac.i0(j4);
            long i02 = hac.i0(Z0);
            rz6 rz6Var5 = be8Var2.b;
            qe8 qe8Var = new qe8(obj, i10, bt6Var2, obj2, i11, i0, i02, rz6Var5.b, rz6Var5.c);
            aqb aqbVar2 = this.a;
            int l0 = l0();
            int A = A();
            if (!this.p0.a.p()) {
                be8 be8Var3 = this.p0;
                Object obj6 = be8Var3.b.a;
                be8Var3.a.g(obj6, this.o);
                A = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(l0, aqbVar2, 0L).a;
                bt6Var3 = aqbVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                bt6Var3 = null;
                obj4 = null;
            }
            int i15 = A;
            long i03 = hac.i0(j);
            if (this.p0.b.c()) {
                j5 = hac.i0(Z0(this.p0));
            } else {
                j5 = i03;
            }
            rz6 rz6Var6 = this.p0.b;
            this.m.c(11, new a74(i2, qe8Var, new qe8(obj3, l0, bt6Var3, obj4, i15, i03, j5, rz6Var6.b, rz6Var6.c)));
        } else {
            i9 = i6;
            z3 = equals2;
            z4 = booleanValue;
        }
        if (z4) {
            this.m.c(1, new ji(bt6Var, intValue, (byte) 8));
        }
        if (be8Var2.f != be8Var.f) {
            this.m.c(10, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
            if (be8Var.f != null) {
                this.m.c(10, new x76() {
                    @Override
                    public final void invoke(Object obj8) {
                        byte b2 = r2;
                        be8 be8Var4 = be8Var;
                        pe8 pe8Var = (pe8) obj8;
                        switch (b2) {
                            case 0:
                                pe8Var.e(be8Var4.g);
                                pe8Var.o(be8Var4.g);
                                return;
                            case 1:
                                pe8Var.H(be8Var4.e, be8Var4.l);
                                return;
                            case 2:
                                pe8Var.t(be8Var4.e);
                                return;
                            case 3:
                                pe8Var.p(be8Var4.m, be8Var4.l);
                                return;
                            case 4:
                                pe8Var.c(be8Var4.n);
                                return;
                            case 5:
                                pe8Var.P(be8Var4.m());
                                return;
                            case 6:
                                pe8Var.J(be8Var4.o);
                                return;
                            case 7:
                                pe8Var.E(be8Var4.f);
                                return;
                            case 8:
                                pe8Var.F(be8Var4.f);
                                return;
                            default:
                                pe8Var.z((g0c) be8Var4.i.e);
                                return;
                        }
                    }
                });
            }
        }
        e0c e0cVar = be8Var2.i;
        e0c e0cVar2 = be8Var.i;
        if (e0cVar != e0cVar2) {
            fe3 fe3Var = this.i;
            fe3Var.getClass();
            fe3Var.c = (kp) e0cVar2.f;
            this.m.c(2, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (!z3) {
            this.m.c(14, new yu3(this.Q, (byte) 8));
        }
        if (i8 != 0) {
            this.m.c(3, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i7 != 0 || i9 != 0) {
            this.m.c(-1, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i7 != 0) {
            this.m.c(4, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i9 != 0 || be8Var2.m != be8Var.m) {
            this.m.c(5, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (be8Var2.n != be8Var.n) {
            this.m.c(6, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (be8Var2.m() != be8Var.m()) {
            this.m.c(7, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (!be8Var2.o.equals(be8Var.o)) {
            this.m.c(12, new x76() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    be8 be8Var4 = be8Var;
                    pe8 pe8Var = (pe8) obj8;
                    switch (b2) {
                        case 0:
                            pe8Var.e(be8Var4.g);
                            pe8Var.o(be8Var4.g);
                            return;
                        case 1:
                            pe8Var.H(be8Var4.e, be8Var4.l);
                            return;
                        case 2:
                            pe8Var.t(be8Var4.e);
                            return;
                        case 3:
                            pe8Var.p(be8Var4.m, be8Var4.l);
                            return;
                        case 4:
                            pe8Var.c(be8Var4.n);
                            return;
                        case 5:
                            pe8Var.P(be8Var4.m());
                            return;
                        case 6:
                            pe8Var.J(be8Var4.o);
                            return;
                        case 7:
                            pe8Var.E(be8Var4.f);
                            return;
                        case 8:
                            pe8Var.F(be8Var4.f);
                            return;
                        default:
                            pe8Var.z((g0c) be8Var4.i.e);
                            return;
                    }
                }
            });
        }
        u1();
        this.m.b();
        if (be8Var2.p != be8Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((c74) it.next()).a.x1();
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
        gp5 gp5Var = this.A;
        dmc dmcVar = this.z;
        boolean z = false;
        if (h != 1) {
            if (h != 2 && h != 3) {
                if (h != 4) {
                    rjb.h();
                    return;
                }
            } else {
                y1();
                boolean z2 = this.p0.p;
                if (s() && !z2) {
                    z = true;
                }
                dmcVar.b(z);
                gp5Var.a(s());
                return;
            }
        }
        dmcVar.b(false);
        gp5Var.a(false);
    }

    @Override
    public final void y(pe8 pe8Var) {
        pe8Var.getClass();
        this.m.a(pe8Var);
    }

    @Override
    public final bqb y0() {
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
            String str = hac.a;
            Locale locale = Locale.US;
            String i = b10.i("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f0) {
                if (this.g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                ncd.g("ExoPlayerImpl", i, illegalStateException);
                this.g0 = true;
                return;
            }
            dq9.m(i);
        }
    }

    @Override
    public final long z() {
        bqb y0 = y0();
        if (y0.p()) {
            return -9223372036854775807L;
        }
        return hac.i0(y0.m(l0(), this.a, 0L).l);
    }

    @Override
    public final boolean z0() {
        y1();
        return false;
    }
}
