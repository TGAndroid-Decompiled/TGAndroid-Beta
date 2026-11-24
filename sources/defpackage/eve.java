package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class eve {
    public static final Object a(Task task, jo5 jo5Var) {
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
        na1 na1Var = new na1(1, dle.a(jo5Var));
        na1Var.s();
        task.addOnCompleteListener(wn3.b, new ln8(na1Var, (byte) 19));
        return na1Var.q();
    }
}
