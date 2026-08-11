package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

public abstract class AbstractSharedFlow {
    private int nCollectors;
    private int nextIndex;
    private AbstractSharedFlowSlot[] slots;

    protected abstract AbstractSharedFlowSlot createSlot();

    protected abstract AbstractSharedFlowSlot[] createSlotArray(int i);

    protected final AbstractSharedFlowSlot allocateSlot() {
        AbstractSharedFlowSlot abstractSharedFlowSlotCreateSlot;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArrCreateSlotArray = this.slots;
                if (abstractSharedFlowSlotArrCreateSlotArray == null) {
                    abstractSharedFlowSlotArrCreateSlotArray = createSlotArray(2);
                    this.slots = abstractSharedFlowSlotArrCreateSlotArray;
                } else if (this.nCollectors >= abstractSharedFlowSlotArrCreateSlotArray.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractSharedFlowSlotArrCreateSlotArray, abstractSharedFlowSlotArrCreateSlotArray.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.slots = (AbstractSharedFlowSlot[]) objArrCopyOf;
                    abstractSharedFlowSlotArrCreateSlotArray = (AbstractSharedFlowSlot[]) objArrCopyOf;
                }
                int i = this.nextIndex;
                do {
                    abstractSharedFlowSlotCreateSlot = abstractSharedFlowSlotArrCreateSlotArray[i];
                    if (abstractSharedFlowSlotCreateSlot == null) {
                        abstractSharedFlowSlotCreateSlot = createSlot();
                        abstractSharedFlowSlotArrCreateSlotArray[i] = abstractSharedFlowSlotCreateSlot;
                    }
                    i++;
                    if (i >= abstractSharedFlowSlotArrCreateSlotArray.length) {
                        i = 0;
                    }
                    Intrinsics.checkNotNull(abstractSharedFlowSlotCreateSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractSharedFlowSlotCreateSlot.allocateLocked(this));
                this.nextIndex = i;
                this.nCollectors++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractSharedFlowSlotCreateSlot;
    }

    protected final void freeSlot(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        int i;
        Continuation[] continuationArrFreeLocked;
        synchronized (this) {
            try {
                int i2 = this.nCollectors - 1;
                this.nCollectors = i2;
                if (i2 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.checkNotNull(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrFreeLocked = abstractSharedFlowSlot.freeLocked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrFreeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m290constructorimpl(Unit.INSTANCE));
            }
        }
    }

    protected final AbstractSharedFlowSlot[] getSlots() {
        return this.slots;
    }
}
