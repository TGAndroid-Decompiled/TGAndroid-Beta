package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    static {
        CoroutineDispatcher.Key baseKey = CoroutineDispatcher.Key;
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
    }
}
