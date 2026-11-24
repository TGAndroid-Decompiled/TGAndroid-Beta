package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public final class q53 extends qg0 {
    public final HashMap A;
    public mm5 B;
    public s96 C;
    public final Uri D;
    public o63 E;
    public mv6 F;
    public vyb G;
    public IOException H;
    public Handler I;
    public h53 J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long P;
    public int Q;
    public br6 R;
    public wq6 S;
    public final boolean i;
    public final m63 j;
    public final lv6 k;
    public final ie7 l;
    public final yq3 m;
    public final i2f n;
    public final c5a o;
    public final short p;
    public final int q;
    public final kp r;
    public final bv7 s;
    public final qx4 t;
    public final Object u;
    public final SparseArray v;
    public final m53 w;
    public final m53 x;
    public final lj9 y;
    public final n86 z;

    static {
        cr6.a("media3.exoplayer.dash");
    }

    public q53(br6 br6Var, m63 m63Var, bv7 bv7Var, lv6 lv6Var, ie7 ie7Var, yq3 yq3Var, i2f i2fVar, long j, long j2) {
        this.R = br6Var;
        this.S = br6Var.c;
        Uri uri = br6Var.b.a;
        this.D = uri;
        this.J = null;
        this.j = m63Var;
        this.s = bv7Var;
        this.k = lv6Var;
        this.m = yq3Var;
        this.n = i2fVar;
        this.p = (int) j;
        this.q = (int) j2;
        this.l = ie7Var;
        this.o = new c5a((byte) 3);
        this.i = false;
        this.r = b(null);
        this.u = new Object();
        this.B = mm5.u(new s96(uri));
        this.A = new HashMap();
        this.v = new SparseArray();
        this.y = new lj9(this, (byte) 25);
        this.P = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.t = new qx4(this);
        this.z = new l69(this, (byte) 25);
        this.w = new Runnable(this) {
            public final q53 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                q53 q53Var = this.b;
                switch (b) {
                    case 0:
                        q53Var.D();
                        return;
                    default:
                        try {
                            q53Var.z(false);
                            return;
                        } catch (Exception e) {
                            q53Var.H = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.x = new Runnable(this) {
            public final q53 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                q53 q53Var = this.b;
                switch (b) {
                    case 0:
                        q53Var.D();
                        return;
                    default:
                        try {
                            q53Var.z(false);
                            return;
                        } catch (Exception e) {
                            q53Var.H = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(f38 f38Var) {
        List list = f38Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((ea) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(ce3 ce3Var, bv7 bv7Var) {
        o63 o63Var = this.E;
        Uri parse = Uri.parse(ce3Var.c);
        Map map = Collections.EMPTY_MAP;
        gre.l(parse, "The uri must be set.");
        this.F.r0(new cv7(o63Var, new u63(parse, 1, null, map, 0L, -1L, null, 1), 5, bv7Var), new n53(this), 1);
    }

    public final s96 B() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= elapsedRealtime) {
                it.remove();
            }
        }
        s96 s96Var = this.C;
        if (s96Var != null && !hashMap.containsKey(s96Var.b)) {
            for (int i = 0; i < this.B.size(); i++) {
                s96 s96Var2 = (s96) this.B.get(i);
                if (s96Var2.b.equals(this.C.b)) {
                    this.C = s96Var2;
                    return s96Var2;
                }
            }
        }
        s96 s96Var3 = (s96) this.B.get(0);
        s96Var3.getClass();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            s96 s96Var4 = (s96) this.B.get(i2);
            Long l = (Long) hashMap.get(s96Var4.b);
            if (l == null) {
                this.C = s96Var4;
                return s96Var4;
            }
            if (l.longValue() < j) {
                j = l.longValue();
                s96Var3 = s96Var4;
            }
        }
        this.C = s96Var3;
        return s96Var3;
    }

    public final synchronized void C(wq6 wq6Var) {
        this.S = wq6Var;
    }

    public final void D() {
        s96 B;
        this.I.removeCallbacks(this.w);
        if (this.F.S()) {
            return;
        }
        if (this.F.W()) {
            this.K = true;
            return;
        }
        synchronized (this.u) {
            B = B();
        }
        Uri uri = B.a;
        this.K = false;
        Map map = Collections.EMPTY_MAP;
        gre.l(uri, "The uri must be set.");
        cv7 cv7Var = new cv7(this.E, new u63(uri, 1, null, map, 0L, -1L, null, 1), 4, this.s);
        qx4 qx4Var = this.t;
        this.n.getClass();
        this.F.r0(cv7Var, qx4Var, 3);
    }

    @Override
    public final boolean a(br6 br6Var) {
        xq6 xq6Var = i().b;
        xq6Var.getClass();
        xq6 xq6Var2 = br6Var.b;
        if (xq6Var2 != null && xq6Var2.a.equals(xq6Var.a) && xq6Var2.e.equals(xq6Var.e) && Objects.equals(xq6Var2.c, xq6Var.c)) {
            return true;
        }
        return false;
    }

    @Override
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        int intValue = ((Integer) rx6Var.a).intValue() - this.Q;
        kp b = b(rx6Var);
        vq3 vq3Var = new vq3(this.d.c, 0, rx6Var);
        int i = this.Q + intValue;
        h53 h53Var = this.J;
        vyb vybVar = this.G;
        long j2 = this.N;
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        l53 l53Var = new l53(i, h53Var, this.o, intValue, this.k, vybVar, this.m, vq3Var, this.n, b, j2, this.z, mv6Var, this.l, this.y, uc8Var);
        this.v.put(i, l53Var);
        return l53Var;
    }

    @Override
    public final synchronized br6 i() {
        return this.R;
    }

    @Override
    public final void k() {
        this.z.b();
    }

    @Override
    public final void m(vyb vybVar) {
        this.G = vybVar;
        Looper myLooper = Looper.myLooper();
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        yq3 yq3Var = this.m;
        yq3Var.u(myLooper, uc8Var);
        yq3Var.a();
        if (this.i) {
            z(false);
            return;
        }
        this.E = this.j.createDataSource();
        this.F = new mv6("DashMediaSource");
        this.I = g8c.q(null);
        D();
    }

    @Override
    public final void o(sr6 sr6Var) {
        l53 l53Var = (l53) sr6Var;
        rc8 rc8Var = l53Var.y;
        rc8Var.r = true;
        rc8Var.d.removeCallbacksAndMessages(null);
        for (eh2 eh2Var : l53Var.I) {
            eh2Var.C(l53Var);
        }
        l53Var.H = null;
        this.v.remove(l53Var.a);
    }

    @Override
    public final void q() {
        this.K = false;
        this.E = null;
        mv6 mv6Var = this.F;
        if (mv6Var != null) {
            mv6Var.b0(null);
            this.F = null;
        }
        C(i().c);
        this.L = 0L;
        this.M = 0L;
        synchronized (this.u) {
            this.B = mm5.u(new s96(this.D));
            this.A.clear();
            this.C = null;
        }
        this.H = null;
        Handler handler = this.I;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.I = null;
        }
        this.N = -9223372036854775807L;
        this.O = 0;
        this.P = -9223372036854775807L;
        this.v.clear();
        c5a c5aVar = this.o;
        ((HashMap) c5aVar.b).clear();
        ((HashMap) c5aVar.c).clear();
        ((HashMap) c5aVar.d).clear();
        this.m.release();
    }

    @Override
    public final synchronized void t(br6 br6Var) {
        this.R = br6Var;
        this.S = br6Var.c;
    }

    public final synchronized wq6 u() {
        return this.S;
    }

    public final void w() {
        boolean z;
        mv6 mv6Var = this.F;
        n53 n53Var = new n53(this);
        synchronized (ycd.b) {
            z = ycd.c;
        }
        if (z) {
            n53Var.a();
            return;
        }
        if (mv6Var == null) {
            mv6Var = new mv6("SntpClient");
        }
        mv6Var.r0(new pd5((byte) 26), new v39(n53Var, (byte) 11), 1);
    }

    public final void x(cv7 cv7Var, long j, long j2) {
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.n.getClass();
        this.r.o(f86Var, cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        lad.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.N = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q53.z(boolean):void");
    }
}
