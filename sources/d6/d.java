package d6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public z1.a f7896a;
    public boolean f7897b = false;
    public boolean f7898c = false;
    public boolean d = true;
    public boolean f7899e = false;
    public Executor f7900f;
    public volatile a2.a f7901g;
    public volatile a2.a h;
    public final Semaphore f7902i;
    public final Set f7903j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f7902i = new Semaphore(0);
        this.f7903j = set;
    }

    public final void a() {
        if (this.f7901g != null) {
            boolean z10 = this.f7897b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f7899e = true;
                }
            }
            if (this.h != null) {
                this.f7901g.getClass();
                this.f7901g = null;
                return;
            }
            this.f7901g.getClass();
            a2.a aVar = this.f7901g;
            aVar.f52c.set(true);
            if (aVar.f50a.cancel(false)) {
                this.h = this.f7901g;
            }
            this.f7901g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f7901g != null) {
            this.f7901g.getClass();
            if (this.f7900f == null) {
                this.f7900f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            a2.a aVar = this.f7901g;
            Executor executor = this.f7900f;
            if (aVar.f51b != 1) {
                int c10 = p1.g.c(aVar.f51b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f51b = 2;
            executor.execute(aVar.f50a);
        }
    }

    public final void c() {
        a();
        this.f7901g = new a2.a(this);
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
