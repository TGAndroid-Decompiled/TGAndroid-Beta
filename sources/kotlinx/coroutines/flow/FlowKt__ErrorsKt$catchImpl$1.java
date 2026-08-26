package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FlowKt__ErrorsKt$catchImpl$1 extends ContinuationImpl {
    public Ref$ObjectRef L$0;
    public int label;
    public Object result;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt.catchImpl(null, null, this);
    }
}
