package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class dh5 extends rh0 {
    public final bc3 i;
    public final k6d j;
    public final kg7 k;
    public final is3 l;
    public final k4f m;
    public final boolean n;
    public final boolean o;
    public final fc3 p;
    public final long q;
    public ws6 r;
    public w0c s;
    public bt6 t;

    static {
        ct6.a("media3.exoplayer.hls");
    }

    public dh5(bt6 bt6Var, k6d k6dVar, bc3 bc3Var, kg7 kg7Var, is3 is3Var, k4f k4fVar, fc3 fc3Var, long j, boolean z, int i) {
        this.t = bt6Var;
        this.r = bt6Var.c;
        this.j = k6dVar;
        this.i = bc3Var;
        this.k = kg7Var;
        this.l = is3Var;
        this.m = k4fVar;
        this.p = fc3Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static xg5 u(mo5 mo5Var, long j) {
        xg5 xg5Var = null;
        for (int i = 0; i < mo5Var.size(); i++) {
            xg5 xg5Var2 = (xg5) mo5Var.get(i);
            if (xg5Var2.e > j) {
                break;
            }
            if (xg5Var2.x) {
                xg5Var = xg5Var2;
            }
        }
        return xg5Var;
    }

    @Override
    public final boolean a(bt6 bt6Var) {
        bt6 i = i();
        xs6 xs6Var = i.b;
        xs6Var.getClass();
        xs6 xs6Var2 = bt6Var.b;
        if (xs6Var2 != null && xs6Var2.a.equals(xs6Var.a) && xs6Var2.e.equals(xs6Var.e) && Objects.equals(xs6Var2.c, xs6Var.c) && i.c.equals(bt6Var.c)) {
            return true;
        }
        return false;
    }

    @Override
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        kq b = b(rz6Var);
        fs3 fs3Var = new fs3(this.d.c, 0, rz6Var);
        w0c w0cVar = this.s;
        we8 we8Var = this.g;
        we8Var.getClass();
        return new tg5(this.i, this.p, this.j, w0cVar, this.l, fs3Var, this.m, b, mx6Var, this.k, this.n, this.o ? 1 : 0, we8Var);
    }

    @Override
    public final synchronized bt6 i() {
        return this.t;
    }

    @Override
    public final void k() {
        fc3 fc3Var = this.p;
        mx6 mx6Var = fc3Var.h;
        if (mx6Var != null) {
            mx6Var.d();
        }
        bx7 bx7Var = fc3Var.x;
        if (bx7Var == null) {
            Uri uri = fc3Var.I;
            if (uri != null) {
                fc3Var.i(uri);
                return;
            }
            return;
        }
        throw bx7Var;
    }

    @Override
    public final void m(w0c w0cVar) {
        boolean z;
        this.s = w0cVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        we8 we8Var = this.g;
        we8Var.getClass();
        is3 is3Var = this.l;
        is3Var.w(myLooper, we8Var);
        is3Var.a();
        kq b = b(null);
        xs6 xs6Var = i().b;
        xs6Var.getClass();
        Uri uri = xs6Var.a;
        eb3 eb3Var = this.h;
        eb3Var.getClass();
        Handler q = hac.q(null);
        fc3 fc3Var = this.p;
        fc3Var.n = q;
        fc3Var.f = b;
        fc3Var.r = this;
        fc3Var.s = eb3Var;
        Map map = Collections.EMPTY_MAP;
        jte.l(uri, "The uri must be set.");
        dx7 dx7Var = new dx7(((y73) fc3Var.a.b).createDataSource(), new g83(uri, 1, null, map, 0L, -1L, null, 1), 4, fc3Var.b.e());
        if (fc3Var.h == null) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        mx6 mx6Var = new mx6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        fc3Var.h = mx6Var;
        mx6Var.v0(dx7Var, fc3Var, fc3Var.c.v3(dx7Var.c));
    }

    @Override
    public final void q() {
        fc3 fc3Var = this.p;
        HashMap hashMap = fc3Var.d;
        fc3Var.I = null;
        fc3Var.J = null;
        fc3Var.w = null;
        rg5 rg5Var = fc3Var.y;
        if (rg5Var != null) {
            rg5Var.f();
        }
        fc3Var.E = null;
        fc3Var.F = null;
        fc3Var.G = null;
        fc3Var.H = null;
        fc3Var.x = null;
        fc3Var.M = -9223372036854775807L;
        fc3Var.h.e0(null);
        fc3Var.h = null;
        for (ec3 ec3Var : hashMap.values()) {
            for (dc3 dc3Var : ec3Var.b.values()) {
                dc3Var.c.e0(null);
            }
        }
        fc3Var.n.removeCallbacksAndMessages(null);
        fc3Var.n = null;
        fc3Var.s = null;
        hashMap.clear();
        this.l.release();
    }

    @Override
    public final synchronized void t(bt6 bt6Var) {
        this.t = bt6Var;
    }

    public final void v(ch5 ch5Var) {
        long j;
        long j2;
        long j3;
        nka nkaVar;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        float f;
        long j8;
        long j9;
        boolean z2 = ch5Var.p;
        boolean z3 = ch5Var.g;
        mo5 mo5Var = ch5Var.r;
        long j10 = ch5Var.u;
        long j11 = ch5Var.e;
        byte b = ch5Var.d;
        long j12 = ch5Var.h;
        if (z2) {
            j = hac.i0(j12);
        } else {
            j = -9223372036854775807L;
        }
        if (b != 2 && b != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        fc3 fc3Var = this.p;
        fc3Var.w.getClass();
        k4f k4fVar = new k4f((byte) 20);
        if (fc3Var.L) {
            bh5 bh5Var = ch5Var.v;
            long j13 = bh5Var.c;
            long j14 = bh5Var.d;
            long j15 = j12 - fc3Var.M;
            boolean z4 = ch5Var.o;
            if (z4) {
                j4 = j15 + j10;
            } else {
                j4 = -9223372036854775807L;
            }
            if (ch5Var.p) {
                j5 = hac.T(hac.E(this.q)) - (j12 + j10);
            } else {
                j5 = 0;
            }
            long j16 = this.r.a;
            if (j16 != -9223372036854775807L) {
                j7 = hac.T(j16);
            } else {
                if (j11 != -9223372036854775807L) {
                    j6 = j10 - j11;
                } else if (j14 != -9223372036854775807L && ch5Var.n != -9223372036854775807L) {
                    j6 = j14;
                } else if (j13 != -9223372036854775807L) {
                    j6 = j13;
                } else {
                    j6 = 3 * ch5Var.m;
                }
                j7 = j6 + j5;
            }
            long j17 = j10 + j5;
            long j18 = hac.j(j7, j5, j17);
            ws6 ws6Var = i().c;
            boolean z5 = false;
            if (ws6Var.d == -3.4028235E38f && ws6Var.e == -3.4028235E38f && j13 == -9223372036854775807L && j14 == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            vs6 a = this.r.a();
            a.a = hac.i0(j18);
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
            ws6 ws6Var2 = new ws6(a);
            this.r = ws6Var2;
            if (j11 == -9223372036854775807L) {
                j11 = j17 - hac.T(ws6Var2.a);
            }
            if (z3) {
                j9 = j11;
            } else {
                xg5 u = u(ch5Var.s, j11);
                if (u != null) {
                    j8 = u.e;
                } else if (mo5Var.isEmpty()) {
                    j9 = 0;
                } else {
                    zg5 zg5Var = (zg5) mo5Var.get(hac.d(mo5Var, Long.valueOf(j11), true));
                    xg5 u2 = u(zg5Var.y, j11);
                    if (u2 != null) {
                        j8 = u2.e;
                    } else {
                        j8 = zg5Var.e;
                    }
                }
                j9 = j8;
            }
            if (b == 2 && ch5Var.f) {
                z5 = true;
            }
            nkaVar = new nka(j2, j, j4, ch5Var.u, j15, j9, true, !z4, z5, k4fVar, i(), this.r);
        } else {
            if (j11 != -9223372036854775807L && !mo5Var.isEmpty()) {
                if (!z3 && j11 != j10) {
                    j11 = ((zg5) mo5Var.get(hac.d(mo5Var, Long.valueOf(j11), true))).e;
                }
                j3 = j11;
            } else {
                j3 = 0;
            }
            long j19 = ch5Var.u;
            nkaVar = new nka(j2, j, j19, j19, 0L, j3, true, false, true, k4fVar, i(), null);
        }
        n(nkaVar);
    }
}
