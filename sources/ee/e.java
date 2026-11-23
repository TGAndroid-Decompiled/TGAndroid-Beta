package ee;
public final class e extends RuntimeException {
    public final transient id.h f10956a;

    public e(id.h hVar) {
        this.f10956a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f10956a.toString();
    }
}
