package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7908n;
    public final c f7909r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7908n = h0Var;
        this.f7909r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7909r.f7888f) {
            try {
                c cVar = this.f7909r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7887e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7909r.f7893l.getAndIncrement() > 0) {
                    this.f7909r.f7885b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7909r, this.f7908n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
