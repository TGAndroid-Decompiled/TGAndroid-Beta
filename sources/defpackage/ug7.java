package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ug7 extends FutureTask {
    public final ox a;

    public ug7(ox oxVar, tg7 tg7Var) {
        super(tg7Var);
        this.a = oxVar;
    }

    @Override
    public final void done() {
        ox oxVar = this.a;
        AtomicBoolean atomicBoolean = oxVar.d;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                oxVar.b(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                oxVar.b(null);
            }
        } catch (ExecutionException e2) {
            grb.j("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            grb.j("An error occurred while executing doInBackground()", th);
        }
    }
}
