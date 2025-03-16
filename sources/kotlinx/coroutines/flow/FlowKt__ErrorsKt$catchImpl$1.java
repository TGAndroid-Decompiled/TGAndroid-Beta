package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class FlowKt__ErrorsKt$catchImpl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public FlowKt__ErrorsKt$catchImpl$1(Continuation continuation) {
        super(continuation);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt.catchImpl(null, null, this);
    }
}
