package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

final class StateFlowImpl extends AbstractSharedFlow implements MutableStateFlow, Flow {
    private static final AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile Object _state$volatile;
    private int sequence;

    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StateFlowImpl.this.collect(null, this);
        }
    }

    private final boolean updateState(Object obj, Object obj2) {
        int i;
        AbstractSharedFlowSlot[] slots;
        synchronized (this) {
            Object obj3 = _state$volatile$FU.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            _state$volatile$FU.set(this, obj2);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            AbstractSharedFlowSlot[] slots2 = getSlots();
            Unit unit = Unit.INSTANCE;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) slots2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            stateFlowSlot.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    slots = getSlots();
                    Unit unit2 = Unit.INSTANCE;
                }
                slots2 = slots;
                i3 = i;
            }
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override
    public Object getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        Object obj = _state$volatile$FU.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    @Override
    public void setValue(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.NULL;
        }
        updateState(null, obj);
    }

    @Override
    public Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    @Override
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    @Override
    public StateFlowSlot[] createSlotArray(int i) {
        return new StateFlowSlot[i];
    }
}
