package defpackage;
public class qq2 {
    public static final long b = fy.a.objectFieldOffset(qq2.class.getDeclaredField("_handled$volatile"));
    private volatile int _handled$volatile;
    public final Throwable a;

    public qq2(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
