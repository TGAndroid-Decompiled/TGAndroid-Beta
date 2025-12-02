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

    public final AbstractSharedFlowSlot allocateSlot() {
        AbstractSharedFlowSlot abstractSharedFlowSlot;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArr = this.slots;
                if (abstractSharedFlowSlotArr == null) {
                    abstractSharedFlowSlotArr = createSlotArray(2);
                    this.slots = abstractSharedFlowSlotArr;
                } else if (this.nCollectors >= abstractSharedFlowSlotArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractSharedFlowSlotArr, abstractSharedFlowSlotArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.slots = (AbstractSharedFlowSlot[]) copyOf;
                    abstractSharedFlowSlotArr = (AbstractSharedFlowSlot[]) copyOf;
                }
                int i = this.nextIndex;
                do {
                    abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                    if (abstractSharedFlowSlot == null) {
                        abstractSharedFlowSlot = createSlot();
                        abstractSharedFlowSlotArr[i] = abstractSharedFlowSlot;
                    }
                    i++;
                    if (i >= abstractSharedFlowSlotArr.length) {
                        i = 0;
                    }
                    Intrinsics.checkNotNull(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractSharedFlowSlot.allocateLocked(this));
                this.nextIndex = i;
                this.nCollectors++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractSharedFlowSlot;
    }

    public final void freeSlot(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        int i;
        Continuation[] freeLocked;
        synchronized (this) {
            try {
                int i2 = this.nCollectors - 1;
                this.nCollectors = i2;
                if (i2 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.checkNotNull(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                freeLocked = abstractSharedFlowSlot.freeLocked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : freeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m275constructorimpl(Unit.INSTANCE));
            }
        }
    }

    public final AbstractSharedFlowSlot[] getSlots() {
        return this.slots;
    }
}
