package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7914n;
    public final c f7915r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7914n = h0Var;
        this.f7915r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7915r.f7894f) {
            try {
                c cVar = this.f7915r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7893e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7915r.f7899l.getAndIncrement() > 0) {
                    this.f7915r.f7891b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7915r, this.f7914n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
