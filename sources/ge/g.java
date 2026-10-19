package ge;
public final class g extends RuntimeException {
    public final transient kd.h f11021a;

    public g(kd.h hVar) {
        this.f11021a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f11021a.toString();
    }
}
