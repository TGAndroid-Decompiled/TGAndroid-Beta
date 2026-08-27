package h7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

public abstract class k7 {
    public static final Object a(Task task, tc.c cVar) throws Exception {
        if (!task.isComplete()) {
            id.m mVar = new id.m(1, h7.b(cVar));
            mVar.s();
            task.addOnCompleteListener(sd.a.f47855a, new sd.b(mVar));
            Object objR = mVar.r();
            sc.a aVar = sc.a.f47847a;
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
