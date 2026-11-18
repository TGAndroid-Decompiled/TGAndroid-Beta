package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
public final class b implements Continuation, r1 {
    public final Runnable f3083a;

    public b(Runnable runnable) {
        this.f3083a = runnable;
    }

    @Override
    public void h(u1 u1Var, int i7) {
        this.f3083a.run();
    }

    @Override
    public Object then(Task task) {
        this.f3083a.run();
        return Tasks.forResult(null);
    }
}
