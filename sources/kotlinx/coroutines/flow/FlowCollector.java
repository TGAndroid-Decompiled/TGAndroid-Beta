package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

public interface FlowCollector {
    Object emit(Object obj, Continuation continuation);
}
