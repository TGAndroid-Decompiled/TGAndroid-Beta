package i7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class w7 {
    public static final Object a(Task task, uc.c cVar) {
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
        jd.m mVar = new jd.m(1, v7.b(cVar));
        mVar.s();
        task.addOnCompleteListener(td.a.f48218a, new o1.a(mVar, 22));
        Object r6 = mVar.r();
        tc.a aVar = tc.a.f48210a;
        return r6;
    }
}
