package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class AbstractFlow$collect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final AbstractFlow this$0;

    public AbstractFlow$collect$1(AbstractFlow abstractFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = abstractFlow;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
