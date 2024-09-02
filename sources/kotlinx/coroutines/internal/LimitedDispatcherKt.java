package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Intrinsics;

public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (!(i >= 1)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}
