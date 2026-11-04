package aa;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
public final class c implements Continuation, p1 {
    public final Runnable f281a;

    public c(Runnable runnable) {
        this.f281a = runnable;
    }

    @Override
    public void g(s1 s1Var, int i3) {
        this.f281a.run();
    }

    @Override
    public Object then(Task task) {
        this.f281a.run();
        return Tasks.forResult(null);
    }
}
