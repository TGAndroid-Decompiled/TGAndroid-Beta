package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class y2d extends u2d {
    public final TaskCompletionSource h;
    public final u2d n;
    public final i1d r;

    public y2d(i1d i1dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, u2d u2dVar) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = u2dVar;
        this.r = i1dVar;
    }

    @Override
    public final void b() {
        synchronized (this.r.f) {
            i1d i1dVar = this.r;
            TaskCompletionSource taskCompletionSource = this.h;
            i1dVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new xab(i1dVar, taskCompletionSource, false, (byte) 8));
            if (this.r.l.getAndIncrement() > 0) {
                this.r.b.b("Already connected to the service.", new Object[0]);
            }
            i1d.b(this.r, this.n);
        }
    }
}
