package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
public final class v3d {
    public o86 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile nx g;
    public volatile nx h;
    public final Semaphore i;
    public final Set j;

    public v3d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.h == null && this.g != null) {
            this.g.getClass();
            if (this.f == null) {
                this.f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            nx nxVar = this.g;
            Executor executor = this.f;
            if (nxVar.b != 1) {
                int F = ug8.F(nxVar.b);
                if (F != 1) {
                    if (F != 2) {
                        sc8.j("We should never reach this state");
                        return;
                    } else {
                        sc8.j("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        return;
                    }
                }
                sc8.j("Cannot execute task: the task is already running.");
                return;
            }
            nxVar.b = 2;
            executor.execute(nxVar.a);
        }
    }

    public final boolean b() {
        if (this.g == null) {
            return false;
        }
        boolean z = this.b;
        if (!z) {
            if (z) {
                c();
            } else {
                this.e = true;
            }
        }
        nx nxVar = this.h;
        nx nxVar2 = this.g;
        if (nxVar != null) {
            nxVar2.getClass();
            this.g = null;
            return false;
        }
        nxVar2.getClass();
        nx nxVar3 = this.g;
        nxVar3.c.set(true);
        boolean cancel = nxVar3.a.cancel(false);
        if (cancel) {
            this.h = this.g;
        }
        this.g = null;
        return cancel;
    }

    public final void c() {
        b();
        this.g = new nx(this);
        a();
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
