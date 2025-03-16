package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;

final class SafeFlow extends AbstractFlow {
    private final Function2 block;

    public SafeFlow(Function2 function2) {
        this.block = function2;
    }

    @Override
    public Object collectSafely(FlowCollector flowCollector, Continuation continuation) {
        Object coroutine_suspended;
        Object invoke = this.block.invoke(flowCollector, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
    }
}
