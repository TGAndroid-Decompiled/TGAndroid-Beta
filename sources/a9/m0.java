package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f369n;
    public final e f370r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f369n = k0Var;
        this.f370r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f370r.f348f) {
            try {
                e eVar = this.f370r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.f347e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.x(2, eVar, taskCompletionSource));
                if (this.f370r.f353l.getAndIncrement() > 0) {
                    this.f370r.f345b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f370r, this.f369n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
