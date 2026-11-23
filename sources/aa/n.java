package aa;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class n implements Callable {
    public final long f822a;
    public final Throwable f823b;
    public final Thread f824c;
    public final ia.c d;
    public final p f825e;

    public n(p pVar, long j3, Throwable th2, Thread thread, ia.c cVar) {
        this.f825e = pVar;
        this.f822a = j3;
        this.f823b = th2;
        this.f824c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ga.d dVar;
        String str;
        long j3 = this.f822a;
        long j10 = j3 / 1000;
        p pVar = this.f825e;
        String g10 = pVar.g();
        if (g10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        pVar.f832c.r();
        e0 e0Var = pVar.f840m;
        e0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(g10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        e0Var.g(this.f823b, this.f824c, "crash", new ca.c(g10, j10, hd.o.f14178a), true);
        try {
            dVar = pVar.f835g;
            str = ".ae" + j3;
            dVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) dVar.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ia.c cVar = this.d;
        pVar.c(false, cVar, false);
        pVar.d(new e().f798a, Boolean.FALSE);
        if (!pVar.f831b.a()) {
            return Tasks.forResult(null);
        }
        return ((TaskCompletionSource) ((AtomicReference) cVar.f16222i).get()).getTask().onSuccessTask(pVar.f833e.f3107a, new cb.c(this, g10));
    }
}
