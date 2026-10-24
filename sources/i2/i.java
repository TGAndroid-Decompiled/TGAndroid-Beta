package i2;

import e9.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import v7.u6;
public final class i implements s0 {
    public static final x1 f12460r;
    public final b2.n1 f12461a;
    public final b2.l1 f12462b;
    public final y2.d f12463c;
    public final long d;
    public final long e;
    public final long f12464f;
    public final long f12465g;
    public final long h;
    public final long f12466i;
    public final long f12467j;
    public final long f12468k;
    public final int f12469l;
    public final boolean f12470m;
    public final long f12471n;
    public final e9.q0 f12472o;
    public final ConcurrentHashMap f12473p;
    public long f12474q;

    static {
        e9.l0 l0Var = e9.n0.f8481b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        e9.s.d(6, objArr);
        f12460r = e9.n0.s(6, objArr);
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
        this.f12461a = new b2.n1();
        this.f12462b = new b2.l1();
        this.f12463c = dVar;
        long j10 = 50000;
        this.d = e2.m0.S(j10);
        this.e = e2.m0.S(i10);
        this.f12464f = e2.m0.S(j10);
        this.f12465g = e2.m0.S(j10);
        this.h = e2.m0.S(i11);
        this.f12466i = e2.m0.S(i12);
        this.f12467j = e2.m0.S(i13);
        this.f12468k = e2.m0.S(i14);
        this.f12469l = -1;
        this.f12470m = z10;
        this.f12471n = e2.m0.S(0);
        this.f12473p = new ConcurrentHashMap();
        this.f12472o = e9.q0.a(map);
        this.f12474q = -1L;
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

    public final boolean b(i2.r0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.i.b(i2.r0):boolean");
    }

    public final void c() {
        int i10 = 0;
        if (this.f12473p.isEmpty()) {
            y2.d dVar = this.f12463c;
            synchronized (dVar) {
                if (dVar.f50343a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f12463c;
        for (h hVar : this.f12473p.values()) {
            i10 += hVar.f12410c;
        }
        dVar2.d(i10);
    }
}
