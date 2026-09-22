package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f343n;
    public final e f344r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f343n = k0Var;
        this.f344r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f344r.f323f) {
            try {
                e eVar = this.f344r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(eVar, taskCompletionSource));
                if (this.f344r.f328l.getAndIncrement() > 0) {
                    this.f344r.f321b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f344r, this.f343n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
