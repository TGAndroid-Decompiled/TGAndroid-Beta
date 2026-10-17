package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f349n;
    public final e f350r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f349n = k0Var;
        this.f350r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f350r.f329f) {
            try {
                e eVar = this.f350r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qf.b(2, eVar, taskCompletionSource));
                if (this.f350r.f334l.getAndIncrement() > 0) {
                    this.f350r.f327b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f350r, this.f349n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
