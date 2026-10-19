package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f348n;
    public final e f349r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f348n = k0Var;
        this.f349r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f349r.f328f) {
            try {
                e eVar = this.f349r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qf.b(2, eVar, taskCompletionSource));
                if (this.f349r.f333l.getAndIncrement() > 0) {
                    this.f349r.f326b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f349r, this.f348n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
