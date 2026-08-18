package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

final class FlowKt__LimitKt$dropWhile$1$1 implements FlowCollector {
    final Ref$BooleanRef $matched;
    final Function2 $predicate;
    final FlowCollector $this_unsafeFlow;

    FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, Function2 function2) {
        this.$matched = ref$BooleanRef;
        this.$this_unsafeFlow = flowCollector;
        this.$predicate = function2;
    }

    @Override
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1;
        FlowCollector flowCollector;
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
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (this.$matched.element) {
                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                if (flowCollector2.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            Function2 function2 = this.$predicate;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = obj;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
            objInvoke = function2.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__LimitKt$dropWhile$1$1 = this;
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.INSTANCE;
            }
            flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
            flowCollector = flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            if (flowCollector.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    return Unit.INSTANCE;
                }
                flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
                flowCollector = flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                if (flowCollector.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
        }
        return Unit.INSTANCE;
    }
}
