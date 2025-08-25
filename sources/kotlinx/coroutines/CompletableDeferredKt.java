package kotlinx.coroutines;

import kotlin.Result;

public abstract class CompletableDeferredKt {
    public static final boolean completeWith(CompletableDeferred completableDeferred, Object obj) {
        Throwable m213exceptionOrNullimpl = Result.m213exceptionOrNullimpl(obj);
        return m213exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(m213exceptionOrNullimpl);
    }

    public static final CompletableDeferred CompletableDeferred(Job job) {
        return new CompletableDeferredImpl(job);
    }

    public static CompletableDeferred CompletableDeferred$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }
}
