package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
public final class wy2 implements Callable {
    public final long a;
    public final Throwable b;
    public final Thread c;
    public final oy8 d;
    public final yy2 e;

    public wy2(yy2 yy2Var, long j, Throwable th, Thread thread, oy8 oy8Var) {
        this.e = yy2Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = oy8Var;
    }

    @Override
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        yy2 yy2Var = this.e;
        String e = yy2Var.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        yy2Var.c.i();
        faa faaVar = yy2Var.m;
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        faaVar.g(this.b, this.c, "crash", new g54(e, j2, y24.a), true);
        try {
            gd4 gd4Var = yy2Var.g;
            if (!new File((File) gd4Var.c, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        oy8 oy8Var = this.d;
        yy2Var.a(false, oy8Var, false);
        yy2Var.b(new r51().a, Boolean.FALSE);
        if (!yy2Var.b.a()) {
            return Tasks.forResult(null);
        }
        ?? obj = new Object();
        obj.a = this;
        return ((TaskCompletionSource) ((AtomicReference) oy8Var.h).get()).getTask().onSuccessTask((i03) yy2Var.e.b, obj);
    }
}
