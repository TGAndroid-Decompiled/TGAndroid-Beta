package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f342n;
    public final e f343r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f342n = k0Var;
        this.f343r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f343r.f322f) {
            try {
                e eVar = this.f343r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.f343r.f327l.getAndIncrement() > 0) {
                    this.f343r.f320b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f343r, this.f342n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
