package a8;
public abstract class jd {
    public static final jd.e a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new jd.e(exception);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof jd.e)) {
            return;
        }
        throw ((jd.e) obj).f15574a;
    }
}
