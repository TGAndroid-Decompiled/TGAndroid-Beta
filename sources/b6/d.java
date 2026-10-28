package b6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f3657a;
    public boolean f3658b = false;
    public boolean f3659c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f3660f;
    public volatile x1.a f3661g;
    public volatile x1.a h;
    public final Semaphore f3662i;
    public final Set f3663j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f3662i = new Semaphore(0);
        this.f3663j = set;
    }

    public final void a() {
        if (this.f3661g != null) {
            boolean z10 = this.f3658b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f3661g.getClass();
                this.f3661g = null;
                return;
            }
            this.f3661g.getClass();
            x1.a aVar = this.f3661g;
            aVar.f51347c.set(true);
            if (aVar.f51345a.cancel(false)) {
                this.h = this.f3661g;
            }
            this.f3661g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f3661g != null) {
            this.f3661g.getClass();
            if (this.f3660f == null) {
                this.f3660f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f3661g;
            Executor executor = this.f3660f;
            if (aVar.f51346b != 1) {
                int c10 = m1.j.c(aVar.f51346b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f51346b = 2;
            executor.execute(aVar.f51345a);
        }
    }

    public final void c() {
        a();
        this.f3661g = new x1.a(this);
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
