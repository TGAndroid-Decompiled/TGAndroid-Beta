package j4;

import android.net.Uri;
import f7.f5;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
public final class p0 implements com.google.android.exoplayer2.upstream.n0 {
    public final Uri f13533a;
    public final com.google.android.exoplayer2.upstream.x0 f13534b;
    public final c f13535c;
    public final s0 d;
    public final d5.c f13536e;
    public volatile boolean h;
    public long f13539r;
    public com.google.android.exoplayer2.upstream.q f13540s;
    public a1 v;
    public boolean f13541w;
    public final s0 f13542x;
    public final m3.n f13537f = new Object();
    public boolean f13538n = true;

    public p0(s0 s0Var, Uri uri, com.google.android.exoplayer2.upstream.m mVar, c cVar, s0 s0Var2, d5.c cVar2) {
        this.f13542x = s0Var;
        this.f13533a = uri;
        this.f13534b = new com.google.android.exoplayer2.upstream.x0(mVar);
        this.f13535c = cVar;
        this.d = s0Var2;
        this.f13536e = cVar2;
        q.f13543a.getAndIncrement();
        this.f13540s = b(0L);
    }

    @Override
    public final void K() {
        this.h = true;
    }

    @Override
    public final void a() {
        long j10;
        com.google.android.exoplayer2.upstream.m mVar;
        long j11;
        long j12;
        int i9;
        int i10 = 0;
        while (i10 == 0 && !this.h) {
            long j13 = -1;
            try {
                long j14 = this.f13537f.f17244a;
                com.google.android.exoplayer2.upstream.q b10 = b(j14);
                this.f13540s = b10;
                long open = this.f13534b.open(b10);
                if (open != -1) {
                    open += j14;
                    s0 s0Var = this.f13542x;
                    s0Var.B.post(new o0(s0Var, 2));
                }
                long j15 = open;
                this.f13542x.D = d4.b.a(this.f13534b.f2651a.getResponseHeaders());
                com.google.android.exoplayer2.upstream.x0 x0Var = this.f13534b;
                d4.b bVar = this.f13542x.D;
                if (bVar != null && (i9 = bVar.f4317f) != -1) {
                    mVar = new p(x0Var, i9, this);
                    a1 A = this.f13542x.A(new r0(0, true));
                    this.v = A;
                    A.c(s0.Z);
                } else {
                    mVar = x0Var;
                }
                this.f13535c.C(mVar, this.f13533a, this.f13534b.f2651a.getResponseHeaders(), j14, j15, this.d);
                if (this.f13542x.D != null) {
                    m3.k kVar = (m3.k) this.f13535c.f13432c;
                    if (kVar instanceof t3.d) {
                        ((t3.d) kVar).f47622r = true;
                    }
                }
                if (this.f13538n) {
                    c cVar = this.f13535c;
                    long j16 = this.f13539r;
                    m3.k kVar2 = (m3.k) cVar.f13432c;
                    kVar2.getClass();
                    kVar2.g(j14, j16);
                    this.f13538n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        d5.c cVar2 = this.f13536e;
                        synchronized (cVar2) {
                            while (!cVar2.f4335a) {
                                cVar2.wait();
                            }
                        }
                        c cVar3 = this.f13535c;
                        m3.n nVar = this.f13537f;
                        m3.k kVar3 = (m3.k) cVar3.f13432c;
                        kVar3.getClass();
                        m3.h hVar = (m3.h) cVar3.d;
                        hVar.getClass();
                        i10 = kVar3.b(hVar, nVar);
                        m3.h hVar2 = (m3.h) this.f13535c.d;
                        if (hVar2 != null) {
                            j12 = hVar2.d;
                        } else {
                            j12 = -1;
                        }
                        if (j12 > this.f13542x.f13559s + j14) {
                            this.f13536e.b();
                            s0 s0Var2 = this.f13542x;
                            s0Var2.B.post(s0Var2.A);
                            j14 = j12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else {
                    m3.h hVar3 = (m3.h) this.f13535c.d;
                    if (hVar3 != null) {
                        j11 = hVar3.d;
                    } else {
                        j11 = -1;
                    }
                    if (j11 != -1) {
                        m3.n nVar2 = this.f13537f;
                        if (hVar3 != null) {
                            j13 = hVar3.d;
                        }
                        nVar2.f17244a = j13;
                    }
                }
                f5.a(this.f13534b);
            } catch (Throwable th) {
                if (i10 != 1) {
                    m3.h hVar4 = (m3.h) this.f13535c.d;
                    if (hVar4 != null) {
                        j10 = hVar4.d;
                    } else {
                        j10 = -1;
                    }
                    if (j10 != -1) {
                        m3.n nVar3 = this.f13537f;
                        if (hVar4 != null) {
                            j13 = hVar4.d;
                        }
                        nVar3.f17244a = j13;
                    }
                }
                f5.a(this.f13534b);
                throw th;
            }
        }
    }

    public final com.google.android.exoplayer2.upstream.q b(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f13542x.f13558r;
        Map map2 = s0.Y;
        Uri uri = this.f13533a;
        d5.a.k(uri, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uri, 1, null, map2, j10, -1L, str, 6);
    }
}
