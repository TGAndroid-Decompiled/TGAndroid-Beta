package g9;

import android.util.Log;
import bg.c2;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class m implements Callable {
    public final long f7170a;
    public final Throwable f7171b;
    public final Thread f7172c;
    public final e3.f d;
    public final p f7173e;

    public m(p pVar, long j10, Throwable th2, Thread thread, e3.f fVar) {
        this.f7173e = pVar;
        this.f7170a = j10;
        this.f7171b = th2;
        this.f7172c = thread;
        this.d = fVar;
    }

    @Override
    public final Object call() {
        l9.b bVar;
        String str;
        long j10 = this.f7170a;
        long j11 = j10 / 1000;
        p pVar = this.f7173e;
        String e10 = pVar.e();
        if (e10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        pVar.f7182c.j();
        c2 c2Var = pVar.f7190m;
        c2Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        c2Var.t(this.f7171b, this.f7172c, e10, "crash", j11, true);
        try {
            bVar = pVar.f7185g;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
        }
        if (!new File(bVar.f15103b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        e3.f fVar = this.d;
        pVar.c(false, fVar);
        new f(pVar.f7184f);
        p.a(pVar, f.f7155b, Boolean.FALSE);
        if (!pVar.f7181b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) pVar.f7183e.f5185b;
        return ((TaskCompletionSource) ((AtomicReference) fVar.f5818i).get()).getTask().onSuccessTask(executor, new l(this, executor, e10));
    }
}
