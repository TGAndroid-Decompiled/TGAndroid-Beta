package fe;

import ab.u;
import java.util.concurrent.CancellationException;
public final class a extends CancellationException {
    public final transient u f10582a;

    public a(u uVar) {
        super("Flow was aborted, no more elements needed");
        this.f10582a = uVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
