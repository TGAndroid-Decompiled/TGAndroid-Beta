package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class ydd {
    public static Task a(BasePendingResult basePendingResult, e58 e58Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new i5d(basePendingResult, taskCompletionSource, e58Var));
        return taskCompletionSource.getTask();
    }
}
