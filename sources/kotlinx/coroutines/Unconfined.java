package kotlinx.coroutines;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.coroutines.CoroutineContext;

public final class Unconfined extends CoroutineDispatcher {
    public static final Unconfined INSTANCE = new Unconfined();

    @Override
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    private Unconfined() {
    }

    @Override
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(coroutineContext.get(YieldContext.Key));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
