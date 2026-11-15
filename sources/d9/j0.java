package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7631n;
    public final c f7632r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7631n = h0Var;
        this.f7632r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7632r.f7611f) {
            try {
                c cVar = this.f7632r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7610e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7632r.f7616l.getAndIncrement() > 0) {
                    this.f7632r.f7608b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7632r, this.f7631n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
