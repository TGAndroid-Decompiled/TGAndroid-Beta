package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class pgd {
    public static Task a(BasePendingResult basePendingResult, s68 s68Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new x7d(basePendingResult, taskCompletionSource, s68Var));
        return taskCompletionSource.getTask();
    }
}
