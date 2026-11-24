package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class by2 implements Callable {
    public final long a;
    public final Throwable b;
    public final Thread c;
    public final dv8 d;
    public final dy2 e;

    public by2(dy2 dy2Var, long j, Throwable th, Thread thread, dv8 dv8Var) {
        this.e = dy2Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = dv8Var;
    }

    @Override
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        dy2 dy2Var = this.e;
        String e = dy2Var.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        dy2Var.c.r();
        n6a n6aVar = dy2Var.m;
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        n6aVar.g(this.b, this.c, "crash", new k44(e, j2, d24.a), true);
        try {
            jb4 jb4Var = dy2Var.g;
            if (!new File((File) jb4Var.c, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        dv8 dv8Var = this.d;
        dy2Var.a(false, dv8Var, false);
        dy2Var.b(new j51().a, Boolean.FALSE);
        if (!dy2Var.b.a()) {
            return Tasks.forResult(null);
        }
        return ((TaskCompletionSource) ((AtomicReference) dv8Var.h).get()).getTask().onSuccessTask((pz2) dy2Var.e.b, new lj9(this, e));
    }
}
