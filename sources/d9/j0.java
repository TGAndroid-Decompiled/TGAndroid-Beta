package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f8248n;
    public final c f8249r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f8248n = h0Var;
        this.f8249r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f8249r.f8228f) {
            try {
                c cVar = this.f8249r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f8227e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f8249r.f8233l.getAndIncrement() > 0) {
                    this.f8249r.f8225b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f8249r, this.f8248n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
