package i2;

import a8.yb;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class i implements u0 {
    public static final f9.s1 f13558r;
    public final b2.o1 f13559a;
    public final b2.m1 f13560b;
    public final y2.d f13561c;
    public final long d;
    public final long e;
    public final long f13562f;
    public final long f13563g;
    public final long h;
    public final long f13564i;
    public final long f13565j;
    public final long f13566k;
    public final int f13567l;
    public final boolean f13568m;
    public final long f13569n;
    public final f9.l0 f13570o;
    public final ConcurrentHashMap f13571p;
    public long f13572q;

    static {
        f9.g0 g0Var = f9.i0.f10287b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        f9.o.d(6, objArr);
        f13558r = f9.i0.s(6, objArr);
    }

    public i(y2.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, Map map) {
        a(i11, 0, "bufferForPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i14, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, i11, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i12, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i10, i14, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, i10, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f13559a = new b2.o1();
        this.f13560b = new b2.m1();
        this.f13561c = dVar;
        long j10 = 50000;
        this.d = e2.n0.S(j10);
        this.e = e2.n0.S(i10);
        this.f13562f = e2.n0.S(j10);
        this.f13563g = e2.n0.S(j10);
        this.h = e2.n0.S(i11);
        this.f13564i = e2.n0.S(i12);
        this.f13565j = e2.n0.S(i13);
        this.f13566k = e2.n0.S(i14);
        this.f13567l = -1;
        this.f13568m = z10;
        this.f13569n = e2.n0.S(0);
        this.f13571p = new ConcurrentHashMap();
        this.f13570o = f9.l0.a(map);
        this.f13572q = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.i(z10, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(i2.t0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.i.b(i2.t0):boolean");
    }

    public final void c() {
        int i10 = 0;
        if (this.f13571p.isEmpty()) {
            y2.d dVar = this.f13561c;
            synchronized (dVar) {
                if (dVar.f51930a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f13561c;
        for (h hVar : this.f13571p.values()) {
            i10 += hVar.f13552c;
        }
        dVar2.d(i10);
    }
}
