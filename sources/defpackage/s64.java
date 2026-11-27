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
public final class s64 implements dg8 {
    public final jp5 A;
    public final short B;
    public final lo C;
    public final q90 D;
    public final r64 E;
    public final lh2 F;
    public final lh2 G;
    public int H;
    public boolean I;
    public int J;
    public byte K;
    public boolean L;
    public final fv9 M;
    public az9 N;
    public pka O;
    public zf8 P;
    public nt6 Q;
    public nt6 R;
    public ko4 S;
    public Surface T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final boolean Y;
    public rma Z;
    public final zrb a;
    public oz a0;
    public final d2c b;
    public float b0;
    public final zf8 c;
    public float c0;
    public final or2 d;
    public boolean d0;
    public final Context e;
    public n43 e0;
    public final s64 f;
    public final boolean f0;
    public final vg0[] g;
    public boolean g0;
    public final vg0[] h;
    public final int h0;
    public final ld3 i;
    public boolean i0;
    public final xgb j;
    public final xe3 j0;
    public final j64 k;
    public ggc k0;
    public final c74 l;
    public final short l0;
    public final e86 m;
    public final short m0;
    public final CopyOnWriteArraySet n;
    public final short n0;
    public final xrb o;
    public nt6 o0;
    public final ArrayList p;
    public nf8 p0;
    public final boolean q;
    public int q0;
    public final uz6 r;
    public long r0;
    public final ea3 s;
    public pe2 s0;
    public final Looper t;
    public final ArrayList t0;
    public final la3 u;
    public final vgb v;
    public final n64 w;
    public final o64 x;
    public final vh4 y;
    public final qoc z;

    static {
        gt6.a("media3.exoplayer");
    }

    public s64(f64 f64Var) {
        boolean z;
        byte b;
        s64 s64Var;
        boolean z2;
        s64 obj = new Object();
        obj.a = new zrb();
        obj.t0 = new ArrayList();
        obj.d = new or2();
        try {
            efd.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(obj)) + " [AndroidXMedia3/1.11.1] [" + gcc.a + "]");
            Context context = f64Var.a;
            vgb vgbVar = f64Var.b;
            obj.e = context.getApplicationContext();
            f64Var.h.getClass();
            obj.s = new ea3(vgbVar);
            obj.h0 = f64Var.j;
            obj.a0 = f64Var.k;
            obj.Y = f64Var.l;
            obj.d0 = false;
            obj.B = f64Var.u;
            n64 n64Var = new n64(obj);
            obj.w = n64Var;
            obj.x = new Object();
            vg0[] d = ((oc3) f64Var.c.get()).d(new Handler(f64Var.i), n64Var, n64Var, n64Var, n64Var);
            obj.g = d;
            if (d.length > 0) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            obj.h = new vg0[d.length];
            int i = 0;
            while (true) {
                vg0[] vg0VarArr = obj.h;
                if (i >= vg0VarArr.length) {
                    break;
                }
                byte b2 = obj.g[i].b;
                vg0VarArr[i] = null;
                i++;
            }
            ld3 ld3Var = (ld3) f64Var.e.get();
            obj.i = ld3Var;
            obj.r = (uz6) f64Var.d.get();
            la3 d2 = la3.d(f64Var.g.b);
            obj.u = d2;
            obj.q = f64Var.m;
            obj.N = f64Var.n;
            obj.l0 = f64Var.p;
            obj.m0 = f64Var.q;
            obj.n0 = f64Var.r;
            obj.M = f64Var.o;
            Looper looper = f64Var.i;
            obj.t = looper;
            obj.v = vgbVar;
            obj.f = obj;
            obj.m = new e86(new CopyOnWriteArraySet(), looper, looper.getThread(), vgbVar, new su3(obj, (byte) 16), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            obj.n = copyOnWriteArraySet;
            obj.p = new ArrayList();
            obj.O = new pka();
            vg0[] vg0VarArr2 = obj.g;
            d2c d2cVar = new d2c(new qa9[vg0VarArr2.length], new e74[vg0VarArr2.length], f2c.b, null);
            obj.b = d2cVar;
            obj.o = new xrb();
            yf8 yf8Var = new yf8();
            yf8Var.a.d(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            ld3Var.getClass();
            yf8Var.a(29, true);
            zf8 b3 = yf8Var.b();
            obj.c = b3;
            yf8 yf8Var2 = new yf8();
            n31 n31Var = yf8Var2.a;
            n31Var.c(b3.a);
            n31Var.b(4);
            n31Var.b(10);
            obj.P = yf8Var2.b();
            obj.j = vgbVar.a(looper, null);
            j64 j64Var = new j64(obj, (byte) 0);
            obj.k = j64Var;
            obj.p0 = nf8.k(d2cVar);
            obj.s.W(obj, looper);
            ig8 ig8Var = new ig8(f64Var.B);
            c74 c74Var = new c74(obj.e, obj.g, obj.h, ld3Var, d2cVar, (ec3) f64Var.f.get(), d2, obj.H, obj.I, obj.s, obj.N, f64Var.s, f64Var.t, f64Var.C, looper, vgbVar, j64Var, ig8Var, obj.x, f64Var.D);
            xgb xgbVar = c74Var.h;
            obj.l = c74Var;
            Looper looper2 = c74Var.r;
            obj.b0 = 1.0f;
            obj.H = 0;
            nt6 nt6Var = nt6.M;
            obj.Q = nt6Var;
            obj.R = nt6Var;
            obj.o0 = nt6Var;
            obj.q0 = -1;
            obj.e0 = n43.d;
            obj.f0 = true;
            obj.y(obj.s);
            d2.a(new Handler(looper), obj.s);
            copyOnWriteArraySet.add(obj.w);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                try {
                    Context context2 = obj.e;
                    boolean z3 = f64Var.z;
                    xgb a = vgbVar.a(c74Var.r, null);
                    b = 1;
                    lg lgVar = new lg(context2, z3, (Object) obj, ig8Var, (byte) 17);
                    s64Var = obj;
                    a.e(lgVar);
                } catch (Throwable th) {
                    th = th;
                    obj = obj;
                    obj.d.e();
                    throw th;
                }
            } else {
                b = 1;
                s64Var = obj;
            }
            s64 s64Var2 = s64Var;
            try {
                lo loVar = new lo((Object) 0, looper2, looper, vgbVar, new j64(s64Var, b));
                s64Var2.C = loVar;
                loVar.j(new lw3(s64Var2, (byte) 8));
                Context context3 = f64Var.a;
                Looper looper3 = f64Var.i;
                n64 n64Var2 = s64Var2.w;
                ?? obj2 = new Object();
                obj2.b = context3.getApplicationContext();
                obj2.d = vgbVar.a(looper2, null);
                obj2.c = new qz(obj2, vgbVar.a(looper3, null), n64Var2);
                s64Var2.y = obj2;
                obj2.G();
                if (f64Var.v != Integer.MAX_VALUE && f64Var.w != Integer.MAX_VALUE && f64Var.x != Integer.MAX_VALUE && f64Var.y != Integer.MAX_VALUE) {
                    z2 = b;
                } else {
                    z2 = false;
                }
                qoc qocVar = new qoc(context, looper2, vgbVar);
                s64Var2.z = qocVar;
                if (qocVar.a != z2) {
                    qocVar.a = z2;
                    qocVar.b(z2, qocVar.b);
                }
                s64Var2.A = new jp5(context, looper2, vgbVar);
                s64Var2.j0 = xe3.c;
                s64Var2.k0 = ggc.d;
                s64Var2.Z = rma.c;
                s64Var2.E = i2 >= 34 ? new r64(s64Var2, context) : null;
                s64Var2.F = new lh2((byte) 26);
                s64Var2.G = new lh2((byte) 26);
                obj = s64Var2;
                obj.D = new q90(obj, s64Var2.w, s64Var2.v, f64Var.v, f64Var.w, f64Var.x, f64Var.y);
                xgbVar.c(38, obj.M).b();
                oz ozVar = obj.a0;
                xgbVar.getClass();
                wgb d3 = xgb.d();
                d3.a = xgbVar.a.obtainMessage(31, 0, 0, ozVar);
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
                obj = s64Var2;
                obj.d.e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long Z0(nf8 nf8Var) {
        zrb zrbVar = new zrb();
        xrb xrbVar = new xrb();
        nf8Var.a.g(nf8Var.b.a, xrbVar);
        long j = nf8Var.c;
        if (j == -9223372036854775807L) {
            return nf8Var.a.m(xrbVar.c, zrbVar, 0L).k;
        }
        return xrbVar.e + j;
    }

    public static nf8 c1(nf8 nf8Var, int i) {
        nf8 h = nf8Var.h(i);
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
        nf8 nf8Var = this.p0;
        return nf8Var.a.b(nf8Var.b.a);
    }

    @Override
    public final void A0(int i, ft6 ft6Var) {
        r0(po5.u(ft6Var), i, i + 1);
    }

    @Override
    public final ggc B() {
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
    public final void D0(ft6 ft6Var) {
        N0(po5.u(ft6Var));
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
    public final oz F() {
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
    public final c2c G0() {
        y1();
        return this.i.f;
    }

    @Override
    public final xe3 H() {
        y1();
        return this.j0;
    }

    @Override
    public final long H0() {
        y1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        nf8 nf8Var = this.p0;
        long j = 0;
        if (nf8Var.k.d != nf8Var.b.d) {
            return gcc.i0(nf8Var.a.m(l0(), this.a, 0L).l);
        }
        long j2 = nf8Var.q;
        if (this.p0.k.c()) {
            nf8 nf8Var2 = this.p0;
            nf8Var2.a.g(nf8Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j = j2;
        }
        nf8 nf8Var3 = this.p0;
        asb asbVar = nf8Var3.a;
        Object obj = nf8Var3.k.a;
        xrb xrbVar = this.o;
        asbVar.g(obj, xrbVar);
        return gcc.i0(j + xrbVar.e);
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
                asb y0 = y0();
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
    public final void M(c2c c2cVar) {
        y1();
        ld3 ld3Var = this.i;
        ld3Var.getClass();
        c2c G0 = G0();
        if (!c2cVar.equals(ld3Var.f)) {
            ld3Var.m(c2cVar);
        }
        if (!G0.equals(c2cVar)) {
            this.m.e(19, new lu3(c2cVar, (byte) 9));
        }
    }

    @Override
    public final nt6 M0() {
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
        yve.f(z);
        int size = this.p.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            nf8 h1 = h1(this.p0, i, min);
            w1(h1, 0, !h1.b.a.equals(this.p0.b.a), 4, W0(h1), -1, false);
        }
    }

    @Override
    public final boolean P0() {
        asb y0 = y0();
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
        yve.f(z);
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
        float h = gcc.h(f, 0.0f, 1.0f);
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
        this.m.e(22, new i64(h, (byte) 0));
    }

    public final nf8 R0(nf8 nf8Var, int i, List list) {
        asb asbVar = nf8Var.a;
        this.J++;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = list.size();
            ArrayList arrayList2 = this.p;
            if (i2 < size) {
                h07 h07Var = new h07((rg0) list.get(i2), this.q);
                arrayList.add(h07Var);
                arrayList2.add(i2 + i, new p64(h07Var.b, h07Var.a));
                i2++;
            } else {
                this.O = this.O.b(i, arrayList.size());
                rg8 rg8Var = new rg8(arrayList2, this.O);
                nf8 d1 = d1(nf8Var, rg8Var, Y0(asbVar, rg8Var, X0(nf8Var), V0(nf8Var)));
                pka pkaVar = this.O;
                xgb xgbVar = this.l.h;
                x64 x64Var = new x64(arrayList, pkaVar, -1, -9223372036854775807L);
                xgbVar.getClass();
                wgb d = xgb.d();
                d.a = xgbVar.a.obtainMessage(18, i, 0, x64Var);
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

    public final nt6 S0() {
        boolean z;
        asb y0 = y0();
        if (y0.p()) {
            return this.o0;
        }
        ft6 ft6Var = y0.m(l0(), this.a, 0L).b;
        lt6 a = this.o0.a();
        nt6 nt6Var = ft6Var.d;
        if (nt6Var != null) {
            po5 po5Var = nt6Var.L;
            byte[] bArr = nt6Var.k;
            CharSequence charSequence = nt6Var.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = nt6Var.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = nt6Var.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = nt6Var.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = nt6Var.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = nt6Var.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = nt6Var.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = nt6Var.h;
            if (l != null) {
                if (l.longValue() >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                yve.f(z);
                a.h = l;
            }
            s29 s29Var = nt6Var.i;
            if (s29Var != null) {
                a.i = s29Var;
            }
            s29 s29Var2 = nt6Var.j;
            if (s29Var2 != null) {
                a.j = s29Var2;
            }
            Uri uri = nt6Var.n;
            if (uri != null || bArr != null) {
                a.n = uri;
                a.b(bArr, nt6Var.m);
                a.l = nt6Var.l;
            }
            Integer num = nt6Var.o;
            if (num != null) {
                a.o = num;
            }
            Integer num2 = nt6Var.p;
            if (num2 != null) {
                a.p = num2;
            }
            Integer num3 = nt6Var.q;
            if (num3 != null) {
                a.q = num3;
            }
            Boolean bool = nt6Var.r;
            if (bool != null) {
                a.r = bool;
            }
            Boolean bool2 = nt6Var.s;
            if (bool2 != null) {
                a.s = bool2;
            }
            Integer num4 = nt6Var.t;
            if (num4 != null) {
                a.t = num4;
            }
            Integer num5 = nt6Var.u;
            if (num5 != null) {
                a.t = num5;
            }
            Integer num6 = nt6Var.v;
            if (num6 != null) {
                a.u = num6;
            }
            Integer num7 = nt6Var.w;
            if (num7 != null) {
                a.v = num7;
            }
            Integer num8 = nt6Var.x;
            if (num8 != null) {
                a.w = num8;
            }
            Integer num9 = nt6Var.y;
            if (num9 != null) {
                a.x = num9;
            }
            Integer num10 = nt6Var.z;
            if (num10 != null) {
                a.y = num10;
            }
            CharSequence charSequence8 = nt6Var.A;
            if (charSequence8 != null) {
                a.z = charSequence8;
            }
            CharSequence charSequence9 = nt6Var.B;
            if (charSequence9 != null) {
                a.A = charSequence9;
            }
            CharSequence charSequence10 = nt6Var.C;
            if (charSequence10 != null) {
                a.B = charSequence10;
            }
            CharSequence charSequence11 = nt6Var.D;
            if (charSequence11 != null) {
                a.C = charSequence11;
            }
            Integer num11 = nt6Var.E;
            if (num11 != null) {
                a.D = num11;
            }
            Integer num12 = nt6Var.F;
            if (num12 != null) {
                a.E = num12;
            }
            CharSequence charSequence12 = nt6Var.G;
            if (charSequence12 != null) {
                a.F = charSequence12;
            }
            CharSequence charSequence13 = nt6Var.H;
            if (charSequence13 != null) {
                a.G = charSequence13;
            }
            CharSequence charSequence14 = nt6Var.I;
            if (charSequence14 != null) {
                a.H = charSequence14;
            }
            Integer num13 = nt6Var.J;
            if (num13 != null) {
                a.I = num13;
            }
            Bundle bundle = nt6Var.K;
            if (bundle != null) {
                a.J = bundle;
            }
            if (!po5Var.isEmpty()) {
                a.K = po5.q(po5Var);
            }
        }
        return new nt6(a);
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
            arrayList.add(this.r.d((ft6) list.get(i)));
        }
        return arrayList;
    }

    @Override
    public final e64 U() {
        y1();
        return this.p0.f;
    }

    public final mg8 U0(lg8 lg8Var) {
        int X0 = X0(this.p0);
        asb asbVar = this.p0.a;
        if (X0 == -1) {
            X0 = 0;
        }
        c74 c74Var = this.l;
        return new mg8(c74Var, lg8Var, asbVar, X0, c74Var.r);
    }

    @Override
    public final void V(boolean z) {
        y1();
        v1(1, z);
    }

    public final long V0(nf8 nf8Var) {
        vz6 vz6Var = nf8Var.b;
        long j = nf8Var.c;
        asb asbVar = nf8Var.a;
        if (vz6Var.c()) {
            Object obj = nf8Var.b.a;
            xrb xrbVar = this.o;
            asbVar.g(obj, xrbVar);
            if (j == -9223372036854775807L) {
                return gcc.i0(asbVar.m(X0(nf8Var), this.a, 0L).k);
            }
            return gcc.i0(j) + gcc.i0(xrbVar.e);
        }
        return gcc.i0(W0(nf8Var));
    }

    @Override
    public final void W(int i) {
        j1(i, -9223372036854775807L, false);
    }

    public final long W0(nf8 nf8Var) {
        long j;
        if (nf8Var.a.p()) {
            return gcc.T(this.r0);
        }
        if (nf8Var.p) {
            j = nf8Var.l();
        } else {
            j = nf8Var.s;
        }
        if (nf8Var.b.c()) {
            return j;
        }
        asb asbVar = nf8Var.a;
        Object obj = nf8Var.b.a;
        xrb xrbVar = this.o;
        asbVar.g(obj, xrbVar);
        return j + xrbVar.e;
    }

    @Override
    public final long X() {
        y1();
        return this.m0;
    }

    public final int X0(nf8 nf8Var) {
        if (nf8Var.a.p()) {
            return this.q0;
        }
        return nf8Var.a.g(nf8Var.b.a, this.o).c;
    }

    @Override
    public final long Y() {
        y1();
        return V0(this.p0);
    }

    public final Pair Y0(asb asbVar, rg8 rg8Var, int i, long j) {
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (!asbVar.p() && !rg8Var.p()) {
            Pair i3 = asbVar.i(this.a, this.o, i, gcc.T(j));
            Object obj = i3.first;
            if (rg8Var.b(obj) != -1) {
                return i3;
            }
            int T = c74.T(this.a, this.o, this.H, this.I, obj, asbVar, rg8Var);
            if (T != -1) {
                zrb zrbVar = this.a;
                rg8Var.m(T, zrbVar, 0L);
                return e1(rg8Var, T, gcc.i0(zrbVar.k));
            }
            return e1(rg8Var, -1, -9223372036854775807L);
        }
        if (asbVar.p() || !rg8Var.p()) {
            i2 = i;
            j2 = j;
        }
        return e1(rg8Var, i2, j2);
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
        nf8 nf8Var = this.p0;
        if (nf8Var.e != 1) {
            return;
        }
        nf8 f = nf8Var.f(null);
        if (f.a.p()) {
            i = 4;
        } else {
            i = 2;
        }
        nf8 c1 = c1(f, i);
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
        asb y0 = y0();
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
    public final void b() {
        V(false);
    }

    @Override
    public final long b0() {
        y1();
        if (m()) {
            nf8 nf8Var = this.p0;
            if (nf8Var.k.equals(nf8Var.b)) {
                return gcc.i0(this.p0.q);
            }
            return getDuration();
        }
        return H0();
    }

    public final boolean b1() {
        int k;
        asb y0 = y0();
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
    public final void c(of8 of8Var) {
        y1();
        if (this.p0.o.equals(of8Var)) {
            return;
        }
        nf8 g = this.p0.g(of8Var);
        this.J++;
        this.l.h.c(4, of8Var).b();
        w1(g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final boolean c0() {
        asb y0 = y0();
        if (!y0.p() && y0.m(l0(), this.a, 0L).g) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(float f) {
        c(new of8(f, f().b));
    }

    @Override
    public final void d0() {
        int e;
        asb y0 = y0();
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

    public final nf8 d1(nf8 nf8Var, asb asbVar, Pair pair) {
        boolean z;
        vz6 vz6Var;
        u1c u1cVar;
        d2c d2cVar;
        List list;
        int i;
        long j;
        if (!asbVar.p() && pair == null) {
            z = false;
        } else {
            z = true;
        }
        yve.f(z);
        asb asbVar2 = nf8Var.a;
        long V0 = V0(nf8Var);
        nf8 j2 = nf8Var.j(asbVar);
        if (asbVar.p()) {
            vz6 vz6Var2 = nf8.u;
            long T = gcc.T(this.r0);
            u1c u1cVar2 = u1c.d;
            d2c d2cVar2 = this.b;
            no5 no5Var = po5.b;
            nf8 c = j2.d(vz6Var2, T, T, T, 0L, u1cVar2, d2cVar2, j99.e).c(vz6Var2);
            c.q = c.s;
            return c;
        }
        Object obj = j2.b.a;
        String str = gcc.a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            vz6Var = new vz6(pair.first);
        } else {
            vz6Var = j2.b;
        }
        long longValue = ((Long) pair.second).longValue();
        long T2 = gcc.T(V0);
        if (!asbVar2.p()) {
            T2 -= asbVar2.g(obj, this.o).e;
            if (equals && T2 - longValue == 1 && T2 == asbVar2.g(obj, this.o).d) {
                T2--;
            }
        }
        if (equals && longValue >= T2) {
            if (i == 0) {
                int b = asbVar.b(j2.k.a);
                if (b != -1 && asbVar.f(b, this.o, false).c == asbVar.g(vz6Var.a, this.o).c) {
                    return j2;
                }
                asbVar.g(vz6Var.a, this.o);
                boolean c2 = vz6Var.c();
                xrb xrbVar = this.o;
                if (c2) {
                    j = xrbVar.a(vz6Var.b, vz6Var.c);
                } else {
                    j = xrbVar.d;
                }
                vz6 vz6Var3 = vz6Var;
                nf8 c3 = j2.d(vz6Var3, j2.s, j2.s, j2.d, j - j2.s, j2.h, j2.i, j2.j).c(vz6Var3);
                c3.q = j;
                return c3;
            }
            vz6 vz6Var4 = vz6Var;
            yve.p(!vz6Var4.c());
            long max = Math.max(0L, j2.r - (longValue - T2));
            long j3 = j2.q;
            if (j2.k.equals(j2.b)) {
                j3 = longValue + max;
            }
            nf8 d = j2.d(vz6Var4, longValue, longValue, longValue, max, j2.h, j2.i, j2.j);
            d.q = j3;
            return d;
        }
        vz6 vz6Var5 = vz6Var;
        yve.p(!vz6Var5.c());
        if (!equals) {
            u1cVar = u1c.d;
            d2cVar = this.b;
            no5 no5Var2 = po5.b;
            list = j99.e;
        } else {
            u1cVar = j2.h;
            d2cVar = j2.i;
            list = j2.j;
        }
        nf8 c4 = j2.d(vz6Var5, longValue, longValue, longValue, 0L, u1cVar, d2cVar, list).c(vz6Var5);
        c4.q = longValue;
        return c4;
    }

    @Override
    public final boolean e() {
        y1();
        return this.p0.g;
    }

    @Override
    public final void e0(int i) {
        y1();
    }

    public final Pair e1(asb asbVar, int i, long j) {
        if (asbVar.p()) {
            this.q0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.r0 = j;
            return null;
        }
        if (i == -1 || i >= asbVar.o()) {
            i = asbVar.a(this.I);
            j = gcc.i0(asbVar.m(i, this.a, 0L).k);
        }
        return asbVar.i(this.a, this.o, i, gcc.T(j));
    }

    @Override
    public final of8 f() {
        y1();
        return this.p0.o;
    }

    @Override
    public final f2c f0() {
        y1();
        return (f2c) this.p0.i.e;
    }

    public final void f1(int i, int i2) {
        rma rmaVar = this.Z;
        if (i == rmaVar.a && i2 == rmaVar.b) {
            return;
        }
        this.Z = new rma(i, i2);
        pe2 pe2Var = this.s0;
        if (pe2Var != null) {
            pe2Var.execute(new bt(this, i, i2, (byte) 7));
            return;
        }
        this.m.e(24, new ml0(i, i2, (byte) 1));
        m1(2, 14, new rma(i, i2));
    }

    @Override
    public final void g(long j) {
        k1(j);
    }

    @Override
    public final nt6 g0() {
        y1();
        return this.R;
    }

    public final void g1() {
        boolean z;
        boolean z2;
        efd.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.1] [" + gcc.a + "] [" + gt6.b() + "]");
        y1();
        this.y.G();
        this.z.c(false);
        this.A.a(false);
        r64 r64Var = this.E;
        if (r64Var != null && Build.VERSION.SDK_INT >= 34) {
            r64Var.a();
        }
        q90 q90Var = this.D;
        ((xgb) q90Var.f).f();
        ((s64) q90Var.a).p0((c30) q90Var.b);
        c74 c74Var = this.l;
        if (!c74Var.a0 && c74Var.r.getThread().isAlive()) {
            c74Var.a0 = true;
            or2 or2Var = new or2(c74Var.F);
            c74Var.h.c(7, or2Var).b();
            z = or2Var.c(c74Var.K);
        } else {
            z = true;
        }
        if (!z) {
            this.m.e(10, new su3((byte) 15));
        }
        this.m.d();
        this.j.f();
        la3 la3Var = this.u;
        ea3 ea3Var = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) la3Var.c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            je0 je0Var = (je0) it.next();
            if (je0Var.b == ea3Var) {
                je0Var.c = true;
                copyOnWriteArrayList.remove(je0Var);
            }
        }
        nf8 nf8Var = this.p0;
        if (nf8Var.p) {
            nf8Var = nf8Var.a();
            this.p0 = nf8Var;
        }
        nf8 c1 = c1(nf8Var, 1);
        this.p0 = c1;
        nf8 c = c1.c(c1.b);
        this.p0 = c;
        c.q = c.s;
        this.p0.r = 0L;
        ea3 ea3Var2 = this.s;
        xgb xgbVar = ea3Var2.n;
        xgbVar.getClass();
        xgbVar.e(new vd2(ea3Var2, (byte) 24));
        i1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = n43.d;
        this.i0 = true;
        if (!this.p0.a.p()) {
            nf8 nf8Var2 = this.p0;
            if (nf8Var2.a.b(nf8Var2.b.a) != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Locale locale = Locale.US;
            nf8 nf8Var3 = this.p0;
            yve.o(String.format(locale, "periodUid %s not found in timeline %s with size %d", nf8Var3.b.a, nf8Var3.a.getClass().getName(), Integer.valueOf(this.p0.a.o())), z2);
        }
    }

    @Override
    public final long getDuration() {
        y1();
        if (m()) {
            nf8 nf8Var = this.p0;
            vz6 vz6Var = nf8Var.b;
            asb asbVar = nf8Var.a;
            Object obj = vz6Var.a;
            xrb xrbVar = this.o;
            asbVar.g(obj, xrbVar);
            return gcc.i0(xrbVar.a(vz6Var.b, vz6Var.c));
        }
        return z();
    }

    @Override
    public final int h() {
        y1();
        return this.p0.e;
    }

    @Override
    public final n43 h0() {
        y1();
        return this.e0;
    }

    public final nf8 h1(nf8 nf8Var, int i, int i2) {
        ArrayList arrayList;
        int X0 = X0(nf8Var);
        long V0 = V0(nf8Var);
        asb asbVar = nf8Var.a;
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
        pka pkaVar = this.O;
        int i4 = i2 - i;
        int[] iArr = pkaVar.b;
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
        this.O = new pka(iArr2, new Random(pkaVar.a.nextLong()));
        rg8 rg8Var = new rg8(arrayList, this.O);
        nf8 d1 = d1(nf8Var, rg8Var, Y0(asbVar, rg8Var, X0, V0));
        int i9 = d1.e;
        if (i9 != 1 && i9 != 4 && X0 >= i && X0 < i2) {
            if (c74.T(this.a, this.o, this.H, this.I, nf8Var.b.a, asbVar, rg8Var) == -1) {
                d1 = c1(d1, 4);
            }
        }
        pka pkaVar2 = this.O;
        xgb xgbVar = this.l.h;
        xgbVar.getClass();
        wgb d = xgb.d();
        d.a = xgbVar.a.obtainMessage(20, i, i2, pkaVar2);
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
    public final void i0(oz ozVar, boolean z) {
        y1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, ozVar);
        e86 e86Var = this.m;
        if (!equals) {
            this.a0 = ozVar;
            m1(1, 3, ozVar);
            e86Var.c(20, new lu3(ozVar, (byte) 8));
        }
        oz ozVar2 = this.a0;
        xgb xgbVar = this.l.h;
        xgbVar.getClass();
        wgb d = xgb.d();
        d.a = xgbVar.a.obtainMessage(31, z ? 1 : 0, 0, ozVar2);
        d.b();
        e86Var.b();
    }

    public final void i1() {
        TextureView textureView = this.X;
        n64 n64Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != n64Var) {
                efd.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(n64Var);
            this.V = null;
        }
    }

    @Override
    public final void j() {
        V(true);
    }

    @Override
    public final void j0(nt6 nt6Var) {
        y1();
        nt6Var.getClass();
        if (nt6Var.equals(this.R)) {
            return;
        }
        this.R = nt6Var;
        this.m.e(15, new j64(this, (byte) 3));
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
            yve.f(z2);
            asb asbVar = this.p0.a;
            if (!asbVar.p() && i >= asbVar.o()) {
                return;
            }
            ea3 ea3Var = this.s;
            if (!ea3Var.r) {
                uj Q = ea3Var.Q();
                ea3Var.r = true;
                ea3Var.V(Q, -1, new ht2(Q, (byte) 16));
            }
            this.J++;
            if (m()) {
                efd.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                z64 z64Var = new z64(this.p0);
                z64Var.a(1);
                s64 s64Var = this.k.b;
                s64Var.j.e(new vx3(s64Var, z64Var, (byte) 9));
                return;
            }
            nf8 nf8Var = this.p0;
            int i2 = nf8Var.e;
            if (i2 == 3 || (i2 == 4 && !asbVar.p())) {
                nf8Var = this.p0.h(2);
            }
            int l0 = l0();
            nf8 d1 = d1(nf8Var, asbVar, e1(asbVar, i, j));
            this.l.h.c(3, new b74(asbVar, i, gcc.T(j))).b();
            w1(d1, 0, true, 1, W0(d1), l0, z);
        }
    }

    @Override
    public final long k() {
        y1();
        return gcc.i0(W0(this.p0));
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
        asb y0 = y0();
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
        vg0[] vg0VarArr;
        vg0[] vg0VarArr2;
        for (vg0 vg0Var : this.g) {
            if (i == -1 || vg0Var.b == i) {
                mg8 U0 = U0(vg0Var);
                yve.p(!U0.f);
                U0.c = i2;
                yve.p(!U0.f);
                U0.d = obj;
                U0.b();
            }
        }
        for (vg0 vg0Var2 : this.h) {
            if (vg0Var2 != null && (i == -1 || vg0Var2.b == i)) {
                mg8 U02 = U0(vg0Var2);
                yve.p(!U02.f);
                U02.c = i2;
                yve.p(!U02.f);
                U02.d = obj;
                U02.b();
            }
        }
    }

    @Override
    public final long n() {
        asb y0 = y0();
        if (y0.p()) {
            return -9223372036854775807L;
        }
        int l0 = l0();
        zrb zrbVar = this.a;
        if (y0.m(l0, zrbVar, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (gcc.E(zrbVar.f) - zrbVar.e) - Y();
    }

    @Override
    public final void n0(int i) {
        y1();
        if (this.H != i) {
            this.H = i;
            this.l.h.b(11, i, 0).b();
            yd ydVar = new yd(i, (byte) 3);
            e86 e86Var = this.m;
            e86Var.c(8, ydVar);
            u1();
            e86Var.b();
        }
    }

    public final void n1(rg0 rg0Var, boolean z) {
        y1();
        List singletonList = Collections.singletonList(rg0Var);
        y1();
        o1(-1, -9223372036854775807L, singletonList, z);
    }

    @Override
    public final long o() {
        y1();
        return gcc.i0(this.p0.r);
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
            h07 h07Var = new h07((rg0) list.get(i3), this.q);
            arrayList2.add(h07Var);
            arrayList.add(i3, new p64(h07Var.b, h07Var.a));
        }
        this.O = this.O.a().b(0, arrayList2.size());
        rg8 rg8Var = new rg8(arrayList, this.O);
        boolean p = rg8Var.p();
        int i4 = rg8Var.g;
        if (!p && i >= i4) {
            throw new IllegalStateException();
        }
        if (z) {
            j2 = -9223372036854775807L;
            i2 = rg8Var.a(this.I);
        } else if (i == -1) {
            i2 = X0;
            j2 = k;
        } else {
            i2 = i;
            j2 = j;
        }
        nf8 d1 = d1(this.p0, rg8Var, e1(rg8Var, i2, j2));
        int i5 = d1.e;
        if (i5 == 1) {
            i5 = 1;
        } else {
            if (!rg8Var.p()) {
                if (i2 != -1) {
                    if (i2 < i4) {
                        i5 = 2;
                    }
                }
            }
            i5 = 4;
        }
        nf8 c1 = c1(d1, i5);
        this.l.h.c(17, new x64(arrayList2, this.O, i2, gcc.T(j2))).b();
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
    public final void p0(bg8 bg8Var) {
        boolean z;
        y1();
        bg8Var.getClass();
        e86 e86Var = this.m;
        if (e86Var.i) {
            if (Thread.currentThread() == e86Var.a) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = e86Var.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            d86 d86Var = (d86) it.next();
            if (d86Var.a.equals(bg8Var)) {
                c86 c86Var = e86Var.c;
                d86Var.d = true;
                if (c86Var != null && d86Var.c) {
                    d86Var.c = false;
                    c86Var.a(d86Var.a, d86Var.b.f());
                }
                copyOnWriteArraySet.remove(d86Var);
            }
        }
    }

    public final void p1(az9 az9Var) {
        y1();
        if (az9Var == null) {
            az9Var = az9.f;
        }
        if (!this.N.equals(az9Var)) {
            this.N = az9Var;
            this.l.h.c(5, az9Var).b();
        }
    }

    @Override
    public final zf8 q() {
        y1();
        return this.P;
    }

    @Override
    public final void q0(ft6 ft6Var) {
        N0(po5.u(ft6Var));
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
        c74 c74Var = this.l;
        if (!c74Var.a0 && c74Var.r.getThread().isAlive()) {
            or2 or2Var = new or2(c74Var.F);
            c74Var.h.c(30, new Pair(surface, or2Var)).b();
            if (j != -9223372036854775807L) {
                z2 = or2Var.c(j);
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
            t1(new e64(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final void r(ft6 ft6Var, long j) {
        T(po5.u(ft6Var), 0, j);
    }

    @Override
    public final void r0(List list, int i, int i2) {
        boolean z;
        lsb lsbVar;
        y1();
        boolean z2 = true;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int min = Math.min(i2, size);
        if (min - i == list.size()) {
            for (int i3 = i; i3 < min; i3++) {
                if (((p64) arrayList.get(i3)).b.k.a((ft6) list.get(i3 - i))) {
                }
            }
            this.J++;
            xgb xgbVar = this.l.h;
            xgbVar.getClass();
            wgb d = xgb.d();
            d.a = xgbVar.a.obtainMessage(27, i, min, list);
            d.b();
            for (int i4 = i; i4 < min; i4++) {
                p64 p64Var = (p64) arrayList.get(i4);
                asb asbVar = p64Var.c;
                ft6 ft6Var = (ft6) list.get(i4 - i);
                if (asbVar instanceof lsb) {
                    lsbVar = new lsb(((lsb) asbVar).e, ft6Var);
                } else {
                    lsbVar = new lsb(asbVar, ft6Var);
                }
                p64Var.c = lsbVar;
            }
            w1(this.p0.j(new rg8(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
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
        nf8 h1 = h1(R0(this.p0, min, T0), i, min);
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
            efd.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
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
        no5 no5Var = po5.b;
        this.e0 = new n43(this.p0.s, j99.e);
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
        yve.f(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            asb y0 = y0();
            this.J++;
            gcc.S(i, min, min2, arrayList);
            pka pkaVar = this.O;
            pkaVar.getClass();
            this.O = pkaVar;
            rg8 rg8Var = new rg8(arrayList, this.O);
            nf8 nf8Var = this.p0;
            nf8 d1 = d1(nf8Var, rg8Var, Y0(y0, rg8Var, X0(nf8Var), V0(this.p0)));
            pka pkaVar2 = this.O;
            c74 c74Var = this.l;
            c74Var.getClass();
            c74Var.h.c(19, new y64(i, min, min2, pkaVar2)).b();
            w1(d1, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(e64 e64Var) {
        nf8 nf8Var = this.p0;
        nf8 c = nf8Var.c(nf8Var.b);
        c.q = c.s;
        c.r = 0L;
        nf8 c1 = c1(c, 1);
        if (e64Var != null) {
            c1 = c1.f(e64Var);
        }
        this.J++;
        this.l.h.a(6).b();
        w1(c1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final ft6 u() {
        asb y0 = y0();
        if (y0.p()) {
            return null;
        }
        return y0.m(l0(), this.a, 0L).b;
    }

    @Override
    public final boolean u0() {
        asb y0 = y0();
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
        zf8 zf8Var = this.P;
        String str = gcc.a;
        s64 s64Var = this.f;
        boolean m = s64Var.m();
        boolean c0 = s64Var.c0();
        boolean b1 = s64Var.b1();
        boolean a1 = s64Var.a1();
        boolean P0 = s64Var.P0();
        boolean u0 = s64Var.u0();
        boolean p = s64Var.y0().p();
        yf8 yf8Var = new yf8();
        yf8Var.a.c(this.c.a);
        boolean z7 = !m;
        yf8Var.a(4, z7);
        boolean z8 = false;
        if (c0 && !m) {
            z = true;
        } else {
            z = false;
        }
        yf8Var.a(5, z);
        if (b1 && !m) {
            z2 = true;
        } else {
            z2 = false;
        }
        yf8Var.a(6, z2);
        if (!p && ((b1 || !P0 || c0) && !m)) {
            z3 = true;
        } else {
            z3 = false;
        }
        yf8Var.a(7, z3);
        if (a1 && !m) {
            z4 = true;
        } else {
            z4 = false;
        }
        yf8Var.a(8, z4);
        if (!p && ((a1 || (P0 && u0)) && !m)) {
            z5 = true;
        } else {
            z5 = false;
        }
        yf8Var.a(9, z5);
        yf8Var.a(10, z7);
        if (c0 && !m) {
            z6 = true;
        } else {
            z6 = false;
        }
        yf8Var.a(11, z6);
        if (c0 && !m) {
            z8 = true;
        }
        yf8Var.a(12, z8);
        zf8 b = yf8Var.b();
        this.P = b;
        if (!b.equals(zf8Var)) {
            this.m.c(13, new j64(this, (byte) 2));
        }
    }

    @Override
    public final void v(boolean z) {
        y1();
        if (this.I != z) {
            this.I = z;
            this.l.h.b(12, z ? 1 : 0, 0).b();
            k64 k64Var = new k64((byte) 0, z);
            e86 e86Var = this.m;
            e86Var.c(9, k64Var);
            u1();
            e86Var.b();
        }
    }

    @Override
    public final int v0() {
        y1();
        return this.p0.n;
    }

    public final void v1(int i, boolean z) {
        int i2;
        nf8 nf8Var = this.p0;
        int i3 = nf8Var.n;
        if (i3 == 1 && !z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (nf8Var.l == z && i3 == i2 && nf8Var.m == i) {
            return;
        }
        this.J++;
        if (nf8Var.p) {
            nf8Var = nf8Var.a();
        }
        nf8 e = nf8Var.e(i, i2, z);
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
        String str = gcc.a;
        long d = qse.d(b0, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j = d / duration;
        } else {
            j = b0 / (duration / 100);
        }
        return gcc.i(ype.d(j), 0, 100);
    }

    @Override
    public final void w0(List list) {
        Z(Integer.MAX_VALUE, list);
    }

    public final void w1(final nf8 nf8Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        Pair pair;
        int i5;
        ft6 ft6Var;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        int i10;
        int i11;
        Object obj;
        ft6 ft6Var2;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long Z0;
        Object obj3;
        ft6 ft6Var3;
        Object obj4;
        long j5;
        boolean z5;
        nf8 nf8Var2 = this.p0;
        this.p0 = nf8Var;
        if (!nf8Var.a.p()) {
            if (nf8Var.a.b(nf8Var.b.a) != -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            yve.o(String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", nf8Var.b.a, nf8Var.a.getClass().getName(), Integer.valueOf(nf8Var.a.o())), z5);
        }
        boolean equals = nf8Var2.a.equals(nf8Var.a);
        zrb zrbVar = this.a;
        xrb xrbVar = this.o;
        asb asbVar = nf8Var2.a;
        vz6 vz6Var = nf8Var2.b;
        asb asbVar2 = nf8Var.a;
        vz6 vz6Var2 = nf8Var.b;
        if (asbVar2.p() && asbVar.p()) {
            pair = new Pair(Boolean.FALSE, -1);
            i4 = 0;
        } else {
            i4 = 0;
            if (asbVar2.p() != asbVar.p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (!asbVar.m(asbVar.g(vz6Var.a, xrbVar).c, zrbVar, 0L).a.equals(asbVar2.m(asbVar2.g(vz6Var2.a, xrbVar).c, zrbVar, 0L).a)) {
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
                    grb.g();
                    return;
                }
            } else if (z && i2 == 0 && vz6Var.d < vz6Var2.d) {
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
            if (!nf8Var.a.p()) {
                ft6Var = nf8Var.a.m(nf8Var.a.g(nf8Var.b.a, this.o).c, this.a, 0L).b;
            } else {
                ft6Var = null;
            }
            this.o0 = nt6.M;
        } else {
            ft6Var = null;
        }
        if (booleanValue || !nf8Var2.j.equals(nf8Var.j)) {
            lt6 a = this.o0.a();
            List list = nf8Var.j;
            for (int i12 = i4; i12 < list.size(); i12++) {
                vf7 vf7Var = (vf7) list.get(i12);
                int i13 = i4;
                while (true) {
                    tf7[] tf7VarArr = vf7Var.a;
                    if (i13 < tf7VarArr.length) {
                        tf7VarArr[i13].b(a);
                        i13++;
                    }
                }
            }
            this.o0 = new nt6(a);
        }
        nt6 S0 = S0();
        boolean equals2 = S0.equals(this.Q);
        this.Q = S0;
        if (nf8Var2.l != nf8Var.l) {
            i6 = 1;
        } else {
            i6 = i4;
        }
        if (nf8Var2.e != nf8Var.e) {
            i7 = 1;
        } else {
            i7 = i4;
        }
        if (i7 != 0 || i6 != 0) {
            x1();
        }
        if (nf8Var2.g != nf8Var.g) {
            i8 = 1;
        } else {
            i8 = i4;
        }
        if (!equals) {
            this.m.c(i4, new t41(nf8Var, i));
        }
        if (z) {
            xrb xrbVar2 = new xrb();
            if (!nf8Var2.a.p()) {
                Object obj5 = nf8Var2.b.a;
                nf8Var2.a.g(obj5, xrbVar2);
                int i14 = xrbVar2.c;
                int b = nf8Var2.a.b(obj5);
                i9 = i6;
                z3 = equals2;
                z4 = booleanValue;
                obj = nf8Var2.a.m(i14, this.a, 0L).a;
                ft6Var2 = this.a.b;
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
                ft6Var2 = null;
                obj2 = null;
            }
            vz6 vz6Var3 = nf8Var2.b;
            if (i2 == 0) {
                boolean c = vz6Var3.c();
                vz6 vz6Var4 = nf8Var2.b;
                if (c) {
                    j4 = xrbVar2.a(vz6Var4.b, vz6Var4.c);
                    Z0 = Z0(nf8Var2);
                } else if (vz6Var4.e != -1) {
                    j4 = Z0(this.p0);
                    Z0 = j4;
                } else {
                    j2 = xrbVar2.e;
                    j3 = xrbVar2.d;
                    j4 = j2 + j3;
                    Z0 = j4;
                }
            } else if (vz6Var3.c()) {
                j4 = nf8Var2.s;
                Z0 = Z0(nf8Var2);
            } else {
                j2 = xrbVar2.e;
                j3 = nf8Var2.s;
                j4 = j2 + j3;
                Z0 = j4;
            }
            long i0 = gcc.i0(j4);
            long i02 = gcc.i0(Z0);
            vz6 vz6Var5 = nf8Var2.b;
            cg8 cg8Var = new cg8(obj, i10, ft6Var2, obj2, i11, i0, i02, vz6Var5.b, vz6Var5.c);
            zrb zrbVar2 = this.a;
            int l0 = l0();
            int A = A();
            if (!this.p0.a.p()) {
                nf8 nf8Var3 = this.p0;
                Object obj6 = nf8Var3.b.a;
                nf8Var3.a.g(obj6, this.o);
                A = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(l0, zrbVar2, 0L).a;
                ft6Var3 = zrbVar2.b;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                ft6Var3 = null;
                obj4 = null;
            }
            int i15 = A;
            long i03 = gcc.i0(j);
            if (this.p0.b.c()) {
                j5 = gcc.i0(Z0(this.p0));
            } else {
                j5 = i03;
            }
            vz6 vz6Var6 = this.p0.b;
            this.m.c(11, new l64(i2, cg8Var, new cg8(obj3, l0, ft6Var3, obj4, i15, i03, j5, vz6Var6.b, vz6Var6.c)));
        } else {
            i9 = i6;
            z3 = equals2;
            z4 = booleanValue;
        }
        if (z4) {
            this.m.c(1, new wg(ft6Var, intValue, (byte) 8));
        }
        if (nf8Var2.f != nf8Var.f) {
            this.m.c(10, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
            if (nf8Var.f != null) {
                this.m.c(10, new b86() {
                    @Override
                    public final void invoke(Object obj8) {
                        byte b2 = r2;
                        nf8 nf8Var4 = nf8Var;
                        bg8 bg8Var = (bg8) obj8;
                        switch (b2) {
                            case 0:
                                bg8Var.e(nf8Var4.g);
                                bg8Var.o(nf8Var4.g);
                                return;
                            case 1:
                                bg8Var.H(nf8Var4.e, nf8Var4.l);
                                return;
                            case 2:
                                bg8Var.t(nf8Var4.e);
                                return;
                            case 3:
                                bg8Var.p(nf8Var4.m, nf8Var4.l);
                                return;
                            case 4:
                                bg8Var.b(nf8Var4.n);
                                return;
                            case 5:
                                bg8Var.P(nf8Var4.m());
                                return;
                            case 6:
                                bg8Var.J(nf8Var4.o);
                                return;
                            case 7:
                                bg8Var.E(nf8Var4.f);
                                return;
                            case 8:
                                bg8Var.F(nf8Var4.f);
                                return;
                            default:
                                bg8Var.z((f2c) nf8Var4.i.e);
                                return;
                        }
                    }
                });
            }
        }
        d2c d2cVar = nf8Var2.i;
        d2c d2cVar2 = nf8Var.i;
        if (d2cVar != d2cVar2) {
            ld3 ld3Var = this.i;
            ld3Var.getClass();
            ld3Var.c = (lo) d2cVar2.f;
            this.m.c(2, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (!z3) {
            this.m.c(14, new lu3(this.Q, (byte) 7));
        }
        if (i8 != 0) {
            this.m.c(3, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i7 != 0 || i9 != 0) {
            this.m.c(-1, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i7 != 0) {
            this.m.c(4, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (i9 != 0 || nf8Var2.m != nf8Var.m) {
            this.m.c(5, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (nf8Var2.n != nf8Var.n) {
            this.m.c(6, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (nf8Var2.m() != nf8Var.m()) {
            this.m.c(7, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        if (!nf8Var2.o.equals(nf8Var.o)) {
            this.m.c(12, new b86() {
                @Override
                public final void invoke(Object obj8) {
                    byte b2 = r2;
                    nf8 nf8Var4 = nf8Var;
                    bg8 bg8Var = (bg8) obj8;
                    switch (b2) {
                        case 0:
                            bg8Var.e(nf8Var4.g);
                            bg8Var.o(nf8Var4.g);
                            return;
                        case 1:
                            bg8Var.H(nf8Var4.e, nf8Var4.l);
                            return;
                        case 2:
                            bg8Var.t(nf8Var4.e);
                            return;
                        case 3:
                            bg8Var.p(nf8Var4.m, nf8Var4.l);
                            return;
                        case 4:
                            bg8Var.b(nf8Var4.n);
                            return;
                        case 5:
                            bg8Var.P(nf8Var4.m());
                            return;
                        case 6:
                            bg8Var.J(nf8Var4.o);
                            return;
                        case 7:
                            bg8Var.E(nf8Var4.f);
                            return;
                        case 8:
                            bg8Var.F(nf8Var4.f);
                            return;
                        default:
                            bg8Var.z((f2c) nf8Var4.i.e);
                            return;
                    }
                }
            });
        }
        u1();
        this.m.b();
        if (nf8Var2.p != nf8Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((n64) it.next()).a.x1();
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
        jp5 jp5Var = this.A;
        qoc qocVar = this.z;
        boolean z = false;
        if (h != 1) {
            if (h != 2 && h != 3) {
                if (h != 4) {
                    grb.g();
                    return;
                }
            } else {
                y1();
                boolean z2 = this.p0.p;
                if (s() && !z2) {
                    z = true;
                }
                qocVar.c(z);
                jp5Var.a(s());
                return;
            }
        }
        qocVar.c(false);
        jp5Var.a(false);
    }

    @Override
    public final void y(bg8 bg8Var) {
        bg8Var.getClass();
        this.m.a(bg8Var);
    }

    @Override
    public final asb y0() {
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
            String str = gcc.a;
            Locale locale = Locale.US;
            String j = c00.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f0) {
                if (this.g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                efd.g("ExoPlayerImpl", j, illegalStateException);
                this.g0 = true;
                return;
            }
            grb.i(j);
        }
    }

    @Override
    public final long z() {
        asb y0 = y0();
        if (y0.p()) {
            return -9223372036854775807L;
        }
        return gcc.i0(y0.m(l0(), this.a, 0L).l);
    }

    @Override
    public final boolean z0() {
        y1();
        return false;
    }
}
