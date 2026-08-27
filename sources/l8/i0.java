package l8;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class i0 extends g0 {
    public final TaskCompletionSource h;

    public final g0 f15474n;

    public final c f15475r;

    public i0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g0 g0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f15474n = g0Var;
        this.f15475r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f15475r.f15456f) {
            try {
                c cVar = this.f15475r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f15455e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new g5.b(15, cVar, taskCompletionSource));
                if (this.f15475r.f15461l.getAndIncrement() > 0) {
                    this.f15475r.f15453b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f15475r, this.f15474n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
