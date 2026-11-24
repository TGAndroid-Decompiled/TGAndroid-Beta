package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public final class ef5 extends qg0 {
    public final pa3 i;
    public final l69 j;
    public final ie7 k;
    public final yq3 l;
    public final i2f m;
    public final boolean n;
    public final boolean o;
    public final ta3 p;
    public final long q;
    public wq6 r;
    public vyb s;
    public br6 t;

    static {
        cr6.a("media3.exoplayer.hls");
    }

    public ef5(br6 br6Var, l69 l69Var, pa3 pa3Var, ie7 ie7Var, yq3 yq3Var, i2f i2fVar, ta3 ta3Var, long j, boolean z, int i) {
        this.t = br6Var;
        this.r = br6Var.c;
        this.j = l69Var;
        this.i = pa3Var;
        this.k = ie7Var;
        this.l = yq3Var;
        this.m = i2fVar;
        this.p = ta3Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static ye5 u(mm5 mm5Var, long j) {
        ye5 ye5Var = null;
        for (int i = 0; i < mm5Var.size(); i++) {
            ye5 ye5Var2 = (ye5) mm5Var.get(i);
            if (ye5Var2.e > j) {
                break;
            }
            if (ye5Var2.x) {
                ye5Var = ye5Var2;
            }
        }
        return ye5Var;
    }

    @Override
    public final boolean a(br6 br6Var) {
        br6 i = i();
        xq6 xq6Var = i.b;
        xq6Var.getClass();
        xq6 xq6Var2 = br6Var.b;
        if (xq6Var2 != null && xq6Var2.a.equals(xq6Var.a) && xq6Var2.e.equals(xq6Var.e) && Objects.equals(xq6Var2.c, xq6Var.c) && i.c.equals(br6Var.c)) {
            return true;
        }
        return false;
    }

    @Override
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        kp b = b(rx6Var);
        vq3 vq3Var = new vq3(this.d.c, 0, rx6Var);
        vyb vybVar = this.s;
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        return new ue5(this.i, this.p, this.j, vybVar, this.l, vq3Var, this.m, b, mv6Var, this.k, this.n, this.o ? 1 : 0, uc8Var);
    }

    @Override
    public final synchronized br6 i() {
        return this.t;
    }

    @Override
    public final void k() {
        ta3 ta3Var = this.p;
        mv6 mv6Var = ta3Var.h;
        if (mv6Var != null) {
            mv6Var.b();
        }
        av7 av7Var = ta3Var.x;
        if (av7Var == null) {
            Uri uri = ta3Var.I;
            if (uri != null) {
                ta3Var.i(uri);
                return;
            }
            return;
        }
        throw av7Var;
    }

    @Override
    public final void m(vyb vybVar) {
        boolean z;
        this.s = vybVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        yq3 yq3Var = this.l;
        yq3Var.u(myLooper, uc8Var);
        yq3Var.a();
        kp b = b(null);
        xq6 xq6Var = i().b;
        xq6Var.getClass();
        Uri uri = xq6Var.a;
        s93 s93Var = this.h;
        s93Var.getClass();
        Handler q = g8c.q(null);
        ta3 ta3Var = this.p;
        ta3Var.n = q;
        ta3Var.f = b;
        ta3Var.r = this;
        ta3Var.s = s93Var;
        Map map = Collections.EMPTY_MAP;
        gre.l(uri, "The uri must be set.");
        cv7 cv7Var = new cv7(((m63) ta3Var.a.b).createDataSource(), new u63(uri, 1, null, map, 0L, -1L, null, 1), 4, ta3Var.b.o());
        if (ta3Var.h == null) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        mv6 mv6Var = new mv6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        ta3Var.h = mv6Var;
        mv6Var.r0(cv7Var, ta3Var, ta3Var.c.v3(cv7Var.c));
    }

    @Override
    public final void q() {
        ta3 ta3Var = this.p;
        HashMap hashMap = ta3Var.d;
        ta3Var.I = null;
        ta3Var.J = null;
        ta3Var.w = null;
        se5 se5Var = ta3Var.y;
        if (se5Var != null) {
            se5Var.f();
        }
        ta3Var.E = null;
        ta3Var.F = null;
        ta3Var.G = null;
        ta3Var.H = null;
        ta3Var.x = null;
        ta3Var.M = -9223372036854775807L;
        ta3Var.h.b0(null);
        ta3Var.h = null;
        for (sa3 sa3Var : hashMap.values()) {
            for (ra3 ra3Var : sa3Var.b.values()) {
                ra3Var.c.b0(null);
            }
        }
        ta3Var.n.removeCallbacksAndMessages(null);
        ta3Var.n = null;
        ta3Var.s = null;
        hashMap.clear();
        this.l.release();
    }

    @Override
    public final synchronized void t(br6 br6Var) {
        this.t = br6Var;
    }

    public final void v(df5 df5Var) {
        long j;
        long j2;
        long j3;
        lia liaVar;
        long j4;
        long j5;
        long j6;
        long j7;
        boolean z;
        float f;
        long j8;
        long j9;
        boolean z2 = df5Var.p;
        boolean z3 = df5Var.g;
        mm5 mm5Var = df5Var.r;
        long j10 = df5Var.u;
        long j11 = df5Var.e;
        byte b = df5Var.d;
        long j12 = df5Var.h;
        if (z2) {
            j = g8c.i0(j12);
        } else {
            j = -9223372036854775807L;
        }
        if (b != 2 && b != 1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        ta3 ta3Var = this.p;
        ta3Var.w.getClass();
        i2f i2fVar = new i2f((byte) 20);
        if (ta3Var.L) {
            cf5 cf5Var = df5Var.v;
            long j13 = cf5Var.c;
            long j14 = cf5Var.d;
            long j15 = j12 - ta3Var.M;
            boolean z4 = df5Var.o;
            if (z4) {
                j4 = j15 + j10;
            } else {
                j4 = -9223372036854775807L;
            }
            if (df5Var.p) {
                j5 = g8c.T(g8c.E(this.q)) - (j12 + j10);
            } else {
                j5 = 0;
            }
            long j16 = this.r.a;
            if (j16 != -9223372036854775807L) {
                j7 = g8c.T(j16);
            } else {
                if (j11 != -9223372036854775807L) {
                    j6 = j10 - j11;
                } else if (j14 != -9223372036854775807L && df5Var.n != -9223372036854775807L) {
                    j6 = j14;
                } else if (j13 != -9223372036854775807L) {
                    j6 = j13;
                } else {
                    j6 = 3 * df5Var.m;
                }
                j7 = j6 + j5;
            }
            long j17 = j10 + j5;
            long j18 = g8c.j(j7, j5, j17);
            wq6 wq6Var = i().c;
            boolean z5 = false;
            if (wq6Var.d == -3.4028235E38f && wq6Var.e == -3.4028235E38f && j13 == -9223372036854775807L && j14 == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            vq6 a = this.r.a();
            a.a = g8c.i0(j18);
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
            wq6 wq6Var2 = new wq6(a);
            this.r = wq6Var2;
            if (j11 == -9223372036854775807L) {
                j11 = j17 - g8c.T(wq6Var2.a);
            }
            if (z3) {
                j9 = j11;
            } else {
                ye5 u = u(df5Var.s, j11);
                if (u != null) {
                    j8 = u.e;
                } else if (mm5Var.isEmpty()) {
                    j9 = 0;
                } else {
                    af5 af5Var = (af5) mm5Var.get(g8c.d(mm5Var, Long.valueOf(j11), true));
                    ye5 u2 = u(af5Var.y, j11);
                    if (u2 != null) {
                        j8 = u2.e;
                    } else {
                        j8 = af5Var.e;
                    }
                }
                j9 = j8;
            }
            if (b == 2 && df5Var.f) {
                z5 = true;
            }
            liaVar = new lia(j2, j, j4, df5Var.u, j15, j9, true, !z4, z5, i2fVar, i(), this.r);
        } else {
            if (j11 != -9223372036854775807L && !mm5Var.isEmpty()) {
                if (!z3 && j11 != j10) {
                    j11 = ((af5) mm5Var.get(g8c.d(mm5Var, Long.valueOf(j11), true))).e;
                }
                j3 = j11;
            } else {
                j3 = 0;
            }
            long j19 = df5Var.u;
            liaVar = new lia(j2, j, j19, j19, 0L, j3, true, false, true, i2fVar, i(), null);
        }
        n(liaVar);
    }
}
