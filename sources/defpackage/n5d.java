package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class n5d extends j5d {
    public final TaskCompletionSource h;
    public final j5d n;
    public final y3d r;

    public n5d(y3d y3dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, j5d j5dVar) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = j5dVar;
        this.r = y3dVar;
    }

    @Override
    public final void b() {
        synchronized (this.r.f) {
            y3d y3dVar = this.r;
            TaskCompletionSource taskCompletionSource = this.h;
            y3dVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new k7b(y3dVar, taskCompletionSource, (byte) 9));
            if (this.r.l.getAndIncrement() > 0) {
                this.r.b.b("Already connected to the service.", new Object[0]);
            }
            y3d.b(this.r, this.n);
        }
    }
}
