package o4;

import android.net.Uri;
import j7.p7;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import l7.w0;
import org.telegram.ui.Components.jb;
public final class b0 implements g5.j0 {
    public final Uri f16276a;
    public final g5.u0 f16277b;
    public final w0 f16278c;
    public final e0 d;
    public final h5.c e;
    public volatile boolean h;
    public long f16281r;
    public g5.p f16282s;
    public k0 v;
    public boolean f16283w;
    public final e0 f16284x;
    public final jb f16279f = new Object();
    public boolean f16280n = true;

    public b0(e0 e0Var, Uri uri, g5.m mVar, w0 w0Var, e0 e0Var2, h5.c cVar) {
        this.f16284x = e0Var;
        this.f16276a = uri;
        this.f16277b = new g5.u0(mVar);
        this.f16278c = w0Var;
        this.d = e0Var2;
        this.e = cVar;
        j.f16337a.getAndIncrement();
        this.f16282s = c(0L);
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
                long j14 = this.f16279f.f25932a;
                g5.p c3 = c(j14);
                this.f16282s = c3;
                long open = this.f16277b.open(c3);
                if (open != -1) {
                    open += j14;
                    e0 e0Var = this.f16284x;
                    e0Var.C.post(new a0(e0Var, 2));
                }
                long j15 = open;
                this.f16284x.E = i4.b.a(this.f16277b.f6456a.getResponseHeaders());
                g5.u0 u0Var = this.f16277b;
                i4.b bVar = this.f16284x.E;
                if (bVar != null && (i10 = bVar.f7229f) != -1) {
                    mVar = new i(u0Var, i10, this);
                    k0 k10 = this.f16284x.k(new d0(0, true));
                    this.v = k10;
                    k10.b(e0.f16298a0);
                } else {
                    mVar = u0Var;
                }
                this.f16278c.x(mVar, this.f16276a, this.f16277b.f6456a.getResponseHeaders(), j14, j15, this.d);
                if (this.f16284x.E != null) {
                    r3.k kVar = (r3.k) this.f16278c.f11787c;
                    if (kVar instanceof y3.e) {
                        ((y3.e) kVar).f47145r = true;
                    }
                }
                if (this.f16280n) {
                    w0 w0Var = this.f16278c;
                    long j16 = this.f16281r;
                    r3.k kVar2 = (r3.k) w0Var.f11787c;
                    kVar2.getClass();
                    kVar2.d(j14, j16);
                    this.f16280n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        h5.c cVar = this.e;
                        synchronized (cVar) {
                            while (!cVar.f6920a) {
                                cVar.wait();
                            }
                        }
                        w0 w0Var2 = this.f16278c;
                        jb jbVar = this.f16279f;
                        r3.k kVar3 = (r3.k) w0Var2.f11787c;
                        kVar3.getClass();
                        r3.h hVar = (r3.h) w0Var2.d;
                        hVar.getClass();
                        i11 = kVar3.h(hVar, jbVar);
                        r3.h hVar2 = (r3.h) this.f16278c.d;
                        if (hVar2 != null) {
                            j12 = hVar2.d;
                        } else {
                            j12 = -1;
                        }
                        if (j12 > this.f16284x.f16305s + j14) {
                            this.e.b();
                            e0 e0Var2 = this.f16284x;
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
                    r3.h hVar3 = (r3.h) this.f16278c.d;
                    if (hVar3 != null) {
                        j11 = hVar3.d;
                    } else {
                        j11 = -1;
                    }
                    if (j11 != -1) {
                        jb jbVar2 = this.f16279f;
                        if (hVar3 != null) {
                            j13 = hVar3.d;
                        }
                        jbVar2.f25932a = j13;
                    }
                }
                p7.a(this.f16277b);
            } catch (Throwable th2) {
                if (i11 != 1) {
                    r3.h hVar4 = (r3.h) this.f16278c.d;
                    if (hVar4 != null) {
                        j10 = hVar4.d;
                    } else {
                        j10 = -1;
                    }
                    if (j10 != -1) {
                        jb jbVar3 = this.f16279f;
                        if (hVar4 != null) {
                            j13 = hVar4.d;
                        }
                        jbVar3.f25932a = j13;
                    }
                }
                p7.a(this.f16277b);
                throw th2;
            }
        }
    }

    @Override
    public final void b() {
        this.h = true;
    }

    public final g5.p c(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f16284x.f16304r;
        Map map2 = e0.Z;
        Uri uri = this.f16276a;
        h5.a.k(uri, "The uri must be set.");
        return new g5.p(uri, 1, null, map2, j10, -1L, str, 6);
    }
}
