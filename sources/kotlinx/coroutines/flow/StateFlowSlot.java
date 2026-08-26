package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;

public final class StateFlowSlot {
    public final AtomicReference _state = new AtomicReference(null);
}
