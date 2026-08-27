package md;

import ia.v;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException {

    public final transient v f18020a;

    public a(v vVar) {
        super("Flow was aborted, no more elements needed");
        this.f18020a = vVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
