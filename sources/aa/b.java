package aa;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class b {
    public static final c3.b f280a = new c3.b(3);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        a aVar = new a(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 0);
        c3.b bVar = f280a;
        task.continueWithTask(bVar, aVar);
        task2.continueWithTask(bVar, aVar);
        return taskCompletionSource.getTask();
    }
}
