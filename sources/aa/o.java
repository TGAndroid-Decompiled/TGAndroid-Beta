package aa;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class o implements Callable {
    public final long f826a;
    public final Throwable f827b;
    public final Thread f828c;
    public final ia.c d;
    public final q f829e;

    public o(q qVar, long j3, Throwable th2, Thread thread, ia.c cVar) {
        this.f829e = qVar;
        this.f826a = j3;
        this.f827b = th2;
        this.f828c = thread;
        this.d = cVar;
    }

    @Override
    public final Object call() {
        ga.d dVar;
        String str;
        long j3 = this.f826a;
        long j10 = j3 / 1000;
        q qVar = this.f829e;
        String g10 = qVar.g();
        if (g10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        qVar.f836c.D();
        f0 f0Var = qVar.f844m;
        f0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(g10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        f0Var.g(this.f827b, this.f828c, "crash", new ca.c(g10, j10, hd.o.f14477a), true);
        try {
            dVar = qVar.f839g;
            str = ".ae" + j3;
            dVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) dVar.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ia.c cVar = this.d;
        qVar.c(false, cVar, false);
        qVar.d(new e().f797a, Boolean.FALSE);
        if (!qVar.f835b.a()) {
            return Tasks.forResult(null);
        }
        return ((TaskCompletionSource) ((AtomicReference) cVar.f15426i).get()).getTask().onSuccessTask(qVar.f837e.f3135a, new cb.c(this, g10));
    }
}
