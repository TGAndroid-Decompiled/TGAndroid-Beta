package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class xc3 {
    public static final y79 q;
    public final aqb a;
    public final ypb b;
    public final ag0 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public final long m;
    public final qo5 n;
    public final ConcurrentHashMap o;
    public long p;

    static {
        ko5 ko5Var = mo5.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        ase.a(6, objArr);
        q = mo5.o(6, objArr);
    }

    public xc3(ag0 ag0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Map map) {
        a(i5, 0, "bufferForPlaybackMs", "0");
        a(i6, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i8, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(i, i5, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i6, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(i, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i8, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(i3, i, "maxBufferMs", "minBufferMs");
        a(i4, i2, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = new aqb();
        this.b = new ypb();
        this.c = ag0Var;
        this.d = hac.T(i);
        this.e = hac.T(i2);
        this.f = hac.T(i3);
        this.g = hac.T(i4);
        this.h = hac.T(i5);
        this.i = hac.T(i6);
        this.j = hac.T(i7);
        this.k = hac.T(i8);
        this.l = z;
        this.m = hac.T(0L);
        this.o = new ConcurrentHashMap();
        this.n = qo5.b(map);
        this.p = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        jte.i(z, "%s cannot be less than %s", str, str2);
    }

    public final int b(we8 we8Var) {
        int i;
        wc3 wc3Var = (wc3) this.o.get(we8Var);
        wc3Var.getClass();
        synchronized (wc3Var) {
            i = wc3Var.d;
        }
        return i << 16;
    }

    public final boolean c(defpackage.aa6 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc3.c(aa6):boolean");
    }

    public final void d() {
        boolean isEmpty = this.o.isEmpty();
        ag0 ag0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (ag0Var) {
                ag0Var.C(0);
            }
            return;
        }
        for (wc3 wc3Var : this.o.values()) {
            i += wc3Var.c;
        }
        ag0Var.C(i);
    }
}
