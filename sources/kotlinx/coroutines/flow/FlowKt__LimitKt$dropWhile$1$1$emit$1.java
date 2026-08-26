package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends ContinuationImpl {
    public FlowKt__LimitKt$dropWhile$1$1 L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final FlowKt__LimitKt$dropWhile$1$1 this$0;

    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
