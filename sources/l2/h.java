package l2;

import a8.la;
import h9.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class h implements q0 {
    public static final t1 f19387r;
    public final e2.k1 f19388a;
    public final e2.i1 f19389b;
    public final b3.e f19390c;
    public final long d;
    public final long f19391e;
    public final long f19392f;
    public final long f19393g;
    public final long h;
    public final long f19394i;
    public final long f19395j;
    public final long f19396k;
    public final int f19397l;
    public final boolean f19398m;
    public final long f19399n;
    public final h9.l0 f19400o;
    public final ConcurrentHashMap f19401p;
    public long f19402q;

    static {
        h9.g0 g0Var = h9.i0.f14003b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        h9.o.e(6, objArr);
        f19387r = h9.i0.o(6, objArr);
    }

    public h(b3.e eVar, int i7, int i10, int i11, int i12, int i13, boolean z10, Map map) {
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
        this.f19388a = new e2.k1();
        this.f19389b = new e2.i1();
        this.f19390c = eVar;
        long j3 = 50000;
        this.d = h2.l0.S(j3);
        this.f19391e = h2.l0.S(i7);
        this.f19392f = h2.l0.S(j3);
        this.f19393g = h2.l0.S(j3);
        this.h = h2.l0.S(i10);
        this.f19394i = h2.l0.S(i11);
        this.f19395j = h2.l0.S(i12);
        this.f19396k = h2.l0.S(i13);
        this.f19397l = -1;
        this.f19398m = z10;
        this.f19399n = h2.l0.S(0);
        this.f19401p = new ConcurrentHashMap();
        this.f19400o = h9.l0.b(map);
        this.f19402q = -1L;
    }

    public static void a(int i7, int i10, String str, String str2) {
        boolean z10;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.i(z10, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(l2.p0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.b(l2.p0):boolean");
    }

    public final void c() {
        int i7 = 0;
        if (this.f19401p.isEmpty()) {
            b3.e eVar = this.f19390c;
            synchronized (eVar) {
                if (eVar.f2871a) {
                    eVar.d(0);
                }
            }
            return;
        }
        b3.e eVar2 = this.f19390c;
        for (g gVar : this.f19401p.values()) {
            i7 += gVar.f19365c;
        }
        eVar2.d(i7);
    }
}
