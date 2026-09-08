package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class l0 extends j0 {
    public final TaskCompletionSource h;
    public final j0 f368n;
    public final e f369r;

    public l0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j0 j0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f368n = j0Var;
        this.f369r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f369r.f348f) {
            try {
                e eVar = this.f369r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.f347e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.f369r.f353l.getAndIncrement() > 0) {
                    this.f369r.f345b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f369r, this.f368n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
