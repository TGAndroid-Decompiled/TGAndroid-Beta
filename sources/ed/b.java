package ed;
public final class b implements cd.c {
    public static final b f6482a = new Object();

    @Override
    public final cd.h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
