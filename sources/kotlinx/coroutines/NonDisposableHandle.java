package kotlinx.coroutines;

public final class NonDisposableHandle implements DisposableHandle, ChildHandle {
    public static final NonDisposableHandle INSTANCE = new NonDisposableHandle();

    @Override
    public final boolean childCancelled(Throwable th) {
        return false;
    }

    @Override
    public final void dispose() {
    }

    @Override
    public final Job getParent() {
        return null;
    }

    public final String toString() {
        return "NonDisposableHandle";
    }
}
