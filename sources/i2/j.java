package i2;

import e9.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import v7.u6;
public final class j implements t0 {
    public static final x1 f12433r;
    public final b2.n1 f12434a;
    public final b2.l1 f12435b;
    public final y2.d f12436c;
    public final long d;
    public final long e;
    public final long f12437f;
    public final long f12438g;
    public final long h;
    public final long f12439i;
    public final long f12440j;
    public final long f12441k;
    public final int f12442l;
    public final boolean f12443m;
    public final long f12444n;
    public final e9.q0 f12445o;
    public final ConcurrentHashMap f12446p;
    public long f12447q;

    static {
        e9.l0 l0Var = e9.n0.f8476b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        e9.s.d(6, objArr);
        f12433r = e9.n0.s(6, objArr);
    }

    public j(y2.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, Map map) {
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
        this.f12434a = new b2.n1();
        this.f12435b = new b2.l1();
        this.f12436c = dVar;
        long j10 = 50000;
        this.d = e2.m0.S(j10);
        this.e = e2.m0.S(i10);
        this.f12437f = e2.m0.S(j10);
        this.f12438g = e2.m0.S(j10);
        this.h = e2.m0.S(i11);
        this.f12439i = e2.m0.S(i12);
        this.f12440j = e2.m0.S(i13);
        this.f12441k = e2.m0.S(i14);
        this.f12442l = -1;
        this.f12443m = z10;
        this.f12444n = e2.m0.S(0);
        this.f12446p = new ConcurrentHashMap();
        this.f12445o = e9.q0.a(map);
        this.f12447q = -1L;
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

    public final boolean b(i2.s0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.j.b(i2.s0):boolean");
    }

    public final void c() {
        int i10 = 0;
        if (this.f12446p.isEmpty()) {
            y2.d dVar = this.f12436c;
            synchronized (dVar) {
                if (dVar.f49893a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f12436c;
        for (i iVar : this.f12446p.values()) {
            i10 += iVar.f12383c;
        }
        dVar2.d(i10);
    }
}
