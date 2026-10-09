package fe;
public final class g extends RuntimeException {
    public final transient jd.h f9894a;

    public g(jd.h hVar) {
        this.f9894a = hVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.f9894a.toString();
    }
}
