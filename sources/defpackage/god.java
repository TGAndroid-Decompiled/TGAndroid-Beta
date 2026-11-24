package defpackage;

import java.util.concurrent.TimeoutException;
public final class god extends TimeoutException {
    @Override
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
