package o8;

import com.google.android.gms.tasks.TaskCompletionSource;
import n7.qa;
public final class i0 extends g0 {
    public final TaskCompletionSource h;
    public final g0 f16648n;
    public final c f16649r;

    public i0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g0 g0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f16648n = g0Var;
        this.f16649r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f16649r.f16630f) {
            try {
                c cVar = this.f16649r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f16629e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qa(4, cVar, taskCompletionSource));
                if (this.f16649r.f16635l.getAndIncrement() > 0) {
                    this.f16649r.f16627b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f16649r, this.f16648n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
