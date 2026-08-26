package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.Symbol;

public interface CancellableContinuation extends Continuation {
    void completeResume(Object obj);

    Symbol tryResume(Function1 function1, Object obj);
}
