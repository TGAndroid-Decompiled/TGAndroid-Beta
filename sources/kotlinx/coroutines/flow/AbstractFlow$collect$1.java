package kotlinx.coroutines.flow;

import com.stripe.android.Stripe;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;

public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public SafeCollector L$0;
    public int label;
    public Object result;
    public final Stripe.AnonymousClass1 this$0;

    public AbstractFlow$collect$1(Stripe.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = anonymousClass1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
