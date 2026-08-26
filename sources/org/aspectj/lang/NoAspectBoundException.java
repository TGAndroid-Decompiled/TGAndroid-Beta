package org.aspectj.lang;

public final class NoAspectBoundException extends RuntimeException {
    public Throwable cause;

    @Override
    public final Throwable getCause() {
        return this.cause;
    }
}
