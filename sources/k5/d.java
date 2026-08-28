package k5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f14645a;
    public boolean f14646b = false;
    public boolean f14647c = false;
    public boolean d = true;
    public boolean f14648e = false;
    public Executor f14649f;
    public volatile x1.a f14650g;
    public volatile x1.a h;
    public final Semaphore f14651i;
    public final Set f14652j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f14651i = new Semaphore(0);
        this.f14652j = set;
    }

    public final void a() {
        if (this.f14650g != null) {
            boolean z10 = this.f14646b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f14648e = true;
                }
            }
            if (this.h != null) {
                this.f14650g.getClass();
                this.f14650g = null;
                return;
            }
            this.f14650g.getClass();
            x1.a aVar = this.f14650g;
            aVar.f48847c.set(true);
            if (aVar.f48845a.cancel(false)) {
                this.h = this.f14650g;
            }
            this.f14650g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f14650g != null) {
            this.f14650g.getClass();
            if (this.f14649f == null) {
                this.f14649f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f14650g;
            Executor executor = this.f14649f;
            if (aVar.f48846b != 1) {
                int b10 = m1.j.b(aVar.f48846b);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f48846b = 2;
            executor.execute(aVar.f48845a);
        }
    }

    public final void c() {
        a();
        this.f14650g = new x1.a(this);
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
