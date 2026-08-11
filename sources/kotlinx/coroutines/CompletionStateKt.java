package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public abstract class CompletionStateKt {
    public static Object toState$default(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return toState(obj, function1);
    }

    public static final Object toState(Object obj, Function1 function1) {
        Throwable thM292exceptionOrNullimpl = Result.m292exceptionOrNullimpl(obj);
        if (thM292exceptionOrNullimpl == null) {
            return function1 != null ? new CompletedWithCancellation(obj, function1) : obj;
        }
        return new CompletedExceptionally(thM292exceptionOrNullimpl, false, 2, null);
    }

    public static final Object toState(Object obj, CancellableContinuation cancellableContinuation) {
        Throwable thM292exceptionOrNullimpl = Result.m292exceptionOrNullimpl(obj);
        return thM292exceptionOrNullimpl == null ? obj : new CompletedExceptionally(thM292exceptionOrNullimpl, false, 2, null);
    }

    public static final Object recoverResult(Object obj, Continuation continuation) {
        if (obj instanceof CompletedExceptionally) {
            Result.Companion companion = Result.Companion;
            return Result.m290constructorimpl(ResultKt.createFailure(((CompletedExceptionally) obj).cause));
        }
        return Result.m290constructorimpl(obj);
    }
}
