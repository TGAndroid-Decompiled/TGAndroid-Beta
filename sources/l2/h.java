package l2;

import a8.ia;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class h implements t0 {
    public static final h9.t1 f17826r;
    public final e2.k1 f17827a;
    public final e2.i1 f17828b;
    public final b3.e f17829c;
    public final long d;
    public final long f17830e;
    public final long f17831f;
    public final long f17832g;
    public final long h;
    public final long f17833i;
    public final long f17834j;
    public final long f17835k;
    public final int f17836l;
    public final boolean f17837m;
    public final long f17838n;
    public final h9.l0 f17839o;
    public final ConcurrentHashMap f17840p;
    public long f17841q;

    static {
        h9.g0 g0Var = h9.i0.f14331b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        h9.o.e(6, objArr);
        f17826r = h9.i0.o(6, objArr);
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
        this.f17827a = new e2.k1();
        this.f17828b = new e2.i1();
        this.f17829c = eVar;
        long j3 = 50000;
        this.d = h2.m0.S(j3);
        this.f17830e = h2.m0.S(i7);
        this.f17831f = h2.m0.S(j3);
        this.f17832g = h2.m0.S(j3);
        this.h = h2.m0.S(i10);
        this.f17833i = h2.m0.S(i11);
        this.f17834j = h2.m0.S(i12);
        this.f17835k = h2.m0.S(i13);
        this.f17836l = -1;
        this.f17837m = z9;
        this.f17838n = h2.m0.S(0);
        this.f17840p = new ConcurrentHashMap();
        this.f17839o = h9.l0.b(map);
        this.f17841q = -1L;
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
        if (this.f17840p.isEmpty()) {
            b3.e eVar = this.f17829c;
            synchronized (eVar) {
                if (eVar.f2922a) {
                    eVar.d(0);
                }
            }
            return;
        }
        b3.e eVar2 = this.f17829c;
        for (g gVar : this.f17840p.values()) {
            i7 += gVar.f17821c;
        }
        eVar2.d(i7);
    }
}
