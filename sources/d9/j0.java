package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7909n;
    public final c f7910r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7909n = h0Var;
        this.f7910r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7910r.f7889f) {
            try {
                c cVar = this.f7910r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7888e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7910r.f7894l.getAndIncrement() > 0) {
                    this.f7910r.f7886b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7910r, this.f7909n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
