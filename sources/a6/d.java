package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f292a;
    public boolean f293b = false;
    public boolean f294c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f295f;
    public volatile x1.a f296g;
    public volatile x1.a h;
    public final Semaphore f297i;
    public final Set f298j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f297i = new Semaphore(0);
        this.f298j = set;
    }

    public final void a() {
        if (this.f296g != null) {
            boolean z10 = this.f293b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f296g.getClass();
                this.f296g = null;
                return;
            }
            this.f296g.getClass();
            x1.a aVar = this.f296g;
            aVar.f47722c.set(true);
            if (aVar.f47720a.cancel(false)) {
                this.h = this.f296g;
            }
            this.f296g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f296g != null) {
            this.f296g.getClass();
            if (this.f295f == null) {
                this.f295f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f296g;
            Executor executor = this.f295f;
            if (aVar.f47721b != 1) {
                int c10 = m1.j.c(aVar.f47721b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f47721b = 2;
            executor.execute(aVar.f47720a);
        }
    }

    public final void c() {
        a();
        this.f296g = new x1.a(this);
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
