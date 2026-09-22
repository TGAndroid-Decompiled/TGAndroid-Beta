package a6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f290a;
    public boolean f291b = false;
    public boolean f292c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f293f;
    public volatile x1.a f294g;
    public volatile x1.a h;
    public final Semaphore f295i;
    public final Set f296j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f295i = new Semaphore(0);
        this.f296j = set;
    }

    public final void a() {
        if (this.f294g != null) {
            boolean z10 = this.f291b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f294g.getClass();
                this.f294g = null;
                return;
            }
            this.f294g.getClass();
            x1.a aVar = this.f294g;
            aVar.f45133c.set(true);
            if (aVar.f45131a.cancel(false)) {
                this.h = this.f294g;
            }
            this.f294g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f294g != null) {
            this.f294g.getClass();
            if (this.f293f == null) {
                this.f293f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f294g;
            Executor executor = this.f293f;
            if (aVar.f45132b != 1) {
                int c10 = m1.j.c(aVar.f45132b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f45132b = 2;
            executor.execute(aVar.f45131a);
        }
    }

    public final void c() {
        a();
        this.f294g = new x1.a(this);
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
