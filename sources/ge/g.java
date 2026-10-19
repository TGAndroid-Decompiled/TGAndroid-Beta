package ge;
public final class g extends RuntimeException {
    public final transient kd.h f11023a;

    public g(kd.h hVar) {
        this.f11023a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f11023a.toString();
    }
}
