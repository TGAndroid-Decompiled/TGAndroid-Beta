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
public final class i63 extends rg0 {
    public final HashMap A;
    public po5 B;
    public wb6 C;
    public final Uri D;
    public h73 E;
    public rx6 F;
    public v2c G;
    public IOException H;
    public Handler I;
    public z53 J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long P;
    public int Q;
    public ft6 R;
    public at6 S;
    public final boolean i;
    public final f73 j;
    public final qx6 k;
    public final sg7 l;
    public final pr3 m;
    public final z6f n;
    public final u8a o;
    public final short p;
    public final int q;
    public final lp r;
    public final iy7 s;
    public final ri6 t;
    public final Object u;
    public final SparseArray v;
    public final e63 w;
    public final e63 x;
    public final wz4 y;
    public final ra6 z;

    static {
        gt6.a("media3.exoplayer.dash");
    }

    public i63(ft6 ft6Var, f73 f73Var, iy7 iy7Var, qx6 qx6Var, sg7 sg7Var, pr3 pr3Var, z6f z6fVar, long j, long j2) {
        this.R = ft6Var;
        this.S = ft6Var.c;
        Uri uri = ft6Var.b.a;
        this.D = uri;
        this.J = null;
        this.j = f73Var;
        this.s = iy7Var;
        this.k = qx6Var;
        this.m = pr3Var;
        this.n = z6fVar;
        this.p = (int) j;
        this.q = (int) j2;
        this.l = sg7Var;
        this.o = new u8a((byte) 3);
        this.i = false;
        this.r = b(null);
        this.u = new Object();
        this.B = po5.u(new wb6(uri));
        this.A = new HashMap();
        this.v = new SparseArray();
        this.y = new wz4(this);
        this.P = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.t = new ri6(this, (byte) 23);
        this.z = new z8d(this, (byte) 25);
        this.w = new Runnable(this) {
            public final i63 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                i63 i63Var = this.b;
                switch (b) {
                    case 0:
                        i63Var.D();
                        return;
                    default:
                        try {
                            i63Var.z(false);
                            return;
                        } catch (Exception e) {
                            i63Var.H = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.x = new Runnable(this) {
            public final i63 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                i63 i63Var = this.b;
                switch (b) {
                    case 0:
                        i63Var.D();
                        return;
                    default:
                        try {
                            i63Var.z(false);
                            return;
                        } catch (Exception e) {
                            i63Var.H = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(v68 v68Var) {
        List list = v68Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((fa) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(j5 j5Var, iy7 iy7Var) {
        h73 h73Var = this.E;
        Uri parse = Uri.parse(j5Var.c);
        Map map = Collections.EMPTY_MAP;
        yve.l(parse, "The uri must be set.");
        this.F.w0(new jy7(h73Var, new n73(parse, 1, null, map, 0L, -1L, null, 1), 5, iy7Var), new f63(this), 1);
    }

    public final wb6 B() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= elapsedRealtime) {
                it.remove();
            }
        }
        wb6 wb6Var = this.C;
        if (wb6Var != null && !hashMap.containsKey(wb6Var.b)) {
            for (int i = 0; i < this.B.size(); i++) {
                wb6 wb6Var2 = (wb6) this.B.get(i);
                if (wb6Var2.b.equals(this.C.b)) {
                    this.C = wb6Var2;
                    return wb6Var2;
                }
            }
        }
        wb6 wb6Var3 = (wb6) this.B.get(0);
        wb6Var3.getClass();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            wb6 wb6Var4 = (wb6) this.B.get(i2);
            Long l = (Long) hashMap.get(wb6Var4.b);
            if (l == null) {
                this.C = wb6Var4;
                return wb6Var4;
            }
            if (l.longValue() < j) {
                j = l.longValue();
                wb6Var3 = wb6Var4;
            }
        }
        this.C = wb6Var3;
        return wb6Var3;
    }

    public final synchronized void C(at6 at6Var) {
        this.S = at6Var;
    }

    public final void D() {
        wb6 B;
        this.I.removeCallbacks(this.w);
        if (this.F.U()) {
            return;
        }
        if (this.F.Z()) {
            this.K = true;
            return;
        }
        synchronized (this.u) {
            B = B();
        }
        Uri uri = B.a;
        this.K = false;
        Map map = Collections.EMPTY_MAP;
        yve.l(uri, "The uri must be set.");
        jy7 jy7Var = new jy7(this.E, new n73(uri, 1, null, map, 0L, -1L, null, 1), 4, this.s);
        ri6 ri6Var = this.t;
        this.n.getClass();
        this.F.w0(jy7Var, ri6Var, 3);
    }

    @Override
    public final boolean a(ft6 ft6Var) {
        bt6 bt6Var = i().b;
        bt6Var.getClass();
        bt6 bt6Var2 = ft6Var.b;
        if (bt6Var2 != null && bt6Var2.a.equals(bt6Var.a) && bt6Var2.e.equals(bt6Var.e) && Objects.equals(bt6Var2.c, bt6Var.c)) {
            return true;
        }
        return false;
    }

    @Override
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        int intValue = ((Integer) vz6Var.a).intValue() - this.Q;
        lp b = b(vz6Var);
        mr3 mr3Var = new mr3(this.d.c, 0, vz6Var);
        int i = this.Q + intValue;
        z53 z53Var = this.J;
        v2c v2cVar = this.G;
        long j2 = this.N;
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        d63 d63Var = new d63(i, z53Var, this.o, intValue, this.k, v2cVar, this.m, mr3Var, this.n, b, j2, this.z, rx6Var, this.l, this.y, ig8Var);
        this.v.put(i, d63Var);
        return d63Var;
    }

    @Override
    public final synchronized ft6 i() {
        return this.R;
    }

    @Override
    public final void k() {
        this.z.g();
    }

    @Override
    public final void m(v2c v2cVar) {
        this.G = v2cVar;
        Looper myLooper = Looper.myLooper();
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        pr3 pr3Var = this.m;
        pr3Var.w(myLooper, ig8Var);
        pr3Var.a();
        if (this.i) {
            z(false);
            return;
        }
        this.E = this.j.createDataSource();
        this.F = new rx6("DashMediaSource");
        this.I = gcc.q(null);
        D();
    }

    @Override
    public final void o(xt6 xt6Var) {
        d63 d63Var = (d63) xt6Var;
        gg8 gg8Var = d63Var.y;
        gg8Var.r = true;
        gg8Var.d.removeCallbacksAndMessages(null);
        for (wh2 wh2Var : d63Var.I) {
            wh2Var.C(d63Var);
        }
        d63Var.H = null;
        this.v.remove(d63Var.a);
    }

    @Override
    public final void q() {
        this.K = false;
        this.E = null;
        rx6 rx6Var = this.F;
        if (rx6Var != null) {
            rx6Var.g0(null);
            this.F = null;
        }
        C(i().c);
        this.L = 0L;
        this.M = 0L;
        synchronized (this.u) {
            this.B = po5.u(new wb6(this.D));
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
        u8a u8aVar = this.o;
        ((HashMap) u8aVar.a).clear();
        ((HashMap) u8aVar.b).clear();
        ((HashMap) u8aVar.c).clear();
        this.m.release();
    }

    @Override
    public final synchronized void t(ft6 ft6Var) {
        this.R = ft6Var;
        this.S = ft6Var.c;
    }

    public final synchronized at6 u() {
        return this.S;
    }

    public final void w() {
        boolean z;
        rx6 rx6Var = this.F;
        f63 f63Var = new f63(this);
        synchronized (rhd.b) {
            z = rhd.c;
        }
        if (z) {
            f63Var.a();
            return;
        }
        if (rx6Var == null) {
            rx6Var = new rx6("SntpClient");
        }
        rx6Var.w0(new qf5((byte) 26), new l09(f63Var, (byte) 11), 1);
    }

    public final void x(jy7 jy7Var, long j, long j2) {
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.n.getClass();
        this.r.o(ja6Var, jy7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        efd.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.N = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i63.z(boolean):void");
    }
}
