package i2;

import e9.x1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import v7.t6;
public final class h implements u0 {
    public static final x1 f7871r;
    public final b2.n1 f7872a;
    public final b2.l1 f7873b;
    public final y2.d f7874c;
    public final long d;
    public final long e;
    public final long f7875f;
    public final long f7876g;
    public final long h;
    public final long f7877i;
    public final long f7878j;
    public final long f7879k;
    public final int f7880l;
    public final boolean f7881m;
    public final long f7882n;
    public final e9.q0 f7883o;
    public final ConcurrentHashMap f7884p;
    public long f7885q;

    static {
        e9.l0 l0Var = e9.n0.f6390b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        e9.s.d(6, objArr);
        f7871r = e9.n0.s(6, objArr);
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
        this.f7872a = new b2.n1();
        this.f7873b = new b2.l1();
        this.f7874c = dVar;
        long j10 = 50000;
        this.d = e2.l0.S(j10);
        this.e = e2.l0.S(i10);
        this.f7875f = e2.l0.S(j10);
        this.f7876g = e2.l0.S(j10);
        this.h = e2.l0.S(i11);
        this.f7877i = e2.l0.S(i12);
        this.f7878j = e2.l0.S(i13);
        this.f7879k = e2.l0.S(i14);
        this.f7880l = -1;
        this.f7881m = z10;
        this.f7882n = e2.l0.S(0);
        this.f7884p = new ConcurrentHashMap();
        this.f7883o = e9.q0.a(map);
        this.f7885q = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.i(z10, "%s cannot be less than %s", str, str2);
    }

    public final boolean b(i2.t0 r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.h.b(i2.t0):boolean");
    }

    public final void c() {
        int i10 = 0;
        if (this.f7884p.isEmpty()) {
            y2.d dVar = this.f7874c;
            synchronized (dVar) {
                if (dVar.f54154a) {
                    dVar.d(0);
                }
            }
            return;
        }
        y2.d dVar2 = this.f7874c;
        for (g gVar : this.f7884p.values()) {
            i10 += gVar.f7864c;
        }
        dVar2.d(i10);
    }
}
