package kotlinx.coroutines;

import androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.coroutines.CoroutineContext;

public final class Unconfined extends CoroutineDispatcher {
    public static final Unconfined INSTANCE = new Unconfined();

    private Unconfined() {
    }

    @Override
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        ActivityResultRegistry$$ExternalSyntheticThrowCCEIfNotNull0.m(coroutineContext.get(YieldContext.Key));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
