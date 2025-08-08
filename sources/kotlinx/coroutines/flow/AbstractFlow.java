package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

public abstract class AbstractFlow implements Flow {
    public abstract Object collectSafely(FlowCollector flowCollector, Continuation continuation);

    @Override
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractFlow.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
