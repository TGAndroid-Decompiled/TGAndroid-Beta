package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7634n;
    public final c f7635r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7634n = h0Var;
        this.f7635r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7635r.f7614f) {
            try {
                c cVar = this.f7635r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7613e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7635r.f7619l.getAndIncrement() > 0) {
                    this.f7635r.f7611b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7635r, this.f7634n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
