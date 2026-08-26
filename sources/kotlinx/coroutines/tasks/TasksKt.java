package kotlinx.coroutines.tasks;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.SafeFlow;

public abstract class TasksKt {
    public static final Object await(Task task, ContinuationImpl continuationImpl) {
        if (!task.isComplete()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, zzjf.intercepted(continuationImpl));
            cancellableContinuationImpl.initCancellability();
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new SafeFlow(cancellableContinuationImpl));
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
