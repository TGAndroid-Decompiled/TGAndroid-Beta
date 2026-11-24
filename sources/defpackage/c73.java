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
public final class c73 extends rh0 {
    public final HashMap A;
    public mo5 B;
    public rb6 C;
    public final Uri D;
    public a83 E;
    public mx6 F;
    public w0c G;
    public IOException H;
    public Handler I;
    public t63 J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public int O;
    public long P;
    public int Q;
    public bt6 R;
    public ws6 S;
    public final boolean i;
    public final y73 j;
    public final hi2 k;
    public final kg7 l;
    public final is3 m;
    public final k4f n;
    public final e7a o;
    public final short p;
    public final int q;
    public final kq r;
    public final cx7 s;
    public final ni6 t;
    public final Object u;
    public final SparseArray v;
    public final y63 w;
    public final y63 x;
    public final sz4 y;
    public final ma6 z;

    static {
        ct6.a("media3.exoplayer.dash");
    }

    public c73(bt6 bt6Var, y73 y73Var, cx7 cx7Var, hi2 hi2Var, kg7 kg7Var, is3 is3Var, k4f k4fVar, long j, long j2) {
        this.R = bt6Var;
        this.S = bt6Var.c;
        Uri uri = bt6Var.b.a;
        this.D = uri;
        this.J = null;
        this.j = y73Var;
        this.s = cx7Var;
        this.k = hi2Var;
        this.m = is3Var;
        this.n = k4fVar;
        this.p = (int) j;
        this.q = (int) j2;
        this.l = kg7Var;
        this.o = new e7a((byte) 3);
        this.i = false;
        this.r = b(null);
        this.u = new Object();
        this.B = mo5.u(new rb6(uri));
        this.A = new HashMap();
        this.v = new SparseArray();
        this.y = new sz4(this);
        this.P = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.t = new ni6(this, (byte) 23);
        this.z = new k6d(this, (byte) 24);
        this.w = new Runnable(this) {
            public final c73 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                c73 c73Var = this.b;
                switch (b) {
                    case 0:
                        c73Var.D();
                        return;
                    default:
                        try {
                            c73Var.z(false);
                            return;
                        } catch (Exception e) {
                            c73Var.H = new IOException(e);
                            return;
                        }
                }
            }
        };
        this.x = new Runnable(this) {
            public final c73 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                c73 c73Var = this.b;
                switch (b) {
                    case 0:
                        c73Var.D();
                        return;
                    default:
                        try {
                            c73Var.z(false);
                            return;
                        } catch (Exception e) {
                            c73Var.H = new IOException(e);
                            return;
                        }
                }
            }
        };
    }

    public static boolean v(h58 h58Var) {
        List list = h58Var.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((ea) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(s13 s13Var, cx7 cx7Var) {
        a83 a83Var = this.E;
        Uri parse = Uri.parse(s13Var.c);
        Map map = Collections.EMPTY_MAP;
        jte.l(parse, "The uri must be set.");
        this.F.v0(new dx7(a83Var, new g83(parse, 1, null, map, 0L, -1L, null, 1), 5, cx7Var), new z63(this), 1);
    }

    public final rb6 B() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.A;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getValue()).longValue() <= elapsedRealtime) {
                it.remove();
            }
        }
        rb6 rb6Var = this.C;
        if (rb6Var != null && !hashMap.containsKey(rb6Var.b)) {
            for (int i = 0; i < this.B.size(); i++) {
                rb6 rb6Var2 = (rb6) this.B.get(i);
                if (rb6Var2.b.equals(this.C.b)) {
                    this.C = rb6Var2;
                    return rb6Var2;
                }
            }
        }
        rb6 rb6Var3 = (rb6) this.B.get(0);
        rb6Var3.getClass();
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.B.size(); i2++) {
            rb6 rb6Var4 = (rb6) this.B.get(i2);
            Long l = (Long) hashMap.get(rb6Var4.b);
            if (l == null) {
                this.C = rb6Var4;
                return rb6Var4;
            }
            if (l.longValue() < j) {
                j = l.longValue();
                rb6Var3 = rb6Var4;
            }
        }
        this.C = rb6Var3;
        return rb6Var3;
    }

    public final synchronized void C(ws6 ws6Var) {
        this.S = ws6Var;
    }

    public final void D() {
        rb6 B;
        this.I.removeCallbacks(this.w);
        if (this.F.U()) {
            return;
        }
        if (this.F.Y()) {
            this.K = true;
            return;
        }
        synchronized (this.u) {
            B = B();
        }
        Uri uri = B.a;
        this.K = false;
        Map map = Collections.EMPTY_MAP;
        jte.l(uri, "The uri must be set.");
        dx7 dx7Var = new dx7(this.E, new g83(uri, 1, null, map, 0L, -1L, null, 1), 4, this.s);
        ni6 ni6Var = this.t;
        this.n.getClass();
        this.F.v0(dx7Var, ni6Var, 3);
    }

    @Override
    public final boolean a(bt6 bt6Var) {
        xs6 xs6Var = i().b;
        xs6Var.getClass();
        xs6 xs6Var2 = bt6Var.b;
        if (xs6Var2 != null && xs6Var2.a.equals(xs6Var.a) && xs6Var2.e.equals(xs6Var.e) && Objects.equals(xs6Var2.c, xs6Var.c)) {
            return true;
        }
        return false;
    }

    @Override
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        int intValue = ((Integer) rz6Var.a).intValue() - this.Q;
        kq b = b(rz6Var);
        fs3 fs3Var = new fs3(this.d.c, 0, rz6Var);
        int i = this.Q + intValue;
        t63 t63Var = this.J;
        w0c w0cVar = this.G;
        long j2 = this.N;
        we8 we8Var = this.g;
        we8Var.getClass();
        x63 x63Var = new x63(i, t63Var, this.o, intValue, this.k, w0cVar, this.m, fs3Var, this.n, b, j2, this.z, mx6Var, this.l, this.y, we8Var);
        this.v.put(i, x63Var);
        return x63Var;
    }

    @Override
    public final synchronized bt6 i() {
        return this.R;
    }

    @Override
    public final void k() {
        this.z.d();
    }

    @Override
    public final void m(w0c w0cVar) {
        this.G = w0cVar;
        Looper myLooper = Looper.myLooper();
        we8 we8Var = this.g;
        we8Var.getClass();
        is3 is3Var = this.m;
        is3Var.w(myLooper, we8Var);
        is3Var.a();
        if (this.i) {
            z(false);
            return;
        }
        this.E = this.j.createDataSource();
        this.F = new mx6("DashMediaSource");
        this.I = hac.q(null);
        D();
    }

    @Override
    public final void o(tt6 tt6Var) {
        x63 x63Var = (x63) tt6Var;
        ue8 ue8Var = x63Var.y;
        ue8Var.r = true;
        ue8Var.d.removeCallbacksAndMessages(null);
        for (si2 si2Var : x63Var.I) {
            si2Var.C(x63Var);
        }
        x63Var.H = null;
        this.v.remove(x63Var.a);
    }

    @Override
    public final void q() {
        this.K = false;
        this.E = null;
        mx6 mx6Var = this.F;
        if (mx6Var != null) {
            mx6Var.e0(null);
            this.F = null;
        }
        C(i().c);
        this.L = 0L;
        this.M = 0L;
        synchronized (this.u) {
            this.B = mo5.u(new rb6(this.D));
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
        e7a e7aVar = this.o;
        ((HashMap) e7aVar.a).clear();
        ((HashMap) e7aVar.b).clear();
        ((HashMap) e7aVar.c).clear();
        this.m.release();
    }

    @Override
    public final synchronized void t(bt6 bt6Var) {
        this.R = bt6Var;
        this.S = bt6Var.c;
    }

    public final synchronized ws6 u() {
        return this.S;
    }

    public final void w() {
        boolean z;
        mx6 mx6Var = this.F;
        z63 z63Var = new z63(this);
        synchronized (afd.b) {
            z = afd.c;
        }
        if (z) {
            z63Var.a();
            return;
        }
        if (mx6Var == null) {
            mx6Var = new mx6("SntpClient");
        }
        mx6Var.v0(new nf5((byte) 26), new oo8(z63Var, (byte) 14), 1);
    }

    public final void x(dx7 dx7Var, long j, long j2) {
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.n.getClass();
        this.r.o(ea6Var, dx7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void y(IOException iOException) {
        ncd.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.N = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        z(true);
    }

    public final void z(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c73.z(boolean):void");
    }
}
