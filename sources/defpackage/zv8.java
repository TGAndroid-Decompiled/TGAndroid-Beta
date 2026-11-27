package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class zv8 implements oa6 {
    public final cw8 E;
    public final Uri b;
    public final b2b c;
    public final rx6 d;
    public final cw8 e;
    public final or2 f;
    public volatile boolean n;
    public long s;
    public x1c x;
    public boolean y;
    public final v11 h = new Object();
    public boolean r = true;
    public final long a = ja6.h.getAndIncrement();
    public n73 w = b(0, null);

    public zv8(cw8 cw8Var, Uri uri, h73 h73Var, rx6 rx6Var, cw8 cw8Var2, or2 or2Var) {
        this.E = cw8Var;
        this.b = uri;
        this.c = new b2b(h73Var);
        this.d = rx6Var;
        this.e = cw8Var2;
        this.f = or2Var;
    }

    @Override
    public final void a() {
        z63 z63Var;
        e84 e84Var;
        int i;
        int i2 = 0;
        String str = null;
        while (i2 == 0 && !this.n) {
            try {
                long j = this.h.a;
                n73 b = b(j, str);
                this.w = b;
                long open = this.c.open(b);
                if (this.n) {
                    return;
                }
                List list = (List) this.c.a.getResponseHeaders().get("ETag");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                if (open != -1) {
                    open += j;
                    cw8 cw8Var = this.E;
                    cw8Var.I.post(new wv8(cw8Var, (byte) 0));
                }
                long j2 = open;
                this.E.K = rl5.d(this.c.a.getResponseHeaders());
                b2b b2bVar = this.c;
                rl5 rl5Var = this.E.K;
                if (rl5Var != null && (i = rl5Var.f) != -1) {
                    z63Var = new pl5(b2bVar, i, this);
                    x1c y = this.E.y(new bw8(0, true));
                    this.x = y;
                    y.g(cw8.m0);
                } else {
                    z63Var = b2bVar;
                }
                this.d.X(z63Var, this.b, this.c.a.getResponseHeaders(), j, j2, this.e);
                if (this.E.K != null && (e84Var = (e84) this.d.c) != null) {
                    e84 a = e84Var.a();
                    if (a instanceof qh7) {
                        ((qh7) a).t = true;
                    }
                }
                if (this.r) {
                    rx6 rx6Var = this.d;
                    long j3 = this.s;
                    e84 e84Var2 = (e84) rx6Var.c;
                    e84Var2.getClass();
                    e84Var2.d(j, j3);
                    this.r = false;
                }
                while (i2 == 0 && !this.n) {
                    try {
                        or2 or2Var = this.f;
                        synchronized (or2Var) {
                            while (!or2Var.b) {
                                or2Var.a.getClass();
                                or2Var.wait();
                            }
                        }
                        rx6 rx6Var2 = this.d;
                        v11 v11Var = this.h;
                        e84 e84Var3 = (e84) rx6Var2.c;
                        e84Var3.getClass();
                        cb3 cb3Var = (cb3) rx6Var2.d;
                        cb3Var.getClass();
                        i2 = e84Var3.b(cb3Var, v11Var);
                        long N = this.d.N();
                        if (N > this.E.s + j) {
                            this.f.d();
                            cw8 cw8Var2 = this.E;
                            cw8Var2.I.post(cw8Var2.H);
                            j = N;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.d.N() != -1) {
                    this.h.a = this.d.N();
                }
                lge.a(this.c);
            } finally {
                if (i2 != 1 && this.d.N() != -1) {
                    this.h.a = this.d.N();
                }
                lge.a(this.c);
            }
        }
    }

    public final n73 b(long j, String str) {
        Map map = cw8.l0;
        if (str != null && !str.startsWith("W/")) {
            lp lpVar = new lp(4);
            lpVar.y(map.entrySet());
            lpVar.x("If-Range", str);
            map = lpVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.E.r;
        Uri uri = this.b;
        yve.l(uri, "The uri must be set.");
        return new n73(uri, 1, null, map, j, -1L, str2, 6);
    }

    @Override
    public final void c() {
        this.n = true;
    }
}
