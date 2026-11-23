package ee;
public final class e extends RuntimeException {
    public final transient id.h f10919a;

    public e(id.h hVar) {
        this.f10919a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f10919a.toString();
    }
}
