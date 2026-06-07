package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public abstract class FlowKt {
    public static final Flow m352catch(Flow flow, Function3 function3) {
        return FlowKt__ErrorsKt.m353catch(flow, function3);
    }

    public static final Object catchImpl(Flow flow, FlowCollector flowCollector, Continuation continuation) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, continuation);
    }

    public static final Flow dropWhile(Flow flow, Function2 function2) {
        return FlowKt__LimitKt.dropWhile(flow, function2);
    }

    public static final Object emitAll(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, continuation);
    }

    public static final void ensureActive(FlowCollector flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final Object first(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.first(flow, continuation);
    }

    public static final Flow flow(Function2 function2) {
        return FlowKt__BuildersKt.flow(function2);
    }
}
