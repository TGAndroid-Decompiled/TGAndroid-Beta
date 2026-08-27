package f9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class l implements Callable {

    public final long f5945a;

    public final Throwable f5946b;

    public final Thread f5947c;
    public final c3.g d;

    public final o f5948e;

    public l(o oVar, long j10, Throwable th, Thread thread, c3.g gVar) {
        this.f5948e = oVar;
        this.f5945a = j10;
        this.f5946b = th;
        this.f5947c = thread;
        this.d = gVar;
    }

    @Override
    public final Object call() {
        long j10 = this.f5945a;
        long j11 = j10 / 1000;
        o oVar = this.f5948e;
        String strE = oVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        oVar.f5957c.k();
        com.google.firebase.messaging.m mVar = oVar.f5965m;
        mVar.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        mVar.t(this.f5946b, this.f5947c, strE, "crash", j11, true);
        try {
            k9.c cVar = oVar.f5960g;
            String str = ".ae" + j10;
            cVar.getClass();
            if (!new File(cVar.f15099b, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e9);
        }
        c3.g gVar = this.d;
        oVar.c(false, gVar);
        new f(oVar.f5959f);
        o.a(oVar, f.f5933b, Boolean.FALSE);
        if (!oVar.f5956b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) oVar.f5958e.f4619b;
        return ((TaskCompletionSource) ((AtomicReference) gVar.f2439i).get()).getTask().onSuccessTask(executor, new xe.b(this, executor, strE));
    }
}
