package b8;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class kc {
    public static final Object a(Task task, db.v vVar) {
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
        wd.m mVar = new wd.m(1, jc.b(vVar));
        mVar.s();
        task.addOnCompleteListener(ge.a.f12249a, new ge.b(mVar));
        Object r5 = mVar.r();
        gd.a aVar = gd.a.f12241a;
        return r5;
    }
}
