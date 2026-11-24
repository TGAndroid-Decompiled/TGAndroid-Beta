package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class le7 extends FutureTask {
    public final nx a;

    public le7(nx nxVar, ke7 ke7Var) {
        super(ke7Var);
        this.a = nxVar;
    }

    @Override
    public final void done() {
        nx nxVar = this.a;
        AtomicBoolean atomicBoolean = nxVar.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                nxVar.b(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                nxVar.b(null);
            }
        } catch (ExecutionException e2) {
            fyb.j("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            fyb.j("An error occurred while executing doInBackground()", th);
        }
    }
}
