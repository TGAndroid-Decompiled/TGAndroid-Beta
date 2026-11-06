package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f8245n;
    public final c f8246r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f8245n = h0Var;
        this.f8246r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f8246r.f8225f) {
            try {
                c cVar = this.f8246r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f8224e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f8246r.f8230l.getAndIncrement() > 0) {
                    this.f8246r.f8222b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f8246r, this.f8245n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
