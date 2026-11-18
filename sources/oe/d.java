package oe;
public final class d {
    public static final long[] f21794e = new long[0];
    public final me.d f21795a;
    public final c1.d f21796b;
    public long f21797c;
    public final long[] d;

    public d(me.d descriptor, c1.d dVar) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f21795a = descriptor;
        this.f21796b = dVar;
        int f10 = descriptor.f();
        if (f10 <= 64) {
            this.f21797c = f10 != 64 ? (-1) << f10 : 0L;
            this.d = f21794e;
            return;
        }
        this.f21797c = 0L;
        int i7 = (f10 - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((f10 & 63) != 0) {
            jArr[i7 - 1] = (-1) << f10;
        }
        this.d = jArr;
    }
}
