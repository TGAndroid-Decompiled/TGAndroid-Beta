package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class fxe {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(dod.a(status));
        }
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.trySetResult(obj);
        } else {
            taskCompletionSource.trySetException(dod.a(status));
        }
    }
}
