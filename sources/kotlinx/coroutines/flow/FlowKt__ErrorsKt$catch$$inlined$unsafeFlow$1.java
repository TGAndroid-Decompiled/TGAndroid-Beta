package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;

public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements Flow {
    final Function3 $action$inlined;
    final Flow $this_catch$inlined;

    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    @Override
    public Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCatchImpl = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                flowCollector = (FlowCollector) anonymousClass1.L$1;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objCatchImpl);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCatchImpl);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objCatchImpl);
        Flow flow = this.$this_catch$inlined;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = flowCollector;
        anonymousClass1.label = 1;
        objCatchImpl = FlowKt.catchImpl(flow, flowCollector, anonymousClass1);
        if (objCatchImpl == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
        Throwable th = (Throwable) objCatchImpl;
        if (th != null) {
            Function3 function3 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.$action$inlined;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            InlineMarker.mark(6);
            Object objInvoke = function3.invoke(flowCollector, th, anonymousClass1);
            InlineMarker.mark(7);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(Flow flow, Function3 function3) {
        this.$this_catch$inlined = flow;
        this.$action$inlined = function3;
    }
}
