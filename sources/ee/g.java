package ee;
public final class g extends RuntimeException {
    public final transient id.h f7481a;

    public g(id.h hVar) {
        this.f7481a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f7481a.toString();
    }
}
