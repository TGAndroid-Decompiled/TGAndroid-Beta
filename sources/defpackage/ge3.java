package defpackage;
public final class ge3 extends RuntimeException {
    public final transient sw2 a;

    public ge3(sw2 sw2Var) {
        this.a = sw2Var;
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
