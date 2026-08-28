package g7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class h7 {
    public static final Object a(Task task, sc.c cVar) {
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
        hd.m mVar = new hd.m(1, g7.b(cVar));
        mVar.s();
        task.addOnCompleteListener(rd.a.f47135a, new n5.a0(mVar, 16));
        Object r10 = mVar.r();
        rc.a aVar = rc.a.f47127a;
        return r10;
    }
}
