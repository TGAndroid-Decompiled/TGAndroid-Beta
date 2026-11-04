package c9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f4271n;
    public final c f4272r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f4271n = h0Var;
        this.f4272r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f4272r.f4251f) {
            try {
                c cVar = this.f4272r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f4250e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new p4.q(cVar, taskCompletionSource));
                if (this.f4272r.f4256l.getAndIncrement() > 0) {
                    this.f4272r.f4248b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f4272r, this.f4271n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
