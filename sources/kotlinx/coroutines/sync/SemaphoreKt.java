package kotlinx.coroutines.sync;

import com.google.common.base.Joiner;
import kotlinx.coroutines.internal.AtomicKt;

public abstract class SemaphoreKt {
    public static final int MAX_SPIN_CYCLES = AtomicKt.systemProp$default(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final Joiner PERMIT = new Joiner("PERMIT", 2);
    public static final Joiner TAKEN = new Joiner("TAKEN", 2);
    public static final Joiner BROKEN = new Joiner("BROKEN", 2);
    public static final Joiner CANCELLED = new Joiner("CANCELLED", 2);
    public static final int SEGMENT_SIZE = AtomicKt.systemProp$default(16, 12, "kotlinx.coroutines.semaphore.segmentSize");
}
