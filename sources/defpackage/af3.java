package defpackage;
public final class af3 extends RuntimeException {
    public final transient mx2 a;

    public af3(mx2 mx2Var) {
        this.a = mx2Var;
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
