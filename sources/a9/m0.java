package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class m0 extends k0 {
    public final TaskCompletionSource h;
    public final k0 f346n;
    public final e f347r;

    public m0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, k0 k0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f346n = k0Var;
        this.f347r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f347r.f326f) {
            try {
                e eVar = this.f347r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.f347r.f331l.getAndIncrement() > 0) {
                    this.f347r.f324b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f347r, this.f346n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
