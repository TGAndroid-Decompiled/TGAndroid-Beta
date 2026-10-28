package he;
public final class g extends RuntimeException {
    public final transient ld.h f12799a;

    public g(ld.h hVar) {
        this.f12799a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f12799a.toString();
    }
}
