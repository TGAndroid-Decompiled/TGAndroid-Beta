package ee;
public final class g extends RuntimeException {
    public final transient id.h f9071a;

    public g(id.h hVar) {
        this.f9071a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f9071a.toString();
    }
}
