package l2;

import a8.ma;
import h9.s1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class i implements r0 {
    public static final s1 f19488r;
    public final e2.k1 f19489a;
    public final e2.i1 f19490b;
    public final b3.e f19491c;
    public final long d;
    public final long f19492e;
    public final long f19493f;
    public final long f19494g;
    public final long h;
    public final long f19495i;
    public final long f19496j;
    public final long f19497k;
    public final int f19498l;
    public final boolean f19499m;
    public final long f19500n;
    public final h9.l0 f19501o;
    public final ConcurrentHashMap f19502p;
    public long f19503q;

    static {
        h9.g0 g0Var = h9.i0.f13995b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        h9.o.e(6, objArr);
        f19488r = h9.i0.o(6, objArr);
    }

    public i(b3.e eVar, int i7, int i10, int i11, int i12, int i13, boolean z10, Map map) {
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
        this.f19489a = new e2.k1();
        this.f19490b = new e2.i1();
        this.f19491c = eVar;
        long j3 = 50000;
        this.d = h2.l0.S(j3);
        this.f19492e = h2.l0.S(i7);
        this.f19493f = h2.l0.S(j3);
        this.f19494g = h2.l0.S(j3);
        this.h = h2.l0.S(i10);
        this.f19495i = h2.l0.S(i11);
        this.f19496j = h2.l0.S(i12);
        this.f19497k = h2.l0.S(i13);
        this.f19498l = -1;
        this.f19499m = z10;
        this.f19500n = h2.l0.S(0);
        this.f19502p = new ConcurrentHashMap();
        this.f19501o = h9.l0.b(map);
        this.f19503q = -1L;
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

    public final boolean b(l2.q0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: l2.i.b(l2.q0):boolean");
    }

    public final void c() {
        int i7 = 0;
        if (this.f19502p.isEmpty()) {
            b3.e eVar = this.f19491c;
            synchronized (eVar) {
                if (eVar.f2842a) {
                    eVar.d(0);
                }
            }
            return;
        }
        b3.e eVar2 = this.f19491c;
        for (h hVar : this.f19502p.values()) {
            i7 += hVar.f19466c;
        }
        eVar2.d(i7);
    }
}
