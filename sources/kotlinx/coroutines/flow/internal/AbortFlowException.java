package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

public final class AbortFlowException extends CancellationException {
    public final transient Object owner;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.owner = obj;
    }

    @Override
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
