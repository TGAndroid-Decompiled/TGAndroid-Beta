package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f350n;
    public final e f351r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f350n = k0Var;
        this.f351r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f351r.f330f) {
            try {
                e eVar = this.f351r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qf.b(2, eVar, taskCompletionSource));
                if (this.f351r.f335l.getAndIncrement() > 0) {
                    this.f351r.f328b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f351r, this.f350n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
