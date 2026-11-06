package d6;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class d {
    public z1.a f8195a;
    public boolean f8196b = false;
    public boolean f8197c = false;
    public boolean d = true;
    public boolean f8198e = false;
    public Executor f8199f;
    public volatile a2.a f8200g;
    public volatile a2.a h;
    public final Semaphore f8201i;
    public final Set f8202j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f8201i = new Semaphore(0);
        this.f8202j = set;
    }

    public final void a() {
        if (this.f8200g != null) {
            boolean z9 = this.f8196b;
            if (!z9) {
                if (z9) {
                    c();
                } else {
                    this.f8198e = true;
                }
            }
            if (this.h != null) {
                this.f8200g.getClass();
                this.f8200g = null;
                return;
            }
            this.f8200g.getClass();
            a2.a aVar = this.f8200g;
            aVar.f52c.set(true);
            if (aVar.f50a.cancel(false)) {
                this.h = this.f8200g;
            }
            this.f8200g = null;
        }
    }

    public final void b() {
        if (this.h == null && this.f8200g != null) {
            this.f8200g.getClass();
            if (this.f8199f == null) {
                this.f8199f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            a2.a aVar = this.f8200g;
            Executor executor = this.f8199f;
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
        this.f8200g = new a2.a(this);
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
