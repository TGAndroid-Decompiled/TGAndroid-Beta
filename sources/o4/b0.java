package o4;

import android.net.Uri;
import j7.p7;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import l7.w0;
import org.telegram.ui.Components.jb;
public final class b0 implements g5.j0 {
    public final Uri f16294a;
    public final g5.u0 f16295b;
    public final w0 f16296c;
    public final e0 d;
    public final h5.c e;
    public volatile boolean h;
    public long f16299r;
    public g5.p f16300s;
    public k0 v;
    public boolean f16301w;
    public final e0 f16302x;
    public final jb f16297f = new Object();
    public boolean f16298n = true;

    public b0(e0 e0Var, Uri uri, g5.m mVar, w0 w0Var, e0 e0Var2, h5.c cVar) {
        this.f16302x = e0Var;
        this.f16294a = uri;
        this.f16295b = new g5.u0(mVar);
        this.f16296c = w0Var;
        this.d = e0Var2;
        this.e = cVar;
        j.f16355a.getAndIncrement();
        this.f16300s = b(0L);
    }

    @Override
    public final void a() {
        long j10;
        g5.m mVar;
        long j11;
        long j12;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            long j13 = -1;
            try {
                long j14 = this.f16297f.f25949a;
                g5.p b10 = b(j14);
                this.f16300s = b10;
                long open = this.f16295b.open(b10);
                if (open != -1) {
                    open += j14;
                    e0 e0Var = this.f16302x;
                    e0Var.C.post(new a0(e0Var, 2));
                }
                long j15 = open;
                this.f16302x.E = i4.b.a(this.f16295b.f6456a.getResponseHeaders());
                g5.u0 u0Var = this.f16295b;
                i4.b bVar = this.f16302x.E;
                if (bVar != null && (i10 = bVar.f7246f) != -1) {
                    mVar = new i(u0Var, i10, this);
                    k0 n10 = this.f16302x.n(new d0(0, true));
                    this.v = n10;
                    n10.b(e0.f16316a0);
                } else {
                    mVar = u0Var;
                }
                this.f16296c.x(mVar, this.f16294a, this.f16295b.f6456a.getResponseHeaders(), j14, j15, this.d);
                if (this.f16302x.E != null) {
                    r3.k kVar = (r3.k) this.f16296c.f11677c;
                    if (kVar instanceof y3.d) {
                        ((y3.d) kVar).f47051r = true;
                    }
                }
                if (this.f16298n) {
                    w0 w0Var = this.f16296c;
                    long j16 = this.f16299r;
                    r3.k kVar2 = (r3.k) w0Var.f11677c;
                    kVar2.getClass();
                    kVar2.d(j14, j16);
                    this.f16298n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        h5.c cVar = this.e;
                        synchronized (cVar) {
                            while (!cVar.f6933a) {
                                cVar.wait();
                            }
                        }
                        w0 w0Var2 = this.f16296c;
                        jb jbVar = this.f16297f;
                        r3.k kVar3 = (r3.k) w0Var2.f11677c;
                        kVar3.getClass();
                        r3.h hVar = (r3.h) w0Var2.d;
                        hVar.getClass();
                        i11 = kVar3.h(hVar, jbVar);
                        r3.h hVar2 = (r3.h) this.f16296c.d;
                        if (hVar2 != null) {
                            j12 = hVar2.d;
                        } else {
                            j12 = -1;
                        }
                        if (j12 > this.f16302x.f16323s + j14) {
                            this.e.b();
                            e0 e0Var2 = this.f16302x;
                            e0Var2.C.post(e0Var2.B);
                            j14 = j12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else {
                    r3.h hVar3 = (r3.h) this.f16296c.d;
                    if (hVar3 != null) {
                        j11 = hVar3.d;
                    } else {
                        j11 = -1;
                    }
                    if (j11 != -1) {
                        jb jbVar2 = this.f16297f;
                        if (hVar3 != null) {
                            j13 = hVar3.d;
                        }
                        jbVar2.f25949a = j13;
                    }
                }
                p7.a(this.f16295b);
            } catch (Throwable th2) {
                if (i11 != 1) {
                    r3.h hVar4 = (r3.h) this.f16296c.d;
                    if (hVar4 != null) {
                        j10 = hVar4.d;
                    } else {
                        j10 = -1;
                    }
                    if (j10 != -1) {
                        jb jbVar3 = this.f16297f;
                        if (hVar4 != null) {
                            j13 = hVar4.d;
                        }
                        jbVar3.f25949a = j13;
                    }
                }
                p7.a(this.f16295b);
                throw th2;
            }
        }
    }

    public final g5.p b(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f16302x.f16322r;
        Map map2 = e0.Z;
        Uri uri = this.f16294a;
        h5.a.k(uri, "The uri must be set.");
        return new g5.p(uri, 1, null, map2, j10, -1L, str, 6);
    }

    @Override
    public final void r() {
        this.h = true;
    }
}
