package nd;

public final class g extends RuntimeException {

    public final transient rc.h f18485a;

    public g(rc.h hVar) {
        this.f18485a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f18485a.toString();
    }
}
