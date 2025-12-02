package kotlinx.coroutines;

public final class DisposeOnCompletion extends JobNode {
    private final DisposableHandle handle;

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.handle = disposableHandle;
    }

    @Override
    public void invoke(Throwable th) {
        this.handle.dispose();
    }
}
