package i2;

import e9.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import v7.u6;
public final class i implements t0 {
    public static final x1 f11024r;
    public final b2.o1 f11025a;
    public final b2.m1 f11026b;
    public final y2.d f11027c;
    public final long d;
    public final long e;
    public final long f11028f;
    public final long f11029g;
    public final long h;
    public final long f11030i;
    public final long f11031j;
    public final long f11032k;
    public final int f11033l;
    public final boolean f11034m;
    public final long f11035n;
    public final e9.q0 f11036o;
    public final ConcurrentHashMap f11037p;
    public long f11038q;

    static {
        e9.l0 l0Var = e9.n0.f8592b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        e9.s.d(6, objArr);
        f11024r = e9.n0.s(6, objArr);
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
        this.f11025a = new b2.o1();
        this.f11026b = new b2.m1();
        this.f11027c = dVar;
        long j10 = 50000;
        this.d = e2.m0.S(j10);
        this.e = e2.m0.S(i10);
        this.f11028f = e2.m0.S(j10);
        this.f11029g = e2.m0.S(j10);
        this.h = e2.m0.S(i11);
        this.f11030i = e2.m0.S(i12);
        this.f11031j = e2.m0.S(i13);
        this.f11032k = e2.m0.S(i14);
        this.f11033l = -1;
        this.f11034m = z10;
        this.f11035n = e2.m0.S(0);
        this.f11037p = new ConcurrentHashMap();
        this.f11036o = e9.q0.a(map);
        this.f11038q = -1L;
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
        throw new UnsupportedOperationException("Method not decompiled: i2.i.b(i2.s0):boolean");
    }

    public final void c() {
        int i10 = 0;
        if (this.f11037p.isEmpty()) {
            y2.d dVar = this.f11027c;
            synchronized (dVar) {
                if (dVar.f48512a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f11027c;
        for (h hVar : this.f11037p.values()) {
            i10 += hVar.f10980c;
        }
        dVar2.d(i10);
    }
}
