package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f289a;
    public boolean f290b = false;
    public boolean f291c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f292f;
    public volatile x1.a f293g;
    public volatile x1.a h;
    public final Semaphore f294i;
    public final Set f295j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f294i = new Semaphore(0);
        this.f295j = set;
    }

    public final void a() {
        if (this.f293g != null) {
            boolean z10 = this.f290b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f293g.getClass();
                this.f293g = null;
                return;
            }
            this.f293g.getClass();
            x1.a aVar = this.f293g;
            aVar.f45453c.set(true);
            if (aVar.f45451a.cancel(false)) {
                this.h = this.f293g;
            }
            this.f293g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f293g != null) {
            this.f293g.getClass();
            if (this.f292f == null) {
                this.f292f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f293g;
            Executor executor = this.f292f;
            if (aVar.f45452b != 1) {
                int c10 = m1.j.c(aVar.f45452b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f45452b = 2;
            executor.execute(aVar.f45451a);
        }
    }

    public final void c() {
        a();
        this.f293g = new x1.a(this);
        b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
