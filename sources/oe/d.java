package oe;
public final class d {
    public static final long[] f20910e = new long[0];
    public final me.d f20911a;
    public final c1.c f20912b;
    public long f20913c;
    public final long[] d;

    public d(me.d descriptor, c1.c cVar) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f20911a = descriptor;
        this.f20912b = cVar;
        int f10 = descriptor.f();
        if (f10 <= 64) {
            this.f20913c = f10 != 64 ? (-1) << f10 : 0L;
            this.d = f20910e;
            return;
        }
        this.f20913c = 0L;
        int i7 = (f10 - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((f10 & 63) != 0) {
            jArr[i7 - 1] = (-1) << f10;
        }
        this.d = jArr;
    }
}
