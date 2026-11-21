package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7943n;
    public final c f7944r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7943n = h0Var;
        this.f7944r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7944r.f7923f) {
            try {
                c cVar = this.f7944r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7922e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7944r.f7928l.getAndIncrement() > 0) {
                    this.f7944r.f7920b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7944r, this.f7943n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
