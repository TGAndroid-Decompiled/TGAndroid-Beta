package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowSlot;

public abstract class AbstractSharedFlow {
    public int nCollectors;
    public int nextIndex;
    public StateFlowSlot[] slots;

    public final void freeSlot(StateFlowSlot stateFlowSlot) {
        synchronized (this) {
            try {
                int i = this.nCollectors - 1;
                this.nCollectors = i;
                if (i == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.checkNotNull(stateFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                stateFlowSlot._state.set(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
