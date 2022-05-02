package org.aspectj.runtime.internal;

public final class Conversions {
    public static Object intObject(int i) {
        return new Integer(i);
    }

    public static Object longObject(long j) {
        return new Long(j);
    }

    public static Object floatObject(float f) {
        return new Float(f);
    }

    public static Object doubleObject(double d) {
        return new Double(d);
    }

    public static Object booleanObject(boolean z) {
        return new Boolean(z);
    }
}
