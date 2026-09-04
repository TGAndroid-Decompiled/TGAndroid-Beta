package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f298a;
    public boolean f299b = false;
    public boolean f300c = false;
    public boolean d = true;
    public boolean f301e = false;
    public Executor f302f;
    public volatile x1.a f303g;
    public volatile x1.a h;
    public final Semaphore f304i;
    public final Set f305j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f304i = new Semaphore(0);
        this.f305j = set;
    }

    public final void a() {
        if (this.f303g != null) {
            boolean z10 = this.f299b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f301e = true;
                }
            }
            if (this.h != null) {
                this.f303g.getClass();
                this.f303g = null;
                return;
            }
            this.f303g.getClass();
            x1.a aVar = this.f303g;
            aVar.f48680c.set(true);
            if (aVar.f48678a.cancel(false)) {
                this.h = this.f303g;
            }
            this.f303g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f303g != null) {
            this.f303g.getClass();
            if (this.f302f == null) {
                this.f302f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f303g;
            Executor executor = this.f302f;
            if (aVar.f48679b != 1) {
                int c10 = m1.j.c(aVar.f48679b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f48679b = 2;
            executor.execute(aVar.f48678a);
        }
    }

    public final void c() {
        a();
        this.f303g = new x1.a(this);
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
