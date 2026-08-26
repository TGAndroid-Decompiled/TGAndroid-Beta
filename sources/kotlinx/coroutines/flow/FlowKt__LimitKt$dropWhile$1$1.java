package kotlinx.coroutines.flow;

import androidx.datastore.core.SingleProcessDataStore$data$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class FlowKt__LimitKt$dropWhile$1$1 implements FlowCollector {
    public final Ref$BooleanRef $matched;
    public final SingleProcessDataStore$data$1.AnonymousClass1 $predicate;
    public final FlowCollector $this_unsafeFlow;

    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, SingleProcessDataStore$data$1.AnonymousClass1 anonymousClass1) {
        this.$matched = ref$BooleanRef;
        this.$this_unsafeFlow = flowCollector;
        this.$predicate = anonymousClass1;
    }

    @Override
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        Unit unit = Unit.INSTANCE;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (this.$matched.element) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                if (this.$this_unsafeFlow.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons) {
                    return unit;
                }
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = obj;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                objInvoke = this.$predicate.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                if (objInvoke != coroutineSingletons) {
                    flowKt__LimitKt$dropWhile$1$1 = this;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(objInvoke);
            return unit;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
            return unit;
        }
        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
        flowKt__LimitKt$dropWhile$1$1 = flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
        ResultKt.throwOnFailure(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            if (flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
