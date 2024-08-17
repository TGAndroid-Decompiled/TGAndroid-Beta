package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

public interface CoroutineExceptionHandler extends CoroutineContext.Element {
    public static final Key Key = Key.$$INSTANCE;

    void handleException(CoroutineContext coroutineContext, Throwable th);

    public static final class Key implements CoroutineContext.Key<CoroutineExceptionHandler> {
        static final Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
