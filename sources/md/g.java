package md;
public final class g extends RuntimeException {
    public final transient qc.h f17649a;

    public g(qc.h hVar) {
        this.f17649a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f17649a.toString();
    }
}
