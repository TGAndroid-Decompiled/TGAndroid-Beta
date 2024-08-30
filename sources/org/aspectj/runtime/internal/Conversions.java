package org.aspectj.runtime.internal;

public abstract class Conversions {
    public static Object booleanObject(boolean z) {
        return new Boolean(z);
    }

    public static Object doubleObject(double d) {
        return new Double(d);
    }

    public static Object floatObject(float f) {
        return new Float(f);
    }

    public static Object intObject(int i) {
        return new Integer(i);
    }

    public static Object longObject(long j) {
        return new Long(j);
    }
}
