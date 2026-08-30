package i9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class l implements Callable {
    public final long f7394a;
    public final Throwable f7395b;
    public final Thread f7396c;
    public final e3.g d;
    public final n e;

    public l(n nVar, long j10, Throwable th2, Thread thread, e3.g gVar) {
        this.e = nVar;
        this.f7394a = j10;
        this.f7395b = th2;
        this.f7396c = thread;
        this.d = gVar;
    }

    @Override
    public final Object call() {
        n9.b bVar;
        String str;
        long j10 = this.f7394a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e = nVar.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f7402c.n();
        a9.a aVar = nVar.f7409m;
        aVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        aVar.t(this.f7395b, this.f7396c, e, "crash", j11, true);
        try {
            bVar = nVar.f7404g;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e6);
        }
        if (!new File(bVar.f14862b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        e3.g gVar = this.d;
        nVar.c(false, gVar);
        new f(nVar.f7403f);
        n.a(nVar, f.f7383b, Boolean.FALSE);
        if (!nVar.f7401b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.f4028b;
        return ((TaskCompletionSource) ((AtomicReference) gVar.f5100i).get()).getTask().onSuccessTask(executor, new f7.b(this, executor, e));
    }
}
