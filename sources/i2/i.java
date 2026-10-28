package i2;

import a8.yb;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class i implements u0 {
    public static final f9.s1 f13557r;
    public final b2.o1 f13558a;
    public final b2.m1 f13559b;
    public final y2.d f13560c;
    public final long d;
    public final long e;
    public final long f13561f;
    public final long f13562g;
    public final long h;
    public final long f13563i;
    public final long f13564j;
    public final long f13565k;
    public final int f13566l;
    public final boolean f13567m;
    public final long f13568n;
    public final f9.l0 f13569o;
    public final ConcurrentHashMap f13570p;
    public long f13571q;

    static {
        f9.g0 g0Var = f9.i0.f10286b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        f9.o.d(6, objArr);
        f13557r = f9.i0.s(6, objArr);
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
        this.f13558a = new b2.o1();
        this.f13559b = new b2.m1();
        this.f13560c = dVar;
        long j10 = 50000;
        this.d = e2.n0.S(j10);
        this.e = e2.n0.S(i10);
        this.f13561f = e2.n0.S(j10);
        this.f13562g = e2.n0.S(j10);
        this.h = e2.n0.S(i11);
        this.f13563i = e2.n0.S(i12);
        this.f13564j = e2.n0.S(i13);
        this.f13565k = e2.n0.S(i14);
        this.f13566l = -1;
        this.f13567m = z10;
        this.f13568n = e2.n0.S(0);
        this.f13570p = new ConcurrentHashMap();
        this.f13569o = f9.l0.a(map);
        this.f13571q = -1L;
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
        if (this.f13570p.isEmpty()) {
            y2.d dVar = this.f13560c;
            synchronized (dVar) {
                if (dVar.f51991a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f13560c;
        for (h hVar : this.f13570p.values()) {
            i10 += hVar.f13551c;
        }
        dVar2.d(i10);
    }
}
