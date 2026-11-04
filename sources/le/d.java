package le;
public final class d {
    public static final long[] f18183e = new long[0];
    public final je.d f18184a;
    public final c1.c f18185b;
    public long f18186c;
    public final long[] d;

    public d(je.d descriptor, c1.c cVar) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.f18184a = descriptor;
        this.f18185b = cVar;
        int f10 = descriptor.f();
        if (f10 <= 64) {
            this.f18186c = f10 != 64 ? (-1) << f10 : 0L;
            this.d = f18183e;
            return;
        }
        this.f18186c = 0L;
        int i3 = (f10 - 1) >>> 6;
        long[] jArr = new long[i3];
        if ((f10 & 63) != 0) {
            jArr[i3 - 1] = (-1) << f10;
        }
        this.d = jArr;
    }
}
