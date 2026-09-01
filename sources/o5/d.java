package o5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f16601a;
    public boolean f16602b = false;
    public boolean f16603c = false;
    public boolean d = true;
    public boolean f16604e = false;
    public Executor f16605f;
    public volatile x1.a f16606g;
    public volatile x1.a h;
    public final Semaphore f16607i;
    public final Set f16608j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f16607i = new Semaphore(0);
        this.f16608j = set;
    }

    public final void a() {
        if (this.f16606g != null) {
            boolean z4 = this.f16602b;
            if (!z4) {
                if (z4) {
                    c();
                } else {
                    this.f16604e = true;
                }
            }
            if (this.h != null) {
                this.f16606g.getClass();
                this.f16606g = null;
                return;
            }
            this.f16606g.getClass();
            x1.a aVar = this.f16606g;
            aVar.f50233c.set(true);
            if (aVar.f50231a.cancel(false)) {
                this.h = this.f16606g;
            }
            this.f16606g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f16606g != null) {
            this.f16606g.getClass();
            if (this.f16605f == null) {
                this.f16605f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f16606g;
            Executor executor = this.f16605f;
            if (aVar.f50232b != 1) {
                int c3 = m1.j.c(aVar.f50232b);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f50232b = 2;
            executor.execute(aVar.f50231a);
        }
    }

    public final void c() {
        a();
        this.f16606g = new x1.a(this);
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
