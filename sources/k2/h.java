package k2;

import b8.zb;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class h implements t0 {
    public static final g9.s1 f16512r;
    public final d2.m1 f16513a;
    public final d2.k1 f16514b;
    public final a3.e f16515c;
    public final long d;
    public final long f16516e;
    public final long f16517f;
    public final long f16518g;
    public final long h;
    public final long f16519i;
    public final long f16520j;
    public final long f16521k;
    public final int f16522l;
    public final boolean f16523m;
    public final long f16524n;
    public final g9.l0 f16525o;
    public final ConcurrentHashMap f16526p;
    public long f16527q;

    static {
        g9.g0 g0Var = g9.i0.f12083b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        g9.o.e(6, objArr);
        f16512r = g9.i0.o(6, objArr);
    }

    public h(a3.e eVar, int i3, int i10, int i11, int i12, int i13, boolean z10, Map map) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(i3, i11, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i13, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, i3, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f16513a = new d2.m1();
        this.f16514b = new d2.k1();
        this.f16515c = eVar;
        long j10 = 50000;
        this.d = g2.n0.S(j10);
        this.f16516e = g2.n0.S(i3);
        this.f16517f = g2.n0.S(j10);
        this.f16518g = g2.n0.S(j10);
        this.h = g2.n0.S(i10);
        this.f16519i = g2.n0.S(i11);
        this.f16520j = g2.n0.S(i12);
        this.f16521k = g2.n0.S(i13);
        this.f16522l = -1;
        this.f16523m = z10;
        this.f16524n = g2.n0.S(0);
        this.f16526p = new ConcurrentHashMap();
        this.f16525o = g9.l0.b(map);
        this.f16527q = -1L;
    }

    public static void a(int i3, int i10, String str, String str2) {
        boolean z10;
        if (i3 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.i(z10, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(k2.s0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: k2.h.b(k2.s0):boolean");
    }

    public final void c() {
        int i3 = 0;
        if (this.f16526p.isEmpty()) {
            a3.e eVar = this.f16515c;
            synchronized (eVar) {
                if (eVar.f64a) {
                    eVar.d(0);
                }
            }
            return;
        }
        a3.e eVar2 = this.f16515c;
        for (g gVar : this.f16526p.values()) {
            i3 += gVar.f16506c;
        }
        eVar2.d(i3);
    }
}
