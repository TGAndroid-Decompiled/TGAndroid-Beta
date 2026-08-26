package kotlinx.coroutines.tasks;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.google.android.gms.tasks.Task;
import com.stripe.android.Stripe;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;

public abstract class TasksKt {
    public static final Object await(Task task, ContinuationImpl continuationImpl) throws Exception {
        if (!task.isComplete()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, zzjj.intercepted(continuationImpl));
            cancellableContinuationImpl.initCancellability();
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new Stripe.AnonymousClass1(cancellableContinuationImpl, 15));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
