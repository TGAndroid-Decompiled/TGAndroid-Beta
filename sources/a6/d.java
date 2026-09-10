package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f288a;
    public boolean f289b = false;
    public boolean f290c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f291f;
    public volatile x1.a f292g;
    public volatile x1.a h;
    public final Semaphore f293i;
    public final Set f294j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f293i = new Semaphore(0);
        this.f294j = set;
    }

    public final void a() {
        if (this.f292g != null) {
            boolean z10 = this.f289b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f292g.getClass();
                this.f292g = null;
                return;
            }
            this.f292g.getClass();
            x1.a aVar = this.f292g;
            aVar.f44477c.set(true);
            if (aVar.f44475a.cancel(false)) {
                this.h = this.f292g;
            }
            this.f292g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f292g != null) {
            this.f292g.getClass();
            if (this.f291f == null) {
                this.f291f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f292g;
            Executor executor = this.f291f;
            if (aVar.f44476b != 1) {
                int c10 = m1.j.c(aVar.f44476b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f44476b = 2;
            executor.execute(aVar.f44475a);
        }
    }

    public final void c() {
        a();
        this.f292g = new x1.a(this);
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
