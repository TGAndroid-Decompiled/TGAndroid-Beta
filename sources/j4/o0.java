package j4;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class o0 implements com.google.android.exoplayer2.upstream.n0 {

    public final Uri f12630a;

    public final com.google.android.exoplayer2.upstream.x0 f12631b;

    public final a5.n f12632c;
    public final r0 d;

    public final d5.c f12633e;
    public volatile boolean h;

    public long f12636r;

    public com.google.android.exoplayer2.upstream.q f12637s;
    public a1 v;

    public boolean f12638w;

    public final r0 f12639x;

    public final m3.n f12634f = new m3.n();

    public boolean f12635n = true;

    public o0(r0 r0Var, Uri uri, com.google.android.exoplayer2.upstream.m mVar, a5.n nVar, r0 r0Var2, d5.c cVar) {
        this.f12639x = r0Var;
        this.f12630a = uri;
        this.f12631b = new com.google.android.exoplayer2.upstream.x0(mVar);
        this.f12632c = nVar;
        this.d = r0Var2;
        this.f12633e = cVar;
        p.f12640a.getAndIncrement();
        this.f12637s = b(0L);
    }

    @Override
    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: j4.o0.a():void");
    }

    public final com.google.android.exoplayer2.upstream.q b(long j10) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = r0.X;
        Uri uri = this.f12630a;
        d5.a.k(uri, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uri, 1, null, map2, j10, -1L, null, 6);
    }

    @Override
    public final void l() {
        this.h = true;
    }
}
