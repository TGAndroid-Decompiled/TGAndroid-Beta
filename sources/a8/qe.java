package a8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class qe {
    public static final Object a(Task task, nd.c cVar) {
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
        ce.m mVar = new ce.m(1, pe.b(cVar));
        mVar.s();
        task.addOnCompleteListener(me.a.f18419a, new me.b(mVar));
        Object r6 = mVar.r();
        md.a aVar = md.a.f18411a;
        return r6;
    }
}
