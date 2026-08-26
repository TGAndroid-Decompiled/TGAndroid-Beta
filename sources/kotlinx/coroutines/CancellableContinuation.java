package kotlinx.coroutines;

import com.google.common.base.Joiner;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public interface CancellableContinuation extends Continuation {
    void completeResume(Object obj);

    Joiner tryResume(Function1 function1, Object obj);
}
