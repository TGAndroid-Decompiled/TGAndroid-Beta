package l2;

import a8.ma;
import h9.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class h implements q0 {
    public static final t1 f19384r;
    public final e2.k1 f19385a;
    public final e2.i1 f19386b;
    public final b3.e f19387c;
    public final long d;
    public final long f19388e;
    public final long f19389f;
    public final long f19390g;
    public final long h;
    public final long f19391i;
    public final long f19392j;
    public final long f19393k;
    public final int f19394l;
    public final boolean f19395m;
    public final long f19396n;
    public final h9.l0 f19397o;
    public final ConcurrentHashMap f19398p;
    public long f19399q;

    static {
        h9.g0 g0Var = h9.i0.f13998b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        h9.o.e(6, objArr);
        f19384r = h9.i0.o(6, objArr);
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
        this.f19385a = new e2.k1();
        this.f19386b = new e2.i1();
        this.f19387c = eVar;
        long j3 = 50000;
        this.d = h2.l0.S(j3);
        this.f19388e = h2.l0.S(i7);
        this.f19389f = h2.l0.S(j3);
        this.f19390g = h2.l0.S(j3);
        this.h = h2.l0.S(i10);
        this.f19391i = h2.l0.S(i11);
        this.f19392j = h2.l0.S(i12);
        this.f19393k = h2.l0.S(i13);
        this.f19394l = -1;
        this.f19395m = z10;
        this.f19396n = h2.l0.S(0);
        this.f19398p = new ConcurrentHashMap();
        this.f19397o = h9.l0.b(map);
        this.f19399q = -1L;
    }

    public static void a(int i7, int i10, String str, String str2) {
        boolean z10;
        if (i7 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.i(z10, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(l2.p0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.b(l2.p0):boolean");
    }

    public final void c() {
        int i7 = 0;
        if (this.f19398p.isEmpty()) {
            b3.e eVar = this.f19387c;
            synchronized (eVar) {
                if (eVar.f2841a) {
                    eVar.d(0);
                }
            }
            return;
        }
        b3.e eVar2 = this.f19387c;
        for (g gVar : this.f19398p.values()) {
            i7 += gVar.f19362c;
        }
        eVar2.d(i7);
    }
}
