package de;

import java.util.concurrent.CancellationException;
public final class a extends CancellationException {
    public final transient Object f8671a;

    public a(ce.d dVar) {
        super("Flow was aborted, no more elements needed");
        this.f8671a = dVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
