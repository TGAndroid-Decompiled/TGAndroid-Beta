package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f294a;
    public boolean f295b = false;
    public boolean f296c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f297f;
    public volatile x1.a f298g;
    public volatile x1.a h;
    public final Semaphore f299i;
    public final Set f300j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f299i = new Semaphore(0);
        this.f300j = set;
    }

    public final void a() {
        if (this.f298g != null) {
            boolean z10 = this.f295b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f298g.getClass();
                this.f298g = null;
                return;
            }
            this.f298g.getClass();
            x1.a aVar = this.f298g;
            aVar.f49107c.set(true);
            if (aVar.f49105a.cancel(false)) {
                this.h = this.f298g;
            }
            this.f298g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f298g != null) {
            this.f298g.getClass();
            if (this.f297f == null) {
                this.f297f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f298g;
            Executor executor = this.f297f;
            if (aVar.f49106b != 1) {
                int c10 = m1.j.c(aVar.f49106b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f49106b = 2;
            executor.execute(aVar.f49105a);
        }
    }

    public final void c() {
        a();
        this.f298g = new x1.a(this);
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
