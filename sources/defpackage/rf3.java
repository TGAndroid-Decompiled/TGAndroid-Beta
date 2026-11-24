package defpackage;
public final class rf3 extends RuntimeException {
    public final transient cy2 a;

    public rf3(cy2 cy2Var) {
        this.a = cy2Var;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
