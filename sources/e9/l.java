package e9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class l implements Callable {
    public final long f5013a;
    public final Throwable f5014b;
    public final Thread f5015c;
    public final c3.h d;
    public final o f5016e;

    public l(o oVar, long j10, Throwable th, Thread thread, c3.h hVar) {
        this.f5016e = oVar;
        this.f5013a = j10;
        this.f5014b = th;
        this.f5015c = thread;
        this.d = hVar;
    }

    @Override
    public final Object call() {
        j9.c cVar;
        String str;
        long j10 = this.f5013a;
        long j11 = j10 / 1000;
        o oVar = this.f5016e;
        String e10 = oVar.e();
        if (e10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        oVar.f5025c.k();
        com.google.firebase.messaging.m mVar = oVar.f5033m;
        mVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        mVar.t(this.f5014b, this.f5015c, e10, "crash", j11, true);
        try {
            cVar = oVar.f5028g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
        }
        if (!new File(cVar.f14245b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        c3.h hVar = this.d;
        oVar.c(false, hVar);
        new f(oVar.f5027f);
        o.a(oVar, f.f5001b, Boolean.FALSE);
        if (!oVar.f5024b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) oVar.f5026e.f4177b;
        return ((TaskCompletionSource) ((AtomicReference) hVar.f2306i).get()).getTask().onSuccessTask(executor, new we.b(this, executor, e10));
    }
}
