package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class xze {
    public static final Object a(Task task, nq5 nq5Var) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        va1 va1Var = new va1(1, xpe.a(nq5Var));
        va1Var.s();
        task.addOnCompleteListener(no3.b, new j09(va1Var, (byte) 18));
        return va1Var.q();
    }
}
