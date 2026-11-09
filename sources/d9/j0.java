package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f8243n;
    public final c f8244r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f8243n = h0Var;
        this.f8244r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f8244r.f8223f) {
            try {
                c cVar = this.f8244r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f8222e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f8244r.f8228l.getAndIncrement() > 0) {
                    this.f8244r.f8220b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f8244r, this.f8243n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
