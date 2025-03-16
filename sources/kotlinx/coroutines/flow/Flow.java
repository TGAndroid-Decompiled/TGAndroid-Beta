package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

public interface Flow {
    Object collect(FlowCollector flowCollector, Continuation continuation);
}
