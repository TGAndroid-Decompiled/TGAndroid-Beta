package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
public final class ec3 {
    public static final j99 q;
    public final zrb a;
    public final xrb b;
    public final cf0 c;
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
    public final to5 n;
    public final ConcurrentHashMap o;
    public long p;

    static {
        no5 no5Var = po5.b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        rue.a(6, objArr);
        q = po5.o(6, objArr);
    }

    public ec3(cf0 cf0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Map map) {
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
        this.a = new zrb();
        this.b = new xrb();
        this.c = cf0Var;
        this.d = gcc.T(i);
        this.e = gcc.T(i2);
        this.f = gcc.T(i3);
        this.g = gcc.T(i4);
        this.h = gcc.T(i5);
        this.i = gcc.T(i6);
        this.j = gcc.T(i7);
        this.k = gcc.T(i8);
        this.l = z;
        this.m = gcc.T(0L);
        this.o = new ConcurrentHashMap();
        this.n = to5.b(map);
        this.p = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        yve.i(z, "%s cannot be less than %s", str, str2);
    }

    public final int b(ig8 ig8Var) {
        int i;
        dc3 dc3Var = (dc3) this.o.get(ig8Var);
        dc3Var.getClass();
        synchronized (dc3Var) {
            i = dc3Var.d;
        }
        return i << 16;
    }

    public final boolean c(defpackage.fa6 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ec3.c(fa6):boolean");
    }

    public final void d() {
        boolean isEmpty = this.o.isEmpty();
        cf0 cf0Var = this.c;
        int i = 0;
        if (isEmpty) {
            synchronized (cf0Var) {
                cf0Var.C(0);
            }
            return;
        }
        for (dc3 dc3Var : this.o.values()) {
            i += dc3Var.c;
        }
        cf0Var.C(i);
    }
}
