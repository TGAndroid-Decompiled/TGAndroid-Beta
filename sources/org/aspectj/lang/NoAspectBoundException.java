package org.aspectj.lang;

public class NoAspectBoundException extends RuntimeException {
    Throwable cause;

    public NoAspectBoundException(java.lang.String r3, java.lang.Throwable r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.lang.NoAspectBoundException.<init>(java.lang.String, java.lang.Throwable):void");
    }

    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
