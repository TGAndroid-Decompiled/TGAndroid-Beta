package i9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class x implements Continuation {
    public final int f8023a;
    public final TaskCompletionSource f8024b;

    public x(int i10, TaskCompletionSource taskCompletionSource) {
        this.f8023a = i10;
        this.f8024b = taskCompletionSource;
    }

    @Override
    public final Object then(Task task) {
        switch (this.f8023a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.f8024b;
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
                TaskCompletionSource taskCompletionSource2 = this.f8024b;
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
                TaskCompletionSource taskCompletionSource3 = this.f8024b;
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
