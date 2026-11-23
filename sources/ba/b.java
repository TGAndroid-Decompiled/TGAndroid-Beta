package ba;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class b implements Continuation, q1 {
    public final Runnable f3054a;

    public b(Runnable runnable) {
        this.f3054a = runnable;
    }

    @Override
    public void h(t1 t1Var, int i7) {
        this.f3054a.run();
    }

    @Override
    public Object then(Task task) {
        this.f3054a.run();
        return Tasks.forResult(null);
    }
}
