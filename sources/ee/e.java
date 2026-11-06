package ee;
public final class e extends RuntimeException {
    public final transient id.h f10773a;

    public e(id.h hVar) {
        this.f10773a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f10773a.toString();
    }
}
