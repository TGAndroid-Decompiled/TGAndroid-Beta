package ae;

import java.util.concurrent.CancellationException;
public final class a extends CancellationException {
    public final transient Object f383a;

    public a(zd.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f383a = cVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
