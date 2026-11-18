package b7;
public abstract class h {
    public static ClassLoader f2957a;
    public static Thread f2958b;

    public static final gd.f a(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        return new gd.f(exception);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof gd.f)) {
            return;
        }
        throw ((gd.f) obj).f13476a;
    }

    public static synchronized java.lang.ClassLoader c() {
        throw new UnsupportedOperationException("Method not decompiled: b7.h.c():java.lang.ClassLoader");
    }
}
