package o8;

import com.google.android.gms.tasks.TaskCompletionSource;
import n7.qa;
public final class i0 extends g0 {
    public final TaskCompletionSource h;
    public final g0 f16470n;
    public final c f16471r;

    public i0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g0 g0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f16470n = g0Var;
        this.f16471r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f16471r.f16453f) {
            try {
                c cVar = this.f16471r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qa(cVar, taskCompletionSource, false, 5));
                if (this.f16471r.f16458l.getAndIncrement() > 0) {
                    this.f16471r.f16451b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f16471r, this.f16470n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
