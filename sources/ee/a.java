package ee;

import java.util.concurrent.CancellationException;
public final class a extends CancellationException {
    public final transient de.j f8898a;

    public a(de.j jVar) {
        super("Flow was aborted, no more elements needed");
        this.f8898a = jVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
