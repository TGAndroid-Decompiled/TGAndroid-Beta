package c8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class z0 {
    public static final Object a(Task task, gb.x xVar) {
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
        zd.m mVar = new zd.m(1, y0.b(xVar));
        mVar.s();
        task.addOnCompleteListener(je.a.f17486a, new j6.r(mVar, 1));
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f17478a;
        return r10;
    }
}
