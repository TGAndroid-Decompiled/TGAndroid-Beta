package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class b implements Continuation, r1 {
    public final Runnable f3131a;

    public b(Runnable runnable) {
        this.f3131a = runnable;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        this.f3131a.run();
    }

    @Override
    public Object then(Task task) {
        this.f3131a.run();
        return Tasks.forResult(null);
    }
}
