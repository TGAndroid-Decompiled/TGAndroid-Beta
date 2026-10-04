package ee;
public final class g extends RuntimeException {
    public final transient id.h f8872a;

    public g(id.h hVar) {
        this.f8872a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f8872a.toString();
    }
}
