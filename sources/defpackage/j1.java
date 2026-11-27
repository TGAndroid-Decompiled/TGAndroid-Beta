package defpackage;

import java.util.concurrent.CancellationException;
public final class j1 extends CancellationException {
    public final transient nm4 a;

    public j1(nm4 nm4Var) {
        super("Flow was aborted, no more elements needed");
        this.a = nm4Var;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
