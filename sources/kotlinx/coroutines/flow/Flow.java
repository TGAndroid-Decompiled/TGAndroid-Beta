package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public interface Flow {
    Object collect(FlowCollector flowCollector, ContinuationImpl continuationImpl);
}
