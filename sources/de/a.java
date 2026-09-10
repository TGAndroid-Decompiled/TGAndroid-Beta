package de;

import java.util.concurrent.CancellationException;
public final class a extends CancellationException {
    public final transient ce.j f6482a;

    public a(ce.j jVar) {
        super("Flow was aborted, no more elements needed");
        this.f6482a = jVar;
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
