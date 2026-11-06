package a8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class k8 {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(q6.m.l(status));
        }
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.trySetResult(obj);
        } else {
            taskCompletionSource.trySetException(q6.m.l(status));
        }
    }
}
