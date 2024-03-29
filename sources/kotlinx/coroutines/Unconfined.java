package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
public final class Unconfined extends CoroutineDispatcher {
    public static final Unconfined INSTANCE = new Unconfined();

    @Override
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    @Override
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    private Unconfined() {
    }

    @Override
    public void mo152dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (((YieldContext) coroutineContext.get(YieldContext.Key)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }
}
