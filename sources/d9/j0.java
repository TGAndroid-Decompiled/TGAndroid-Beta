package d9;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class j0 extends h0 {
    public final TaskCompletionSource h;
    public final h0 f7946n;
    public final c f7947r;

    public j0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h0 h0Var) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.f7946n = h0Var;
        this.f7947r = cVar;
    }

    @Override
    public final void b() {
        synchronized (this.f7947r.f7926f) {
            try {
                c cVar = this.f7947r;
                TaskCompletionSource taskCompletionSource = this.h;
                cVar.f7925e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new q4.q(cVar, taskCompletionSource, false, 17));
                if (this.f7947r.f7931l.getAndIncrement() > 0) {
                    this.f7947r.f7923b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.f7947r, this.f7946n);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
