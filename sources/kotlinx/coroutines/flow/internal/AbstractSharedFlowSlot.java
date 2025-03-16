package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;

public abstract class AbstractSharedFlowSlot {
    public abstract boolean allocateLocked(Object obj);

    public abstract Continuation[] freeLocked(Object obj);
}
