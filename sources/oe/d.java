package oe;
public final class d {
    public static final long[] f20905e = new long[0];
    public final me.d f20906a;
    public final c1.c f20907b;
    public long f20908c;
    public final long[] d;

    public d(me.d descriptor, c1.c cVar) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f20906a = descriptor;
        this.f20907b = cVar;
        int f10 = descriptor.f();
        if (f10 <= 64) {
            this.f20908c = f10 != 64 ? (-1) << f10 : 0L;
            this.d = f20905e;
            return;
        }
        this.f20908c = 0L;
        int i7 = (f10 - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((f10 & 63) != 0) {
            jArr[i7 - 1] = (-1) << f10;
        }
        this.d = jArr;
    }
}
