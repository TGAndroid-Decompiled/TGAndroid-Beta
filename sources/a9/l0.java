package a9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class l0 extends j0 {
    public final TaskCompletionSource h;
    public final j0 f356n;
    public final e f357r;

    public l0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j0 j0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f356n = j0Var;
        this.f357r = eVar;
    }

    @Override
    public final void b() {
        synchronized (this.f357r.f336f) {
            try {
                e eVar = this.f357r;
                TaskCompletionSource taskCompletionSource = this.h;
                eVar.f335e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.y(2, eVar, taskCompletionSource));
                if (this.f357r.f341l.getAndIncrement() > 0) {
                    this.f357r.f333b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.f357r, this.f356n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
