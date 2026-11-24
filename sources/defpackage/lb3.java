package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class lb3 {
    public static final w59 q;
    public final znb a;
    public final xnb b;
    public final af0 c;
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
    public final qm5 n;
    public final ConcurrentHashMap o;
    public long p;

    static {
        km5 km5Var = mm5.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        xpe.a(6, objArr);
        q = mm5.o(6, objArr);
    }

    public lb3(af0 af0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Map map) {
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
        this.a = new znb();
        this.b = new xnb();
        this.c = af0Var;
        this.d = g8c.T(i);
        this.e = g8c.T(i2);
        this.f = g8c.T(i3);
        this.g = g8c.T(i4);
        this.h = g8c.T(i5);
        this.i = g8c.T(i6);
        this.j = g8c.T(i7);
        this.k = g8c.T(i8);
        this.l = z;
        this.m = g8c.T(0L);
        this.o = new ConcurrentHashMap();
        this.n = qm5.b(map);
        this.p = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        gre.i(z, "%s cannot be less than %s", str, str2);
    }

    public final int b(uc8 uc8Var) {
        int i;
        kb3 kb3Var = (kb3) this.o.get(uc8Var);
        kb3Var.getClass();
        synchronized (kb3Var) {
            i = kb3Var.d;
        }
        return i << 16;
    }

    public final boolean c(defpackage.b86 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb3.c(b86):boolean");
    }

    public final void d() {
        boolean isEmpty = this.o.isEmpty();
        af0 af0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (af0Var) {
                af0Var.C(0);
            }
            return;
        }
        for (kb3 kb3Var : this.o.values()) {
            i += kb3Var.c;
        }
        af0Var.C(i);
    }
}
