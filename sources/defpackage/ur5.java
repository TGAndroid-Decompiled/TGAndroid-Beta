package defpackage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class ur5 {
    public static final ic a = new ic((byte) 1);

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static Task c(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        fu2 fu2Var = new fu2(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, (byte) 1);
        ic icVar = a;
        task.continueWithTask(icVar, fu2Var);
        task2.continueWithTask(icVar, fu2Var);
        return taskCompletionSource.getTask();
    }

    public static void d(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void e(String str) {
        RuntimeException runtimeException = new RuntimeException(qd4.y("lateinit property ", str, " has not been initialized"));
        d(runtimeException, ur5.class.getName());
        throw runtimeException;
    }
}
