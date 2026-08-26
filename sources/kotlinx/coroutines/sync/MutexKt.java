package kotlinx.coroutines.sync;

import com.google.common.base.Joiner;

public abstract class MutexKt {
    public static final Joiner NO_OWNER = new Joiner("NO_OWNER", 2);

    public static MutexImpl Mutex$default() {
        return new MutexImpl(false);
    }
}
