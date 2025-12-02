package kotlinx.coroutines;

public final class InvokeOnCompletion extends JobNode {
    private final InternalCompletionHandler handler;

    public InvokeOnCompletion(InternalCompletionHandler internalCompletionHandler) {
        this.handler = internalCompletionHandler;
    }

    @Override
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
