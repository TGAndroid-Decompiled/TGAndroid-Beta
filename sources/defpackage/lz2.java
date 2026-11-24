package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class lz2 implements Callable {
    public final long a;
    public final Throwable b;
    public final Thread c;
    public final ex8 d;
    public final nz2 e;

    public lz2(nz2 nz2Var, long j, Throwable th, Thread thread, ex8 ex8Var) {
        this.e = nz2Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = ex8Var;
    }

    @Override
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        nz2 nz2Var = this.e;
        String e = nz2Var.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nz2Var.c.k();
        p8a p8aVar = nz2Var.m;
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        p8aVar.g(this.b, this.c, "crash", new v54(e, j2, o34.a), true);
        try {
            jd4 jd4Var = nz2Var.g;
            if (!new File((File) jd4Var.c, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        ex8 ex8Var = this.d;
        nz2Var.a(false, ex8Var, false);
        nz2Var.b(new q61().a, Boolean.FALSE);
        if (!nz2Var.b.a()) {
            return Tasks.forResult(null);
        }
        ?? obj = new Object();
        obj.a = this;
        return ((TaskCompletionSource) ((AtomicReference) ex8Var.h).get()).getTask().onSuccessTask((a13) nz2Var.e.b, obj);
    }
}
