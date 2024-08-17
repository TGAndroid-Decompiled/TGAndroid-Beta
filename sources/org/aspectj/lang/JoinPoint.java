package org.aspectj.lang;

public interface JoinPoint {

    public interface StaticPart {
        String toString();
    }

    Object getTarget();
}
