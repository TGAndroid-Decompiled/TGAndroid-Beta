package c6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public y1.a f4221a;
    public boolean f4222b = false;
    public boolean f4223c = false;
    public boolean d = true;
    public boolean f4224e = false;
    public Executor f4225f;
    public volatile z1.a f4226g;
    public volatile z1.a h;
    public final Semaphore f4227i;
    public final Set f4228j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f4227i = new Semaphore(0);
        this.f4228j = set;
    }

    public final void a() {
        if (this.f4226g != null) {
            boolean z10 = this.f4222b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f4224e = true;
                }
            }
            if (this.h != null) {
                this.f4226g.getClass();
                this.f4226g = null;
                return;
            }
            this.f4226g.getClass();
            z1.a aVar = this.f4226g;
            aVar.f59568c.set(true);
            if (aVar.f59566a.cancel(false)) {
                this.h = this.f4226g;
            }
            this.f4226g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f4226g != null) {
            this.f4226g.getClass();
            if (this.f4225f == null) {
                this.f4225f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            z1.a aVar = this.f4226g;
            Executor executor = this.f4225f;
            if (aVar.f59567b != 1) {
                int c2 = o1.g.c(aVar.f59567b);
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f59567b = 2;
            executor.execute(aVar.f59566a);
        }
    }

    public final void c() {
        a();
        this.f4226g = new z1.a(this);
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
