package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;

public interface Mutex {
    boolean isLocked();

    Object lock(Object obj, Continuation continuation);

    void unlock(Object obj);

    public static final class DefaultImpls {
        public static void unlock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }
    }
}
