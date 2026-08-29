package l4;

import android.net.Uri;
import h7.m5;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
public final class o0 implements com.google.android.exoplayer2.upstream.n0 {
    public final Uri f14389a;
    public final com.google.android.exoplayer2.upstream.x0 f14390b;
    public final l3.g0 f14391c;
    public final r0 d;
    public final f5.c f14392e;
    public volatile boolean h;
    public long f14395r;
    public com.google.android.exoplayer2.upstream.q f14396s;
    public b1 v;
    public boolean f14397w;
    public final r0 f14398x;
    public final o3.n f14393f = new Object();
    public boolean f14394n = true;

    public o0(r0 r0Var, Uri uri, com.google.android.exoplayer2.upstream.m mVar, l3.g0 g0Var, r0 r0Var2, f5.c cVar) {
        this.f14398x = r0Var;
        this.f14389a = uri;
        this.f14390b = new com.google.android.exoplayer2.upstream.x0(mVar);
        this.f14391c = g0Var;
        this.d = r0Var2;
        this.f14392e = cVar;
        p.f14399a.getAndIncrement();
        this.f14396s = b(0L);
    }

    @Override
    public final void a() {
        long j10;
        com.google.android.exoplayer2.upstream.m mVar;
        long j11;
        long j12;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            long j13 = -1;
            try {
                long j14 = this.f14393f.f19103a;
                com.google.android.exoplayer2.upstream.q b10 = b(j14);
                this.f14396s = b10;
                long open = this.f14390b.open(b10);
                if (open != -1) {
                    open += j14;
                    r0 r0Var = this.f14398x;
                    r0Var.B.post(new n0(r0Var, 2));
                }
                long j15 = open;
                this.f14398x.D = f4.b.a(this.f14390b.f3665a.getResponseHeaders());
                com.google.android.exoplayer2.upstream.x0 x0Var = this.f14390b;
                f4.b bVar = this.f14398x.D;
                if (bVar != null && (i10 = bVar.f6554f) != -1) {
                    mVar = new o(x0Var, i10, this);
                    b1 u10 = this.f14398x.u(new q0(0, true));
                    this.v = u10;
                    u10.b(r0.Z);
                } else {
                    mVar = x0Var;
                }
                this.f14391c.x(mVar, this.f14389a, this.f14390b.f3665a.getResponseHeaders(), j14, j15, this.d);
                if (this.f14398x.D != null) {
                    o3.k kVar = (o3.k) this.f14391c.f14097c;
                    if (kVar instanceof v3.d) {
                        ((v3.d) kVar).f49349r = true;
                    }
                }
                if (this.f14394n) {
                    l3.g0 g0Var = this.f14391c;
                    long j16 = this.f14395r;
                    o3.k kVar2 = (o3.k) g0Var.f14097c;
                    kVar2.getClass();
                    kVar2.f(j14, j16);
                    this.f14394n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        f5.c cVar = this.f14392e;
                        synchronized (cVar) {
                            while (!cVar.f6575a) {
                                cVar.wait();
                            }
                        }
                        l3.g0 g0Var2 = this.f14391c;
                        o3.n nVar = this.f14393f;
                        o3.k kVar3 = (o3.k) g0Var2.f14097c;
                        kVar3.getClass();
                        o3.h hVar = (o3.h) g0Var2.d;
                        hVar.getClass();
                        i11 = kVar3.d(hVar, nVar);
                        o3.h hVar2 = (o3.h) this.f14391c.d;
                        if (hVar2 != null) {
                            j12 = hVar2.d;
                        } else {
                            j12 = -1;
                        }
                        if (j12 > this.f14398x.f14415s + j14) {
                            this.f14392e.b();
                            r0 r0Var2 = this.f14398x;
                            r0Var2.B.post(r0Var2.A);
                            j14 = j12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else {
                    o3.h hVar3 = (o3.h) this.f14391c.d;
                    if (hVar3 != null) {
                        j11 = hVar3.d;
                    } else {
                        j11 = -1;
                    }
                    if (j11 != -1) {
                        o3.n nVar2 = this.f14393f;
                        if (hVar3 != null) {
                            j13 = hVar3.d;
                        }
                        nVar2.f19103a = j13;
                    }
                }
                m5.a(this.f14390b);
            } catch (Throwable th2) {
                if (i11 != 1) {
                    o3.h hVar4 = (o3.h) this.f14391c.d;
                    if (hVar4 != null) {
                        j10 = hVar4.d;
                    } else {
                        j10 = -1;
                    }
                    if (j10 != -1) {
                        o3.n nVar3 = this.f14393f;
                        if (hVar4 != null) {
                            j13 = hVar4.d;
                        }
                        nVar3.f19103a = j13;
                    }
                }
                m5.a(this.f14390b);
                throw th2;
            }
        }
    }

    public final com.google.android.exoplayer2.upstream.q b(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f14398x.f14414r;
        Map map2 = r0.Y;
        Uri uri = this.f14389a;
        f5.a.k(uri, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uri, 1, null, map2, j10, -1L, str, 6);
    }

    @Override
    public final void q() {
        this.h = true;
    }
}
