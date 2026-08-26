package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.Symbol;

public abstract class MutexKt {
    public static final Symbol NO_OWNER = new Symbol("NO_OWNER", 0);

    public static MutexImpl Mutex$default() {
        return new MutexImpl(false);
    }
}
