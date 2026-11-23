package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class b implements Continuation, q1 {
    public final Runnable f3103a;

    public b(Runnable runnable) {
        this.f3103a = runnable;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        this.f3103a.run();
    }

    @Override
    public Object then(Task task) {
        this.f3103a.run();
        return Tasks.forResult(null);
    }
}
