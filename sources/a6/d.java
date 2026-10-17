package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f293a;
    public boolean f294b = false;
    public boolean f295c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f296f;
    public volatile x1.a f297g;
    public volatile x1.a h;
    public final Semaphore f298i;
    public final Set f299j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f298i = new Semaphore(0);
        this.f299j = set;
    }

    public final void a() {
        if (this.f297g != null) {
            boolean z10 = this.f294b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f297g.getClass();
                this.f297g = null;
                return;
            }
            this.f297g.getClass();
            x1.a aVar = this.f297g;
            aVar.f49130c.set(true);
            if (aVar.f49128a.cancel(false)) {
                this.h = this.f297g;
            }
            this.f297g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f297g != null) {
            this.f297g.getClass();
            if (this.f296f == null) {
                this.f296f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f297g;
            Executor executor = this.f296f;
            if (aVar.f49129b != 1) {
                int c10 = m1.j.c(aVar.f49129b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f49129b = 2;
            executor.execute(aVar.f49128a);
        }
    }

    public final void c() {
        a();
        this.f297g = new x1.a(this);
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
