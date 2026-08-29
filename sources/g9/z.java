package g9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements Continuation {
    public final int f7238a;
    public final TaskCompletionSource f7239b;

    public z(int i10, TaskCompletionSource taskCompletionSource) {
        this.f7238a = i10;
        this.f7239b = taskCompletionSource;
    }

    @Override
    public final Object then(Task task) {
        switch (this.f7238a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.f7239b;
                if (isSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                    return null;
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                    return null;
                } else {
                    return null;
                }
            case 1:
                boolean isSuccessful2 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = this.f7239b;
                if (isSuccessful2) {
                    taskCompletionSource2.trySetResult(task.getResult());
                    return null;
                } else if (task.getException() != null) {
                    taskCompletionSource2.trySetException(task.getException());
                    return null;
                } else {
                    return null;
                }
            default:
                boolean isSuccessful3 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource3 = this.f7239b;
                if (isSuccessful3) {
                    taskCompletionSource3.setResult(task.getResult());
                    return null;
                } else if (task.getException() != null) {
                    taskCompletionSource3.setException(task.getException());
                    return null;
                } else {
                    return null;
                }
        }
    }
}
