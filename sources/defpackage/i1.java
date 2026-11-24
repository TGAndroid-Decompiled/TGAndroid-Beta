package defpackage;

import java.util.concurrent.CancellationException;
public final class i1 extends CancellationException {
    public final transient ik4 a;

    public i1(ik4 ik4Var) {
        super("Flow was aborted, no more elements needed");
        this.a = ik4Var;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
