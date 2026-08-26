package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

public final class DiagnosticCoroutineContextException extends RuntimeException {
    public final transient CoroutineContext context;

    public DiagnosticCoroutineContextException(CoroutineContext coroutineContext) {
        this.context = coroutineContext;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getLocalizedMessage() {
        return this.context.toString();
    }
}
