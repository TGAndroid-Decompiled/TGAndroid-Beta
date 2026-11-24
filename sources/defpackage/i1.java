package defpackage;

import java.util.concurrent.CancellationException;
public final class i1 extends CancellationException {
    public final transient jm4 a;

    public i1(jm4 jm4Var) {
        super("Flow was aborted, no more elements needed");
        this.a = jm4Var;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
