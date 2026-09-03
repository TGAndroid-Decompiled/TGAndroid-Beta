package o5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f16603a;
    public boolean f16604b = false;
    public boolean f16605c = false;
    public boolean d = true;
    public boolean f16606e = false;
    public Executor f16607f;
    public volatile x1.a f16608g;
    public volatile x1.a h;
    public final Semaphore f16609i;
    public final Set f16610j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f16609i = new Semaphore(0);
        this.f16610j = set;
    }

    public final void a() {
        if (this.f16608g != null) {
            boolean z4 = this.f16604b;
            if (!z4) {
                if (z4) {
                    c();
                } else {
                    this.f16606e = true;
                }
            }
            if (this.h != null) {
                this.f16608g.getClass();
                this.f16608g = null;
                return;
            }
            this.f16608g.getClass();
            x1.a aVar = this.f16608g;
            aVar.f50269c.set(true);
            if (aVar.f50267a.cancel(false)) {
                this.h = this.f16608g;
            }
            this.f16608g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f16608g != null) {
            this.f16608g.getClass();
            if (this.f16607f == null) {
                this.f16607f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f16608g;
            Executor executor = this.f16607f;
            if (aVar.f50268b != 1) {
                int c3 = m1.j.c(aVar.f50268b);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f50268b = 2;
            executor.execute(aVar.f50267a);
        }
    }

    public final void c() {
        a();
        this.f16608g = new x1.a(this);
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
