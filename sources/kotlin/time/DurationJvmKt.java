package kotlin.time;

public abstract class DurationJvmKt {
    private static final boolean durationAssertionsEnabled = false;
    private static final ThreadLocal[] precisionFormats;

    public static final boolean getDurationAssertionsEnabled() {
        return durationAssertionsEnabled;
    }

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        precisionFormats = threadLocalArr;
    }
}
