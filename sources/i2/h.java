package i2;

import e9.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import v7.u6;
public final class h implements r0 {
    public static final x1 f12420r;
    public final b2.n1 f12421a;
    public final b2.l1 f12422b;
    public final y2.d f12423c;
    public final long d;
    public final long e;
    public final long f12424f;
    public final long f12425g;
    public final long h;
    public final long f12426i;
    public final long f12427j;
    public final long f12428k;
    public final int f12429l;
    public final boolean f12430m;
    public final long f12431n;
    public final e9.q0 f12432o;
    public final ConcurrentHashMap f12433p;
    public long f12434q;

    static {
        e9.l0 l0Var = e9.n0.f8476b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        e9.s.d(6, objArr);
        f12420r = e9.n0.s(6, objArr);
    }

    public h(y2.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, Map map) {
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
        this.f12421a = new b2.n1();
        this.f12422b = new b2.l1();
        this.f12423c = dVar;
        long j10 = 50000;
        this.d = e2.m0.S(j10);
        this.e = e2.m0.S(i10);
        this.f12424f = e2.m0.S(j10);
        this.f12425g = e2.m0.S(j10);
        this.h = e2.m0.S(i11);
        this.f12426i = e2.m0.S(i12);
        this.f12427j = e2.m0.S(i13);
        this.f12428k = e2.m0.S(i14);
        this.f12429l = -1;
        this.f12430m = z10;
        this.f12431n = e2.m0.S(0);
        this.f12433p = new ConcurrentHashMap();
        this.f12432o = e9.q0.a(map);
        this.f12434q = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.i(z10, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(i2.q0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.h.b(i2.q0):boolean");
    }

    public final void c() {
        int i10 = 0;
        if (this.f12433p.isEmpty()) {
            y2.d dVar = this.f12423c;
            synchronized (dVar) {
                if (dVar.f49916a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f12423c;
        for (g gVar : this.f12433p.values()) {
            i10 += gVar.f12376c;
        }
        dVar2.d(i10);
    }
}
