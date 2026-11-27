package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class gh5 extends rg0 {
    public final ib3 i;
    public final z8d j;
    public final sg7 k;
    public final pr3 l;
    public final z6f m;
    public final boolean n;
    public final boolean o;
    public final mb3 p;
    public final long q;
    public at6 r;
    public v2c s;
    public ft6 t;

    static {
        gt6.a("media3.exoplayer.hls");
    }

    public gh5(ft6 ft6Var, z8d z8dVar, ib3 ib3Var, sg7 sg7Var, pr3 pr3Var, z6f z6fVar, mb3 mb3Var, long j, boolean z, int i) {
        this.t = ft6Var;
        this.r = ft6Var.c;
        this.j = z8dVar;
        this.i = ib3Var;
        this.k = sg7Var;
        this.l = pr3Var;
        this.m = z6fVar;
        this.p = mb3Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static ah5 u(po5 po5Var, long j) {
        ah5 ah5Var = null;
        for (int i = 0; i < po5Var.size(); i++) {
            ah5 ah5Var2 = (ah5) po5Var.get(i);
            if (ah5Var2.e > j) {
                break;
            }
            if (ah5Var2.x) {
                ah5Var = ah5Var2;
            }
        }
        return ah5Var;
    }

    @Override
    public final boolean a(ft6 ft6Var) {
        ft6 i = i();
        bt6 bt6Var = i.b;
        bt6Var.getClass();
        bt6 bt6Var2 = ft6Var.b;
        if (bt6Var2 != null && bt6Var2.a.equals(bt6Var.a) && bt6Var2.e.equals(bt6Var.e) && Objects.equals(bt6Var2.c, bt6Var.c) && i.c.equals(ft6Var.c)) {
            return true;
        }
        return false;
    }

    @Override
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        lp b = b(vz6Var);
        mr3 mr3Var = new mr3(this.d.c, 0, vz6Var);
        v2c v2cVar = this.s;
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        return new wg5(this.i, this.p, this.j, v2cVar, this.l, mr3Var, this.m, b, rx6Var, this.k, this.n, this.o ? 1 : 0, ig8Var);
    }

    @Override
    public final synchronized ft6 i() {
        return this.t;
    }

    @Override
    public final void k() {
        mb3 mb3Var = this.p;
        rx6 rx6Var = mb3Var.h;
        if (rx6Var != null) {
            rx6Var.g();
        }
        hy7 hy7Var = mb3Var.x;
        if (hy7Var == null) {
            Uri uri = mb3Var.I;
            if (uri != null) {
                mb3Var.j(uri);
                return;
            }
            return;
        }
        throw hy7Var;
    }

    @Override
    public final void m(v2c v2cVar) {
        boolean z;
        this.s = v2cVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        pr3 pr3Var = this.l;
        pr3Var.w(myLooper, ig8Var);
        pr3Var.a();
        lp b = b(null);
        bt6 bt6Var = i().b;
        bt6Var.getClass();
        Uri uri = bt6Var.a;
        la3 la3Var = this.h;
        la3Var.getClass();
        Handler q = gcc.q(null);
        mb3 mb3Var = this.p;
        mb3Var.n = q;
        mb3Var.f = b;
        mb3Var.r = this;
        mb3Var.s = la3Var;
        Map map = Collections.EMPTY_MAP;
        yve.l(uri, "The uri must be set.");
        jy7 jy7Var = new jy7(((f73) mb3Var.a.b).createDataSource(), new n73(uri, 1, null, map, 0L, -1L, null, 1), 4, mb3Var.b.c());
        if (mb3Var.h == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        rx6 rx6Var = new rx6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        mb3Var.h = rx6Var;
        rx6Var.w0(jy7Var, mb3Var, mb3Var.c.v3(jy7Var.c));
    }

    @Override
    public final void q() {
        mb3 mb3Var = this.p;
        HashMap hashMap = mb3Var.d;
        mb3Var.I = null;
        mb3Var.J = null;
        mb3Var.w = null;
        ug5 ug5Var = mb3Var.y;
        if (ug5Var != null) {
            ug5Var.f();
        }
        mb3Var.E = null;
        mb3Var.F = null;
        mb3Var.G = null;
        mb3Var.H = null;
        mb3Var.x = null;
        mb3Var.M = -9223372036854775807L;
        mb3Var.h.g0(null);
        mb3Var.h = null;
        for (lb3 lb3Var : hashMap.values()) {
            for (kb3 kb3Var : lb3Var.b.values()) {
                kb3Var.c.g0(null);
            }
        }
        mb3Var.n.removeCallbacksAndMessages(null);
        mb3Var.n = null;
        mb3Var.s = null;
        hashMap.clear();
        this.l.release();
    }

    @Override
    public final synchronized void t(ft6 ft6Var) {
        this.t = ft6Var;
    }

    public final void v(fh5 fh5Var) {
        long j;
        long j2;
        long j3;
        gma gmaVar;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        float f;
        long j8;
        long j9;
        boolean z2 = fh5Var.p;
        boolean z3 = fh5Var.g;
        po5 po5Var = fh5Var.r;
        long j10 = fh5Var.u;
        long j11 = fh5Var.e;
        byte b = fh5Var.d;
        long j12 = fh5Var.h;
        if (z2) {
            j = gcc.i0(j12);
        } else {
            j = -9223372036854775807L;
        }
        if (b != 2 && b != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        mb3 mb3Var = this.p;
        mb3Var.w.getClass();
        z6f z6fVar = new z6f((byte) 20);
        if (mb3Var.L) {
            eh5 eh5Var = fh5Var.v;
            long j13 = eh5Var.c;
            long j14 = eh5Var.d;
            long j15 = j12 - mb3Var.M;
            boolean z4 = fh5Var.o;
            if (z4) {
                j4 = j15 + j10;
            } else {
                j4 = -9223372036854775807L;
            }
            if (fh5Var.p) {
                j5 = gcc.T(gcc.E(this.q)) - (j12 + j10);
            } else {
                j5 = 0;
            }
            long j16 = this.r.a;
            if (j16 != -9223372036854775807L) {
                j7 = gcc.T(j16);
            } else {
                if (j11 != -9223372036854775807L) {
                    j6 = j10 - j11;
                } else if (j14 != -9223372036854775807L && fh5Var.n != -9223372036854775807L) {
                    j6 = j14;
                } else if (j13 != -9223372036854775807L) {
                    j6 = j13;
                } else {
                    j6 = 3 * fh5Var.m;
                }
                j7 = j6 + j5;
            }
            long j17 = j10 + j5;
            long j18 = gcc.j(j7, j5, j17);
            at6 at6Var = i().c;
            boolean z5 = false;
            if (at6Var.d == -3.4028235E38f && at6Var.e == -3.4028235E38f && j13 == -9223372036854775807L && j14 == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            zs6 a = this.r.a();
            a.a = gcc.i0(j18);
            float f2 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = this.r.d;
            }
            a.d = f;
            if (!z) {
                f2 = this.r.e;
            }
            a.e = f2;
            at6 at6Var2 = new at6(a);
            this.r = at6Var2;
            if (j11 == -9223372036854775807L) {
                j11 = j17 - gcc.T(at6Var2.a);
            }
            if (z3) {
                j9 = j11;
            } else {
                ah5 u = u(fh5Var.s, j11);
                if (u != null) {
                    j8 = u.e;
                } else if (po5Var.isEmpty()) {
                    j9 = 0;
                } else {
                    ch5 ch5Var = (ch5) po5Var.get(gcc.d(po5Var, Long.valueOf(j11), true));
                    ah5 u2 = u(ch5Var.y, j11);
                    if (u2 != null) {
                        j8 = u2.e;
                    } else {
                        j8 = ch5Var.e;
                    }
                }
                j9 = j8;
            }
            if (b == 2 && fh5Var.f) {
                z5 = true;
            }
            gmaVar = new gma(j2, j, j4, fh5Var.u, j15, j9, true, !z4, z5, z6fVar, i(), this.r);
        } else {
            if (j11 != -9223372036854775807L && !po5Var.isEmpty()) {
                if (!z3 && j11 != j10) {
                    j11 = ((ch5) po5Var.get(gcc.d(po5Var, Long.valueOf(j11), true))).e;
                }
                j3 = j11;
            } else {
                j3 = 0;
            }
            long j19 = fh5Var.u;
            gmaVar = new gma(j2, j, j19, j19, 0L, j3, true, false, true, z6fVar, i(), null);
        }
        n(gmaVar);
    }
}
