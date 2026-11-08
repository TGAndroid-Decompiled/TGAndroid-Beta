package c8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class v0 {
    public static final Object a(Task task, gb.w wVar) {
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
        zd.m mVar = new zd.m(1, u0.b(wVar));
        mVar.s();
        task.addOnCompleteListener(je.a.f16654a, new je.b(mVar));
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f16646a;
        return r10;
    }
}
