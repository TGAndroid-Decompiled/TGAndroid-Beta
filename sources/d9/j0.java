package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7917n;
    public final c f7918r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7917n = h0Var;
        this.f7918r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7918r.f7897f) {
            try {
                c cVar = this.f7918r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7896e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7918r.f7902l.getAndIncrement() > 0) {
                    this.f7918r.f7894b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7918r, this.f7917n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
