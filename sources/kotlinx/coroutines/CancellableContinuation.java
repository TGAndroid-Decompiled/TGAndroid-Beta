package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public interface CancellableContinuation extends Continuation {

    public static final class DefaultImpls {
        public static boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }
    }

    boolean cancel(Throwable th);

    void completeResume(Object obj);

    void invokeOnCancellation(Function1 function1);

    boolean isCompleted();

    void resume(Object obj, Function1 function1);

    Object tryResume(Object obj, Object obj2, Function1 function1);

    Object tryResumeWithException(Throwable th);
}
