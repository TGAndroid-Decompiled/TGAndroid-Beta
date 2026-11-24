package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class wbd {
    public static Task a(BasePendingResult basePendingResult, c38 c38Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        basePendingResult.b(new g3d(basePendingResult, taskCompletionSource, c38Var));
        return taskCompletionSource.getTask();
    }
}
