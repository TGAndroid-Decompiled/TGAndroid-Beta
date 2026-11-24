package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class w0d extends s0d {
    public final TaskCompletionSource h;
    public final s0d n;
    public final hzc r;

    public w0d(hzc hzcVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, s0d s0dVar) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = s0dVar;
        this.r = hzcVar;
    }

    @Override
    public final void b() {
        synchronized (this.r.f) {
            hzc hzcVar = this.r;
            TaskCompletionSource taskCompletionSource = this.h;
            hzcVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new v8b(hzcVar, taskCompletionSource, false, (byte) 8));
            if (this.r.l.getAndIncrement() > 0) {
                this.r.b.b("Already connected to the service.", new Object[0]);
            }
            hzc.b(this.r, this.n);
        }
    }
}
