package j7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class p5 {
    public static void a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.e()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(b6.m.m(status));
        }
    }

    public static void b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.e()) {
            taskCompletionSource.trySetResult(obj);
        } else {
            taskCompletionSource.trySetException(b6.m.m(status));
        }
    }
}
