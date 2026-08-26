package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

public final class StateFlowImpl extends AbstractSharedFlow implements MutableStateFlow, Flow {
    public static final AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    public int sequence;

    public final class AnonymousClass1 extends ContinuationImpl {
        public StateFlowImpl L$0;
        public FlowCollector L$1;
        public StateFlowSlot L$2;
        public Job L$3;
        public Object L$4;
        public int label;
        public Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            StateFlowImpl.this.collect(null, this);
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override
    public final Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    public final Object getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        Object obj = _state$volatile$FU.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    public final void setValue(Object obj) {
        int i;
        StateFlowSlot[] stateFlowSlotArr;
        Symbol symbol;
        if (obj == null) {
            obj = NullSurrogateKt.NULL;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            if (Intrinsics.areEqual(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            StateFlowSlot[] stateFlowSlotArr2 = this.slots;
            while (true) {
                if (stateFlowSlotArr2 != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr2) {
                        if (stateFlowSlot != null) {
                            AtomicReference atomicReference = stateFlowSlot._state;
                            while (true) {
                                Object obj2 = atomicReference.get();
                                if (obj2 == null || obj2 == (symbol = FlowKt.PENDING)) {
                                    break;
                                }
                                Symbol symbol2 = FlowKt.NONE;
                                if (obj2 != symbol2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj2, symbol2)) {
                                            ((CancellableContinuationImpl) obj2).resumeWith(Unit.INSTANCE);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj2);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj2, symbol)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj2);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return;
                    }
                    stateFlowSlotArr = this.slots;
                }
                stateFlowSlotArr2 = stateFlowSlotArr;
                i3 = i;
            }
        }
    }
}
