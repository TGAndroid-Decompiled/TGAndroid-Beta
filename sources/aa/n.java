package aa;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class n implements Callable {
    public final long f823a;
    public final Throwable f824b;
    public final Thread f825c;
    public final ia.c d;
    public final p f826e;

    public n(p pVar, long j3, Throwable th2, Thread thread, ia.c cVar) {
        this.f826e = pVar;
        this.f823a = j3;
        this.f824b = th2;
        this.f825c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ga.d dVar;
        String str;
        long j3 = this.f823a;
        long j10 = j3 / 1000;
        p pVar = this.f826e;
        String g10 = pVar.g();
        if (g10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        pVar.f833c.r();
        e0 e0Var = pVar.f841m;
        e0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(g10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        e0Var.g(this.f824b, this.f825c, "crash", new ca.c(g10, j10, hd.o.f13832a), true);
        try {
            dVar = pVar.f836g;
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
        pVar.d(new e().f799a, Boolean.FALSE);
        if (!pVar.f832b.a()) {
            return Tasks.forResult(null);
        }
        return ((TaskCompletionSource) ((AtomicReference) cVar.f15879i).get()).getTask().onSuccessTask(pVar.f834e.f3090a, new cb.c(this, g10));
    }
}
