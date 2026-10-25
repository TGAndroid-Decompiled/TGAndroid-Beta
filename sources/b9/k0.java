package b9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class k0 extends i0 {
    public final TaskCompletionSource h;
    public final i0 f3707n;
    public final d f3708r;

    public k0(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, i0 i0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f3707n = i0Var;
        this.f3708r = dVar;
    }

    @Override
    public final void b() {
        synchronized (this.f3708r.f3688f) {
            try {
                d dVar = this.f3708r;
                TaskCompletionSource taskCompletionSource = this.h;
                dVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new n4.s(7, dVar, taskCompletionSource));
                if (this.f3708r.f3693l.getAndIncrement() > 0) {
                    this.f3708r.f3686b.b("Already connected to the service.", new Object[0]);
                }
                d.b(this.f3708r, this.f3707n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
