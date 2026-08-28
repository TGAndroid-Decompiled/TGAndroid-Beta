package k8;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f14695n;
    public final c f14696r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f14695n = h0Var;
        this.f14696r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f14696r.f14675f) {
            try {
                c cVar = this.f14696r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f14674e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new g5.b(13, cVar, taskCompletionSource));
                if (this.f14696r.f14680l.getAndIncrement() > 0) {
                    this.f14696r.f14672b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f14696r, this.f14695n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
