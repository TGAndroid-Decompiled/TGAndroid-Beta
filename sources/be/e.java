package be;
public final class e extends RuntimeException {
    public final transient fd.h f3261a;

    public e(fd.h hVar) {
        this.f3261a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f3261a.toString();
    }
}
