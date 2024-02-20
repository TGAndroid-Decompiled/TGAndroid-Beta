package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
public interface ThreadContextElement<S> extends CoroutineContext.Element {
    void restoreThreadContext(CoroutineContext coroutineContext, S s);

    S updateThreadContext(CoroutineContext coroutineContext);
}
