package ge;
public final class g extends RuntimeException {
    public final transient kd.h f10118a;

    public g(kd.h hVar) {
        this.f10118a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f10118a.toString();
    }
}
