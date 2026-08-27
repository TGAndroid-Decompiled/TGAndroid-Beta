package f9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class a0 implements Continuation {

    public final int f5921a;

    public final TaskCompletionSource f5922b;

    public a0(int i10, TaskCompletionSource taskCompletionSource) {
        this.f5921a = i10;
        this.f5922b = taskCompletionSource;
    }

    @Override
    public final Object then(Task task) {
        switch (this.f5921a) {
            case 0:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.f5922b;
                if (zIsSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                }
                break;
            case 1:
                boolean zIsSuccessful2 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = this.f5922b;
                if (zIsSuccessful2) {
                    taskCompletionSource2.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource2.trySetException(task.getException());
                }
                break;
            default:
                boolean zIsSuccessful3 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource3 = this.f5922b;
                if (zIsSuccessful3) {
                    taskCompletionSource3.setResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource3.setException(task.getException());
                }
                break;
        }
        return null;
    }
}
