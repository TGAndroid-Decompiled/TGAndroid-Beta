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
    public final long f7958a;
    public final Throwable f7959b;
    public final Thread f7960c;
    public final e3.g d;
    public final n f7961e;

    public l(n nVar, long j10, Throwable th2, Thread thread, e3.g gVar) {
        this.f7961e = nVar;
        this.f7958a = j10;
        this.f7959b = th2;
        this.f7960c = thread;
        this.d = gVar;
    }

    @Override
    public final Object call() {
        n9.b bVar;
        String str;
        long j10 = this.f7958a;
        long j11 = j10 / 1000;
        n nVar = this.f7961e;
        String e6 = nVar.e();
        if (e6 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.f7967c.n();
        a9.a aVar = nVar.f7975m;
        aVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e6);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        aVar.t(this.f7959b, this.f7960c, e6, "crash", j11, true);
        try {
            bVar = nVar.f7970g;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(bVar.f15874b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        e3.g gVar = this.d;
        nVar.c(false, gVar);
        new f(nVar.f7969f);
        n.a(nVar, f.f7946b, Boolean.FALSE);
        if (!nVar.f7966b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.f7968e.f47351b;
        return ((TaskCompletionSource) ((AtomicReference) gVar.f4937i).get()).getTask().onSuccessTask(executor, new f7.b(this, executor, e6));
    }
}
