package k7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class h8 {
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
        ld.m mVar = new ld.m(1, g8.b(cVar));
        mVar.s();
        task.addOnCompleteListener(vd.a.f45671a, new org.telegram.ui.Cells.f1(mVar, 25));
        Object r10 = mVar.r();
        vc.a aVar = vc.a.f45663a;
        return r10;
    }
}
