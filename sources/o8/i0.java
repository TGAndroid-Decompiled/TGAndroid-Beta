package o8;

import com.google.android.gms.tasks.TaskCompletionSource;
import n7.qa;
public final class i0 extends g0 {
    public final TaskCompletionSource h;
    public final g0 f16650n;
    public final c f16651r;

    public i0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, g0 g0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f16650n = g0Var;
        this.f16651r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f16651r.f16632f) {
            try {
                c cVar = this.f16651r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f16631e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new qa(4, cVar, taskCompletionSource));
                if (this.f16651r.f16637l.getAndIncrement() > 0) {
                    this.f16651r.f16629b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f16651r, this.f16650n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
