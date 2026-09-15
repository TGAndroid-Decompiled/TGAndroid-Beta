package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f344n;
    public final e f345r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f344n = k0Var;
        this.f345r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f345r.f324f) {
            try {
                e eVar = this.f345r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.f345r.f329l.getAndIncrement() > 0) {
                    this.f345r.f322b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f345r, this.f344n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
