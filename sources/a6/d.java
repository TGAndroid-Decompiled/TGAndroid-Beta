package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f312a;
    public boolean f313b = false;
    public boolean f314c = false;
    public boolean d = true;
    public boolean f315e = false;
    public Executor f316f;
    public volatile x1.a f317g;
    public volatile x1.a h;
    public final Semaphore f318i;
    public final Set f319j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f318i = new Semaphore(0);
        this.f319j = set;
    }

    public final void a() {
        if (this.f317g != null) {
            boolean z10 = this.f313b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f315e = true;
                }
            }
            if (this.h != null) {
                this.f317g.getClass();
                this.f317g = null;
                return;
            }
            this.f317g.getClass();
            x1.a aVar = this.f317g;
            aVar.f49170c.set(true);
            if (aVar.f49168a.cancel(false)) {
                this.h = this.f317g;
            }
            this.f317g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f317g != null) {
            this.f317g.getClass();
            if (this.f316f == null) {
                this.f316f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f317g;
            Executor executor = this.f316f;
            if (aVar.f49169b != 1) {
                int c10 = m1.j.c(aVar.f49169b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f49169b = 2;
            executor.execute(aVar.f49168a);
        }
    }

    public final void c() {
        a();
        this.f317g = new x1.a(this);
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
