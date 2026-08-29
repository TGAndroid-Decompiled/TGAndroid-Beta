package od;
public final class g extends RuntimeException {
    public final transient sc.h f19512a;

    public g(sc.h hVar) {
        this.f19512a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f19512a.toString();
    }
}
