package ba;

import a3.h;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class a {
    public static final d3.b f3130a = new d3.b(3);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        h hVar = new h(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 4);
        d3.b bVar = f3130a;
        task.continueWithTask(bVar, hVar);
        task2.continueWithTask(bVar, hVar);
        return taskCompletionSource.getTask();
    }
}
