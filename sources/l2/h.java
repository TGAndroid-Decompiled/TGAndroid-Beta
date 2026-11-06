package l2;

import a8.ia;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class h implements t0 {
    public static final h9.t1 f17822r;
    public final e2.k1 f17823a;
    public final e2.i1 f17824b;
    public final b3.e f17825c;
    public final long d;
    public final long f17826e;
    public final long f17827f;
    public final long f17828g;
    public final long h;
    public final long f17829i;
    public final long f17830j;
    public final long f17831k;
    public final int f17832l;
    public final boolean f17833m;
    public final long f17834n;
    public final h9.l0 f17835o;
    public final ConcurrentHashMap f17836p;
    public long f17837q;

    static {
        h9.g0 g0Var = h9.i0.f14329b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        h9.o.e(6, objArr);
        f17822r = h9.i0.o(6, objArr);
    }

    public h(b3.e eVar, int i7, int i10, int i11, int i12, int i13, boolean z9, Map map) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(i7, i11, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i7, i13, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, i7, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f17823a = new e2.k1();
        this.f17824b = new e2.i1();
        this.f17825c = eVar;
        long j3 = 50000;
        this.d = h2.m0.S(j3);
        this.f17826e = h2.m0.S(i7);
        this.f17827f = h2.m0.S(j3);
        this.f17828g = h2.m0.S(j3);
        this.h = h2.m0.S(i10);
        this.f17829i = h2.m0.S(i11);
        this.f17830j = h2.m0.S(i12);
        this.f17831k = h2.m0.S(i13);
        this.f17832l = -1;
        this.f17833m = z9;
        this.f17834n = h2.m0.S(0);
        this.f17836p = new ConcurrentHashMap();
        this.f17835o = h9.l0.b(map);
        this.f17837q = -1L;
    }

    public static void a(int i7, int i10, String str, String str2) {
        boolean z9;
        if (i7 >= i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.i(z9, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(l2.s0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.b(l2.s0):boolean");
    }

    public final void c() {
        int i7 = 0;
        if (this.f17836p.isEmpty()) {
            b3.e eVar = this.f17825c;
            synchronized (eVar) {
                if (eVar.f2922a) {
                    eVar.d(0);
                }
            }
            return;
        }
        b3.e eVar2 = this.f17825c;
        for (g gVar : this.f17836p.values()) {
            i7 += gVar.f17817c;
        }
        eVar2.d(i7);
    }
}
