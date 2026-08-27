package k5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

public final class d {

    public w1.a f14466a;

    public boolean f14467b = false;

    public boolean f14468c = false;
    public boolean d = true;

    public boolean f14469e = false;

    public Executor f14470f;

    public volatile x1.a f14471g;
    public volatile x1.a h;

    public final Semaphore f14472i;

    public final Set f14473j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f14472i = new Semaphore(0);
        this.f14473j = set;
    }

    public final void a() {
        if (this.f14471g != null) {
            boolean z10 = this.f14467b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f14469e = true;
                }
            }
            if (this.h != null) {
                this.f14471g.getClass();
                this.f14471g = null;
                return;
            }
            this.f14471g.getClass();
            x1.a aVar = this.f14471g;
            aVar.f49327c.set(true);
            if (aVar.f49325a.cancel(false)) {
                this.h = this.f14471g;
            }
            this.f14471g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.f14471g == null) {
            return;
        }
        this.f14471g.getClass();
        if (this.f14470f == null) {
            this.f14470f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        x1.a aVar = this.f14471g;
        Executor executor = this.f14470f;
        if (aVar.f49326b == 1) {
            aVar.f49326b = 2;
            executor.execute(aVar.f49325a);
            return;
        }
        int iB = m1.j.b(aVar.f49326b);
        if (iB == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iB == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f14471g = new x1.a(this);
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
