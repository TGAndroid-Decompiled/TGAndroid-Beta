package m5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f16866a;
    public boolean f16867b = false;
    public boolean f16868c = false;
    public boolean d = true;
    public boolean f16869e = false;
    public Executor f16870f;
    public volatile x1.a f16871g;
    public volatile x1.a h;
    public final Semaphore f16872i;
    public final Set f16873j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f16872i = new Semaphore(0);
        this.f16873j = set;
    }

    public final void a() {
        if (this.f16871g != null) {
            boolean z10 = this.f16867b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f16869e = true;
                }
            }
            if (this.h != null) {
                this.f16871g.getClass();
                this.f16871g = null;
                return;
            }
            this.f16871g.getClass();
            x1.a aVar = this.f16871g;
            aVar.f49982c.set(true);
            if (aVar.f49980a.cancel(false)) {
                this.h = this.f16871g;
            }
            this.f16871g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f16871g != null) {
            this.f16871g.getClass();
            if (this.f16870f == null) {
                this.f16870f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f16871g;
            Executor executor = this.f16870f;
            if (aVar.f49981b != 1) {
                int b10 = m1.j.b(aVar.f49981b);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f49981b = 2;
            executor.execute(aVar.f49980a);
        }
    }

    public final void c() {
        a();
        this.f16871g = new x1.a(this);
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
