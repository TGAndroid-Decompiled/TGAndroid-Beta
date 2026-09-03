package o5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public w1.a f16426a;
    public boolean f16427b = false;
    public boolean f16428c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f16429f;
    public volatile x1.a f16430g;
    public volatile x1.a h;
    public final Semaphore f16431i;
    public final Set f16432j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f16431i = new Semaphore(0);
        this.f16432j = set;
    }

    public final void a() {
        if (this.f16430g != null) {
            boolean z4 = this.f16427b;
            if (!z4) {
                if (z4) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.f16430g.getClass();
                this.f16430g = null;
                return;
            }
            this.f16430g.getClass();
            x1.a aVar = this.f16430g;
            aVar.f46712c.set(true);
            if (aVar.f46710a.cancel(false)) {
                this.h = this.f16430g;
            }
            this.f16430g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f16430g != null) {
            this.f16430g.getClass();
            if (this.f16429f == null) {
                this.f16429f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            x1.a aVar = this.f16430g;
            Executor executor = this.f16429f;
            if (aVar.f46711b != 1) {
                int c3 = m1.j.c(aVar.f46711b);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f46711b = 2;
            executor.execute(aVar.f46710a);
        }
    }

    public final void c() {
        a();
        this.f16430g = new x1.a(this);
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
