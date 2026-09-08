package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f310a;
    public boolean f311b = false;
    public boolean f312c = false;
    public boolean d = true;
    public boolean f313e = false;
    public Executor f314f;
    public volatile x1.a f315g;
    public volatile x1.a h;
    public final Semaphore f316i;
    public final Set f317j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f316i = new Semaphore(0);
        this.f317j = set;
    }

    public final void a() {
        if (this.f315g != null) {
            boolean z10 = this.f311b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f313e = true;
                }
            }
            if (this.h != null) {
                this.f315g.getClass();
                this.f315g = null;
                return;
            }
            this.f315g.getClass();
            x1.a aVar = this.f315g;
            aVar.f48709c.set(true);
            if (aVar.f48707a.cancel(false)) {
                this.h = this.f315g;
            }
            this.f315g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f315g != null) {
            this.f315g.getClass();
            if (this.f314f == null) {
                this.f314f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f315g;
            Executor executor = this.f314f;
            if (aVar.f48708b != 1) {
                int c10 = m1.j.c(aVar.f48708b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f48708b = 2;
            executor.execute(aVar.f48707a);
        }
    }

    public final void c() {
        a();
        this.f315g = new x1.a(this);
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
