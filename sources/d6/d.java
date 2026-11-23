package d6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public z1.a f7859a;
    public boolean f7860b = false;
    public boolean f7861c = false;
    public boolean d = true;
    public boolean f7862e = false;
    public Executor f7863f;
    public volatile a2.a f7864g;
    public volatile a2.a h;
    public final Semaphore f7865i;
    public final Set f7866j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f7865i = new Semaphore(0);
        this.f7866j = set;
    }

    public final void a() {
        if (this.f7864g != null) {
            boolean z10 = this.f7860b;
            if (!z10) {
                if (z10) {
                    c();
                } else {
                    this.f7862e = true;
                }
            }
            if (this.h != null) {
                this.f7864g.getClass();
                this.f7864g = null;
                return;
            }
            this.f7864g.getClass();
            a2.a aVar = this.f7864g;
            aVar.f52c.set(true);
            if (aVar.f50a.cancel(false)) {
                this.h = this.f7864g;
            }
            this.f7864g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f7864g != null) {
            this.f7864g.getClass();
            if (this.f7863f == null) {
                this.f7863f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            a2.a aVar = this.f7864g;
            Executor executor = this.f7863f;
            if (aVar.f51b != 1) {
                int c10 = p1.g.c(aVar.f51b);
                if (c10 != 1) {
                    if (c10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.f51b = 2;
            executor.execute(aVar.f50a);
        }
    }

    public final void c() {
        a();
        this.f7864g = new a2.a(this);
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
