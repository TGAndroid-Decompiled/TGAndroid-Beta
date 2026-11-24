package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class dve {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(bmd.a(status));
        }
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.b()) {
            taskCompletionSource.trySetResult(obj);
        } else {
            taskCompletionSource.trySetException(bmd.a(status));
        }
    }
}
