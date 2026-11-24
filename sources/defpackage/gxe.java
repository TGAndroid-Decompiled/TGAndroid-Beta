package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class gxe {
    public static final Object a(Task task, jq5 jq5Var) {
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
        vb1 vb1Var = new vb1(1, fne.a(jq5Var));
        vb1Var.s();
        task.addOnCompleteListener(gp3.b, new cf9(vb1Var, (byte) 13));
        return vb1Var.q();
    }
}
