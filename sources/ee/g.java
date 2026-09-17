package ee;
public final class g extends RuntimeException {
    public final transient id.h f9099a;

    public g(id.h hVar) {
        this.f9099a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f9099a.toString();
    }
}
