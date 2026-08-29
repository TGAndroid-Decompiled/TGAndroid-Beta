package m8;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f16916n;
    public final c f16917r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f16916n = h0Var;
        this.f16917r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f16917r.f16896f) {
            try {
                c cVar = this.f16917r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f16895e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new g9.l(cVar, taskCompletionSource, false, 21));
                if (this.f16917r.f16901l.getAndIncrement() > 0) {
                    this.f16917r.f16893b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f16917r, this.f16916n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
