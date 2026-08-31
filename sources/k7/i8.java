package k7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import org.telegram.ui.Components.ai;
public abstract class i8 {
    public static final Object a(Task task, wc.c cVar) {
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
        ld.m mVar = new ld.m(1, h8.b(cVar));
        mVar.s();
        task.addOnCompleteListener(vd.a.f48970a, new ai(mVar, 18));
        Object r10 = mVar.r();
        vc.a aVar = vc.a.f48962a;
        return r10;
    }
}
