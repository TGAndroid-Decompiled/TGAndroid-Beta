package o5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f16444a;
    public boolean f16445b = false;
    public boolean f16446c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f16447f;
    public volatile x1.a f16448g;
    public volatile x1.a h;
    public final Semaphore f16449i;
    public final Set f16450j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f16449i = new Semaphore(0);
        this.f16450j = set;
    }

    public final void a() {
        if (this.f16448g != null) {
            boolean z4 = this.f16445b;
            if (!z4) {
                if (z4) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f16448g.getClass();
                this.f16448g = null;
                return;
            }
            this.f16448g.getClass();
            x1.a aVar = this.f16448g;
            aVar.f46643c.set(true);
            if (aVar.f46641a.cancel(false)) {
                this.h = this.f16448g;
            }
            this.f16448g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f16448g != null) {
            this.f16448g.getClass();
            if (this.f16447f == null) {
                this.f16447f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f16448g;
            Executor executor = this.f16447f;
            if (aVar.f46642b != 1) {
                int b10 = m1.j.b(aVar.f46642b);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f46642b = 2;
            executor.execute(aVar.f46641a);
        }
    }

    public final void c() {
        a();
        this.f16448g = new x1.a(this);
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
