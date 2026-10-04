package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f371n;
    public final e f372r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f371n = k0Var;
        this.f372r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f372r.f350f) {
            try {
                e eVar = this.f372r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.f349e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.f372r.f355l.getAndIncrement() > 0) {
                    this.f372r.f347b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f372r, this.f371n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
